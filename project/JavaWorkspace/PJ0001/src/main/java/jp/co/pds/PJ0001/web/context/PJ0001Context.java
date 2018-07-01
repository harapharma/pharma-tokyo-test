package jp.co.pds.PJ0001.web.context;

import java.io.Serializable;
import java.util.List;

import jp.co.pds.PJ0001.dto.QuestionDTO;

/**
 * PJ0001コンテキスト
 * @author Rei Kitahara
 *
 */
public class PJ0001Context implements Serializable {

	private static final long serialVersionUID = 12345678L;

	public static String CONTEXT_NAME = "PJ0001_SESSION_CONTEXT";

    /** グループＩＤ */
    private String groupId;
    /** 設問グループＩＤ */
    private String questionGroupId;
    /** 設問グループ名 */
    private String questionGroupName;
    /** 設問数 */
    private String questionCnt;
    /** 解答ID */
    private String answerId;
    /** 設問DTO List */
    private List<QuestionDTO> questionDTOs;

    /**
     * コンストラクタ
     * @param session
     */
	public PJ0001Context() {
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
     * 設問数を取得します。
     * @return String
     */
    public String getQuestionCnt() {
        return questionCnt;
    }
    /**
     * 解答ＩＤを取得します。
     * @return String
     */
    public String getAnswerId() {
        return answerId;
    }
    /**
     * 設問DTO Listを取得します。
     * @return List<QuestionDTO>
     */
    public List<QuestionDTO> getQuestionDTOs() {
        return questionDTOs;
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
     * 設問グループ名を設定します。
     * @param value String
     */
    public void setQuestionGroupName(String value) {
        questionGroupName =  value;
    }
    /**
     * 設問数を設定します。
     * @param value String
     */
    public void setQuestionCnt(String value) {
    	questionCnt =  value;
    }
    /**
     * 解答ＩＤを設定します。
     * @param value String
     */
    public void setAnswerId(String value) {
    	answerId =  value;
    }
    /**
     * 設問DTO Listを設定します。
     * @param value List<QuestionDTO>
     */
    public void setQuestionDTOs(List<QuestionDTO> value) {
    	questionDTOs =  value;
    }

	@Override
	public String toString() {
		return "groupId="+ groupId
				+ ", questionGroupId="+ questionGroupId;
	}
}
