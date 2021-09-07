package com.ywl.dto;

import java.util.ArrayList;
import java.util.List;

public class GspwCancelplanExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public GspwCancelplanExample() {
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

        public Criteria andCancelplanidIsNull() {
            addCriterion("cancelPlanId is null");
            return (Criteria) this;
        }

        public Criteria andCancelplanidIsNotNull() {
            addCriterion("cancelPlanId is not null");
            return (Criteria) this;
        }

        public Criteria andCancelplanidEqualTo(Integer value) {
            addCriterion("cancelPlanId =", value, "cancelplanid");
            return (Criteria) this;
        }

        public Criteria andCancelplanidNotEqualTo(Integer value) {
            addCriterion("cancelPlanId <>", value, "cancelplanid");
            return (Criteria) this;
        }

        public Criteria andCancelplanidGreaterThan(Integer value) {
            addCriterion("cancelPlanId >", value, "cancelplanid");
            return (Criteria) this;
        }

        public Criteria andCancelplanidGreaterThanOrEqualTo(Integer value) {
            addCriterion("cancelPlanId >=", value, "cancelplanid");
            return (Criteria) this;
        }

        public Criteria andCancelplanidLessThan(Integer value) {
            addCriterion("cancelPlanId <", value, "cancelplanid");
            return (Criteria) this;
        }

        public Criteria andCancelplanidLessThanOrEqualTo(Integer value) {
            addCriterion("cancelPlanId <=", value, "cancelplanid");
            return (Criteria) this;
        }

        public Criteria andCancelplanidIn(List<Integer> values) {
            addCriterion("cancelPlanId in", values, "cancelplanid");
            return (Criteria) this;
        }

        public Criteria andCancelplanidNotIn(List<Integer> values) {
            addCriterion("cancelPlanId not in", values, "cancelplanid");
            return (Criteria) this;
        }

        public Criteria andCancelplanidBetween(Integer value1, Integer value2) {
            addCriterion("cancelPlanId between", value1, value2, "cancelplanid");
            return (Criteria) this;
        }

        public Criteria andCancelplanidNotBetween(Integer value1, Integer value2) {
            addCriterion("cancelPlanId not between", value1, value2, "cancelplanid");
            return (Criteria) this;
        }

        public Criteria andStarttimeIsNull() {
            addCriterion("startTime is null");
            return (Criteria) this;
        }

        public Criteria andStarttimeIsNotNull() {
            addCriterion("startTime is not null");
            return (Criteria) this;
        }

