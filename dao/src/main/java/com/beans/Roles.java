package com.beans;

import java.util.Date;

public class Roles {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column _roles._id
     *
     * @mbg.generated
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column _roles._roleName
     *
     * @mbg.generated
     */
    private String rolename;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column _roles._roleDescription
     *
     * @mbg.generated
     */
    private String roledescription;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column _roles._updateTime
     *
     * @mbg.generated
     */
    private Date updatetime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column _roles._status
     *
     * @mbg.generated
     */
    private Integer status;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column _roles._createTime
     *
     * @mbg.generated
     */
    private Date createtime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column _roles._optUserId
     *
     * @mbg.generated
     */
    private String optuserid;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column _roles._id
     *
     * @return the value of _roles._id
     *
     * @mbg.generated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column _roles._id
     *
     * @param id the value for _roles._id
     *
     * @mbg.generated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column _roles._roleName
     *
     * @return the value of _roles._roleName
     *
     * @mbg.generated
     */
    public String getRolename() {
        return rolename;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column _roles._roleName
     *
     * @param rolename the value for _roles._roleName
     *
     * @mbg.generated
     */
    public void setRolename(String rolename) {
        this.rolename = rolename == null ? null : rolename.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column _roles._roleDescription
     *
     * @return the value of _roles._roleDescription
     *
     * @mbg.generated
     */
    public String getRoledescription() {
        return roledescription;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column _roles._roleDescription
     *
     * @param roledescription the value for _roles._roleDescription
     *
     * @mbg.generated
     */
    public void setRoledescription(String roledescription) {
        this.roledescription = roledescription == null ? null : roledescription.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column _roles._updateTime
     *
     * @return the value of _roles._updateTime
     *
     * @mbg.generated
     */
    public Date getUpdatetime() {
        return updatetime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column _roles._updateTime
     *
     * @param updatetime the value for _roles._updateTime
     *
     * @mbg.generated
     */
    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column _roles._status
     *
     * @return the value of _roles._status
     *
     * @mbg.generated
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column _roles._status
     *
     * @param status the value for _roles._status
     *
     * @mbg.generated
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column _roles._createTime
     *
     * @return the value of _roles._createTime
     *
     * @mbg.generated
     */
    public Date getCreatetime() {
        return createtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column _roles._createTime
     *
     * @param createtime the value for _roles._createTime
     *
     * @mbg.generated
     */
    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column _roles._optUserId
     *
     * @return the value of _roles._optUserId
     *
     * @mbg.generated
     */
    public String getOptuserid() {
        return optuserid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column _roles._optUserId
     *
     * @param optuserid the value for _roles._optUserId
     *
     * @mbg.generated
     */
    public void setOptuserid(String optuserid) {
        this.optuserid = optuserid == null ? null : optuserid.trim();
    }
}