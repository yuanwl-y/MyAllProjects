package com.ywl.dto;

import java.util.ArrayList;
import java.util.List;

public class GspwArchivesRecordExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public GspwArchivesRecordExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdCardIsNull() {
            addCriterion("id_card is null");
            return (Criteria) this;
        }

        public Criteria andIdCardIsNotNull() {
            addCriterion("id_card is not null");
            return (Criteria) this;
        }

        public Criteria andIdCardEqualTo(String value) {
            addCriterion("id_card =", value, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardNotEqualTo(String value) {
            addCriterion("id_card <>", value, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardGreaterThan(String value) {
            addCriterion("id_card >", value, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardGreaterThanOrEqualTo(String value) {
            addCriterion("id_card >=", value, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardLessThan(String value) {
            addCriterion("id_card <", value, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardLessThanOrEqualTo(String value) {
            addCriterion("id_card <=", value, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardLike(String value) {
            addCriterion("id_card like", value, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardNotLike(String value) {
            addCriterion("id_card not like", value, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardIn(List<String> values) {
            addCriterion("id_card in", values, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardNotIn(List<String> values) {
            addCriterion("id_card not in", values, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardBetween(String value1, String value2) {
            addCriterion("id_card between", value1, value2, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardNotBetween(String value1, String value2) {
            addCriterion("id_card not between", value1, value2, "idCard");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(String value) {
            addCriterion("update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(String value) {
            addCriterion("update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(String value) {
            addCriterion("update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(String value) {
            addCriterion("update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(String value) {
            addCriterion("update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(String value) {
            addCriterion("update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLike(String value) {
            addCriterion("update_time like", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotLike(String value) {
            addCriterion("update_time not like", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<String> values) {
            addCriterion("update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<String> values) {
            addCriterion("update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(String value1, String value2) {
            addCriterion("update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(String value1, String value2) {
            addCriterion("update_time not between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdatePersonIdIsNull() {
            addCriterion("update_person_id is null");
            return (Criteria) this;
        }

        public Criteria andUpdatePersonIdIsNotNull() {
            addCriterion("update_person_id is not null");
            return (Criteria) this;
        }

        public Criteria andUpdatePersonIdEqualTo(Integer value) {
            addCriterion("update_person_id =", value, "updatePersonId");
            return (Criteria) this;
        }

        public Criteria andUpdatePersonIdNotEqualTo(Integer value) {
            addCriterion("update_person_id <>", value, "updatePersonId");
            return (Criteria) this;
        }

        public Criteria andUpdatePersonIdGreaterThan(Integer value) {
            addCriterion("update_person_id >", value, "updatePersonId");
            return (Criteria) this;
        }

        public Criteria andUpdatePersonIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("update_person_id >=", value, "updatePersonId");
            return (Criteria) this;
        }

        public Criteria andUpdatePersonIdLessThan(Integer value) {
            addCriterion("update_person_id <", value, "updatePersonId");
            return (Criteria) this;
        }

        public Criteria andUpdatePersonIdLessThanOrEqualTo(Integer value) {
            addCriterion("update_person_id <=", value, "updatePersonId");
            return (Criteria) this;
        }

        public Criteria andUpdatePersonIdIn(List<Integer> values) {
            addCriterion("update_person_id in", values, "updatePersonId");
            return (Criteria) this;
        }

        public Criteria andUpdatePersonIdNotIn(List<Integer> values) {
            addCriterion("update_person_id not in", values, "updatePersonId");
            return (Criteria) this;
        }

        public Criteria andUpdatePersonIdBetween(Integer value1, Integer value2) {
            addCriterion("update_person_id between", value1, value2, "updatePersonId");
            return (Criteria) this;
        }

        public Criteria andUpdatePersonIdNotBetween(Integer value1, Integer value2) {
            addCriterion("update_person_id not between", value1, value2, "updatePersonId");
            return (Criteria) this;
        }

        public Criteria andUpdatePersonNameIsNull() {
            addCriterion("update_person_name is null");
            return (Criteria) this;
        }

        public Criteria andUpdatePersonNameIsNotNull() {
            addCriterion("update_person_name is not null");
            return (Criteria) this;
        }

        public Criteria andUpdatePersonNameEqualTo(String value) {
            addCriterion("update_person_name =", value, "updatePersonName");
            return (Criteria) this;
        }

        public Criteria andUpdatePersonNameNotEqualTo(String value) {
            addCriterion("update_person_name <>", value, "updatePersonName");
            return (Criteria) this;
        }

        public Criteria andUpdatePersonNameGreaterThan(String value) {
            addCriterion("update_person_name >", value, "updatePersonName");
            return (Criteria) this;
        }

        public Criteria andUpdatePersonNameGreaterThanOrEqualTo(String value) {
            addCriterion("update_person_name >=", value, "updatePersonName");
            return (Criteria) this;
        }

        public Criteria andUpdatePersonNameLessThan(String value) {
            addCriterion("update_person_name <", value, "updatePersonName");
            return (Criteria) this;
        }

        public Criteria andUpdatePersonNameLessThanOrEqualTo(String value) {
            addCriterion("update_person_name <=", value, "updatePersonName");
            return (Criteria) this;
        }

        public Criteria andUpdatePersonNameLike(String value) {
            addCriterion("update_person_name like", value, "updatePersonName");
            return (Criteria) this;
        }

        public Criteria andUpdatePersonNameNotLike(String value) {
            addCriterion("update_person_name not like", value, "updatePersonName");
            return (Criteria) this;
        }

        public Criteria andUpdatePersonNameIn(List<String> values) {
            addCriterion("update_person_name in", values, "updatePersonName");
            return (Criteria) this;
        }

        public Criteria andUpdatePersonNameNotIn(List<String> values) {
            addCriterion("update_person_name not in", values, "updatePersonName");
            return (Criteria) this;
        }

        public Criteria andUpdatePersonNameBetween(String value1, String value2) {
            addCriterion("update_person_name between", value1, value2, "updatePersonName");
            return (Criteria) this;
        }

        public Criteria andUpdatePersonNameNotBetween(String value1, String value2) {
            addCriterion("update_person_name not between", value1, value2, "updatePersonName");
            return (Criteria) this;
        }

        public Criteria andOldcompanyNameIsNull() {
            addCriterion("oldcompany_name is null");
            return (Criteria) this;
        }

        public Criteria andOldcompanyNameIsNotNull() {
            addCriterion("oldcompany_name is not null");
            return (Criteria) this;
        }

        public Criteria andOldcompanyNameEqualTo(String value) {
            addCriterion("oldcompany_name =", value, "oldcompanyName");
            return (Criteria) this;
        }

        public Criteria andOldcompanyNameNotEqualTo(String value) {
            addCriterion("oldcompany_name <>", value, "oldcompanyName");
            return (Criteria) this;
        }

        public Criteria andOldcompanyNameGreaterThan(String value) {
            addCriterion("oldcompany_name >", value, "oldcompanyName");
            return (Criteria) this;
        }

        public Criteria andOldcompanyNameGreaterThanOrEqualTo(String value) {
            addCriterion("oldcompany_name >=", value, "oldcompanyName");
            return (Criteria) this;
        }

        public Criteria andOldcompanyNameLessThan(String value) {
            addCriterion("oldcompany_name <", value, "oldcompanyName");
            return (Criteria) this;
        }

        public Criteria andOldcompanyNameLessThanOrEqualTo(String value) {
            addCriterion("oldcompany_name <=", value, "oldcompanyName");
            return (Criteria) this;
        }

        public Criteria andOldcompanyNameLike(String value) {
            addCriterion("oldcompany_name like", value, "oldcompanyName");
            return (Criteria) this;
        }

        public Criteria andOldcompanyNameNotLike(String value) {
            addCriterion("oldcompany_name not like", value, "oldcompanyName");
            return (Criteria) this;
        }

        public Criteria andOldcompanyNameIn(List<String> values) {
            addCriterion("oldcompany_name in", values, "oldcompanyName");
            return (Criteria) this;
        }

        public Criteria andOldcompanyNameNotIn(List<String> values) {
            addCriterion("oldcompany_name not in", values, "oldcompanyName");
            return (Criteria) this;
        }

        public Criteria andOldcompanyNameBetween(String value1, String value2) {
            addCriterion("oldcompany_name between", value1, value2, "oldcompanyName");
            return (Criteria) this;
        }

        public Criteria andOldcompanyNameNotBetween(String value1, String value2) {
            addCriterion("oldcompany_name not between", value1, value2, "oldcompanyName");
            return (Criteria) this;
        }

        public Criteria andOldcompanyCodeIsNull() {
            addCriterion("oldcompany_code is null");
            return (Criteria) this;
        }

        public Criteria andOldcompanyCodeIsNotNull() {
            addCriterion("oldcompany_code is not null");
            return (Criteria) this;
        }

        public Criteria andOldcompanyCodeEqualTo(String value) {
            addCriterion("oldcompany_code =", value, "oldcompanyCode");
            return (Criteria) this;
        }

        public Criteria andOldcompanyCodeNotEqualTo(String value) {
            addCriterion("oldcompany_code <>", value, "oldcompanyCode");
            return (Criteria) this;
        }

        public Criteria andOldcompanyCodeGreaterThan(String value) {
            addCriterion("oldcompany_code >", value, "oldcompanyCode");
            return (Criteria) this;
        }

        public Criteria andOldcompanyCodeGreaterThanOrEqualTo(String value) {
            addCriterion("oldcompany_code >=", value, "oldcompanyCode");
            return (Criteria) this;
        }

        public Criteria andOldcompanyCodeLessThan(String value) {
            addCriterion("oldcompany_code <", value, "oldcompanyCode");
            return (Criteria) this;
        }

        public Criteria andOldcompanyCodeLessThanOrEqualTo(String value) {
            addCriterion("oldcompany_code <=", value, "oldcompanyCode");
            return (Criteria) this;
        }

        public Criteria andOldcompanyCodeLike(String value) {
            addCriterion("oldcompany_code like", value, "oldcompanyCode");
            return (Criteria) this;
        }

        public Criteria andOldcompanyCodeNotLike(String value) {
            addCriterion("oldcompany_code not like", value, "oldcompanyCode");
            return (Criteria) this;
        }

        public Criteria andOldcompanyCodeIn(List<String> values) {
            addCriterion("oldcompany_code in", values, "oldcompanyCode");
            return (Criteria) this;
        }

        public Criteria andOldcompanyCodeNotIn(List<String> values) {
            addCriterion("oldcompany_code not in", values, "oldcompanyCode");
            return (Criteria) this;
        }

        public Criteria andOldcompanyCodeBetween(String value1, String value2) {
            addCriterion("oldcompany_code between", value1, value2, "oldcompanyCode");
            return (Criteria) this;
        }

        public Criteria andOldcompanyCodeNotBetween(String value1, String value2) {
            addCriterion("oldcompany_code not between", value1, value2, "oldcompanyCode");
            return (Criteria) this;
        }

        public Criteria andNowcompanyNameIsNull() {
            addCriterion("nowcompany_name is null");
            return (Criteria) this;
        }

        public Criteria andNowcompanyNameIsNotNull() {
            addCriterion("nowcompany_name is not null");
            return (Criteria) this;
        }

        public Criteria andNowcompanyNameEqualTo(String value) {
            addCriterion("nowcompany_name =", value, "nowcompanyName");
            return (Criteria) this;
        }

        public Criteria andNowcompanyNameNotEqualTo(String value) {
            addCriterion("nowcompany_name <>", value, "nowcompanyName");
            return (Criteria) this;
        }

        public Criteria andNowcompanyNameGreaterThan(String value) {
            addCriterion("nowcompany_name >", value, "nowcompanyName");
            return (Criteria) this;
        }

        public Criteria andNowcompanyNameGreaterThanOrEqualTo(String value) {
            addCriterion("nowcompany_name >=", value, "nowcompanyName");
            return (Criteria) this;
        }

        public Criteria andNowcompanyNameLessThan(String value) {
            addCriterion("nowcompany_name <", value, "nowcompanyName");
            return (Criteria) this;
        }

        public Criteria andNowcompanyNameLessThanOrEqualTo(String value) {
            addCriterion("nowcompany_name <=", value, "nowcompanyName");
            return (Criteria) this;
        }

        public Criteria andNowcompanyNameLike(String value) {
            addCriterion("nowcompany_name like", value, "nowcompanyName");
            return (Criteria) this;
        }

        public Criteria andNowcompanyNameNotLike(String value) {
            addCriterion("nowcompany_name not like", value, "nowcompanyName");
            return (Criteria) this;
        }

        public Criteria andNowcompanyNameIn(List<String> values) {
            addCriterion("nowcompany_name in", values, "nowcompanyName");
            return (Criteria) this;
        }

        public Criteria andNowcompanyNameNotIn(List<String> values) {
            addCriterion("nowcompany_name not in", values, "nowcompanyName");
            return (Criteria) this;
        }

        public Criteria andNowcompanyNameBetween(String value1, String value2) {
            addCriterion("nowcompany_name between", value1, value2, "nowcompanyName");
            return (Criteria) this;
        }

        public Criteria andNowcompanyNameNotBetween(String value1, String value2) {
            addCriterion("nowcompany_name not between", value1, value2, "nowcompanyName");
            return (Criteria) this;
        }

        public Criteria andNowcompanyCodeIsNull() {
            addCriterion("nowcompany_code is null");
            return (Criteria) this;
        }

        public Criteria andNowcompanyCodeIsNotNull() {
            addCriterion("nowcompany_code is not null");
            return (Criteria) this;
        }

        public Criteria andNowcompanyCodeEqualTo(String value) {
            addCriterion("nowcompany_code =", value, "nowcompanyCode");
            return (Criteria) this;
        }

        public Criteria andNowcompanyCodeNotEqualTo(String value) {
            addCriterion("nowcompany_code <>", value, "nowcompanyCode");
            return (Criteria) this;
        }

        public Criteria andNowcompanyCodeGreaterThan(String value) {
            addCriterion("nowcompany_code >", value, "nowcompanyCode");
            return (Criteria) this;
        }

        public Criteria andNowcompanyCodeGreaterThanOrEqualTo(String value) {
            addCriterion("nowcompany_code >=", value, "nowcompanyCode");
            return (Criteria) this;
        }

        public Criteria andNowcompanyCodeLessThan(String value) {
            addCriterion("nowcompany_code <", value, "nowcompanyCode");
            return (Criteria) this;
        }

        public Criteria andNowcompanyCodeLessThanOrEqualTo(String value) {
            addCriterion("nowcompany_code <=", value, "nowcompanyCode");
            return (Criteria) this;
        }

        public Criteria andNowcompanyCodeLike(String value) {
            addCriterion("nowcompany_code like", value, "nowcompanyCode");
            return (Criteria) this;
        }

        public Criteria andNowcompanyCodeNotLike(String value) {
            addCriterion("nowcompany_code not like", value, "nowcompanyCode");
            return (Criteria) this;
        }

        public Criteria andNowcompanyCodeIn(List<String> values) {
            addCriterion("nowcompany_code in", values, "nowcompanyCode");
            return (Criteria) this;
        }

        public Criteria andNowcompanyCodeNotIn(List<String> values) {
            addCriterion("nowcompany_code not in", values, "nowcompanyCode");
            return (Criteria) this;
        }

        public Criteria andNowcompanyCodeBetween(String value1, String value2) {
            addCriterion("nowcompany_code between", value1, value2, "nowcompanyCode");
            return (Criteria) this;
        }

        public Criteria andNowcompanyCodeNotBetween(String value1, String value2) {
            addCriterion("nowcompany_code not between", value1, value2, "nowcompanyCode");
            return (Criteria) this;
        }

        public Criteria andOldoutcompanyNameIsNull() {
            addCriterion("oldoutcompany_name is null");
            return (Criteria) this;
        }

        public Criteria andOldoutcompanyNameIsNotNull() {
            addCriterion("oldoutcompany_name is not null");
            return (Criteria) this;
        }

        public Criteria andOldoutcompanyNameEqualTo(String value) {
            addCriterion("oldoutcompany_name =", value, "oldoutcompanyName");
            return (Criteria) this;
        }

        public Criteria andOldoutcompanyNameNotEqualTo(String value) {
            addCriterion("oldoutcompany_name <>", value, "oldoutcompanyName");
            return (Criteria) this;
        }

        public Criteria andOldoutcompanyNameGreaterThan(String value) {
            addCriterion("oldoutcompany_name >", value, "oldoutcompanyName");
            return (Criteria) this;
        }

        public Criteria andOldoutcompanyNameGreaterThanOrEqualTo(String value) {
            addCriterion("oldoutcompany_name >=", value, "oldoutcompanyName");
            return (Criteria) this;
        }

        public Criteria andOldoutcompanyNameLessThan(String value) {
            addCriterion("oldoutcompany_name <", value, "oldoutcompanyName");
            return (Criteria) this;
        }

        public Criteria andOldoutcompanyNameLessThanOrEqualTo(String value) {
            addCriterion("oldoutcompany_name <=", value, "oldoutcompanyName");
            return (Criteria) this;
        }

        public Criteria andOldoutcompanyNameLike(String value) {
            addCriterion("oldoutcompany_name like", value, "oldoutcompanyName");
            return (Criteria) this;
        }

        public Criteria andOldoutcompanyNameNotLike(String value) {
            addCriterion("oldoutcompany_name not like", value, "oldoutcompanyName");
            return (Criteria) this;
        }

        public Criteria andOldoutcompanyNameIn(List<String> values) {
            addCriterion("oldoutcompany_name in", values, "oldoutcompanyName");
            return (Criteria) this;
        }

        public Criteria andOldoutcompanyNameNotIn(List<String> values) {
            addCriterion("oldoutcompany_name not in", values, "oldoutcompanyName");
            return (Criteria) this;
        }

        public Criteria andOldoutcompanyNameBetween(String value1, String value2) {
            addCriterion("oldoutcompany_name between", value1, value2, "oldoutcompanyName");
            return (Criteria) this;
        }

        public Criteria andOldoutcompanyNameNotBetween(String value1, String value2) {
            addCriterion("oldoutcompany_name not between", value1, value2, "oldoutcompanyName");
            return (Criteria) this;
        }

        public Criteria andOldoutcompanyCodeIsNull() {
            addCriterion("oldoutcompany_code is null");
            return (Criteria) this;
        }

        public Criteria andOldoutcompanyCodeIsNotNull() {
            addCriterion("oldoutcompany_code is not null");
            return (Criteria) this;
        }

        public Criteria andOldoutcompanyCodeEqualTo(String value) {
            addCriterion("oldoutcompany_code =", value, "oldoutcompanyCode");
            return (Criteria) this;
        }

        public Criteria andOldoutcompanyCodeNotEqualTo(String value) {
            addCriterion("oldoutcompany_code <>", value, "oldoutcompanyCode");
            return (Criteria) this;
        }

        public Criteria andOldoutcompanyCodeGreaterThan(String value) {
            addCriterion("oldoutcompany_code >", value, "oldoutcompanyCode");
            return (Criteria) this;
        }

        public Criteria andOldoutcompanyCodeGreaterThanOrEqualTo(String value) {
            addCriterion("oldoutcompany_code >=", value, "oldoutcompanyCode");
            return (Criteria) this;
        }

        public Criteria andOldoutcompanyCodeLessThan(String value) {
            addCriterion("oldoutcompany_code <", value, "oldoutcompanyCode");
            return (Criteria) this;
        }

        public Criteria andOldoutcompanyCodeLessThanOrEqualTo(String value) {
            addCriterion("oldoutcompany_code <=", value, "oldoutcompanyCode");
            return (Criteria) this;
        }

        public Criteria andOldoutcompanyCodeLike(String value) {
            addCriterion("oldoutcompany_code like", value, "oldoutcompanyCode");
            return (Criteria) this;
        }

        public Criteria andOldoutcompanyCodeNotLike(String value) {
            addCriterion("oldoutcompany_code not like", value, "oldoutcompanyCode");
            return (Criteria) this;
        }

        public Criteria andOldoutcompanyCodeIn(List<String> values) {
            addCriterion("oldoutcompany_code in", values, "oldoutcompanyCode");
            return (Criteria) this;
        }

        public Criteria andOldoutcompanyCodeNotIn(List<String> values) {
            addCriterion("oldoutcompany_code not in", values, "oldoutcompanyCode");
            return (Criteria) this;
        }

        public Criteria andOldoutcompanyCodeBetween(String value1, String value2) {
            addCriterion("oldoutcompany_code between", value1, value2, "oldoutcompanyCode");
            return (Criteria) this;
        }

        public Criteria andOldoutcompanyCodeNotBetween(String value1, String value2) {
            addCriterion("oldoutcompany_code not between", value1, value2, "oldoutcompanyCode");
            return (Criteria) this;
        }

        public Criteria andNowoutcompanyNameIsNull() {
            addCriterion("nowoutcompany_name is null");
            return (Criteria) this;
        }

        public Criteria andNowoutcompanyNameIsNotNull() {
            addCriterion("nowoutcompany_name is not null");
            return (Criteria) this;
        }

        public Criteria andNowoutcompanyNameEqualTo(String value) {
            addCriterion("nowoutcompany_name =", value, "nowoutcompanyName");
            return (Criteria) this;
        }

        public Criteria andNowoutcompanyNameNotEqualTo(String value) {
            addCriterion("nowoutcompany_name <>", value, "nowoutcompanyName");
            return (Criteria) this;
        }

        public Criteria andNowoutcompanyNameGreaterThan(String value) {
            addCriterion("nowoutcompany_name >", value, "nowoutcompanyName");
            return (Criteria) this;
        }

        public Criteria andNowoutcompanyNameGreaterThanOrEqualTo(String value) {
            addCriterion("nowoutcompany_name >=", value, "nowoutcompanyName");
            return (Criteria) this;
        }

        public Criteria andNowoutcompanyNameLessThan(String value) {
            addCriterion("nowoutcompany_name <", value, "nowoutcompanyName");
            return (Criteria) this;
        }

        public Criteria andNowoutcompanyNameLessThanOrEqualTo(String value) {
            addCriterion("nowoutcompany_name <=", value, "nowoutcompanyName");
            return (Criteria) this;
        }

        public Criteria andNowoutcompanyNameLike(String value) {
            addCriterion("nowoutcompany_name like", value, "nowoutcompanyName");
            return (Criteria) this;
        }

        public Criteria andNowoutcompanyNameNotLike(String value) {
            addCriterion("nowoutcompany_name not like", value, "nowoutcompanyName");
            return (Criteria) this;
        }

        public Criteria andNowoutcompanyNameIn(List<String> values) {
            addCriterion("nowoutcompany_name in", values, "nowoutcompanyName");
            return (Criteria) this;
        }

        public Criteria andNowoutcompanyNameNotIn(List<String> values) {
            addCriterion("nowoutcompany_name not in", values, "nowoutcompanyName");
            return (Criteria) this;
        }

        public Criteria andNowoutcompanyNameBetween(String value1, String value2) {
            addCriterion("nowoutcompany_name between", value1, value2, "nowoutcompanyName");
            return (Criteria) this;
        }

        public Criteria andNowoutcompanyNameNotBetween(String value1, String value2) {
            addCriterion("nowoutcompany_name not between", value1, value2, "nowoutcompanyName");
            return (Criteria) this;
        }

        public Criteria andNowoutcompanyCodeIsNull() {
            addCriterion("nowoutcompany_code is null");
            return (Criteria) this;
        }

        public Criteria andNowoutcompanyCodeIsNotNull() {
            addCriterion("nowoutcompany_code is not null");
            return (Criteria) this;
        }

        public Criteria andNowoutcompanyCodeEqualTo(String value) {
            addCriterion("nowoutcompany_code =", value, "nowoutcompanyCode");
            return (Criteria) this;
        }

        public Criteria andNowoutcompanyCodeNotEqualTo(String value) {
            addCriterion("nowoutcompany_code <>", value, "nowoutcompanyCode");
            return (Criteria) this;
        }

        public Criteria andNowoutcompanyCodeGreaterThan(String value) {
            addCriterion("nowoutcompany_code >", value, "nowoutcompanyCode");
            return (Criteria) this;
        }

        public Criteria andNowoutcompanyCodeGreaterThanOrEqualTo(String value) {
            addCriterion("nowoutcompany_code >=", value, "nowoutcompanyCode");
            return (Criteria) this;
        }

        public Criteria andNowoutcompanyCodeLessThan(String value) {
            addCriterion("nowoutcompany_code <", value, "nowoutcompanyCode");
            return (Criteria) this;
        }

        public Criteria andNowoutcompanyCodeLessThanOrEqualTo(String value) {
            addCriterion("nowoutcompany_code <=", value, "nowoutcompanyCode");
            return (Criteria) this;
        }

        public Criteria andNowoutcompanyCodeLike(String value) {
            addCriterion("nowoutcompany_code like", value, "nowoutcompanyCode");
            return (Criteria) this;
        }

        public Criteria andNowoutcompanyCodeNotLike(String value) {
            addCriterion("nowoutcompany_code not like", value, "nowoutcompanyCode");
            return (Criteria) this;
        }

        public Criteria andNowoutcompanyCodeIn(List<String> values) {
            addCriterion("nowoutcompany_code in", values, "nowoutcompanyCode");
            return (Criteria) this;
        }

        public Criteria andNowoutcompanyCodeNotIn(List<String> values) {
            addCriterion("nowoutcompany_code not in", values, "nowoutcompanyCode");
            return (Criteria) this;
        }

        public Criteria andNowoutcompanyCodeBetween(String value1, String value2) {
            addCriterion("nowoutcompany_code between", value1, value2, "nowoutcompanyCode");
            return (Criteria) this;
        }

        public Criteria andNowoutcompanyCodeNotBetween(String value1, String value2) {
            addCriterion("nowoutcompany_code not between", value1, value2, "nowoutcompanyCode");
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