package jp.co.pds.PJ0002.dao.mapper;

import java.util.List;
import jp.co.pds.PJ0002.dao.dto.MsGroupRestTime;
import jp.co.pds.PJ0002.dao.dto.MsGroupRestTimeExample;
import jp.co.pds.PJ0002.dao.dto.MsGroupRestTimeKey;
import org.apache.ibatis.annotations.Param;

public interface MsGroupRestTimeMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ms_group_rest_time
     *
     * @mbg.generated Sun Apr 08 08:38:07 JST 2018
     */
    long countByExample(MsGroupRestTimeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ms_group_rest_time
     *
     * @mbg.generated Sun Apr 08 08:38:07 JST 2018
     */
    int deleteByExample(MsGroupRestTimeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ms_group_rest_time
     *
     * @mbg.generated Sun Apr 08 08:38:07 JST 2018
     */
    int deleteByPrimaryKey(MsGroupRestTimeKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ms_group_rest_time
     *
     * @mbg.generated Sun Apr 08 08:38:07 JST 2018
     */
    int insert(MsGroupRestTime record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ms_group_rest_time
     *
     * @mbg.generated Sun Apr 08 08:38:07 JST 2018
     */
    int insertSelective(MsGroupRestTime record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ms_group_rest_time
     *
     * @mbg.generated Sun Apr 08 08:38:07 JST 2018
     */
    List<MsGroupRestTime> selectByExample(MsGroupRestTimeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ms_group_rest_time
     *
     * @mbg.generated Sun Apr 08 08:38:07 JST 2018
     */
    MsGroupRestTime selectByPrimaryKey(MsGroupRestTimeKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ms_group_rest_time
     *
     * @mbg.generated Sun Apr 08 08:38:07 JST 2018
     */
    int updateByExampleSelective(@Param("record") MsGroupRestTime record, @Param("example") MsGroupRestTimeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ms_group_rest_time
     *
     * @mbg.generated Sun Apr 08 08:38:07 JST 2018
     */
    int updateByExample(@Param("record") MsGroupRestTime record, @Param("example") MsGroupRestTimeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ms_group_rest_time
     *
     * @mbg.generated Sun Apr 08 08:38:07 JST 2018
     */
    int updateByPrimaryKeySelective(MsGroupRestTime record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ms_group_rest_time
     *
     * @mbg.generated Sun Apr 08 08:38:07 JST 2018
     */
    int updateByPrimaryKey(MsGroupRestTime record);
}