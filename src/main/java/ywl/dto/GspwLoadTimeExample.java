package ywl.dto;

import java.util.ArrayList;
import java.util.List;

public class GspwLoadTimeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public GspwLoadTimeExample() {
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

        public Criteria andTimeIdIsNull() {
            addCriterion("time_id is null");
            return (Criteria) this;
        }

        public Criteria andTimeIdIsNotNull() {
            addCriterion("time_id is not null");
            return (Criteria) this;
        }

        public Criteria andTimeIdEqualTo(Integer value) {
            addCriterion("time_id =", value, "timeId");
            return (Criteria) this;
        }

        public Criteria andTimeIdNotEqualTo(Integer value) {
            addCriterion("time_id <>", value, "timeId");
            return (Criteria) this;
        }

        public Criteria andTimeIdGreaterThan(Integer value) {
            addCriterion("time_id >", value, "timeId");
            return (Criteria) this;
        }

        public Criteria andTimeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("time_id >=", value, "timeId");
            return (Criteria) this;
        }

        public Criteria andTimeIdLessThan(Integer value) {
            addCriterion("time_id <", value, "timeId");
            return (Criteria) this;
        }

        public Criteria andTimeIdLessThanOrEqualTo(Integer value) {
            addCriterion("time_id <=", value, "timeId");
            return (Criteria) this;
        }

        public Criteria andTimeIdIn(List<Integer> values) {
            addCriterion("time_id in", values, "timeId");
            return (Criteria) this;
        }

        public Criteria andTimeIdNotIn(List<Integer> values) {
            addCriterion("time_id not in", values, "timeId");
            return (Criteria) this;
        }

        public Criteria andTimeIdBetween(Integer value1, Integer value2) {
            addCriterion("time_id between", value1, value2, "timeId");
            return (Criteria) this;
        }

        public Criteria andTimeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("time_id not between", value1, value2, "timeId");
            return (Criteria) this;
        }

        public Criteria andTimeDetailsIsNull() {
            addCriterion("time_details is null");
            return (Criteria) this;
        }

        public Criteria andTimeDetailsIsNotNull() {
            addCriterion("time_details is not null");
            return (Criteria) this;
        }

        public Criteria andTimeDetailsEqualTo(String value) {
            addCriterion("time_details =", value, "timeDetails");
            return (Criteria) this;
        }

        public Criteria andTimeDetailsNotEqualTo(String value) {
            addCriterion("time_details <>", value, "timeDetails");
            return (Criteria) this;
        }

        public Criteria andTimeDetailsGreaterThan(String value) {
            addCriterion("time_details >", value, "timeDetails");
            return (Criteria) this;
        }

        public Criteria andTimeDetailsGreaterThanOrEqualTo(String value) {
            addCriterion("time_details >=", value, "timeDetails");
            return (Criteria) this;
        }

        public Criteria andTimeDetailsLessThan(String value) {
            addCriterion("time_details <", value, "timeDetails");
            return (Criteria) this;
        }

        public Criteria andTimeDetailsLessThanOrEqualTo(String value) {
            addCriterion("time_details <=", value, "timeDetails");
            return (Criteria) this;
        }

        public Criteria andTimeDetailsLike(String value) {
            addCriterion("time_details like", value, "timeDetails");
            return (Criteria) this;
        }

        public Criteria andTimeDetailsNotLike(String value) {
            addCriterion("time_details not like", value, "timeDetails");
            return (Criteria) this;
        }

        public Criteria andTimeDetailsIn(List<String> values) {
            addCriterion("time_details in", values, "timeDetails");
            return (Criteria) this;
        }

        public Criteria andTimeDetailsNotIn(List<String> values) {
            addCriterion("time_details not in", values, "timeDetails");
            return (Criteria) this;
        }

        public Criteria andTimeDetailsBetween(String value1, String value2) {
            addCriterion("time_details between", value1, value2, "timeDetails");
            return (Criteria) this;
        }

        public Criteria andTimeDetailsNotBetween(String value1, String value2) {
            addCriterion("time_details not between", value1, value2, "timeDetails");
            return (Criteria) this;
        }

        public Criteria andTimeOrgCodeIsNull() {
            addCriterion("time_org_code is null");
            return (Criteria) this;
        }

        public Criteria andTimeOrgCodeIsNotNull() {
            addCriterion("time_org_code is not null");
            return (Criteria) this;
        }

        public Criteria andTimeOrgCodeEqualTo(String value) {
            addCriterion("time_org_code =", value, "timeOrgCode");
            return (Criteria) this;
        }

        public Criteria andTimeOrgCodeNotEqualTo(String value) {
            addCriterion("time_org_code <>", value, "timeOrgCode");
            return (Criteria) this;
        }

        public Criteria andTimeOrgCodeGreaterThan(String value) {
            addCriterion("time_org_code >", value, "timeOrgCode");
            return (Criteria) this;
        }

        public Criteria andTimeOrgCodeGreaterThanOrEqualTo(String value) {
            addCriterion("time_org_code >=", value, "timeOrgCode");
            return (Criteria) this;
        }

        public Criteria andTimeOrgCodeLessThan(String value) {
            addCriterion("time_org_code <", value, "timeOrgCode");
            return (Criteria) this;
        }

        public Criteria andTimeOrgCodeLessThanOrEqualTo(String value) {
            addCriterion("time_org_code <=", value, "timeOrgCode");
            return (Criteria) this;
        }

        public Criteria andTimeOrgCodeLike(String value) {
            addCriterion("time_org_code like", value, "timeOrgCode");
            return (Criteria) this;
        }

        public Criteria andTimeOrgCodeNotLike(String value) {
            addCriterion("time_org_code not like", value, "timeOrgCode");
            return (Criteria) this;
        }

        public Criteria andTimeOrgCodeIn(List<String> values) {
            addCriterion("time_org_code in", values, "timeOrgCode");
            return (Criteria) this;
        }

        public Criteria andTimeOrgCodeNotIn(List<String> values) {
            addCriterion("time_org_code not in", values, "timeOrgCode");
            return (Criteria) this;
        }

        public Criteria andTimeOrgCodeBetween(String value1, String value2) {
            addCriterion("time_org_code between", value1, value2, "timeOrgCode");
            return (Criteria) this;
        }

        public Criteria andTimeOrgCodeNotBetween(String value1, String value2) {
            addCriterion("time_org_code not between", value1, value2, "timeOrgCode");
            return (Criteria) this;
        }

        public Criteria andTimeScoreIdIsNull() {
            addCriterion("time_score_id is null");
            return (Criteria) this;
        }

        public Criteria andTimeScoreIdIsNotNull() {
            addCriterion("time_score_id is not null");
            return (Criteria) this;
        }

        public Criteria andTimeScoreIdEqualTo(Integer value) {
            addCriterion("time_score_id =", value, "timeScoreId");
            return (Criteria) this;
        }

        public Criteria andTimeScoreIdNotEqualTo(Integer value) {
            addCriterion("time_score_id <>", value, "timeScoreId");
            return (Criteria) this;
        }

        public Criteria andTimeScoreIdGreaterThan(Integer value) {
            addCriterion("time_score_id >", value, "timeScoreId");
            return (Criteria) this;
        }

        public Criteria andTimeScoreIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("time_score_id >=", value, "timeScoreId");
            return (Criteria) this;
        }

        public Criteria andTimeScoreIdLessThan(Integer value) {
            addCriterion("time_score_id <", value, "timeScoreId");
            return (Criteria) this;
        }

        public Criteria andTimeScoreIdLessThanOrEqualTo(Integer value) {
            addCriterion("time_score_id <=", value, "timeScoreId");
            return (Criteria) this;
        }

        public Criteria andTimeScoreIdIn(List<Integer> values) {
            addCriterion("time_score_id in", values, "timeScoreId");
            return (Criteria) this;
        }

        public Criteria andTimeScoreIdNotIn(List<Integer> values) {
            addCriterion("time_score_id not in", values, "timeScoreId");
            return (Criteria) this;
        }

        public Criteria andTimeScoreIdBetween(Integer value1, Integer value2) {
            addCriterion("time_score_id between", value1, value2, "timeScoreId");
            return (Criteria) this;
        }

        public Criteria andTimeScoreIdNotBetween(Integer value1, Integer value2) {
            addCriterion("time_score_id not between", value1, value2, "timeScoreId");
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