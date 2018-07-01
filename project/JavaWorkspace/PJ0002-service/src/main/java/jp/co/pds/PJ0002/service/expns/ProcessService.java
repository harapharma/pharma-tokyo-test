package jp.co.pds.PJ0002.service.expns;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import jp.co.pds.PJ0002.Project;
import jp.co.pds.PJ0002.copy.ExpAdjstCopy;
import jp.co.pds.PJ0002.copy.TransExpCopy;
import jp.co.pds.PJ0002.copy.WorkTimeCopy;
import jp.co.pds.PJ0002.dao.dto.DtExpenseAdjstmnt;
import jp.co.pds.PJ0002.dao.dto.DtTransportExpense;
import jp.co.pds.PJ0002.dao.dto.DtWorkTime;
import jp.co.pds.PJ0002.dao.util.DtExpAdjstUtil;
import jp.co.pds.PJ0002.dao.util.DtTransExpUtil;
import jp.co.pds.PJ0002.dao.util.DtWorkTimeUtil;
import jp.co.pds.PJ0002.dto.ExpAdjstDTO;
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
	public void margeExpAdjstDTOs(String companyCd, String userId, String year, String month, List<ExpAdjstDTO> srcs, List<ExpAdjstDTO> dsts) {
		List<ExpAdjstDTO> expAdjstDTOs = new ArrayList<ExpAdjstDTO>();
		for (ExpAdjstDTO src : srcs) {
			if (src.getCalendarDd() != null) {
				ExpAdjstDTO expAdjstDTO = new ExpAdjstDTO();
				expAdjstDTO.setCompanyCd(companyCd);
				expAdjstDTO.setUserId(userId);
				expAdjstDTO.setAccountTitleId(src.getAccountTitleId());
				expAdjstDTO.setCalendarYy(year);
				expAdjstDTO.setCalendarMm(month);
				expAdjstDTO.setCalendarDd(src.getCalendarDd());
				expAdjstDTO.setExpenseAmount(src.getExpenseAmount());
				expAdjstDTO.setTemporaryMoney(src.getTemporaryMoney());
				expAdjstDTO.setRemark(src.getRemark());

				expAdjstDTOs.add(expAdjstDTO);
			}
		}
    	// ソート
    	Collections.sort(expAdjstDTOs,
    					new Comparator<ExpAdjstDTO>() {
    						public int compare(ExpAdjstDTO obj1, ExpAdjstDTO obj2) {
    							return obj1.getCalendarDd().compareToIgnoreCase(obj2.getCalendarDd());
    						}
        				}
    	);
    	dsts.clear();
		dsts.addAll(expAdjstDTOs);
	}

	/**
	 * 勤務時間DTOを保存する
	 * @param workTimeDTOs
	 * @return
	 */
	public void storeExpAdjstDTOs(String companyCd, String userId, String year, String month, List<ExpAdjstDTO> expAdjstDTOs) {
		List<DtExpenseAdjstmnt> dtExpenseAdjstmnts = new ArrayList<DtExpenseAdjstmnt>();
		for (ExpAdjstDTO expAdjstDTO : expAdjstDTOs) {
			// 日付と金額が空なら登録しない
			if (StringUtil.EMPTY.equals(expAdjstDTO.getCalendarDd()) &&
				StringUtil.EMPTY.equals(expAdjstDTO.getExpenseAmount())) {
				continue;
			}
			DtExpenseAdjstmnt dtExpenseAdjstmnt = new DtExpenseAdjstmnt();
			ExpAdjstCopy.copy(expAdjstDTO, dtExpenseAdjstmnt);
			dtExpenseAdjstmnt.setRegisterId(Project.getProjectCode());
			dtExpenseAdjstmnt.setUpdateId(Project.getProjectCode());

			dtExpenseAdjstmnts.add(dtExpenseAdjstmnt);
		}

		// 年月指定で削除した後に新規で登録する(0件なら削除のみ)
		DtExpAdjstUtil dtExpAdjstUtil = new DtExpAdjstUtil();
		dtExpAdjstUtil.deleteDtExpenseAdjstmnts(companyCd, userId, Integer.valueOf(year), Integer.valueOf(month));

		MsSeqUtil msSeqUtil = new MsSeqUtil(SeqNameEnum.ExpenseAdjstmntId);
		for (DtExpenseAdjstmnt dtExpenseAdjstmnt : dtExpenseAdjstmnts) {
			dtExpenseAdjstmnt.setExpenseAdjstmntId(msSeqUtil.getNextValue());
			dtExpAdjstUtil.storeDtExpenseAdjstmnt(dtExpenseAdjstmnt);
		}
	}
}
