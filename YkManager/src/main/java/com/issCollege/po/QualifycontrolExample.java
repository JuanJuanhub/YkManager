package com.issCollege.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class QualifycontrolExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Long offset;

    public QualifycontrolExample() {
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

        public Criteria andQualifycontrolIdIsNull() {
            addCriterion("qualifycontrol_id is null");
            return (Criteria) this;
        }

        public Criteria andQualifycontrolIdIsNotNull() {
            addCriterion("qualifycontrol_id is not null");
            return (Criteria) this;
        }

        public Criteria andQualifycontrolIdEqualTo(Long value) {
            addCriterion("qualifycontrol_id =", value, "qualifycontrolId");
            return (Criteria) this;
        }

        public Criteria andQualifycontrolIdNotEqualTo(Long value) {
            addCriterion("qualifycontrol_id <>", value, "qualifycontrolId");
            return (Criteria) this;
        }

        public Criteria andQualifycontrolIdGreaterThan(Long value) {
            addCriterion("qualifycontrol_id >", value, "qualifycontrolId");
            return (Criteria) this;
        }

        public Criteria andQualifycontrolIdGreaterThanOrEqualTo(Long value) {
            addCriterion("qualifycontrol_id >=", value, "qualifycontrolId");
            return (Criteria) this;
        }

        public Criteria andQualifycontrolIdLessThan(Long value) {
            addCriterion("qualifycontrol_id <", value, "qualifycontrolId");
            return (Criteria) this;
        }

        public Criteria andQualifycontrolIdLessThanOrEqualTo(Long value) {
            addCriterion("qualifycontrol_id <=", value, "qualifycontrolId");
            return (Criteria) this;
        }

        public Criteria andQualifycontrolIdIn(List<Long> values) {
            addCriterion("qualifycontrol_id in", values, "qualifycontrolId");
            return (Criteria) this;
        }

        public Criteria andQualifycontrolIdNotIn(List<Long> values) {
            addCriterion("qualifycontrol_id not in", values, "qualifycontrolId");
            return (Criteria) this;
        }

        public Criteria andQualifycontrolIdBetween(Long value1, Long value2) {
            addCriterion("qualifycontrol_id between", value1, value2, "qualifycontrolId");
            return (Criteria) this;
        }

        public Criteria andQualifycontrolIdNotBetween(Long value1, Long value2) {
            addCriterion("qualifycontrol_id not between", value1, value2, "qualifycontrolId");
            return (Criteria) this;
        }

        public Criteria andSampletestIdIsNull() {
            addCriterion("sampletest_id is null");
            return (Criteria) this;
        }

        public Criteria andSampletestIdIsNotNull() {
            addCriterion("sampletest_id is not null");
            return (Criteria) this;
        }

        public Criteria andSampletestIdEqualTo(Long value) {
            addCriterion("sampletest_id =", value, "sampletestId");
            return (Criteria) this;
        }

        public Criteria andSampletestIdNotEqualTo(Long value) {
            addCriterion("sampletest_id <>", value, "sampletestId");
            return (Criteria) this;
        }

        public Criteria andSampletestIdGreaterThan(Long value) {
            addCriterion("sampletest_id >", value, "sampletestId");
            return (Criteria) this;
        }

        public Criteria andSampletestIdGreaterThanOrEqualTo(Long value) {
            addCriterion("sampletest_id >=", value, "sampletestId");
            return (Criteria) this;
        }

        public Criteria andSampletestIdLessThan(Long value) {
            addCriterion("sampletest_id <", value, "sampletestId");
            return (Criteria) this;
        }

        public Criteria andSampletestIdLessThanOrEqualTo(Long value) {
            addCriterion("sampletest_id <=", value, "sampletestId");
            return (Criteria) this;
        }

        public Criteria andSampletestIdIn(List<Long> values) {
            addCriterion("sampletest_id in", values, "sampletestId");
            return (Criteria) this;
        }

        public Criteria andSampletestIdNotIn(List<Long> values) {
            addCriterion("sampletest_id not in", values, "sampletestId");
            return (Criteria) this;
        }

        public Criteria andSampletestIdBetween(Long value1, Long value2) {
            addCriterion("sampletest_id between", value1, value2, "sampletestId");
            return (Criteria) this;
        }

        public Criteria andSampletestIdNotBetween(Long value1, Long value2) {
            addCriterion("sampletest_id not between", value1, value2, "sampletestId");
            return (Criteria) this;
        }

        public Criteria andSampletypeIdIsNull() {
            addCriterion("sampletype_id is null");
            return (Criteria) this;
        }

        public Criteria andSampletypeIdIsNotNull() {
            addCriterion("sampletype_id is not null");
            return (Criteria) this;
        }

        public Criteria andSampletypeIdEqualTo(Long value) {
            addCriterion("sampletype_id =", value, "sampletypeId");
            return (Criteria) this;
        }

        public Criteria andSampletypeIdNotEqualTo(Long value) {
            addCriterion("sampletype_id <>", value, "sampletypeId");
            return (Criteria) this;
        }

        public Criteria andSampletypeIdGreaterThan(Long value) {
            addCriterion("sampletype_id >", value, "sampletypeId");
            return (Criteria) this;
        }

        public Criteria andSampletypeIdGreaterThanOrEqualTo(Long value) {
            addCriterion("sampletype_id >=", value, "sampletypeId");
            return (Criteria) this;
        }

        public Criteria andSampletypeIdLessThan(Long value) {
            addCriterion("sampletype_id <", value, "sampletypeId");
            return (Criteria) this;
        }

        public Criteria andSampletypeIdLessThanOrEqualTo(Long value) {
            addCriterion("sampletype_id <=", value, "sampletypeId");
            return (Criteria) this;
        }

        public Criteria andSampletypeIdIn(List<Long> values) {
            addCriterion("sampletype_id in", values, "sampletypeId");
            return (Criteria) this;
        }

        public Criteria andSampletypeIdNotIn(List<Long> values) {
            addCriterion("sampletype_id not in", values, "sampletypeId");
            return (Criteria) this;
        }

        public Criteria andSampletypeIdBetween(Long value1, Long value2) {
            addCriterion("sampletype_id between", value1, value2, "sampletypeId");
            return (Criteria) this;
        }

        public Criteria andSampletypeIdNotBetween(Long value1, Long value2) {
            addCriterion("sampletype_id not between", value1, value2, "sampletypeId");
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

        public Criteria andReportnumEqualTo(Long value) {
            addCriterion("reportnum =", value, "reportnum");
            return (Criteria) this;
        }

        public Criteria andReportnumNotEqualTo(Long value) {
            addCriterion("reportnum <>", value, "reportnum");
            return (Criteria) this;
        }

        public Criteria andReportnumGreaterThan(Long value) {
            addCriterion("reportnum >", value, "reportnum");
            return (Criteria) this;
        }

        public Criteria andReportnumGreaterThanOrEqualTo(Long value) {
            addCriterion("reportnum >=", value, "reportnum");
            return (Criteria) this;
        }

        public Criteria andReportnumLessThan(Long value) {
            addCriterion("reportnum <", value, "reportnum");
            return (Criteria) this;
        }

        public Criteria andReportnumLessThanOrEqualTo(Long value) {
            addCriterion("reportnum <=", value, "reportnum");
            return (Criteria) this;
        }

        public Criteria andReportnumIn(List<Long> values) {
            addCriterion("reportnum in", values, "reportnum");
            return (Criteria) this;
        }

        public Criteria andReportnumNotIn(List<Long> values) {
            addCriterion("reportnum not in", values, "reportnum");
            return (Criteria) this;
        }

        public Criteria andReportnumBetween(Long value1, Long value2) {
            addCriterion("reportnum between", value1, value2, "reportnum");
            return (Criteria) this;
        }

        public Criteria andReportnumNotBetween(Long value1, Long value2) {
            addCriterion("reportnum not between", value1, value2, "reportnum");
            return (Criteria) this;
        }

        public Criteria andSampleIdIsNull() {
            addCriterion("sample_id is null");
            return (Criteria) this;
        }

        public Criteria andSampleIdIsNotNull() {
            addCriterion("sample_id is not null");
            return (Criteria) this;
        }

        public Criteria andSampleIdEqualTo(Long value) {
            addCriterion("sample_id =", value, "sampleId");
            return (Criteria) this;
        }

        public Criteria andSampleIdNotEqualTo(Long value) {
            addCriterion("sample_id <>", value, "sampleId");
            return (Criteria) this;
        }

        public Criteria andSampleIdGreaterThan(Long value) {
            addCriterion("sample_id >", value, "sampleId");
            return (Criteria) this;
        }

        public Criteria andSampleIdGreaterThanOrEqualTo(Long value) {
            addCriterion("sample_id >=", value, "sampleId");
            return (Criteria) this;
        }

        public Criteria andSampleIdLessThan(Long value) {
            addCriterion("sample_id <", value, "sampleId");
            return (Criteria) this;
        }

        public Criteria andSampleIdLessThanOrEqualTo(Long value) {
            addCriterion("sample_id <=", value, "sampleId");
            return (Criteria) this;
        }

        public Criteria andSampleIdIn(List<Long> values) {
            addCriterion("sample_id in", values, "sampleId");
            return (Criteria) this;
        }

        public Criteria andSampleIdNotIn(List<Long> values) {
            addCriterion("sample_id not in", values, "sampleId");
            return (Criteria) this;
        }

        public Criteria andSampleIdBetween(Long value1, Long value2) {
            addCriterion("sample_id between", value1, value2, "sampleId");
            return (Criteria) this;
        }

        public Criteria andSampleIdNotBetween(Long value1, Long value2) {
            addCriterion("sample_id not between", value1, value2, "sampleId");
            return (Criteria) this;
        }

        public Criteria andItemsNameIsNull() {
            addCriterion("items_name is null");
            return (Criteria) this;
        }

        public Criteria andItemsNameIsNotNull() {
            addCriterion("items_name is not null");
            return (Criteria) this;
        }

        public Criteria andItemsNameEqualTo(Long value) {
            addCriterion("items_name =", value, "itemsName");
            return (Criteria) this;
        }

        public Criteria andItemsNameNotEqualTo(Long value) {
            addCriterion("items_name <>", value, "itemsName");
            return (Criteria) this;
        }

        public Criteria andItemsNameGreaterThan(Long value) {
            addCriterion("items_name >", value, "itemsName");
            return (Criteria) this;
        }

        public Criteria andItemsNameGreaterThanOrEqualTo(Long value) {
            addCriterion("items_name >=", value, "itemsName");
            return (Criteria) this;
        }

        public Criteria andItemsNameLessThan(Long value) {
            addCriterion("items_name <", value, "itemsName");
            return (Criteria) this;
        }

        public Criteria andItemsNameLessThanOrEqualTo(Long value) {
            addCriterion("items_name <=", value, "itemsName");
            return (Criteria) this;
        }

        public Criteria andItemsNameIn(List<Long> values) {
            addCriterion("items_name in", values, "itemsName");
            return (Criteria) this;
        }

        public Criteria andItemsNameNotIn(List<Long> values) {
            addCriterion("items_name not in", values, "itemsName");
            return (Criteria) this;
        }

        public Criteria andItemsNameBetween(Long value1, Long value2) {
            addCriterion("items_name between", value1, value2, "itemsName");
            return (Criteria) this;
        }

        public Criteria andItemsNameNotBetween(Long value1, Long value2) {
            addCriterion("items_name not between", value1, value2, "itemsName");
            return (Criteria) this;
        }

        public Criteria andStaffNameIsNull() {
            addCriterion("staff_name is null");
            return (Criteria) this;
        }

        public Criteria andStaffNameIsNotNull() {
            addCriterion("staff_name is not null");
            return (Criteria) this;
        }

        public Criteria andStaffNameEqualTo(Long value) {
            addCriterion("staff_name =", value, "staffName");
            return (Criteria) this;
        }

        public Criteria andStaffNameNotEqualTo(Long value) {
            addCriterion("staff_name <>", value, "staffName");
            return (Criteria) this;
        }

        public Criteria andStaffNameGreaterThan(Long value) {
            addCriterion("staff_name >", value, "staffName");
            return (Criteria) this;
        }

        public Criteria andStaffNameGreaterThanOrEqualTo(Long value) {
            addCriterion("staff_name >=", value, "staffName");
            return (Criteria) this;
        }

        public Criteria andStaffNameLessThan(Long value) {
            addCriterion("staff_name <", value, "staffName");
            return (Criteria) this;
        }

        public Criteria andStaffNameLessThanOrEqualTo(Long value) {
            addCriterion("staff_name <=", value, "staffName");
            return (Criteria) this;
        }

        public Criteria andStaffNameIn(List<Long> values) {
            addCriterion("staff_name in", values, "staffName");
            return (Criteria) this;
        }

        public Criteria andStaffNameNotIn(List<Long> values) {
            addCriterion("staff_name not in", values, "staffName");
            return (Criteria) this;
        }

        public Criteria andStaffNameBetween(Long value1, Long value2) {
            addCriterion("staff_name between", value1, value2, "staffName");
            return (Criteria) this;
        }

        public Criteria andStaffNameNotBetween(Long value1, Long value2) {
            addCriterion("staff_name not between", value1, value2, "staffName");
            return (Criteria) this;
        }

        public Criteria andTesttimeIsNull() {
            addCriterion("testTime is null");
            return (Criteria) this;
        }

        public Criteria andTesttimeIsNotNull() {
            addCriterion("testTime is not null");
            return (Criteria) this;
        }

        public Criteria andTesttimeEqualTo(Date value) {
            addCriterion("testTime =", value, "testtime");
            return (Criteria) this;
        }

        public Criteria andTesttimeNotEqualTo(Date value) {
            addCriterion("testTime <>", value, "testtime");
            return (Criteria) this;
        }

        public Criteria andTesttimeGreaterThan(Date value) {
            addCriterion("testTime >", value, "testtime");
            return (Criteria) this;
        }

        public Criteria andTesttimeGreaterThanOrEqualTo(Date value) {
            addCriterion("testTime >=", value, "testtime");
            return (Criteria) this;
        }

        public Criteria andTesttimeLessThan(Date value) {
            addCriterion("testTime <", value, "testtime");
            return (Criteria) this;
        }

        public Criteria andTesttimeLessThanOrEqualTo(Date value) {
            addCriterion("testTime <=", value, "testtime");
            return (Criteria) this;
        }

        public Criteria andTesttimeIn(List<Date> values) {
            addCriterion("testTime in", values, "testtime");
            return (Criteria) this;
        }

        public Criteria andTesttimeNotIn(List<Date> values) {
            addCriterion("testTime not in", values, "testtime");
            return (Criteria) this;
        }

        public Criteria andTesttimeBetween(Date value1, Date value2) {
            addCriterion("testTime between", value1, value2, "testtime");
            return (Criteria) this;
        }

        public Criteria andTesttimeNotBetween(Date value1, Date value2) {
            addCriterion("testTime not between", value1, value2, "testtime");
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