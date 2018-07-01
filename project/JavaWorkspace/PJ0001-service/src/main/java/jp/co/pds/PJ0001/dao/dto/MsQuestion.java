package jp.co.pds.PJ0001.dao.dto;

import java.util.Date;

public class MsQuestion {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ms_question.QUESTION_ID
     *
     * @mbg.generated Tue Mar 20 23:57:36 JST 2018
     */
    private Integer questionId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ms_question.QUESTION_TITLE
     *
     * @mbg.generated Tue Mar 20 23:57:36 JST 2018
     */
    private String questionTitle;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ms_question.QUESTION_SENTENCE
     *
     * @mbg.generated Tue Mar 20 23:57:36 JST 2018
     */
    private String questionSentence;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ms_question.ANSWER_SENTENCE_1
     *
     * @mbg.generated Tue Mar 20 23:57:36 JST 2018
     */
    private String answerSentence1;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ms_question.ANSWER_SENTENCE_2
     *
     * @mbg.generated Tue Mar 20 23:57:36 JST 2018
     */
    private String answerSentence2;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ms_question.ANSWER_SENTENCE_3
     *
     * @mbg.generated Tue Mar 20 23:57:36 JST 2018
     */
    private String answerSentence3;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ms_question.ANSWER_SENTENCE_4
     *
     * @mbg.generated Tue Mar 20 23:57:36 JST 2018
     */
    private String answerSentence4;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ms_question.CORRECT_NUMBER
     *
     * @mbg.generated Tue Mar 20 23:57:36 JST 2018
     */
    private Integer correctNumber;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ms_question.COMMENT
     *
     * @mbg.generated Tue Mar 20 23:57:36 JST 2018
     */
    private String comment;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ms_question.REGISTER_ID
     *
     * @mbg.generated Tue Mar 20 23:57:36 JST 2018
     */
    private String registerId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ms_question.REGISTER_DATIME
     *
     * @mbg.generated Tue Mar 20 23:57:36 JST 2018
     */
    private Date registerDatime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ms_question.UPDATE_ID
     *
     * @mbg.generated Tue Mar 20 23:57:36 JST 2018
     */
    private String updateId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ms_question.UPDATE_DATIME
     *
     * @mbg.generated Tue Mar 20 23:57:36 JST 2018
     */
    private Date updateDatime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ms_question.QUESTION_ID
     *
     * @return the value of ms_question.QUESTION_ID
     *
     * @mbg.generated Tue Mar 20 23:57:36 JST 2018
     */
    public Integer getQuestionId() {
        return questionId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ms_question.QUESTION_ID
     *
     * @param questionId the value for ms_question.QUESTION_ID
     *
     * @mbg.generated Tue Mar 20 23:57:36 JST 2018
     */
    public void setQuestionId(Integer questionId) {
        this.questionId = questionId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ms_question.QUESTION_TITLE
     *
     * @return the value of ms_question.QUESTION_TITLE
     *
     * @mbg.generated Tue Mar 20 23:57:36 JST 2018
     */
    public String getQuestionTitle() {
        return questionTitle;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ms_question.QUESTION_TITLE
     *
     * @param questionTitle the value for ms_question.QUESTION_TITLE
     *
     * @mbg.generated Tue Mar 20 23:57:36 JST 2018
     */
    public void setQuestionTitle(String questionTitle) {
        this.questionTitle = questionTitle;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ms_question.QUESTION_SENTENCE
     *
     * @return the value of ms_question.QUESTION_SENTENCE
     *
     * @mbg.generated Tue Mar 20 23:57:36 JST 2018
     */
    public String getQuestionSentence() {
        return questionSentence;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ms_question.QUESTION_SENTENCE
     *
     * @param questionSentence the value for ms_question.QUESTION_SENTENCE
     *
     * @mbg.generated Tue Mar 20 23:57:36 JST 2018
     */
    public void setQuestionSentence(String questionSentence) {
        this.questionSentence = questionSentence;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ms_question.ANSWER_SENTENCE_1
     *
     * @return the value of ms_question.ANSWER_SENTENCE_1
     *
     * @mbg.generated Tue Mar 20 23:57:36 JST 2018
     */
    public String getAnswerSentence1() {
        return answerSentence1;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ms_question.ANSWER_SENTENCE_1
     *
     * @param answerSentence1 the value for ms_question.ANSWER_SENTENCE_1
     *
     * @mbg.generated Tue Mar 20 23:57:36 JST 2018
     */
    public void setAnswerSentence1(String answerSentence1) {
        this.answerSentence1 = answerSentence1;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ms_question.ANSWER_SENTENCE_2
     *
     * @return the value of ms_question.ANSWER_SENTENCE_2
     *
     * @mbg.generated Tue Mar 20 23:57:36 JST 2018
     */
    public String getAnswerSentence2() {
        return answerSentence2;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ms_question.ANSWER_SENTENCE_2
     *
     * @param answerSentence2 the value for ms_question.ANSWER_SENTENCE_2
     *
     * @mbg.generated Tue Mar 20 23:57:36 JST 2018
     */
    public void setAnswerSentence2(String answerSentence2) {
        this.answerSentence2 = answerSentence2;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ms_question.ANSWER_SENTENCE_3
     *
     * @return the value of ms_question.ANSWER_SENTENCE_3
     *
     * @mbg.generated Tue Mar 20 23:57:36 JST 2018
     */
    public String getAnswerSentence3() {
        return answerSentence3;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ms_question.ANSWER_SENTENCE_3
     *
     * @param answerSentence3 the value for ms_question.ANSWER_SENTENCE_3
     *
     * @mbg.generated Tue Mar 20 23:57:36 JST 2018
     */
    public void setAnswerSentence3(String answerSentence3) {
        this.answerSentence3 = answerSentence3;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ms_question.ANSWER_SENTENCE_4
     *
     * @return the value of ms_question.ANSWER_SENTENCE_4
     *
     * @mbg.generated Tue Mar 20 23:57:36 JST 2018
     */
    public String getAnswerSentence4() {
        return answerSentence4;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ms_question.ANSWER_SENTENCE_4
     *
     * @param answerSentence4 the value for ms_question.ANSWER_SENTENCE_4
     *
     * @mbg.generated Tue Mar 20 23:57:36 JST 2018
     */
    public void setAnswerSentence4(String answerSentence4) {
        this.answerSentence4 = answerSentence4;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ms_question.CORRECT_NUMBER
     *
     * @return the value of ms_question.CORRECT_NUMBER
     *
     * @mbg.generated Tue Mar 20 23:57:36 JST 2018
     */
    public Integer getCorrectNumber() {
        return correctNumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ms_question.CORRECT_NUMBER
     *
     * @param correctNumber the value for ms_question.CORRECT_NUMBER
     *
     * @mbg.generated Tue Mar 20 23:57:36 JST 2018
     */
    public void setCorrectNumber(Integer correctNumber) {
        this.correctNumber = correctNumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ms_question.COMMENT
     *
     * @return the value of ms_question.COMMENT
     *
     * @mbg.generated Tue Mar 20 23:57:36 JST 2018
     */
    public String getComment() {
        return comment;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ms_question.COMMENT
     *
     * @param comment the value for ms_question.COMMENT
     *
     * @mbg.generated Tue Mar 20 23:57:36 JST 2018
     */
    public void setComment(String comment) {
        this.comment = comment;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ms_question.REGISTER_ID
     *
     * @return the value of ms_question.REGISTER_ID
     *
     * @mbg.generated Tue Mar 20 23:57:36 JST 2018
     */
    public String getRegisterId() {
        return registerId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ms_question.REGISTER_ID
     *
     * @param registerId the value for ms_question.REGISTER_ID
     *
     * @mbg.generated Tue Mar 20 23:57:36 JST 2018
     */
    public void setRegisterId(String registerId) {
        this.registerId = registerId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ms_question.REGISTER_DATIME
     *
     * @return the value of ms_question.REGISTER_DATIME
     *
     * @mbg.generated Tue Mar 20 23:57:36 JST 2018
     */
    public Date getRegisterDatime() {
        return registerDatime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ms_question.REGISTER_DATIME
     *
     * @param registerDatime the value for ms_question.REGISTER_DATIME
     *
     * @mbg.generated Tue Mar 20 23:57:36 JST 2018
     */
    public void setRegisterDatime(Date registerDatime) {
        this.registerDatime = registerDatime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ms_question.UPDATE_ID
     *
     * @return the value of ms_question.UPDATE_ID
     *
     * @mbg.generated Tue Mar 20 23:57:36 JST 2018
     */
    public String getUpdateId() {
        return updateId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ms_question.UPDATE_ID
     *
     * @param updateId the value for ms_question.UPDATE_ID
     *
     * @mbg.generated Tue Mar 20 23:57:36 JST 2018
     */
    public void setUpdateId(String updateId) {
        this.updateId = updateId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ms_question.UPDATE_DATIME
     *
     * @return the value of ms_question.UPDATE_DATIME
     *
     * @mbg.generated Tue Mar 20 23:57:36 JST 2018
     */
    public Date getUpdateDatime() {
        return updateDatime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ms_question.UPDATE_DATIME
     *
     * @param updateDatime the value for ms_question.UPDATE_DATIME
     *
     * @mbg.generated Tue Mar 20 23:57:36 JST 2018
     */
    public void setUpdateDatime(Date updateDatime) {
        this.updateDatime = updateDatime;
    }
}