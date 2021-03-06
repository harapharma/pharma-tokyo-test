package jp.co.pds.PJ0002.dao.mapper;

import java.util.List;
import jp.co.pds.PJ0002.dao.dto.DtWorkTime;
import jp.co.pds.PJ0002.dao.dto.DtWorkTimeExample;
import jp.co.pds.PJ0002.dao.dto.DtWorkTimeKey;
import org.apache.ibatis.annotations.Param;

public interface DtWorkTimeMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dt_work_time
     *
     * @mbg.generated Fri Apr 13 23:34:32 JST 2018
     */
    long countByExample(DtWorkTimeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dt_work_time
     *
     * @mbg.generated Fri Apr 13 23:34:32 JST 2018
     */
    int deleteByExample(DtWorkTimeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dt_work_time
     *
     * @mbg.generated Fri Apr 13 23:34:32 JST 2018
     */
    int deleteByPrimaryKey(DtWorkTimeKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dt_work_time
     *
     * @mbg.generated Fri Apr 13 23:34:32 JST 2018
     */
    int insert(DtWorkTime record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dt_work_time
     *
     * @mbg.generated Fri Apr 13 23:34:32 JST 2018
     */
    int insertSelective(DtWorkTime record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dt_work_time
     *
     * @mbg.generated Fri Apr 13 23:34:32 JST 2018
     */
    List<DtWorkTime> selectByExample(DtWorkTimeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dt_work_time
     *
     * @mbg.generated Fri Apr 13 23:34:32 JST 2018
     */
    DtWorkTime selectByPrimaryKey(DtWorkTimeKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dt_work_time
     *
     * @mbg.generated Fri Apr 13 23:34:32 JST 2018
     */
    int updateByExampleSelective(@Param("record") DtWorkTime record, @Param("example") DtWorkTimeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dt_work_time
     *
     * @mbg.generated Fri Apr 13 23:34:32 JST 2018
     */
    int updateByExample(@Param("record") DtWorkTime record, @Param("example") DtWorkTimeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dt_work_time
     *
     * @mbg.generated Fri Apr 13 23:34:32 JST 2018
     */
    int updateByPrimaryKeySelective(DtWorkTime record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dt_work_time
     *
     * @mbg.generated Fri Apr 13 23:34:32 JST 2018
     */
    int updateByPrimaryKey(DtWorkTime record);
}