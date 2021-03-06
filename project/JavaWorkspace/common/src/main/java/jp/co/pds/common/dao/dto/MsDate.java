package jp.co.pds.common.dao.dto;

import java.util.Date;

public class MsDate extends MsDateKey {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ms_date.WEEKDAY_CD
     *
     * @mbg.generated Sun Apr 08 08:38:07 JST 2018
     */
    private String weekdayCd;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ms_date.HOLIDAY_CD
     *
     * @mbg.generated Sun Apr 08 08:38:07 JST 2018
     */
    private String holidayCd;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ms_date.REGISTER_ID
     *
     * @mbg.generated Sun Apr 08 08:38:07 JST 2018
     */
    private String registerId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ms_date.REGISTER_DATIME
     *
     * @mbg.generated Sun Apr 08 08:38:07 JST 2018
     */
    private Date registerDatime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ms_date.UPDATE_ID
     *
     * @mbg.generated Sun Apr 08 08:38:07 JST 2018
     */
    private String updateId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ms_date.UPDATE_DATIME
     *
     * @mbg.generated Sun Apr 08 08:38:07 JST 2018
     */
    private Date updateDatime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ms_date.WEEKDAY_CD
     *
     * @return the value of ms_date.WEEKDAY_CD
     *
     * @mbg.generated Sun Apr 08 08:38:07 JST 2018
     */
    public String getWeekdayCd() {
        return weekdayCd;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ms_date.WEEKDAY_CD
     *
     * @param weekdayCd the value for ms_date.WEEKDAY_CD
     *
     * @mbg.generated Sun Apr 08 08:38:07 JST 2018
     */
    public void setWeekdayCd(String weekdayCd) {
        this.weekdayCd = weekdayCd;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ms_date.HOLIDAY_CD
     *
     * @return the value of ms_date.HOLIDAY_CD
     *
     * @mbg.generated Sun Apr 08 08:38:07 JST 2018
     */
    public String getHolidayCd() {
        return holidayCd;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ms_date.HOLIDAY_CD
     *
     * @param holidayCd the value for ms_date.HOLIDAY_CD
     *
     * @mbg.generated Sun Apr 08 08:38:07 JST 2018
     */
    public void setHolidayCd(String holidayCd) {
        this.holidayCd = holidayCd;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ms_date.REGISTER_ID
     *
     * @return the value of ms_date.REGISTER_ID
     *
     * @mbg.generated Sun Apr 08 08:38:07 JST 2018
     */
    public String getRegisterId() {
        return registerId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ms_date.REGISTER_ID
     *
     * @param registerId the value for ms_date.REGISTER_ID
     *
     * @mbg.generated Sun Apr 08 08:38:07 JST 2018
     */
    public void setRegisterId(String registerId) {
        this.registerId = registerId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ms_date.REGISTER_DATIME
     *
     * @return the value of ms_date.REGISTER_DATIME
     *
     * @mbg.generated Sun Apr 08 08:38:07 JST 2018
     */
    public Date getRegisterDatime() {
        return registerDatime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ms_date.REGISTER_DATIME
     *
     * @param registerDatime the value for ms_date.REGISTER_DATIME
     *
     * @mbg.generated Sun Apr 08 08:38:07 JST 2018
     */
    public void setRegisterDatime(Date registerDatime) {
        this.registerDatime = registerDatime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ms_date.UPDATE_ID
     *
     * @return the value of ms_date.UPDATE_ID
     *
     * @mbg.generated Sun Apr 08 08:38:07 JST 2018
     */
    public String getUpdateId() {
        return updateId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ms_date.UPDATE_ID
     *
     * @param updateId the value for ms_date.UPDATE_ID
     *
     * @mbg.generated Sun Apr 08 08:38:07 JST 2018
     */
    public void setUpdateId(String updateId) {
        this.updateId = updateId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ms_date.UPDATE_DATIME
     *
     * @return the value of ms_date.UPDATE_DATIME
     *
     * @mbg.generated Sun Apr 08 08:38:07 JST 2018
     */
    public Date getUpdateDatime() {
        return updateDatime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ms_date.UPDATE_DATIME
     *
     * @param updateDatime the value for ms_date.UPDATE_DATIME
     *
     * @mbg.generated Sun Apr 08 08:38:07 JST 2018
     */
    public void setUpdateDatime(Date updateDatime) {
        this.updateDatime = updateDatime;
    }
}