package jp.co.pds.PJ0001.dao.mapper;

import java.util.List;
import jp.co.pds.PJ0001.dao.dto.MsGroupQuestionGroup;
import jp.co.pds.PJ0001.dao.dto.MsGroupQuestionGroupExample;
import jp.co.pds.PJ0001.dao.dto.MsGroupQuestionGroupKey;
import org.apache.ibatis.annotations.Param;

public interface MsGroupQuestionGroupMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ms_group_question_group
     *
     * @mbg.generated Mon Mar 19 19:21:33 JST 2018
     */
    long countByExample(MsGroupQuestionGroupExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ms_group_question_group
     *
     * @mbg.generated Mon Mar 19 19:21:33 JST 2018
     */
    int deleteByExample(MsGroupQuestionGroupExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ms_group_question_group
     *
     * @mbg.generated Mon Mar 19 19:21:33 JST 2018
     */
    int deleteByPrimaryKey(MsGroupQuestionGroupKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ms_group_question_group
     *
     * @mbg.generated Mon Mar 19 19:21:33 JST 2018
     */
    int insert(MsGroupQuestionGroup record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ms_group_question_group
     *
     * @mbg.generated Mon Mar 19 19:21:33 JST 2018
     */
    int insertSelective(MsGroupQuestionGroup record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ms_group_question_group
     *
     * @mbg.generated Mon Mar 19 19:21:33 JST 2018
     */
    List<MsGroupQuestionGroup> selectByExample(MsGroupQuestionGroupExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ms_group_question_group
     *
     * @mbg.generated Mon Mar 19 19:21:33 JST 2018
     */
    MsGroupQuestionGroup selectByPrimaryKey(MsGroupQuestionGroupKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ms_group_question_group
     *
     * @mbg.generated Mon Mar 19 19:21:33 JST 2018
     */
    int updateByExampleSelective(@Param("record") MsGroupQuestionGroup record, @Param("example") MsGroupQuestionGroupExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ms_group_question_group
     *
     * @mbg.generated Mon Mar 19 19:21:33 JST 2018
     */
    int updateByExample(@Param("record") MsGroupQuestionGroup record, @Param("example") MsGroupQuestionGroupExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ms_group_question_group
     *
     * @mbg.generated Mon Mar 19 19:21:33 JST 2018
     */
    int updateByPrimaryKeySelective(MsGroupQuestionGroup record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ms_group_question_group
     *
     * @mbg.generated Mon Mar 19 19:21:33 JST 2018
     */
    int updateByPrimaryKey(MsGroupQuestionGroup record);
}