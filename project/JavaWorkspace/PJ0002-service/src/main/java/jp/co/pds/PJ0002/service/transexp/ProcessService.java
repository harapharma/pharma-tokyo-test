package jp.co.pds.PJ0002.service.transexp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import jp.co.pds.PJ0002.Project;
import jp.co.pds.PJ0002.copy.TransExpCopy;
import jp.co.pds.PJ0002.copy.WorkTimeCopy;
import jp.co.pds.PJ0002.dao.dto.DtTransportExpense;
import jp.co.pds.PJ0002.dao.dto.DtWorkTime;
import jp.co.pds.PJ0002.dao.util.DtTransExpUtil;
import jp.co.pds.PJ0002.dao.util.DtWorkTimeUtil;
import jp.co.pds.PJ0002.dto.TransExpDTO;
import jp.co.pds.PJ0002.dto.WorkTimeDTO;
import jp.co.pds.common.dao.dto.MsDate;
import jp.co.pds.common.dao.util.MsSeqUtil;
import jp.co.pds.common.enums.SeqNameEnum;
import jp.co.pds.common.util.StringUtil;


/**
 * Hello world!
 *
 */
public class ProcessService
{
	public ProcessService() {
	}

	/**
	 * 交通費DTOリストをマージする
	 * @param srcs
	 * @param dsts
	 * @return
	 */
	public void margeTransExpDTOs(String companyCd, String userId, String year, String month, List<TransExpDTO> srcs, List<TransExpDTO> dsts) {
		List<TransExpDTO> transExpDTOs = new ArrayList<TransExpDTO>();
		for (TransExpDTO src : srcs) {
			if (src.getCalendarDd() != null) {
				TransExpDTO transExpDTO = new TransExpDTO();
				transExpDTO.setCompanyCd(companyCd);
				transExpDTO.setUserId(userId);
				transExpDTO.setCalendarYy(year);
				transExpDTO.setCalendarMm(month);
				transExpDTO.setCalendarDd(src.getCalendarDd());
				transExpDTO.setExpenseAmount(src.getExpenseAmount());
				transExpDTO.setTemporaryMoney(src.getTemporaryMoney());
				transExpDTO.setDestination(src.getDestination());
				transExpDTO.setBusiness(src.getBusiness());
				transExpDTO.setTransportFacility(src.getTransportFacility());
				transExpDTO.setDeparture(src.getDeparture());
				transExpDTO.setArrival(src.getArrival());
				transExpDTO.setOneRoundCd(src.getOneRoundCd());
				transExpDTOs.add(transExpDTO);
			}
		}
    	// ソート
    	Collections.sort(transExpDTOs,
    					new Comparator<TransExpDTO>() {
    						public int compare(TransExpDTO obj1, TransExpDTO obj2) {
    							return obj1.getCalendarDd().compareToIgnoreCase(obj2.getCalendarDd());
    						}
        				}
    	);
    	dsts.clear();
		dsts.addAll(transExpDTOs);
	}

	/**
	 * 勤務時間DTOを保存する
	 * @param workTimeDTOs
	 * @return
	 */
	public void storeTransExpDTOs(String companyCd, String userId, String year, String month, List<TransExpDTO> transExpDTOs) {
		List<DtTransportExpense> dtTransportExpenses = new ArrayList<DtTransportExpense>();
		for (TransExpDTO transExpDTO : transExpDTOs) {
			// 日付と金額が空なら登録しない
			if (StringUtil.EMPTY.equals(transExpDTO.getCalendarDd()) &&
				StringUtil.EMPTY.equals(transExpDTO.getExpenseAmount())) {
				continue;
			}
			DtTransportExpense dtTransportExpense = new DtTransportExpense();
			TransExpCopy.copy(transExpDTO, dtTransportExpense);
			dtTransportExpense.setRegisterId(Project.getProjectCode());
			dtTransportExpense.setUpdateId(Project.getProjectCode());

			dtTransportExpenses.add(dtTransportExpense);
		}

		// 年月指定で削除した後に新規で登録する(0件なら削除のみ)
		DtTransExpUtil dtTransExpUtil = new DtTransExpUtil();
		dtTransExpUtil.deleteDtTransportExpenses(companyCd, userId, Integer.valueOf(year), Integer.valueOf(month));

		MsSeqUtil msSeqUtil = new MsSeqUtil(SeqNameEnum.TransportExpenseId);
		for (DtTransportExpense dtTransportExpense : dtTransportExpenses) {
			dtTransportExpense.setTransportExpenseId(msSeqUtil.getNextValue());
			dtTransExpUtil.storeDtTransportExpense(dtTransportExpense);
		}
	}
}
