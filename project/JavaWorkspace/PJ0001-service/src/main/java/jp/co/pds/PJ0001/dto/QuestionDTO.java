package jp.co.pds.PJ0001.dto;

import jp.co.pds.common.dto.BaseDTO;

/**
 * @author Rei Kitahara
 *
 */
public class QuestionDTO extends BaseDTO {

	static final long serialVersionUID = 12345678L;

    /** グループＩＤ */
    private String groupId;
    /** 設問グループＩＤ */
    private String questionGroupId;
    /** 設問ＩＤ */
    private String questionId;
    /** 設問表題 */
    private String questionTitle;
    /** 設問文章 */
    private String questionSentence;
    /** 解答文章１ */
    private String answerSentence1;
    /** 解答文章２ */
    private String answerSentence2;
    /** 解答文章３ */
    private String answerSentence3;
    /** 解答文章４ */
    private String answerSentence4;
    /** 正解番号 */
    private String correctNumber;
    /** 解説 */
    private String comment;
    /** 選択 */
    private String selection;

    /**
     * グループＩＤを取得します。
     * @return String
     */
    public String getGroupId() {
        return groupId;
    }
    /**
     * 設問グループＩＤを取得します。
     * @return String
     */
    public String getQuestionGroupId() {
        return questionGroupId;
    }
    /**
     * 設問ＩＤを取得します。
     * @return String
     */
    public String getQuestionId() {
        return questionId;
    }
    /**
     * 設問表題を取得します。
     * @return String
     */
    public String getQuestionTitle() {
        return questionTitle;
    }
    /**
     * 設問文章を取得します。
     * @return String
     */
    public String getQuestionSentence() {
        return questionSentence;
    }
    /**
     * 解答文章１を取得します。
     * @return String
     */
    public String getAnswerSentence1() {
        return answerSentence1;
    }
    /**
     * 解答文章２を取得します。
     * @return String
     */
    public String getAnswerSentence2() {
        return answerSentence2;
    }
    /**
     * 解答文章３を取得します。
     * @return String
     */
    public String getAnswerSentence3() {
        return answerSentence3;
    }
    /**
     * 解答文章４を取得します。
     * @return String
     */
    public String getAnswerSentence4() {
        return answerSentence4;
    }
    /**
     * 正解番号を取得します。
     * @return String
     */
    public String getCorrectNumber() {
        return correctNumber;
    }
    /**
     * 解説を取得します。
     * @return String
     */
    public String getComment() {
        return comment;
    }
    /**
     * 選択を取得します。
     * @return String
     */
    public String getSelection() {
        return selection;
    }

    /**
     * グループＩＤを設定します。
     * @param value String
     */
    public void setGroupId(String value) {
        groupId =  value;
    }
    /**
     * 設問グループＩＤを設定します。
     * @param value String
     */
    public void setQuestionGroupId(String value) {
        questionGroupId =  value;
    }
    /**
     * 設問ＩＤを設定します。
     * @param value String
     */
    public void setQuestionId(String value) {
        questionId =  value;
    }
    /**
     * 設問表題を設定します。
     * @param value String
     */
    public void setQuestionTitle(String value) {
        questionTitle =  value;
    }
    /**
     * 設問文章を設定します。
     * @param value String
     */
    public void setQuestionSentence(String value) {
        questionSentence =  value;
    }
    /**
     * 解答文章１を設定します。
     * @param value String
     */
    public void setAnswerSentence1(String value) {
        answerSentence1 =  value;
    }
    /**
     * 解答文章２を設定します。
     * @param value String
     */
    public void setAnswerSentence2(String value) {
        answerSentence2 =  value;
    }
    /**
     * 解答文章３を設定します。
     * @param value String
     */
    public void setAnswerSentence3(String value) {
        answerSentence3 =  value;
    }
    /**
     * 解答文章４を設定します。
     * @param value String
     */
    public void setAnswerSentence4(String value) {
        answerSentence4 =  value;
    }
    /**
     * 正解番号を設定します。
     * @param value String
     */
    public void setCorrectNumber(String value) {
        correctNumber =  value;
    }
    /**
     * 解説を設定します。
     * @param value String
     */
    public void setComment(String value) {
        comment =  value;
    }
    /**
     * 選択を設定します。
     * @param value String
     */
    public void setSelection(String value) {
        selection =  value;
    }

	@Override
	public String toString() {
		return "groupId=" + groupId
				+ ", questionGroupId=" + questionGroupId
				+ ", questionId=" + questionId;
	}
}
