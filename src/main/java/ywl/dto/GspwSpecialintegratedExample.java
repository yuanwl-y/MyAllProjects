package ywl.dto;

import java.util.ArrayList;
import java.util.List;

public class GspwSpecialintegratedExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public GspwSpecialintegratedExample() {
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

        public Criteria andSpecialIdIsNull() {
            addCriterion("special_id is null");
            return (Criteria) this;
        }

        public Criteria andSpecialIdIsNotNull() {
            addCriterion("special_id is not null");
            return (Criteria) this;
        }

        public Criteria andSpecialIdEqualTo(String value) {
            addCriterion("special_id =", value, "specialId");
            return (Criteria) this;
        }

        public Criteria andSpecialIdNotEqualTo(String value) {
            addCriterion("special_id <>", value, "specialId");
            return (Criteria) this;
        }

        public Criteria andSpecialIdGreaterThan(String value) {
            addCriterion("special_id >", value, "specialId");
            return (Criteria) this;
        }

        public Criteria andSpecialIdGreaterThanOrEqualTo(String value) {
            addCriterion("special_id >=", value, "specialId");
            return (Criteria) this;
        }

        public Criteria andSpecialIdLessThan(String value) {
            addCriterion("special_id <", value, "specialId");
            return (Criteria) this;
        }

        public Criteria andSpecialIdLessThanOrEqualTo(String value) {
            addCriterion("special_id <=", value, "specialId");
            return (Criteria) this;
        }

        public Criteria andSpecialIdLike(String value) {
            addCriterion("special_id like", value, "specialId");
            return (Criteria) this;
        }

        public Criteria andSpecialIdNotLike(String value) {
            addCriterion("special_id not like", value, "specialId");
            return (Criteria) this;
        }

        public Criteria andSpecialIdIn(List<String> values) {
            addCriterion("special_id in", values, "specialId");
            return (Criteria) this;
        }

        public Criteria andSpecialIdNotIn(List<String> values) {
            addCriterion("special_id not in", values, "specialId");
            return (Criteria) this;
        }

        public Criteria andSpecialIdBetween(String value1, String value2) {
            addCriterion("special_id between", value1, value2, "specialId");
            return (Criteria) this;
        }

        public Criteria andSpecialIdNotBetween(String value1, String value2) {
            addCriterion("special_id not between", value1, value2, "specialId");
            return (Criteria) this;
        }

        public Criteria andSpecialNameIsNull() {
            addCriterion("special_name is null");
            return (Criteria) this;
        }

        public Criteria andSpecialNameIsNotNull() {
            addCriterion("special_name is not null");
            return (Criteria) this;
        }

        public Criteria andSpecialNameEqualTo(String value) {
            addCriterion("special_name =", value, "specialName");
            return (Criteria) this;
        }

        public Criteria andSpecialNameNotEqualTo(String value) {
            addCriterion("special_name <>", value, "specialName");
            return (Criteria) this;
        }

        public Criteria andSpecialNameGreaterThan(String value) {
            addCriterion("special_name >", value, "specialName");
            return (Criteria) this;
        }

        public Criteria andSpecialNameGreaterThanOrEqualTo(String value) {
            addCriterion("special_name >=", value, "specialName");
            return (Criteria) this;
        }

        public Criteria andSpecialNameLessThan(String value) {
            addCriterion("special_name <", value, "specialName");
            return (Criteria) this;
        }

        public Criteria andSpecialNameLessThanOrEqualTo(String value) {
            addCriterion("special_name <=", value, "specialName");
            return (Criteria) this;
        }

        public Criteria andSpecialNameLike(String value) {
            addCriterion("special_name like", value, "specialName");
            return (Criteria) this;
        }

        public Criteria andSpecialNameNotLike(String value) {
            addCriterion("special_name not like", value, "specialName");
            return (Criteria) this;
        }

        public Criteria andSpecialNameIn(List<String> values) {
            addCriterion("special_name in", values, "specialName");
            return (Criteria) this;
        }

        public Criteria andSpecialNameNotIn(List<String> values) {
            addCriterion("special_name not in", values, "specialName");
            return (Criteria) this;
        }

        public Criteria andSpecialNameBetween(String value1, String value2) {
            addCriterion("special_name between", value1, value2, "specialName");
            return (Criteria) this;
        }

