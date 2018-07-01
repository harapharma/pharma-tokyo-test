package jp.co.pds.PJ0001.form;

/**
 * @author Rei Kitahara
 *
 */
public class ResultForm extends BaseForm {

	static final long serialVersionUID = 12345678L;

	/** 解答ＩＤ */
    private String answerId;
	/** ユーザＩＤ */
    private String userId;
	/** グループＩＤ */
    private String groupId;
	/** 設問グループＩＤ */
    private String questionGroupId;
	/** 設問グループ名 */
    private String questionGroupName;
	/** 解答日時 */
    private String answerDatime;
	/** 設問数 */
    private String questionCnt;
	/** 必要正解数 */
    private String needCorrectCnt;
	/** 正解数 */
    private String correctCnt;
	/** メッセージ */
    private String message;

    /**
     * 解答ＩＤを取得します。
     * @return String
     */
    public String getAnswerId() {
        return answerId;
    }
    /**
     * ユーザＩＤを取得します。
     * @return String
     */
    public String getUserId() {
        return userId;
    }
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
     * 設問グループ名を取得します。
     * @return String
     */
    public String getQuestionGroupName() {
        return questionGroupName;
    }
    /**
     * 解答日時を取得します。
     * @return String
     */
    public String getAnswerDatime() {
        return answerDatime;
    }
    /**
     * 設問数を取得します。
     * @return String
     */
    public String getQuestionCnt() {
        return questionCnt;
    }
    /**
     * 必要正解数を取得します。
     * @return String
     */
    public String getNeedCorrectCnt() {
        return needCorrectCnt;
    }
    /**
     * 正解数を取得します。
     * @return String
     */
    public String getCorrectCnt() {
        return correctCnt;
    }
    /**
     * 正解数を取得します。
     * @return String
     */
    public String getMessage() {
        return message;
    }

    /**
     * 解答ＩＤを設定します。
     * @param value String
     */
    public void setAnswerId(String value) {
    	answerId =  value;
    }
    /**
     * ユーザＩＤを設定します。
     * @param value String
     */
    public void setUserId(String value) {
    	userId =  value;
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
     * 設問グループＩＤを設定します。
     * @param value String
     */
    public void setQuestionGroupName(String value) {
    	questionGroupName =  value;
    }
    /**
     * 解答日時を設定します。
     * @param value String
     */
    public void setAnswerDatime(String value) {
    	answerDatime =  value;
    }
    /**
     * 設問数を設定します。
     * @param value String
     */
    public void setQuestionCnt(String value) {
    	questionCnt =  value;
    }
    /**
     * 必要正解数を設定します。
     * @param value String
     */
    public void setNeedCorrectCnt(String value) {
    	needCorrectCnt =  value;
    }
    /**
     * 正解数を設定します。
     * @param value String
     */
    public void setCorrectCnt(String value) {
    	correctCnt =  value;
    }
    /**
     * メッセージを設定します。
     * @param value String
     */
    public void setMessage(String value) {
    	message =  value;
    }

    @Override
	public String toString() {
		return "answerId="+ answerId
				+ ", userId="+ userId
				+ ", groupId="+ groupId
				+ ", questionGroupId="+ questionGroupId;
	}
}
