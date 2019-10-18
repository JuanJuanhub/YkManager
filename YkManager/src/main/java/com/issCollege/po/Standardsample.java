package com.issCollege.po;

import java.io.Serializable;

/**
 * standardsample
 * @author 
 */
public class Standardsample implements Serializable {
    /**
     * 标准样品表自增主键 id
     */
    private Long standardsampleId;

    /**
     * 标准样名称
     */
    private String standardsampleName;

    /**
     * 标准样品类型
     */
    private String standardsampleType;

    /**
     * 标准样品状态
     */
    private String standardsampleState;

    /**
     * 元素名称
     */
    private String elementName;

    /**
     * 元素含量
     */
    private Float elementContent;

    private static final long serialVersionUID = 1L;

    public Long getStandardsampleId() {
        return standardsampleId;
    }

    public void setStandardsampleId(Long standardsampleId) {
        this.standardsampleId = standardsampleId;
    }

    public String getStandardsampleName() {
        return standardsampleName;
    }

    public void setStandardsampleName(String standardsampleName) {
        this.standardsampleName = standardsampleName;
    }

    public String getStandardsampleType() {
        return standardsampleType;
    }

    public void setStandardsampleType(String standardsampleType) {
        this.standardsampleType = standardsampleType;
    }

    public String getStandardsampleState() {
        return standardsampleState;
    }

    public void setStandardsampleState(String standardsampleState) {
        this.standardsampleState = standardsampleState;
    }

    public String getElementName() {
        return elementName;
    }

    public void setElementName(String elementName) {
        this.elementName = elementName;
    }

    public Float getElementContent() {
        return elementContent;
    }

    public void setElementContent(Float elementContent) {
        this.elementContent = elementContent;
    }
}