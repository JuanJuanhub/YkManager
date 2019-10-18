package com.issCollege.po;

import java.util.ArrayList;
import java.util.List;

public class StandardsampleExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Long offset;

    public StandardsampleExample() {
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

        public Criteria andStandardsampleIdIsNull() {
            addCriterion("standardSample_id is null");
            return (Criteria) this;
        }

        public Criteria andStandardsampleIdIsNotNull() {
            addCriterion("standardSample_id is not null");
            return (Criteria) this;
        }

        public Criteria andStandardsampleIdEqualTo(Long value) {
            addCriterion("standardSample_id =", value, "standardsampleId");
            return (Criteria) this;
        }

        public Criteria andStandardsampleIdNotEqualTo(Long value) {
            addCriterion("standardSample_id <>", value, "standardsampleId");
            return (Criteria) this;
        }

        public Criteria andStandardsampleIdGreaterThan(Long value) {
            addCriterion("standardSample_id >", value, "standardsampleId");
            return (Criteria) this;
        }

        public Criteria andStandardsampleIdGreaterThanOrEqualTo(Long value) {
            addCriterion("standardSample_id >=", value, "standardsampleId");
            return (Criteria) this;
        }

        public Criteria andStandardsampleIdLessThan(Long value) {
            addCriterion("standardSample_id <", value, "standardsampleId");
            return (Criteria) this;
        }

        public Criteria andStandardsampleIdLessThanOrEqualTo(Long value) {
            addCriterion("standardSample_id <=", value, "standardsampleId");
            return (Criteria) this;
        }

        public Criteria andStandardsampleIdIn(List<Long> values) {
            addCriterion("standardSample_id in", values, "standardsampleId");
            return (Criteria) this;
        }

        public Criteria andStandardsampleIdNotIn(List<Long> values) {
            addCriterion("standardSample_id not in", values, "standardsampleId");
            return (Criteria) this;
        }

        public Criteria andStandardsampleIdBetween(Long value1, Long value2) {
            addCriterion("standardSample_id between", value1, value2, "standardsampleId");
            return (Criteria) this;
        }

        public Criteria andStandardsampleIdNotBetween(Long value1, Long value2) {
            addCriterion("standardSample_id not between", value1, value2, "standardsampleId");
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

        public Criteria andStandardsampleNameEqualTo(String value) {
            addCriterion("standardSample_name =", value, "standardsampleName");
            return (Criteria) this;
        }

        public Criteria andStandardsampleNameNotEqualTo(String value) {
            addCriterion("standardSample_name <>", value, "standardsampleName");
            return (Criteria) this;
        }

        public Criteria andStandardsampleNameGreaterThan(String value) {
            addCriterion("standardSample_name >", value, "standardsampleName");
            return (Criteria) this;
        }

        public Criteria andStandardsampleNameGreaterThanOrEqualTo(String value) {
            addCriterion("standardSample_name >=", value, "standardsampleName");
            return (Criteria) this;
        }

        public Criteria andStandardsampleNameLessThan(String value) {
            addCriterion("standardSample_name <", value, "standardsampleName");
            return (Criteria) this;
        }

        public Criteria andStandardsampleNameLessThanOrEqualTo(String value) {
            addCriterion("standardSample_name <=", value, "standardsampleName");
            return (Criteria) this;
        }

        public Criteria andStandardsampleNameLike(String value) {
            addCriterion("standardSample_name like", value, "standardsampleName");
            return (Criteria) this;
        }

        public Criteria andStandardsampleNameNotLike(String value) {
            addCriterion("standardSample_name not like", value, "standardsampleName");
            return (Criteria) this;
        }

        public Criteria andStandardsampleNameIn(List<String> values) {
            addCriterion("standardSample_name in", values, "standardsampleName");
            return (Criteria) this;
        }

        public Criteria andStandardsampleNameNotIn(List<String> values) {
            addCriterion("standardSample_name not in", values, "standardsampleName");
            return (Criteria) this;
        }

        public Criteria andStandardsampleNameBetween(String value1, String value2) {
            addCriterion("standardSample_name between", value1, value2, "standardsampleName");
            return (Criteria) this;
        }

        public Criteria andStandardsampleNameNotBetween(String value1, String value2) {
            addCriterion("standardSample_name not between", value1, value2, "standardsampleName");
            return (Criteria) this;
        }

        public Criteria andStandardsampleTypeIsNull() {
            addCriterion("standardSample_type is null");
            return (Criteria) this;
        }

        public Criteria andStandardsampleTypeIsNotNull() {
            addCriterion("standardSample_type is not null");
            return (Criteria) this;
        }

        public Criteria andStandardsampleTypeEqualTo(String value) {
            addCriterion("standardSample_type =", value, "standardsampleType");
            return (Criteria) this;
        }

        public Criteria andStandardsampleTypeNotEqualTo(String value) {
            addCriterion("standardSample_type <>", value, "standardsampleType");
            return (Criteria) this;
        }

        public Criteria andStandardsampleTypeGreaterThan(String value) {
            addCriterion("standardSample_type >", value, "standardsampleType");
            return (Criteria) this;
        }

        public Criteria andStandardsampleTypeGreaterThanOrEqualTo(String value) {
            addCriterion("standardSample_type >=", value, "standardsampleType");
            return (Criteria) this;
        }

        public Criteria andStandardsampleTypeLessThan(String value) {
            addCriterion("standardSample_type <", value, "standardsampleType");
            return (Criteria) this;
        }

        public Criteria andStandardsampleTypeLessThanOrEqualTo(String value) {
            addCriterion("standardSample_type <=", value, "standardsampleType");
            return (Criteria) this;
        }

        public Criteria andStandardsampleTypeLike(String value) {
            addCriterion("standardSample_type like", value, "standardsampleType");
            return (Criteria) this;
        }

        public Criteria andStandardsampleTypeNotLike(String value) {
            addCriterion("standardSample_type not like", value, "standardsampleType");
            return (Criteria) this;
        }

        public Criteria andStandardsampleTypeIn(List<String> values) {
            addCriterion("standardSample_type in", values, "standardsampleType");
            return (Criteria) this;
        }

        public Criteria andStandardsampleTypeNotIn(List<String> values) {
            addCriterion("standardSample_type not in", values, "standardsampleType");
            return (Criteria) this;
        }

        public Criteria andStandardsampleTypeBetween(String value1, String value2) {
            addCriterion("standardSample_type between", value1, value2, "standardsampleType");
            return (Criteria) this;
        }

        public Criteria andStandardsampleTypeNotBetween(String value1, String value2) {
            addCriterion("standardSample_type not between", value1, value2, "standardsampleType");
            return (Criteria) this;
        }

        public Criteria andStandardsampleStateIsNull() {
            addCriterion("standardSample_state is null");
            return (Criteria) this;
        }

        public Criteria andStandardsampleStateIsNotNull() {
            addCriterion("standardSample_state is not null");
            return (Criteria) this;
        }

        public Criteria andStandardsampleStateEqualTo(String value) {
            addCriterion("standardSample_state =", value, "standardsampleState");
            return (Criteria) this;
        }

        public Criteria andStandardsampleStateNotEqualTo(String value) {
            addCriterion("standardSample_state <>", value, "standardsampleState");
            return (Criteria) this;
        }

        public Criteria andStandardsampleStateGreaterThan(String value) {
            addCriterion("standardSample_state >", value, "standardsampleState");
            return (Criteria) this;
        }

        public Criteria andStandardsampleStateGreaterThanOrEqualTo(String value) {
            addCriterion("standardSample_state >=", value, "standardsampleState");
            return (Criteria) this;
        }

        public Criteria andStandardsampleStateLessThan(String value) {
            addCriterion("standardSample_state <", value, "standardsampleState");
            return (Criteria) this;
        }

        public Criteria andStandardsampleStateLessThanOrEqualTo(String value) {
            addCriterion("standardSample_state <=", value, "standardsampleState");
            return (Criteria) this;
        }

        public Criteria andStandardsampleStateLike(String value) {
            addCriterion("standardSample_state like", value, "standardsampleState");
            return (Criteria) this;
        }

        public Criteria andStandardsampleStateNotLike(String value) {
            addCriterion("standardSample_state not like", value, "standardsampleState");
            return (Criteria) this;
        }

        public Criteria andStandardsampleStateIn(List<String> values) {
            addCriterion("standardSample_state in", values, "standardsampleState");
            return (Criteria) this;
        }

        public Criteria andStandardsampleStateNotIn(List<String> values) {
            addCriterion("standardSample_state not in", values, "standardsampleState");
            return (Criteria) this;
        }

        public Criteria andStandardsampleStateBetween(String value1, String value2) {
            addCriterion("standardSample_state between", value1, value2, "standardsampleState");
            return (Criteria) this;
        }

        public Criteria andStandardsampleStateNotBetween(String value1, String value2) {
            addCriterion("standardSample_state not between", value1, value2, "standardsampleState");
            return (Criteria) this;
        }

        public Criteria andElementNameIsNull() {
            addCriterion("element_name is null");
            return (Criteria) this;
        }

        public Criteria andElementNameIsNotNull() {
            addCriterion("element_name is not null");
            return (Criteria) this;
        }

        public Criteria andElementNameEqualTo(String value) {
            addCriterion("element_name =", value, "elementName");
            return (Criteria) this;
        }

        public Criteria andElementNameNotEqualTo(String value) {
            addCriterion("element_name <>", value, "elementName");
            return (Criteria) this;
        }

        public Criteria andElementNameGreaterThan(String value) {
            addCriterion("element_name >", value, "elementName");
            return (Criteria) this;
        }

        public Criteria andElementNameGreaterThanOrEqualTo(String value) {
            addCriterion("element_name >=", value, "elementName");
            return (Criteria) this;
        }

        public Criteria andElementNameLessThan(String value) {
            addCriterion("element_name <", value, "elementName");
            return (Criteria) this;
        }

        public Criteria andElementNameLessThanOrEqualTo(String value) {
            addCriterion("element_name <=", value, "elementName");
            return (Criteria) this;
        }

        public Criteria andElementNameLike(String value) {
            addCriterion("element_name like", value, "elementName");
            return (Criteria) this;
        }

        public Criteria andElementNameNotLike(String value) {
            addCriterion("element_name not like", value, "elementName");
            return (Criteria) this;
        }

        public Criteria andElementNameIn(List<String> values) {
            addCriterion("element_name in", values, "elementName");
            return (Criteria) this;
        }

        public Criteria andElementNameNotIn(List<String> values) {
            addCriterion("element_name not in", values, "elementName");
            return (Criteria) this;
        }

        public Criteria andElementNameBetween(String value1, String value2) {
            addCriterion("element_name between", value1, value2, "elementName");
            return (Criteria) this;
        }

        public Criteria andElementNameNotBetween(String value1, String value2) {
            addCriterion("element_name not between", value1, value2, "elementName");
            return (Criteria) this;
        }

        public Criteria andElementContentIsNull() {
            addCriterion("element_content is null");
            return (Criteria) this;
        }

        public Criteria andElementContentIsNotNull() {
            addCriterion("element_content is not null");
            return (Criteria) this;
        }

        public Criteria andElementContentEqualTo(Float value) {
            addCriterion("element_content =", value, "elementContent");
            return (Criteria) this;
        }

        public Criteria andElementContentNotEqualTo(Float value) {
            addCriterion("element_content <>", value, "elementContent");
            return (Criteria) this;
        }

        public Criteria andElementContentGreaterThan(Float value) {
            addCriterion("element_content >", value, "elementContent");
            return (Criteria) this;
        }

        public Criteria andElementContentGreaterThanOrEqualTo(Float value) {
            addCriterion("element_content >=", value, "elementContent");
            return (Criteria) this;
        }

        public Criteria andElementContentLessThan(Float value) {
            addCriterion("element_content <", value, "elementContent");
            return (Criteria) this;
        }

        public Criteria andElementContentLessThanOrEqualTo(Float value) {
            addCriterion("element_content <=", value, "elementContent");
            return (Criteria) this;
        }

        public Criteria andElementContentIn(List<Float> values) {
            addCriterion("element_content in", values, "elementContent");
            return (Criteria) this;
        }

        public Criteria andElementContentNotIn(List<Float> values) {
            addCriterion("element_content not in", values, "elementContent");
            return (Criteria) this;
        }

        public Criteria andElementContentBetween(Float value1, Float value2) {
            addCriterion("element_content between", value1, value2, "elementContent");
            return (Criteria) this;
        }

        public Criteria andElementContentNotBetween(Float value1, Float value2) {
            addCriterion("element_content not between", value1, value2, "elementContent");
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