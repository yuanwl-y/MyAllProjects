package ywl.dto;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class GspwConstructionplanExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public GspwConstructionplanExample() {
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

        public Criteria andSurveyinfoIdIsNull() {
            addCriterion("surveyInfo_id is null");
            return (Criteria) this;
        }

        public Criteria andSurveyinfoIdIsNotNull() {
            addCriterion("surveyInfo_id is not null");
            return (Criteria) this;
        }

        public Criteria andSurveyinfoIdEqualTo(Integer value) {
            addCriterion("surveyInfo_id =", value, "surveyinfoId");
            return (Criteria) this;
        }

        public Criteria andSurveyinfoIdNotEqualTo(Integer value) {
            addCriterion("surveyInfo_id <>", value, "surveyinfoId");
            return (Criteria) this;
        }

        public Criteria andSurveyinfoIdGreaterThan(Integer value) {
            addCriterion("surveyInfo_id >", value, "surveyinfoId");
            return (Criteria) this;
        }

        public Criteria andSurveyinfoIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("surveyInfo_id >=", value, "surveyinfoId");
            return (Criteria) this;
        }

        public Criteria andSurveyinfoIdLessThan(Integer value) {
            addCriterion("surveyInfo_id <", value, "surveyinfoId");
            return (Criteria) this;
        }

        public Criteria andSurveyinfoIdLessThanOrEqualTo(Integer value) {
            addCriterion("surveyInfo_id <=", value, "surveyinfoId");
            return (Criteria) this;
        }

        public Criteria andSurveyinfoIdIn(List<Integer> values) {
            addCriterion("surveyInfo_id in", values, "surveyinfoId");
            return (Criteria) this;
        }

        public Criteria andSurveyinfoIdNotIn(List<Integer> values) {
            addCriterion("surveyInfo_id not in", values, "surveyinfoId");
            return (Criteria) this;
        }

        public Criteria andSurveyinfoIdBetween(Integer value1, Integer value2) {
            addCriterion("surveyInfo_id between", value1, value2, "surveyinfoId");
            return (Criteria) this;
        }

        public Criteria andSurveyinfoIdNotBetween(Integer value1, Integer value2) {
            addCriterion("surveyInfo_id not between", value1, value2, "surveyinfoId");
            return (Criteria) this;
        }

        public Criteria andConstructionplanContentIsNull() {
            addCriterion("constructionPlan_content is null");
            return (Criteria) this;
        }

        public Criteria andConstructionplanContentIsNotNull() {
            addCriterion("constructionPlan_content is not null");
            return (Criteria) this;
        }

        public Criteria andConstructionplanContentEqualTo(String value) {
            addCriterion("constructionPlan_content =", value, "constructionplanContent");
            return (Criteria) this;
        }

        public Criteria andConstructionplanContentNotEqualTo(String value) {
            addCriterion("constructionPlan_content <>", value, "constructionplanContent");
            return (Criteria) this;
        }

        public Criteria andConstructionplanContentGreaterThan(String value) {
            addCriterion("constructionPlan_content >", value, "constructionplanContent");
            return (Criteria) this;
        }

        public Criteria andConstructionplanContentGreaterThanOrEqualTo(String value) {
            addCriterion("constructionPlan_content >=", value, "constructionplanContent");
            return (Criteria) this;
        }

        public Criteria andConstructionplanContentLessThan(String value) {
            addCriterion("constructionPlan_content <", value, "constructionplanContent");
            return (Criteria) this;
        }

        public Criteria andConstructionplanContentLessThanOrEqualTo(String value) {
            addCriterion("constructionPlan_content <=", value, "constructionplanContent");
            return (Criteria) this;
        }

        public Criteria andConstructionplanContentLike(String value) {
            addCriterion("constructionPlan_content like", value, "constructionplanContent");
            return (Criteria) this;
        }

        public Criteria andConstructionplanContentNotLike(String value) {
            addCriterion("constructionPlan_content not like", value, "constructionplanContent");
            return (Criteria) this;
        }

        public Criteria andConstructionplanContentIn(List<String> values) {
            addCriterion("constructionPlan_content in", values, "constructionplanContent");
            return (Criteria) this;
        }

        public Criteria andConstructionplanContentNotIn(List<String> values) {
            addCriterion("constructionPlan_content not in", values, "constructionplanContent");
            return (Criteria) this;
        }

        public Criteria andConstructionplanContentBetween(String value1, String value2) {
            addCriterion("constructionPlan_content between", value1, value2, "constructionplanContent");
            return (Criteria) this;
        }

        public Criteria andConstructionplanContentNotBetween(String value1, String value2) {
            addCriterion("constructionPlan_content not between", value1, value2, "constructionplanContent");
            return (Criteria) this;
        }

        public Criteria andConstructionplanStarttimeIsNull() {
            addCriterion("constructionPlan_startTime is null");
            return (Criteria) this;
        }

        public Criteria andConstructionplanStarttimeIsNotNull() {
            addCriterion("constructionPlan_startTime is not null");
            return (Criteria) this;
        }

        public Criteria andConstructionplanStarttimeEqualTo(Date value) {
            addCriterion("constructionPlan_startTime =", value, "constructionplanStarttime");
            return (Criteria) this;
        }

        public Criteria andConstructionplanStarttimeNotEqualTo(Date value) {
            addCriterion("constructionPlan_startTime <>", value, "constructionplanStarttime");
            return (Criteria) this;
        }

        public Criteria andConstructionplanStarttimeGreaterThan(Date value) {
            addCriterion("constructionPlan_startTime >", value, "constructionplanStarttime");
            return (Criteria) this;
        }

        public Criteria andConstructionplanStarttimeGreaterThanOrEqualTo(Date value) {
            addCriterion("constructionPlan_startTime >=", value, "constructionplanStarttime");
            return (Criteria) this;
        }

        public Criteria andConstructionplanStarttimeLessThan(Date value) {
            addCriterion("constructionPlan_startTime <", value, "constructionplanStarttime");
            return (Criteria) this;
        }

        public Criteria andConstructionplanStarttimeLessThanOrEqualTo(Date value) {
            addCriterion("constructionPlan_startTime <=", value, "constructionplanStarttime");
            return (Criteria) this;
        }

        public Criteria andConstructionplanStarttimeIn(List<Date> values) {
            addCriterion("constructionPlan_startTime in", values, "constructionplanStarttime");
            return (Criteria) this;
        }

        public Criteria andConstructionplanStarttimeNotIn(List<Date> values) {
            addCriterion("constructionPlan_startTime not in", values, "constructionplanStarttime");
            return (Criteria) this;
        }

        public Criteria andConstructionplanStarttimeBetween(Date value1, Date value2) {
            addCriterion("constructionPlan_startTime between", value1, value2, "constructionplanStarttime");
            return (Criteria) this;
        }

        public Criteria andConstructionplanStarttimeNotBetween(Date value1, Date value2) {
            addCriterion("constructionPlan_startTime not between", value1, value2, "constructionplanStarttime");
            return (Criteria) this;
        }

        public Criteria andConstructionplanEndtimeIsNull() {
            addCriterion("constructionPlan_endTime is null");
            return (Criteria) this;
        }

        public Criteria andConstructionplanEndtimeIsNotNull() {
            addCriterion("constructionPlan_endTime is not null");
            return (Criteria) this;
        }

        public Criteria andConstructionplanEndtimeEqualTo(Date value) {
            addCriterion("constructionPlan_endTime =", value, "constructionplanEndtime");
            return (Criteria) this;
        }

        public Criteria andConstructionplanEndtimeNotEqualTo(Date value) {
            addCriterion("constructionPlan_endTime <>", value, "constructionplanEndtime");
            return (Criteria) this;
        }

        public Criteria andConstructionplanEndtimeGreaterThan(Date value) {
            addCriterion("constructionPlan_endTime >", value, "constructionplanEndtime");
            return (Criteria) this;
        }

        public Criteria andConstructionplanEndtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("constructionPlan_endTime >=", value, "constructionplanEndtime");
            return (Criteria) this;
        }

        public Criteria andConstructionplanEndtimeLessThan(Date value) {
            addCriterion("constructionPlan_endTime <", value, "constructionplanEndtime");
            return (Criteria) this;
        }

        public Criteria andConstructionplanEndtimeLessThanOrEqualTo(Date value) {
            addCriterion("constructionPlan_endTime <=", value, "constructionplanEndtime");
            return (Criteria) this;
        }

        public Criteria andConstructionplanEndtimeIn(List<Date> values) {
            addCriterion("constructionPlan_endTime in", values, "constructionplanEndtime");
            return (Criteria) this;
        }

        public Criteria andConstructionplanEndtimeNotIn(List<Date> values) {
            addCriterion("constructionPlan_endTime not in", values, "constructionplanEndtime");
            return (Criteria) this;
        }

        public Criteria andConstructionplanEndtimeBetween(Date value1, Date value2) {
            addCriterion("constructionPlan_endTime between", value1, value2, "constructionplanEndtime");
            return (Criteria) this;
        }

        public Criteria andConstructionplanEndtimeNotBetween(Date value1, Date value2) {
            addCriterion("constructionPlan_endTime not between", value1, value2, "constructionplanEndtime");
            return (Criteria) this;
        }

        public Criteria andArchivesNameIsNull() {
            addCriterion("archives_name is null");
            return (Criteria) this;
        }

        public Criteria andArchivesNameIsNotNull() {
            addCriterion("archives_name is not null");
            return (Criteria) this;
        }

        public Criteria andArchivesNameEqualTo(String value) {
            addCriterion("archives_name =", value, "archivesName");
            return (Criteria) this;
        }

        public Criteria andArchivesNameNotEqualTo(String value) {
            addCriterion("archives_name <>", value, "archivesName");
            return (Criteria) this;
        }

        public Criteria andArchivesNameGreaterThan(String value) {
            addCriterion("archives_name >", value, "archivesName");
            return (Criteria) this;
        }

        public Criteria andArchivesNameGreaterThanOrEqualTo(String value) {
            addCriterion("archives_name >=", value, "archivesName");
            return (Criteria) this;
        }

        public Criteria andArchivesNameLessThan(String value) {
            addCriterion("archives_name <", value, "archivesName");
            return (Criteria) this;
        }

        public Criteria andArchivesNameLessThanOrEqualTo(String value) {
            addCriterion("archives_name <=", value, "archivesName");
            return (Criteria) this;
        }

        public Criteria andArchivesNameLike(String value) {
            addCriterion("archives_name like", value, "archivesName");
            return (Criteria) this;
        }

        public Criteria andArchivesNameNotLike(String value) {
            addCriterion("archives_name not like", value, "archivesName");
            return (Criteria) this;
        }

        public Criteria andArchivesNameIn(List<String> values) {
            addCriterion("archives_name in", values, "archivesName");
            return (Criteria) this;
        }

        public Criteria andArchivesNameNotIn(List<String> values) {
            addCriterion("archives_name not in", values, "archivesName");
            return (Criteria) this;
        }

        public Criteria andArchivesNameBetween(String value1, String value2) {
            addCriterion("archives_name between", value1, value2, "archivesName");
            return (Criteria) this;
        }

        public Criteria andArchivesNameNotBetween(String value1, String value2) {
            addCriterion("archives_name not between", value1, value2, "archivesName");
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

        public Criteria andConstructionplanAddrIsNull() {
            addCriterion("constructionPlan_addr is null");
            return (Criteria) this;
        }

        public Criteria andConstructionplanAddrIsNotNull() {
            addCriterion("constructionPlan_addr is not null");
            return (Criteria) this;
        }

        public Criteria andConstructionplanAddrEqualTo(String value) {
            addCriterion("constructionPlan_addr =", value, "constructionplanAddr");
            return (Criteria) this;
        }

        public Criteria andConstructionplanAddrNotEqualTo(String value) {
            addCriterion("constructionPlan_addr <>", value, "constructionplanAddr");
            return (Criteria) this;
        }

        public Criteria andConstructionplanAddrGreaterThan(String value) {
            addCriterion("constructionPlan_addr >", value, "constructionplanAddr");
            return (Criteria) this;
        }

        public Criteria andConstructionplanAddrGreaterThanOrEqualTo(String value) {
            addCriterion("constructionPlan_addr >=", value, "constructionplanAddr");
            return (Criteria) this;
        }

        public Criteria andConstructionplanAddrLessThan(String value) {
            addCriterion("constructionPlan_addr <", value, "constructionplanAddr");
            return (Criteria) this;
        }

        public Criteria andConstructionplanAddrLessThanOrEqualTo(String value) {
            addCriterion("constructionPlan_addr <=", value, "constructionplanAddr");
            return (Criteria) this;
        }

        public Criteria andConstructionplanAddrLike(String value) {
            addCriterion("constructionPlan_addr like", value, "constructionplanAddr");
            return (Criteria) this;
        }

        public Criteria andConstructionplanAddrNotLike(String value) {
            addCriterion("constructionPlan_addr not like", value, "constructionplanAddr");
            return (Criteria) this;
        }

        public Criteria andConstructionplanAddrIn(List<String> values) {
            addCriterion("constructionPlan_addr in", values, "constructionplanAddr");
            return (Criteria) this;
        }

        public Criteria andConstructionplanAddrNotIn(List<String> values) {
            addCriterion("constructionPlan_addr not in", values, "constructionplanAddr");
            return (Criteria) this;
        }

        public Criteria andConstructionplanAddrBetween(String value1, String value2) {
            addCriterion("constructionPlan_addr between", value1, value2, "constructionplanAddr");
            return (Criteria) this;
        }

        public Criteria andConstructionplanAddrNotBetween(String value1, String value2) {
            addCriterion("constructionPlan_addr not between", value1, value2, "constructionplanAddr");
            return (Criteria) this;
        }

        public Criteria andConstructionplanNumberIsNull() {
            addCriterion("constructionPlan_number is null");
            return (Criteria) this;
        }

        public Criteria andConstructionplanNumberIsNotNull() {
            addCriterion("constructionPlan_number is not null");
            return (Criteria) this;
        }

        public Criteria andConstructionplanNumberEqualTo(Integer value) {
            addCriterion("constructionPlan_number =", value, "constructionplanNumber");
            return (Criteria) this;
        }

        public Criteria andConstructionplanNumberNotEqualTo(Integer value) {
            addCriterion("constructionPlan_number <>", value, "constructionplanNumber");
            return (Criteria) this;
        }

        public Criteria andConstructionplanNumberGreaterThan(Integer value) {
            addCriterion("constructionPlan_number >", value, "constructionplanNumber");
            return (Criteria) this;
        }

        public Criteria andConstructionplanNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("constructionPlan_number >=", value, "constructionplanNumber");
            return (Criteria) this;
        }

        public Criteria andConstructionplanNumberLessThan(Integer value) {
            addCriterion("constructionPlan_number <", value, "constructionplanNumber");
            return (Criteria) this;
        }

        public Criteria andConstructionplanNumberLessThanOrEqualTo(Integer value) {
            addCriterion("constructionPlan_number <=", value, "constructionplanNumber");
            return (Criteria) this;
        }

        public Criteria andConstructionplanNumberIn(List<Integer> values) {
            addCriterion("constructionPlan_number in", values, "constructionplanNumber");
            return (Criteria) this;
        }

        public Criteria andConstructionplanNumberNotIn(List<Integer> values) {
            addCriterion("constructionPlan_number not in", values, "constructionplanNumber");
            return (Criteria) this;
        }

        public Criteria andConstructionplanNumberBetween(Integer value1, Integer value2) {
            addCriterion("constructionPlan_number between", value1, value2, "constructionplanNumber");
            return (Criteria) this;
        }

        public Criteria andConstructionplanNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("constructionPlan_number not between", value1, value2, "constructionplanNumber");
            return (Criteria) this;
        }

        public Criteria andTaskidIsNull() {
            addCriterion("taskid is null");
            return (Criteria) this;
        }

        public Criteria andTaskidIsNotNull() {
            addCriterion("taskid is not null");
            return (Criteria) this;
        }

        public Criteria andTaskidEqualTo(String value) {
            addCriterion("taskid =", value, "taskid");
            return (Criteria) this;
        }

        public Criteria andTaskidNotEqualTo(String value) {
            addCriterion("taskid <>", value, "taskid");
            return (Criteria) this;
        }

        public Criteria andTaskidGreaterThan(String value) {
            addCriterion("taskid >", value, "taskid");
            return (Criteria) this;
        }

        public Criteria andTaskidGreaterThanOrEqualTo(String value) {
            addCriterion("taskid >=", value, "taskid");
            return (Criteria) this;
        }

        public Criteria andTaskidLessThan(String value) {
            addCriterion("taskid <", value, "taskid");
            return (Criteria) this;
        }

        public Criteria andTaskidLessThanOrEqualTo(String value) {
            addCriterion("taskid <=", value, "taskid");
            return (Criteria) this;
        }

        public Criteria andTaskidLike(String value) {
            addCriterion("taskid like", value, "taskid");
            return (Criteria) this;
        }

        public Criteria andTaskidNotLike(String value) {
            addCriterion("taskid not like", value, "taskid");
            return (Criteria) this;
        }

        public Criteria andTaskidIn(List<String> values) {
            addCriterion("taskid in", values, "taskid");
            return (Criteria) this;
        }

        public Criteria andTaskidNotIn(List<String> values) {
            addCriterion("taskid not in", values, "taskid");
            return (Criteria) this;
        }

        public Criteria andTaskidBetween(String value1, String value2) {
            addCriterion("taskid between", value1, value2, "taskid");
            return (Criteria) this;
        }

        public Criteria andTaskidNotBetween(String value1, String value2) {
            addCriterion("taskid not between", value1, value2, "taskid");
            return (Criteria) this;
        }

        public Criteria andConstructionplanStateIsNull() {
            addCriterion("constructionPlan_state is null");
            return (Criteria) this;
        }

        public Criteria andConstructionplanStateIsNotNull() {
            addCriterion("constructionPlan_state is not null");
            return (Criteria) this;
        }

        public Criteria andConstructionplanStateEqualTo(String value) {
            addCriterion("constructionPlan_state =", value, "constructionplanState");
            return (Criteria) this;
        }

        public Criteria andConstructionplanStateNotEqualTo(String value) {
            addCriterion("constructionPlan_state <>", value, "constructionplanState");
            return (Criteria) this;
        }

        public Criteria andConstructionplanStateGreaterThan(String value) {
            addCriterion("constructionPlan_state >", value, "constructionplanState");
            return (Criteria) this;
        }

        public Criteria andConstructionplanStateGreaterThanOrEqualTo(String value) {
            addCriterion("constructionPlan_state >=", value, "constructionplanState");
            return (Criteria) this;
        }

        public Criteria andConstructionplanStateLessThan(String value) {
            addCriterion("constructionPlan_state <", value, "constructionplanState");
            return (Criteria) this;
        }

        public Criteria andConstructionplanStateLessThanOrEqualTo(String value) {
            addCriterion("constructionPlan_state <=", value, "constructionplanState");
            return (Criteria) this;
        }

        public Criteria andConstructionplanStateLike(String value) {
            addCriterion("constructionPlan_state like", value, "constructionplanState");
            return (Criteria) this;
        }

        public Criteria andConstructionplanStateNotLike(String value) {
            addCriterion("constructionPlan_state not like", value, "constructionplanState");
            return (Criteria) this;
        }

        public Criteria andConstructionplanStateIn(List<String> values) {
            addCriterion("constructionPlan_state in", values, "constructionplanState");
            return (Criteria) this;
        }

        public Criteria andConstructionplanStateNotIn(List<String> values) {
            addCriterion("constructionPlan_state not in", values, "constructionplanState");
            return (Criteria) this;
        }

        public Criteria andConstructionplanStateBetween(String value1, String value2) {
            addCriterion("constructionPlan_state between", value1, value2, "constructionplanState");
            return (Criteria) this;
        }

        public Criteria andConstructionplanStateNotBetween(String value1, String value2) {
            addCriterion("constructionPlan_state not between", value1, value2, "constructionplanState");
            return (Criteria) this;
        }

        public Criteria andConstructionplanKindIsNull() {
            addCriterion("constructionPlan_kind is null");
            return (Criteria) this;
        }

        public Criteria andConstructionplanKindIsNotNull() {
            addCriterion("constructionPlan_kind is not null");
            return (Criteria) this;
        }

        public Criteria andConstructionplanKindEqualTo(Integer value) {
            addCriterion("constructionPlan_kind =", value, "constructionplanKind");
            return (Criteria) this;
        }

        public Criteria andConstructionplanKindNotEqualTo(Integer value) {
            addCriterion("constructionPlan_kind <>", value, "constructionplanKind");
            return (Criteria) this;
        }

        public Criteria andConstructionplanKindGreaterThan(Integer value) {
            addCriterion("constructionPlan_kind >", value, "constructionplanKind");
            return (Criteria) this;
        }

        public Criteria andConstructionplanKindGreaterThanOrEqualTo(Integer value) {
            addCriterion("constructionPlan_kind >=", value, "constructionplanKind");
            return (Criteria) this;
        }

        public Criteria andConstructionplanKindLessThan(Integer value) {
            addCriterion("constructionPlan_kind <", value, "constructionplanKind");
            return (Criteria) this;
        }

        public Criteria andConstructionplanKindLessThanOrEqualTo(Integer value) {
            addCriterion("constructionPlan_kind <=", value, "constructionplanKind");
            return (Criteria) this;
        }

        public Criteria andConstructionplanKindIn(List<Integer> values) {
            addCriterion("constructionPlan_kind in", values, "constructionplanKind");
            return (Criteria) this;
        }

        public Criteria andConstructionplanKindNotIn(List<Integer> values) {
            addCriterion("constructionPlan_kind not in", values, "constructionplanKind");
            return (Criteria) this;
        }

        public Criteria andConstructionplanKindBetween(Integer value1, Integer value2) {
            addCriterion("constructionPlan_kind between", value1, value2, "constructionplanKind");
            return (Criteria) this;
        }

        public Criteria andConstructionplanKindNotBetween(Integer value1, Integer value2) {
            addCriterion("constructionPlan_kind not between", value1, value2, "constructionplanKind");
            return (Criteria) this;
        }

        public Criteria andFlowauditStartdateIsNull() {
            addCriterion("flowaudit_startDate is null");
            return (Criteria) this;
        }

        public Criteria andFlowauditStartdateIsNotNull() {
            addCriterion("flowaudit_startDate is not null");
            return (Criteria) this;
        }

        public Criteria andFlowauditStartdateEqualTo(Date value) {
            addCriterion("flowaudit_startDate =", value, "flowauditStartdate");
            return (Criteria) this;
        }

        public Criteria andFlowauditStartdateNotEqualTo(Date value) {
            addCriterion("flowaudit_startDate <>", value, "flowauditStartdate");
            return (Criteria) this;
        }

        public Criteria andFlowauditStartdateGreaterThan(Date value) {
            addCriterion("flowaudit_startDate >", value, "flowauditStartdate");
            return (Criteria) this;
        }

        public Criteria andFlowauditStartdateGreaterThanOrEqualTo(Date value) {
            addCriterion("flowaudit_startDate >=", value, "flowauditStartdate");
            return (Criteria) this;
        }

        public Criteria andFlowauditStartdateLessThan(Date value) {
            addCriterion("flowaudit_startDate <", value, "flowauditStartdate");
            return (Criteria) this;
        }

        public Criteria andFlowauditStartdateLessThanOrEqualTo(Date value) {
            addCriterion("flowaudit_startDate <=", value, "flowauditStartdate");
            return (Criteria) this;
        }

        public Criteria andFlowauditStartdateIn(List<Date> values) {
            addCriterion("flowaudit_startDate in", values, "flowauditStartdate");
            return (Criteria) this;
        }

        public Criteria andFlowauditStartdateNotIn(List<Date> values) {
            addCriterion("flowaudit_startDate not in", values, "flowauditStartdate");
            return (Criteria) this;
        }

        public Criteria andFlowauditStartdateBetween(Date value1, Date value2) {
            addCriterion("flowaudit_startDate between", value1, value2, "flowauditStartdate");
            return (Criteria) this;
        }

        public Criteria andFlowauditStartdateNotBetween(Date value1, Date value2) {
            addCriterion("flowaudit_startDate not between", value1, value2, "flowauditStartdate");
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

        public Criteria andSuperVisorIsNull() {
            addCriterion("super_visor is null");
            return (Criteria) this;
        }

        public Criteria andSuperVisorIsNotNull() {
            addCriterion("super_visor is not null");
            return (Criteria) this;
        }

        public Criteria andSuperVisorEqualTo(Integer value) {
            addCriterion("super_visor =", value, "superVisor");
            return (Criteria) this;
        }

        public Criteria andSuperVisorNotEqualTo(Integer value) {
            addCriterion("super_visor <>", value, "superVisor");
            return (Criteria) this;
        }

        public Criteria andSuperVisorGreaterThan(Integer value) {
            addCriterion("super_visor >", value, "superVisor");
            return (Criteria) this;
        }

        public Criteria andSuperVisorGreaterThanOrEqualTo(Integer value) {
            addCriterion("super_visor >=", value, "superVisor");
            return (Criteria) this;
        }

        public Criteria andSuperVisorLessThan(Integer value) {
            addCriterion("super_visor <", value, "superVisor");
            return (Criteria) this;
        }

        public Criteria andSuperVisorLessThanOrEqualTo(Integer value) {
            addCriterion("super_visor <=", value, "superVisor");
            return (Criteria) this;
        }

        public Criteria andSuperVisorIn(List<Integer> values) {
            addCriterion("super_visor in", values, "superVisor");
            return (Criteria) this;
        }

        public Criteria andSuperVisorNotIn(List<Integer> values) {
            addCriterion("super_visor not in", values, "superVisor");
            return (Criteria) this;
        }

        public Criteria andSuperVisorBetween(Integer value1, Integer value2) {
            addCriterion("super_visor between", value1, value2, "superVisor");
            return (Criteria) this;
        }

        public Criteria andSuperVisorNotBetween(Integer value1, Integer value2) {
            addCriterion("super_visor not between", value1, value2, "superVisor");
            return (Criteria) this;
        }

        public Criteria andSupervisorNameIsNull() {
            addCriterion("supervisor_name is null");
            return (Criteria) this;
        }

        public Criteria andSupervisorNameIsNotNull() {
            addCriterion("supervisor_name is not null");
            return (Criteria) this;
        }

        public Criteria andSupervisorNameEqualTo(String value) {
            addCriterion("supervisor_name =", value, "supervisorName");
            return (Criteria) this;
        }

        public Criteria andSupervisorNameNotEqualTo(String value) {
            addCriterion("supervisor_name <>", value, "supervisorName");
            return (Criteria) this;
        }

        public Criteria andSupervisorNameGreaterThan(String value) {
            addCriterion("supervisor_name >", value, "supervisorName");
            return (Criteria) this;
        }

        public Criteria andSupervisorNameGreaterThanOrEqualTo(String value) {
            addCriterion("supervisor_name >=", value, "supervisorName");
            return (Criteria) this;
        }

        public Criteria andSupervisorNameLessThan(String value) {
            addCriterion("supervisor_name <", value, "supervisorName");
            return (Criteria) this;
        }

        public Criteria andSupervisorNameLessThanOrEqualTo(String value) {
            addCriterion("supervisor_name <=", value, "supervisorName");
            return (Criteria) this;
        }

        public Criteria andSupervisorNameLike(String value) {
            addCriterion("supervisor_name like", value, "supervisorName");
            return (Criteria) this;
        }

        public Criteria andSupervisorNameNotLike(String value) {
            addCriterion("supervisor_name not like", value, "supervisorName");
            return (Criteria) this;
        }

        public Criteria andSupervisorNameIn(List<String> values) {
            addCriterion("supervisor_name in", values, "supervisorName");
            return (Criteria) this;
        }

        public Criteria andSupervisorNameNotIn(List<String> values) {
            addCriterion("supervisor_name not in", values, "supervisorName");
            return (Criteria) this;
        }

        public Criteria andSupervisorNameBetween(String value1, String value2) {
            addCriterion("supervisor_name between", value1, value2, "supervisorName");
            return (Criteria) this;
        }

        public Criteria andSupervisorNameNotBetween(String value1, String value2) {
            addCriterion("supervisor_name not between", value1, value2, "supervisorName");
            return (Criteria) this;
        }

        public Criteria andPeopleIdsIsNull() {
            addCriterion("people_ids is null");
            return (Criteria) this;
        }

        public Criteria andPeopleIdsIsNotNull() {
            addCriterion("people_ids is not null");
            return (Criteria) this;
        }

        public Criteria andPeopleIdsEqualTo(String value) {
            addCriterion("people_ids =", value, "peopleIds");
            return (Criteria) this;
        }

        public Criteria andPeopleIdsNotEqualTo(String value) {
            addCriterion("people_ids <>", value, "peopleIds");
            return (Criteria) this;
        }

        public Criteria andPeopleIdsGreaterThan(String value) {
            addCriterion("people_ids >", value, "peopleIds");
            return (Criteria) this;
        }

        public Criteria andPeopleIdsGreaterThanOrEqualTo(String value) {
            addCriterion("people_ids >=", value, "peopleIds");
            return (Criteria) this;
        }

        public Criteria andPeopleIdsLessThan(String value) {
            addCriterion("people_ids <", value, "peopleIds");
            return (Criteria) this;
        }

        public Criteria andPeopleIdsLessThanOrEqualTo(String value) {
            addCriterion("people_ids <=", value, "peopleIds");
            return (Criteria) this;
        }

        public Criteria andPeopleIdsLike(String value) {
            addCriterion("people_ids like", value, "peopleIds");
            return (Criteria) this;
        }

        public Criteria andPeopleIdsNotLike(String value) {
            addCriterion("people_ids not like", value, "peopleIds");
            return (Criteria) this;
        }

        public Criteria andPeopleIdsIn(List<String> values) {
            addCriterion("people_ids in", values, "peopleIds");
            return (Criteria) this;
        }

        public Criteria andPeopleIdsNotIn(List<String> values) {
            addCriterion("people_ids not in", values, "peopleIds");
            return (Criteria) this;
        }

        public Criteria andPeopleIdsBetween(String value1, String value2) {
            addCriterion("people_ids between", value1, value2, "peopleIds");
            return (Criteria) this;
        }

        public Criteria andPeopleIdsNotBetween(String value1, String value2) {
            addCriterion("people_ids not between", value1, value2, "peopleIds");
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

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("update_time not between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateStateIsNull() {
            addCriterion("update_state is null");
            return (Criteria) this;
        }

        public Criteria andUpdateStateIsNotNull() {
            addCriterion("update_state is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateStateEqualTo(Integer value) {
            addCriterion("update_state =", value, "updateState");
            return (Criteria) this;
        }

        public Criteria andUpdateStateNotEqualTo(Integer value) {
            addCriterion("update_state <>", value, "updateState");
            return (Criteria) this;
        }

        public Criteria andUpdateStateGreaterThan(Integer value) {
            addCriterion("update_state >", value, "updateState");
            return (Criteria) this;
        }

        public Criteria andUpdateStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("update_state >=", value, "updateState");
            return (Criteria) this;
        }

        public Criteria andUpdateStateLessThan(Integer value) {
            addCriterion("update_state <", value, "updateState");
            return (Criteria) this;
        }

        public Criteria andUpdateStateLessThanOrEqualTo(Integer value) {
            addCriterion("update_state <=", value, "updateState");
            return (Criteria) this;
        }

        public Criteria andUpdateStateIn(List<Integer> values) {
            addCriterion("update_state in", values, "updateState");
            return (Criteria) this;
        }

        public Criteria andUpdateStateNotIn(List<Integer> values) {
            addCriterion("update_state not in", values, "updateState");
            return (Criteria) this;
        }

        public Criteria andUpdateStateBetween(Integer value1, Integer value2) {
            addCriterion("update_state between", value1, value2, "updateState");
            return (Criteria) this;
        }

        public Criteria andUpdateStateNotBetween(Integer value1, Integer value2) {
            addCriterion("update_state not between", value1, value2, "updateState");
            return (Criteria) this;
        }

        public Criteria andSafetyofficerNameIsNull() {
            addCriterion("safetyOfficer_name is null");
            return (Criteria) this;
        }

        public Criteria andSafetyofficerNameIsNotNull() {
            addCriterion("safetyOfficer_name is not null");
            return (Criteria) this;
        }

        public Criteria andSafetyofficerNameEqualTo(String value) {
            addCriterion("safetyOfficer_name =", value, "safetyofficerName");
            return (Criteria) this;
        }

        public Criteria andSafetyofficerNameNotEqualTo(String value) {
            addCriterion("safetyOfficer_name <>", value, "safetyofficerName");
            return (Criteria) this;
        }

        public Criteria andSafetyofficerNameGreaterThan(String value) {
            addCriterion("safetyOfficer_name >", value, "safetyofficerName");
            return (Criteria) this;
        }

        public Criteria andSafetyofficerNameGreaterThanOrEqualTo(String value) {
            addCriterion("safetyOfficer_name >=", value, "safetyofficerName");
            return (Criteria) this;
        }

        public Criteria andSafetyofficerNameLessThan(String value) {
            addCriterion("safetyOfficer_name <", value, "safetyofficerName");
            return (Criteria) this;
        }

        public Criteria andSafetyofficerNameLessThanOrEqualTo(String value) {
            addCriterion("safetyOfficer_name <=", value, "safetyofficerName");
            return (Criteria) this;
        }

        public Criteria andSafetyofficerNameLike(String value) {
            addCriterion("safetyOfficer_name like", value, "safetyofficerName");
            return (Criteria) this;
        }

        public Criteria andSafetyofficerNameNotLike(String value) {
            addCriterion("safetyOfficer_name not like", value, "safetyofficerName");
            return (Criteria) this;
        }

        public Criteria andSafetyofficerNameIn(List<String> values) {
            addCriterion("safetyOfficer_name in", values, "safetyofficerName");
            return (Criteria) this;
        }

        public Criteria andSafetyofficerNameNotIn(List<String> values) {
            addCriterion("safetyOfficer_name not in", values, "safetyofficerName");
            return (Criteria) this;
        }

        public Criteria andSafetyofficerNameBetween(String value1, String value2) {
            addCriterion("safetyOfficer_name between", value1, value2, "safetyofficerName");
            return (Criteria) this;
        }

        public Criteria andSafetyofficerNameNotBetween(String value1, String value2) {
            addCriterion("safetyOfficer_name not between", value1, value2, "safetyofficerName");
            return (Criteria) this;
        }

        public Criteria andTechnicianNameIsNull() {
            addCriterion("technician_name is null");
            return (Criteria) this;
        }

        public Criteria andTechnicianNameIsNotNull() {
            addCriterion("technician_name is not null");
            return (Criteria) this;
        }

        public Criteria andTechnicianNameEqualTo(String value) {
            addCriterion("technician_name =", value, "technicianName");
            return (Criteria) this;
        }

        public Criteria andTechnicianNameNotEqualTo(String value) {
            addCriterion("technician_name <>", value, "technicianName");
            return (Criteria) this;
        }

        public Criteria andTechnicianNameGreaterThan(String value) {
            addCriterion("technician_name >", value, "technicianName");
            return (Criteria) this;
        }

        public Criteria andTechnicianNameGreaterThanOrEqualTo(String value) {
            addCriterion("technician_name >=", value, "technicianName");
            return (Criteria) this;
        }

        public Criteria andTechnicianNameLessThan(String value) {
            addCriterion("technician_name <", value, "technicianName");
            return (Criteria) this;
        }

        public Criteria andTechnicianNameLessThanOrEqualTo(String value) {
            addCriterion("technician_name <=", value, "technicianName");
            return (Criteria) this;
        }

        public Criteria andTechnicianNameLike(String value) {
            addCriterion("technician_name like", value, "technicianName");
            return (Criteria) this;
        }

        public Criteria andTechnicianNameNotLike(String value) {
            addCriterion("technician_name not like", value, "technicianName");
            return (Criteria) this;
        }

        public Criteria andTechnicianNameIn(List<String> values) {
            addCriterion("technician_name in", values, "technicianName");
            return (Criteria) this;
        }

        public Criteria andTechnicianNameNotIn(List<String> values) {
            addCriterion("technician_name not in", values, "technicianName");
            return (Criteria) this;
        }

        public Criteria andTechnicianNameBetween(String value1, String value2) {
            addCriterion("technician_name between", value1, value2, "technicianName");
            return (Criteria) this;
        }

        public Criteria andTechnicianNameNotBetween(String value1, String value2) {
            addCriterion("technician_name not between", value1, value2, "technicianName");
            return (Criteria) this;
        }

        public Criteria andSafetyOfficerIsNull() {
            addCriterion("safety_officer is null");
            return (Criteria) this;
        }

        public Criteria andSafetyOfficerIsNotNull() {
            addCriterion("safety_officer is not null");
            return (Criteria) this;
        }

        public Criteria andSafetyOfficerEqualTo(Integer value) {
            addCriterion("safety_officer =", value, "safetyOfficer");
            return (Criteria) this;
        }

        public Criteria andSafetyOfficerNotEqualTo(Integer value) {
            addCriterion("safety_officer <>", value, "safetyOfficer");
            return (Criteria) this;
        }

        public Criteria andSafetyOfficerGreaterThan(Integer value) {
            addCriterion("safety_officer >", value, "safetyOfficer");
            return (Criteria) this;
        }

        public Criteria andSafetyOfficerGreaterThanOrEqualTo(Integer value) {
            addCriterion("safety_officer >=", value, "safetyOfficer");
            return (Criteria) this;
        }

        public Criteria andSafetyOfficerLessThan(Integer value) {
            addCriterion("safety_officer <", value, "safetyOfficer");
            return (Criteria) this;
        }

        public Criteria andSafetyOfficerLessThanOrEqualTo(Integer value) {
            addCriterion("safety_officer <=", value, "safetyOfficer");
            return (Criteria) this;
        }

        public Criteria andSafetyOfficerIn(List<Integer> values) {
            addCriterion("safety_officer in", values, "safetyOfficer");
            return (Criteria) this;
        }

        public Criteria andSafetyOfficerNotIn(List<Integer> values) {
            addCriterion("safety_officer not in", values, "safetyOfficer");
            return (Criteria) this;
        }

        public Criteria andSafetyOfficerBetween(Integer value1, Integer value2) {
            addCriterion("safety_officer between", value1, value2, "safetyOfficer");
            return (Criteria) this;
        }

        public Criteria andSafetyOfficerNotBetween(Integer value1, Integer value2) {
            addCriterion("safety_officer not between", value1, value2, "safetyOfficer");
            return (Criteria) this;
        }

        public Criteria andCreateDateIsNull() {
            addCriterion("create_date is null");
            return (Criteria) this;
        }

        public Criteria andCreateDateIsNotNull() {
            addCriterion("create_date is not null");
            return (Criteria) this;
        }

        public Criteria andCreateDateEqualTo(Date value) {
            addCriterion("create_date =", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotEqualTo(Date value) {
            addCriterion("create_date <>", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThan(Date value) {
            addCriterion("create_date >", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThanOrEqualTo(Date value) {
            addCriterion("create_date >=", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThan(Date value) {
            addCriterion("create_date <", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThanOrEqualTo(Date value) {
            addCriterion("create_date <=", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateIn(List<Date> values) {
            addCriterion("create_date in", values, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotIn(List<Date> values) {
            addCriterion("create_date not in", values, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateBetween(Date value1, Date value2) {
            addCriterion("create_date between", value1, value2, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotBetween(Date value1, Date value2) {
            addCriterion("create_date not between", value1, value2, "createDate");
            return (Criteria) this;
        }

        public Criteria andTechnicianIsNull() {
            addCriterion("technician is null");
            return (Criteria) this;
        }

        public Criteria andTechnicianIsNotNull() {
            addCriterion("technician is not null");
            return (Criteria) this;
        }

        public Criteria andTechnicianEqualTo(Integer value) {
            addCriterion("technician =", value, "technician");
            return (Criteria) this;
        }

        public Criteria andTechnicianNotEqualTo(Integer value) {
            addCriterion("technician <>", value, "technician");
            return (Criteria) this;
        }

        public Criteria andTechnicianGreaterThan(Integer value) {
            addCriterion("technician >", value, "technician");
            return (Criteria) this;
        }

        public Criteria andTechnicianGreaterThanOrEqualTo(Integer value) {
            addCriterion("technician >=", value, "technician");
            return (Criteria) this;
        }

        public Criteria andTechnicianLessThan(Integer value) {
            addCriterion("technician <", value, "technician");
            return (Criteria) this;
        }

        public Criteria andTechnicianLessThanOrEqualTo(Integer value) {
            addCriterion("technician <=", value, "technician");
            return (Criteria) this;
        }

        public Criteria andTechnicianIn(List<Integer> values) {
            addCriterion("technician in", values, "technician");
            return (Criteria) this;
        }

        public Criteria andTechnicianNotIn(List<Integer> values) {
            addCriterion("technician not in", values, "technician");
            return (Criteria) this;
        }

        public Criteria andTechnicianBetween(Integer value1, Integer value2) {
            addCriterion("technician between", value1, value2, "technician");
            return (Criteria) this;
        }

        public Criteria andTechnicianNotBetween(Integer value1, Integer value2) {
            addCriterion("technician not between", value1, value2, "technician");
            return (Criteria) this;
        }

        public Criteria andSupervisorOrgcodeIsNull() {
            addCriterion("supervisor_orgcode is null");
            return (Criteria) this;
        }

        public Criteria andSupervisorOrgcodeIsNotNull() {
            addCriterion("supervisor_orgcode is not null");
            return (Criteria) this;
        }

        public Criteria andSupervisorOrgcodeEqualTo(String value) {
            addCriterion("supervisor_orgcode =", value, "supervisorOrgcode");
            return (Criteria) this;
        }

        public Criteria andSupervisorOrgcodeNotEqualTo(String value) {
            addCriterion("supervisor_orgcode <>", value, "supervisorOrgcode");
            return (Criteria) this;
        }

        public Criteria andSupervisorOrgcodeGreaterThan(String value) {
            addCriterion("supervisor_orgcode >", value, "supervisorOrgcode");
            return (Criteria) this;
        }

        public Criteria andSupervisorOrgcodeGreaterThanOrEqualTo(String value) {
            addCriterion("supervisor_orgcode >=", value, "supervisorOrgcode");
            return (Criteria) this;
        }

        public Criteria andSupervisorOrgcodeLessThan(String value) {
            addCriterion("supervisor_orgcode <", value, "supervisorOrgcode");
            return (Criteria) this;
        }

        public Criteria andSupervisorOrgcodeLessThanOrEqualTo(String value) {
            addCriterion("supervisor_orgcode <=", value, "supervisorOrgcode");
            return (Criteria) this;
        }

        public Criteria andSupervisorOrgcodeLike(String value) {
            addCriterion("supervisor_orgcode like", value, "supervisorOrgcode");
            return (Criteria) this;
        }

        public Criteria andSupervisorOrgcodeNotLike(String value) {
            addCriterion("supervisor_orgcode not like", value, "supervisorOrgcode");
            return (Criteria) this;
        }

        public Criteria andSupervisorOrgcodeIn(List<String> values) {
            addCriterion("supervisor_orgcode in", values, "supervisorOrgcode");
            return (Criteria) this;
        }

        public Criteria andSupervisorOrgcodeNotIn(List<String> values) {
            addCriterion("supervisor_orgcode not in", values, "supervisorOrgcode");
            return (Criteria) this;
        }

        public Criteria andSupervisorOrgcodeBetween(String value1, String value2) {
            addCriterion("supervisor_orgcode between", value1, value2, "supervisorOrgcode");
            return (Criteria) this;
        }

        public Criteria andSupervisorOrgcodeNotBetween(String value1, String value2) {
            addCriterion("supervisor_orgcode not between", value1, value2, "supervisorOrgcode");
            return (Criteria) this;
        }

        public Criteria andSupervisorOrgnameIsNull() {
            addCriterion("supervisor_orgname is null");
            return (Criteria) this;
        }

        public Criteria andSupervisorOrgnameIsNotNull() {
            addCriterion("supervisor_orgname is not null");
            return (Criteria) this;
        }

        public Criteria andSupervisorOrgnameEqualTo(String value) {
            addCriterion("supervisor_orgname =", value, "supervisorOrgname");
            return (Criteria) this;
        }

        public Criteria andSupervisorOrgnameNotEqualTo(String value) {
            addCriterion("supervisor_orgname <>", value, "supervisorOrgname");
            return (Criteria) this;
        }

        public Criteria andSupervisorOrgnameGreaterThan(String value) {
            addCriterion("supervisor_orgname >", value, "supervisorOrgname");
            return (Criteria) this;
        }

        public Criteria andSupervisorOrgnameGreaterThanOrEqualTo(String value) {
            addCriterion("supervisor_orgname >=", value, "supervisorOrgname");
            return (Criteria) this;
        }

        public Criteria andSupervisorOrgnameLessThan(String value) {
            addCriterion("supervisor_orgname <", value, "supervisorOrgname");
            return (Criteria) this;
        }

        public Criteria andSupervisorOrgnameLessThanOrEqualTo(String value) {
            addCriterion("supervisor_orgname <=", value, "supervisorOrgname");
            return (Criteria) this;
        }

        public Criteria andSupervisorOrgnameLike(String value) {
            addCriterion("supervisor_orgname like", value, "supervisorOrgname");
            return (Criteria) this;
        }

        public Criteria andSupervisorOrgnameNotLike(String value) {
            addCriterion("supervisor_orgname not like", value, "supervisorOrgname");
            return (Criteria) this;
        }

        public Criteria andSupervisorOrgnameIn(List<String> values) {
            addCriterion("supervisor_orgname in", values, "supervisorOrgname");
            return (Criteria) this;
        }

        public Criteria andSupervisorOrgnameNotIn(List<String> values) {
            addCriterion("supervisor_orgname not in", values, "supervisorOrgname");
            return (Criteria) this;
        }

        public Criteria andSupervisorOrgnameBetween(String value1, String value2) {
            addCriterion("supervisor_orgname between", value1, value2, "supervisorOrgname");
            return (Criteria) this;
        }

        public Criteria andSupervisorOrgnameNotBetween(String value1, String value2) {
            addCriterion("supervisor_orgname not between", value1, value2, "supervisorOrgname");
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