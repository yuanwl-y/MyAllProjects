package com.ywl.dto;

import java.util.ArrayList;
import java.util.List;

public class GspwIntegratedprojectExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public GspwIntegratedprojectExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
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

        public Criteria andIntegratedprojectIdIsNull() {
            addCriterion("integratedProject_id is null");
            return (Criteria) this;
        }

        public Criteria andIntegratedprojectIdIsNotNull() {
            addCriterion("integratedProject_id is not null");
            return (Criteria) this;
        }

        public Criteria andIntegratedprojectIdEqualTo(Integer value) {
            addCriterion("integratedProject_id =", value, "integratedprojectId");
            return (Criteria) this;
        }

        public Criteria andIntegratedprojectIdNotEqualTo(Integer value) {
            addCriterion("integratedProject_id <>", value, "integratedprojectId");
            return (Criteria) this;
        }

        public Criteria andIntegratedprojectIdGreaterThan(Integer value) {
            addCriterion("integratedProject_id >", value, "integratedprojectId");
            return (Criteria) this;
        }

        public Criteria andIntegratedprojectIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("integratedProject_id >=", value, "integratedprojectId");
            return (Criteria) this;
        }

        public Criteria andIntegratedprojectIdLessThan(Integer value) {
            addCriterion("integratedProject_id <", value, "integratedprojectId");
            return (Criteria) this;
        }

        public Criteria andIntegratedprojectIdLessThanOrEqualTo(Integer value) {
            addCriterion("integratedProject_id <=", value, "integratedprojectId");
            return (Criteria) this;
        }

        public Criteria andIntegratedprojectIdIn(List<Integer> values) {
            addCriterion("integratedProject_id in", values, "integratedprojectId");
            return (Criteria) this;
        }

        public Criteria andIntegratedprojectIdNotIn(List<Integer> values) {
            addCriterion("integratedProject_id not in", values, "integratedprojectId");
            return (Criteria) this;
        }

        public Criteria andIntegratedprojectIdBetween(Integer value1, Integer value2) {
            addCriterion("integratedProject_id between", value1, value2, "integratedprojectId");
            return (Criteria) this;
        }

        public Criteria andIntegratedprojectIdNotBetween(Integer value1, Integer value2) {
            addCriterion("integratedProject_id not between", value1, value2, "integratedprojectId");
            return (Criteria) this;
        }

        public Criteria andIntegratedprojectNameIsNull() {
            addCriterion("integratedProject_name is null");
            return (Criteria) this;
        }

        public Criteria andIntegratedprojectNameIsNotNull() {
            addCriterion("integratedProject_name is not null");
            return (Criteria) this;
        }

        public Criteria andIntegratedprojectNameEqualTo(String value) {
            addCriterion("integratedProject_name =", value, "integratedprojectName");
            return (Criteria) this;
        }

        public Criteria andIntegratedprojectNameNotEqualTo(String value) {
            addCriterion("integratedProject_name <>", value, "integratedprojectName");
            return (Criteria) this;
        }

        public Criteria andIntegratedprojectNameGreaterThan(String value) {
            addCriterion("integratedProject_name >", value, "integratedprojectName");
            return (Criteria) this;
        }

        public Criteria andIntegratedprojectNameGreaterThanOrEqualTo(String value) {
            addCriterion("integratedProject_name >=", value, "integratedprojectName");
            return (Criteria) this;
        }

        public Criteria andIntegratedprojectNameLessThan(String value) {
            addCriterion("integratedProject_name <", value, "integratedprojectName");
            return (Criteria) this;
        }

        public Criteria andIntegratedprojectNameLessThanOrEqualTo(String value) {
            addCriterion("integratedProject_name <=", value, "integratedprojectName");
            return (Criteria) this;
        }

        public Criteria andIntegratedprojectNameLike(String value) {
            addCriterion("integratedProject_name like", value, "integratedprojectName");
            return (Criteria) this;
        }

        public Criteria andIntegratedprojectNameNotLike(String value) {
            addCriterion("integratedProject_name not like", value, "integratedprojectName");
            return (Criteria) this;
        }

        public Criteria andIntegratedprojectNameIn(List<String> values) {
            addCriterion("integratedProject_name in", values, "integratedprojectName");
            return (Criteria) this;
        }

        public Criteria andIntegratedprojectNameNotIn(List<String> values) {
            addCriterion("integratedProject_name not in", values, "integratedprojectName");
            return (Criteria) this;
        }

        public Criteria andIntegratedprojectNameBetween(String value1, String value2) {
            addCriterion("integratedProject_name between", value1, value2, "integratedprojectName");
            return (Criteria) this;
        }

        public Criteria andIntegratedprojectNameNotBetween(String value1, String value2) {
            addCriterion("integratedProject_name not between", value1, value2, "integratedprojectName");
            return (Criteria) this;
        }

        public Criteria andIntegratedprojectYearIsNull() {
            addCriterion("integratedProject_year is null");
            return (Criteria) this;
        }

        public Criteria andIntegratedprojectYearIsNotNull() {
            addCriterion("integratedProject_year is not null");
            return (Criteria) this;
        }

        public Criteria andIntegratedprojectYearEqualTo(String value) {
            addCriterion("integratedProject_year =", value, "integratedprojectYear");
            return (Criteria) this;
        }

        public Criteria andIntegratedprojectYearNotEqualTo(String value) {
            addCriterion("integratedProject_year <>", value, "integratedprojectYear");
            return (Criteria) this;
        }

        public Criteria andIntegratedprojectYearGreaterThan(String value) {
            addCriterion("integratedProject_year >", value, "integratedprojectYear");
            return (Criteria) this;
        }

        public Criteria andIntegratedprojectYearGreaterThanOrEqualTo(String value) {
            addCriterion("integratedProject_year >=", value, "integratedprojectYear");
            return (Criteria) this;
        }

        public Criteria andIntegratedprojectYearLessThan(String value) {
            addCriterion("integratedProject_year <", value, "integratedprojectYear");
            return (Criteria) this;
        }

        public Criteria andIntegratedprojectYearLessThanOrEqualTo(String value) {
            addCriterion("integratedProject_year <=", value, "integratedprojectYear");
            return (Criteria) this;
        }

        public Criteria andIntegratedprojectYearLike(String value) {
            addCriterion("integratedProject_year like", value, "integratedprojectYear");
            return (Criteria) this;
        }

        public Criteria andIntegratedprojectYearNotLike(String value) {
            addCriterion("integratedProject_year not like", value, "integratedprojectYear");
            return (Criteria) this;
        }

        public Criteria andIntegratedprojectYearIn(List<String> values) {
            addCriterion("integratedProject_year in", values, "integratedprojectYear");
            return (Criteria) this;
        }

        public Criteria andIntegratedprojectYearNotIn(List<String> values) {
            addCriterion("integratedProject_year not in", values, "integratedprojectYear");
            return (Criteria) this;
        }

        public Criteria andIntegratedprojectYearBetween(String value1, String value2) {
            addCriterion("integratedProject_year between", value1, value2, "integratedprojectYear");
            return (Criteria) this;
        }

        public Criteria andIntegratedprojectYearNotBetween(String value1, String value2) {
            addCriterion("integratedProject_year not between", value1, value2, "integratedprojectYear");
            return (Criteria) this;
        }

        public Criteria andIntegratedprojectStateIsNull() {
            addCriterion("integratedProject_state is null");
            return (Criteria) this;
        }

        public Criteria andIntegratedprojectStateIsNotNull() {
            addCriterion("integratedProject_state is not null");
            return (Criteria) this;
        }

        public Criteria andIntegratedprojectStateEqualTo(Integer value) {
            addCriterion("integratedProject_state =", value, "integratedprojectState");
            return (Criteria) this;
        }

        public Criteria andIntegratedprojectStateNotEqualTo(Integer value) {
            addCriterion("integratedProject_state <>", value, "integratedprojectState");
            return (Criteria) this;
        }

        public Criteria andIntegratedprojectStateGreaterThan(Integer value) {
            addCriterion("integratedProject_state >", value, "integratedprojectState");
            return (Criteria) this;
        }

        public Criteria andIntegratedprojectStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("integratedProject_state >=", value, "integratedprojectState");
            return (Criteria) this;
        }

        public Criteria andIntegratedprojectStateLessThan(Integer value) {
            addCriterion("integratedProject_state <", value, "integratedprojectState");
            return (Criteria) this;
        }

        public Criteria andIntegratedprojectStateLessThanOrEqualTo(Integer value) {
            addCriterion("integratedProject_state <=", value, "integratedprojectState");
            return (Criteria) this;
        }

        public Criteria andIntegratedprojectStateIn(List<Integer> values) {
            addCriterion("integratedProject_state in", values, "integratedprojectState");
            return (Criteria) this;
        }

        public Criteria andIntegratedprojectStateNotIn(List<Integer> values) {
            addCriterion("integratedProject_state not in", values, "integratedprojectState");
            return (Criteria) this;
        }

        public Criteria andIntegratedprojectStateBetween(Integer value1, Integer value2) {
            addCriterion("integratedProject_state between", value1, value2, "integratedprojectState");
            return (Criteria) this;
        }

        public Criteria andIntegratedprojectStateNotBetween(Integer value1, Integer value2) {
            addCriterion("integratedProject_state not between", value1, value2, "integratedprojectState");
            return (Criteria) this;
        }

        public Criteria andIntegratedprojectStickIsNull() {
            addCriterion("integratedProject_stick is null");
            return (Criteria) this;
        }

        public Criteria andIntegratedprojectStickIsNotNull() {
            addCriterion("integratedProject_stick is not null");
            return (Criteria) this;
        }

        public Criteria andIntegratedprojectStickEqualTo(Integer value) {
            addCriterion("integratedProject_stick =", value, "integratedprojectStick");
            return (Criteria) this;
        }

        public Criteria andIntegratedprojectStickNotEqualTo(Integer value) {
            addCriterion("integratedProject_stick <>", value, "integratedprojectStick");
            return (Criteria) this;
        }

        public Criteria andIntegratedprojectStickGreaterThan(Integer value) {
            addCriterion("integratedProject_stick >", value, "integratedprojectStick");
            return (Criteria) this;
        }

        public Criteria andIntegratedprojectStickGreaterThanOrEqualTo(Integer value) {
            addCriterion("integratedProject_stick >=", value, "integratedprojectStick");
            return (Criteria) this;
        }

        public Criteria andIntegratedprojectStickLessThan(Integer value) {
            addCriterion("integratedProject_stick <", value, "integratedprojectStick");
            return (Criteria) this;
        }

        public Criteria andIntegratedprojectStickLessThanOrEqualTo(Integer value) {
            addCriterion("integratedProject_stick <=", value, "integratedprojectStick");
            return (Criteria) this;
        }

        public Criteria andIntegratedprojectStickIn(List<Integer> values) {
            addCriterion("integratedProject_stick in", values, "integratedprojectStick");
            return (Criteria) this;
        }

        public Criteria andIntegratedprojectStickNotIn(List<Integer> values) {
            addCriterion("integratedProject_stick not in", values, "integratedprojectStick");
            return (Criteria) this;
        }

        public Criteria andIntegratedprojectStickBetween(Integer value1, Integer value2) {
            addCriterion("integratedProject_stick between", value1, value2, "integratedprojectStick");
            return (Criteria) this;
        }

        public Criteria andIntegratedprojectStickNotBetween(Integer value1, Integer value2) {
            addCriterion("integratedProject_stick not between", value1, value2, "integratedprojectStick");
            return (Criteria) this;
        }

        public Criteria andDeletemarkIsNull() {
            addCriterion("deleteMark is null");
            return (Criteria) this;
        }

        public Criteria andDeletemarkIsNotNull() {
            addCriterion("deleteMark is not null");
            return (Criteria) this;
        }

        public Criteria andDeletemarkEqualTo(Integer value) {
            addCriterion("deleteMark =", value, "deletemark");
            return (Criteria) this;
        }

        public Criteria andDeletemarkNotEqualTo(Integer value) {
            addCriterion("deleteMark <>", value, "deletemark");
            return (Criteria) this;
        }

        public Criteria andDeletemarkGreaterThan(Integer value) {
            addCriterion("deleteMark >", value, "deletemark");
            return (Criteria) this;
        }

        public Criteria andDeletemarkGreaterThanOrEqualTo(Integer value) {
            addCriterion("deleteMark >=", value, "deletemark");
            return (Criteria) this;
        }

        public Criteria andDeletemarkLessThan(Integer value) {
            addCriterion("deleteMark <", value, "deletemark");
            return (Criteria) this;
        }

        public Criteria andDeletemarkLessThanOrEqualTo(Integer value) {
            addCriterion("deleteMark <=", value, "deletemark");
            return (Criteria) this;
        }

        public Criteria andDeletemarkIn(List<Integer> values) {
            addCriterion("deleteMark in", values, "deletemark");
            return (Criteria) this;
        }

        public Criteria andDeletemarkNotIn(List<Integer> values) {
            addCriterion("deleteMark not in", values, "deletemark");
            return (Criteria) this;
        }

        public Criteria andDeletemarkBetween(Integer value1, Integer value2) {
            addCriterion("deleteMark between", value1, value2, "deletemark");
            return (Criteria) this;
        }

        public Criteria andDeletemarkNotBetween(Integer value1, Integer value2) {
            addCriterion("deleteMark not between", value1, value2, "deletemark");
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
    }
}