        public Criteria andSpecialNameNotBetween(String value1, String value2) {
            addCriterion("special_name not between", value1, value2, "specialName");
            return (Criteria) this;
        }

        public Criteria andSpecialYearIsNull() {
            addCriterion("special_year is null");
            return (Criteria) this;
        }

        public Criteria andSpecialYearIsNotNull() {
            addCriterion("special_year is not null");
            return (Criteria) this;
        }

        public Criteria andSpecialYearEqualTo(String value) {
            addCriterion("special_year =", value, "specialYear");
            return (Criteria) this;
        }

        public Criteria andSpecialYearNotEqualTo(String value) {
            addCriterion("special_year <>", value, "specialYear");
            return (Criteria) this;
        }

        public Criteria andSpecialYearGreaterThan(String value) {
            addCriterion("special_year >", value, "specialYear");
            return (Criteria) this;
        }

        public Criteria andSpecialYearGreaterThanOrEqualTo(String value) {
            addCriterion("special_year >=", value, "specialYear");
            return (Criteria) this;
        }

        public Criteria andSpecialYearLessThan(String value) {
            addCriterion("special_year <", value, "specialYear");
            return (Criteria) this;
        }

        public Criteria andSpecialYearLessThanOrEqualTo(String value) {
            addCriterion("special_year <=", value, "specialYear");
            return (Criteria) this;
        }

        public Criteria andSpecialYearLike(String value) {
            addCriterion("special_year like", value, "specialYear");
            return (Criteria) this;
        }

        public Criteria andSpecialYearNotLike(String value) {
            addCriterion("special_year not like", value, "specialYear");
            return (Criteria) this;
        }

        public Criteria andSpecialYearIn(List<String> values) {
            addCriterion("special_year in", values, "specialYear");
            return (Criteria) this;
        }

        public Criteria andSpecialYearNotIn(List<String> values) {
            addCriterion("special_year not in", values, "specialYear");
            return (Criteria) this;
        }

        public Criteria andSpecialYearBetween(String value1, String value2) {
            addCriterion("special_year between", value1, value2, "specialYear");
            return (Criteria) this;
        }

        public Criteria andSpecialYearNotBetween(String value1, String value2) {
            addCriterion("special_year not between", value1, value2, "specialYear");
            return (Criteria) this;
        }

        public Criteria andSpecialStickIsNull() {
            addCriterion("special_stick is null");
            return (Criteria) this;
        }

        public Criteria andSpecialStickIsNotNull() {
            addCriterion("special_stick is not null");
            return (Criteria) this;
        }

        public Criteria andSpecialStickEqualTo(Integer value) {
            addCriterion("special_stick =", value, "specialStick");
            return (Criteria) this;
        }

        public Criteria andSpecialStickNotEqualTo(Integer value) {
            addCriterion("special_stick <>", value, "specialStick");
            return (Criteria) this;
        }

        public Criteria andSpecialStickGreaterThan(Integer value) {
            addCriterion("special_stick >", value, "specialStick");
            return (Criteria) this;
        }

        public Criteria andSpecialStickGreaterThanOrEqualTo(Integer value) {
            addCriterion("special_stick >=", value, "specialStick");
            return (Criteria) this;
        }

        public Criteria andSpecialStickLessThan(Integer value) {
            addCriterion("special_stick <", value, "specialStick");
            return (Criteria) this;
        }

        public Criteria andSpecialStickLessThanOrEqualTo(Integer value) {
            addCriterion("special_stick <=", value, "specialStick");
            return (Criteria) this;
        }

        public Criteria andSpecialStickIn(List<Integer> values) {
            addCriterion("special_stick in", values, "specialStick");
            return (Criteria) this;
        }

        public Criteria andSpecialStickNotIn(List<Integer> values) {
            addCriterion("special_stick not in", values, "specialStick");
            return (Criteria) this;
        }

        public Criteria andSpecialStickBetween(Integer value1, Integer value2) {
            addCriterion("special_stick between", value1, value2, "specialStick");
            return (Criteria) this;
        }

        public Criteria andSpecialStickNotBetween(Integer value1, Integer value2) {
            addCriterion("special_stick not between", value1, value2, "specialStick");
            return (Criteria) this;
        }

        public Criteria andIntegratedIdIsNull() {
            addCriterion("integrated_id is null");
            return (Criteria) this;
        }

