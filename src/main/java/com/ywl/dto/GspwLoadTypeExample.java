package com.ywl.dto;

import java.util.ArrayList;
import java.util.List;

public class GspwLoadTypeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public GspwLoadTypeExample() {
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

        public Criteria andTypeIdIsNull() {
            addCriterion("type_id is null");
            return (Criteria) this;
        }

        public Criteria andTypeIdIsNotNull() {
            addCriterion("type_id is not null");
            return (Criteria) this;
        }

        public Criteria andTypeIdEqualTo(Integer value) {
            addCriterion("type_id =", value, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdNotEqualTo(Integer value) {
            addCriterion("type_id <>", value, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdGreaterThan(Integer value) {
            addCriterion("type_id >", value, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("type_id >=", value, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdLessThan(Integer value) {
            addCriterion("type_id <", value, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdLessThanOrEqualTo(Integer value) {
            addCriterion("type_id <=", value, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdIn(List<Integer> values) {
            addCriterion("type_id in", values, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdNotIn(List<Integer> values) {
            addCriterion("type_id not in", values, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdBetween(Integer value1, Integer value2) {
            addCriterion("type_id between", value1, value2, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("type_id not between", value1, value2, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeNameIsNull() {
            addCriterion("type_name is null");
            return (Criteria) this;
        }

        public Criteria andTypeNameIsNotNull() {
            addCriterion("type_name is not null");
            return (Criteria) this;
        }

        public Criteria andTypeNameEqualTo(String value) {
            addCriterion("type_name =", value, "typeName");
            return (Criteria) this;
        }

        public Criteria andTypeNameNotEqualTo(String value) {
            addCriterion("type_name <>", value, "typeName");
            return (Criteria) this;
        }

        public Criteria andTypeNameGreaterThan(String value) {
            addCriterion("type_name >", value, "typeName");
            return (Criteria) this;
        }

        public Criteria andTypeNameGreaterThanOrEqualTo(String value) {
            addCriterion("type_name >=", value, "typeName");
            return (Criteria) this;
        }

        public Criteria andTypeNameLessThan(String value) {
            addCriterion("type_name <", value, "typeName");
            return (Criteria) this;
        }

        public Criteria andTypeNameLessThanOrEqualTo(String value) {
            addCriterion("type_name <=", value, "typeName");
            return (Criteria) this;
        }

        public Criteria andTypeNameLike(String value) {
            addCriterion("type_name like", value, "typeName");
            return (Criteria) this;
        }

        public Criteria andTypeNameNotLike(String value) {
            addCriterion("type_name not like", value, "typeName");
            return (Criteria) this;
        }

        public Criteria andTypeNameIn(List<String> values) {
            addCriterion("type_name in", values, "typeName");
            return (Criteria) this;
        }

        public Criteria andTypeNameNotIn(List<String> values) {
            addCriterion("type_name not in", values, "typeName");
            return (Criteria) this;
        }

        public Criteria andTypeNameBetween(String value1, String value2) {
            addCriterion("type_name between", value1, value2, "typeName");
            return (Criteria) this;
        }

        public Criteria andTypeNameNotBetween(String value1, String value2) {
            addCriterion("type_name not between", value1, value2, "typeName");
            return (Criteria) this;
        }

        public Criteria andTypeGradeIsNull() {
            addCriterion("type_grade is null");
            return (Criteria) this;
        }

        public Criteria andTypeGradeIsNotNull() {
            addCriterion("type_grade is not null");
            return (Criteria) this;
        }

        public Criteria andTypeGradeEqualTo(String value) {
            addCriterion("type_grade =", value, "typeGrade");
            return (Criteria) this;
        }

        public Criteria andTypeGradeNotEqualTo(String value) {
            addCriterion("type_grade <>", value, "typeGrade");
            return (Criteria) this;
        }

        public Criteria andTypeGradeGreaterThan(String value) {
            addCriterion("type_grade >", value, "typeGrade");
            return (Criteria) this;
        }

        public Criteria andTypeGradeGreaterThanOrEqualTo(String value) {
            addCriterion("type_grade >=", value, "typeGrade");
            return (Criteria) this;
        }

        public Criteria andTypeGradeLessThan(String value) {
            addCriterion("type_grade <", value, "typeGrade");
            return (Criteria) this;
        }

        public Criteria andTypeGradeLessThanOrEqualTo(String value) {
            addCriterion("type_grade <=", value, "typeGrade");
            return (Criteria) this;
        }

        public Criteria andTypeGradeLike(String value) {
            addCriterion("type_grade like", value, "typeGrade");
            return (Criteria) this;
        }

        public Criteria andTypeGradeNotLike(String value) {
            addCriterion("type_grade not like", value, "typeGrade");
            return (Criteria) this;
        }

        public Criteria andTypeGradeIn(List<String> values) {
            addCriterion("type_grade in", values, "typeGrade");
            return (Criteria) this;
        }

        public Criteria andTypeGradeNotIn(List<String> values) {
            addCriterion("type_grade not in", values, "typeGrade");
            return (Criteria) this;
        }

        public Criteria andTypeGradeBetween(String value1, String value2) {
            addCriterion("type_grade between", value1, value2, "typeGrade");
            return (Criteria) this;
        }

        public Criteria andTypeGradeNotBetween(String value1, String value2) {
            addCriterion("type_grade not between", value1, value2, "typeGrade");
            return (Criteria) this;
        }

        public Criteria andTypeMethodIsNull() {
            addCriterion("type_method is null");
            return (Criteria) this;
        }

        public Criteria andTypeMethodIsNotNull() {
            addCriterion("type_method is not null");
            return (Criteria) this;
        }

        public Criteria andTypeMethodEqualTo(String value) {
            addCriterion("type_method =", value, "typeMethod");
            return (Criteria) this;
        }

        public Criteria andTypeMethodNotEqualTo(String value) {
            addCriterion("type_method <>", value, "typeMethod");
            return (Criteria) this;
        }

        public Criteria andTypeMethodGreaterThan(String value) {
            addCriterion("type_method >", value, "typeMethod");
            return (Criteria) this;
        }

        public Criteria andTypeMethodGreaterThanOrEqualTo(String value) {
            addCriterion("type_method >=", value, "typeMethod");
            return (Criteria) this;
        }

        public Criteria andTypeMethodLessThan(String value) {
            addCriterion("type_method <", value, "typeMethod");
            return (Criteria) this;
        }

        public Criteria andTypeMethodLessThanOrEqualTo(String value) {
            addCriterion("type_method <=", value, "typeMethod");
            return (Criteria) this;
        }

        public Criteria andTypeMethodLike(String value) {
            addCriterion("type_method like", value, "typeMethod");
            return (Criteria) this;
        }

        public Criteria andTypeMethodNotLike(String value) {
            addCriterion("type_method not like", value, "typeMethod");
            return (Criteria) this;
        }

        public Criteria andTypeMethodIn(List<String> values) {
            addCriterion("type_method in", values, "typeMethod");
            return (Criteria) this;
        }

        public Criteria andTypeMethodNotIn(List<String> values) {
            addCriterion("type_method not in", values, "typeMethod");
            return (Criteria) this;
        }

        public Criteria andTypeMethodBetween(String value1, String value2) {
            addCriterion("type_method between", value1, value2, "typeMethod");
            return (Criteria) this;
        }

        public Criteria andTypeMethodNotBetween(String value1, String value2) {
            addCriterion("type_method not between", value1, value2, "typeMethod");
            return (Criteria) this;
        }

        public Criteria andTypeStandardIsNull() {
            addCriterion("type_standard is null");
            return (Criteria) this;
        }

        public Criteria andTypeStandardIsNotNull() {
            addCriterion("type_standard is not null");
            return (Criteria) this;
        }

        public Criteria andTypeStandardEqualTo(String value) {
            addCriterion("type_standard =", value, "typeStandard");
            return (Criteria) this;
        }

        public Criteria andTypeStandardNotEqualTo(String value) {
            addCriterion("type_standard <>", value, "typeStandard");
            return (Criteria) this;
        }

        public Criteria andTypeStandardGreaterThan(String value) {
            addCriterion("type_standard >", value, "typeStandard");
            return (Criteria) this;
        }

        public Criteria andTypeStandardGreaterThanOrEqualTo(String value) {
            addCriterion("type_standard >=", value, "typeStandard");
            return (Criteria) this;
        }

        public Criteria andTypeStandardLessThan(String value) {
            addCriterion("type_standard <", value, "typeStandard");
            return (Criteria) this;
        }

        public Criteria andTypeStandardLessThanOrEqualTo(String value) {
            addCriterion("type_standard <=", value, "typeStandard");
            return (Criteria) this;
        }

        public Criteria andTypeStandardLike(String value) {
            addCriterion("type_standard like", value, "typeStandard");
            return (Criteria) this;
        }

        public Criteria andTypeStandardNotLike(String value) {
            addCriterion("type_standard not like", value, "typeStandard");
            return (Criteria) this;
        }

        public Criteria andTypeStandardIn(List<String> values) {
            addCriterion("type_standard in", values, "typeStandard");
            return (Criteria) this;
        }

        public Criteria andTypeStandardNotIn(List<String> values) {
            addCriterion("type_standard not in", values, "typeStandard");
            return (Criteria) this;
        }

        public Criteria andTypeStandardBetween(String value1, String value2) {
            addCriterion("type_standard between", value1, value2, "typeStandard");
            return (Criteria) this;
        }

        public Criteria andTypeStandardNotBetween(String value1, String value2) {
            addCriterion("type_standard not between", value1, value2, "typeStandard");
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