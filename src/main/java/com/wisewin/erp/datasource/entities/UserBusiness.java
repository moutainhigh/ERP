package com.wisewin.erp.datasource.entities;

public class UserBusiness {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column jsh_userbusiness.Id
     *
     * @mbggenerated
     */
    private Long id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column jsh_userbusiness.Type
     *
     * @mbggenerated
     */
    private String type;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column jsh_userbusiness.KeyId
     *
     * @mbggenerated
     */
    private String keyid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column jsh_userbusiness.Value
     *
     * @mbggenerated
     */
    private String value;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column jsh_userbusiness.BtnStr
     *
     * @mbggenerated
     */
    private String btnstr;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column jsh_userbusiness.delete_Flag
     *
     * @mbggenerated
     */
    private String deleteFlag;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column jsh_userbusiness.Id
     *
     * @return the value of jsh_userbusiness.Id
     *
     * @mbggenerated
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column jsh_userbusiness.Id
     *
     * @param id the value for jsh_userbusiness.Id
     *
     * @mbggenerated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column jsh_userbusiness.Type
     *
     * @return the value of jsh_userbusiness.Type
     *
     * @mbggenerated
     */
    public String getType() {
        return type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column jsh_userbusiness.Type
     *
     * @param type the value for jsh_userbusiness.Type
     *
     * @mbggenerated
     */
    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column jsh_userbusiness.KeyId
     *
     * @return the value of jsh_userbusiness.KeyId
     *
     * @mbggenerated
     */
    public String getKeyid() {
        return keyid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column jsh_userbusiness.KeyId
     *
     * @param keyid the value for jsh_userbusiness.KeyId
     *
     * @mbggenerated
     */
    public void setKeyid(String keyid) {
        this.keyid = keyid == null ? null : keyid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column jsh_userbusiness.Value
     *
     * @return the value of jsh_userbusiness.Value
     *
     * @mbggenerated
     */
    public String getValue() {
        return value;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column jsh_userbusiness.Value
     *
     * @param value the value for jsh_userbusiness.Value
     *
     * @mbggenerated
     */
    public void setValue(String value) {
        this.value = value == null ? null : value.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column jsh_userbusiness.BtnStr
     *
     * @return the value of jsh_userbusiness.BtnStr
     *
     * @mbggenerated
     */
    public String getBtnstr() {
        return btnstr;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column jsh_userbusiness.BtnStr
     *
     * @param btnstr the value for jsh_userbusiness.BtnStr
     *
     * @mbggenerated
     */
    public void setBtnstr(String btnstr) {
        this.btnstr = btnstr == null ? null : btnstr.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column jsh_userbusiness.delete_Flag
     *
     * @return the value of jsh_userbusiness.delete_Flag
     *
     * @mbggenerated
     */
    public String getDeleteFlag() {
        return deleteFlag;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column jsh_userbusiness.delete_Flag
     *
     * @param deleteFlag the value for jsh_userbusiness.delete_Flag
     *
     * @mbggenerated
     */
    public void setDeleteFlag(String deleteFlag) {
        this.deleteFlag = deleteFlag == null ? null : deleteFlag.trim();
    }
}