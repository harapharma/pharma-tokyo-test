package jp.co.pds.common.dao.dto;

import java.util.Date;

public class MsMessage extends MsMessageKey {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ms_message.MESSAGE
     *
     * @mbg.generated Sat Mar 17 23:22:32 JST 2018
     */
    private String message;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ms_message.REGISTER_ID
     *
     * @mbg.generated Sat Mar 17 23:22:32 JST 2018
     */
    private String registerId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ms_message.REGISTER_DATIME
     *
     * @mbg.generated Sat Mar 17 23:22:32 JST 2018
     */
    private Date registerDatime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ms_message.UPDATE_ID
     *
     * @mbg.generated Sat Mar 17 23:22:32 JST 2018
     */
    private String updateId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ms_message.UPDATE_DATIME
     *
     * @mbg.generated Sat Mar 17 23:22:32 JST 2018
     */
    private Date updateDatime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ms_message.MESSAGE
     *
     * @return the value of ms_message.MESSAGE
     *
     * @mbg.generated Sat Mar 17 23:22:32 JST 2018
     */
    public String getMessage() {
        return message;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ms_message.MESSAGE
     *
     * @param message the value for ms_message.MESSAGE
     *
     * @mbg.generated Sat Mar 17 23:22:32 JST 2018
     */
    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ms_message.REGISTER_ID
     *
     * @return the value of ms_message.REGISTER_ID
     *
     * @mbg.generated Sat Mar 17 23:22:32 JST 2018
     */
    public String getRegisterId() {
        return registerId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ms_message.REGISTER_ID
     *
     * @param registerId the value for ms_message.REGISTER_ID
     *
     * @mbg.generated Sat Mar 17 23:22:32 JST 2018
     */
    public void setRegisterId(String registerId) {
        this.registerId = registerId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ms_message.REGISTER_DATIME
     *
     * @return the value of ms_message.REGISTER_DATIME
     *
     * @mbg.generated Sat Mar 17 23:22:32 JST 2018
     */
    public Date getRegisterDatime() {
        return registerDatime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ms_message.REGISTER_DATIME
     *
     * @param registerDatime the value for ms_message.REGISTER_DATIME
     *
     * @mbg.generated Sat Mar 17 23:22:32 JST 2018
     */
    public void setRegisterDatime(Date registerDatime) {
        this.registerDatime = registerDatime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ms_message.UPDATE_ID
     *
     * @return the value of ms_message.UPDATE_ID
     *
     * @mbg.generated Sat Mar 17 23:22:32 JST 2018
     */
    public String getUpdateId() {
        return updateId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ms_message.UPDATE_ID
     *
     * @param updateId the value for ms_message.UPDATE_ID
     *
     * @mbg.generated Sat Mar 17 23:22:32 JST 2018
     */
    public void setUpdateId(String updateId) {
        this.updateId = updateId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ms_message.UPDATE_DATIME
     *
     * @return the value of ms_message.UPDATE_DATIME
     *
     * @mbg.generated Sat Mar 17 23:22:32 JST 2018
     */
    public Date getUpdateDatime() {
        return updateDatime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ms_message.UPDATE_DATIME
     *
     * @param updateDatime the value for ms_message.UPDATE_DATIME
     *
     * @mbg.generated Sat Mar 17 23:22:32 JST 2018
     */
    public void setUpdateDatime(Date updateDatime) {
        this.updateDatime = updateDatime;
    }
}