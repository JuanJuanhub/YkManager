package com.issCollege.po;

import java.io.Serializable;
import java.util.Date;

/**
 * sample
 * @author 
 */
public class Sample implements Serializable {
    /**
     * 样品表自增主键 id
     */
    private Long sampletbId;

    /**
     * 送样编号
     */
    private String sampleNum;

    /**
     * 样品检测编号
     */
    private Integer sampletestId;

    /**
     * 样品类型,1对应待测样品，2对应平行样，3对应标准样，由客户在填表时选择
     */
    private Long sampleType;

    /**
     * 标准样名称，引用自标准样品表
     */
    private Long standardsampleName;

    /**
     * 岩石类型，引用自检测项目表
     */
    private Long rockType;

    /**
     * 样品状态
     */
    private String sampleState;

    /**
     * 检测项目名称，引用自检测项目表
     */
    private Long itemName;

    /**
     * 用户，引用自用户表
     */
    private Long userId;

    /**
     * 收样日期
     */
    private Date sampleCreated;

    /**
     * 报告编号
     */
    private String reportnum;

    /**
     * 样品数量
     */
    private Long sampleCount;

    /**
     * 项目名称，客户填写，选填
     */
    private String projectName;

    private static final long serialVersionUID = 1L;

    public Long getSampletbId() {
        return sampletbId;
    }

    public void setSampletbId(Long sampletbId) {
        this.sampletbId = sampletbId;
    }

    public String getSampleNum() {
        return sampleNum;
    }

    public void setSampleNum(String sampleNum) {
        this.sampleNum = sampleNum;
    }

    public Integer getSampletestId() {
        return sampletestId;
    }

    public void setSampletestId(Integer sampletestId) {
        this.sampletestId = sampletestId;
    }

    public Long getSampleType() {
        return sampleType;
    }

    public void setSampleType(Long sampleType) {
        this.sampleType = sampleType;
    }

    public Long getStandardsampleName() {
        return standardsampleName;
    }

    public void setStandardsampleName(Long standardsampleName) {
        this.standardsampleName = standardsampleName;
    }

    public Long getRockType() {
        return rockType;
    }

    public void setRockType(Long rockType) {
        this.rockType = rockType;
    }

    public String getSampleState() {
        return sampleState;
    }

    public void setSampleState(String sampleState) {
        this.sampleState = sampleState;
    }

    public Long getItemName() {
        return itemName;
    }

    public void setItemName(Long itemName) {
        this.itemName = itemName;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Date getSampleCreated() {
        return sampleCreated;
    }

    public void setSampleCreated(Date sampleCreated) {
        this.sampleCreated = sampleCreated;
    }

    public String getReportnum() {
        return reportnum;
    }

    public void setReportnum(String reportnum) {
        this.reportnum = reportnum;
    }

    public Long getSampleCount() {
        return sampleCount;
    }

    public void setSampleCount(Long sampleCount) {
        this.sampleCount = sampleCount;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }
}