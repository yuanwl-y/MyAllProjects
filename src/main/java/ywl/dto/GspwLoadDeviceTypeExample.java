package ywl.dto;

import java.util.ArrayList;
import java.util.List;

public class GspwLoadDeviceTypeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public GspwLoadDeviceTypeExample() {
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

        public Criteria andDevicetypeIdIsNull() {
            addCriterion("devicetype_id is null");
            return (Criteria) this;
        }

        public Criteria andDevicetypeIdIsNotNull() {
            addCriterion("devicetype_id is not null");
            return (Criteria) this;
        }

        public Criteria andDevicetypeIdEqualTo(Integer value) {
            addCriterion("devicetype_id =", value, "devicetypeId");
            return (Criteria) this;
        }

        public Criteria andDevicetypeIdNotEqualTo(Integer value) {
            addCriterion("devicetype_id <>", value, "devicetypeId");
            return (Criteria) this;
        }

        public Criteria andDevicetypeIdGreaterThan(Integer value) {
            addCriterion("devicetype_id >", value, "devicetypeId");
            return (Criteria) this;
        }

        public Criteria andDevicetypeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("devicetype_id >=", value, "devicetypeId");
            return (Criteria) this;
        }

        public Criteria andDevicetypeIdLessThan(Integer value) {
            addCriterion("devicetype_id <", value, "devicetypeId");
            return (Criteria) this;
        }

        public Criteria andDevicetypeIdLessThanOrEqualTo(Integer value) {
            addCriterion("devicetype_id <=", value, "devicetypeId");
            return (Criteria) this;
        }

        public Criteria andDevicetypeIdIn(List<Integer> values) {
            addCriterion("devicetype_id in", values, "devicetypeId");
            return (Criteria) this;
        }

        public Criteria andDevicetypeIdNotIn(List<Integer> values) {
            addCriterion("devicetype_id not in", values, "devicetypeId");
            return (Criteria) this;
        }

        public Criteria andDevicetypeIdBetween(Integer value1, Integer value2) {
            addCriterion("devicetype_id between", value1, value2, "devicetypeId");
            return (Criteria) this;
        }

        public Criteria andDevicetypeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("devicetype_id not between", value1, value2, "devicetypeId");
            return (Criteria) this;
        }

        public Criteria andDevicetypeNameIsNull() {
            addCriterion("devicetype_name is null");
            return (Criteria) this;
        }

        public Criteria andDevicetypeNameIsNotNull() {
            addCriterion("devicetype_name is not null");
            return (Criteria) this;
        }

        public Criteria andDevicetypeNameEqualTo(String value) {
            addCriterion("devicetype_name =", value, "devicetypeName");
            return (Criteria) this;
        }

        public Criteria andDevicetypeNameNotEqualTo(String value) {
            addCriterion("devicetype_name <>", value, "devicetypeName");
            return (Criteria) this;
        }

        public Criteria andDevicetypeNameGreaterThan(String value) {
            addCriterion("devicetype_name >", value, "devicetypeName");
            return (Criteria) this;
        }

        public Criteria andDevicetypeNameGreaterThanOrEqualTo(String value) {
            addCriterion("devicetype_name >=", value, "devicetypeName");
            return (Criteria) this;
        }

        public Criteria andDevicetypeNameLessThan(String value) {
            addCriterion("devicetype_name <", value, "devicetypeName");
            return (Criteria) this;
        }

        public Criteria andDevicetypeNameLessThanOrEqualTo(String value) {
            addCriterion("devicetype_name <=", value, "devicetypeName");
            return (Criteria) this;
        }

        public Criteria andDevicetypeNameLike(String value) {
            addCriterion("devicetype_name like", value, "devicetypeName");
            return (Criteria) this;
        }

        public Criteria andDevicetypeNameNotLike(String value) {
            addCriterion("devicetype_name not like", value, "devicetypeName");
            return (Criteria) this;
        }

        public Criteria andDevicetypeNameIn(List<String> values) {
            addCriterion("devicetype_name in", values, "devicetypeName");
            return (Criteria) this;
        }

        public Criteria andDevicetypeNameNotIn(List<String> values) {
            addCriterion("devicetype_name not in", values, "devicetypeName");
            return (Criteria) this;
        }

        public Criteria andDevicetypeNameBetween(String value1, String value2) {
            addCriterion("devicetype_name between", value1, value2, "devicetypeName");
            return (Criteria) this;
        }

        public Criteria andDevicetypeNameNotBetween(String value1, String value2) {
            addCriterion("devicetype_name not between", value1, value2, "devicetypeName");
            return (Criteria) this;
        }

        public Criteria andDeleteMarkIsNull() {
            addCriterion("delete_mark is null");
            return (Criteria) this;
        }

        public Criteria andDeleteMarkIsNotNull() {
            addCriterion("delete_mark is not null");
            return (Criteria) this;
        }

        public Criteria andDeleteMarkEqualTo(Integer value) {
            addCriterion("delete_mark =", value, "deleteMark");
            return (Criteria) this;
        }

        public Criteria andDeleteMarkNotEqualTo(Integer value) {
            addCriterion("delete_mark <>", value, "deleteMark");
            return (Criteria) this;
        }

        public Criteria andDeleteMarkGreaterThan(Integer value) {
            addCriterion("delete_mark >", value, "deleteMark");
            return (Criteria) this;
        }

        public Criteria andDeleteMarkGreaterThanOrEqualTo(Integer value) {
            addCriterion("delete_mark >=", value, "deleteMark");
            return (Criteria) this;
        }

        public Criteria andDeleteMarkLessThan(Integer value) {
            addCriterion("delete_mark <", value, "deleteMark");
            return (Criteria) this;
        }

        public Criteria andDeleteMarkLessThanOrEqualTo(Integer value) {
            addCriterion("delete_mark <=", value, "deleteMark");
            return (Criteria) this;
        }

        public Criteria andDeleteMarkIn(List<Integer> values) {
            addCriterion("delete_mark in", values, "deleteMark");
            return (Criteria) this;
        }

        public Criteria andDeleteMarkNotIn(List<Integer> values) {
            addCriterion("delete_mark not in", values, "deleteMark");
            return (Criteria) this;
        }

        public Criteria andDeleteMarkBetween(Integer value1, Integer value2) {
            addCriterion("delete_mark between", value1, value2, "deleteMark");
            return (Criteria) this;
        }

        public Criteria andDeleteMarkNotBetween(Integer value1, Integer value2) {
            addCriterion("delete_mark not between", value1, value2, "deleteMark");
            return (Criteria) this;
        }

        public Criteria andDeviceStateIsNull() {
            addCriterion("device_state is null");
            return (Criteria) this;
        }

        public Criteria andDeviceStateIsNotNull() {
            addCriterion("device_state is not null");
            return (Criteria) this;
        }

        public Criteria andDeviceStateEqualTo(Integer value) {
            addCriterion("device_state =", value, "deviceState");
            return (Criteria) this;
        }

        public Criteria andDeviceStateNotEqualTo(Integer value) {
            addCriterion("device_state <>", value, "deviceState");
            return (Criteria) this;
        }

        public Criteria andDeviceStateGreaterThan(Integer value) {
            addCriterion("device_state >", value, "deviceState");
            return (Criteria) this;
        }

        public Criteria andDeviceStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("device_state >=", value, "deviceState");
            return (Criteria) this;
        }

        public Criteria andDeviceStateLessThan(Integer value) {
            addCriterion("device_state <", value, "deviceState");
            return (Criteria) this;
        }

        public Criteria andDeviceStateLessThanOrEqualTo(Integer value) {
            addCriterion("device_state <=", value, "deviceState");
            return (Criteria) this;
        }

        public Criteria andDeviceStateIn(List<Integer> values) {
            addCriterion("device_state in", values, "deviceState");
            return (Criteria) this;
        }

        public Criteria andDeviceStateNotIn(List<Integer> values) {
            addCriterion("device_state not in", values, "deviceState");
            return (Criteria) this;
        }

        public Criteria andDeviceStateBetween(Integer value1, Integer value2) {
            addCriterion("device_state between", value1, value2, "deviceState");
            return (Criteria) this;
        }

        public Criteria andDeviceStateNotBetween(Integer value1, Integer value2) {
            addCriterion("device_state not between", value1, value2, "deviceState");
            return (Criteria) this;
        }
    }

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