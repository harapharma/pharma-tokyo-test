package jp.co.pds.PJ0002.service.top;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import jp.co.pds.PJ0002.Project;
import jp.co.pds.PJ0002.copy.WorkTimeCopy;
import jp.co.pds.PJ0002.dao.dto.DtWorkTime;
import jp.co.pds.PJ0002.dao.util.DtWorkTimeUtil;
import jp.co.pds.PJ0002.dto.WorkTimeDTO;
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
	 * 勤務時間DTOリストをマージする
	 * @param srcs
	 * @param dsts
	 * @return
	 */
	public void margeWorkTimeDTOs(List<WorkTimeDTO> srcs, List<WorkTimeDTO> dsts) {
		for (WorkTimeDTO src : srcs) {
			for (WorkTimeDTO dst : dsts) {
				if (src.getCalendarDD() != null && src.getCalendarDD().equals(dst.getCalendarDD())) {
					dst.setWorkStartTime(src.getWorkStartTime());
					dst.setCalcStartTime(src.getCalcStartTime());
					dst.setWorkEndTime(src.getWorkEndTime());
					dst.setCalcEndTime(src.getCalcEndTime());
					dst.setRemark(src.getRemark());
					dst.setCorrectValue(src.getCorrectValue());
					dst.setWorkTime(src.getWorkTime());
				}
			}
		}
	}

	/**
	 * 勤務時間DTOを保存する
	 * @param workTimeDTOs
	 * @return
	 */
	public void storeWorkTimeDTOs(String userId, String year, String month, List<WorkTimeDTO> workTimeDTOs) {
		for (WorkTimeDTO workTimeDTO : workTimeDTOs) {
			// 入力項目が全て空なら登録しない
			if (StringUtil.EMPTY.equals(workTimeDTO.getWorkStartTime()) &&
				StringUtil.EMPTY.equals(workTimeDTO.getWorkEndTime()) &&
				StringUtil.EMPTY.equals(workTimeDTO.getRemark())) {
				continue;
			}
			DtWorkTime dtWorkTime = new DtWorkTime();
			dtWorkTime.setUserId(userId);
			dtWorkTime.setCalendarYy(Integer.valueOf(year));
			dtWorkTime.setCalendarMm(Integer.valueOf(month));
			WorkTimeCopy.copy(workTimeDTO, dtWorkTime);
			dtWorkTime.setRegisterId(Project.getProjectCode());
			dtWorkTime.setUpdateId(Project.getProjectCode());

			DtWorkTimeUtil dtWorkTimeUtil = new DtWorkTimeUtil();
			dtWorkTimeUtil.margeDtWorkTime(dtWorkTime);
		}
	}
}
