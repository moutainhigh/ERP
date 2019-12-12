package com.wisewin.erp.datasource.mappers;

import com.wisewin.erp.datasource.entities.SystemConfig;
import com.wisewin.erp.datasource.entities.SystemConfigExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SystemConfigMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jsh_systemconfig
     *
     * @mbggenerated
     */
    int countByExample(SystemConfigExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jsh_systemconfig
     *
     * @mbggenerated
     */
    int deleteByExample(SystemConfigExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jsh_systemconfig
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jsh_systemconfig
     *
     * @mbggenerated
     */
    int insert(SystemConfig record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jsh_systemconfig
     *
     * @mbggenerated
     */
    int insertSelective(SystemConfig record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jsh_systemconfig
     *
     * @mbggenerated
     */
    List<SystemConfig> selectByExample(SystemConfigExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jsh_systemconfig
     *
     * @mbggenerated
     */
    SystemConfig selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jsh_systemconfig
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") SystemConfig record, @Param("example") SystemConfigExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jsh_systemconfig
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") SystemConfig record, @Param("example") SystemConfigExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jsh_systemconfig
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(SystemConfig record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jsh_systemconfig
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(SystemConfig record);
}