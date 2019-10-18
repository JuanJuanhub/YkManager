package com.issCollege.po;

import java.io.Serializable;
import java.util.Date;

/**
 * qualifycontrol
 * @author 
 */
public class Qualifycontrol implements Serializable {
    /**
     * 质控表自增主键 id
     */
    private Long qualifycontrolId;

    /**
     * 检测编号,引自样品表,与sampletb_id关联
     */
    private Long sampletestId;

    /**
     * 样品类型,引用自样品表,与sampletb_id关联
     */
    private Long sampletypeId;

    /**
     * 报告编号，引用自样品表,与sampletb_id关联
     */
    private Long reportnum;

    /**
     * 送样编号引用自样品表,与sampletb_id关联
     */
    private Long sampleId;

    /**
     * 检测项目名称,引用自检测项目表,与item_id关联
     */
    private Long itemsName;

    /**
     * 检测人员（员工姓名）,引用员工表
     */
    private Long staffName;

    /**
     * 检测结果提交的时间 由系统生成
     */
    private Date testtime;

    private static final long serialVersionUID = 1L;

    public Long getQualifycontrolId() {
        return qualifycontrolId;
    }

    public void setQualifycontrolId(Long qualifycontrolId) {
        this.qualifycontrolId = qualifycontrolId;
    }

    public Long getSampletestId() {
        return sampletestId;
    }

    public void setSampletestId(Long sampletestId) {
        this.sampletestId = sampletestId;
    }

    public Long getSampletypeId() {
        return sampletypeId;
    }

    public void setSampletypeId(Long sampletypeId) {
        this.sampletypeId = sampletypeId;
    }

    public Long getReportnum() {
        return reportnum;
    }

    public void setReportnum(Long reportnum) {
        this.reportnum = reportnum;
    }

    public Long getSampleId() {
        return sampleId;
    }

    public void setSampleId(Long sampleId) {
        this.sampleId = sampleId;
    }

    public Long getItemsName() {
        return itemsName;
    }

    public void setItemsName(Long itemsName) {
        this.itemsName = itemsName;
    }

    public Long getStaffName() {
        return staffName;
    }

    public void setStaffName(Long staffName) {
        this.staffName = staffName;
    }

    public Date getTesttime() {
        return testtime;
    }

    public void setTesttime(Date testtime) {
        this.testtime = testtime;
    }
}