        public Criteria andStarttimeEqualTo(String value) {
            addCriterion("startTime =", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeNotEqualTo(String value) {
            addCriterion("startTime <>", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeGreaterThan(String value) {
            addCriterion("startTime >", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeGreaterThanOrEqualTo(String value) {
            addCriterion("startTime >=", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeLessThan(String value) {
            addCriterion("startTime <", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeLessThanOrEqualTo(String value) {
            addCriterion("startTime <=", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeLike(String value) {
            addCriterion("startTime like", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeNotLike(String value) {
            addCriterion("startTime not like", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeIn(List<String> values) {
            addCriterion("startTime in", values, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeNotIn(List<String> values) {
            addCriterion("startTime not in", values, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeBetween(String value1, String value2) {
            addCriterion("startTime between", value1, value2, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeNotBetween(String value1, String value2) {
            addCriterion("startTime not between", value1, value2, "starttime");
            return (Criteria) this;
        }

        public Criteria andEndtimeIsNull() {
            addCriterion("endTime is null");
            return (Criteria) this;
        }

        public Criteria andEndtimeIsNotNull() {
            addCriterion("endTime is not null");
            return (Criteria) this;
        }

        public Criteria andEndtimeEqualTo(String value) {
            addCriterion("endTime =", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeNotEqualTo(String value) {
            addCriterion("endTime <>", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeGreaterThan(String value) {
            addCriterion("endTime >", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeGreaterThanOrEqualTo(String value) {
            addCriterion("endTime >=", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeLessThan(String value) {
            addCriterion("endTime <", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeLessThanOrEqualTo(String value) {
            addCriterion("endTime <=", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeLike(String value) {
            addCriterion("endTime like", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeNotLike(String value) {
            addCriterion("endTime not like", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeIn(List<String> values) {
            addCriterion("endTime in", values, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeNotIn(List<String> values) {
            addCriterion("endTime not in", values, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeBetween(String value1, String value2) {
            addCriterion("endTime between", value1, value2, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeNotBetween(String value1, String value2) {
            addCriterion("endTime not between", value1, value2, "endtime");
            return (Criteria) this;
        }

        public Criteria andCancelIdIsNull() {
            addCriterion("cancel_id is null");
            return (Criteria) this;
        }

        public Criteria andCancelIdIsNotNull() {
            addCriterion("cancel_id is not null");
            return (Criteria) this;
        }

        public Criteria andCancelIdEqualTo(Integer value) {
            addCriterion("cancel_id =", value, "cancelId");
            return (Criteria) this;
        }

        public Criteria andCancelIdNotEqualTo(Integer value) {
            addCriterion("cancel_id <>", value, "cancelId");
            return (Criteria) this;
        }

        public Criteria andCancelIdGreaterThan(Integer value) {
            addCriterion("cancel_id >", value, "cancelId");
            return (Criteria) this;
        }

        public Criteria andCancelIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("cancel_id >=", value, "cancelId");
            return (Criteria) this;
        }

        public Criteria andCancelIdLessThan(Integer value) {
            addCriterion("cancel_id <", value, "cancelId");
            return (Criteria) this;
        }

        public Criteria andCancelIdLessThanOrEqualTo(Integer value) {
            addCriterion("cancel_id <=", value, "cancelId");
            return (Criteria) this;
        }

        public Criteria andCancelIdIn(List<Integer> values) {
            addCriterion("cancel_id in", values, "cancelId");
            return (Criteria) this;
        }

        public Criteria andCancelIdNotIn(List<Integer> values) {
            addCriterion("cancel_id not in", values, "cancelId");
            return (Criteria) this;
        }

        public Criteria andCancelIdBetween(Integer value1, Integer value2) {
            addCriterion("cancel_id between", value1, value2, "cancelId");
            return (Criteria) this;
        }

        public Criteria andCancelIdNotBetween(Integer value1, Integer value2) {
            addCriterion("cancel_id not between", value1, value2, "cancelId");
            return (Criteria) this;
        }

        public Criteria andCancelNameIsNull() {
            addCriterion("cancel_name is null");
            return (Criteria) this;
        }

        public Criteria andCancelNameIsNotNull() {
            addCriterion("cancel_name is not null");
            return (Criteria) this;
        }

        public Criteria andCancelNameEqualTo(String value) {
            addCriterion("cancel_name =", value, "cancelName");
            return (Criteria) this;
        }

        public Criteria andCancelNameNotEqualTo(String value) {
            addCriterion("cancel_name <>", value, "cancelName");
            return (Criteria) this;
        }

        public Criteria andCancelNameGreaterThan(String value) {
            addCriterion("cancel_name >", value, "cancelName");
            return (Criteria) this;
        }

        public Criteria andCancelNameGreaterThanOrEqualTo(String value) {
            addCriterion("cancel_name >=", value, "cancelName");
            return (Criteria) this;
        }

        public Criteria andCancelNameLessThan(String value) {
            addCriterion("cancel_name <", value, "cancelName");
            return (Criteria) this;
        }

        public Criteria andCancelNameLessThanOrEqualTo(String value) {
            addCriterion("cancel_name <=", value, "cancelName");
            return (Criteria) this;
        }

        public Criteria andCancelNameLike(String value) {
            addCriterion("cancel_name like", value, "cancelName");
            return (Criteria) this;
        }

        public Criteria andCancelNameNotLike(String value) {
            addCriterion("cancel_name not like", value, "cancelName");
            return (Criteria) this;
        }

        public Criteria andCancelNameIn(List<String> values) {
            addCriterion("cancel_name in", values, "cancelName");
            return (Criteria) this;
        }

        public Criteria andCancelNameNotIn(List<String> values) {
            addCriterion("cancel_name not in", values, "cancelName");
            return (Criteria) this;
        }

        public Criteria andCancelNameBetween(String value1, String value2) {
            addCriterion("cancel_name between", value1, value2, "cancelName");
            return (Criteria) this;
        }

        public Criteria andCancelNameNotBetween(String value1, String value2) {
            addCriterion("cancel_name not between", value1, value2, "cancelName");
            return (Criteria) this;
        }

        public Criteria andCanceltimeIsNull() {
            addCriterion("cancelTime is null");
            return (Criteria) this;
        }

        public Criteria andCanceltimeIsNotNull() {
            addCriterion("cancelTime is not null");
            return (Criteria) this;
        }

        public Criteria andCanceltimeEqualTo(String value) {
            addCriterion("cancelTime =", value, "canceltime");
            return (Criteria) this;
        }

        public Criteria andCanceltimeNotEqualTo(String value) {
            addCriterion("cancelTime <>", value, "canceltime");
            return (Criteria) this;
        }

        public Criteria andCanceltimeGreaterThan(String value) {
            addCriterion("cancelTime >", value, "canceltime");
            return (Criteria) this;
        }

        public Criteria andCanceltimeGreaterThanOrEqualTo(String value) {
            addCriterion("cancelTime >=", value, "canceltime");
            return (Criteria) this;
        }

        public Criteria andCanceltimeLessThan(String value) {
            addCriterion("cancelTime <", value, "canceltime");
            return (Criteria) this;
        }

        public Criteria andCanceltimeLessThanOrEqualTo(String value) {
            addCriterion("cancelTime <=", value, "canceltime");
            return (Criteria) this;
        }

        public Criteria andCanceltimeLike(String value) {
            addCriterion("cancelTime like", value, "canceltime");
            return (Criteria) this;
        }

        public Criteria andCanceltimeNotLike(String value) {
            addCriterion("cancelTime not like", value, "canceltime");
            return (Criteria) this;
        }

        public Criteria andCanceltimeIn(List<String> values) {
            addCriterion("cancelTime in", values, "canceltime");
            return (Criteria) this;
        }

        public Criteria andCanceltimeNotIn(List<String> values) {
            addCriterion("cancelTime not in", values, "canceltime");
            return (Criteria) this;
        }

        public Criteria andCanceltimeBetween(String value1, String value2) {
            addCriterion("cancelTime between", value1, value2, "canceltime");
            return (Criteria) this;
        }

        public Criteria andCanceltimeNotBetween(String value1, String value2) {
            addCriterion("cancelTime not between", value1, value2, "canceltime");
            return (Criteria) this;
        }

        public Criteria andCancelresultIsNull() {
            addCriterion("cancelResult is null");
            return (Criteria) this;
        }

        public Criteria andCancelresultIsNotNull() {
            addCriterion("cancelResult is not null");
            return (Criteria) this;
        }

        public Criteria andCancelresultEqualTo(String value) {
            addCriterion("cancelResult =", value, "cancelresult");
            return (Criteria) this;
        }

        public Criteria andCancelresultNotEqualTo(String value) {
            addCriterion("cancelResult <>", value, "cancelresult");
            return (Criteria) this;
        }

        public Criteria andCancelresultGreaterThan(String value) {
            addCriterion("cancelResult >", value, "cancelresult");
            return (Criteria) this;
        }

        public Criteria andCancelresultGreaterThanOrEqualTo(String value) {
            addCriterion("cancelResult >=", value, "cancelresult");
            return (Criteria) this;
        }

        public Criteria andCancelresultLessThan(String value) {
            addCriterion("cancelResult <", value, "cancelresult");
            return (Criteria) this;
        }

        public Criteria andCancelresultLessThanOrEqualTo(String value) {
            addCriterion("cancelResult <=", value, "cancelresult");
            return (Criteria) this;
        }

        public Criteria andCancelresultLike(String value) {
            addCriterion("cancelResult like", value, "cancelresult");
            return (Criteria) this;
        }

        public Criteria andCancelresultNotLike(String value) {
            addCriterion("cancelResult not like", value, "cancelresult");
            return (Criteria) this;
        }

        public Criteria andCancelresultIn(List<String> values) {
            addCriterion("cancelResult in", values, "cancelresult");
            return (Criteria) this;
        }

        public Criteria andCancelresultNotIn(List<String> values) {
            addCriterion("cancelResult not in", values, "cancelresult");
            return (Criteria) this;
        }

        public Criteria andCancelresultBetween(String value1, String value2) {
            addCriterion("cancelResult between", value1, value2, "cancelresult");
            return (Criteria) this;
        }

        public Criteria andCancelresultNotBetween(String value1, String value2) {
            addCriterion("cancelResult not between", value1, value2, "cancelresult");
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

        public Criteria andDaysIsNull() {
            addCriterion("days is null");
            return (Criteria) this;
        }

        public Criteria andDaysIsNotNull() {
            addCriterion("days is not null");
            return (Criteria) this;
        }

        public Criteria andDaysEqualTo(String value) {
            addCriterion("days =", value, "days");
            return (Criteria) this;
        }

        public Criteria andDaysNotEqualTo(String value) {
            addCriterion("days <>", value, "days");
            return (Criteria) this;
        }

        public Criteria andDaysGreaterThan(String value) {
            addCriterion("days >", value, "days");
            return (Criteria) this;
        }

        public Criteria andDaysGreaterThanOrEqualTo(String value) {
            addCriterion("days >=", value, "days");
            return (Criteria) this;
        }

        public Criteria andDaysLessThan(String value) {
            addCriterion("days <", value, "days");
            return (Criteria) this;
        }

        public Criteria andDaysLessThanOrEqualTo(String value) {
            addCriterion("days <=", value, "days");
            return (Criteria) this;
        }

        public Criteria andDaysLike(String value) {
            addCriterion("days like", value, "days");
            return (Criteria) this;
        }

        public Criteria andDaysNotLike(String value) {
            addCriterion("days not like", value, "days");
            return (Criteria) this;
        }

        public Criteria andDaysIn(List<String> values) {
            addCriterion("days in", values, "days");
            return (Criteria) this;
        }

        public Criteria andDaysNotIn(List<String> values) {
            addCriterion("days not in", values, "days");
            return (Criteria) this;
        }

        public Criteria andDaysBetween(String value1, String value2) {
            addCriterion("days between", value1, value2, "days");
            return (Criteria) this;
        }

        public Criteria andDaysNotBetween(String value1, String value2) {
            addCriterion("days not between", value1, value2, "days");
            return (Criteria) this;
        }

        public Criteria andTaskidIsNull() {
            addCriterion("taskId is null");
            return (Criteria) this;
        }

        public Criteria andTaskidIsNotNull() {
            addCriterion("taskId is not null");
            return (Criteria) this;
        }

        public Criteria andTaskidEqualTo(String value) {
            addCriterion("taskId =", value, "taskid");
            return (Criteria) this;
        }

        public Criteria andTaskidNotEqualTo(String value) {
            addCriterion("taskId <>", value, "taskid");
            return (Criteria) this;
        }

        public Criteria andTaskidGreaterThan(String value) {
            addCriterion("taskId >", value, "taskid");
            return (Criteria) this;
        }

        public Criteria andTaskidGreaterThanOrEqualTo(String value) {
            addCriterion("taskId >=", value, "taskid");
            return (Criteria) this;
        }

        public Criteria andTaskidLessThan(String value) {
            addCriterion("taskId <", value, "taskid");
            return (Criteria) this;
        }

        public Criteria andTaskidLessThanOrEqualTo(String value) {
            addCriterion("taskId <=", value, "taskid");
            return (Criteria) this;
        }

        public Criteria andTaskidLike(String value) {
            addCriterion("taskId like", value, "taskid");
            return (Criteria) this;
        }

        public Criteria andTaskidNotLike(String value) {
            addCriterion("taskId not like", value, "taskid");
            return (Criteria) this;
        }

        public Criteria andTaskidIn(List<String> values) {
            addCriterion("taskId in", values, "taskid");
            return (Criteria) this;
        }

        public Criteria andTaskidNotIn(List<String> values) {
            addCriterion("taskId not in", values, "taskid");
            return (Criteria) this;
        }

        public Criteria andTaskidBetween(String value1, String value2) {
            addCriterion("taskId between", value1, value2, "taskid");
            return (Criteria) this;
        }

        public Criteria andTaskidNotBetween(String value1, String value2) {
            addCriterion("taskId not between", value1, value2, "taskid");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Integer value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Integer value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Integer value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Integer value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Integer value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Integer> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Integer> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Integer value1, Integer value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andAuditusernameIsNull() {
            addCriterion("auditUserName is null");
            return (Criteria) this;
        }

        public Criteria andAuditusernameIsNotNull() {
            addCriterion("auditUserName is not null");
            return (Criteria) this;
        }

        public Criteria andAuditusernameEqualTo(String value) {
            addCriterion("auditUserName =", value, "auditusername");
            return (Criteria) this;
        }

        public Criteria andAuditusernameNotEqualTo(String value) {
            addCriterion("auditUserName <>", value, "auditusername");
            return (Criteria) this;
        }

        public Criteria andAuditusernameGreaterThan(String value) {
            addCriterion("auditUserName >", value, "auditusername");
            return (Criteria) this;
        }

        public Criteria andAuditusernameGreaterThanOrEqualTo(String value) {
            addCriterion("auditUserName >=", value, "auditusername");
            return (Criteria) this;
        }

        public Criteria andAuditusernameLessThan(String value) {
            addCriterion("auditUserName <", value, "auditusername");
            return (Criteria) this;
        }

        public Criteria andAuditusernameLessThanOrEqualTo(String value) {
            addCriterion("auditUserName <=", value, "auditusername");
            return (Criteria) this;
        }

        public Criteria andAuditusernameLike(String value) {
            addCriterion("auditUserName like", value, "auditusername");
            return (Criteria) this;
        }

        public Criteria andAuditusernameNotLike(String value) {
            addCriterion("auditUserName not like", value, "auditusername");
            return (Criteria) this;
        }

        public Criteria andAuditusernameIn(List<String> values) {
            addCriterion("auditUserName in", values, "auditusername");
            return (Criteria) this;
        }

        public Criteria andAuditusernameNotIn(List<String> values) {
            addCriterion("auditUserName not in", values, "auditusername");
            return (Criteria) this;
        }

        public Criteria andAuditusernameBetween(String value1, String value2) {
            addCriterion("auditUserName between", value1, value2, "auditusername");
            return (Criteria) this;
        }

        public Criteria andAuditusernameNotBetween(String value1, String value2) {
            addCriterion("auditUserName not between", value1, value2, "auditusername");
            return (Criteria) this;
        }

        public Criteria andAuditworkcodeIsNull() {
            addCriterion("auditWorkCode is null");
            return (Criteria) this;
        }

        public Criteria andAuditworkcodeIsNotNull() {
            addCriterion("auditWorkCode is not null");
            return (Criteria) this;
        }

        public Criteria andAuditworkcodeEqualTo(String value) {
            addCriterion("auditWorkCode =", value, "auditworkcode");
            return (Criteria) this;
        }

        public Criteria andAuditworkcodeNotEqualTo(String value) {
            addCriterion("auditWorkCode <>", value, "auditworkcode");
            return (Criteria) this;
        }

        public Criteria andAuditworkcodeGreaterThan(String value) {
            addCriterion("auditWorkCode >", value, "auditworkcode");
            return (Criteria) this;
        }

        public Criteria andAuditworkcodeGreaterThanOrEqualTo(String value) {
            addCriterion("auditWorkCode >=", value, "auditworkcode");
            return (Criteria) this;
        }

        public Criteria andAuditworkcodeLessThan(String value) {
            addCriterion("auditWorkCode <", value, "auditworkcode");
            return (Criteria) this;
        }

        public Criteria andAuditworkcodeLessThanOrEqualTo(String value) {
            addCriterion("auditWorkCode <=", value, "auditworkcode");
            return (Criteria) this;
        }

        public Criteria andAuditworkcodeLike(String value) {
            addCriterion("auditWorkCode like", value, "auditworkcode");
            return (Criteria) this;
        }

        public Criteria andAuditworkcodeNotLike(String value) {
            addCriterion("auditWorkCode not like", value, "auditworkcode");
            return (Criteria) this;
        }

        public Criteria andAuditworkcodeIn(List<String> values) {
            addCriterion("auditWorkCode in", values, "auditworkcode");
            return (Criteria) this;
        }

        public Criteria andAuditworkcodeNotIn(List<String> values) {
            addCriterion("auditWorkCode not in", values, "auditworkcode");
            return (Criteria) this;
        }

        public Criteria andAuditworkcodeBetween(String value1, String value2) {
            addCriterion("auditWorkCode between", value1, value2, "auditworkcode");
            return (Criteria) this;
        }

        public Criteria andAuditworkcodeNotBetween(String value1, String value2) {
            addCriterion("auditWorkCode not between", value1, value2, "auditworkcode");
            return (Criteria) this;
        }

        public Criteria andAuditresultIsNull() {
            addCriterion("auditResult is null");
            return (Criteria) this;
        }

        public Criteria andAuditresultIsNotNull() {
            addCriterion("auditResult is not null");
            return (Criteria) this;
        }

        public Criteria andAuditresultEqualTo(String value) {
            addCriterion("auditResult =", value, "auditresult");
            return (Criteria) this;
        }

        public Criteria andAuditresultNotEqualTo(String value) {
            addCriterion("auditResult <>", value, "auditresult");
            return (Criteria) this;
        }

        public Criteria andAuditresultGreaterThan(String value) {
            addCriterion("auditResult >", value, "auditresult");
            return (Criteria) this;
        }

        public Criteria andAuditresultGreaterThanOrEqualTo(String value) {
            addCriterion("auditResult >=", value, "auditresult");
            return (Criteria) this;
        }

        public Criteria andAuditresultLessThan(String value) {
            addCriterion("auditResult <", value, "auditresult");
            return (Criteria) this;
        }

        public Criteria andAuditresultLessThanOrEqualTo(String value) {
            addCriterion("auditResult <=", value, "auditresult");
            return (Criteria) this;
        }

        public Criteria andAuditresultLike(String value) {
            addCriterion("auditResult like", value, "auditresult");
            return (Criteria) this;
        }

        public Criteria andAuditresultNotLike(String value) {
            addCriterion("auditResult not like", value, "auditresult");
            return (Criteria) this;
        }

        public Criteria andAuditresultIn(List<String> values) {
            addCriterion("auditResult in", values, "auditresult");
            return (Criteria) this;
        }

        public Criteria andAuditresultNotIn(List<String> values) {
            addCriterion("auditResult not in", values, "auditresult");
            return (Criteria) this;
        }

        public Criteria andAuditresultBetween(String value1, String value2) {
            addCriterion("auditResult between", value1, value2, "auditresult");
            return (Criteria) this;
        }

        public Criteria andAuditresultNotBetween(String value1, String value2) {
            addCriterion("auditResult not between", value1, value2, "auditresult");
            return (Criteria) this;
        }

        public Criteria andAuditcontextIsNull() {
            addCriterion("auditContext is null");
            return (Criteria) this;
        }

        public Criteria andAuditcontextIsNotNull() {
            addCriterion("auditContext is not null");
            return (Criteria) this;
        }

        public Criteria andAuditcontextEqualTo(String value) {
            addCriterion("auditContext =", value, "auditcontext");
            return (Criteria) this;
        }

        public Criteria andAuditcontextNotEqualTo(String value) {
            addCriterion("auditContext <>", value, "auditcontext");
            return (Criteria) this;
        }

        public Criteria andAuditcontextGreaterThan(String value) {
            addCriterion("auditContext >", value, "auditcontext");
            return (Criteria) this;
        }

        public Criteria andAuditcontextGreaterThanOrEqualTo(String value) {
            addCriterion("auditContext >=", value, "auditcontext");
            return (Criteria) this;
        }

        public Criteria andAuditcontextLessThan(String value) {
            addCriterion("auditContext <", value, "auditcontext");
            return (Criteria) this;
        }

        public Criteria andAuditcontextLessThanOrEqualTo(String value) {
            addCriterion("auditContext <=", value, "auditcontext");
            return (Criteria) this;
        }

        public Criteria andAuditcontextLike(String value) {
            addCriterion("auditContext like", value, "auditcontext");
            return (Criteria) this;
        }

        public Criteria andAuditcontextNotLike(String value) {
            addCriterion("auditContext not like", value, "auditcontext");
            return (Criteria) this;
        }

        public Criteria andAuditcontextIn(List<String> values) {
            addCriterion("auditContext in", values, "auditcontext");
            return (Criteria) this;
        }

        public Criteria andAuditcontextNotIn(List<String> values) {
            addCriterion("auditContext not in", values, "auditcontext");
            return (Criteria) this;
        }

        public Criteria andAuditcontextBetween(String value1, String value2) {
            addCriterion("auditContext between", value1, value2, "auditcontext");
            return (Criteria) this;
        }

        public Criteria andAuditcontextNotBetween(String value1, String value2) {
            addCriterion("auditContext not between", value1, value2, "auditcontext");
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