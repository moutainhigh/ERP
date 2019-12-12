package com.wisewin.erp.datasource.entities;

import java.util.Date;

public class Tenant {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column jsh_tenant.id
     *
     * @mbggenerated
     */
    private Long id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column jsh_tenant.tenant_id
     *
     * @mbggenerated
     */
    private Long tenantId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column jsh_tenant.login_name
     *
     * @mbggenerated
     */
    private String loginName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column jsh_tenant.user_num_limit
     *
     * @mbggenerated
     */
    private Integer userNumLimit;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column jsh_tenant.bills_num_limit
     *
     * @mbggenerated
     */
    private Integer billsNumLimit;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column jsh_tenant.create_time
     *
     * @mbggenerated
     */
    private Date createTime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column jsh_tenant.id
     *
     * @return the value of jsh_tenant.id
     *
     * @mbggenerated
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column jsh_tenant.id
     *
     * @param id the value for jsh_tenant.id
     *
     * @mbggenerated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column jsh_tenant.tenant_id
     *
     * @return the value of jsh_tenant.tenant_id
     *
     * @mbggenerated
     */
    public Long getTenantId() {
        return tenantId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column jsh_tenant.tenant_id
     *
     * @param tenantId the value for jsh_tenant.tenant_id
     *
     * @mbggenerated
     */
    public void setTenantId(Long tenantId) {
        this.tenantId = tenantId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column jsh_tenant.login_name
     *
     * @return the value of jsh_tenant.login_name
     *
     * @mbggenerated
     */
    public String getLoginName() {
        return loginName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column jsh_tenant.login_name
     *
     * @param loginName the value for jsh_tenant.login_name
     *
     * @mbggenerated
     */
    public void setLoginName(String loginName) {
        this.loginName = loginName == null ? null : loginName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column jsh_tenant.user_num_limit
     *
     * @return the value of jsh_tenant.user_num_limit
     *
     * @mbggenerated
     */
    public Integer getUserNumLimit() {
        return userNumLimit;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column jsh_tenant.user_num_limit
     *
     * @param userNumLimit the value for jsh_tenant.user_num_limit
     *
     * @mbggenerated
     */
    public void setUserNumLimit(Integer userNumLimit) {
        this.userNumLimit = userNumLimit;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column jsh_tenant.bills_num_limit
     *
     * @return the value of jsh_tenant.bills_num_limit
     *
     * @mbggenerated
     */
    public Integer getBillsNumLimit() {
        return billsNumLimit;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column jsh_tenant.bills_num_limit
     *
     * @param billsNumLimit the value for jsh_tenant.bills_num_limit
     *
     * @mbggenerated
     */
    public void setBillsNumLimit(Integer billsNumLimit) {
        this.billsNumLimit = billsNumLimit;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column jsh_tenant.create_time
     *
     * @return the value of jsh_tenant.create_time
     *
     * @mbggenerated
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column jsh_tenant.create_time
     *
     * @param createTime the value for jsh_tenant.create_time
     *
     * @mbggenerated
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}