package com.issCollege.po;

import java.io.Serializable;
import java.util.Date;

/**
 * sampleappoint
 * @author 
 */
public class Sampleappoint implements Serializable {
    /**
     * 样品下发单编号，自增主键
     */
    private Long sampleappointId;

    /**
     * 报告编号，引用自样品表
     */
    private Long reportnum;

    /**
     * 检验项目名称,引用自检测项目表
     */
    private Long itemName;

    /**
     * 检验方法,引用自检测项目表
     */
    private Long itemMethod;

    /**
     * 样品数量,引用自样品表
     */
    private Long sampleCount;

    /**
     * 检测人员（员工姓名）,引用员工表
     */
    private Long staffName;

    /**
     * 工作量
     */
    private String workload;

    /**
     * 完成日期
     */
    private Date finishdate;

    private static final long serialVersionUID = 1L;

    public Long getSampleappointId() {
        return sampleappointId;
    }

    public void setSampleappointId(Long sampleappointId) {
        this.sampleappointId = sampleappointId;
    }

    public Long getReportnum() {
        return reportnum;
    }

    public void setReportnum(Long reportnum) {
        this.reportnum = reportnum;
    }

    public Long getItemName() {
        return itemName;
    }

    public void setItemName(Long itemName) {
        this.itemName = itemName;
    }

    public Long getItemMethod() {
        return itemMethod;
    }

    public void setItemMethod(Long itemMethod) {
        this.itemMethod = itemMethod;
    }

    public Long getSampleCount() {
        return sampleCount;
    }

    public void setSampleCount(Long sampleCount) {
        this.sampleCount = sampleCount;
    }

    public Long getStaffName() {
        return staffName;
    }

    public void setStaffName(Long staffName) {
        this.staffName = staffName;
    }

    public String getWorkload() {
        return workload;
    }

    public void setWorkload(String workload) {
        this.workload = workload;
    }

    public Date getFinishdate() {
        return finishdate;
    }

    public void setFinishdate(Date finishdate) {
        this.finishdate = finishdate;
    }
}