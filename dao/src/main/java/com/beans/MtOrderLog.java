package com.beans;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class MtOrderLog {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column mt_order_log.id
     *
     * @mbg.generated
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column mt_order_log.jjy_bill_id
     *
     * @mbg.generated
     */
    private String jjyBillId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column mt_order_log.order_id
     *
     * @mbg.generated
     */
    private String orderId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column mt_order_log.type
     *
     * @mbg.generated
     */
    private Integer type;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column mt_order_log.create_time
     *
     * @mbg.generated
     */
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date createTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column mt_order_log.msg
     *
     * @mbg.generated
     */
    private String msg;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column mt_order_log.id
     *
     * @return the value of mt_order_log.id
     *
     * @mbg.generated
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column mt_order_log.id
     *
     * @param id the value for mt_order_log.id
     *
     * @mbg.generated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column mt_order_log.jjy_bill_id
     *
     * @return the value of mt_order_log.jjy_bill_id
     *
     * @mbg.generated
     */
    public String getJjyBillId() {
        return jjyBillId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column mt_order_log.jjy_bill_id
     *
     * @param jjyBillId the value for mt_order_log.jjy_bill_id
     *
     * @mbg.generated
     */
    public void setJjyBillId(String jjyBillId) {
        this.jjyBillId = jjyBillId == null ? null : jjyBillId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column mt_order_log.order_id
     *
     * @return the value of mt_order_log.order_id
     *
     * @mbg.generated
     */
    public String getOrderId() {
        return orderId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column mt_order_log.order_id
     *
     * @param orderId the value for mt_order_log.order_id
     *
     * @mbg.generated
     */
    public void setOrderId(String orderId) {
        this.orderId = orderId == null ? null : orderId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column mt_order_log.type
     *
     * @return the value of mt_order_log.type
     *
     * @mbg.generated
     */
    public Integer getType() {
        return type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column mt_order_log.type
     *
     * @param type the value for mt_order_log.type
     *
     * @mbg.generated
     */
    public void setType(Integer type) {
        this.type = type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column mt_order_log.create_time
     *
     * @return the value of mt_order_log.create_time
     *
     * @mbg.generated
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column mt_order_log.create_time
     *
     * @param createTime the value for mt_order_log.create_time
     *
     * @mbg.generated
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column mt_order_log.msg
     *
     * @return the value of mt_order_log.msg
     *
     * @mbg.generated
     */
    public String getMsg() {
        return msg;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column mt_order_log.msg
     *
     * @param msg the value for mt_order_log.msg
     *
     * @mbg.generated
     */
    public void setMsg(String msg) {
        this.msg = msg == null ? null : msg.trim();
    }
}