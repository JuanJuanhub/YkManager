package com.issCollege.po;

import java.io.Serializable;

/**
 * testitem
 * @author 
 */
public class Testitem implements Serializable {
    /**
     * 检测项目编号
     */
    private Long itemId;

    /**
     * 检测项目名称
     */
    private String itemName;

    /**
     * 检测项目单价
     */
    private Float itemPrice;

    /**
     * 检测项目数量
     */
    private Long itemAmount;

    /**
     * 岩石类型
     */
    private String rockType;

    /**
     * 检测方法
     */
    private String itemMethod;

    private static final long serialVersionUID = 1L;

    public Long getItemId() {
        return itemId;
    }

    public void setItemId(Long itemId) {
        this.itemId = itemId;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public Float getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(Float itemPrice) {
        this.itemPrice = itemPrice;
    }

    public Long getItemAmount() {
        return itemAmount;
    }

    public void setItemAmount(Long itemAmount) {
        this.itemAmount = itemAmount;
    }

    public String getRockType() {
        return rockType;
    }

    public void setRockType(String rockType) {
        this.rockType = rockType;
    }

    public String getItemMethod() {
        return itemMethod;
    }

    public void setItemMethod(String itemMethod) {
        this.itemMethod = itemMethod;
    }
}