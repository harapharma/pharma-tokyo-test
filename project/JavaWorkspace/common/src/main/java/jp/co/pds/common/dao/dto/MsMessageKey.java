package jp.co.pds.common.dao.dto;

public class MsMessageKey {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ms_message.PROJECT_CD
     *
     * @mbg.generated Sat Mar 17 23:22:32 JST 2018
     */
    private String projectCd;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ms_message.MESSAGE_CD
     *
     * @mbg.generated Sat Mar 17 23:22:32 JST 2018
     */
    private String messageCd;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ms_message.LOCALE
     *
     * @mbg.generated Sat Mar 17 23:22:32 JST 2018
     */
    private String locale;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ms_message.PROJECT_CD
     *
     * @return the value of ms_message.PROJECT_CD
     *
     * @mbg.generated Sat Mar 17 23:22:32 JST 2018
     */
    public String getProjectCd() {
        return projectCd;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ms_message.PROJECT_CD
     *
     * @param projectCd the value for ms_message.PROJECT_CD
     *
     * @mbg.generated Sat Mar 17 23:22:32 JST 2018
     */
    public void setProjectCd(String projectCd) {
        this.projectCd = projectCd;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ms_message.MESSAGE_CD
     *
     * @return the value of ms_message.MESSAGE_CD
     *
     * @mbg.generated Sat Mar 17 23:22:32 JST 2018
     */
    public String getMessageCd() {
        return messageCd;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ms_message.MESSAGE_CD
     *
     * @param messageCd the value for ms_message.MESSAGE_CD
     *
     * @mbg.generated Sat Mar 17 23:22:32 JST 2018
     */
    public void setMessageCd(String messageCd) {
        this.messageCd = messageCd;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ms_message.LOCALE
     *
     * @return the value of ms_message.LOCALE
     *
     * @mbg.generated Sat Mar 17 23:22:32 JST 2018
     */
    public String getLocale() {
        return locale;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ms_message.LOCALE
     *
     * @param locale the value for ms_message.LOCALE
     *
     * @mbg.generated Sat Mar 17 23:22:32 JST 2018
     */
    public void setLocale(String locale) {
        this.locale = locale;
    }
}