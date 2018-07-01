package jp.co.pds.PJ0002.web.context;

import java.io.Serializable;
import java.util.List;

import jp.co.pds.PJ0002.dto.GroupDTO;
import jp.co.pds.PJ0002.dto.TransExpDTO;
import jp.co.pds.PJ0002.dto.WorkTimeDTO;

/**
 * PJ0002コンテキスト
 * @author Rei Kitahara
 *
 */
public class PJ0002Context implements Serializable {

	private static final long serialVersionUID = 12345678L;

	public static String CONTEXT_NAME = "PJ0002_SESSION_CONTEXT";

    /** 会社CD */
    private String companyCd;
    /** ユーザID */
    private String userId;
    /** ユーザ名 */
    private String userName;
    /** 関連グループリスト */
    private List<GroupDTO> groupDTOs;
    /** 選択グループ */
    private String selectGroup;
    /** 年リスト */
    private List<String> years;
    /** 選択年 */
    private String selectYY;
    /** 選択月 */
    private String selectMM;
    /** 切捨単位 */
    private String workTimeTruncUnit;
    /** 休憩時間 */
    private String restTime;
    /** 勤務時間DTOリスト */
    private List<WorkTimeDTO> workTimeDTOs;
    /** 交通経費DTOリスト */
    private List<TransExpDTO> transExpDTOs;

    /**
     * 会社CDを取得します。
     * @return String
     */
    public String getCompanyCd() {
        return companyCd;
    }
    /**
     * ユーザIDを取得します。
     * @return String
     */
    public String getUserId() {
        return userId;
    }
    /**
     * ユーザ名を取得します。
     * @return String
     */
    public String getUserName() {
        return userName;
    }
    /**
     * 関連グループリストを取得します。
     * @return List<GroupDTO>
     */
    public List<GroupDTO> getGroupDTOs() {
        return groupDTOs;
    }
    /**
     * 選択グループを取得します。
     * @return String
     */
    public String getSelectGroup() {
        return selectGroup;
    }
    /**
     * 年リストを取得します。
     * @return String
     */
    public List<String> getYears() {
        return years;
    }
    /**
     * 選択年を取得します。
     * @return String
     */
    public String getSelectYY() {
        return selectYY;
    }
    /**
     * 選択月を取得します。
     * @return String
     */
    public String getSelectMM() {
        return selectMM;
    }
    /**
     * 切捨単位を取得します。
     * @return String
     */
    public String getWorkTimeTruncUnit() {
        return workTimeTruncUnit;
    }
    /**
     * 休憩時間を取得します。
     * @return String
     */
    public String getRestTime() {
        return restTime;
    }
    /**
     * 勤務時間DTOリストを取得します。
     * @return String
     */
    public List<WorkTimeDTO> getWorkTimeDTOs() {
        return workTimeDTOs;
    }
    /**
     * 交通経費DTOリストを取得します。
     * @return String
     */
    public List<TransExpDTO> getTransExpDTOs() {
        return transExpDTOs;
    }

    /**
     * 会社CDを設定します。
     * @param value String
     */
    public void setCompanyCd(String value) {
    	companyCd =  value;
    }
    /**
     * ユーザIDを設定します。
     * @param value String
     */
    public void setUserId(String value) {
        userId =  value;
    }
    /**
     * ユーザ名を設定します。
     * @param value String
     */
    public void setUserName(String value) {
        userName =  value;
    }
    /**
     * 関連グループリストを設定します。
     * @param value String
     */
    public void setGroupDTOs(List<GroupDTO> value) {
    	groupDTOs =  value;
    }
    /**
     * 選択グループを設定します。
     * @param value String
     */
    public void setSelectGroup(String value) {
    	selectGroup =  value;
    }
    /**
     * 年リストを設定します。
     * @param value List<String>
     */
    public void setYears(List<String> value) {
        years =  value;
    }
    /**
     * 選択年を設定します。
     * @param value String
     */
    public void setSelectYY(String value) {
        selectYY =  value;
    }
    /**
     * 選択月を設定します。
     * @param value String
     */
    public void setSelectMM(String value) {
        selectMM =  value;
    }
    /**
     * 切捨単位を設定します。
     * @param value String
     */
    public void setWorkTimeTruncUnit(String value) {
    	workTimeTruncUnit =  value;
    }
    /**
     * 休憩時間を設定します。
     * @param value String
     */
    public void setRestTime(String value) {
    	restTime =  value;
    }
    /**
     * 勤務時間DTOリストを設定します。
     * @param value List<WorkTimeDTO>
     */
    public void setWorkTimeDTOs(List<WorkTimeDTO> value) {
        workTimeDTOs =  value;
    }
    /**
     * 交通経費DTOリストを設定します。
     * @param value List<WorkTimeDTO>
     */
    public void setTransExpDTOs(List<TransExpDTO> value) {
    	transExpDTOs =  value;
    }

	@Override
	public String toString() {
		return "userId="+ userId
				+ ", selectYY="+ selectYY
				+ ", selectMM="+ selectMM;
	}
}
