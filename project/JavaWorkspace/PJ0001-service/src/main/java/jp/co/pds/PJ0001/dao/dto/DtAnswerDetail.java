package jp.co.pds.PJ0001.dao.dto;

import java.util.Date;

public class DtAnswerDetail extends DtAnswerDetailKey {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dt_answer_detail.SELECTION
     *
     * @mbg.generated Sat Mar 24 16:57:26 JST 2018
     */
    private Integer selection;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dt_answer_detail.CORRECT
     *
     * @mbg.generated Sat Mar 24 16:57:26 JST 2018
     */
    private String correct;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dt_answer_detail.REGISTER_ID
     *
     * @mbg.generated Sat Mar 24 16:57:26 JST 2018
     */
    private String registerId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dt_answer_detail.REGISTER_DATIME
     *
     * @mbg.generated Sat Mar 24 16:57:26 JST 2018
     */
    private Date registerDatime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dt_answer_detail.UPDATE_ID
     *
     * @mbg.generated Sat Mar 24 16:57:26 JST 2018
     */
    private String updateId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dt_answer_detail.UPDATE_DATIME
     *
     * @mbg.generated Sat Mar 24 16:57:26 JST 2018
     */
    private Date updateDatime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dt_answer_detail.SELECTION
     *
     * @return the value of dt_answer_detail.SELECTION
     *
     * @mbg.generated Sat Mar 24 16:57:26 JST 2018
     */
    public Integer getSelection() {
        return selection;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dt_answer_detail.SELECTION
     *
     * @param selection the value for dt_answer_detail.SELECTION
     *
     * @mbg.generated Sat Mar 24 16:57:26 JST 2018
     */
    public void setSelection(Integer selection) {
        this.selection = selection;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dt_answer_detail.CORRECT
     *
     * @return the value of dt_answer_detail.CORRECT
     *
     * @mbg.generated Sat Mar 24 16:57:26 JST 2018
     */
    public String getCorrect() {
        return correct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dt_answer_detail.CORRECT
     *
     * @param correct the value for dt_answer_detail.CORRECT
     *
     * @mbg.generated Sat Mar 24 16:57:26 JST 2018
     */
    public void setCorrect(String correct) {
        this.correct = correct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dt_answer_detail.REGISTER_ID
     *
     * @return the value of dt_answer_detail.REGISTER_ID
     *
     * @mbg.generated Sat Mar 24 16:57:26 JST 2018
     */
    public String getRegisterId() {
        return registerId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dt_answer_detail.REGISTER_ID
     *
     * @param registerId the value for dt_answer_detail.REGISTER_ID
     *
     * @mbg.generated Sat Mar 24 16:57:26 JST 2018
     */
    public void setRegisterId(String registerId) {
        this.registerId = registerId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dt_answer_detail.REGISTER_DATIME
     *
     * @return the value of dt_answer_detail.REGISTER_DATIME
     *
     * @mbg.generated Sat Mar 24 16:57:26 JST 2018
     */
    public Date getRegisterDatime() {
        return registerDatime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dt_answer_detail.REGISTER_DATIME
     *
     * @param registerDatime the value for dt_answer_detail.REGISTER_DATIME
     *
     * @mbg.generated Sat Mar 24 16:57:26 JST 2018
     */
    public void setRegisterDatime(Date registerDatime) {
        this.registerDatime = registerDatime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dt_answer_detail.UPDATE_ID
     *
     * @return the value of dt_answer_detail.UPDATE_ID
     *
     * @mbg.generated Sat Mar 24 16:57:26 JST 2018
     */
    public String getUpdateId() {
        return updateId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dt_answer_detail.UPDATE_ID
     *
     * @param updateId the value for dt_answer_detail.UPDATE_ID
     *
     * @mbg.generated Sat Mar 24 16:57:26 JST 2018
     */
    public void setUpdateId(String updateId) {
        this.updateId = updateId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dt_answer_detail.UPDATE_DATIME
     *
     * @return the value of dt_answer_detail.UPDATE_DATIME
     *
     * @mbg.generated Sat Mar 24 16:57:26 JST 2018
     */
    public Date getUpdateDatime() {
        return updateDatime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dt_answer_detail.UPDATE_DATIME
     *
     * @param updateDatime the value for dt_answer_detail.UPDATE_DATIME
     *
     * @mbg.generated Sat Mar 24 16:57:26 JST 2018
     */
    public void setUpdateDatime(Date updateDatime) {
        this.updateDatime = updateDatime;
    }
}