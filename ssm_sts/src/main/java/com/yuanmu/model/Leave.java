package com.yuanmu.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class Leave {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column leave.id
     *
     * @mbggenerated Thu Mar 19 00:33:58 CST 2020
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column leave.title
     *
     * @mbggenerated Thu Mar 19 00:33:58 CST 2020
     */
    private String title;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column leave.content
     *
     * @mbggenerated Thu Mar 19 00:33:58 CST 2020
     */
    private String content;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column leave.days
     *
     * @mbggenerated Thu Mar 19 00:33:58 CST 2020
     */
    private Double days;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column leave.leavetime
     *
     * @mbggenerated Thu Mar 19 00:33:58 CST 2020
     */
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd",timezone = "GMT+8")
    private Date leavetime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column leave.state
     *
     * @mbggenerated Thu Mar 19 00:33:58 CST 2020
     */
    private String state; //0:未提交 1：审批中 2：审批完成 3：已放弃

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column leave.userid
     *
     * @mbggenerated Thu Mar 19 00:33:58 CST 2020
     */
    private Integer userid;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column leave.id
     *
     * @return the value of leave.id
     *
     * @mbggenerated Thu Mar 19 00:33:58 CST 2020
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column leave.id
     *
     * @param id the value for leave.id
     *
     * @mbggenerated Thu Mar 19 00:33:58 CST 2020
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column leave.title
     *
     * @return the value of leave.title
     *
     * @mbggenerated Thu Mar 19 00:33:58 CST 2020
     */
    public String getTitle() {
        return title;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column leave.title
     *
     * @param title the value for leave.title
     *
     * @mbggenerated Thu Mar 19 00:33:58 CST 2020
     */
    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column leave.content
     *
     * @return the value of leave.content
     *
     * @mbggenerated Thu Mar 19 00:33:58 CST 2020
     */
    public String getContent() {
        return content;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column leave.content
     *
     * @param content the value for leave.content
     *
     * @mbggenerated Thu Mar 19 00:33:58 CST 2020
     */
    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column leave.days
     *
     * @return the value of leave.days
     *
     * @mbggenerated Thu Mar 19 00:33:58 CST 2020
     */
    public Double getDays() {
        return days;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column leave.days
     *
     * @param days the value for leave.days
     *
     * @mbggenerated Thu Mar 19 00:33:58 CST 2020
     */
    public void setDays(Double days) {
        this.days = days;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column leave.leavetime
     *
     * @return the value of leave.leavetime
     *
     * @mbggenerated Thu Mar 19 00:33:58 CST 2020
     */
    public Date getLeavetime() {
        return leavetime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column leave.leavetime
     *
     * @param leavetime the value for leave.leavetime
     *
     * @mbggenerated Thu Mar 19 00:33:58 CST 2020
     */
    public void setLeavetime(Date leavetime) {
        this.leavetime = leavetime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column leave.state
     *
     * @return the value of leave.state
     *
     * @mbggenerated Thu Mar 19 00:33:58 CST 2020
     */
    public String getState() {
        return state;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column leave.state
     *
     * @param state the value for leave.state
     *
     * @mbggenerated Thu Mar 19 00:33:58 CST 2020
     */
    public void setState(String state) {
        this.state = state == null ? null : state.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column leave.userid
     *
     * @return the value of leave.userid
     *
     * @mbggenerated Thu Mar 19 00:33:58 CST 2020
     */
    public Integer getUserid() {
        return userid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column leave.userid
     *
     * @param userid the value for leave.userid
     *
     * @mbggenerated Thu Mar 19 00:33:58 CST 2020
     */
    public void setUserid(Integer userid) {
        this.userid = userid;
    }
}