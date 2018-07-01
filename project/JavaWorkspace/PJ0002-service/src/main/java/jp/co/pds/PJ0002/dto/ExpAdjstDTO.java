package jp.co.pds.PJ0002.dto;

import jp.co.pds.common.dto.BaseDTO;

/**
 * @author Rei Kitahara
 *
 */
public class ExpAdjstDTO extends BaseDTO {

	static final long serialVersionUID = 12345678L;

    /** 経費精算ＩＤ */
    private String expenseAdjstmntId;
    /** 会社コード */
    private String companyCd;
    /** ユーザＩＤ */
    private String userId;
    /** 勘定科目ＩＤ */
    private String accountTitleId;
    /** カレンダー年 */
    private String calendarYy;
    /** カレンダー月 */
    private String calendarMm;
    /** カレンダー日 */
    private String calendarDd;
    /** 経費金額 */
    private String expenseAmount;
    /** 仮払金 */
    private String temporaryMoney;
    /** 備考 */
    private String remark;

    /**
     * 経費精算ＩＤを取得します。
     * @return String
     */
    public String getExpenseAdjstmntId() {
        return expenseAdjstmntId;
    }
    /**
     * 会社コードを取得します。
     * @return String
     */
    public String getCompanyCd() {
        return companyCd;
    }
    /**
     * ユーザＩＤを取得します。
     * @return String
     */
    public String getUserId() {
        return userId;
    }
    /**
     * 勘定科目ＩＤを取得します。
     * @return String
     */
    public String getAccountTitleId() {
        return accountTitleId;
    }
    /**
     * カレンダー年を取得します。
     * @return String
     */
    public String getCalendarYy() {
        return calendarYy;
    }
    /**
     * カレンダー月を取得します。
     * @return String
     */
    public String getCalendarMm() {
        return calendarMm;
    }
    /**
     * カレンダー日を取得します。
     * @return String
     */
    public String getCalendarDd() {
        return calendarDd;
    }
    /**
     * 経費金額を取得します。
     * @return String
     */
    public String getExpenseAmount() {
        return expenseAmount;
    }
    /**
     * 仮払金を取得します。
     * @return String
     */
    public String getTemporaryMoney() {
        return temporaryMoney;
    }
    /**
     * 備考を取得します。
     * @return String
     */
    public String getRemark() {
        return remark;
    }

    /**
     * 経費精算ＩＤを設定します。
     * @param value String
     */
    public void setExpenseAdjstmntId(String value) {
        expenseAdjstmntId =  value;
    }
    /**
     * 会社コードを設定します。
     * @param value String
     */
    public void setCompanyCd(String value) {
        companyCd =  value;
    }
    /**
     * ユーザＩＤを設定します。
     * @param value String
     */
    public void setUserId(String value) {
        userId =  value;
    }
    /**
     * 勘定科目ＩＤを設定します。
     * @param value String
     */
    public void setAccountTitleId(String value) {
        accountTitleId =  value;
    }
    /**
     * カレンダー年を設定します。
     * @param value String
     */
    public void setCalendarYy(String value) {
        calendarYy =  value;
    }
    /**
     * カレンダー月を設定します。
     * @param value String
     */
    public void setCalendarMm(String value) {
        calendarMm =  value;
    }
    /**
     * カレンダー日を設定します。
     * @param value String
     */
    public void setCalendarDd(String value) {
        calendarDd =  value;
    }
    /**
     * 経費金額を設定します。
     * @param value String
     */
    public void setExpenseAmount(String value) {
        expenseAmount =  value;
    }
    /**
     * 仮払金を設定します。
     * @param value String
     */
    public void setTemporaryMoney(String value) {
        temporaryMoney =  value;
    }
    /**
     * 備考を設定します。
     * @param value String
     */
    public void setRemark(String value) {
        remark =  value;
    }

    @Override
	public String toString() {
		return "companyCd=" + companyCd
			+ ", userId=" + userId
			+ ", calendarYy=" + calendarYy;
	}
}
