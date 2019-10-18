package com.issCollege.po;

import java.util.ArrayList;
import java.util.List;

public class ReportstateExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Long offset;

    public ReportstateExample() {
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

        public Criteria andReportstateIdIsNull() {
            addCriterion("reportstate_id is null");
            return (Criteria) this;
        }

        public Criteria andReportstateIdIsNotNull() {
            addCriterion("reportstate_id is not null");
            return (Criteria) this;
        }

        public Criteria andReportstateIdEqualTo(Integer value) {
            addCriterion("reportstate_id =", value, "reportstateId");
            return (Criteria) this;
        }

        public Criteria andReportstateIdNotEqualTo(Integer value) {
            addCriterion("reportstate_id <>", value, "reportstateId");
            return (Criteria) this;
        }

        public Criteria andReportstateIdGreaterThan(Integer value) {
            addCriterion("reportstate_id >", value, "reportstateId");
            return (Criteria) this;
        }

        public Criteria andReportstateIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("reportstate_id >=", value, "reportstateId");
            return (Criteria) this;
        }

        public Criteria andReportstateIdLessThan(Integer value) {
            addCriterion("reportstate_id <", value, "reportstateId");
            return (Criteria) this;
        }

        public Criteria andReportstateIdLessThanOrEqualTo(Integer value) {
            addCriterion("reportstate_id <=", value, "reportstateId");
            return (Criteria) this;
        }

        public Criteria andReportstateIdIn(List<Integer> values) {
            addCriterion("reportstate_id in", values, "reportstateId");
            return (Criteria) this;
        }

        public Criteria andReportstateIdNotIn(List<Integer> values) {
            addCriterion("reportstate_id not in", values, "reportstateId");
            return (Criteria) this;
        }

        public Criteria andReportstateIdBetween(Integer value1, Integer value2) {
            addCriterion("reportstate_id between", value1, value2, "reportstateId");
            return (Criteria) this;
        }

        public Criteria andReportstateIdNotBetween(Integer value1, Integer value2) {
            addCriterion("reportstate_id not between", value1, value2, "reportstateId");
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

        public Criteria andReportStateIsNull() {
            addCriterion("report_state is null");
            return (Criteria) this;
        }

        public Criteria andReportStateIsNotNull() {
            addCriterion("report_state is not null");
            return (Criteria) this;
        }

        public Criteria andReportStateEqualTo(Boolean value) {
            addCriterion("report_state =", value, "reportState");
            return (Criteria) this;
        }

        public Criteria andReportStateNotEqualTo(Boolean value) {
            addCriterion("report_state <>", value, "reportState");
            return (Criteria) this;
        }

        public Criteria andReportStateGreaterThan(Boolean value) {
            addCriterion("report_state >", value, "reportState");
            return (Criteria) this;
        }

        public Criteria andReportStateGreaterThanOrEqualTo(Boolean value) {
            addCriterion("report_state >=", value, "reportState");
            return (Criteria) this;
        }

        public Criteria andReportStateLessThan(Boolean value) {
            addCriterion("report_state <", value, "reportState");
            return (Criteria) this;
        }

        public Criteria andReportStateLessThanOrEqualTo(Boolean value) {
            addCriterion("report_state <=", value, "reportState");
            return (Criteria) this;
        }

        public Criteria andReportStateIn(List<Boolean> values) {
            addCriterion("report_state in", values, "reportState");
            return (Criteria) this;
        }

        public Criteria andReportStateNotIn(List<Boolean> values) {
            addCriterion("report_state not in", values, "reportState");
            return (Criteria) this;
        }

        public Criteria andReportStateBetween(Boolean value1, Boolean value2) {
            addCriterion("report_state between", value1, value2, "reportState");
            return (Criteria) this;
        }

        public Criteria andReportStateNotBetween(Boolean value1, Boolean value2) {
            addCriterion("report_state not between", value1, value2, "reportState");
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