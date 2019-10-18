package com.issCollege.po;

import java.io.Serializable;

/**
 * reportstate
 * @author 
 */
public class Reportstate implements Serializable {
    /**
     * 报告状态表自增主键 id
     */
    private Integer reportstateId;

    /**
     * 报告编号,引用自样品表的报告编号
     */
    private Long reportnum;

    /**
     * 报告状态，0是样品制备清单已创建，1是样品制备清单已完成，2是下发单已创建，3是下发单已完成，4是质量控制清单已创建，5质量控制清单已完成，6检测报告已创建，7检测报告已完成
     */
    private Boolean reportState;

    private static final long serialVersionUID = 1L;

    public Integer getReportstateId() {
        return reportstateId;
    }

    public void setReportstateId(Integer reportstateId) {
        this.reportstateId = reportstateId;
    }

    public Long getReportnum() {
        return reportnum;
    }

    public void setReportnum(Long reportnum) {
        this.reportnum = reportnum;
    }

    public Boolean getReportState() {
        return reportState;
    }

    public void setReportState(Boolean reportState) {
        this.reportState = reportState;
    }
}