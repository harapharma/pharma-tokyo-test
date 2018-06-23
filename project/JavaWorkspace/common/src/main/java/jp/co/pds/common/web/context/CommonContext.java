package jp.co.pds.common.web.context;

import java.io.Serializable;

import javax.servlet.http.HttpSession;

/**
 * セッションコンテキスト
 * @author Rei Kitahara
 *
 */
public class CommonContext implements Serializable {

	private static final long serialVersionUID = 12345678L;

	public static String CONTEXT_NAME = "COMMON_SESSION_CONTEXT";

    /** 会社CD*/
    private String companyCd;
    /** グループID*/
    private String groupId;
    /** ユーザID*/
    private String userId;
    /** ログイン日時 */
    private String loginDateTime;
    /** ユーザ名 */
    private String userName;
    /** メッセージ */
    private String message;

    /**
     * コンストラクタ
     * @param session
     */
	public CommonContext() {
	}

    /**
     * 会社CDを取得します。
     * @return String
     */
    public String getCompanyCd() {
        return companyCd;
    }
    /**
     * グループIDを取得します。
     * @return String
     */
    public String getGroupId() {
        return groupId;
    }
    /**
     * ユーザIDを取得します。
     * @return String
     */
    public String getUserId() {
        return userId;
    }
    /**
     * ログイン日時を取得します。
     * @return String
     */
    public String getLoginDateTime() {
        return loginDateTime;
    }
    /**
     * ユーザ名を取得します。
     * @return String
     */
    public String getUserName() {
        return userName;
    }
    /**
     * メッセージを取得します。
     * @return String
     */
    public String getMessage() {
        return message;
    }

    /**
     * 会社CDを設定します。
     * @param value String
     */
    public void setCompanyCd(String value) {
    	companyCd =  value;
    }
    /**
     * グループIDを設定します。
     * @param value String
     */
    public void setGroupId(String value) {
    	groupId =  value;
    }
    /**
     * ユーザIDを設定します。
     * @param value String
     */
    public void setUserId(String value) {
        userId =  value;
    }
    /**
     * ログイン日時を設定します。
     * @param value String
     */
    public void setLoginDateTime(String value) {
        loginDateTime =  value;
    }
    /**
     * ユーザ名を設定します。
     * @param value String
     */
    public void setUserName(String value) {
        userName =  value;
    }
    /**
     * メッセージを設定します。
     * @param value String
     */
    public void setMessage(String value) {
    	message = value;
    }
}
