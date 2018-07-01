package jp.co.pds.PJ0002.dto;

import jp.co.pds.common.dto.BaseDTO;

/**
 * @author Rei Kitahara
 *
 */
public class TransExpDTO extends BaseDTO {

	static final long serialVersionUID = 12345678L;

    /** 交通経費ＩＤ */
    private String transportExpenseId;
    /** 会社コード */
    private String companyCd;
    /** ユーザＩＤ */
    private String userId;
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
    /** 目的地 */
    private String destination;
    /** 用件 */
    private String business;
    /** 交通機関 */
    private String transportFacility;
    /** 出発 */
    private String departure;
    /** 到着 */
    private String arrival;
    /** 片往コード */
    private String oneRoundCd;

    /**
     * 交通経費ＩＤを取得します。
     * @return String
     */
    public String getTransportExpenseId() {
        return transportExpenseId;
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
     * 目的地を取得します。
     * @return String
     */
    public String getDestination() {
        return destination;
    }
    /**
     * 用件を取得します。
     * @return String
     */
    public String getBusiness() {
        return business;
    }
    /**
     * 交通機関を取得します。
     * @return String
     */
    public String getTransportFacility() {
        return transportFacility;
    }
    /**
     * 出発を取得します。
     * @return String
     */
    public String getDeparture() {
        return departure;
    }
    /**
     * 到着を取得します。
     * @return String
     */
    public String getArrival() {
        return arrival;
    }
    /**
     * 片往コードを取得します。
     * @return String
     */
    public String getOneRoundCd() {
        return oneRoundCd;
    }

    /**
     * 交通経費ＩＤを設定します。
     * @param value String
     */
    public void setTransportExpenseId(String value) {
    	transportExpenseId =  value;
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
     * 目的地を設定します。
     * @param value String
     */
    public void setDestination(String value) {
        destination =  value;
    }
    /**
     * 用件を設定します。
     * @param value String
     */
    public void setBusiness(String value) {
        business =  value;
    }
    /**
     * 交通機関を設定します。
     * @param value String
     */
    public void setTransportFacility(String value) {
        transportFacility =  value;
    }
    /**
     * 出発を設定します。
     * @param value String
     */
    public void setDeparture(String value) {
        departure =  value;
    }
    /**
     * 到着を設定します。
     * @param value String
     */
    public void setArrival(String value) {
        arrival =  value;
    }
    /**
     * 片往コードを設定します。
     * @param value String
     */
    public void setOneRoundCd(String value) {
        oneRoundCd =  value;
    }

    @Override
	public String toString() {
		return "companyCd=" + companyCd
			+ ", userId=" + userId
			+ ", calendarYy=" + calendarYy;
	}
}
