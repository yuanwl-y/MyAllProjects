package ywl.dto;

import java.util.ArrayList;
import java.util.List;

public class GspwLoadTypeGradeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public GspwLoadTypeGradeExample() {
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

        public Criteria andGradeIdIsNull() {
            addCriterion("grade_id is null");
            return (Criteria) this;
        }

        public Criteria andGradeIdIsNotNull() {
            addCriterion("grade_id is not null");
            return (Criteria) this;
        }

        public Criteria andGradeIdEqualTo(Integer value) {
            addCriterion("grade_id =", value, "gradeId");
            return (Criteria) this;
        }

        public Criteria andGradeIdNotEqualTo(Integer value) {
            addCriterion("grade_id <>", value, "gradeId");
            return (Criteria) this;
        }

        public Criteria andGradeIdGreaterThan(Integer value) {
            addCriterion("grade_id >", value, "gradeId");
            return (Criteria) this;
        }

        public Criteria andGradeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("grade_id >=", value, "gradeId");
            return (Criteria) this;
        }

        public Criteria andGradeIdLessThan(Integer value) {
            addCriterion("grade_id <", value, "gradeId");
            return (Criteria) this;
        }

        public Criteria andGradeIdLessThanOrEqualTo(Integer value) {
            addCriterion("grade_id <=", value, "gradeId");
            return (Criteria) this;
        }

        public Criteria andGradeIdIn(List<Integer> values) {
            addCriterion("grade_id in", values, "gradeId");
            return (Criteria) this;
        }

        public Criteria andGradeIdNotIn(List<Integer> values) {
            addCriterion("grade_id not in", values, "gradeId");
            return (Criteria) this;
        }

        public Criteria andGradeIdBetween(Integer value1, Integer value2) {
            addCriterion("grade_id between", value1, value2, "gradeId");
            return (Criteria) this;
        }

        public Criteria andGradeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("grade_id not between", value1, value2, "gradeId");
            return (Criteria) this;
        }

        public Criteria andGradeVoIsNull() {
            addCriterion("grade_vo is null");
            return (Criteria) this;
        }

        public Criteria andGradeVoIsNotNull() {
            addCriterion("grade_vo is not null");
            return (Criteria) this;
        }

        public Criteria andGradeVoEqualTo(Integer value) {
            addCriterion("grade_vo =", value, "gradeVo");
            return (Criteria) this;
        }

        public Criteria andGradeVoNotEqualTo(Integer value) {
            addCriterion("grade_vo <>", value, "gradeVo");
            return (Criteria) this;
        }

        public Criteria andGradeVoGreaterThan(Integer value) {
            addCriterion("grade_vo >", value, "gradeVo");
            return (Criteria) this;
        }

        public Criteria andGradeVoGreaterThanOrEqualTo(Integer value) {
            addCriterion("grade_vo >=", value, "gradeVo");
            return (Criteria) this;
        }

        public Criteria andGradeVoLessThan(Integer value) {
            addCriterion("grade_vo <", value, "gradeVo");
            return (Criteria) this;
        }

        public Criteria andGradeVoLessThanOrEqualTo(Integer value) {
            addCriterion("grade_vo <=", value, "gradeVo");
            return (Criteria) this;
        }

        public Criteria andGradeVoIn(List<Integer> values) {
            addCriterion("grade_vo in", values, "gradeVo");
            return (Criteria) this;
        }

        public Criteria andGradeVoNotIn(List<Integer> values) {
            addCriterion("grade_vo not in", values, "gradeVo");
            return (Criteria) this;
        }

        public Criteria andGradeVoBetween(Integer value1, Integer value2) {
            addCriterion("grade_vo between", value1, value2, "gradeVo");
            return (Criteria) this;
        }

        public Criteria andGradeVoNotBetween(Integer value1, Integer value2) {
            addCriterion("grade_vo not between", value1, value2, "gradeVo");
            return (Criteria) this;
        }

        public Criteria andGradeUrlIsNull() {
            addCriterion("grade_url is null");
            return (Criteria) this;
        }

        public Criteria andGradeUrlIsNotNull() {
            addCriterion("grade_url is not null");
            return (Criteria) this;
        }

        public Criteria andGradeUrlEqualTo(String value) {
            addCriterion("grade_url =", value, "gradeUrl");
            return (Criteria) this;
        }

        public Criteria andGradeUrlNotEqualTo(String value) {
            addCriterion("grade_url <>", value, "gradeUrl");
            return (Criteria) this;
        }

        public Criteria andGradeUrlGreaterThan(String value) {
            addCriterion("grade_url >", value, "gradeUrl");
            return (Criteria) this;
        }

        public Criteria andGradeUrlGreaterThanOrEqualTo(String value) {
            addCriterion("grade_url >=", value, "gradeUrl");
            return (Criteria) this;
        }

        public Criteria andGradeUrlLessThan(String value) {
            addCriterion("grade_url <", value, "gradeUrl");
            return (Criteria) this;
        }

        public Criteria andGradeUrlLessThanOrEqualTo(String value) {
            addCriterion("grade_url <=", value, "gradeUrl");
            return (Criteria) this;
        }

        public Criteria andGradeUrlLike(String value) {
            addCriterion("grade_url like", value, "gradeUrl");
            return (Criteria) this;
        }

        public Criteria andGradeUrlNotLike(String value) {
            addCriterion("grade_url not like", value, "gradeUrl");
            return (Criteria) this;
        }

        public Criteria andGradeUrlIn(List<String> values) {
            addCriterion("grade_url in", values, "gradeUrl");
            return (Criteria) this;
        }

        public Criteria andGradeUrlNotIn(List<String> values) {
            addCriterion("grade_url not in", values, "gradeUrl");
            return (Criteria) this;
        }

        public Criteria andGradeUrlBetween(String value1, String value2) {
            addCriterion("grade_url between", value1, value2, "gradeUrl");
            return (Criteria) this;
        }

        public Criteria andGradeUrlNotBetween(String value1, String value2) {
            addCriterion("grade_url not between", value1, value2, "gradeUrl");
            return (Criteria) this;
        }

        public Criteria andGradeTypeIdIsNull() {
            addCriterion("grade_type_id is null");
            return (Criteria) this;
        }

        public Criteria andGradeTypeIdIsNotNull() {
            addCriterion("grade_type_id is not null");
            return (Criteria) this;
        }

        public Criteria andGradeTypeIdEqualTo(Integer value) {
            addCriterion("grade_type_id =", value, "gradeTypeId");
            return (Criteria) this;
        }

        public Criteria andGradeTypeIdNotEqualTo(Integer value) {
            addCriterion("grade_type_id <>", value, "gradeTypeId");
            return (Criteria) this;
        }

        public Criteria andGradeTypeIdGreaterThan(Integer value) {
            addCriterion("grade_type_id >", value, "gradeTypeId");
            return (Criteria) this;
        }

        public Criteria andGradeTypeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("grade_type_id >=", value, "gradeTypeId");
            return (Criteria) this;
        }

        public Criteria andGradeTypeIdLessThan(Integer value) {
            addCriterion("grade_type_id <", value, "gradeTypeId");
            return (Criteria) this;
        }

        public Criteria andGradeTypeIdLessThanOrEqualTo(Integer value) {
            addCriterion("grade_type_id <=", value, "gradeTypeId");
            return (Criteria) this;
        }

        public Criteria andGradeTypeIdIn(List<Integer> values) {
            addCriterion("grade_type_id in", values, "gradeTypeId");
            return (Criteria) this;
        }

        public Criteria andGradeTypeIdNotIn(List<Integer> values) {
            addCriterion("grade_type_id not in", values, "gradeTypeId");
            return (Criteria) this;
        }

        public Criteria andGradeTypeIdBetween(Integer value1, Integer value2) {
            addCriterion("grade_type_id between", value1, value2, "gradeTypeId");
            return (Criteria) this;
        }

        public Criteria andGradeTypeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("grade_type_id not between", value1, value2, "gradeTypeId");
            return (Criteria) this;
        }

        public Criteria andGradeScoreIdIsNull() {
            addCriterion("grade_score_id is null");
            return (Criteria) this;
        }

        public Criteria andGradeScoreIdIsNotNull() {
            addCriterion("grade_score_id is not null");
            return (Criteria) this;
        }

        public Criteria andGradeScoreIdEqualTo(Integer value) {
            addCriterion("grade_score_id =", value, "gradeScoreId");
            return (Criteria) this;
        }

        public Criteria andGradeScoreIdNotEqualTo(Integer value) {
            addCriterion("grade_score_id <>", value, "gradeScoreId");
            return (Criteria) this;
        }

        public Criteria andGradeScoreIdGreaterThan(Integer value) {
            addCriterion("grade_score_id >", value, "gradeScoreId");
            return (Criteria) this;
        }

        public Criteria andGradeScoreIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("grade_score_id >=", value, "gradeScoreId");
            return (Criteria) this;
        }

        public Criteria andGradeScoreIdLessThan(Integer value) {
            addCriterion("grade_score_id <", value, "gradeScoreId");
            return (Criteria) this;
        }

        public Criteria andGradeScoreIdLessThanOrEqualTo(Integer value) {
            addCriterion("grade_score_id <=", value, "gradeScoreId");
            return (Criteria) this;
        }

        public Criteria andGradeScoreIdIn(List<Integer> values) {
            addCriterion("grade_score_id in", values, "gradeScoreId");
            return (Criteria) this;
        }

        public Criteria andGradeScoreIdNotIn(List<Integer> values) {
            addCriterion("grade_score_id not in", values, "gradeScoreId");
            return (Criteria) this;
        }

        public Criteria andGradeScoreIdBetween(Integer value1, Integer value2) {
            addCriterion("grade_score_id between", value1, value2, "gradeScoreId");
            return (Criteria) this;
        }

        public Criteria andGradeScoreIdNotBetween(Integer value1, Integer value2) {
            addCriterion("grade_score_id not between", value1, value2, "gradeScoreId");
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

        public Criteria andRoleIsNull() {
            addCriterion("role is null");
            return (Criteria) this;
        }

        public Criteria andRoleIsNotNull() {
            addCriterion("role is not null");
            return (Criteria) this;
        }

        public Criteria andRoleEqualTo(String value) {
            addCriterion("role =", value, "role");
            return (Criteria) this;
        }

        public Criteria andRoleNotEqualTo(String value) {
            addCriterion("role <>", value, "role");
            return (Criteria) this;
        }

        public Criteria andRoleGreaterThan(String value) {
            addCriterion("role >", value, "role");
            return (Criteria) this;
        }

        public Criteria andRoleGreaterThanOrEqualTo(String value) {
            addCriterion("role >=", value, "role");
            return (Criteria) this;
        }

        public Criteria andRoleLessThan(String value) {
            addCriterion("role <", value, "role");
            return (Criteria) this;
        }

        public Criteria andRoleLessThanOrEqualTo(String value) {
            addCriterion("role <=", value, "role");
            return (Criteria) this;
        }

        public Criteria andRoleLike(String value) {
            addCriterion("role like", value, "role");
            return (Criteria) this;
        }

        public Criteria andRoleNotLike(String value) {
            addCriterion("role not like", value, "role");
            return (Criteria) this;
        }

        public Criteria andRoleIn(List<String> values) {
            addCriterion("role in", values, "role");
            return (Criteria) this;
        }

        public Criteria andRoleNotIn(List<String> values) {
            addCriterion("role not in", values, "role");
            return (Criteria) this;
        }

        public Criteria andRoleBetween(String value1, String value2) {
            addCriterion("role between", value1, value2, "role");
            return (Criteria) this;
        }

        public Criteria andRoleNotBetween(String value1, String value2) {
            addCriterion("role not between", value1, value2, "role");
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