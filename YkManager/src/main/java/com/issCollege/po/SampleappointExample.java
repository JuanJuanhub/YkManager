package com.issCollege.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SampleappointExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Long offset;

    public SampleappointExample() {
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

        public Criteria andSampleappointIdIsNull() {
            addCriterion("sampleappoint_id is null");
            return (Criteria) this;
        }

        public Criteria andSampleappointIdIsNotNull() {
            addCriterion("sampleappoint_id is not null");
            return (Criteria) this;
        }

        public Criteria andSampleappointIdEqualTo(Long value) {
            addCriterion("sampleappoint_id =", value, "sampleappointId");
            return (Criteria) this;
        }

        public Criteria andSampleappointIdNotEqualTo(Long value) {
            addCriterion("sampleappoint_id <>", value, "sampleappointId");
            return (Criteria) this;
        }

        public Criteria andSampleappointIdGreaterThan(Long value) {
            addCriterion("sampleappoint_id >", value, "sampleappointId");
            return (Criteria) this;
        }

        public Criteria andSampleappointIdGreaterThanOrEqualTo(Long value) {
            addCriterion("sampleappoint_id >=", value, "sampleappointId");
            return (Criteria) this;
        }

        public Criteria andSampleappointIdLessThan(Long value) {
            addCriterion("sampleappoint_id <", value, "sampleappointId");
            return (Criteria) this;
        }

        public Criteria andSampleappointIdLessThanOrEqualTo(Long value) {
            addCriterion("sampleappoint_id <=", value, "sampleappointId");
            return (Criteria) this;
        }

        public Criteria andSampleappointIdIn(List<Long> values) {
            addCriterion("sampleappoint_id in", values, "sampleappointId");
            return (Criteria) this;
        }

        public Criteria andSampleappointIdNotIn(List<Long> values) {
            addCriterion("sampleappoint_id not in", values, "sampleappointId");
            return (Criteria) this;
        }

        public Criteria andSampleappointIdBetween(Long value1, Long value2) {
            addCriterion("sampleappoint_id between", value1, value2, "sampleappointId");
            return (Criteria) this;
        }

        public Criteria andSampleappointIdNotBetween(Long value1, Long value2) {
            addCriterion("sampleappoint_id not between", value1, value2, "sampleappointId");
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

        public Criteria andItemMethodIsNull() {
            addCriterion("item_method is null");
            return (Criteria) this;
        }

        public Criteria andItemMethodIsNotNull() {
            addCriterion("item_method is not null");
            return (Criteria) this;
        }

        public Criteria andItemMethodEqualTo(Long value) {
            addCriterion("item_method =", value, "itemMethod");
            return (Criteria) this;
        }

        public Criteria andItemMethodNotEqualTo(Long value) {
            addCriterion("item_method <>", value, "itemMethod");
            return (Criteria) this;
        }

        public Criteria andItemMethodGreaterThan(Long value) {
            addCriterion("item_method >", value, "itemMethod");
            return (Criteria) this;
        }

        public Criteria andItemMethodGreaterThanOrEqualTo(Long value) {
            addCriterion("item_method >=", value, "itemMethod");
            return (Criteria) this;
        }

        public Criteria andItemMethodLessThan(Long value) {
            addCriterion("item_method <", value, "itemMethod");
            return (Criteria) this;
        }

        public Criteria andItemMethodLessThanOrEqualTo(Long value) {
            addCriterion("item_method <=", value, "itemMethod");
            return (Criteria) this;
        }

        public Criteria andItemMethodIn(List<Long> values) {
            addCriterion("item_method in", values, "itemMethod");
            return (Criteria) this;
        }

        public Criteria andItemMethodNotIn(List<Long> values) {
            addCriterion("item_method not in", values, "itemMethod");
            return (Criteria) this;
        }

        public Criteria andItemMethodBetween(Long value1, Long value2) {
            addCriterion("item_method between", value1, value2, "itemMethod");
            return (Criteria) this;
        }

        public Criteria andItemMethodNotBetween(Long value1, Long value2) {
            addCriterion("item_method not between", value1, value2, "itemMethod");
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

        public Criteria andWorkloadIsNull() {
            addCriterion("workload is null");
            return (Criteria) this;
        }

        public Criteria andWorkloadIsNotNull() {
            addCriterion("workload is not null");
            return (Criteria) this;
        }

        public Criteria andWorkloadEqualTo(String value) {
            addCriterion("workload =", value, "workload");
            return (Criteria) this;
        }

        public Criteria andWorkloadNotEqualTo(String value) {
            addCriterion("workload <>", value, "workload");
            return (Criteria) this;
        }

        public Criteria andWorkloadGreaterThan(String value) {
            addCriterion("workload >", value, "workload");
            return (Criteria) this;
        }

        public Criteria andWorkloadGreaterThanOrEqualTo(String value) {
            addCriterion("workload >=", value, "workload");
            return (Criteria) this;
        }

        public Criteria andWorkloadLessThan(String value) {
            addCriterion("workload <", value, "workload");
            return (Criteria) this;
        }

        public Criteria andWorkloadLessThanOrEqualTo(String value) {
            addCriterion("workload <=", value, "workload");
            return (Criteria) this;
        }

        public Criteria andWorkloadLike(String value) {
            addCriterion("workload like", value, "workload");
            return (Criteria) this;
        }

        public Criteria andWorkloadNotLike(String value) {
            addCriterion("workload not like", value, "workload");
            return (Criteria) this;
        }

        public Criteria andWorkloadIn(List<String> values) {
            addCriterion("workload in", values, "workload");
            return (Criteria) this;
        }

        public Criteria andWorkloadNotIn(List<String> values) {
            addCriterion("workload not in", values, "workload");
            return (Criteria) this;
        }

        public Criteria andWorkloadBetween(String value1, String value2) {
            addCriterion("workload between", value1, value2, "workload");
            return (Criteria) this;
        }

        public Criteria andWorkloadNotBetween(String value1, String value2) {
            addCriterion("workload not between", value1, value2, "workload");
            return (Criteria) this;
        }

        public Criteria andFinishdateIsNull() {
            addCriterion("finishdate is null");
            return (Criteria) this;
        }

        public Criteria andFinishdateIsNotNull() {
            addCriterion("finishdate is not null");
            return (Criteria) this;
        }

        public Criteria andFinishdateEqualTo(Date value) {
            addCriterion("finishdate =", value, "finishdate");
            return (Criteria) this;
        }

        public Criteria andFinishdateNotEqualTo(Date value) {
            addCriterion("finishdate <>", value, "finishdate");
            return (Criteria) this;
        }

        public Criteria andFinishdateGreaterThan(Date value) {
            addCriterion("finishdate >", value, "finishdate");
            return (Criteria) this;
        }

        public Criteria andFinishdateGreaterThanOrEqualTo(Date value) {
            addCriterion("finishdate >=", value, "finishdate");
            return (Criteria) this;
        }

        public Criteria andFinishdateLessThan(Date value) {
            addCriterion("finishdate <", value, "finishdate");
            return (Criteria) this;
        }

        public Criteria andFinishdateLessThanOrEqualTo(Date value) {
            addCriterion("finishdate <=", value, "finishdate");
            return (Criteria) this;
        }

        public Criteria andFinishdateIn(List<Date> values) {
            addCriterion("finishdate in", values, "finishdate");
            return (Criteria) this;
        }

        public Criteria andFinishdateNotIn(List<Date> values) {
            addCriterion("finishdate not in", values, "finishdate");
            return (Criteria) this;
        }

        public Criteria andFinishdateBetween(Date value1, Date value2) {
            addCriterion("finishdate between", value1, value2, "finishdate");
            return (Criteria) this;
        }

        public Criteria andFinishdateNotBetween(Date value1, Date value2) {
            addCriterion("finishdate not between", value1, value2, "finishdate");
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