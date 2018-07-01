package jp.co.pds.PJ0001.dto;

import java.util.List;

import jp.co.pds.common.dto.BaseDTO;

/**
 * @author Rei Kitahara
 *
 */
public class GroupDTO extends BaseDTO {

	static final long serialVersionUID = 12345678L;

	/** グループＩＤ */
    private String groupId;
    /** グループ名 */
    private String groupName;
    /** 設問グループDTOリスト */
    private List<QuestionGroupDTO> questionGroupDTOs;

    /**
     * グループＩＤを取得します。
     * @return String
     */
    public String getGroupId() {
        return groupId;
    }
    /**
     * グループ名を取得します。
     * @return String
     */
    public String getGroupName() {
        return groupName;
    }

    /**
     * 設問グループDTOリスト を取得します。
     * @return String
     */
    public List<QuestionGroupDTO> getQuestionGroupDTOs() {
        return questionGroupDTOs;
    }

    /**
     * 設問グループＩＤを設定します。
     * @param value String
     */
    public void setGroupId(String value) {
        groupId =  value;
    }
    /**
     * 設問グループ名を設定します。
     * @param value String
     */
    public void setGroupName(String value) {
        groupName =  value;
    }
    /**
     * 設問グループDTOリストを設定します。
     * @param value String
     */
    public void setQuestionGroupDTOs(List<QuestionGroupDTO> value) {
    	questionGroupDTOs =  value;
    }

    @Override
	public String toString() {
		// TODO Auto-generated method stub
		return null;
	}
}
