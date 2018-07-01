package jp.co.pds.PJ0001.copy;

import jp.co.pds.PJ0001.dao.dto.MsQuestion;
import jp.co.pds.PJ0001.dao.dto.MsQuestionGroup;
import jp.co.pds.PJ0001.dto.QuestionDTO;
import jp.co.pds.PJ0001.dto.QuestionGroupDTO;

public class QuestionGroupCopy {

	public static void copy(MsQuestionGroup src, QuestionGroupDTO dst) {
		dst.setQuestionGroupId(String.valueOf(src.getQuestionGroupId()));
		dst.setQuestionGroupName(src.getQuestionGroupName());
	}

	public static void copy(QuestionDTO src, MsQuestion dst) {
		// TODO
	}
}
