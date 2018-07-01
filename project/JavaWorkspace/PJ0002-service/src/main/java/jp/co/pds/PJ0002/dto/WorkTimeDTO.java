package jp.co.pds.PJ0002.dto;

import jp.co.pds.common.dto.BaseDTO;

/**
 * @author Rei Kitahara
 *
 */
public class WorkTimeDTO extends BaseDTO {

	static final long serialVersionUID = 12345678L;

    /** カレンダー日 */
    private String calendarDD;
    /** 曜日名 */
    private String weekdayName;
    /** 休日コード */
    private String holidayCd;
    /** 勤務開始打刻 */
    private String workStartEmbs;
    /** 勤務開始時刻 */
    private String workStartTime;
    /** 計算開始時刻 */
    private String calcStartTime;
    /** 勤務終了打刻 */
    private String workEndEmbs;
    /** 勤務終了時刻 */
    private String workEndTime;
    /** 計算終了時刻 */
    private String calcEndTime;
    /** 備考 */
    private String remark;
    /** 補正値 */
    private String correctValue;
    /** 勤務時間 */
    private String workTime;

    /**
     * カレンダー日を取得します。
     * @return String
     */
    public String getCalendarDD() {
        return calendarDD;
    }
    /**
     * 曜日名を取得します。
     * @return String
     */
    public String getWeekdayName() {
        return weekdayName;
    }
    /**
     * 休日コード を取得します。
     * @return String
     */
    public String getHolidayCd() {
        return holidayCd;
    }
    /**
     * 勤務開始打刻を取得します。
     * @return String
     */
    public String getWorkStartEmbs() {
        return workStartEmbs;
    }
    /**
     * 勤務開始時刻を取得します。
     * @return String
     */
    public String getWorkStartTime() {
        return workStartTime;
    }
    /**
     * 計算開始時刻を取得します。
     * @return String
     */
    public String getCalcStartTime() {
        return calcStartTime;
    }
    /**
     * 勤務終了打刻を取得します。
     * @return String
     */
    public String getWorkEndEmbs() {
        return workEndEmbs;
    }
    /**
     * 勤務終了時刻を取得します。
     * @return String
     */
    public String getWorkEndTime() {
        return workEndTime;
    }
    /**
     * 計算終了時刻を取得します。
     * @return String
     */
    public String getCalcEndTime() {
        return calcEndTime;
    }
    /**
     * 備考を取得します。
     * @return String
     */
    public String getRemark() {
        return remark;
    }
    /**
     * 補正値を取得します。
     * @return String
     */
    public String getCorrectValue() {
        return correctValue;
    }
    /**
     * 勤務時間を取得します。
     * @return String
     */
    public String getWorkTime() {
        return workTime;
    }

    /**
     * カレンダー日を設定します。
     * @param value String
     */
    public void setCalendarDD(String value) {
        calendarDD =  value;
    }
    /**
     * 曜日名を設定します。
     * @param value String
     */
    public void setWeekdayName(String value) {
    	weekdayName =  value;
    }
    /**
     * 休日コード を設定します。
     * @param value String
     */
    public void setHolidayCd(String value) {
    	holidayCd =  value;
    }
    /**
     * 勤務開始打刻を設定します。
     * @param value String
     */
    public void setWorkStartEmbs(String value) {
        workStartEmbs =  value;
    }
    /**
     * 勤務開始時刻を設定します。
     * @param value String
     */
    public void setWorkStartTime(String value) {
        workStartTime =  value;
    }
    /**
     * 計算開始時刻を設定します。
     * @param value String
     */
    public void setCalcStartTime(String value) {
        calcStartTime =  value;
    }
    /**
     * 勤務終了打刻を設定します。
     * @param value String
     */
    public void setWorkEndEmbs(String value) {
        workEndEmbs =  value;
    }
    /**
     * 勤務終了時刻を設定します。
     * @param value String
     */
    public void setWorkEndTime(String value) {
        workEndTime =  value;
    }
    /**
     * 計算終了時刻を設定します。
     * @param value String
     */
    public void setCalcEndTime(String value) {
        calcEndTime =  value;
    }
    /**
     * 備考を設定します。
     * @param value String
     */
    public void setRemark(String value) {
        remark =  value;
    }
    /**
     * 補正値を設定します。
     * @param value String
     */
    public void setCorrectValue(String value) {
    	correctValue =  value;
    }
    /**
     * 勤務時間を設定します。
     * @param value String
     */
    public void setWorkTime(String value) {
    	workTime =  value;
    }

    @Override
	public String toString() {
		return "calendarDD="+ calendarDD;
	}
}
