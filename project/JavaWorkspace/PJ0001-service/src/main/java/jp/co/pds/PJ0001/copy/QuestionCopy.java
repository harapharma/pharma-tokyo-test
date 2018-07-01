package jp.co.pds.PJ0001.copy;

import jp.co.pds.PJ0001.dao.dto.MsQuestion;
import jp.co.pds.PJ0001.dto.QuestionDTO;

public class QuestionCopy {

	public static void copy(MsQuestion src, QuestionDTO dst) {
		dst.setQuestionId(String.valueOf(src.getQuestionId()));
		dst.setQuestionTitle(src.getQuestionTitle());
		dst.setQuestionSentence(src.getQuestionSentence());
		dst.setAnswerSentence1(src.getAnswerSentence1());
		dst.setAnswerSentence2(src.getAnswerSentence2());
		dst.setAnswerSentence3(src.getAnswerSentence3());
		dst.setAnswerSentence4(src.getAnswerSentence4());
		dst.setCorrectNumber(String.valueOf(src.getCorrectNumber()));
		dst.setComment(src.getComment());
	}

	public static void copy(QuestionDTO src, MsQuestion dst) {
		// TODO
	}
}
