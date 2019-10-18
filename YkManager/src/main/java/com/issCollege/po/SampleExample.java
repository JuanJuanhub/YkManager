package com.issCollege.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SampleExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Long offset;

    public SampleExample() {
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

        public Criteria andSampletbIdIsNull() {
            addCriterion("sampletb_id is null");
            return (Criteria) this;
        }

        public Criteria andSampletbIdIsNotNull() {
            addCriterion("sampletb_id is not null");
            return (Criteria) this;
        }

        public Criteria andSampletbIdEqualTo(Long value) {
            addCriterion("sampletb_id =", value, "sampletbId");
            return (Criteria) this;
        }

        public Criteria andSampletbIdNotEqualTo(Long value) {
            addCriterion("sampletb_id <>", value, "sampletbId");
            return (Criteria) this;
        }

        public Criteria andSampletbIdGreaterThan(Long value) {
            addCriterion("sampletb_id >", value, "sampletbId");
            return (Criteria) this;
        }

        public Criteria andSampletbIdGreaterThanOrEqualTo(Long value) {
            addCriterion("sampletb_id >=", value, "sampletbId");
            return (Criteria) this;
        }

        public Criteria andSampletbIdLessThan(Long value) {
            addCriterion("sampletb_id <", value, "sampletbId");
            return (Criteria) this;
        }

        public Criteria andSampletbIdLessThanOrEqualTo(Long value) {
            addCriterion("sampletb_id <=", value, "sampletbId");
            return (Criteria) this;
        }

        public Criteria andSampletbIdIn(List<Long> values) {
            addCriterion("sampletb_id in", values, "sampletbId");
            return (Criteria) this;
        }

        public Criteria andSampletbIdNotIn(List<Long> values) {
            addCriterion("sampletb_id not in", values, "sampletbId");
            return (Criteria) this;
        }

        public Criteria andSampletbIdBetween(Long value1, Long value2) {
            addCriterion("sampletb_id between", value1, value2, "sampletbId");
            return (Criteria) this;
        }

        public Criteria andSampletbIdNotBetween(Long value1, Long value2) {
            addCriterion("sampletb_id not between", value1, value2, "sampletbId");
            return (Criteria) this;
        }

        public Criteria andSampleNumIsNull() {
            addCriterion("sample_num is null");
            return (Criteria) this;
        }

        public Criteria andSampleNumIsNotNull() {
            addCriterion("sample_num is not null");
            return (Criteria) this;
        }

        public Criteria andSampleNumEqualTo(String value) {
            addCriterion("sample_num =", value, "sampleNum");
            return (Criteria) this;
        }

        public Criteria andSampleNumNotEqualTo(String value) {
            addCriterion("sample_num <>", value, "sampleNum");
            return (Criteria) this;
        }

        public Criteria andSampleNumGreaterThan(String value) {
            addCriterion("sample_num >", value, "sampleNum");
            return (Criteria) this;
        }

        public Criteria andSampleNumGreaterThanOrEqualTo(String value) {
            addCriterion("sample_num >=", value, "sampleNum");
            return (Criteria) this;
        }

        public Criteria andSampleNumLessThan(String value) {
            addCriterion("sample_num <", value, "sampleNum");
            return (Criteria) this;
        }

        public Criteria andSampleNumLessThanOrEqualTo(String value) {
            addCriterion("sample_num <=", value, "sampleNum");
            return (Criteria) this;
        }

        public Criteria andSampleNumLike(String value) {
            addCriterion("sample_num like", value, "sampleNum");
            return (Criteria) this;
        }

        public Criteria andSampleNumNotLike(String value) {
            addCriterion("sample_num not like", value, "sampleNum");
            return (Criteria) this;
        }

        public Criteria andSampleNumIn(List<String> values) {
            addCriterion("sample_num in", values, "sampleNum");
            return (Criteria) this;
        }

        public Criteria andSampleNumNotIn(List<String> values) {
            addCriterion("sample_num not in", values, "sampleNum");
            return (Criteria) this;
        }

        public Criteria andSampleNumBetween(String value1, String value2) {
            addCriterion("sample_num between", value1, value2, "sampleNum");
            return (Criteria) this;
        }

        public Criteria andSampleNumNotBetween(String value1, String value2) {
            addCriterion("sample_num not between", value1, value2, "sampleNum");
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

        public Criteria andSampletestIdEqualTo(Integer value) {
            addCriterion("sampleTest_id =", value, "sampletestId");
            return (Criteria) this;
        }

        public Criteria andSampletestIdNotEqualTo(Integer value) {
            addCriterion("sampleTest_id <>", value, "sampletestId");
            return (Criteria) this;
        }

        public Criteria andSampletestIdGreaterThan(Integer value) {
            addCriterion("sampleTest_id >", value, "sampletestId");
            return (Criteria) this;
        }

        public Criteria andSampletestIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("sampleTest_id >=", value, "sampletestId");
            return (Criteria) this;
        }

        public Criteria andSampletestIdLessThan(Integer value) {
            addCriterion("sampleTest_id <", value, "sampletestId");
            return (Criteria) this;
        }

        public Criteria andSampletestIdLessThanOrEqualTo(Integer value) {
            addCriterion("sampleTest_id <=", value, "sampletestId");
            return (Criteria) this;
        }

        public Criteria andSampletestIdIn(List<Integer> values) {
            addCriterion("sampleTest_id in", values, "sampletestId");
            return (Criteria) this;
        }

        public Criteria andSampletestIdNotIn(List<Integer> values) {
            addCriterion("sampleTest_id not in", values, "sampletestId");
            return (Criteria) this;
        }

        public Criteria andSampletestIdBetween(Integer value1, Integer value2) {
            addCriterion("sampleTest_id between", value1, value2, "sampletestId");
            return (Criteria) this;
        }

        public Criteria andSampletestIdNotBetween(Integer value1, Integer value2) {
            addCriterion("sampleTest_id not between", value1, value2, "sampletestId");
            return (Criteria) this;
        }

        public Criteria andSampleTypeIsNull() {
            addCriterion("sample_Type is null");
            return (Criteria) this;
        }

        public Criteria andSampleTypeIsNotNull() {
            addCriterion("sample_Type is not null");
            return (Criteria) this;
        }

        public Criteria andSampleTypeEqualTo(Long value) {
            addCriterion("sample_Type =", value, "sampleType");
            return (Criteria) this;
        }

        public Criteria andSampleTypeNotEqualTo(Long value) {
            addCriterion("sample_Type <>", value, "sampleType");
            return (Criteria) this;
        }

        public Criteria andSampleTypeGreaterThan(Long value) {
            addCriterion("sample_Type >", value, "sampleType");
            return (Criteria) this;
        }

        public Criteria andSampleTypeGreaterThanOrEqualTo(Long value) {
            addCriterion("sample_Type >=", value, "sampleType");
            return (Criteria) this;
        }

        public Criteria andSampleTypeLessThan(Long value) {
            addCriterion("sample_Type <", value, "sampleType");
            return (Criteria) this;
        }

        public Criteria andSampleTypeLessThanOrEqualTo(Long value) {
            addCriterion("sample_Type <=", value, "sampleType");
            return (Criteria) this;
        }

        public Criteria andSampleTypeIn(List<Long> values) {
            addCriterion("sample_Type in", values, "sampleType");
            return (Criteria) this;
        }

        public Criteria andSampleTypeNotIn(List<Long> values) {
            addCriterion("sample_Type not in", values, "sampleType");
            return (Criteria) this;
        }

        public Criteria andSampleTypeBetween(Long value1, Long value2) {
            addCriterion("sample_Type between", value1, value2, "sampleType");
            return (Criteria) this;
        }

        public Criteria andSampleTypeNotBetween(Long value1, Long value2) {
            addCriterion("sample_Type not between", value1, value2, "sampleType");
            return (Criteria) this;
        }

        public Criteria andStandardsampleNameIsNull() {
            addCriterion("standardSample_name is null");
            return (Criteria) this;
        }

        public Criteria andStandardsampleNameIsNotNull() {
            addCriterion("standardSample_name is not null");
            return (Criteria) this;
        }

        public Criteria andStandardsampleNameEqualTo(Long value) {
            addCriterion("standardSample_name =", value, "standardsampleName");
            return (Criteria) this;
        }

        public Criteria andStandardsampleNameNotEqualTo(Long value) {
            addCriterion("standardSample_name <>", value, "standardsampleName");
            return (Criteria) this;
        }

        public Criteria andStandardsampleNameGreaterThan(Long value) {
            addCriterion("standardSample_name >", value, "standardsampleName");
            return (Criteria) this;
        }

        public Criteria andStandardsampleNameGreaterThanOrEqualTo(Long value) {
            addCriterion("standardSample_name >=", value, "standardsampleName");
            return (Criteria) this;
        }

        public Criteria andStandardsampleNameLessThan(Long value) {
            addCriterion("standardSample_name <", value, "standardsampleName");
            return (Criteria) this;
        }

        public Criteria andStandardsampleNameLessThanOrEqualTo(Long value) {
            addCriterion("standardSample_name <=", value, "standardsampleName");
            return (Criteria) this;
        }

        public Criteria andStandardsampleNameIn(List<Long> values) {
            addCriterion("standardSample_name in", values, "standardsampleName");
            return (Criteria) this;
        }

        public Criteria andStandardsampleNameNotIn(List<Long> values) {
            addCriterion("standardSample_name not in", values, "standardsampleName");
            return (Criteria) this;
        }

        public Criteria andStandardsampleNameBetween(Long value1, Long value2) {
            addCriterion("standardSample_name between", value1, value2, "standardsampleName");
            return (Criteria) this;
        }

        public Criteria andStandardsampleNameNotBetween(Long value1, Long value2) {
            addCriterion("standardSample_name not between", value1, value2, "standardsampleName");
            return (Criteria) this;
        }

        public Criteria andRockTypeIsNull() {
            addCriterion("rock_type is null");
            return (Criteria) this;
        }

        public Criteria andRockTypeIsNotNull() {
            addCriterion("rock_type is not null");
            return (Criteria) this;
        }

        public Criteria andRockTypeEqualTo(Long value) {
            addCriterion("rock_type =", value, "rockType");
            return (Criteria) this;
        }

        public Criteria andRockTypeNotEqualTo(Long value) {
            addCriterion("rock_type <>", value, "rockType");
            return (Criteria) this;
        }

        public Criteria andRockTypeGreaterThan(Long value) {
            addCriterion("rock_type >", value, "rockType");
            return (Criteria) this;
        }

        public Criteria andRockTypeGreaterThanOrEqualTo(Long value) {
            addCriterion("rock_type >=", value, "rockType");
            return (Criteria) this;
        }

        public Criteria andRockTypeLessThan(Long value) {
            addCriterion("rock_type <", value, "rockType");
            return (Criteria) this;
        }

        public Criteria andRockTypeLessThanOrEqualTo(Long value) {
            addCriterion("rock_type <=", value, "rockType");
            return (Criteria) this;
        }

        public Criteria andRockTypeIn(List<Long> values) {
            addCriterion("rock_type in", values, "rockType");
            return (Criteria) this;
        }

        public Criteria andRockTypeNotIn(List<Long> values) {
            addCriterion("rock_type not in", values, "rockType");
            return (Criteria) this;
        }

        public Criteria andRockTypeBetween(Long value1, Long value2) {
            addCriterion("rock_type between", value1, value2, "rockType");
            return (Criteria) this;
        }

        public Criteria andRockTypeNotBetween(Long value1, Long value2) {
            addCriterion("rock_type not between", value1, value2, "rockType");
            return (Criteria) this;
        }

        public Criteria andSampleStateIsNull() {
            addCriterion("sample_state is null");
            return (Criteria) this;
        }

        public Criteria andSampleStateIsNotNull() {
            addCriterion("sample_state is not null");
            return (Criteria) this;
        }

        public Criteria andSampleStateEqualTo(String value) {
            addCriterion("sample_state =", value, "sampleState");
            return (Criteria) this;
        }

        public Criteria andSampleStateNotEqualTo(String value) {
            addCriterion("sample_state <>", value, "sampleState");
            return (Criteria) this;
        }

        public Criteria andSampleStateGreaterThan(String value) {
            addCriterion("sample_state >", value, "sampleState");
            return (Criteria) this;
        }

        public Criteria andSampleStateGreaterThanOrEqualTo(String value) {
            addCriterion("sample_state >=", value, "sampleState");
            return (Criteria) this;
        }

        public Criteria andSampleStateLessThan(String value) {
            addCriterion("sample_state <", value, "sampleState");
            return (Criteria) this;
        }

        public Criteria andSampleStateLessThanOrEqualTo(String value) {
            addCriterion("sample_state <=", value, "sampleState");
            return (Criteria) this;
        }

        public Criteria andSampleStateLike(String value) {
            addCriterion("sample_state like", value, "sampleState");
            return (Criteria) this;
        }

        public Criteria andSampleStateNotLike(String value) {
            addCriterion("sample_state not like", value, "sampleState");
            return (Criteria) this;
        }

        public Criteria andSampleStateIn(List<String> values) {
            addCriterion("sample_state in", values, "sampleState");
            return (Criteria) this;
        }

        public Criteria andSampleStateNotIn(List<String> values) {
            addCriterion("sample_state not in", values, "sampleState");
            return (Criteria) this;
        }

        public Criteria andSampleStateBetween(String value1, String value2) {
            addCriterion("sample_state between", value1, value2, "sampleState");
            return (Criteria) this;
        }

        public Criteria andSampleStateNotBetween(String value1, String value2) {
            addCriterion("sample_state not between", value1, value2, "sampleState");
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

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(Long value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Long value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Long value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Long value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Long value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Long value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Long> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Long> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Long value1, Long value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Long value1, Long value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andSampleCreatedIsNull() {
            addCriterion("sample_created is null");
            return (Criteria) this;
        }

        public Criteria andSampleCreatedIsNotNull() {
            addCriterion("sample_created is not null");
            return (Criteria) this;
        }

        public Criteria andSampleCreatedEqualTo(Date value) {
            addCriterion("sample_created =", value, "sampleCreated");
            return (Criteria) this;
        }

        public Criteria andSampleCreatedNotEqualTo(Date value) {
            addCriterion("sample_created <>", value, "sampleCreated");
            return (Criteria) this;
        }

        public Criteria andSampleCreatedGreaterThan(Date value) {
            addCriterion("sample_created >", value, "sampleCreated");
            return (Criteria) this;
        }

        public Criteria andSampleCreatedGreaterThanOrEqualTo(Date value) {
            addCriterion("sample_created >=", value, "sampleCreated");
            return (Criteria) this;
        }

        public Criteria andSampleCreatedLessThan(Date value) {
            addCriterion("sample_created <", value, "sampleCreated");
            return (Criteria) this;
        }

        public Criteria andSampleCreatedLessThanOrEqualTo(Date value) {
            addCriterion("sample_created <=", value, "sampleCreated");
            return (Criteria) this;
        }

        public Criteria andSampleCreatedIn(List<Date> values) {
            addCriterion("sample_created in", values, "sampleCreated");
            return (Criteria) this;
        }

        public Criteria andSampleCreatedNotIn(List<Date> values) {
            addCriterion("sample_created not in", values, "sampleCreated");
            return (Criteria) this;
        }

        public Criteria andSampleCreatedBetween(Date value1, Date value2) {
            addCriterion("sample_created between", value1, value2, "sampleCreated");
            return (Criteria) this;
        }

        public Criteria andSampleCreatedNotBetween(Date value1, Date value2) {
            addCriterion("sample_created not between", value1, value2, "sampleCreated");
            return (Criteria) this;
        }

        public Criteria andReportnumIsNull() {
            addCriterion("reportnum is null");
            return (Criteria) this;
        }

        public Criteria andReportnumIsNotNull() {
            addCriterion("reportnum is not null");
            return (Criteria) this;
        }

        public Criteria andReportnumEqualTo(String value) {
            addCriterion("reportnum =", value, "reportnum");
            return (Criteria) this;
        }

        public Criteria andReportnumNotEqualTo(String value) {
            addCriterion("reportnum <>", value, "reportnum");
            return (Criteria) this;
        }

        public Criteria andReportnumGreaterThan(String value) {
            addCriterion("reportnum >", value, "reportnum");
            return (Criteria) this;
        }

        public Criteria andReportnumGreaterThanOrEqualTo(String value) {
            addCriterion("reportnum >=", value, "reportnum");
            return (Criteria) this;
        }

        public Criteria andReportnumLessThan(String value) {
            addCriterion("reportnum <", value, "reportnum");
            return (Criteria) this;
        }

        public Criteria andReportnumLessThanOrEqualTo(String value) {
            addCriterion("reportnum <=", value, "reportnum");
            return (Criteria) this;
        }

        public Criteria andReportnumLike(String value) {
            addCriterion("reportnum like", value, "reportnum");
            return (Criteria) this;
        }

        public Criteria andReportnumNotLike(String value) {
            addCriterion("reportnum not like", value, "reportnum");
            return (Criteria) this;
        }

        public Criteria andReportnumIn(List<String> values) {
            addCriterion("reportnum in", values, "reportnum");
            return (Criteria) this;
        }

        public Criteria andReportnumNotIn(List<String> values) {
            addCriterion("reportnum not in", values, "reportnum");
            return (Criteria) this;
        }

        public Criteria andReportnumBetween(String value1, String value2) {
            addCriterion("reportnum between", value1, value2, "reportnum");
            return (Criteria) this;
        }

        public Criteria andReportnumNotBetween(String value1, String value2) {
            addCriterion("reportnum not between", value1, value2, "reportnum");
            return (Criteria) this;
        }

        public Criteria andSampleCountIsNull() {
            addCriterion("sample_count is null");
            return (Criteria) this;
        }

        public Criteria andSampleCountIsNotNull() {
            addCriterion("sample_count is not null");
            return (Criteria) this;
        }

        public Criteria andSampleCountEqualTo(Long value) {
            addCriterion("sample_count =", value, "sampleCount");
            return (Criteria) this;
        }

        public Criteria andSampleCountNotEqualTo(Long value) {
            addCriterion("sample_count <>", value, "sampleCount");
            return (Criteria) this;
        }

        public Criteria andSampleCountGreaterThan(Long value) {
            addCriterion("sample_count >", value, "sampleCount");
            return (Criteria) this;
        }

        public Criteria andSampleCountGreaterThanOrEqualTo(Long value) {
            addCriterion("sample_count >=", value, "sampleCount");
            return (Criteria) this;
        }

        public Criteria andSampleCountLessThan(Long value) {
            addCriterion("sample_count <", value, "sampleCount");
            return (Criteria) this;
        }

        public Criteria andSampleCountLessThanOrEqualTo(Long value) {
            addCriterion("sample_count <=", value, "sampleCount");
            return (Criteria) this;
        }

        public Criteria andSampleCountIn(List<Long> values) {
            addCriterion("sample_count in", values, "sampleCount");
            return (Criteria) this;
        }

        public Criteria andSampleCountNotIn(List<Long> values) {
            addCriterion("sample_count not in", values, "sampleCount");
            return (Criteria) this;
        }

        public Criteria andSampleCountBetween(Long value1, Long value2) {
            addCriterion("sample_count between", value1, value2, "sampleCount");
            return (Criteria) this;
        }

        public Criteria andSampleCountNotBetween(Long value1, Long value2) {
            addCriterion("sample_count not between", value1, value2, "sampleCount");
            return (Criteria) this;
        }

        public Criteria andProjectNameIsNull() {
            addCriterion("project_name is null");
            return (Criteria) this;
        }

        public Criteria andProjectNameIsNotNull() {
            addCriterion("project_name is not null");
            return (Criteria) this;
        }

        public Criteria andProjectNameEqualTo(String value) {
            addCriterion("project_name =", value, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameNotEqualTo(String value) {
            addCriterion("project_name <>", value, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameGreaterThan(String value) {
            addCriterion("project_name >", value, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameGreaterThanOrEqualTo(String value) {
            addCriterion("project_name >=", value, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameLessThan(String value) {
            addCriterion("project_name <", value, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameLessThanOrEqualTo(String value) {
            addCriterion("project_name <=", value, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameLike(String value) {
            addCriterion("project_name like", value, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameNotLike(String value) {
            addCriterion("project_name not like", value, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameIn(List<String> values) {
            addCriterion("project_name in", values, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameNotIn(List<String> values) {
            addCriterion("project_name not in", values, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameBetween(String value1, String value2) {
            addCriterion("project_name between", value1, value2, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameNotBetween(String value1, String value2) {
            addCriterion("project_name not between", value1, value2, "projectName");
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