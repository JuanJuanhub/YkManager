package com.issCollege.po;

import java.io.Serializable;

/**
 * staff
 * @author 
 */
public class Staff implements Serializable {
    /**
     * 员工id
     */
    private Long staffId;

    /**
     * 工号
     */
    private String jobNum;

    /**
     * 员工姓名
     */
    private String staffName;

    /**
     * 为相关人员分配权限
     */
    private String power;

    /**
     * 登录密码
     */
    private String password;

    private static final long serialVersionUID = 1L;

    public Long getStaffId() {
        return staffId;
    }

    public void setStaffId(Long staffId) {
        this.staffId = staffId;
    }

    public String getJobNum() {
        return jobNum;
    }

    public void setJobNum(String jobNum) {
        this.jobNum = jobNum;
    }

    public String getStaffName() {
        return staffName;
    }

    public void setStaffName(String staffName) {
        this.staffName = staffName;
    }

    public String getPower() {
        return power;
    }

    public void setPower(String power) {
        this.power = power;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}