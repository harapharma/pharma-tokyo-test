package jp.co.pds.PJ0002.dto;

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
    /** 勤務開始時刻 */
    private String workStartTime;
    /** 勤務終了時刻 */
    private String workEndTime;
    /** 切捨単位 */
    private String workTimeTruncUnit;

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
     * 勤務開始時刻を取得します。
     * @return String
     */
    public String getWorkStartTime() {
        return workStartTime;
    }
    /**
     * 勤務終了時刻を取得します。
     * @return String
     */
    public String getWorkEndTime() {
        return workEndTime;
    }
    /**
     * 切捨単位を取得します。
     * @return String
     */
    public String getWorkTimeTruncUnit() {
        return workTimeTruncUnit;
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
     * 勤務開始時刻を設定します。
     * @param value String
     */
    public void setWorkStartTime(String value) {
    	workStartTime =  value;
    }
    /**
     * 勤務終了時刻を設定します。
     * @param value String
     */
    public void setWorkEndTime(String value) {
    	workEndTime =  value;
    }
    /**
     * 切捨単位を設定します。
     * @param value String
     */
    public void setWorkTimeTruncUnit(String value) {
    	workTimeTruncUnit =  value;
    }

    @Override
	public String toString() {
		return "groupId=" + groupId;
	}
}
