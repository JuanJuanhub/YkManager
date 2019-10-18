package com.issCollege.po;

import java.io.Serializable;

/**
 * testresult
 * @author 
 */
public class Testresult implements Serializable {
    /**
     * 检测结果自增主键
     */
    private Long testresultId;

    /**
     * 检测编号引自样品表
     */
    private Long sampletestId;

    /**
     * 检测项目名称， 引用自检测项目表，与`item_id`关联
     */
    private Long itemName;

    /**
     * 元素检测含量，由检测人员录入
     */
    private Float elementResult;

    /**
     * 温度 由检测人员录入
     */
    private Float temperature;

    /**
     * 湿度 由检测人员录入
     */
    private Float humidity;

    /**
     * 仪器型号 由检测人员录入
     */
    private String instrumentModel;

    /**
     * 仪器编号 由检测人员录入
     */
    private String instrumentNum;

    /**
     * 实际误差， 由计算公式得到的结果
     */
    private Float actualError;

    /**
     * 允许误差 由计算公式得到的结果
     */
    private Float allowableError;

    /**
     * 单位（精度值）
     */
    private String itemUnits;

    /**
     * 检测次数
     */
    private Short testCount;

    private static final long serialVersionUID = 1L;

    public Long getTestresultId() {
        return testresultId;
    }

    public void setTestresultId(Long testresultId) {
        this.testresultId = testresultId;
    }

    public Long getSampletestId() {
        return sampletestId;
    }

    public void setSampletestId(Long sampletestId) {
        this.sampletestId = sampletestId;
    }

    public Long getItemName() {
        return itemName;
    }

    public void setItemName(Long itemName) {
        this.itemName = itemName;
    }

    public Float getElementResult() {
        return elementResult;
    }

    public void setElementResult(Float elementResult) {
        this.elementResult = elementResult;
    }

    public Float getTemperature() {
        return temperature;
    }

    public void setTemperature(Float temperature) {
        this.temperature = temperature;
    }

    public Float getHumidity() {
        return humidity;
    }

    public void setHumidity(Float humidity) {
        this.humidity = humidity;
    }

    public String getInstrumentModel() {
        return instrumentModel;
    }

    public void setInstrumentModel(String instrumentModel) {
        this.instrumentModel = instrumentModel;
    }

    public String getInstrumentNum() {
        return instrumentNum;
    }

    public void setInstrumentNum(String instrumentNum) {
        this.instrumentNum = instrumentNum;
    }

    public Float getActualError() {
        return actualError;
    }

    public void setActualError(Float actualError) {
        this.actualError = actualError;
    }

    public Float getAllowableError() {
        return allowableError;
    }

    public void setAllowableError(Float allowableError) {
        this.allowableError = allowableError;
    }

    public String getItemUnits() {
        return itemUnits;
    }

    public void setItemUnits(String itemUnits) {
        this.itemUnits = itemUnits;
    }

    public Short getTestCount() {
        return testCount;
    }

    public void setTestCount(Short testCount) {
        this.testCount = testCount;
    }
}