package jp.co.pds.common.dao.dto;

public class DtPswdHistoryKey {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dt_pswd_history.USER_ID
     *
     * @mbg.generated Sat Mar 17 22:24:13 JST 2018
     */
    private String userId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dt_pswd_history.SEQ
     *
     * @mbg.generated Sat Mar 17 22:24:13 JST 2018
     */
    private Integer seq;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dt_pswd_history.USER_ID
     *
     * @return the value of dt_pswd_history.USER_ID
     *
     * @mbg.generated Sat Mar 17 22:24:13 JST 2018
     */
    public String getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dt_pswd_history.USER_ID
     *
     * @param userId the value for dt_pswd_history.USER_ID
     *
     * @mbg.generated Sat Mar 17 22:24:13 JST 2018
     */
    public void setUserId(String userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dt_pswd_history.SEQ
     *
     * @return the value of dt_pswd_history.SEQ
     *
     * @mbg.generated Sat Mar 17 22:24:13 JST 2018
     */
    public Integer getSeq() {
        return seq;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dt_pswd_history.SEQ
     *
     * @param seq the value for dt_pswd_history.SEQ
     *
     * @mbg.generated Sat Mar 17 22:24:13 JST 2018
     */
    public void setSeq(Integer seq) {
        this.seq = seq;
    }
}