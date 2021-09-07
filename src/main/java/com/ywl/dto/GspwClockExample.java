package com.ywl.dto;

import java.util.ArrayList;
import java.util.List;

public class GspwClockExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public GspwClockExample() {
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

        public Criteria andClockIdIsNull() {
            addCriterion("clock_id is null");
            return (Criteria) this;
        }

        public Criteria andClockIdIsNotNull() {
            addCriterion("clock_id is not null");
            return (Criteria) this;
        }

        public Criteria andClockIdEqualTo(Integer value) {
            addCriterion("clock_id =", value, "clockId");
            return (Criteria) this;
        }

        public Criteria andClockIdNotEqualTo(Integer value) {
            addCriterion("clock_id <>", value, "clockId");
            return (Criteria) this;
        }

        public Criteria andClockIdGreaterThan(Integer value) {
            addCriterion("clock_id >", value, "clockId");
            return (Criteria) this;
        }

        public Criteria andClockIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("clock_id >=", value, "clockId");
            return (Criteria) this;
        }

        public Criteria andClockIdLessThan(Integer value) {
            addCriterion("clock_id <", value, "clockId");
            return (Criteria) this;
        }

        public Criteria andClockIdLessThanOrEqualTo(Integer value) {
            addCriterion("clock_id <=", value, "clockId");
            return (Criteria) this;
        }

        public Criteria andClockIdIn(List<Integer> values) {
            addCriterion("clock_id in", values, "clockId");
            return (Criteria) this;
        }

        public Criteria andClockIdNotIn(List<Integer> values) {
            addCriterion("clock_id not in", values, "clockId");
            return (Criteria) this;
        }

        public Criteria andClockIdBetween(Integer value1, Integer value2) {
            addCriterion("clock_id between", value1, value2, "clockId");
            return (Criteria) this;
        }

        public Criteria andClockIdNotBetween(Integer value1, Integer value2) {
            addCriterion("clock_id not between", value1, value2, "clockId");
            return (Criteria) this;
        }

        public Criteria andSignTimeIsNull() {
            addCriterion("sign_time is null");
            return (Criteria) this;
        }

        public Criteria andSignTimeIsNotNull() {
            addCriterion("sign_time is not null");
            return (Criteria) this;
        }

        public Criteria andSignTimeEqualTo(String value) {
            addCriterion("sign_time =", value, "signTime");
            return (Criteria) this;
        }

        public Criteria andSignTimeNotEqualTo(String value) {
            addCriterion("sign_time <>", value, "signTime");
            return (Criteria) this;
        }

        public Criteria andSignTimeGreaterThan(String value) {
            addCriterion("sign_time >", value, "signTime");
            return (Criteria) this;
        }

        public Criteria andSignTimeGreaterThanOrEqualTo(String value) {
            addCriterion("sign_time >=", value, "signTime");
            return (Criteria) this;
        }

        public Criteria andSignTimeLessThan(String value) {
            addCriterion("sign_time <", value, "signTime");
            return (Criteria) this;
        }

        public Criteria andSignTimeLessThanOrEqualTo(String value) {
            addCriterion("sign_time <=", value, "signTime");
            return (Criteria) this;
        }

        public Criteria andSignTimeLike(String value) {
            addCriterion("sign_time like", value, "signTime");
            return (Criteria) this;
        }

        public Criteria andSignTimeNotLike(String value) {
            addCriterion("sign_time not like", value, "signTime");
            return (Criteria) this;
        }

        public Criteria andSignTimeIn(List<String> values) {
            addCriterion("sign_time in", values, "signTime");
            return (Criteria) this;
        }

        public Criteria andSignTimeNotIn(List<String> values) {
            addCriterion("sign_time not in", values, "signTime");
            return (Criteria) this;
        }

        public Criteria andSignTimeBetween(String value1, String value2) {
            addCriterion("sign_time between", value1, value2, "signTime");
            return (Criteria) this;
        }

        public Criteria andSignTimeNotBetween(String value1, String value2) {
            addCriterion("sign_time not between", value1, value2, "signTime");
            return (Criteria) this;
        }

        public Criteria andBackTimeIsNull() {
            addCriterion("back_time is null");
            return (Criteria) this;
        }

        public Criteria andBackTimeIsNotNull() {
            addCriterion("back_time is not null");
            return (Criteria) this;
        }

        public Criteria andBackTimeEqualTo(String value) {
            addCriterion("back_time =", value, "backTime");
            return (Criteria) this;
        }

        public Criteria andBackTimeNotEqualTo(String value) {
            addCriterion("back_time <>", value, "backTime");
            return (Criteria) this;
        }

        public Criteria andBackTimeGreaterThan(String value) {
            addCriterion("back_time >", value, "backTime");
            return (Criteria) this;
        }

        public Criteria andBackTimeGreaterThanOrEqualTo(String value) {
            addCriterion("back_time >=", value, "backTime");
            return (Criteria) this;
        }

        public Criteria andBackTimeLessThan(String value) {
            addCriterion("back_time <", value, "backTime");
            return (Criteria) this;
        }

        public Criteria andBackTimeLessThanOrEqualTo(String value) {
            addCriterion("back_time <=", value, "backTime");
            return (Criteria) this;
        }

        public Criteria andBackTimeLike(String value) {
            addCriterion("back_time like", value, "backTime");
            return (Criteria) this;
        }

        public Criteria andBackTimeNotLike(String value) {
            addCriterion("back_time not like", value, "backTime");
            return (Criteria) this;
        }

        public Criteria andBackTimeIn(List<String> values) {
            addCriterion("back_time in", values, "backTime");
            return (Criteria) this;
        }

        public Criteria andBackTimeNotIn(List<String> values) {
            addCriterion("back_time not in", values, "backTime");
            return (Criteria) this;
        }

        public Criteria andBackTimeBetween(String value1, String value2) {
            addCriterion("back_time between", value1, value2, "backTime");
            return (Criteria) this;
        }

        public Criteria andBackTimeNotBetween(String value1, String value2) {
            addCriterion("back_time not between", value1, value2, "backTime");
            return (Criteria) this;
        }

        public Criteria andClockAddrIsNull() {
            addCriterion("clock_addr is null");
            return (Criteria) this;
        }

        public Criteria andClockAddrIsNotNull() {
            addCriterion("clock_addr is not null");
            return (Criteria) this;
        }

        public Criteria andClockAddrEqualTo(String value) {
            addCriterion("clock_addr =", value, "clockAddr");
            return (Criteria) this;
        }

        public Criteria andClockAddrNotEqualTo(String value) {
            addCriterion("clock_addr <>", value, "clockAddr");
            return (Criteria) this;
        }

        public Criteria andClockAddrGreaterThan(String value) {
            addCriterion("clock_addr >", value, "clockAddr");
            return (Criteria) this;
        }

        public Criteria andClockAddrGreaterThanOrEqualTo(String value) {
            addCriterion("clock_addr >=", value, "clockAddr");
            return (Criteria) this;
        }

        public Criteria andClockAddrLessThan(String value) {
            addCriterion("clock_addr <", value, "clockAddr");
            return (Criteria) this;
        }

        public Criteria andClockAddrLessThanOrEqualTo(String value) {
            addCriterion("clock_addr <=", value, "clockAddr");
            return (Criteria) this;
        }

        public Criteria andClockAddrLike(String value) {
            addCriterion("clock_addr like", value, "clockAddr");
            return (Criteria) this;
        }

        public Criteria andClockAddrNotLike(String value) {
            addCriterion("clock_addr not like", value, "clockAddr");
            return (Criteria) this;
        }

        public Criteria andClockAddrIn(List<String> values) {
            addCriterion("clock_addr in", values, "clockAddr");
            return (Criteria) this;
        }

        public Criteria andClockAddrNotIn(List<String> values) {
            addCriterion("clock_addr not in", values, "clockAddr");
            return (Criteria) this;
        }

        public Criteria andClockAddrBetween(String value1, String value2) {
            addCriterion("clock_addr between", value1, value2, "clockAddr");
            return (Criteria) this;
        }

        public Criteria andClockAddrNotBetween(String value1, String value2) {
            addCriterion("clock_addr not between", value1, value2, "clockAddr");
            return (Criteria) this;
        }

        public Criteria andSignClockMarkIsNull() {
            addCriterion("sign_clock_mark is null");
            return (Criteria) this;
        }

        public Criteria andSignClockMarkIsNotNull() {
            addCriterion("sign_clock_mark is not null");
            return (Criteria) this;
        }

        public Criteria andSignClockMarkEqualTo(Integer value) {
            addCriterion("sign_clock_mark =", value, "signClockMark");
            return (Criteria) this;
        }

        public Criteria andSignClockMarkNotEqualTo(Integer value) {
            addCriterion("sign_clock_mark <>", value, "signClockMark");
            return (Criteria) this;
        }

        public Criteria andSignClockMarkGreaterThan(Integer value) {
            addCriterion("sign_clock_mark >", value, "signClockMark");
            return (Criteria) this;
        }

        public Criteria andSignClockMarkGreaterThanOrEqualTo(Integer value) {
            addCriterion("sign_clock_mark >=", value, "signClockMark");
            return (Criteria) this;
        }

        public Criteria andSignClockMarkLessThan(Integer value) {
            addCriterion("sign_clock_mark <", value, "signClockMark");
            return (Criteria) this;
        }

        public Criteria andSignClockMarkLessThanOrEqualTo(Integer value) {
            addCriterion("sign_clock_mark <=", value, "signClockMark");
            return (Criteria) this;
        }

        public Criteria andSignClockMarkIn(List<Integer> values) {
            addCriterion("sign_clock_mark in", values, "signClockMark");
            return (Criteria) this;
        }

        public Criteria andSignClockMarkNotIn(List<Integer> values) {
            addCriterion("sign_clock_mark not in", values, "signClockMark");
            return (Criteria) this;
        }

        public Criteria andSignClockMarkBetween(Integer value1, Integer value2) {
            addCriterion("sign_clock_mark between", value1, value2, "signClockMark");
            return (Criteria) this;
        }

        public Criteria andSignClockMarkNotBetween(Integer value1, Integer value2) {
            addCriterion("sign_clock_mark not between", value1, value2, "signClockMark");
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

        public Criteria andDayIsNull() {
            addCriterion("day is null");
            return (Criteria) this;
        }

        public Criteria andDayIsNotNull() {
            addCriterion("day is not null");
            return (Criteria) this;
        }

        public Criteria andDayEqualTo(Integer value) {
            addCriterion("day =", value, "day");
            return (Criteria) this;
        }

        public Criteria andDayNotEqualTo(Integer value) {
            addCriterion("day <>", value, "day");
            return (Criteria) this;
        }

        public Criteria andDayGreaterThan(Integer value) {
            addCriterion("day >", value, "day");
            return (Criteria) this;
        }

        public Criteria andDayGreaterThanOrEqualTo(Integer value) {
            addCriterion("day >=", value, "day");
            return (Criteria) this;
        }

        public Criteria andDayLessThan(Integer value) {
            addCriterion("day <", value, "day");
            return (Criteria) this;
        }

        public Criteria andDayLessThanOrEqualTo(Integer value) {
            addCriterion("day <=", value, "day");
            return (Criteria) this;
        }

        public Criteria andDayIn(List<Integer> values) {
            addCriterion("day in", values, "day");
            return (Criteria) this;
        }

        public Criteria andDayNotIn(List<Integer> values) {
            addCriterion("day not in", values, "day");
            return (Criteria) this;
        }

        public Criteria andDayBetween(Integer value1, Integer value2) {
            addCriterion("day between", value1, value2, "day");
            return (Criteria) this;
        }

        public Criteria andDayNotBetween(Integer value1, Integer value2) {
            addCriterion("day not between", value1, value2, "day");
            return (Criteria) this;
        }

        public Criteria andBackClockMarkIsNull() {
            addCriterion("back_clock_mark is null");
            return (Criteria) this;
        }

        public Criteria andBackClockMarkIsNotNull() {
            addCriterion("back_clock_mark is not null");
            return (Criteria) this;
        }

        public Criteria andBackClockMarkEqualTo(Integer value) {
            addCriterion("back_clock_mark =", value, "backClockMark");
            return (Criteria) this;
        }

        public Criteria andBackClockMarkNotEqualTo(Integer value) {
            addCriterion("back_clock_mark <>", value, "backClockMark");
            return (Criteria) this;
        }

        public Criteria andBackClockMarkGreaterThan(Integer value) {
            addCriterion("back_clock_mark >", value, "backClockMark");
            return (Criteria) this;
        }

        public Criteria andBackClockMarkGreaterThanOrEqualTo(Integer value) {
            addCriterion("back_clock_mark >=", value, "backClockMark");
            return (Criteria) this;
        }

        public Criteria andBackClockMarkLessThan(Integer value) {
            addCriterion("back_clock_mark <", value, "backClockMark");
            return (Criteria) this;
        }

        public Criteria andBackClockMarkLessThanOrEqualTo(Integer value) {
            addCriterion("back_clock_mark <=", value, "backClockMark");
            return (Criteria) this;
        }

        public Criteria andBackClockMarkIn(List<Integer> values) {
            addCriterion("back_clock_mark in", values, "backClockMark");
            return (Criteria) this;
        }

        public Criteria andBackClockMarkNotIn(List<Integer> values) {
            addCriterion("back_clock_mark not in", values, "backClockMark");
            return (Criteria) this;
        }

        public Criteria andBackClockMarkBetween(Integer value1, Integer value2) {
            addCriterion("back_clock_mark between", value1, value2, "backClockMark");
            return (Criteria) this;
        }

        public Criteria andBackClockMarkNotBetween(Integer value1, Integer value2) {
            addCriterion("back_clock_mark not between", value1, value2, "backClockMark");
            return (Criteria) this;
        }

        public Criteria andBackAddrIsNull() {
            addCriterion("back_addr is null");
            return (Criteria) this;
        }

        public Criteria andBackAddrIsNotNull() {
            addCriterion("back_addr is not null");
            return (Criteria) this;
        }

        public Criteria andBackAddrEqualTo(String value) {
            addCriterion("back_addr =", value, "backAddr");
            return (Criteria) this;
        }

        public Criteria andBackAddrNotEqualTo(String value) {
            addCriterion("back_addr <>", value, "backAddr");
            return (Criteria) this;
        }

        public Criteria andBackAddrGreaterThan(String value) {
            addCriterion("back_addr >", value, "backAddr");
            return (Criteria) this;
        }

        public Criteria andBackAddrGreaterThanOrEqualTo(String value) {
            addCriterion("back_addr >=", value, "backAddr");
            return (Criteria) this;
        }

        public Criteria andBackAddrLessThan(String value) {
            addCriterion("back_addr <", value, "backAddr");
            return (Criteria) this;
        }

        public Criteria andBackAddrLessThanOrEqualTo(String value) {
            addCriterion("back_addr <=", value, "backAddr");
            return (Criteria) this;
        }

        public Criteria andBackAddrLike(String value) {
            addCriterion("back_addr like", value, "backAddr");
            return (Criteria) this;
        }

        public Criteria andBackAddrNotLike(String value) {
            addCriterion("back_addr not like", value, "backAddr");
            return (Criteria) this;
        }

        public Criteria andBackAddrIn(List<String> values) {
            addCriterion("back_addr in", values, "backAddr");
            return (Criteria) this;
        }

        public Criteria andBackAddrNotIn(List<String> values) {
            addCriterion("back_addr not in", values, "backAddr");
            return (Criteria) this;
        }

        public Criteria andBackAddrBetween(String value1, String value2) {
            addCriterion("back_addr between", value1, value2, "backAddr");
            return (Criteria) this;
        }

        public Criteria andBackAddrNotBetween(String value1, String value2) {
            addCriterion("back_addr not between", value1, value2, "backAddr");
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

        public Criteria andSignLatiIsNull() {
            addCriterion("sign_lati is null");
            return (Criteria) this;
        }

        public Criteria andSignLatiIsNotNull() {
            addCriterion("sign_lati is not null");
            return (Criteria) this;
        }

        public Criteria andSignLatiEqualTo(String value) {
            addCriterion("sign_lati =", value, "signLati");
            return (Criteria) this;
        }

        public Criteria andSignLatiNotEqualTo(String value) {
            addCriterion("sign_lati <>", value, "signLati");
            return (Criteria) this;
        }

        public Criteria andSignLatiGreaterThan(String value) {
            addCriterion("sign_lati >", value, "signLati");
            return (Criteria) this;
        }

        public Criteria andSignLatiGreaterThanOrEqualTo(String value) {
            addCriterion("sign_lati >=", value, "signLati");
            return (Criteria) this;
        }

        public Criteria andSignLatiLessThan(String value) {
            addCriterion("sign_lati <", value, "signLati");
            return (Criteria) this;
        }

        public Criteria andSignLatiLessThanOrEqualTo(String value) {
            addCriterion("sign_lati <=", value, "signLati");
            return (Criteria) this;
        }

        public Criteria andSignLatiLike(String value) {
            addCriterion("sign_lati like", value, "signLati");
            return (Criteria) this;
        }

        public Criteria andSignLatiNotLike(String value) {
            addCriterion("sign_lati not like", value, "signLati");
            return (Criteria) this;
        }

        public Criteria andSignLatiIn(List<String> values) {
            addCriterion("sign_lati in", values, "signLati");
            return (Criteria) this;
        }

        public Criteria andSignLatiNotIn(List<String> values) {
            addCriterion("sign_lati not in", values, "signLati");
            return (Criteria) this;
        }

        public Criteria andSignLatiBetween(String value1, String value2) {
            addCriterion("sign_lati between", value1, value2, "signLati");
            return (Criteria) this;
        }

        public Criteria andSignLatiNotBetween(String value1, String value2) {
            addCriterion("sign_lati not between", value1, value2, "signLati");
            return (Criteria) this;
        }

        public Criteria andBackLatiIsNull() {
            addCriterion("back_lati is null");
            return (Criteria) this;
        }

        public Criteria andBackLatiIsNotNull() {
            addCriterion("back_lati is not null");
            return (Criteria) this;
        }

        public Criteria andBackLatiEqualTo(String value) {
            addCriterion("back_lati =", value, "backLati");
            return (Criteria) this;
        }

        public Criteria andBackLatiNotEqualTo(String value) {
            addCriterion("back_lati <>", value, "backLati");
            return (Criteria) this;
        }

        public Criteria andBackLatiGreaterThan(String value) {
            addCriterion("back_lati >", value, "backLati");
            return (Criteria) this;
        }

        public Criteria andBackLatiGreaterThanOrEqualTo(String value) {
            addCriterion("back_lati >=", value, "backLati");
            return (Criteria) this;
        }

        public Criteria andBackLatiLessThan(String value) {
            addCriterion("back_lati <", value, "backLati");
            return (Criteria) this;
        }

        public Criteria andBackLatiLessThanOrEqualTo(String value) {
            addCriterion("back_lati <=", value, "backLati");
            return (Criteria) this;
        }

        public Criteria andBackLatiLike(String value) {
            addCriterion("back_lati like", value, "backLati");
            return (Criteria) this;
        }

        public Criteria andBackLatiNotLike(String value) {
            addCriterion("back_lati not like", value, "backLati");
            return (Criteria) this;
        }

        public Criteria andBackLatiIn(List<String> values) {
            addCriterion("back_lati in", values, "backLati");
            return (Criteria) this;
        }

        public Criteria andBackLatiNotIn(List<String> values) {
            addCriterion("back_lati not in", values, "backLati");
            return (Criteria) this;
        }

        public Criteria andBackLatiBetween(String value1, String value2) {
            addCriterion("back_lati between", value1, value2, "backLati");
            return (Criteria) this;
        }

        public Criteria andBackLatiNotBetween(String value1, String value2) {
            addCriterion("back_lati not between", value1, value2, "backLati");
            return (Criteria) this;
        }

        public Criteria andWorkloadIsNull() {
            addCriterion("workLoad is null");
            return (Criteria) this;
        }

        public Criteria andWorkloadIsNotNull() {
            addCriterion("workLoad is not null");
            return (Criteria) this;
        }

        public Criteria andWorkloadEqualTo(String value) {
            addCriterion("workLoad =", value, "workload");
            return (Criteria) this;
        }

        public Criteria andWorkloadNotEqualTo(String value) {
            addCriterion("workLoad <>", value, "workload");
            return (Criteria) this;
        }

        public Criteria andWorkloadGreaterThan(String value) {
            addCriterion("workLoad >", value, "workload");
            return (Criteria) this;
        }

        public Criteria andWorkloadGreaterThanOrEqualTo(String value) {
            addCriterion("workLoad >=", value, "workload");
            return (Criteria) this;
        }

        public Criteria andWorkloadLessThan(String value) {
            addCriterion("workLoad <", value, "workload");
            return (Criteria) this;
        }

        public Criteria andWorkloadLessThanOrEqualTo(String value) {
            addCriterion("workLoad <=", value, "workload");
            return (Criteria) this;
        }

        public Criteria andWorkloadLike(String value) {
            addCriterion("workLoad like", value, "workload");
            return (Criteria) this;
        }

        public Criteria andWorkloadNotLike(String value) {
            addCriterion("workLoad not like", value, "workload");
            return (Criteria) this;
        }

        public Criteria andWorkloadIn(List<String> values) {
            addCriterion("workLoad in", values, "workload");
            return (Criteria) this;
        }

        public Criteria andWorkloadNotIn(List<String> values) {
            addCriterion("workLoad not in", values, "workload");
            return (Criteria) this;
        }

        public Criteria andWorkloadBetween(String value1, String value2) {
            addCriterion("workLoad between", value1, value2, "workload");
            return (Criteria) this;
        }

        public Criteria andWorkloadNotBetween(String value1, String value2) {
            addCriterion("workLoad not between", value1, value2, "workload");
            return (Criteria) this;
        }

        public Criteria andPathIsNull() {
            addCriterion("path is null");
            return (Criteria) this;
        }

        public Criteria andPathIsNotNull() {
            addCriterion("path is not null");
            return (Criteria) this;
        }

        public Criteria andPathEqualTo(String value) {
            addCriterion("path =", value, "path");
            return (Criteria) this;
        }

        public Criteria andPathNotEqualTo(String value) {
            addCriterion("path <>", value, "path");
            return (Criteria) this;
        }

        public Criteria andPathGreaterThan(String value) {
            addCriterion("path >", value, "path");
            return (Criteria) this;
        }

        public Criteria andPathGreaterThanOrEqualTo(String value) {
            addCriterion("path >=", value, "path");
            return (Criteria) this;
        }

        public Criteria andPathLessThan(String value) {
            addCriterion("path <", value, "path");
            return (Criteria) this;
        }

        public Criteria andPathLessThanOrEqualTo(String value) {
            addCriterion("path <=", value, "path");
            return (Criteria) this;
        }

        public Criteria andPathLike(String value) {
            addCriterion("path like", value, "path");
            return (Criteria) this;
        }

        public Criteria andPathNotLike(String value) {
            addCriterion("path not like", value, "path");
            return (Criteria) this;
        }

        public Criteria andPathIn(List<String> values) {
            addCriterion("path in", values, "path");
            return (Criteria) this;
        }

        public Criteria andPathNotIn(List<String> values) {
            addCriterion("path not in", values, "path");
            return (Criteria) this;
        }

        public Criteria andPathBetween(String value1, String value2) {
            addCriterion("path between", value1, value2, "path");
            return (Criteria) this;
        }

        public Criteria andPathNotBetween(String value1, String value2) {
            addCriterion("path not between", value1, value2, "path");
            return (Criteria) this;
        }

        public Criteria andWorkTicketUrlIsNull() {
            addCriterion("work_ticket_url is null");
            return (Criteria) this;
        }

        public Criteria andWorkTicketUrlIsNotNull() {
            addCriterion("work_ticket_url is not null");
            return (Criteria) this;
        }

        public Criteria andWorkTicketUrlEqualTo(String value) {
            addCriterion("work_ticket_url =", value, "workTicketUrl");
            return (Criteria) this;
        }

        public Criteria andWorkTicketUrlNotEqualTo(String value) {
            addCriterion("work_ticket_url <>", value, "workTicketUrl");
            return (Criteria) this;
        }

        public Criteria andWorkTicketUrlGreaterThan(String value) {
            addCriterion("work_ticket_url >", value, "workTicketUrl");
            return (Criteria) this;
        }

        public Criteria andWorkTicketUrlGreaterThanOrEqualTo(String value) {
            addCriterion("work_ticket_url >=", value, "workTicketUrl");
            return (Criteria) this;
        }

        public Criteria andWorkTicketUrlLessThan(String value) {
            addCriterion("work_ticket_url <", value, "workTicketUrl");
            return (Criteria) this;
        }

        public Criteria andWorkTicketUrlLessThanOrEqualTo(String value) {
            addCriterion("work_ticket_url <=", value, "workTicketUrl");
            return (Criteria) this;
        }

        public Criteria andWorkTicketUrlLike(String value) {
            addCriterion("work_ticket_url like", value, "workTicketUrl");
            return (Criteria) this;
        }

        public Criteria andWorkTicketUrlNotLike(String value) {
            addCriterion("work_ticket_url not like", value, "workTicketUrl");
            return (Criteria) this;
        }

        public Criteria andWorkTicketUrlIn(List<String> values) {
            addCriterion("work_ticket_url in", values, "workTicketUrl");
            return (Criteria) this;
        }

        public Criteria andWorkTicketUrlNotIn(List<String> values) {
            addCriterion("work_ticket_url not in", values, "workTicketUrl");
            return (Criteria) this;
        }

        public Criteria andWorkTicketUrlBetween(String value1, String value2) {
            addCriterion("work_ticket_url between", value1, value2, "workTicketUrl");
            return (Criteria) this;
        }

        public Criteria andWorkTicketUrlNotBetween(String value1, String value2) {
            addCriterion("work_ticket_url not between", value1, value2, "workTicketUrl");
            return (Criteria) this;
        }

        public Criteria andGroundProtectUrlIsNull() {
            addCriterion("ground_protect_url is null");
            return (Criteria) this;
        }

        public Criteria andGroundProtectUrlIsNotNull() {
            addCriterion("ground_protect_url is not null");
            return (Criteria) this;
        }

        public Criteria andGroundProtectUrlEqualTo(String value) {
            addCriterion("ground_protect_url =", value, "groundProtectUrl");
            return (Criteria) this;
        }

        public Criteria andGroundProtectUrlNotEqualTo(String value) {
            addCriterion("ground_protect_url <>", value, "groundProtectUrl");
            return (Criteria) this;
        }

        public Criteria andGroundProtectUrlGreaterThan(String value) {
            addCriterion("ground_protect_url >", value, "groundProtectUrl");
            return (Criteria) this;
        }

        public Criteria andGroundProtectUrlGreaterThanOrEqualTo(String value) {
            addCriterion("ground_protect_url >=", value, "groundProtectUrl");
            return (Criteria) this;
        }

        public Criteria andGroundProtectUrlLessThan(String value) {
            addCriterion("ground_protect_url <", value, "groundProtectUrl");
            return (Criteria) this;
        }

        public Criteria andGroundProtectUrlLessThanOrEqualTo(String value) {
            addCriterion("ground_protect_url <=", value, "groundProtectUrl");
            return (Criteria) this;
        }

        public Criteria andGroundProtectUrlLike(String value) {
            addCriterion("ground_protect_url like", value, "groundProtectUrl");
            return (Criteria) this;
        }

        public Criteria andGroundProtectUrlNotLike(String value) {
            addCriterion("ground_protect_url not like", value, "groundProtectUrl");
            return (Criteria) this;
        }

        public Criteria andGroundProtectUrlIn(List<String> values) {
            addCriterion("ground_protect_url in", values, "groundProtectUrl");
            return (Criteria) this;
        }

        public Criteria andGroundProtectUrlNotIn(List<String> values) {
            addCriterion("ground_protect_url not in", values, "groundProtectUrl");
            return (Criteria) this;
        }

        public Criteria andGroundProtectUrlBetween(String value1, String value2) {
            addCriterion("ground_protect_url between", value1, value2, "groundProtectUrl");
            return (Criteria) this;
        }

        public Criteria andGroundProtectUrlNotBetween(String value1, String value2) {
            addCriterion("ground_protect_url not between", value1, value2, "groundProtectUrl");
            return (Criteria) this;
        }

        public Criteria andWorkMapUrlIsNull() {
            addCriterion("work_map_url is null");
            return (Criteria) this;
        }

        public Criteria andWorkMapUrlIsNotNull() {
            addCriterion("work_map_url is not null");
            return (Criteria) this;
        }

        public Criteria andWorkMapUrlEqualTo(String value) {
            addCriterion("work_map_url =", value, "workMapUrl");
            return (Criteria) this;
        }

        public Criteria andWorkMapUrlNotEqualTo(String value) {
            addCriterion("work_map_url <>", value, "workMapUrl");
            return (Criteria) this;
        }

        public Criteria andWorkMapUrlGreaterThan(String value) {
            addCriterion("work_map_url >", value, "workMapUrl");
            return (Criteria) this;
        }

        public Criteria andWorkMapUrlGreaterThanOrEqualTo(String value) {
            addCriterion("work_map_url >=", value, "workMapUrl");
            return (Criteria) this;
        }

        public Criteria andWorkMapUrlLessThan(String value) {
            addCriterion("work_map_url <", value, "workMapUrl");
            return (Criteria) this;
        }

        public Criteria andWorkMapUrlLessThanOrEqualTo(String value) {
            addCriterion("work_map_url <=", value, "workMapUrl");
            return (Criteria) this;
        }

        public Criteria andWorkMapUrlLike(String value) {
            addCriterion("work_map_url like", value, "workMapUrl");
            return (Criteria) this;
        }

        public Criteria andWorkMapUrlNotLike(String value) {
            addCriterion("work_map_url not like", value, "workMapUrl");
            return (Criteria) this;
        }

        public Criteria andWorkMapUrlIn(List<String> values) {
            addCriterion("work_map_url in", values, "workMapUrl");
            return (Criteria) this;
        }

        public Criteria andWorkMapUrlNotIn(List<String> values) {
            addCriterion("work_map_url not in", values, "workMapUrl");
            return (Criteria) this;
        }

        public Criteria andWorkMapUrlBetween(String value1, String value2) {
            addCriterion("work_map_url between", value1, value2, "workMapUrl");
            return (Criteria) this;
        }

        public Criteria andWorkMapUrlNotBetween(String value1, String value2) {
            addCriterion("work_map_url not between", value1, value2, "workMapUrl");
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