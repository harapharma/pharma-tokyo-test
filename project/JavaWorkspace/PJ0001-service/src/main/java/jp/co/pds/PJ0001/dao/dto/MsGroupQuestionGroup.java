package jp.co.pds.PJ0001.dao.dto;

import java.util.Date;

public class MsGroupQuestionGroup extends MsGroupQuestionGroupKey {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ms_group_question_group.QUESTION_CNT
     *
     * @mbg.generated Mon Mar 19 19:21:33 JST 2018
     */
    private Integer questionCnt;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ms_group_question_group.NEED_CORRECT_CNT
     *
     * @mbg.generated Mon Mar 19 19:21:33 JST 2018
     */
    private Integer needCorrectCnt;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ms_group_question_group.REGISTER_ID
     *
     * @mbg.generated Mon Mar 19 19:21:33 JST 2018
     */
    private String registerId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ms_group_question_group.REGISTER_DATIME
     *
     * @mbg.generated Mon Mar 19 19:21:33 JST 2018
     */
    private Date registerDatime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ms_group_question_group.UPDATE_ID
     *
     * @mbg.generated Mon Mar 19 19:21:33 JST 2018
     */
    private String updateId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ms_group_question_group.UPDATE_DATIME
     *
     * @mbg.generated Mon Mar 19 19:21:33 JST 2018
     */
    private Date updateDatime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ms_group_question_group.QUESTION_CNT
     *
     * @return the value of ms_group_question_group.QUESTION_CNT
     *
     * @mbg.generated Mon Mar 19 19:21:33 JST 2018
     */
    public Integer getQuestionCnt() {
        return questionCnt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ms_group_question_group.QUESTION_CNT
     *
     * @param questionCnt the value for ms_group_question_group.QUESTION_CNT
     *
     * @mbg.generated Mon Mar 19 19:21:33 JST 2018
     */
    public void setQuestionCnt(Integer questionCnt) {
        this.questionCnt = questionCnt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ms_group_question_group.NEED_CORRECT_CNT
     *
     * @return the value of ms_group_question_group.NEED_CORRECT_CNT
     *
     * @mbg.generated Mon Mar 19 19:21:33 JST 2018
     */
    public Integer getNeedCorrectCnt() {
        return needCorrectCnt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ms_group_question_group.NEED_CORRECT_CNT
     *
     * @param needCorrectCnt the value for ms_group_question_group.NEED_CORRECT_CNT
     *
     * @mbg.generated Mon Mar 19 19:21:33 JST 2018
     */
    public void setNeedCorrectCnt(Integer needCorrectCnt) {
        this.needCorrectCnt = needCorrectCnt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ms_group_question_group.REGISTER_ID
     *
     * @return the value of ms_group_question_group.REGISTER_ID
     *
     * @mbg.generated Mon Mar 19 19:21:33 JST 2018
     */
    public String getRegisterId() {
        return registerId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ms_group_question_group.REGISTER_ID
     *
     * @param registerId the value for ms_group_question_group.REGISTER_ID
     *
     * @mbg.generated Mon Mar 19 19:21:33 JST 2018
     */
    public void setRegisterId(String registerId) {
        this.registerId = registerId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ms_group_question_group.REGISTER_DATIME
     *
     * @return the value of ms_group_question_group.REGISTER_DATIME
     *
     * @mbg.generated Mon Mar 19 19:21:33 JST 2018
     */
    public Date getRegisterDatime() {
        return registerDatime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ms_group_question_group.REGISTER_DATIME
     *
     * @param registerDatime the value for ms_group_question_group.REGISTER_DATIME
     *
     * @mbg.generated Mon Mar 19 19:21:33 JST 2018
     */
    public void setRegisterDatime(Date registerDatime) {
        this.registerDatime = registerDatime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ms_group_question_group.UPDATE_ID
     *
     * @return the value of ms_group_question_group.UPDATE_ID
     *
     * @mbg.generated Mon Mar 19 19:21:33 JST 2018
     */
    public String getUpdateId() {
        return updateId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ms_group_question_group.UPDATE_ID
     *
     * @param updateId the value for ms_group_question_group.UPDATE_ID
     *
     * @mbg.generated Mon Mar 19 19:21:33 JST 2018
     */
    public void setUpdateId(String updateId) {
        this.updateId = updateId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ms_group_question_group.UPDATE_DATIME
     *
     * @return the value of ms_group_question_group.UPDATE_DATIME
     *
     * @mbg.generated Mon Mar 19 19:21:33 JST 2018
     */
    public Date getUpdateDatime() {
        return updateDatime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ms_group_question_group.UPDATE_DATIME
     *
     * @param updateDatime the value for ms_group_question_group.UPDATE_DATIME
     *
     * @mbg.generated Mon Mar 19 19:21:33 JST 2018
     */
    public void setUpdateDatime(Date updateDatime) {
        this.updateDatime = updateDatime;
    }
}