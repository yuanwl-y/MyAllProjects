package com.ywl.dto;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class GspwDispatchExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public GspwDispatchExample() {
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

        public Criteria andDispatchIdIsNull() {
            addCriterion("dispatch_id is null");
            return (Criteria) this;
        }

        public Criteria andDispatchIdIsNotNull() {
            addCriterion("dispatch_id is not null");
            return (Criteria) this;
        }

        public Criteria andDispatchIdEqualTo(Integer value) {
            addCriterion("dispatch_id =", value, "dispatchId");
            return (Criteria) this;
        }

        public Criteria andDispatchIdNotEqualTo(Integer value) {
            addCriterion("dispatch_id <>", value, "dispatchId");
            return (Criteria) this;
        }

        public Criteria andDispatchIdGreaterThan(Integer value) {
            addCriterion("dispatch_id >", value, "dispatchId");
            return (Criteria) this;
        }

        public Criteria andDispatchIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("dispatch_id >=", value, "dispatchId");
            return (Criteria) this;
        }

        public Criteria andDispatchIdLessThan(Integer value) {
            addCriterion("dispatch_id <", value, "dispatchId");
            return (Criteria) this;
        }

        public Criteria andDispatchIdLessThanOrEqualTo(Integer value) {
            addCriterion("dispatch_id <=", value, "dispatchId");
            return (Criteria) this;
        }

        public Criteria andDispatchIdIn(List<Integer> values) {
            addCriterion("dispatch_id in", values, "dispatchId");
            return (Criteria) this;
        }

        public Criteria andDispatchIdNotIn(List<Integer> values) {
            addCriterion("dispatch_id not in", values, "dispatchId");
            return (Criteria) this;
        }

        public Criteria andDispatchIdBetween(Integer value1, Integer value2) {
            addCriterion("dispatch_id between", value1, value2, "dispatchId");
            return (Criteria) this;
        }

        public Criteria andDispatchIdNotBetween(Integer value1, Integer value2) {
            addCriterion("dispatch_id not between", value1, value2, "dispatchId");
            return (Criteria) this;
        }

        public Criteria andArchivesIdIsNull() {
            addCriterion("archives_id is null");
            return (Criteria) this;
        }

        public Criteria andArchivesIdIsNotNull() {
            addCriterion("archives_id is not null");
            return (Criteria) this;
        }

        public Criteria andArchivesIdEqualTo(Integer value) {
            addCriterion("archives_id =", value, "archivesId");
            return (Criteria) this;
        }

        public Criteria andArchivesIdNotEqualTo(Integer value) {
            addCriterion("archives_id <>", value, "archivesId");
            return (Criteria) this;
        }

        public Criteria andArchivesIdGreaterThan(Integer value) {
            addCriterion("archives_id >", value, "archivesId");
            return (Criteria) this;
        }

        public Criteria andArchivesIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("archives_id >=", value, "archivesId");
            return (Criteria) this;
        }

        public Criteria andArchivesIdLessThan(Integer value) {
            addCriterion("archives_id <", value, "archivesId");
            return (Criteria) this;
        }

        public Criteria andArchivesIdLessThanOrEqualTo(Integer value) {
            addCriterion("archives_id <=", value, "archivesId");
            return (Criteria) this;
        }

        public Criteria andArchivesIdIn(List<Integer> values) {
            addCriterion("archives_id in", values, "archivesId");
            return (Criteria) this;
        }

        public Criteria andArchivesIdNotIn(List<Integer> values) {
            addCriterion("archives_id not in", values, "archivesId");
            return (Criteria) this;
        }

        public Criteria andArchivesIdBetween(Integer value1, Integer value2) {
            addCriterion("archives_id between", value1, value2, "archivesId");
            return (Criteria) this;
        }

        public Criteria andArchivesIdNotBetween(Integer value1, Integer value2) {
            addCriterion("archives_id not between", value1, value2, "archivesId");
            return (Criteria) this;
        }

        public Criteria andStartTimeIsNull() {
            addCriterion("start_time is null");
            return (Criteria) this;
        }

        public Criteria andStartTimeIsNotNull() {
            addCriterion("start_time is not null");
            return (Criteria) this;
        }

        public Criteria andStartTimeEqualTo(Date value) {
            addCriterion("start_time =", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotEqualTo(Date value) {
            addCriterion("start_time <>", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeGreaterThan(Date value) {
            addCriterion("start_time >", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("start_time >=", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeLessThan(Date value) {
            addCriterion("start_time <", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeLessThanOrEqualTo(Date value) {
            addCriterion("start_time <=", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeIn(List<Date> values) {
            addCriterion("start_time in", values, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotIn(List<Date> values) {
            addCriterion("start_time not in", values, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeBetween(Date value1, Date value2) {
            addCriterion("start_time between", value1, value2, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotBetween(Date value1, Date value2) {
            addCriterion("start_time not between", value1, value2, "startTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeIsNull() {
            addCriterion("end_time is null");
            return (Criteria) this;
        }

        public Criteria andEndTimeIsNotNull() {
            addCriterion("end_time is not null");
            return (Criteria) this;
        }

        public Criteria andEndTimeEqualTo(Date value) {
            addCriterion("end_time =", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotEqualTo(Date value) {
            addCriterion("end_time <>", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeGreaterThan(Date value) {
            addCriterion("end_time >", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("end_time >=", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeLessThan(Date value) {
            addCriterion("end_time <", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeLessThanOrEqualTo(Date value) {
            addCriterion("end_time <=", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeIn(List<Date> values) {
            addCriterion("end_time in", values, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotIn(List<Date> values) {
            addCriterion("end_time not in", values, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeBetween(Date value1, Date value2) {
            addCriterion("end_time between", value1, value2, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotBetween(Date value1, Date value2) {
            addCriterion("end_time not between", value1, value2, "endTime");
            return (Criteria) this;
        }

        public Criteria andDeletemarkIsNull() {
            addCriterion("deletemark is null");
            return (Criteria) this;
        }

        public Criteria andDeletemarkIsNotNull() {
            addCriterion("deletemark is not null");
            return (Criteria) this;
        }

        public Criteria andDeletemarkEqualTo(Integer value) {
            addCriterion("deletemark =", value, "deletemark");
            return (Criteria) this;
        }

        public Criteria andDeletemarkNotEqualTo(Integer value) {
            addCriterion("deletemark <>", value, "deletemark");
            return (Criteria) this;
        }

        public Criteria andDeletemarkGreaterThan(Integer value) {
            addCriterion("deletemark >", value, "deletemark");
            return (Criteria) this;
        }

        public Criteria andDeletemarkGreaterThanOrEqualTo(Integer value) {
            addCriterion("deletemark >=", value, "deletemark");
            return (Criteria) this;
        }

        public Criteria andDeletemarkLessThan(Integer value) {
            addCriterion("deletemark <", value, "deletemark");
            return (Criteria) this;
        }

        public Criteria andDeletemarkLessThanOrEqualTo(Integer value) {
            addCriterion("deletemark <=", value, "deletemark");
            return (Criteria) this;
        }

        public Criteria andDeletemarkIn(List<Integer> values) {
            addCriterion("deletemark in", values, "deletemark");
            return (Criteria) this;
        }

        public Criteria andDeletemarkNotIn(List<Integer> values) {
            addCriterion("deletemark not in", values, "deletemark");
            return (Criteria) this;
        }

        public Criteria andDeletemarkBetween(Integer value1, Integer value2) {
            addCriterion("deletemark between", value1, value2, "deletemark");
            return (Criteria) this;
        }

        public Criteria andDeletemarkNotBetween(Integer value1, Integer value2) {
            addCriterion("deletemark not between", value1, value2, "deletemark");
            return (Criteria) this;
        }

        public Criteria andConstructionplanIdIsNull() {
            addCriterion("constructionPlan_id is null");
            return (Criteria) this;
        }

        public Criteria andConstructionplanIdIsNotNull() {
            addCriterion("constructionPlan_id is not null");
            return (Criteria) this;
        }

        public Criteria andConstructionplanIdEqualTo(Integer value) {
            addCriterion("constructionPlan_id =", value, "constructionplanId");
            return (Criteria) this;
        }

        public Criteria andConstructionplanIdNotEqualTo(Integer value) {
            addCriterion("constructionPlan_id <>", value, "constructionplanId");
            return (Criteria) this;
        }

        public Criteria andConstructionplanIdGreaterThan(Integer value) {
            addCriterion("constructionPlan_id >", value, "constructionplanId");
            return (Criteria) this;
        }

        public Criteria andConstructionplanIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("constructionPlan_id >=", value, "constructionplanId");
            return (Criteria) this;
        }

        public Criteria andConstructionplanIdLessThan(Integer value) {
            addCriterion("constructionPlan_id <", value, "constructionplanId");
            return (Criteria) this;
        }

        public Criteria andConstructionplanIdLessThanOrEqualTo(Integer value) {
            addCriterion("constructionPlan_id <=", value, "constructionplanId");
            return (Criteria) this;
        }

        public Criteria andConstructionplanIdIn(List<Integer> values) {
            addCriterion("constructionPlan_id in", values, "constructionplanId");
            return (Criteria) this;
        }

        public Criteria andConstructionplanIdNotIn(List<Integer> values) {
            addCriterion("constructionPlan_id not in", values, "constructionplanId");
            return (Criteria) this;
        }

        public Criteria andConstructionplanIdBetween(Integer value1, Integer value2) {
            addCriterion("constructionPlan_id between", value1, value2, "constructionplanId");
            return (Criteria) this;
        }

        public Criteria andConstructionplanIdNotBetween(Integer value1, Integer value2) {
            addCriterion("constructionPlan_id not between", value1, value2, "constructionplanId");
            return (Criteria) this;
        }

        public Criteria andDispatchTypeIsNull() {
            addCriterion("dispatch_type is null");
            return (Criteria) this;
        }

        public Criteria andDispatchTypeIsNotNull() {
            addCriterion("dispatch_type is not null");
            return (Criteria) this;
        }

        public Criteria andDispatchTypeEqualTo(String value) {
            addCriterion("dispatch_type =", value, "dispatchType");
            return (Criteria) this;
        }

        public Criteria andDispatchTypeNotEqualTo(String value) {
            addCriterion("dispatch_type <>", value, "dispatchType");
            return (Criteria) this;
        }

        public Criteria andDispatchTypeGreaterThan(String value) {
            addCriterion("dispatch_type >", value, "dispatchType");
            return (Criteria) this;
        }

        public Criteria andDispatchTypeGreaterThanOrEqualTo(String value) {
            addCriterion("dispatch_type >=", value, "dispatchType");
            return (Criteria) this;
        }

        public Criteria andDispatchTypeLessThan(String value) {
            addCriterion("dispatch_type <", value, "dispatchType");
            return (Criteria) this;
        }

        public Criteria andDispatchTypeLessThanOrEqualTo(String value) {
            addCriterion("dispatch_type <=", value, "dispatchType");
            return (Criteria) this;
        }

        public Criteria andDispatchTypeLike(String value) {
            addCriterion("dispatch_type like", value, "dispatchType");
            return (Criteria) this;
        }

        public Criteria andDispatchTypeNotLike(String value) {
            addCriterion("dispatch_type not like", value, "dispatchType");
            return (Criteria) this;
        }

        public Criteria andDispatchTypeIn(List<String> values) {
            addCriterion("dispatch_type in", values, "dispatchType");
            return (Criteria) this;
        }

        public Criteria andDispatchTypeNotIn(List<String> values) {
            addCriterion("dispatch_type not in", values, "dispatchType");
            return (Criteria) this;
        }

        public Criteria andDispatchTypeBetween(String value1, String value2) {
            addCriterion("dispatch_type between", value1, value2, "dispatchType");
            return (Criteria) this;
        }

        public Criteria andDispatchTypeNotBetween(String value1, String value2) {
            addCriterion("dispatch_type not between", value1, value2, "dispatchType");
            return (Criteria) this;
        }

        public Criteria andDispatchStateIsNull() {
            addCriterion("dispatch_state is null");
            return (Criteria) this;
        }

        public Criteria andDispatchStateIsNotNull() {
            addCriterion("dispatch_state is not null");
            return (Criteria) this;
        }

        public Criteria andDispatchStateEqualTo(Integer value) {
            addCriterion("dispatch_state =", value, "dispatchState");
            return (Criteria) this;
        }

        public Criteria andDispatchStateNotEqualTo(Integer value) {
            addCriterion("dispatch_state <>", value, "dispatchState");
            return (Criteria) this;
        }

        public Criteria andDispatchStateGreaterThan(Integer value) {
            addCriterion("dispatch_state >", value, "dispatchState");
            return (Criteria) this;
        }

        public Criteria andDispatchStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("dispatch_state >=", value, "dispatchState");
            return (Criteria) this;
        }

        public Criteria andDispatchStateLessThan(Integer value) {
            addCriterion("dispatch_state <", value, "dispatchState");
            return (Criteria) this;
        }

        public Criteria andDispatchStateLessThanOrEqualTo(Integer value) {
            addCriterion("dispatch_state <=", value, "dispatchState");
            return (Criteria) this;
        }

        public Criteria andDispatchStateIn(List<Integer> values) {
            addCriterion("dispatch_state in", values, "dispatchState");
            return (Criteria) this;
        }

        public Criteria andDispatchStateNotIn(List<Integer> values) {
            addCriterion("dispatch_state not in", values, "dispatchState");
            return (Criteria) this;
        }

        public Criteria andDispatchStateBetween(Integer value1, Integer value2) {
            addCriterion("dispatch_state between", value1, value2, "dispatchState");
            return (Criteria) this;
        }

        public Criteria andDispatchStateNotBetween(Integer value1, Integer value2) {
            addCriterion("dispatch_state not between", value1, value2, "dispatchState");
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