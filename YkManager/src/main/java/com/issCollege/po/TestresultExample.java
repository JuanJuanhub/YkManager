package com.issCollege.po;

import java.util.ArrayList;
import java.util.List;

public class TestresultExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Long offset;

    public TestresultExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setOffset(Long offset) {
        this.offset = offset;
    }

    public Long getOffset() {
        return offset;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andTestresultIdIsNull() {
            addCriterion("testResult_id is null");
            return (Criteria) this;
        }

        public Criteria andTestresultIdIsNotNull() {
            addCriterion("testResult_id is not null");
            return (Criteria) this;
        }

        public Criteria andTestresultIdEqualTo(Long value) {
            addCriterion("testResult_id =", value, "testresultId");
            return (Criteria) this;
        }

        public Criteria andTestresultIdNotEqualTo(Long value) {
            addCriterion("testResult_id <>", value, "testresultId");
            return (Criteria) this;
        }

        public Criteria andTestresultIdGreaterThan(Long value) {
            addCriterion("testResult_id >", value, "testresultId");
            return (Criteria) this;
        }

        public Criteria andTestresultIdGreaterThanOrEqualTo(Long value) {
            addCriterion("testResult_id >=", value, "testresultId");
            return (Criteria) this;
        }

        public Criteria andTestresultIdLessThan(Long value) {
            addCriterion("testResult_id <", value, "testresultId");
            return (Criteria) this;
        }

        public Criteria andTestresultIdLessThanOrEqualTo(Long value) {
            addCriterion("testResult_id <=", value, "testresultId");
            return (Criteria) this;
        }

        public Criteria andTestresultIdIn(List<Long> values) {
            addCriterion("testResult_id in", values, "testresultId");
            return (Criteria) this;
        }

        public Criteria andTestresultIdNotIn(List<Long> values) {
            addCriterion("testResult_id not in", values, "testresultId");
            return (Criteria) this;
        }

        public Criteria andTestresultIdBetween(Long value1, Long value2) {
            addCriterion("testResult_id between", value1, value2, "testresultId");
            return (Criteria) this;
        }

        public Criteria andTestresultIdNotBetween(Long value1, Long value2) {
            addCriterion("testResult_id not between", value1, value2, "testresultId");
            return (Criteria) this;
        }

        public Criteria andSampletestIdIsNull() {
            addCriterion("sampleTest_id is null");
            return (Criteria) this;
        }

        public Criteria andSampletestIdIsNotNull() {
            addCriterion("sampleTest_id is not null");
            return (Criteria) this;
        }

        public Criteria andSampletestIdEqualTo(Long value) {
            addCriterion("sampleTest_id =", value, "sampletestId");
            return (Criteria) this;
        }

        public Criteria andSampletestIdNotEqualTo(Long value) {
            addCriterion("sampleTest_id <>", value, "sampletestId");
            return (Criteria) this;
        }

        public Criteria andSampletestIdGreaterThan(Long value) {
            addCriterion("sampleTest_id >", value, "sampletestId");
            return (Criteria) this;
        }

        public Criteria andSampletestIdGreaterThanOrEqualTo(Long value) {
            addCriterion("sampleTest_id >=", value, "sampletestId");
            return (Criteria) this;
        }

        public Criteria andSampletestIdLessThan(Long value) {
            addCriterion("sampleTest_id <", value, "sampletestId");
            return (Criteria) this;
        }

        public Criteria andSampletestIdLessThanOrEqualTo(Long value) {
            addCriterion("sampleTest_id <=", value, "sampletestId");
            return (Criteria) this;
        }

        public Criteria andSampletestIdIn(List<Long> values) {
            addCriterion("sampleTest_id in", values, "sampletestId");
            return (Criteria) this;
        }

        public Criteria andSampletestIdNotIn(List<Long> values) {
            addCriterion("sampleTest_id not in", values, "sampletestId");
            return (Criteria) this;
        }

        public Criteria andSampletestIdBetween(Long value1, Long value2) {
            addCriterion("sampleTest_id between", value1, value2, "sampletestId");
            return (Criteria) this;
        }

        public Criteria andSampletestIdNotBetween(Long value1, Long value2) {
            addCriterion("sampleTest_id not between", value1, value2, "sampletestId");
            return (Criteria) this;
        }

        public Criteria andItemNameIsNull() {
            addCriterion("item_name is null");
            return (Criteria) this;
        }

        public Criteria andItemNameIsNotNull() {
            addCriterion("item_name is not null");
            return (Criteria) this;
        }

        public Criteria andItemNameEqualTo(Long value) {
            addCriterion("item_name =", value, "itemName");
            return (Criteria) this;
        }

        public Criteria andItemNameNotEqualTo(Long value) {
            addCriterion("item_name <>", value, "itemName");
            return (Criteria) this;
        }

        public Criteria andItemNameGreaterThan(Long value) {
            addCriterion("item_name >", value, "itemName");
            return (Criteria) this;
        }

        public Criteria andItemNameGreaterThanOrEqualTo(Long value) {
            addCriterion("item_name >=", value, "itemName");
            return (Criteria) this;
        }

        public Criteria andItemNameLessThan(Long value) {
            addCriterion("item_name <", value, "itemName");
            return (Criteria) this;
        }

        public Criteria andItemNameLessThanOrEqualTo(Long value) {
            addCriterion("item_name <=", value, "itemName");
            return (Criteria) this;
        }

        public Criteria andItemNameIn(List<Long> values) {
            addCriterion("item_name in", values, "itemName");
            return (Criteria) this;
        }

        public Criteria andItemNameNotIn(List<Long> values) {
            addCriterion("item_name not in", values, "itemName");
            return (Criteria) this;
        }

        public Criteria andItemNameBetween(Long value1, Long value2) {
            addCriterion("item_name between", value1, value2, "itemName");
            return (Criteria) this;
        }

        public Criteria andItemNameNotBetween(Long value1, Long value2) {
            addCriterion("item_name not between", value1, value2, "itemName");
            return (Criteria) this;
        }

        public Criteria andElementResultIsNull() {
            addCriterion("element_result is null");
            return (Criteria) this;
        }

        public Criteria andElementResultIsNotNull() {
            addCriterion("element_result is not null");
            return (Criteria) this;
        }

        public Criteria andElementResultEqualTo(Float value) {
            addCriterion("element_result =", value, "elementResult");
            return (Criteria) this;
        }

        public Criteria andElementResultNotEqualTo(Float value) {
            addCriterion("element_result <>", value, "elementResult");
            return (Criteria) this;
        }

        public Criteria andElementResultGreaterThan(Float value) {
            addCriterion("element_result >", value, "elementResult");
            return (Criteria) this;
        }

        public Criteria andElementResultGreaterThanOrEqualTo(Float value) {
            addCriterion("element_result >=", value, "elementResult");
            return (Criteria) this;
        }

        public Criteria andElementResultLessThan(Float value) {
            addCriterion("element_result <", value, "elementResult");
            return (Criteria) this;
        }

        public Criteria andElementResultLessThanOrEqualTo(Float value) {
            addCriterion("element_result <=", value, "elementResult");
            return (Criteria) this;
        }

        public Criteria andElementResultIn(List<Float> values) {
            addCriterion("element_result in", values, "elementResult");
            return (Criteria) this;
        }

        public Criteria andElementResultNotIn(List<Float> values) {
            addCriterion("element_result not in", values, "elementResult");
            return (Criteria) this;
        }

        public Criteria andElementResultBetween(Float value1, Float value2) {
            addCriterion("element_result between", value1, value2, "elementResult");
            return (Criteria) this;
        }

        public Criteria andElementResultNotBetween(Float value1, Float value2) {
            addCriterion("element_result not between", value1, value2, "elementResult");
            return (Criteria) this;
        }

        public Criteria andTemperatureIsNull() {
            addCriterion("temperature is null");
            return (Criteria) this;
        }

        public Criteria andTemperatureIsNotNull() {
            addCriterion("temperature is not null");
            return (Criteria) this;
        }

        public Criteria andTemperatureEqualTo(Float value) {
            addCriterion("temperature =", value, "temperature");
            return (Criteria) this;
        }

        public Criteria andTemperatureNotEqualTo(Float value) {
            addCriterion("temperature <>", value, "temperature");
            return (Criteria) this;
        }

        public Criteria andTemperatureGreaterThan(Float value) {
            addCriterion("temperature >", value, "temperature");
            return (Criteria) this;
        }

        public Criteria andTemperatureGreaterThanOrEqualTo(Float value) {
            addCriterion("temperature >=", value, "temperature");
            return (Criteria) this;
        }

        public Criteria andTemperatureLessThan(Float value) {
            addCriterion("temperature <", value, "temperature");
            return (Criteria) this;
        }

        public Criteria andTemperatureLessThanOrEqualTo(Float value) {
            addCriterion("temperature <=", value, "temperature");
            return (Criteria) this;
        }

        public Criteria andTemperatureIn(List<Float> values) {
            addCriterion("temperature in", values, "temperature");
            return (Criteria) this;
        }

        public Criteria andTemperatureNotIn(List<Float> values) {
            addCriterion("temperature not in", values, "temperature");
            return (Criteria) this;
        }

        public Criteria andTemperatureBetween(Float value1, Float value2) {
            addCriterion("temperature between", value1, value2, "temperature");
            return (Criteria) this;
        }

        public Criteria andTemperatureNotBetween(Float value1, Float value2) {
            addCriterion("temperature not between", value1, value2, "temperature");
            return (Criteria) this;
        }

        public Criteria andHumidityIsNull() {
            addCriterion("humidity is null");
            return (Criteria) this;
        }

        public Criteria andHumidityIsNotNull() {
            addCriterion("humidity is not null");
            return (Criteria) this;
        }

        public Criteria andHumidityEqualTo(Float value) {
            addCriterion("humidity =", value, "humidity");
            return (Criteria) this;
        }

        public Criteria andHumidityNotEqualTo(Float value) {
            addCriterion("humidity <>", value, "humidity");
            return (Criteria) this;
        }

        public Criteria andHumidityGreaterThan(Float value) {
            addCriterion("humidity >", value, "humidity");
            return (Criteria) this;
        }

        public Criteria andHumidityGreaterThanOrEqualTo(Float value) {
            addCriterion("humidity >=", value, "humidity");
            return (Criteria) this;
        }

        public Criteria andHumidityLessThan(Float value) {
            addCriterion("humidity <", value, "humidity");
            return (Criteria) this;
        }

        public Criteria andHumidityLessThanOrEqualTo(Float value) {
            addCriterion("humidity <=", value, "humidity");
            return (Criteria) this;
        }

        public Criteria andHumidityIn(List<Float> values) {
            addCriterion("humidity in", values, "humidity");
            return (Criteria) this;
        }

        public Criteria andHumidityNotIn(List<Float> values) {
            addCriterion("humidity not in", values, "humidity");
            return (Criteria) this;
        }

        public Criteria andHumidityBetween(Float value1, Float value2) {
            addCriterion("humidity between", value1, value2, "humidity");
            return (Criteria) this;
        }

        public Criteria andHumidityNotBetween(Float value1, Float value2) {
            addCriterion("humidity not between", value1, value2, "humidity");
            return (Criteria) this;
        }

        public Criteria andInstrumentModelIsNull() {
            addCriterion("instrument_Model is null");
            return (Criteria) this;
        }

        public Criteria andInstrumentModelIsNotNull() {
            addCriterion("instrument_Model is not null");
            return (Criteria) this;
        }

        public Criteria andInstrumentModelEqualTo(String value) {
            addCriterion("instrument_Model =", value, "instrumentModel");
            return (Criteria) this;
        }

        public Criteria andInstrumentModelNotEqualTo(String value) {
            addCriterion("instrument_Model <>", value, "instrumentModel");
            return (Criteria) this;
        }

        public Criteria andInstrumentModelGreaterThan(String value) {
            addCriterion("instrument_Model >", value, "instrumentModel");
            return (Criteria) this;
        }

        public Criteria andInstrumentModelGreaterThanOrEqualTo(String value) {
            addCriterion("instrument_Model >=", value, "instrumentModel");
            return (Criteria) this;
        }

        public Criteria andInstrumentModelLessThan(String value) {
            addCriterion("instrument_Model <", value, "instrumentModel");
            return (Criteria) this;
        }

        public Criteria andInstrumentModelLessThanOrEqualTo(String value) {
            addCriterion("instrument_Model <=", value, "instrumentModel");
            return (Criteria) this;
        }

        public Criteria andInstrumentModelLike(String value) {
            addCriterion("instrument_Model like", value, "instrumentModel");
            return (Criteria) this;
        }

        public Criteria andInstrumentModelNotLike(String value) {
            addCriterion("instrument_Model not like", value, "instrumentModel");
            return (Criteria) this;
        }

        public Criteria andInstrumentModelIn(List<String> values) {
            addCriterion("instrument_Model in", values, "instrumentModel");
            return (Criteria) this;
        }

        public Criteria andInstrumentModelNotIn(List<String> values) {
            addCriterion("instrument_Model not in", values, "instrumentModel");
            return (Criteria) this;
        }

        public Criteria andInstrumentModelBetween(String value1, String value2) {
            addCriterion("instrument_Model between", value1, value2, "instrumentModel");
            return (Criteria) this;
        }

        public Criteria andInstrumentModelNotBetween(String value1, String value2) {
            addCriterion("instrument_Model not between", value1, value2, "instrumentModel");
            return (Criteria) this;
        }

        public Criteria andInstrumentNumIsNull() {
            addCriterion("instrument_Num is null");
            return (Criteria) this;
        }

        public Criteria andInstrumentNumIsNotNull() {
            addCriterion("instrument_Num is not null");
            return (Criteria) this;
        }

        public Criteria andInstrumentNumEqualTo(String value) {
            addCriterion("instrument_Num =", value, "instrumentNum");
            return (Criteria) this;
        }

        public Criteria andInstrumentNumNotEqualTo(String value) {
            addCriterion("instrument_Num <>", value, "instrumentNum");
            return (Criteria) this;
        }

        public Criteria andInstrumentNumGreaterThan(String value) {
            addCriterion("instrument_Num >", value, "instrumentNum");
            return (Criteria) this;
        }

        public Criteria andInstrumentNumGreaterThanOrEqualTo(String value) {
            addCriterion("instrument_Num >=", value, "instrumentNum");
            return (Criteria) this;
        }

        public Criteria andInstrumentNumLessThan(String value) {
            addCriterion("instrument_Num <", value, "instrumentNum");
            return (Criteria) this;
        }

        public Criteria andInstrumentNumLessThanOrEqualTo(String value) {
            addCriterion("instrument_Num <=", value, "instrumentNum");
            return (Criteria) this;
        }

        public Criteria andInstrumentNumLike(String value) {
            addCriterion("instrument_Num like", value, "instrumentNum");
            return (Criteria) this;
        }

        public Criteria andInstrumentNumNotLike(String value) {
            addCriterion("instrument_Num not like", value, "instrumentNum");
            return (Criteria) this;
        }

        public Criteria andInstrumentNumIn(List<String> values) {
            addCriterion("instrument_Num in", values, "instrumentNum");
            return (Criteria) this;
        }

        public Criteria andInstrumentNumNotIn(List<String> values) {
            addCriterion("instrument_Num not in", values, "instrumentNum");
            return (Criteria) this;
        }

        public Criteria andInstrumentNumBetween(String value1, String value2) {
            addCriterion("instrument_Num between", value1, value2, "instrumentNum");
            return (Criteria) this;
        }

        public Criteria andInstrumentNumNotBetween(String value1, String value2) {
            addCriterion("instrument_Num not between", value1, value2, "instrumentNum");
            return (Criteria) this;
        }

        public Criteria andActualErrorIsNull() {
            addCriterion("actual_Error is null");
            return (Criteria) this;
        }

        public Criteria andActualErrorIsNotNull() {
            addCriterion("actual_Error is not null");
            return (Criteria) this;
        }

        public Criteria andActualErrorEqualTo(Float value) {
            addCriterion("actual_Error =", value, "actualError");
            return (Criteria) this;
        }

        public Criteria andActualErrorNotEqualTo(Float value) {
            addCriterion("actual_Error <>", value, "actualError");
            return (Criteria) this;
        }

        public Criteria andActualErrorGreaterThan(Float value) {
            addCriterion("actual_Error >", value, "actualError");
            return (Criteria) this;
        }

        public Criteria andActualErrorGreaterThanOrEqualTo(Float value) {
            addCriterion("actual_Error >=", value, "actualError");
            return (Criteria) this;
        }

        public Criteria andActualErrorLessThan(Float value) {
            addCriterion("actual_Error <", value, "actualError");
            return (Criteria) this;
        }

        public Criteria andActualErrorLessThanOrEqualTo(Float value) {
            addCriterion("actual_Error <=", value, "actualError");
            return (Criteria) this;
        }

        public Criteria andActualErrorIn(List<Float> values) {
            addCriterion("actual_Error in", values, "actualError");
            return (Criteria) this;
        }

        public Criteria andActualErrorNotIn(List<Float> values) {
            addCriterion("actual_Error not in", values, "actualError");
            return (Criteria) this;
        }

        public Criteria andActualErrorBetween(Float value1, Float value2) {
            addCriterion("actual_Error between", value1, value2, "actualError");
            return (Criteria) this;
        }

        public Criteria andActualErrorNotBetween(Float value1, Float value2) {
            addCriterion("actual_Error not between", value1, value2, "actualError");
            return (Criteria) this;
        }

        public Criteria andAllowableErrorIsNull() {
            addCriterion("allowable_Error is null");
            return (Criteria) this;
        }

        public Criteria andAllowableErrorIsNotNull() {
            addCriterion("allowable_Error is not null");
            return (Criteria) this;
        }

        public Criteria andAllowableErrorEqualTo(Float value) {
            addCriterion("allowable_Error =", value, "allowableError");
            return (Criteria) this;
        }

        public Criteria andAllowableErrorNotEqualTo(Float value) {
            addCriterion("allowable_Error <>", value, "allowableError");
            return (Criteria) this;
        }

        public Criteria andAllowableErrorGreaterThan(Float value) {
            addCriterion("allowable_Error >", value, "allowableError");
            return (Criteria) this;
        }

        public Criteria andAllowableErrorGreaterThanOrEqualTo(Float value) {
            addCriterion("allowable_Error >=", value, "allowableError");
            return (Criteria) this;
        }

        public Criteria andAllowableErrorLessThan(Float value) {
            addCriterion("allowable_Error <", value, "allowableError");
            return (Criteria) this;
        }

        public Criteria andAllowableErrorLessThanOrEqualTo(Float value) {
            addCriterion("allowable_Error <=", value, "allowableError");
            return (Criteria) this;
        }

        public Criteria andAllowableErrorIn(List<Float> values) {
            addCriterion("allowable_Error in", values, "allowableError");
            return (Criteria) this;
        }

        public Criteria andAllowableErrorNotIn(List<Float> values) {
            addCriterion("allowable_Error not in", values, "allowableError");
            return (Criteria) this;
        }

        public Criteria andAllowableErrorBetween(Float value1, Float value2) {
            addCriterion("allowable_Error between", value1, value2, "allowableError");
            return (Criteria) this;
        }

        public Criteria andAllowableErrorNotBetween(Float value1, Float value2) {
            addCriterion("allowable_Error not between", value1, value2, "allowableError");
            return (Criteria) this;
        }

        public Criteria andItemUnitsIsNull() {
            addCriterion("item_units is null");
            return (Criteria) this;
        }

        public Criteria andItemUnitsIsNotNull() {
            addCriterion("item_units is not null");
            return (Criteria) this;
        }

        public Criteria andItemUnitsEqualTo(String value) {
            addCriterion("item_units =", value, "itemUnits");
            return (Criteria) this;
        }

        public Criteria andItemUnitsNotEqualTo(String value) {
            addCriterion("item_units <>", value, "itemUnits");
            return (Criteria) this;
        }

        public Criteria andItemUnitsGreaterThan(String value) {
            addCriterion("item_units >", value, "itemUnits");
            return (Criteria) this;
        }

        public Criteria andItemUnitsGreaterThanOrEqualTo(String value) {
            addCriterion("item_units >=", value, "itemUnits");
            return (Criteria) this;
        }

        public Criteria andItemUnitsLessThan(String value) {
            addCriterion("item_units <", value, "itemUnits");
            return (Criteria) this;
        }

        public Criteria andItemUnitsLessThanOrEqualTo(String value) {
            addCriterion("item_units <=", value, "itemUnits");
            return (Criteria) this;
        }

        public Criteria andItemUnitsLike(String value) {
            addCriterion("item_units like", value, "itemUnits");
            return (Criteria) this;
        }

        public Criteria andItemUnitsNotLike(String value) {
            addCriterion("item_units not like", value, "itemUnits");
            return (Criteria) this;
        }

        public Criteria andItemUnitsIn(List<String> values) {
            addCriterion("item_units in", values, "itemUnits");
            return (Criteria) this;
        }

        public Criteria andItemUnitsNotIn(List<String> values) {
            addCriterion("item_units not in", values, "itemUnits");
            return (Criteria) this;
        }

        public Criteria andItemUnitsBetween(String value1, String value2) {
            addCriterion("item_units between", value1, value2, "itemUnits");
            return (Criteria) this;
        }

        public Criteria andItemUnitsNotBetween(String value1, String value2) {
            addCriterion("item_units not between", value1, value2, "itemUnits");
            return (Criteria) this;
        }

        public Criteria andTestCountIsNull() {
            addCriterion("test_Count is null");
            return (Criteria) this;
        }

        public Criteria andTestCountIsNotNull() {
            addCriterion("test_Count is not null");
            return (Criteria) this;
        }

        public Criteria andTestCountEqualTo(Short value) {
            addCriterion("test_Count =", value, "testCount");
            return (Criteria) this;
        }

        public Criteria andTestCountNotEqualTo(Short value) {
            addCriterion("test_Count <>", value, "testCount");
            return (Criteria) this;
        }

        public Criteria andTestCountGreaterThan(Short value) {
            addCriterion("test_Count >", value, "testCount");
            return (Criteria) this;
        }

        public Criteria andTestCountGreaterThanOrEqualTo(Short value) {
            addCriterion("test_Count >=", value, "testCount");
            return (Criteria) this;
        }

        public Criteria andTestCountLessThan(Short value) {
            addCriterion("test_Count <", value, "testCount");
            return (Criteria) this;
        }

        public Criteria andTestCountLessThanOrEqualTo(Short value) {
            addCriterion("test_Count <=", value, "testCount");
            return (Criteria) this;
        }

        public Criteria andTestCountIn(List<Short> values) {
            addCriterion("test_Count in", values, "testCount");
            return (Criteria) this;
        }

        public Criteria andTestCountNotIn(List<Short> values) {
            addCriterion("test_Count not in", values, "testCount");
            return (Criteria) this;
        }

        public Criteria andTestCountBetween(Short value1, Short value2) {
            addCriterion("test_Count between", value1, value2, "testCount");
            return (Criteria) this;
        }

        public Criteria andTestCountNotBetween(Short value1, Short value2) {
            addCriterion("test_Count not between", value1, value2, "testCount");
            return (Criteria) this;
        }
    }

    /**
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}