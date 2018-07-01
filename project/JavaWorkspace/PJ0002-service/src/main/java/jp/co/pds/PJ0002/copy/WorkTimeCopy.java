package jp.co.pds.PJ0002.copy;

import jp.co.pds.PJ0002.dao.dto.DtWorkTime;
import jp.co.pds.PJ0002.dto.WorkTimeDTO;
import jp.co.pds.common.util.DateTimeUtil;

public class WorkTimeCopy {

	public static void copy(DtWorkTime src, WorkTimeDTO dst) {
		dst.setCalendarDD(String.valueOf(src.getCalendarDd()));
		dst.setWorkStartEmbs(src.getWorkStartEmbs());
		dst.setCalcStartTime(src.getCalcStartTime());
		dst.setWorkEndEmbs(src.getWorkEndEmbs());
		dst.setCalcEndTime(src.getCalcEndTime());
		dst.setRemark(src.getRemark());
		dst.setCorrectValue(String.valueOf(src.getCorrectValue()));
		dst.setWorkTime(DateTimeUtil.toHourString(src.getWorkTime()));

		String workStartTime = src.getWorkStartTime();
		if (workStartTime != null && workStartTime.length() == 4) {workStartTime = workStartTime.substring(0, 2) + ":" + workStartTime.substring(2);}
		dst.setWorkStartTime(workStartTime);
		String workEndTime = src.getWorkEndTime();
		if (workEndTime != null && workEndTime.length() == 4) {workEndTime = workEndTime.substring(0, 2) + ":" + workEndTime.substring(2);}
		dst.setWorkEndTime(workEndTime);
	}

	public static void copy(WorkTimeDTO src, DtWorkTime dst) {
		dst.setCalendarDd(Integer.valueOf(src.getCalendarDD()));
		dst.setWorkStartEmbs(src.getWorkStartEmbs());
		dst.setCalcStartTime(src.getCalcStartTime());
		dst.setWorkEndEmbs(src.getWorkEndEmbs());
		dst.setCalcEndTime(src.getCalcEndTime());
		dst.setRemark(src.getRemark());
		if (src.getCorrectValue() == null || src.getCorrectValue().isEmpty()) {
			dst.setCorrectValue(0);
		} else {
			dst.setCorrectValue(Integer.valueOf(src.getCorrectValue()));
		}
		dst.setWorkTime(DateTimeUtil.toMinute(src.getWorkTime()));

		String workStartTime = src.getWorkStartTime();
		if (workStartTime != null) {workStartTime = workStartTime.replaceAll(":", "");}
		dst.setWorkStartTime(workStartTime);
		String workEndTime = src.getWorkEndTime();
		if (workEndTime != null) {workEndTime = workEndTime.replaceAll(":", "");}
		dst.setWorkEndTime(workEndTime);
	}
}
