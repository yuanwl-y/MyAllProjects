package ywl.dto;

import java.util.ArrayList;
import java.util.List;

public class GspwLoadScoreExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public GspwLoadScoreExample() {
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

        public Criteria andScoreIdIsNull() {
            addCriterion("score_id is null");
            return (Criteria) this;
        }

        public Criteria andScoreIdIsNotNull() {
            addCriterion("score_id is not null");
            return (Criteria) this;
        }

        public Criteria andScoreIdEqualTo(Integer value) {
            addCriterion("score_id =", value, "scoreId");
            return (Criteria) this;
        }

        public Criteria andScoreIdNotEqualTo(Integer value) {
            addCriterion("score_id <>", value, "scoreId");
            return (Criteria) this;
        }

        public Criteria andScoreIdGreaterThan(Integer value) {
            addCriterion("score_id >", value, "scoreId");
            return (Criteria) this;
        }

        public Criteria andScoreIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("score_id >=", value, "scoreId");
            return (Criteria) this;
        }

        public Criteria andScoreIdLessThan(Integer value) {
            addCriterion("score_id <", value, "scoreId");
            return (Criteria) this;
        }

        public Criteria andScoreIdLessThanOrEqualTo(Integer value) {
            addCriterion("score_id <=", value, "scoreId");
            return (Criteria) this;
        }

        public Criteria andScoreIdIn(List<Integer> values) {
            addCriterion("score_id in", values, "scoreId");
            return (Criteria) this;
        }

        public Criteria andScoreIdNotIn(List<Integer> values) {
            addCriterion("score_id not in", values, "scoreId");
            return (Criteria) this;
        }

        public Criteria andScoreIdBetween(Integer value1, Integer value2) {
            addCriterion("score_id between", value1, value2, "scoreId");
            return (Criteria) this;
        }

        public Criteria andScoreIdNotBetween(Integer value1, Integer value2) {
            addCriterion("score_id not between", value1, value2, "scoreId");
            return (Criteria) this;
        }

        public Criteria andScoreProjectNameIsNull() {
            addCriterion("score_project_name is null");
            return (Criteria) this;
        }

        public Criteria andScoreProjectNameIsNotNull() {
            addCriterion("score_project_name is not null");
            return (Criteria) this;
        }

        public Criteria andScoreProjectNameEqualTo(String value) {
            addCriterion("score_project_name =", value, "scoreProjectName");
            return (Criteria) this;
        }

        public Criteria andScoreProjectNameNotEqualTo(String value) {
            addCriterion("score_project_name <>", value, "scoreProjectName");
            return (Criteria) this;
        }

        public Criteria andScoreProjectNameGreaterThan(String value) {
            addCriterion("score_project_name >", value, "scoreProjectName");
            return (Criteria) this;
        }

        public Criteria andScoreProjectNameGreaterThanOrEqualTo(String value) {
            addCriterion("score_project_name >=", value, "scoreProjectName");
            return (Criteria) this;
        }

        public Criteria andScoreProjectNameLessThan(String value) {
            addCriterion("score_project_name <", value, "scoreProjectName");
            return (Criteria) this;
        }

        public Criteria andScoreProjectNameLessThanOrEqualTo(String value) {
            addCriterion("score_project_name <=", value, "scoreProjectName");
            return (Criteria) this;
        }

        public Criteria andScoreProjectNameLike(String value) {
            addCriterion("score_project_name like", value, "scoreProjectName");
            return (Criteria) this;
        }

        public Criteria andScoreProjectNameNotLike(String value) {
            addCriterion("score_project_name not like", value, "scoreProjectName");
            return (Criteria) this;
        }

        public Criteria andScoreProjectNameIn(List<String> values) {
            addCriterion("score_project_name in", values, "scoreProjectName");
            return (Criteria) this;
        }

        public Criteria andScoreProjectNameNotIn(List<String> values) {
            addCriterion("score_project_name not in", values, "scoreProjectName");
            return (Criteria) this;
        }

        public Criteria andScoreProjectNameBetween(String value1, String value2) {
            addCriterion("score_project_name between", value1, value2, "scoreProjectName");
            return (Criteria) this;
        }

        public Criteria andScoreProjectNameNotBetween(String value1, String value2) {
            addCriterion("score_project_name not between", value1, value2, "scoreProjectName");
            return (Criteria) this;
        }

        public Criteria andScoreProjectIdIsNull() {
            addCriterion("score_project_id is null");
            return (Criteria) this;
        }

        public Criteria andScoreProjectIdIsNotNull() {
            addCriterion("score_project_id is not null");
            return (Criteria) this;
        }

        public Criteria andScoreProjectIdEqualTo(Integer value) {
            addCriterion("score_project_id =", value, "scoreProjectId");
            return (Criteria) this;
        }

        public Criteria andScoreProjectIdNotEqualTo(Integer value) {
            addCriterion("score_project_id <>", value, "scoreProjectId");
            return (Criteria) this;
        }

        public Criteria andScoreProjectIdGreaterThan(Integer value) {
            addCriterion("score_project_id >", value, "scoreProjectId");
            return (Criteria) this;
        }

        public Criteria andScoreProjectIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("score_project_id >=", value, "scoreProjectId");
            return (Criteria) this;
        }

        public Criteria andScoreProjectIdLessThan(Integer value) {
            addCriterion("score_project_id <", value, "scoreProjectId");
            return (Criteria) this;
        }

        public Criteria andScoreProjectIdLessThanOrEqualTo(Integer value) {
            addCriterion("score_project_id <=", value, "scoreProjectId");
            return (Criteria) this;
        }

        public Criteria andScoreProjectIdIn(List<Integer> values) {
            addCriterion("score_project_id in", values, "scoreProjectId");
            return (Criteria) this;
        }

        public Criteria andScoreProjectIdNotIn(List<Integer> values) {
            addCriterion("score_project_id not in", values, "scoreProjectId");
            return (Criteria) this;
        }

        public Criteria andScoreProjectIdBetween(Integer value1, Integer value2) {
            addCriterion("score_project_id between", value1, value2, "scoreProjectId");
            return (Criteria) this;
        }

        public Criteria andScoreProjectIdNotBetween(Integer value1, Integer value2) {
            addCriterion("score_project_id not between", value1, value2, "scoreProjectId");
            return (Criteria) this;
        }

        public Criteria andScoreContractorIsNull() {
            addCriterion("score_contractor is null");
            return (Criteria) this;
        }

        public Criteria andScoreContractorIsNotNull() {
            addCriterion("score_contractor is not null");
            return (Criteria) this;
        }

        public Criteria andScoreContractorEqualTo(String value) {
            addCriterion("score_contractor =", value, "scoreContractor");
            return (Criteria) this;
        }

        public Criteria andScoreContractorNotEqualTo(String value) {
            addCriterion("score_contractor <>", value, "scoreContractor");
            return (Criteria) this;
        }

        public Criteria andScoreContractorGreaterThan(String value) {
            addCriterion("score_contractor >", value, "scoreContractor");
            return (Criteria) this;
        }

        public Criteria andScoreContractorGreaterThanOrEqualTo(String value) {
            addCriterion("score_contractor >=", value, "scoreContractor");
            return (Criteria) this;
        }

        public Criteria andScoreContractorLessThan(String value) {
            addCriterion("score_contractor <", value, "scoreContractor");
            return (Criteria) this;
        }

        public Criteria andScoreContractorLessThanOrEqualTo(String value) {
            addCriterion("score_contractor <=", value, "scoreContractor");
            return (Criteria) this;
        }

        public Criteria andScoreContractorLike(String value) {
            addCriterion("score_contractor like", value, "scoreContractor");
            return (Criteria) this;
        }

        public Criteria andScoreContractorNotLike(String value) {
            addCriterion("score_contractor not like", value, "scoreContractor");
            return (Criteria) this;
        }

        public Criteria andScoreContractorIn(List<String> values) {
            addCriterion("score_contractor in", values, "scoreContractor");
            return (Criteria) this;
        }

        public Criteria andScoreContractorNotIn(List<String> values) {
            addCriterion("score_contractor not in", values, "scoreContractor");
            return (Criteria) this;
        }

        public Criteria andScoreContractorBetween(String value1, String value2) {
            addCriterion("score_contractor between", value1, value2, "scoreContractor");
            return (Criteria) this;
        }

        public Criteria andScoreContractorNotBetween(String value1, String value2) {
            addCriterion("score_contractor not between", value1, value2, "scoreContractor");
            return (Criteria) this;
        }

        public Criteria andScoreContractorCodeIsNull() {
            addCriterion("score_contractor_code is null");
            return (Criteria) this;
        }

        public Criteria andScoreContractorCodeIsNotNull() {
            addCriterion("score_contractor_code is not null");
            return (Criteria) this;
        }

        public Criteria andScoreContractorCodeEqualTo(String value) {
            addCriterion("score_contractor_code =", value, "scoreContractorCode");
            return (Criteria) this;
        }

        public Criteria andScoreContractorCodeNotEqualTo(String value) {
            addCriterion("score_contractor_code <>", value, "scoreContractorCode");
            return (Criteria) this;
        }

        public Criteria andScoreContractorCodeGreaterThan(String value) {
            addCriterion("score_contractor_code >", value, "scoreContractorCode");
            return (Criteria) this;
        }

        public Criteria andScoreContractorCodeGreaterThanOrEqualTo(String value) {
            addCriterion("score_contractor_code >=", value, "scoreContractorCode");
            return (Criteria) this;
        }

        public Criteria andScoreContractorCodeLessThan(String value) {
            addCriterion("score_contractor_code <", value, "scoreContractorCode");
            return (Criteria) this;
        }

        public Criteria andScoreContractorCodeLessThanOrEqualTo(String value) {
            addCriterion("score_contractor_code <=", value, "scoreContractorCode");
            return (Criteria) this;
        }

        public Criteria andScoreContractorCodeLike(String value) {
            addCriterion("score_contractor_code like", value, "scoreContractorCode");
            return (Criteria) this;
        }

        public Criteria andScoreContractorCodeNotLike(String value) {
            addCriterion("score_contractor_code not like", value, "scoreContractorCode");
            return (Criteria) this;
        }

        public Criteria andScoreContractorCodeIn(List<String> values) {
            addCriterion("score_contractor_code in", values, "scoreContractorCode");
            return (Criteria) this;
        }

        public Criteria andScoreContractorCodeNotIn(List<String> values) {
            addCriterion("score_contractor_code not in", values, "scoreContractorCode");
            return (Criteria) this;
        }

        public Criteria andScoreContractorCodeBetween(String value1, String value2) {
            addCriterion("score_contractor_code between", value1, value2, "scoreContractorCode");
            return (Criteria) this;
        }

        public Criteria andScoreContractorCodeNotBetween(String value1, String value2) {
            addCriterion("score_contractor_code not between", value1, value2, "scoreContractorCode");
            return (Criteria) this;
        }

        public Criteria andScoreOwnerGradeIsNull() {
            addCriterion("score_owner_grade is null");
            return (Criteria) this;
        }

        public Criteria andScoreOwnerGradeIsNotNull() {
            addCriterion("score_owner_grade is not null");
            return (Criteria) this;
        }

        public Criteria andScoreOwnerGradeEqualTo(Integer value) {
            addCriterion("score_owner_grade =", value, "scoreOwnerGrade");
            return (Criteria) this;
        }

        public Criteria andScoreOwnerGradeNotEqualTo(Integer value) {
            addCriterion("score_owner_grade <>", value, "scoreOwnerGrade");
            return (Criteria) this;
        }

        public Criteria andScoreOwnerGradeGreaterThan(Integer value) {
            addCriterion("score_owner_grade >", value, "scoreOwnerGrade");
            return (Criteria) this;
        }

        public Criteria andScoreOwnerGradeGreaterThanOrEqualTo(Integer value) {
            addCriterion("score_owner_grade >=", value, "scoreOwnerGrade");
            return (Criteria) this;
        }

        public Criteria andScoreOwnerGradeLessThan(Integer value) {
            addCriterion("score_owner_grade <", value, "scoreOwnerGrade");
            return (Criteria) this;
        }

        public Criteria andScoreOwnerGradeLessThanOrEqualTo(Integer value) {
            addCriterion("score_owner_grade <=", value, "scoreOwnerGrade");
            return (Criteria) this;
        }

        public Criteria andScoreOwnerGradeIn(List<Integer> values) {
            addCriterion("score_owner_grade in", values, "scoreOwnerGrade");
            return (Criteria) this;
        }

        public Criteria andScoreOwnerGradeNotIn(List<Integer> values) {
            addCriterion("score_owner_grade not in", values, "scoreOwnerGrade");
            return (Criteria) this;
        }

        public Criteria andScoreOwnerGradeBetween(Integer value1, Integer value2) {
            addCriterion("score_owner_grade between", value1, value2, "scoreOwnerGrade");
            return (Criteria) this;
        }

        public Criteria andScoreOwnerGradeNotBetween(Integer value1, Integer value2) {
            addCriterion("score_owner_grade not between", value1, value2, "scoreOwnerGrade");
            return (Criteria) this;
        }

        public Criteria andScoreCityGradeIsNull() {
            addCriterion("score_city_grade is null");
            return (Criteria) this;
        }

        public Criteria andScoreCityGradeIsNotNull() {
            addCriterion("score_city_grade is not null");
            return (Criteria) this;
        }

        public Criteria andScoreCityGradeEqualTo(Integer value) {
            addCriterion("score_city_grade =", value, "scoreCityGrade");
            return (Criteria) this;
        }

        public Criteria andScoreCityGradeNotEqualTo(Integer value) {
            addCriterion("score_city_grade <>", value, "scoreCityGrade");
            return (Criteria) this;
        }

        public Criteria andScoreCityGradeGreaterThan(Integer value) {
            addCriterion("score_city_grade >", value, "scoreCityGrade");
            return (Criteria) this;
        }

        public Criteria andScoreCityGradeGreaterThanOrEqualTo(Integer value) {
            addCriterion("score_city_grade >=", value, "scoreCityGrade");
            return (Criteria) this;
        }

        public Criteria andScoreCityGradeLessThan(Integer value) {
            addCriterion("score_city_grade <", value, "scoreCityGrade");
            return (Criteria) this;
        }

        public Criteria andScoreCityGradeLessThanOrEqualTo(Integer value) {
            addCriterion("score_city_grade <=", value, "scoreCityGrade");
            return (Criteria) this;
        }

        public Criteria andScoreCityGradeIn(List<Integer> values) {
            addCriterion("score_city_grade in", values, "scoreCityGrade");
            return (Criteria) this;
        }

        public Criteria andScoreCityGradeNotIn(List<Integer> values) {
            addCriterion("score_city_grade not in", values, "scoreCityGrade");
            return (Criteria) this;
        }

        public Criteria andScoreCityGradeBetween(Integer value1, Integer value2) {
            addCriterion("score_city_grade between", value1, value2, "scoreCityGrade");
            return (Criteria) this;
        }

        public Criteria andScoreCityGradeNotBetween(Integer value1, Integer value2) {
            addCriterion("score_city_grade not between", value1, value2, "scoreCityGrade");
            return (Criteria) this;
        }

        public Criteria andScoreDeptNameIsNull() {
            addCriterion("score_dept_name is null");
            return (Criteria) this;
        }

        public Criteria andScoreDeptNameIsNotNull() {
            addCriterion("score_dept_name is not null");
            return (Criteria) this;
        }

        public Criteria andScoreDeptNameEqualTo(String value) {
            addCriterion("score_dept_name =", value, "scoreDeptName");
            return (Criteria) this;
        }

        public Criteria andScoreDeptNameNotEqualTo(String value) {
            addCriterion("score_dept_name <>", value, "scoreDeptName");
            return (Criteria) this;
        }

        public Criteria andScoreDeptNameGreaterThan(String value) {
            addCriterion("score_dept_name >", value, "scoreDeptName");
            return (Criteria) this;
        }

        public Criteria andScoreDeptNameGreaterThanOrEqualTo(String value) {
            addCriterion("score_dept_name >=", value, "scoreDeptName");
            return (Criteria) this;
        }

        public Criteria andScoreDeptNameLessThan(String value) {
            addCriterion("score_dept_name <", value, "scoreDeptName");
            return (Criteria) this;
        }

        public Criteria andScoreDeptNameLessThanOrEqualTo(String value) {
            addCriterion("score_dept_name <=", value, "scoreDeptName");
            return (Criteria) this;
        }

        public Criteria andScoreDeptNameLike(String value) {
            addCriterion("score_dept_name like", value, "scoreDeptName");
            return (Criteria) this;
        }

        public Criteria andScoreDeptNameNotLike(String value) {
            addCriterion("score_dept_name not like", value, "scoreDeptName");
            return (Criteria) this;
        }

        public Criteria andScoreDeptNameIn(List<String> values) {
            addCriterion("score_dept_name in", values, "scoreDeptName");
            return (Criteria) this;
        }

        public Criteria andScoreDeptNameNotIn(List<String> values) {
            addCriterion("score_dept_name not in", values, "scoreDeptName");
            return (Criteria) this;
        }

        public Criteria andScoreDeptNameBetween(String value1, String value2) {
            addCriterion("score_dept_name between", value1, value2, "scoreDeptName");
            return (Criteria) this;
        }

        public Criteria andScoreDeptNameNotBetween(String value1, String value2) {
            addCriterion("score_dept_name not between", value1, value2, "scoreDeptName");
            return (Criteria) this;
        }

        public Criteria andScoreDeptCodeIsNull() {
            addCriterion("score_dept_code is null");
            return (Criteria) this;
        }

        public Criteria andScoreDeptCodeIsNotNull() {
            addCriterion("score_dept_code is not null");
            return (Criteria) this;
        }

        public Criteria andScoreDeptCodeEqualTo(String value) {
            addCriterion("score_dept_code =", value, "scoreDeptCode");
            return (Criteria) this;
        }

        public Criteria andScoreDeptCodeNotEqualTo(String value) {
            addCriterion("score_dept_code <>", value, "scoreDeptCode");
            return (Criteria) this;
        }

        public Criteria andScoreDeptCodeGreaterThan(String value) {
            addCriterion("score_dept_code >", value, "scoreDeptCode");
            return (Criteria) this;
        }

        public Criteria andScoreDeptCodeGreaterThanOrEqualTo(String value) {
            addCriterion("score_dept_code >=", value, "scoreDeptCode");
            return (Criteria) this;
        }

        public Criteria andScoreDeptCodeLessThan(String value) {
            addCriterion("score_dept_code <", value, "scoreDeptCode");
            return (Criteria) this;
        }

        public Criteria andScoreDeptCodeLessThanOrEqualTo(String value) {
            addCriterion("score_dept_code <=", value, "scoreDeptCode");
            return (Criteria) this;
        }

        public Criteria andScoreDeptCodeLike(String value) {
            addCriterion("score_dept_code like", value, "scoreDeptCode");
            return (Criteria) this;
        }

        public Criteria andScoreDeptCodeNotLike(String value) {
            addCriterion("score_dept_code not like", value, "scoreDeptCode");
            return (Criteria) this;
        }

        public Criteria andScoreDeptCodeIn(List<String> values) {
            addCriterion("score_dept_code in", values, "scoreDeptCode");
            return (Criteria) this;
        }

        public Criteria andScoreDeptCodeNotIn(List<String> values) {
            addCriterion("score_dept_code not in", values, "scoreDeptCode");
            return (Criteria) this;
        }

        public Criteria andScoreDeptCodeBetween(String value1, String value2) {
            addCriterion("score_dept_code between", value1, value2, "scoreDeptCode");
            return (Criteria) this;
        }

        public Criteria andScoreDeptCodeNotBetween(String value1, String value2) {
            addCriterion("score_dept_code not between", value1, value2, "scoreDeptCode");
            return (Criteria) this;
        }

        public Criteria andScoreGroupIsNull() {
            addCriterion("score_group is null");
            return (Criteria) this;
        }

        public Criteria andScoreGroupIsNotNull() {
            addCriterion("score_group is not null");
            return (Criteria) this;
        }

        public Criteria andScoreGroupEqualTo(String value) {
            addCriterion("score_group =", value, "scoreGroup");
            return (Criteria) this;
        }

        public Criteria andScoreGroupNotEqualTo(String value) {
            addCriterion("score_group <>", value, "scoreGroup");
            return (Criteria) this;
        }

        public Criteria andScoreGroupGreaterThan(String value) {
            addCriterion("score_group >", value, "scoreGroup");
            return (Criteria) this;
        }

        public Criteria andScoreGroupGreaterThanOrEqualTo(String value) {
            addCriterion("score_group >=", value, "scoreGroup");
            return (Criteria) this;
        }

        public Criteria andScoreGroupLessThan(String value) {
            addCriterion("score_group <", value, "scoreGroup");
            return (Criteria) this;
        }

        public Criteria andScoreGroupLessThanOrEqualTo(String value) {
            addCriterion("score_group <=", value, "scoreGroup");
            return (Criteria) this;
        }

        public Criteria andScoreGroupLike(String value) {
            addCriterion("score_group like", value, "scoreGroup");
            return (Criteria) this;
        }

        public Criteria andScoreGroupNotLike(String value) {
            addCriterion("score_group not like", value, "scoreGroup");
            return (Criteria) this;
        }

        public Criteria andScoreGroupIn(List<String> values) {
            addCriterion("score_group in", values, "scoreGroup");
            return (Criteria) this;
        }

        public Criteria andScoreGroupNotIn(List<String> values) {
            addCriterion("score_group not in", values, "scoreGroup");
            return (Criteria) this;
        }

        public Criteria andScoreGroupBetween(String value1, String value2) {
            addCriterion("score_group between", value1, value2, "scoreGroup");
            return (Criteria) this;
        }

        public Criteria andScoreGroupNotBetween(String value1, String value2) {
            addCriterion("score_group not between", value1, value2, "scoreGroup");
            return (Criteria) this;
        }

        public Criteria andScoreGroupCodeIsNull() {
            addCriterion("score_group_code is null");
            return (Criteria) this;
        }

        public Criteria andScoreGroupCodeIsNotNull() {
            addCriterion("score_group_code is not null");
            return (Criteria) this;
        }

        public Criteria andScoreGroupCodeEqualTo(String value) {
            addCriterion("score_group_code =", value, "scoreGroupCode");
            return (Criteria) this;
        }

        public Criteria andScoreGroupCodeNotEqualTo(String value) {
            addCriterion("score_group_code <>", value, "scoreGroupCode");
            return (Criteria) this;
        }

        public Criteria andScoreGroupCodeGreaterThan(String value) {
            addCriterion("score_group_code >", value, "scoreGroupCode");
            return (Criteria) this;
        }

        public Criteria andScoreGroupCodeGreaterThanOrEqualTo(String value) {
            addCriterion("score_group_code >=", value, "scoreGroupCode");
            return (Criteria) this;
        }

        public Criteria andScoreGroupCodeLessThan(String value) {
            addCriterion("score_group_code <", value, "scoreGroupCode");
            return (Criteria) this;
        }

        public Criteria andScoreGroupCodeLessThanOrEqualTo(String value) {
            addCriterion("score_group_code <=", value, "scoreGroupCode");
            return (Criteria) this;
        }

        public Criteria andScoreGroupCodeLike(String value) {
            addCriterion("score_group_code like", value, "scoreGroupCode");
            return (Criteria) this;
        }

        public Criteria andScoreGroupCodeNotLike(String value) {
            addCriterion("score_group_code not like", value, "scoreGroupCode");
            return (Criteria) this;
        }

        public Criteria andScoreGroupCodeIn(List<String> values) {
            addCriterion("score_group_code in", values, "scoreGroupCode");
            return (Criteria) this;
        }

        public Criteria andScoreGroupCodeNotIn(List<String> values) {
            addCriterion("score_group_code not in", values, "scoreGroupCode");
            return (Criteria) this;
        }

        public Criteria andScoreGroupCodeBetween(String value1, String value2) {
            addCriterion("score_group_code between", value1, value2, "scoreGroupCode");
            return (Criteria) this;
        }

        public Criteria andScoreGroupCodeNotBetween(String value1, String value2) {
            addCriterion("score_group_code not between", value1, value2, "scoreGroupCode");
            return (Criteria) this;
        }

        public Criteria andScoreTotalIsNull() {
            addCriterion("score_total is null");
            return (Criteria) this;
        }

        public Criteria andScoreTotalIsNotNull() {
            addCriterion("score_total is not null");
            return (Criteria) this;
        }

        public Criteria andScoreTotalEqualTo(String value) {
            addCriterion("score_total =", value, "scoreTotal");
            return (Criteria) this;
        }

        public Criteria andScoreTotalNotEqualTo(String value) {
            addCriterion("score_total <>", value, "scoreTotal");
            return (Criteria) this;
        }

        public Criteria andScoreTotalGreaterThan(String value) {
            addCriterion("score_total >", value, "scoreTotal");
            return (Criteria) this;
        }

        public Criteria andScoreTotalGreaterThanOrEqualTo(String value) {
            addCriterion("score_total >=", value, "scoreTotal");
            return (Criteria) this;
        }

        public Criteria andScoreTotalLessThan(String value) {
            addCriterion("score_total <", value, "scoreTotal");
            return (Criteria) this;
        }

        public Criteria andScoreTotalLessThanOrEqualTo(String value) {
            addCriterion("score_total <=", value, "scoreTotal");
            return (Criteria) this;
        }

        public Criteria andScoreTotalLike(String value) {
            addCriterion("score_total like", value, "scoreTotal");
            return (Criteria) this;
        }

        public Criteria andScoreTotalNotLike(String value) {
            addCriterion("score_total not like", value, "scoreTotal");
            return (Criteria) this;
        }

        public Criteria andScoreTotalIn(List<String> values) {
            addCriterion("score_total in", values, "scoreTotal");
            return (Criteria) this;
        }

        public Criteria andScoreTotalNotIn(List<String> values) {
            addCriterion("score_total not in", values, "scoreTotal");
            return (Criteria) this;
        }

        public Criteria andScoreTotalBetween(String value1, String value2) {
            addCriterion("score_total between", value1, value2, "scoreTotal");
            return (Criteria) this;
        }

        public Criteria andScoreTotalNotBetween(String value1, String value2) {
            addCriterion("score_total not between", value1, value2, "scoreTotal");
            return (Criteria) this;
        }

        public Criteria andScoreTimeIsNull() {
            addCriterion("score_time is null");
            return (Criteria) this;
        }

        public Criteria andScoreTimeIsNotNull() {
            addCriterion("score_time is not null");
            return (Criteria) this;
        }

        public Criteria andScoreTimeEqualTo(String value) {
            addCriterion("score_time =", value, "scoreTime");
            return (Criteria) this;
        }

        public Criteria andScoreTimeNotEqualTo(String value) {
            addCriterion("score_time <>", value, "scoreTime");
            return (Criteria) this;
        }

        public Criteria andScoreTimeGreaterThan(String value) {
            addCriterion("score_time >", value, "scoreTime");
            return (Criteria) this;
        }

        public Criteria andScoreTimeGreaterThanOrEqualTo(String value) {
            addCriterion("score_time >=", value, "scoreTime");
            return (Criteria) this;
        }

        public Criteria andScoreTimeLessThan(String value) {
            addCriterion("score_time <", value, "scoreTime");
            return (Criteria) this;
        }

        public Criteria andScoreTimeLessThanOrEqualTo(String value) {
            addCriterion("score_time <=", value, "scoreTime");
            return (Criteria) this;
        }

        public Criteria andScoreTimeLike(String value) {
            addCriterion("score_time like", value, "scoreTime");
            return (Criteria) this;
        }

        public Criteria andScoreTimeNotLike(String value) {
            addCriterion("score_time not like", value, "scoreTime");
            return (Criteria) this;
        }

        public Criteria andScoreTimeIn(List<String> values) {
            addCriterion("score_time in", values, "scoreTime");
            return (Criteria) this;
        }

        public Criteria andScoreTimeNotIn(List<String> values) {
            addCriterion("score_time not in", values, "scoreTime");
            return (Criteria) this;
        }

        public Criteria andScoreTimeBetween(String value1, String value2) {
            addCriterion("score_time between", value1, value2, "scoreTime");
            return (Criteria) this;
        }

        public Criteria andScoreTimeNotBetween(String value1, String value2) {
            addCriterion("score_time not between", value1, value2, "scoreTime");
            return (Criteria) this;
        }

        public Criteria andScoreStateIsNull() {
            addCriterion("score_state is null");
            return (Criteria) this;
        }

        public Criteria andScoreStateIsNotNull() {
            addCriterion("score_state is not null");
            return (Criteria) this;
        }

        public Criteria andScoreStateEqualTo(Integer value) {
            addCriterion("score_state =", value, "scoreState");
            return (Criteria) this;
        }

        public Criteria andScoreStateNotEqualTo(Integer value) {
            addCriterion("score_state <>", value, "scoreState");
            return (Criteria) this;
        }

        public Criteria andScoreStateGreaterThan(Integer value) {
            addCriterion("score_state >", value, "scoreState");
            return (Criteria) this;
        }

        public Criteria andScoreStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("score_state >=", value, "scoreState");
            return (Criteria) this;
        }

        public Criteria andScoreStateLessThan(Integer value) {
            addCriterion("score_state <", value, "scoreState");
            return (Criteria) this;
        }

        public Criteria andScoreStateLessThanOrEqualTo(Integer value) {
            addCriterion("score_state <=", value, "scoreState");
            return (Criteria) this;
        }

        public Criteria andScoreStateIn(List<Integer> values) {
            addCriterion("score_state in", values, "scoreState");
            return (Criteria) this;
        }

        public Criteria andScoreStateNotIn(List<Integer> values) {
            addCriterion("score_state not in", values, "scoreState");
            return (Criteria) this;
        }

        public Criteria andScoreStateBetween(Integer value1, Integer value2) {
            addCriterion("score_state between", value1, value2, "scoreState");
            return (Criteria) this;
        }

        public Criteria andScoreStateNotBetween(Integer value1, Integer value2) {
            addCriterion("score_state not between", value1, value2, "scoreState");
            return (Criteria) this;
        }

        public Criteria andScoreOrgcodeIsNull() {
            addCriterion("score_orgcode is null");
            return (Criteria) this;
        }

        public Criteria andScoreOrgcodeIsNotNull() {
            addCriterion("score_orgcode is not null");
            return (Criteria) this;
        }

        public Criteria andScoreOrgcodeEqualTo(String value) {
            addCriterion("score_orgcode =", value, "scoreOrgcode");
            return (Criteria) this;
        }

        public Criteria andScoreOrgcodeNotEqualTo(String value) {
            addCriterion("score_orgcode <>", value, "scoreOrgcode");
            return (Criteria) this;
        }

        public Criteria andScoreOrgcodeGreaterThan(String value) {
            addCriterion("score_orgcode >", value, "scoreOrgcode");
            return (Criteria) this;
        }

        public Criteria andScoreOrgcodeGreaterThanOrEqualTo(String value) {
            addCriterion("score_orgcode >=", value, "scoreOrgcode");
            return (Criteria) this;
        }

        public Criteria andScoreOrgcodeLessThan(String value) {
            addCriterion("score_orgcode <", value, "scoreOrgcode");
            return (Criteria) this;
        }

        public Criteria andScoreOrgcodeLessThanOrEqualTo(String value) {
            addCriterion("score_orgcode <=", value, "scoreOrgcode");
            return (Criteria) this;
        }

        public Criteria andScoreOrgcodeLike(String value) {
            addCriterion("score_orgcode like", value, "scoreOrgcode");
            return (Criteria) this;
        }

        public Criteria andScoreOrgcodeNotLike(String value) {
            addCriterion("score_orgcode not like", value, "scoreOrgcode");
            return (Criteria) this;
        }

        public Criteria andScoreOrgcodeIn(List<String> values) {
            addCriterion("score_orgcode in", values, "scoreOrgcode");
            return (Criteria) this;
        }

        public Criteria andScoreOrgcodeNotIn(List<String> values) {
            addCriterion("score_orgcode not in", values, "scoreOrgcode");
            return (Criteria) this;
        }

        public Criteria andScoreOrgcodeBetween(String value1, String value2) {
            addCriterion("score_orgcode between", value1, value2, "scoreOrgcode");
            return (Criteria) this;
        }

        public Criteria andScoreOrgcodeNotBetween(String value1, String value2) {
            addCriterion("score_orgcode not between", value1, value2, "scoreOrgcode");
            return (Criteria) this;
        }

        public Criteria andScoreOrgcitycodeIsNull() {
            addCriterion("score_orgcitycode is null");
            return (Criteria) this;
        }

        public Criteria andScoreOrgcitycodeIsNotNull() {
            addCriterion("score_orgcitycode is not null");
            return (Criteria) this;
        }

        public Criteria andScoreOrgcitycodeEqualTo(String value) {
            addCriterion("score_orgcitycode =", value, "scoreOrgcitycode");
            return (Criteria) this;
        }

        public Criteria andScoreOrgcitycodeNotEqualTo(String value) {
            addCriterion("score_orgcitycode <>", value, "scoreOrgcitycode");
            return (Criteria) this;
        }

        public Criteria andScoreOrgcitycodeGreaterThan(String value) {
            addCriterion("score_orgcitycode >", value, "scoreOrgcitycode");
            return (Criteria) this;
        }

        public Criteria andScoreOrgcitycodeGreaterThanOrEqualTo(String value) {
            addCriterion("score_orgcitycode >=", value, "scoreOrgcitycode");
            return (Criteria) this;
        }

        public Criteria andScoreOrgcitycodeLessThan(String value) {
            addCriterion("score_orgcitycode <", value, "scoreOrgcitycode");
            return (Criteria) this;
        }

        public Criteria andScoreOrgcitycodeLessThanOrEqualTo(String value) {
            addCriterion("score_orgcitycode <=", value, "scoreOrgcitycode");
            return (Criteria) this;
        }

        public Criteria andScoreOrgcitycodeLike(String value) {
            addCriterion("score_orgcitycode like", value, "scoreOrgcitycode");
            return (Criteria) this;
        }

        public Criteria andScoreOrgcitycodeNotLike(String value) {
            addCriterion("score_orgcitycode not like", value, "scoreOrgcitycode");
            return (Criteria) this;
        }

        public Criteria andScoreOrgcitycodeIn(List<String> values) {
            addCriterion("score_orgcitycode in", values, "scoreOrgcitycode");
            return (Criteria) this;
        }

        public Criteria andScoreOrgcitycodeNotIn(List<String> values) {
            addCriterion("score_orgcitycode not in", values, "scoreOrgcitycode");
            return (Criteria) this;
        }

        public Criteria andScoreOrgcitycodeBetween(String value1, String value2) {
            addCriterion("score_orgcitycode between", value1, value2, "scoreOrgcitycode");
            return (Criteria) this;
        }

        public Criteria andScoreOrgcitycodeNotBetween(String value1, String value2) {
            addCriterion("score_orgcitycode not between", value1, value2, "scoreOrgcitycode");
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

        public Criteria andDeleteMarkEqualTo(String value) {
            addCriterion("delete_mark =", value, "deleteMark");
            return (Criteria) this;
        }

        public Criteria andDeleteMarkNotEqualTo(String value) {
            addCriterion("delete_mark <>", value, "deleteMark");
            return (Criteria) this;
        }

        public Criteria andDeleteMarkGreaterThan(String value) {
            addCriterion("delete_mark >", value, "deleteMark");
            return (Criteria) this;
        }

        public Criteria andDeleteMarkGreaterThanOrEqualTo(String value) {
            addCriterion("delete_mark >=", value, "deleteMark");
            return (Criteria) this;
        }

        public Criteria andDeleteMarkLessThan(String value) {
            addCriterion("delete_mark <", value, "deleteMark");
            return (Criteria) this;
        }

        public Criteria andDeleteMarkLessThanOrEqualTo(String value) {
            addCriterion("delete_mark <=", value, "deleteMark");
            return (Criteria) this;
        }

        public Criteria andDeleteMarkLike(String value) {
            addCriterion("delete_mark like", value, "deleteMark");
            return (Criteria) this;
        }

        public Criteria andDeleteMarkNotLike(String value) {
            addCriterion("delete_mark not like", value, "deleteMark");
            return (Criteria) this;
        }

        public Criteria andDeleteMarkIn(List<String> values) {
            addCriterion("delete_mark in", values, "deleteMark");
            return (Criteria) this;
        }

        public Criteria andDeleteMarkNotIn(List<String> values) {
            addCriterion("delete_mark not in", values, "deleteMark");
            return (Criteria) this;
        }

        public Criteria andDeleteMarkBetween(String value1, String value2) {
            addCriterion("delete_mark between", value1, value2, "deleteMark");
            return (Criteria) this;
        }

        public Criteria andDeleteMarkNotBetween(String value1, String value2) {
            addCriterion("delete_mark not between", value1, value2, "deleteMark");
            return (Criteria) this;
        }

        public Criteria andSelectStateIsNull() {
            addCriterion("select_state is null");
            return (Criteria) this;
        }

        public Criteria andSelectStateIsNotNull() {
            addCriterion("select_state is not null");
            return (Criteria) this;
        }

        public Criteria andSelectStateEqualTo(Integer value) {
            addCriterion("select_state =", value, "selectState");
            return (Criteria) this;
        }

        public Criteria andSelectStateNotEqualTo(Integer value) {
            addCriterion("select_state <>", value, "selectState");
            return (Criteria) this;
        }

        public Criteria andSelectStateGreaterThan(Integer value) {
            addCriterion("select_state >", value, "selectState");
            return (Criteria) this;
        }

        public Criteria andSelectStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("select_state >=", value, "selectState");
            return (Criteria) this;
        }

        public Criteria andSelectStateLessThan(Integer value) {
            addCriterion("select_state <", value, "selectState");
            return (Criteria) this;
        }

        public Criteria andSelectStateLessThanOrEqualTo(Integer value) {
            addCriterion("select_state <=", value, "selectState");
            return (Criteria) this;
        }

        public Criteria andSelectStateIn(List<Integer> values) {
            addCriterion("select_state in", values, "selectState");
            return (Criteria) this;
        }

        public Criteria andSelectStateNotIn(List<Integer> values) {
            addCriterion("select_state not in", values, "selectState");
            return (Criteria) this;
        }

        public Criteria andSelectStateBetween(Integer value1, Integer value2) {
            addCriterion("select_state between", value1, value2, "selectState");
            return (Criteria) this;
        }

        public Criteria andSelectStateNotBetween(Integer value1, Integer value2) {
            addCriterion("select_state not between", value1, value2, "selectState");
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