package jp.co.pds.PJ0002.service.expns;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import jp.co.pds.PJ0002.Project;
import jp.co.pds.PJ0002.copy.GroupCopy;
import jp.co.pds.PJ0002.copy.TransExpCopy;
import jp.co.pds.PJ0002.copy.WorkTimeCopy;
import jp.co.pds.PJ0002.dao.dto.DtTransportExpense;
import jp.co.pds.PJ0002.dao.dto.DtWorkTime;
import jp.co.pds.PJ0002.dao.dto.MsRestTime;
import jp.co.pds.PJ0002.dao.util.DtTransExpUtil;
import jp.co.pds.PJ0002.dao.util.DtWorkTimeUtil;
import jp.co.pds.PJ0002.dao.util.MsGroupUtil;
import jp.co.pds.PJ0002.dto.GroupDTO;
import jp.co.pds.PJ0002.dto.TransExpDTO;
import jp.co.pds.PJ0002.dto.WorkTimeDTO;
import jp.co.pds.common.dao.dto.MsCompany;
import jp.co.pds.common.dao.dto.MsDate;
import jp.co.pds.common.dao.dto.MsGroup;
import jp.co.pds.common.dao.util.MsDateUtil;
import jp.co.pds.common.dao.util.MsUserUtil;
import jp.co.pds.common.enums.WeekdayCdEnum;
import jp.co.pds.common.util.DateTimeUtil;
import jp.co.pds.common.util.MessageUtil;
import jp.co.pds.common.util.StringUtil;

/**
 * 初期処理
 *
 */
public class InitialService
{
	public InitialService() {
	}

	public String getHeaderMessage(HttpServletRequest request, String userName) {
		List<String> params = new ArrayList<String>();
		params.add(userName);
		return MessageUtil.getMessage(Project.getProjectCode(), "I0000001", request.getLocale(), (String[])params.toArray(new String[params.size()]));
	}

	/**
	 * システム年と過去4年を取得する
	 * @return
	 */
	public List<String> getDispYears() {
		List<String> years = new ArrayList<String>();
		String thisYear = DateTimeUtil.getFromattedDateTime(DateTimeUtil.getNow(), DateTimeUtil.BASIC_YYYY_FORMAT);
		years.add(thisYear);
		int intYear = Integer.parseInt(thisYear);
		for (int i = 0; i < 4; i++) {
			intYear--;
			years.add(String.valueOf(intYear));
		}
		return years;
	}

	/**
	 * 当月を取得する
	 * @return
	 */
	public String getThisMonth() {
		return DateTimeUtil.getFromattedDateTime(DateTimeUtil.getNow(), DateTimeUtil.BASIC_MM_FORMAT);
	}

	/**
	 * ユーザに関連したグループを取得する
	 * @param userId
	 * @return
	 */
	public List<GroupDTO> getGroupDTOs(String userId) {
		List<GroupDTO> groupDTOs = new ArrayList<GroupDTO>();
		MsUserUtil msUserUtil = new MsUserUtil(userId);
		List<MsGroup> msGroups = msUserUtil.getMsGroups();

		for (MsGroup  msGroup : msGroups) {
			GroupDTO groupDTO = new GroupDTO();
			GroupCopy.copy(msGroup, groupDTO);
			groupDTOs.add(groupDTO);
		}

		return groupDTOs;
	}

	/**
	 * グループに関連した休憩時間を取得する
	 * @param userId
	 * @return
	 */
	public String getRestTime(String groupId) {
		String restTime = StringUtil.EMPTY;
		MsGroupUtil msGroupUtil = new MsGroupUtil(Integer.valueOf(groupId));
		List<MsRestTime> msRestTimes = msGroupUtil.getMsRestTimes();

		if (msRestTimes.isEmpty()) {
			return restTime;
		}

		for (MsRestTime  msRestTime : msRestTimes) {
			if (restTime.length() > 0) {restTime = restTime + ",";}
			restTime = restTime + DateTimeUtil.toMinute(msRestTime.getStartTime()) + "," + DateTimeUtil.toMinute(msRestTime.getEndTime());
		}

		return restTime;
	}

	/**
	 * ユーザID、年、月を指定して交通費精算DTOリストを取得する
	 * @param userId
	 * @return
	 */
	public List<TransExpDTO> getTransExpDTOs(String companyCd, String userId, String year, String month) {
		List<TransExpDTO> transExpDTOs = new ArrayList<TransExpDTO>();

		// 交通費精算データに登録済みのデータがあれば取得する
		DtTransExpUtil dtTransExpUtil = new DtTransExpUtil();
		List<DtTransportExpense> dtTransExps = dtTransExpUtil.getDtTransportExpenses(companyCd, userId, Integer.valueOf(year), Integer.valueOf(month));
		for (DtTransportExpense dtTransExp : dtTransExps) {
			TransExpDTO transExpDTO = new TransExpDTO();
			TransExpCopy.copy(dtTransExp, transExpDTO);
			transExpDTOs.add(transExpDTO);
		}

		// TODO テスト
//		TransExpDTO transExpDTO = new TransExpDTO();
//		transExpDTO.setCompanyCd(companyCd);
//		transExpDTO.setUserId(userId);
//		transExpDTO.setCalendarYy(year);
//		transExpDTO.setCalendarMm(month);
//		transExpDTO.setCalendarDd("15");
//		transExpDTO.setDestination("目的地");
//		transExpDTO.setBusiness("目的");
//		transExpDTO.setOneRoundCd("A001");
//		transExpDTO.setExpenseAmount("1000");
//		transExpDTOs.add(transExpDTO);
		
		return transExpDTOs;
	}

	/**
	 * グループに関連した会社コードを取得する
	 * @param userId
	 * @return
	 */
	public String getCompanyCd(String groupId) {
		jp.co.pds.common.dao.util.MsGroupUtil msGroupUtil = new jp.co.pds.common.dao.util.MsGroupUtil(Integer.valueOf(groupId));
		MsCompany msCompany = msGroupUtil.getMsCompany();

		if (msCompany == null) {
			return StringUtil.EMPTY;
		}

		return msCompany.getCompanyCd();
	}
}
