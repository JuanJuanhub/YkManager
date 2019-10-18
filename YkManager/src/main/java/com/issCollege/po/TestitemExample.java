package com.issCollege.po;

import java.util.ArrayList;
import java.util.List;

public class TestitemExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Long offset;

    public TestitemExample() {
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

        public Criteria andItemIdIsNull() {
            addCriterion("item_id is null");
            return (Criteria) this;
        }

        public Criteria andItemIdIsNotNull() {
            addCriterion("item_id is not null");
            return (Criteria) this;
        }

        public Criteria andItemIdEqualTo(Long value) {
            addCriterion("item_id =", value, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdNotEqualTo(Long value) {
            addCriterion("item_id <>", value, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdGreaterThan(Long value) {
            addCriterion("item_id >", value, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdGreaterThanOrEqualTo(Long value) {
            addCriterion("item_id >=", value, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdLessThan(Long value) {
            addCriterion("item_id <", value, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdLessThanOrEqualTo(Long value) {
            addCriterion("item_id <=", value, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdIn(List<Long> values) {
            addCriterion("item_id in", values, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdNotIn(List<Long> values) {
            addCriterion("item_id not in", values, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdBetween(Long value1, Long value2) {
            addCriterion("item_id between", value1, value2, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdNotBetween(Long value1, Long value2) {
            addCriterion("item_id not between", value1, value2, "itemId");
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

        public Criteria andItemNameEqualTo(String value) {
            addCriterion("item_name =", value, "itemName");
            return (Criteria) this;
        }

        public Criteria andItemNameNotEqualTo(String value) {
            addCriterion("item_name <>", value, "itemName");
            return (Criteria) this;
        }

        public Criteria andItemNameGreaterThan(String value) {
            addCriterion("item_name >", value, "itemName");
            return (Criteria) this;
        }

        public Criteria andItemNameGreaterThanOrEqualTo(String value) {
            addCriterion("item_name >=", value, "itemName");
            return (Criteria) this;
        }

        public Criteria andItemNameLessThan(String value) {
            addCriterion("item_name <", value, "itemName");
            return (Criteria) this;
        }

        public Criteria andItemNameLessThanOrEqualTo(String value) {
            addCriterion("item_name <=", value, "itemName");
            return (Criteria) this;
        }

        public Criteria andItemNameLike(String value) {
            addCriterion("item_name like", value, "itemName");
            return (Criteria) this;
        }

        public Criteria andItemNameNotLike(String value) {
            addCriterion("item_name not like", value, "itemName");
            return (Criteria) this;
        }

        public Criteria andItemNameIn(List<String> values) {
            addCriterion("item_name in", values, "itemName");
            return (Criteria) this;
        }

        public Criteria andItemNameNotIn(List<String> values) {
            addCriterion("item_name not in", values, "itemName");
            return (Criteria) this;
        }

        public Criteria andItemNameBetween(String value1, String value2) {
            addCriterion("item_name between", value1, value2, "itemName");
            return (Criteria) this;
        }

        public Criteria andItemNameNotBetween(String value1, String value2) {
            addCriterion("item_name not between", value1, value2, "itemName");
            return (Criteria) this;
        }

        public Criteria andItemPriceIsNull() {
            addCriterion("item_price is null");
            return (Criteria) this;
        }

        public Criteria andItemPriceIsNotNull() {
            addCriterion("item_price is not null");
            return (Criteria) this;
        }

        public Criteria andItemPriceEqualTo(Float value) {
            addCriterion("item_price =", value, "itemPrice");
            return (Criteria) this;
        }

        public Criteria andItemPriceNotEqualTo(Float value) {
            addCriterion("item_price <>", value, "itemPrice");
            return (Criteria) this;
        }

        public Criteria andItemPriceGreaterThan(Float value) {
            addCriterion("item_price >", value, "itemPrice");
            return (Criteria) this;
        }

        public Criteria andItemPriceGreaterThanOrEqualTo(Float value) {
            addCriterion("item_price >=", value, "itemPrice");
            return (Criteria) this;
        }

        public Criteria andItemPriceLessThan(Float value) {
            addCriterion("item_price <", value, "itemPrice");
            return (Criteria) this;
        }

        public Criteria andItemPriceLessThanOrEqualTo(Float value) {
            addCriterion("item_price <=", value, "itemPrice");
            return (Criteria) this;
        }

        public Criteria andItemPriceIn(List<Float> values) {
            addCriterion("item_price in", values, "itemPrice");
            return (Criteria) this;
        }

        public Criteria andItemPriceNotIn(List<Float> values) {
            addCriterion("item_price not in", values, "itemPrice");
            return (Criteria) this;
        }

        public Criteria andItemPriceBetween(Float value1, Float value2) {
            addCriterion("item_price between", value1, value2, "itemPrice");
            return (Criteria) this;
        }

        public Criteria andItemPriceNotBetween(Float value1, Float value2) {
            addCriterion("item_price not between", value1, value2, "itemPrice");
            return (Criteria) this;
        }

        public Criteria andItemAmountIsNull() {
            addCriterion("item_amount is null");
            return (Criteria) this;
        }

        public Criteria andItemAmountIsNotNull() {
            addCriterion("item_amount is not null");
            return (Criteria) this;
        }

        public Criteria andItemAmountEqualTo(Long value) {
            addCriterion("item_amount =", value, "itemAmount");
            return (Criteria) this;
        }

        public Criteria andItemAmountNotEqualTo(Long value) {
            addCriterion("item_amount <>", value, "itemAmount");
            return (Criteria) this;
        }

        public Criteria andItemAmountGreaterThan(Long value) {
            addCriterion("item_amount >", value, "itemAmount");
            return (Criteria) this;
        }

        public Criteria andItemAmountGreaterThanOrEqualTo(Long value) {
            addCriterion("item_amount >=", value, "itemAmount");
            return (Criteria) this;
        }

        public Criteria andItemAmountLessThan(Long value) {
            addCriterion("item_amount <", value, "itemAmount");
            return (Criteria) this;
        }

        public Criteria andItemAmountLessThanOrEqualTo(Long value) {
            addCriterion("item_amount <=", value, "itemAmount");
            return (Criteria) this;
        }

        public Criteria andItemAmountIn(List<Long> values) {
            addCriterion("item_amount in", values, "itemAmount");
            return (Criteria) this;
        }

        public Criteria andItemAmountNotIn(List<Long> values) {
            addCriterion("item_amount not in", values, "itemAmount");
            return (Criteria) this;
        }

        public Criteria andItemAmountBetween(Long value1, Long value2) {
            addCriterion("item_amount between", value1, value2, "itemAmount");
            return (Criteria) this;
        }

        public Criteria andItemAmountNotBetween(Long value1, Long value2) {
            addCriterion("item_amount not between", value1, value2, "itemAmount");
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

        public Criteria andRockTypeEqualTo(String value) {
            addCriterion("rock_type =", value, "rockType");
            return (Criteria) this;
        }

        public Criteria andRockTypeNotEqualTo(String value) {
            addCriterion("rock_type <>", value, "rockType");
            return (Criteria) this;
        }

        public Criteria andRockTypeGreaterThan(String value) {
            addCriterion("rock_type >", value, "rockType");
            return (Criteria) this;
        }

        public Criteria andRockTypeGreaterThanOrEqualTo(String value) {
            addCriterion("rock_type >=", value, "rockType");
            return (Criteria) this;
        }

        public Criteria andRockTypeLessThan(String value) {
            addCriterion("rock_type <", value, "rockType");
            return (Criteria) this;
        }

        public Criteria andRockTypeLessThanOrEqualTo(String value) {
            addCriterion("rock_type <=", value, "rockType");
            return (Criteria) this;
        }

        public Criteria andRockTypeLike(String value) {
            addCriterion("rock_type like", value, "rockType");
            return (Criteria) this;
        }

        public Criteria andRockTypeNotLike(String value) {
            addCriterion("rock_type not like", value, "rockType");
            return (Criteria) this;
        }

        public Criteria andRockTypeIn(List<String> values) {
            addCriterion("rock_type in", values, "rockType");
            return (Criteria) this;
        }

        public Criteria andRockTypeNotIn(List<String> values) {
            addCriterion("rock_type not in", values, "rockType");
            return (Criteria) this;
        }

        public Criteria andRockTypeBetween(String value1, String value2) {
            addCriterion("rock_type between", value1, value2, "rockType");
            return (Criteria) this;
        }

        public Criteria andRockTypeNotBetween(String value1, String value2) {
            addCriterion("rock_type not between", value1, value2, "rockType");
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

        public Criteria andItemMethodEqualTo(String value) {
            addCriterion("item_method =", value, "itemMethod");
            return (Criteria) this;
        }

        public Criteria andItemMethodNotEqualTo(String value) {
            addCriterion("item_method <>", value, "itemMethod");
            return (Criteria) this;
        }

        public Criteria andItemMethodGreaterThan(String value) {
            addCriterion("item_method >", value, "itemMethod");
            return (Criteria) this;
        }

        public Criteria andItemMethodGreaterThanOrEqualTo(String value) {
            addCriterion("item_method >=", value, "itemMethod");
            return (Criteria) this;
        }

        public Criteria andItemMethodLessThan(String value) {
            addCriterion("item_method <", value, "itemMethod");
            return (Criteria) this;
        }

        public Criteria andItemMethodLessThanOrEqualTo(String value) {
            addCriterion("item_method <=", value, "itemMethod");
            return (Criteria) this;
        }

        public Criteria andItemMethodLike(String value) {
            addCriterion("item_method like", value, "itemMethod");
            return (Criteria) this;
        }

        public Criteria andItemMethodNotLike(String value) {
            addCriterion("item_method not like", value, "itemMethod");
            return (Criteria) this;
        }

        public Criteria andItemMethodIn(List<String> values) {
            addCriterion("item_method in", values, "itemMethod");
            return (Criteria) this;
        }

        public Criteria andItemMethodNotIn(List<String> values) {
            addCriterion("item_method not in", values, "itemMethod");
            return (Criteria) this;
        }

        public Criteria andItemMethodBetween(String value1, String value2) {
            addCriterion("item_method between", value1, value2, "itemMethod");
            return (Criteria) this;
        }

        public Criteria andItemMethodNotBetween(String value1, String value2) {
            addCriterion("item_method not between", value1, value2, "itemMethod");
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