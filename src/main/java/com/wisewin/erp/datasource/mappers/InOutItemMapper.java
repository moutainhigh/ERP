package com.wisewin.erp.datasource.mappers;

import com.wisewin.erp.datasource.entities.InOutItem;
import com.wisewin.erp.datasource.entities.InOutItemExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface InOutItemMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jsh_inoutitem
     *
     * @mbggenerated
     */
    int countByExample(InOutItemExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jsh_inoutitem
     *
     * @mbggenerated
     */
    int deleteByExample(InOutItemExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jsh_inoutitem
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jsh_inoutitem
     *
     * @mbggenerated
     */
    int insert(InOutItem record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jsh_inoutitem
     *
     * @mbggenerated
     */
    int insertSelective(InOutItem record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jsh_inoutitem
     *
     * @mbggenerated
     */
    List<InOutItem> selectByExample(InOutItemExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jsh_inoutitem
     *
     * @mbggenerated
     */
    InOutItem selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jsh_inoutitem
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") InOutItem record, @Param("example") InOutItemExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jsh_inoutitem
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") InOutItem record, @Param("example") InOutItemExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jsh_inoutitem
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(InOutItem record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jsh_inoutitem
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(InOutItem record);
}