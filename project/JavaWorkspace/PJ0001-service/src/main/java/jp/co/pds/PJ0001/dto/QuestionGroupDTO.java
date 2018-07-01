package jp.co.pds.PJ0001.dto;

import java.util.List;

import jp.co.pds.common.dto.BaseDTO;

/**
 * @author Rei Kitahara
 *
 */
public class QuestionGroupDTO extends BaseDTO {

	static final long serialVersionUID = 12345678L;

    /** 設問グループＩＤ */
    private String questionGroupId;
    /** 設問グループ名 */
    private String questionGroupName;
    /** 設問DTOリスト */
    private List<QuestionDTO> questionDTOs;

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
     * 設問DTOリスト を取得します。
     * @return String
     */
    public List<QuestionDTO> getQuestionDTOs() {
        return questionDTOs;
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
     * 設問DTOリストを設定します。
     * @param value String
     */
    public void setQuestionDTOs(List<QuestionDTO> value) {
    	questionDTOs =  value;
    }

    @Override
	public String toString() {
		// TODO Auto-generated method stub
		return null;
	}
}
