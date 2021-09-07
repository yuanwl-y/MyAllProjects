package com.ywl.dto;

import java.util.ArrayList;
import java.util.List;

public class GspwOrgnatureExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public GspwOrgnatureExample() {
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

        public Criteria andNatureIdIsNull() {
            addCriterion("nature_id is null");
            return (Criteria) this;
        }

        public Criteria andNatureIdIsNotNull() {
            addCriterion("nature_id is not null");
            return (Criteria) this;
        }

        public Criteria andNatureIdEqualTo(Integer value) {
            addCriterion("nature_id =", value, "natureId");
            return (Criteria) this;
        }

        public Criteria andNatureIdNotEqualTo(Integer value) {
            addCriterion("nature_id <>", value, "natureId");
            return (Criteria) this;
        }

        public Criteria andNatureIdGreaterThan(Integer value) {
            addCriterion("nature_id >", value, "natureId");
            return (Criteria) this;
        }

        public Criteria andNatureIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("nature_id >=", value, "natureId");
            return (Criteria) this;
        }

        public Criteria andNatureIdLessThan(Integer value) {
            addCriterion("nature_id <", value, "natureId");
            return (Criteria) this;
        }

        public Criteria andNatureIdLessThanOrEqualTo(Integer value) {
            addCriterion("nature_id <=", value, "natureId");
            return (Criteria) this;
        }

        public Criteria andNatureIdIn(List<Integer> values) {
            addCriterion("nature_id in", values, "natureId");
            return (Criteria) this;
        }

        public Criteria andNatureIdNotIn(List<Integer> values) {
            addCriterion("nature_id not in", values, "natureId");
            return (Criteria) this;
        }

        public Criteria andNatureIdBetween(Integer value1, Integer value2) {
            addCriterion("nature_id between", value1, value2, "natureId");
            return (Criteria) this;
        }

        public Criteria andNatureIdNotBetween(Integer value1, Integer value2) {
            addCriterion("nature_id not between", value1, value2, "natureId");
            return (Criteria) this;
        }

        public Criteria andNatureOrgnameIsNull() {
            addCriterion("nature_orgname is null");
            return (Criteria) this;
        }

        public Criteria andNatureOrgnameIsNotNull() {
            addCriterion("nature_orgname is not null");
            return (Criteria) this;
        }

        public Criteria andNatureOrgnameEqualTo(String value) {
            addCriterion("nature_orgname =", value, "natureOrgname");
            return (Criteria) this;
        }

        public Criteria andNatureOrgnameNotEqualTo(String value) {
            addCriterion("nature_orgname <>", value, "natureOrgname");
            return (Criteria) this;
        }

        public Criteria andNatureOrgnameGreaterThan(String value) {
            addCriterion("nature_orgname >", value, "natureOrgname");
            return (Criteria) this;
        }

        public Criteria andNatureOrgnameGreaterThanOrEqualTo(String value) {
            addCriterion("nature_orgname >=", value, "natureOrgname");
            return (Criteria) this;
        }

        public Criteria andNatureOrgnameLessThan(String value) {
            addCriterion("nature_orgname <", value, "natureOrgname");
            return (Criteria) this;
        }

        public Criteria andNatureOrgnameLessThanOrEqualTo(String value) {
            addCriterion("nature_orgname <=", value, "natureOrgname");
            return (Criteria) this;
        }

        public Criteria andNatureOrgnameLike(String value) {
            addCriterion("nature_orgname like", value, "natureOrgname");
            return (Criteria) this;
        }

        public Criteria andNatureOrgnameNotLike(String value) {
            addCriterion("nature_orgname not like", value, "natureOrgname");
            return (Criteria) this;
        }

        public Criteria andNatureOrgnameIn(List<String> values) {
            addCriterion("nature_orgname in", values, "natureOrgname");
            return (Criteria) this;
        }

        public Criteria andNatureOrgnameNotIn(List<String> values) {
            addCriterion("nature_orgname not in", values, "natureOrgname");
            return (Criteria) this;
        }

        public Criteria andNatureOrgnameBetween(String value1, String value2) {
            addCriterion("nature_orgname between", value1, value2, "natureOrgname");
            return (Criteria) this;
        }

        public Criteria andNatureOrgnameNotBetween(String value1, String value2) {
            addCriterion("nature_orgname not between", value1, value2, "natureOrgname");
            return (Criteria) this;
        }

        public Criteria andNatureNameIsNull() {
            addCriterion("nature_name is null");
            return (Criteria) this;
        }

        public Criteria andNatureNameIsNotNull() {
            addCriterion("nature_name is not null");
            return (Criteria) this;
        }

        public Criteria andNatureNameEqualTo(String value) {
            addCriterion("nature_name =", value, "natureName");
            return (Criteria) this;
        }

        public Criteria andNatureNameNotEqualTo(String value) {
            addCriterion("nature_name <>", value, "natureName");
            return (Criteria) this;
        }

        public Criteria andNatureNameGreaterThan(String value) {
            addCriterion("nature_name >", value, "natureName");
            return (Criteria) this;
        }

        public Criteria andNatureNameGreaterThanOrEqualTo(String value) {
            addCriterion("nature_name >=", value, "natureName");
            return (Criteria) this;
        }

        public Criteria andNatureNameLessThan(String value) {
            addCriterion("nature_name <", value, "natureName");
            return (Criteria) this;
        }

        public Criteria andNatureNameLessThanOrEqualTo(String value) {
            addCriterion("nature_name <=", value, "natureName");
            return (Criteria) this;
        }

        public Criteria andNatureNameLike(String value) {
            addCriterion("nature_name like", value, "natureName");
            return (Criteria) this;
        }

        public Criteria andNatureNameNotLike(String value) {
            addCriterion("nature_name not like", value, "natureName");
            return (Criteria) this;
        }

        public Criteria andNatureNameIn(List<String> values) {
            addCriterion("nature_name in", values, "natureName");
            return (Criteria) this;
        }

        public Criteria andNatureNameNotIn(List<String> values) {
            addCriterion("nature_name not in", values, "natureName");
            return (Criteria) this;
        }

        public Criteria andNatureNameBetween(String value1, String value2) {
            addCriterion("nature_name between", value1, value2, "natureName");
            return (Criteria) this;
        }

        public Criteria andNatureNameNotBetween(String value1, String value2) {
            addCriterion("nature_name not between", value1, value2, "natureName");
            return (Criteria) this;
        }

        public Criteria andNatureAbbreviationIsNull() {
            addCriterion("nature_abbreviation is null");
            return (Criteria) this;
        }

        public Criteria andNatureAbbreviationIsNotNull() {
            addCriterion("nature_abbreviation is not null");
            return (Criteria) this;
        }

        public Criteria andNatureAbbreviationEqualTo(String value) {
            addCriterion("nature_abbreviation =", value, "natureAbbreviation");
            return (Criteria) this;
        }

        public Criteria andNatureAbbreviationNotEqualTo(String value) {
            addCriterion("nature_abbreviation <>", value, "natureAbbreviation");
            return (Criteria) this;
        }

        public Criteria andNatureAbbreviationGreaterThan(String value) {
            addCriterion("nature_abbreviation >", value, "natureAbbreviation");
            return (Criteria) this;
        }

        public Criteria andNatureAbbreviationGreaterThanOrEqualTo(String value) {
            addCriterion("nature_abbreviation >=", value, "natureAbbreviation");
            return (Criteria) this;
        }

        public Criteria andNatureAbbreviationLessThan(String value) {
            addCriterion("nature_abbreviation <", value, "natureAbbreviation");
            return (Criteria) this;
        }

        public Criteria andNatureAbbreviationLessThanOrEqualTo(String value) {
            addCriterion("nature_abbreviation <=", value, "natureAbbreviation");
            return (Criteria) this;
        }

        public Criteria andNatureAbbreviationLike(String value) {
            addCriterion("nature_abbreviation like", value, "natureAbbreviation");
            return (Criteria) this;
        }

        public Criteria andNatureAbbreviationNotLike(String value) {
            addCriterion("nature_abbreviation not like", value, "natureAbbreviation");
            return (Criteria) this;
        }

        public Criteria andNatureAbbreviationIn(List<String> values) {
            addCriterion("nature_abbreviation in", values, "natureAbbreviation");
            return (Criteria) this;
        }

        public Criteria andNatureAbbreviationNotIn(List<String> values) {
            addCriterion("nature_abbreviation not in", values, "natureAbbreviation");
            return (Criteria) this;
        }

        public Criteria andNatureAbbreviationBetween(String value1, String value2) {
            addCriterion("nature_abbreviation between", value1, value2, "natureAbbreviation");
            return (Criteria) this;
        }

        public Criteria andNatureAbbreviationNotBetween(String value1, String value2) {
            addCriterion("nature_abbreviation not between", value1, value2, "natureAbbreviation");
            return (Criteria) this;
        }

        public Criteria andNatureCodeIsNull() {
            addCriterion("nature_code is null");
            return (Criteria) this;
        }

        public Criteria andNatureCodeIsNotNull() {
            addCriterion("nature_code is not null");
            return (Criteria) this;
        }

        public Criteria andNatureCodeEqualTo(String value) {
            addCriterion("nature_code =", value, "natureCode");
            return (Criteria) this;
        }

        public Criteria andNatureCodeNotEqualTo(String value) {
            addCriterion("nature_code <>", value, "natureCode");
            return (Criteria) this;
        }

        public Criteria andNatureCodeGreaterThan(String value) {
            addCriterion("nature_code >", value, "natureCode");
            return (Criteria) this;
        }

        public Criteria andNatureCodeGreaterThanOrEqualTo(String value) {
            addCriterion("nature_code >=", value, "natureCode");
            return (Criteria) this;
        }

        public Criteria andNatureCodeLessThan(String value) {
            addCriterion("nature_code <", value, "natureCode");
            return (Criteria) this;
        }

        public Criteria andNatureCodeLessThanOrEqualTo(String value) {
            addCriterion("nature_code <=", value, "natureCode");
            return (Criteria) this;
        }

        public Criteria andNatureCodeLike(String value) {
            addCriterion("nature_code like", value, "natureCode");
            return (Criteria) this;
        }

        public Criteria andNatureCodeNotLike(String value) {
            addCriterion("nature_code not like", value, "natureCode");
            return (Criteria) this;
        }

        public Criteria andNatureCodeIn(List<String> values) {
            addCriterion("nature_code in", values, "natureCode");
            return (Criteria) this;
        }

        public Criteria andNatureCodeNotIn(List<String> values) {
            addCriterion("nature_code not in", values, "natureCode");
            return (Criteria) this;
        }

        public Criteria andNatureCodeBetween(String value1, String value2) {
            addCriterion("nature_code between", value1, value2, "natureCode");
            return (Criteria) this;
        }

        public Criteria andNatureCodeNotBetween(String value1, String value2) {
            addCriterion("nature_code not between", value1, value2, "natureCode");
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