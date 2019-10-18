package com.issCollege.po;

import java.io.Serializable;
import java.util.Date;

/**
 * user
 * @author 
 */
public class User implements Serializable {
    /**
     * 用户的编号
     */
    private Long userId;

    /**
     * 用户类型
     */
    private String userType;

    /**
     * 用户名称
     */
    private String userName;

    /**
     * 身份证号
     */
    private String idNumber;

    /**
     * 纳税人识别号
     */
    private String taxpayerId;

    /**
     * 地址
     */
    private String address;

    /**
     * 密码
     */
    private String password;

    /**
     * 联系电话
     */
    private String telephone;

    /**
     * 邮箱
     */
    private String mail;

    /**
     * 用户注册的时间
     */
    private Date created;

    private static final long serialVersionUID = 1L;

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    public String getTaxpayerId() {
        return taxpayerId;
    }

    public void setTaxpayerId(String taxpayerId) {
        this.taxpayerId = taxpayerId;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }
}