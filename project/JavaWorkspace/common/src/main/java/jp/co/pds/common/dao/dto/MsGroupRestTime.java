package jp.co.pds.common.dao.dto;

import java.util.Date;

public class MsGroupRestTime extends MsGroupRestTimeKey {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ms_group_rest_time.REGISTER_ID
     *
     * @mbg.generated Thu Apr 12 22:44:26 JST 2018
     */
    private String registerId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ms_group_rest_time.REGISTER_DATIME
     *
     * @mbg.generated Thu Apr 12 22:44:26 JST 2018
     */
    private Date registerDatime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ms_group_rest_time.UPDATE_ID
     *
     * @mbg.generated Thu Apr 12 22:44:26 JST 2018
     */
    private String updateId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ms_group_rest_time.UPDATE_DATIME
     *
     * @mbg.generated Thu Apr 12 22:44:26 JST 2018
     */
    private Date updateDatime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ms_group_rest_time.REGISTER_ID
     *
     * @return the value of ms_group_rest_time.REGISTER_ID
     *
     * @mbg.generated Thu Apr 12 22:44:26 JST 2018
     */
    public String getRegisterId() {
        return registerId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ms_group_rest_time.REGISTER_ID
     *
     * @param registerId the value for ms_group_rest_time.REGISTER_ID
     *
     * @mbg.generated Thu Apr 12 22:44:26 JST 2018
     */
    public void setRegisterId(String registerId) {
        this.registerId = registerId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ms_group_rest_time.REGISTER_DATIME
     *
     * @return the value of ms_group_rest_time.REGISTER_DATIME
     *
     * @mbg.generated Thu Apr 12 22:44:26 JST 2018
     */
    public Date getRegisterDatime() {
        return registerDatime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ms_group_rest_time.REGISTER_DATIME
     *
     * @param registerDatime the value for ms_group_rest_time.REGISTER_DATIME
     *
     * @mbg.generated Thu Apr 12 22:44:26 JST 2018
     */
    public void setRegisterDatime(Date registerDatime) {
        this.registerDatime = registerDatime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ms_group_rest_time.UPDATE_ID
     *
     * @return the value of ms_group_rest_time.UPDATE_ID
     *
     * @mbg.generated Thu Apr 12 22:44:26 JST 2018
     */
    public String getUpdateId() {
        return updateId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ms_group_rest_time.UPDATE_ID
     *
     * @param updateId the value for ms_group_rest_time.UPDATE_ID
     *
     * @mbg.generated Thu Apr 12 22:44:26 JST 2018
     */
    public void setUpdateId(String updateId) {
        this.updateId = updateId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ms_group_rest_time.UPDATE_DATIME
     *
     * @return the value of ms_group_rest_time.UPDATE_DATIME
     *
     * @mbg.generated Thu Apr 12 22:44:26 JST 2018
     */
    public Date getUpdateDatime() {
        return updateDatime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ms_group_rest_time.UPDATE_DATIME
     *
     * @param updateDatime the value for ms_group_rest_time.UPDATE_DATIME
     *
     * @mbg.generated Thu Apr 12 22:44:26 JST 2018
     */
    public void setUpdateDatime(Date updateDatime) {
        this.updateDatime = updateDatime;
    }
}