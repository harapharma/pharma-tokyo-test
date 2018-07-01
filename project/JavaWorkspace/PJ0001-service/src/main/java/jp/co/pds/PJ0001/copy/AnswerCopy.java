package jp.co.pds.PJ0001.copy;

import jp.co.pds.PJ0001.dao.dto.DtAnswer;
import jp.co.pds.PJ0001.dto.AnswerDTO;
import jp.co.pds.common.util.DateTimeUtil;


public class AnswerCopy {

	public static void copy(DtAnswer src, AnswerDTO dst) {
		dst.setAnswerId(String.valueOf(src.getAnswerId()));
		dst.setUserId(src.getUpdateId());
		dst.setGroupId(String.valueOf(src.getGroupId()));
		dst.setQuestionGroupId(String.valueOf(src.getQuestionGroupId()));
		dst.setAnswerDatime(DateTimeUtil.getFromattedDateTime(src.getAnswerDatime(), DateTimeUtil.BASIC_DATETIME_FORMAT));
		dst.setQuestionCnt(String.valueOf(src.getQuestionCnt()));
		dst.setNeedCorrectCnt(String.valueOf(src.getNeedCorrectCnt()));
		dst.setCorrectCnt(String.valueOf(src.getCorrectCnt()));
	}

	public static void copy(AnswerDTO src, DtAnswer dst) {
		// TODO
	}
}
