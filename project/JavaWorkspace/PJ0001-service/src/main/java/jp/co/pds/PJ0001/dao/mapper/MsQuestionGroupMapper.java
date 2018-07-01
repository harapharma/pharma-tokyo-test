package jp.co.pds.PJ0001.dao.mapper;

import java.util.List;
import jp.co.pds.PJ0001.dao.dto.MsQuestionGroup;
import jp.co.pds.PJ0001.dao.dto.MsQuestionGroupExample;
import org.apache.ibatis.annotations.Param;

public interface MsQuestionGroupMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ms_question_group
     *
     * @mbg.generated Sat Mar 17 23:13:23 JST 2018
     */
    long countByExample(MsQuestionGroupExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ms_question_group
     *
     * @mbg.generated Sat Mar 17 23:13:23 JST 2018
     */
    int deleteByExample(MsQuestionGroupExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ms_question_group
     *
     * @mbg.generated Sat Mar 17 23:13:23 JST 2018
     */
    int deleteByPrimaryKey(Integer questionGroupId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ms_question_group
     *
     * @mbg.generated Sat Mar 17 23:13:23 JST 2018
     */
    int insert(MsQuestionGroup record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ms_question_group
     *
     * @mbg.generated Sat Mar 17 23:13:23 JST 2018
     */
    int insertSelective(MsQuestionGroup record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ms_question_group
     *
     * @mbg.generated Sat Mar 17 23:13:23 JST 2018
     */
    List<MsQuestionGroup> selectByExample(MsQuestionGroupExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ms_question_group
     *
     * @mbg.generated Sat Mar 17 23:13:23 JST 2018
     */
    MsQuestionGroup selectByPrimaryKey(Integer questionGroupId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ms_question_group
     *
     * @mbg.generated Sat Mar 17 23:13:23 JST 2018
     */
    int updateByExampleSelective(@Param("record") MsQuestionGroup record, @Param("example") MsQuestionGroupExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ms_question_group
     *
     * @mbg.generated Sat Mar 17 23:13:23 JST 2018
     */
    int updateByExample(@Param("record") MsQuestionGroup record, @Param("example") MsQuestionGroupExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ms_question_group
     *
     * @mbg.generated Sat Mar 17 23:13:23 JST 2018
     */
    int updateByPrimaryKeySelective(MsQuestionGroup record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ms_question_group
     *
     * @mbg.generated Sat Mar 17 23:13:23 JST 2018
     */
    int updateByPrimaryKey(MsQuestionGroup record);
}