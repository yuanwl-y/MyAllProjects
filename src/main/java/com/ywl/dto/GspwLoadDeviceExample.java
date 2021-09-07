package com.ywl.dto;

import java.util.ArrayList;
import java.util.List;

public class GspwLoadDeviceExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public GspwLoadDeviceExample() {
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

        public Criteria andDeviceIdIsNull() {
            addCriterion("device_id is null");
            return (Criteria) this;
        }

        public Criteria andDeviceIdIsNotNull() {
            addCriterion("device_id is not null");
            return (Criteria) this;
        }

        public Criteria andDeviceIdEqualTo(Integer value) {
            addCriterion("device_id =", value, "deviceId");
            return (Criteria) this;
        }

        public Criteria andDeviceIdNotEqualTo(Integer value) {
            addCriterion("device_id <>", value, "deviceId");
            return (Criteria) this;
        }

        public Criteria andDeviceIdGreaterThan(Integer value) {
            addCriterion("device_id >", value, "deviceId");
            return (Criteria) this;
        }

        public Criteria andDeviceIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("device_id >=", value, "deviceId");
            return (Criteria) this;
        }

        public Criteria andDeviceIdLessThan(Integer value) {
            addCriterion("device_id <", value, "deviceId");
            return (Criteria) this;
        }

        public Criteria andDeviceIdLessThanOrEqualTo(Integer value) {
            addCriterion("device_id <=", value, "deviceId");
            return (Criteria) this;
        }

        public Criteria andDeviceIdIn(List<Integer> values) {
            addCriterion("device_id in", values, "deviceId");
            return (Criteria) this;
        }

        public Criteria andDeviceIdNotIn(List<Integer> values) {
            addCriterion("device_id not in", values, "deviceId");
            return (Criteria) this;
        }

        public Criteria andDeviceIdBetween(Integer value1, Integer value2) {
            addCriterion("device_id between", value1, value2, "deviceId");
            return (Criteria) this;
        }

        public Criteria andDeviceIdNotBetween(Integer value1, Integer value2) {
            addCriterion("device_id not between", value1, value2, "deviceId");
            return (Criteria) this;
        }

        public Criteria andDeviceScoreIdIsNull() {
            addCriterion("device_score_id is null");
            return (Criteria) this;
        }

        public Criteria andDeviceScoreIdIsNotNull() {
            addCriterion("device_score_id is not null");
            return (Criteria) this;
        }

        public Criteria andDeviceScoreIdEqualTo(Integer value) {
            addCriterion("device_score_id =", value, "deviceScoreId");
            return (Criteria) this;
        }

        public Criteria andDeviceScoreIdNotEqualTo(Integer value) {
            addCriterion("device_score_id <>", value, "deviceScoreId");
            return (Criteria) this;
        }

        public Criteria andDeviceScoreIdGreaterThan(Integer value) {
            addCriterion("device_score_id >", value, "deviceScoreId");
            return (Criteria) this;
        }

        public Criteria andDeviceScoreIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("device_score_id >=", value, "deviceScoreId");
            return (Criteria) this;
        }

        public Criteria andDeviceScoreIdLessThan(Integer value) {
            addCriterion("device_score_id <", value, "deviceScoreId");
            return (Criteria) this;
        }

        public Criteria andDeviceScoreIdLessThanOrEqualTo(Integer value) {
            addCriterion("device_score_id <=", value, "deviceScoreId");
            return (Criteria) this;
        }

        public Criteria andDeviceScoreIdIn(List<Integer> values) {
            addCriterion("device_score_id in", values, "deviceScoreId");
            return (Criteria) this;
        }

        public Criteria andDeviceScoreIdNotIn(List<Integer> values) {
            addCriterion("device_score_id not in", values, "deviceScoreId");
            return (Criteria) this;
        }

        public Criteria andDeviceScoreIdBetween(Integer value1, Integer value2) {
            addCriterion("device_score_id between", value1, value2, "deviceScoreId");
            return (Criteria) this;
        }

        public Criteria andDeviceScoreIdNotBetween(Integer value1, Integer value2) {
            addCriterion("device_score_id not between", value1, value2, "deviceScoreId");
            return (Criteria) this;
        }

        public Criteria andDeviceTypeIdIsNull() {
            addCriterion("device_type_id is null");
            return (Criteria) this;
        }

        public Criteria andDeviceTypeIdIsNotNull() {
            addCriterion("device_type_id is not null");
            return (Criteria) this;
        }

        public Criteria andDeviceTypeIdEqualTo(Integer value) {
            addCriterion("device_type_id =", value, "deviceTypeId");
            return (Criteria) this;
        }

        public Criteria andDeviceTypeIdNotEqualTo(Integer value) {
            addCriterion("device_type_id <>", value, "deviceTypeId");
            return (Criteria) this;
        }

        public Criteria andDeviceTypeIdGreaterThan(Integer value) {
            addCriterion("device_type_id >", value, "deviceTypeId");
            return (Criteria) this;
        }

        public Criteria andDeviceTypeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("device_type_id >=", value, "deviceTypeId");
            return (Criteria) this;
        }

        public Criteria andDeviceTypeIdLessThan(Integer value) {
            addCriterion("device_type_id <", value, "deviceTypeId");
            return (Criteria) this;
        }

        public Criteria andDeviceTypeIdLessThanOrEqualTo(Integer value) {
            addCriterion("device_type_id <=", value, "deviceTypeId");
            return (Criteria) this;
        }

        public Criteria andDeviceTypeIdIn(List<Integer> values) {
            addCriterion("device_type_id in", values, "deviceTypeId");
            return (Criteria) this;
        }

        public Criteria andDeviceTypeIdNotIn(List<Integer> values) {
            addCriterion("device_type_id not in", values, "deviceTypeId");
            return (Criteria) this;
        }

        public Criteria andDeviceTypeIdBetween(Integer value1, Integer value2) {
            addCriterion("device_type_id between", value1, value2, "deviceTypeId");
            return (Criteria) this;
        }

        public Criteria andDeviceTypeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("device_type_id not between", value1, value2, "deviceTypeId");
            return (Criteria) this;
        }

        public Criteria andDeviceNameIsNull() {
            addCriterion("device_name is null");
            return (Criteria) this;
        }

        public Criteria andDeviceNameIsNotNull() {
            addCriterion("device_name is not null");
            return (Criteria) this;
        }

        public Criteria andDeviceNameEqualTo(String value) {
            addCriterion("device_name =", value, "deviceName");
            return (Criteria) this;
        }

        public Criteria andDeviceNameNotEqualTo(String value) {
            addCriterion("device_name <>", value, "deviceName");
            return (Criteria) this;
        }

        public Criteria andDeviceNameGreaterThan(String value) {
            addCriterion("device_name >", value, "deviceName");
            return (Criteria) this;
        }

        public Criteria andDeviceNameGreaterThanOrEqualTo(String value) {
            addCriterion("device_name >=", value, "deviceName");
            return (Criteria) this;
        }

        public Criteria andDeviceNameLessThan(String value) {
            addCriterion("device_name <", value, "deviceName");
            return (Criteria) this;
        }

        public Criteria andDeviceNameLessThanOrEqualTo(String value) {
            addCriterion("device_name <=", value, "deviceName");
            return (Criteria) this;
        }

        public Criteria andDeviceNameLike(String value) {
            addCriterion("device_name like", value, "deviceName");
            return (Criteria) this;
        }

        public Criteria andDeviceNameNotLike(String value) {
            addCriterion("device_name not like", value, "deviceName");
            return (Criteria) this;
        }

        public Criteria andDeviceNameIn(List<String> values) {
            addCriterion("device_name in", values, "deviceName");
            return (Criteria) this;
        }

        public Criteria andDeviceNameNotIn(List<String> values) {
            addCriterion("device_name not in", values, "deviceName");
            return (Criteria) this;
        }

        public Criteria andDeviceNameBetween(String value1, String value2) {
            addCriterion("device_name between", value1, value2, "deviceName");
            return (Criteria) this;
        }

        public Criteria andDeviceNameNotBetween(String value1, String value2) {
            addCriterion("device_name not between", value1, value2, "deviceName");
            return (Criteria) this;
        }

        public Criteria andDevicePurposeIsNull() {
            addCriterion("device_purpose is null");
            return (Criteria) this;
        }

        public Criteria andDevicePurposeIsNotNull() {
            addCriterion("device_purpose is not null");
            return (Criteria) this;
        }

        public Criteria andDevicePurposeEqualTo(String value) {
            addCriterion("device_purpose =", value, "devicePurpose");
            return (Criteria) this;
        }

        public Criteria andDevicePurposeNotEqualTo(String value) {
            addCriterion("device_purpose <>", value, "devicePurpose");
            return (Criteria) this;
        }

        public Criteria andDevicePurposeGreaterThan(String value) {
            addCriterion("device_purpose >", value, "devicePurpose");
            return (Criteria) this;
        }

        public Criteria andDevicePurposeGreaterThanOrEqualTo(String value) {
            addCriterion("device_purpose >=", value, "devicePurpose");
            return (Criteria) this;
        }

        public Criteria andDevicePurposeLessThan(String value) {
            addCriterion("device_purpose <", value, "devicePurpose");
            return (Criteria) this;
        }

        public Criteria andDevicePurposeLessThanOrEqualTo(String value) {
            addCriterion("device_purpose <=", value, "devicePurpose");
            return (Criteria) this;
        }

        public Criteria andDevicePurposeLike(String value) {
            addCriterion("device_purpose like", value, "devicePurpose");
            return (Criteria) this;
        }

        public Criteria andDevicePurposeNotLike(String value) {
            addCriterion("device_purpose not like", value, "devicePurpose");
            return (Criteria) this;
        }

        public Criteria andDevicePurposeIn(List<String> values) {
            addCriterion("device_purpose in", values, "devicePurpose");
            return (Criteria) this;
        }

        public Criteria andDevicePurposeNotIn(List<String> values) {
            addCriterion("device_purpose not in", values, "devicePurpose");
            return (Criteria) this;
        }

        public Criteria andDevicePurposeBetween(String value1, String value2) {
            addCriterion("device_purpose between", value1, value2, "devicePurpose");
            return (Criteria) this;
        }

        public Criteria andDevicePurposeNotBetween(String value1, String value2) {
            addCriterion("device_purpose not between", value1, value2, "devicePurpose");
            return (Criteria) this;
        }

        public Criteria andDeviceNoIsNull() {
            addCriterion("device_no is null");
            return (Criteria) this;
        }

        public Criteria andDeviceNoIsNotNull() {
            addCriterion("device_no is not null");
            return (Criteria) this;
        }

        public Criteria andDeviceNoEqualTo(String value) {
            addCriterion("device_no =", value, "deviceNo");
            return (Criteria) this;
        }

        public Criteria andDeviceNoNotEqualTo(String value) {
            addCriterion("device_no <>", value, "deviceNo");
            return (Criteria) this;
        }

        public Criteria andDeviceNoGreaterThan(String value) {
            addCriterion("device_no >", value, "deviceNo");
            return (Criteria) this;
        }

        public Criteria andDeviceNoGreaterThanOrEqualTo(String value) {
            addCriterion("device_no >=", value, "deviceNo");
            return (Criteria) this;
        }

        public Criteria andDeviceNoLessThan(String value) {
            addCriterion("device_no <", value, "deviceNo");
            return (Criteria) this;
        }

        public Criteria andDeviceNoLessThanOrEqualTo(String value) {
            addCriterion("device_no <=", value, "deviceNo");
            return (Criteria) this;
        }

        public Criteria andDeviceNoLike(String value) {
            addCriterion("device_no like", value, "deviceNo");
            return (Criteria) this;
        }

        public Criteria andDeviceNoNotLike(String value) {
            addCriterion("device_no not like", value, "deviceNo");
            return (Criteria) this;
        }

        public Criteria andDeviceNoIn(List<String> values) {
            addCriterion("device_no in", values, "deviceNo");
            return (Criteria) this;
        }

        public Criteria andDeviceNoNotIn(List<String> values) {
            addCriterion("device_no not in", values, "deviceNo");
            return (Criteria) this;
        }

        public Criteria andDeviceNoBetween(String value1, String value2) {
            addCriterion("device_no between", value1, value2, "deviceNo");
            return (Criteria) this;
        }

        public Criteria andDeviceNoNotBetween(String value1, String value2) {
            addCriterion("device_no not between", value1, value2, "deviceNo");
            return (Criteria) this;
        }

        public Criteria andDeviceFinalNoIsNull() {
            addCriterion("device_final_no is null");
            return (Criteria) this;
        }

        public Criteria andDeviceFinalNoIsNotNull() {
            addCriterion("device_final_no is not null");
            return (Criteria) this;
        }

        public Criteria andDeviceFinalNoEqualTo(String value) {
            addCriterion("device_final_no =", value, "deviceFinalNo");
            return (Criteria) this;
        }

        public Criteria andDeviceFinalNoNotEqualTo(String value) {
            addCriterion("device_final_no <>", value, "deviceFinalNo");
            return (Criteria) this;
        }

        public Criteria andDeviceFinalNoGreaterThan(String value) {
            addCriterion("device_final_no >", value, "deviceFinalNo");
            return (Criteria) this;
        }

        public Criteria andDeviceFinalNoGreaterThanOrEqualTo(String value) {
            addCriterion("device_final_no >=", value, "deviceFinalNo");
            return (Criteria) this;
        }

        public Criteria andDeviceFinalNoLessThan(String value) {
            addCriterion("device_final_no <", value, "deviceFinalNo");
            return (Criteria) this;
        }

        public Criteria andDeviceFinalNoLessThanOrEqualTo(String value) {
            addCriterion("device_final_no <=", value, "deviceFinalNo");
            return (Criteria) this;
        }

        public Criteria andDeviceFinalNoLike(String value) {
            addCriterion("device_final_no like", value, "deviceFinalNo");
            return (Criteria) this;
        }

        public Criteria andDeviceFinalNoNotLike(String value) {
            addCriterion("device_final_no not like", value, "deviceFinalNo");
            return (Criteria) this;
        }

        public Criteria andDeviceFinalNoIn(List<String> values) {
            addCriterion("device_final_no in", values, "deviceFinalNo");
            return (Criteria) this;
        }

        public Criteria andDeviceFinalNoNotIn(List<String> values) {
            addCriterion("device_final_no not in", values, "deviceFinalNo");
            return (Criteria) this;
        }

        public Criteria andDeviceFinalNoBetween(String value1, String value2) {
            addCriterion("device_final_no between", value1, value2, "deviceFinalNo");
            return (Criteria) this;
        }

        public Criteria andDeviceFinalNoNotBetween(String value1, String value2) {
            addCriterion("device_final_no not between", value1, value2, "deviceFinalNo");
            return (Criteria) this;
        }

        public Criteria andDeviceContextIsNull() {
            addCriterion("device_context is null");
            return (Criteria) this;
        }

        public Criteria andDeviceContextIsNotNull() {
            addCriterion("device_context is not null");
            return (Criteria) this;
        }

        public Criteria andDeviceContextEqualTo(String value) {
            addCriterion("device_context =", value, "deviceContext");
            return (Criteria) this;
        }

        public Criteria andDeviceContextNotEqualTo(String value) {
            addCriterion("device_context <>", value, "deviceContext");
            return (Criteria) this;
        }

        public Criteria andDeviceContextGreaterThan(String value) {
            addCriterion("device_context >", value, "deviceContext");
            return (Criteria) this;
        }

        public Criteria andDeviceContextGreaterThanOrEqualTo(String value) {
            addCriterion("device_context >=", value, "deviceContext");
            return (Criteria) this;
        }

        public Criteria andDeviceContextLessThan(String value) {
            addCriterion("device_context <", value, "deviceContext");
            return (Criteria) this;
        }

        public Criteria andDeviceContextLessThanOrEqualTo(String value) {
            addCriterion("device_context <=", value, "deviceContext");
            return (Criteria) this;
        }

        public Criteria andDeviceContextLike(String value) {
            addCriterion("device_context like", value, "deviceContext");
            return (Criteria) this;
        }

        public Criteria andDeviceContextNotLike(String value) {
            addCriterion("device_context not like", value, "deviceContext");
            return (Criteria) this;
        }

        public Criteria andDeviceContextIn(List<String> values) {
            addCriterion("device_context in", values, "deviceContext");
            return (Criteria) this;
        }

        public Criteria andDeviceContextNotIn(List<String> values) {
            addCriterion("device_context not in", values, "deviceContext");
            return (Criteria) this;
        }

        public Criteria andDeviceContextBetween(String value1, String value2) {
            addCriterion("device_context between", value1, value2, "deviceContext");
            return (Criteria) this;
        }

        public Criteria andDeviceContextNotBetween(String value1, String value2) {
            addCriterion("device_context not between", value1, value2, "deviceContext");
            return (Criteria) this;
        }

        public Criteria andDeviceUrlIsNull() {
            addCriterion("device_url is null");
            return (Criteria) this;
        }

        public Criteria andDeviceUrlIsNotNull() {
            addCriterion("device_url is not null");
            return (Criteria) this;
        }

        public Criteria andDeviceUrlEqualTo(String value) {
            addCriterion("device_url =", value, "deviceUrl");
            return (Criteria) this;
        }

        public Criteria andDeviceUrlNotEqualTo(String value) {
            addCriterion("device_url <>", value, "deviceUrl");
            return (Criteria) this;
        }

        public Criteria andDeviceUrlGreaterThan(String value) {
            addCriterion("device_url >", value, "deviceUrl");
            return (Criteria) this;
        }

        public Criteria andDeviceUrlGreaterThanOrEqualTo(String value) {
            addCriterion("device_url >=", value, "deviceUrl");
            return (Criteria) this;
        }

        public Criteria andDeviceUrlLessThan(String value) {
            addCriterion("device_url <", value, "deviceUrl");
            return (Criteria) this;
        }

        public Criteria andDeviceUrlLessThanOrEqualTo(String value) {
            addCriterion("device_url <=", value, "deviceUrl");
            return (Criteria) this;
        }

        public Criteria andDeviceUrlLike(String value) {
            addCriterion("device_url like", value, "deviceUrl");
            return (Criteria) this;
        }

        public Criteria andDeviceUrlNotLike(String value) {
            addCriterion("device_url not like", value, "deviceUrl");
            return (Criteria) this;
        }

        public Criteria andDeviceUrlIn(List<String> values) {
            addCriterion("device_url in", values, "deviceUrl");
            return (Criteria) this;
        }

        public Criteria andDeviceUrlNotIn(List<String> values) {
            addCriterion("device_url not in", values, "deviceUrl");
            return (Criteria) this;
        }

        public Criteria andDeviceUrlBetween(String value1, String value2) {
            addCriterion("device_url between", value1, value2, "deviceUrl");
            return (Criteria) this;
        }

        public Criteria andDeviceUrlNotBetween(String value1, String value2) {
            addCriterion("device_url not between", value1, value2, "deviceUrl");
            return (Criteria) this;
        }

        public Criteria andDeviceGradeIsNull() {
            addCriterion("device_grade is null");
            return (Criteria) this;
        }

        public Criteria andDeviceGradeIsNotNull() {
            addCriterion("device_grade is not null");
            return (Criteria) this;
        }

        public Criteria andDeviceGradeEqualTo(String value) {
            addCriterion("device_grade =", value, "deviceGrade");
            return (Criteria) this;
        }

        public Criteria andDeviceGradeNotEqualTo(String value) {
            addCriterion("device_grade <>", value, "deviceGrade");
            return (Criteria) this;
        }

        public Criteria andDeviceGradeGreaterThan(String value) {
            addCriterion("device_grade >", value, "deviceGrade");
            return (Criteria) this;
        }

        public Criteria andDeviceGradeGreaterThanOrEqualTo(String value) {
            addCriterion("device_grade >=", value, "deviceGrade");
            return (Criteria) this;
        }

        public Criteria andDeviceGradeLessThan(String value) {
            addCriterion("device_grade <", value, "deviceGrade");
            return (Criteria) this;
        }

        public Criteria andDeviceGradeLessThanOrEqualTo(String value) {
            addCriterion("device_grade <=", value, "deviceGrade");
            return (Criteria) this;
        }

        public Criteria andDeviceGradeLike(String value) {
            addCriterion("device_grade like", value, "deviceGrade");
            return (Criteria) this;
        }

        public Criteria andDeviceGradeNotLike(String value) {
            addCriterion("device_grade not like", value, "deviceGrade");
            return (Criteria) this;
        }

        public Criteria andDeviceGradeIn(List<String> values) {
            addCriterion("device_grade in", values, "deviceGrade");
            return (Criteria) this;
        }

        public Criteria andDeviceGradeNotIn(List<String> values) {
            addCriterion("device_grade not in", values, "deviceGrade");
            return (Criteria) this;
        }

        public Criteria andDeviceGradeBetween(String value1, String value2) {
            addCriterion("device_grade between", value1, value2, "deviceGrade");
            return (Criteria) this;
        }

        public Criteria andDeviceGradeNotBetween(String value1, String value2) {
            addCriterion("device_grade not between", value1, value2, "deviceGrade");
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