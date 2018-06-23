package jp.co.pds.common.dao.mapper;

import java.util.List;
import jp.co.pds.common.dao.dto.MsMessage;
import jp.co.pds.common.dao.dto.MsMessageExample;
import jp.co.pds.common.dao.dto.MsMessageKey;
import org.apache.ibatis.annotations.Param;

public interface MsMessageMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ms_message
     *
     * @mbg.generated Sat Mar 17 23:22:32 JST 2018
     */
    long countByExample(MsMessageExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ms_message
     *
     * @mbg.generated Sat Mar 17 23:22:32 JST 2018
     */
    int deleteByExample(MsMessageExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ms_message
     *
     * @mbg.generated Sat Mar 17 23:22:32 JST 2018
     */
    int deleteByPrimaryKey(MsMessageKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ms_message
     *
     * @mbg.generated Sat Mar 17 23:22:32 JST 2018
     */
    int insert(MsMessage record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ms_message
     *
     * @mbg.generated Sat Mar 17 23:22:32 JST 2018
     */
    int insertSelective(MsMessage record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ms_message
     *
     * @mbg.generated Sat Mar 17 23:22:32 JST 2018
     */
    List<MsMessage> selectByExample(MsMessageExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ms_message
     *
     * @mbg.generated Sat Mar 17 23:22:32 JST 2018
     */
    MsMessage selectByPrimaryKey(MsMessageKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ms_message
     *
     * @mbg.generated Sat Mar 17 23:22:32 JST 2018
     */
    int updateByExampleSelective(@Param("record") MsMessage record, @Param("example") MsMessageExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ms_message
     *
     * @mbg.generated Sat Mar 17 23:22:32 JST 2018
     */
    int updateByExample(@Param("record") MsMessage record, @Param("example") MsMessageExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ms_message
     *
     * @mbg.generated Sat Mar 17 23:22:32 JST 2018
     */
    int updateByPrimaryKeySelective(MsMessage record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ms_message
     *
     * @mbg.generated Sat Mar 17 23:22:32 JST 2018
     */
    int updateByPrimaryKey(MsMessage record);
}