        public Criteria andIntegratedIdIsNotNull() {
            addCriterion("integrated_id is not null");
            return (Criteria) this;
        }

        public Criteria andIntegratedIdEqualTo(String value) {
            addCriterion("integrated_id =", value, "integratedId");
            return (Criteria) this;
        }

        public Criteria andIntegratedIdNotEqualTo(String value) {
            addCriterion("integrated_id <>", value, "integratedId");
            return (Criteria) this;
        }

        public Criteria andIntegratedIdGreaterThan(String value) {
            addCriterion("integrated_id >", value, "integratedId");
            return (Criteria) this;
        }

        public Criteria andIntegratedIdGreaterThanOrEqualTo(String value) {
            addCriterion("integrated_id >=", value, "integratedId");
            return (Criteria) this;
        }

        public Criteria andIntegratedIdLessThan(String value) {
            addCriterion("integrated_id <", value, "integratedId");
            return (Criteria) this;
        }

        public Criteria andIntegratedIdLessThanOrEqualTo(String value) {
            addCriterion("integrated_id <=", value, "integratedId");
            return (Criteria) this;
        }

        public Criteria andIntegratedIdLike(String value) {
            addCriterion("integrated_id like", value, "integratedId");
            return (Criteria) this;
        }

        public Criteria andIntegratedIdNotLike(String value) {
            addCriterion("integrated_id not like", value, "integratedId");
            return (Criteria) this;
        }

        public Criteria andIntegratedIdIn(List<String> values) {
            addCriterion("integrated_id in", values, "integratedId");
            return (Criteria) this;
        }

        public Criteria andIntegratedIdNotIn(List<String> values) {
            addCriterion("integrated_id not in", values, "integratedId");
            return (Criteria) this;
        }

        public Criteria andIntegratedIdBetween(String value1, String value2) {
            addCriterion("integrated_id between", value1, value2, "integratedId");
            return (Criteria) this;
        }

        public Criteria andIntegratedIdNotBetween(String value1, String value2) {
            addCriterion("integrated_id not between", value1, value2, "integratedId");
            return (Criteria) this;
        }

        public Criteria andSpecialRemarkIsNull() {
            addCriterion("special_remark is null");
            return (Criteria) this;
        }

        public Criteria andSpecialRemarkIsNotNull() {
            addCriterion("special_remark is not null");
            return (Criteria) this;
        }

        public Criteria andSpecialRemarkEqualTo(String value) {
            addCriterion("special_remark =", value, "specialRemark");
            return (Criteria) this;
        }

        public Criteria andSpecialRemarkNotEqualTo(String value) {
            addCriterion("special_remark <>", value, "specialRemark");
            return (Criteria) this;
        }

        public Criteria andSpecialRemarkGreaterThan(String value) {
            addCriterion("special_remark >", value, "specialRemark");
            return (Criteria) this;
        }

        public Criteria andSpecialRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("special_remark >=", value, "specialRemark");
            return (Criteria) this;
        }

        public Criteria andSpecialRemarkLessThan(String value) {
            addCriterion("special_remark <", value, "specialRemark");
            return (Criteria) this;
        }

        public Criteria andSpecialRemarkLessThanOrEqualTo(String value) {
            addCriterion("special_remark <=", value, "specialRemark");
            return (Criteria) this;
        }

        public Criteria andSpecialRemarkLike(String value) {
            addCriterion("special_remark like", value, "specialRemark");
            return (Criteria) this;
        }

        public Criteria andSpecialRemarkNotLike(String value) {
            addCriterion("special_remark not like", value, "specialRemark");
            return (Criteria) this;
        }

        public Criteria andSpecialRemarkIn(List<String> values) {
            addCriterion("special_remark in", values, "specialRemark");
            return (Criteria) this;
        }

        public Criteria andSpecialRemarkNotIn(List<String> values) {
            addCriterion("special_remark not in", values, "specialRemark");
            return (Criteria) this;
        }

        public Criteria andSpecialRemarkBetween(String value1, String value2) {
            addCriterion("special_remark between", value1, value2, "specialRemark");
            return (Criteria) this;
        }

        public Criteria andSpecialRemarkNotBetween(String value1, String value2) {
            addCriterion("special_remark not between", value1, value2, "specialRemark");
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