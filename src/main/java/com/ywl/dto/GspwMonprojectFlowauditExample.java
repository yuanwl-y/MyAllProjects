package com.ywl.dto;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class GspwMonprojectFlowauditExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public GspwMonprojectFlowauditExample() {
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

        public Criteria andMonprojectFlowauditIdIsNull() {
            addCriterion("monproject_flowaudit_id is null");
            return (Criteria) this;
        }

        public Criteria andMonprojectFlowauditIdIsNotNull() {
            addCriterion("monproject_flowaudit_id is not null");
            return (Criteria) this;
        }

        public Criteria andMonprojectFlowauditIdEqualTo(String value) {
            addCriterion("monproject_flowaudit_id =", value, "monprojectFlowauditId");
            return (Criteria) this;
        }

        public Criteria andMonprojectFlowauditIdNotEqualTo(String value) {
            addCriterion("monproject_flowaudit_id <>", value, "monprojectFlowauditId");
            return (Criteria) this;
        }

        public Criteria andMonprojectFlowauditIdGreaterThan(String value) {
            addCriterion("monproject_flowaudit_id >", value, "monprojectFlowauditId");
            return (Criteria) this;
        }

        public Criteria andMonprojectFlowauditIdGreaterThanOrEqualTo(String value) {
            addCriterion("monproject_flowaudit_id >=", value, "monprojectFlowauditId");
            return (Criteria) this;
        }

        public Criteria andMonprojectFlowauditIdLessThan(String value) {
            addCriterion("monproject_flowaudit_id <", value, "monprojectFlowauditId");
            return (Criteria) this;
        }

        public Criteria andMonprojectFlowauditIdLessThanOrEqualTo(String value) {
            addCriterion("monproject_flowaudit_id <=", value, "monprojectFlowauditId");
            return (Criteria) this;
        }

        public Criteria andMonprojectFlowauditIdLike(String value) {
            addCriterion("monproject_flowaudit_id like", value, "monprojectFlowauditId");
            return (Criteria) this;
        }

        public Criteria andMonprojectFlowauditIdNotLike(String value) {
            addCriterion("monproject_flowaudit_id not like", value, "monprojectFlowauditId");
            return (Criteria) this;
        }

        public Criteria andMonprojectFlowauditIdIn(List<String> values) {
            addCriterion("monproject_flowaudit_id in", values, "monprojectFlowauditId");
            return (Criteria) this;
        }

        public Criteria andMonprojectFlowauditIdNotIn(List<String> values) {
            addCriterion("monproject_flowaudit_id not in", values, "monprojectFlowauditId");
            return (Criteria) this;
        }

        public Criteria andMonprojectFlowauditIdBetween(String value1, String value2) {
            addCriterion("monproject_flowaudit_id between", value1, value2, "monprojectFlowauditId");
            return (Criteria) this;
        }

        public Criteria andMonprojectFlowauditIdNotBetween(String value1, String value2) {
            addCriterion("monproject_flowaudit_id not between", value1, value2, "monprojectFlowauditId");
            return (Criteria) this;
        }

        public Criteria andMonprojectIdIsNull() {
            addCriterion("monproject_id is null");
            return (Criteria) this;
        }

        public Criteria andMonprojectIdIsNotNull() {
            addCriterion("monproject_id is not null");
            return (Criteria) this;
        }

        public Criteria andMonprojectIdEqualTo(String value) {
            addCriterion("monproject_id =", value, "monprojectId");
            return (Criteria) this;
        }

        public Criteria andMonprojectIdNotEqualTo(String value) {
            addCriterion("monproject_id <>", value, "monprojectId");
            return (Criteria) this;
        }

        public Criteria andMonprojectIdGreaterThan(String value) {
            addCriterion("monproject_id >", value, "monprojectId");
            return (Criteria) this;
        }

        public Criteria andMonprojectIdGreaterThanOrEqualTo(String value) {
            addCriterion("monproject_id >=", value, "monprojectId");
            return (Criteria) this;
        }

        public Criteria andMonprojectIdLessThan(String value) {
            addCriterion("monproject_id <", value, "monprojectId");
            return (Criteria) this;
        }

        public Criteria andMonprojectIdLessThanOrEqualTo(String value) {
            addCriterion("monproject_id <=", value, "monprojectId");
            return (Criteria) this;
        }

        public Criteria andMonprojectIdLike(String value) {
            addCriterion("monproject_id like", value, "monprojectId");
            return (Criteria) this;
        }

        public Criteria andMonprojectIdNotLike(String value) {
            addCriterion("monproject_id not like", value, "monprojectId");
            return (Criteria) this;
        }

        public Criteria andMonprojectIdIn(List<String> values) {
            addCriterion("monproject_id in", values, "monprojectId");
            return (Criteria) this;
        }

        public Criteria andMonprojectIdNotIn(List<String> values) {
            addCriterion("monproject_id not in", values, "monprojectId");
            return (Criteria) this;
        }

        public Criteria andMonprojectIdBetween(String value1, String value2) {
            addCriterion("monproject_id between", value1, value2, "monprojectId");
            return (Criteria) this;
        }

        public Criteria andMonprojectIdNotBetween(String value1, String value2) {
            addCriterion("monproject_id not between", value1, value2, "monprojectId");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNull() {
            addCriterion("user_name is null");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNotNull() {
            addCriterion("user_name is not null");
            return (Criteria) this;
        }

        public Criteria andUserNameEqualTo(String value) {
            addCriterion("user_name =", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotEqualTo(String value) {
            addCriterion("user_name <>", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThan(String value) {
            addCriterion("user_name >", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("user_name >=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThan(String value) {
            addCriterion("user_name <", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThanOrEqualTo(String value) {
            addCriterion("user_name <=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLike(String value) {
            addCriterion("user_name like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotLike(String value) {
            addCriterion("user_name not like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameIn(List<String> values) {
            addCriterion("user_name in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotIn(List<String> values) {
            addCriterion("user_name not in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameBetween(String value1, String value2) {
            addCriterion("user_name between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotBetween(String value1, String value2) {
            addCriterion("user_name not between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andUserDeptcodeIsNull() {
            addCriterion("user_deptCode is null");
            return (Criteria) this;
        }

        public Criteria andUserDeptcodeIsNotNull() {
            addCriterion("user_deptCode is not null");
            return (Criteria) this;
        }

        public Criteria andUserDeptcodeEqualTo(String value) {
            addCriterion("user_deptCode =", value, "userDeptcode");
            return (Criteria) this;
        }

        public Criteria andUserDeptcodeNotEqualTo(String value) {
            addCriterion("user_deptCode <>", value, "userDeptcode");
            return (Criteria) this;
        }

        public Criteria andUserDeptcodeGreaterThan(String value) {
            addCriterion("user_deptCode >", value, "userDeptcode");
            return (Criteria) this;
        }

        public Criteria andUserDeptcodeGreaterThanOrEqualTo(String value) {
            addCriterion("user_deptCode >=", value, "userDeptcode");
            return (Criteria) this;
        }

        public Criteria andUserDeptcodeLessThan(String value) {
            addCriterion("user_deptCode <", value, "userDeptcode");
            return (Criteria) this;
        }

        public Criteria andUserDeptcodeLessThanOrEqualTo(String value) {
            addCriterion("user_deptCode <=", value, "userDeptcode");
            return (Criteria) this;
        }

        public Criteria andUserDeptcodeLike(String value) {
            addCriterion("user_deptCode like", value, "userDeptcode");
            return (Criteria) this;
        }

        public Criteria andUserDeptcodeNotLike(String value) {
            addCriterion("user_deptCode not like", value, "userDeptcode");
            return (Criteria) this;
        }

        public Criteria andUserDeptcodeIn(List<String> values) {
            addCriterion("user_deptCode in", values, "userDeptcode");
            return (Criteria) this;
        }

        public Criteria andUserDeptcodeNotIn(List<String> values) {
            addCriterion("user_deptCode not in", values, "userDeptcode");
            return (Criteria) this;
        }

        public Criteria andUserDeptcodeBetween(String value1, String value2) {
            addCriterion("user_deptCode between", value1, value2, "userDeptcode");
            return (Criteria) this;
        }

        public Criteria andUserDeptcodeNotBetween(String value1, String value2) {
            addCriterion("user_deptCode not between", value1, value2, "userDeptcode");
            return (Criteria) this;
        }

        public Criteria andUserDeptIsNull() {
            addCriterion("user_dept is null");
            return (Criteria) this;
        }

        public Criteria andUserDeptIsNotNull() {
            addCriterion("user_dept is not null");
            return (Criteria) this;
        }

        public Criteria andUserDeptEqualTo(String value) {
            addCriterion("user_dept =", value, "userDept");
            return (Criteria) this;
        }

        public Criteria andUserDeptNotEqualTo(String value) {
            addCriterion("user_dept <>", value, "userDept");
            return (Criteria) this;
        }

        public Criteria andUserDeptGreaterThan(String value) {
            addCriterion("user_dept >", value, "userDept");
            return (Criteria) this;
        }

        public Criteria andUserDeptGreaterThanOrEqualTo(String value) {
            addCriterion("user_dept >=", value, "userDept");
            return (Criteria) this;
        }

        public Criteria andUserDeptLessThan(String value) {
            addCriterion("user_dept <", value, "userDept");
            return (Criteria) this;
        }

        public Criteria andUserDeptLessThanOrEqualTo(String value) {
            addCriterion("user_dept <=", value, "userDept");
            return (Criteria) this;
        }

        public Criteria andUserDeptLike(String value) {
            addCriterion("user_dept like", value, "userDept");
            return (Criteria) this;
        }

        public Criteria andUserDeptNotLike(String value) {
            addCriterion("user_dept not like", value, "userDept");
            return (Criteria) this;
        }

        public Criteria andUserDeptIn(List<String> values) {
            addCriterion("user_dept in", values, "userDept");
            return (Criteria) this;
        }

        public Criteria andUserDeptNotIn(List<String> values) {
            addCriterion("user_dept not in", values, "userDept");
            return (Criteria) this;
        }

        public Criteria andUserDeptBetween(String value1, String value2) {
            addCriterion("user_dept between", value1, value2, "userDept");
            return (Criteria) this;
        }

        public Criteria andUserDeptNotBetween(String value1, String value2) {
            addCriterion("user_dept not between", value1, value2, "userDept");
            return (Criteria) this;
        }

        public Criteria andUserWorkcodeIsNull() {
            addCriterion("user_workCode is null");
            return (Criteria) this;
        }

        public Criteria andUserWorkcodeIsNotNull() {
            addCriterion("user_workCode is not null");
            return (Criteria) this;
        }

        public Criteria andUserWorkcodeEqualTo(String value) {
            addCriterion("user_workCode =", value, "userWorkcode");
            return (Criteria) this;
        }

        public Criteria andUserWorkcodeNotEqualTo(String value) {
            addCriterion("user_workCode <>", value, "userWorkcode");
            return (Criteria) this;
        }

        public Criteria andUserWorkcodeGreaterThan(String value) {
            addCriterion("user_workCode >", value, "userWorkcode");
            return (Criteria) this;
        }

        public Criteria andUserWorkcodeGreaterThanOrEqualTo(String value) {
            addCriterion("user_workCode >=", value, "userWorkcode");
            return (Criteria) this;
        }

        public Criteria andUserWorkcodeLessThan(String value) {
            addCriterion("user_workCode <", value, "userWorkcode");
            return (Criteria) this;
        }

        public Criteria andUserWorkcodeLessThanOrEqualTo(String value) {
            addCriterion("user_workCode <=", value, "userWorkcode");
            return (Criteria) this;
        }

        public Criteria andUserWorkcodeLike(String value) {
            addCriterion("user_workCode like", value, "userWorkcode");
            return (Criteria) this;
        }

        public Criteria andUserWorkcodeNotLike(String value) {
            addCriterion("user_workCode not like", value, "userWorkcode");
            return (Criteria) this;
        }

        public Criteria andUserWorkcodeIn(List<String> values) {
            addCriterion("user_workCode in", values, "userWorkcode");
            return (Criteria) this;
        }

        public Criteria andUserWorkcodeNotIn(List<String> values) {
            addCriterion("user_workCode not in", values, "userWorkcode");
            return (Criteria) this;
        }

        public Criteria andUserWorkcodeBetween(String value1, String value2) {
            addCriterion("user_workCode between", value1, value2, "userWorkcode");
            return (Criteria) this;
        }

        public Criteria andUserWorkcodeNotBetween(String value1, String value2) {
            addCriterion("user_workCode not between", value1, value2, "userWorkcode");
            return (Criteria) this;
        }

        public Criteria andUserOrgcodeIsNull() {
            addCriterion("user_orgCode is null");
            return (Criteria) this;
        }

        public Criteria andUserOrgcodeIsNotNull() {
            addCriterion("user_orgCode is not null");
            return (Criteria) this;
        }

        public Criteria andUserOrgcodeEqualTo(String value) {
            addCriterion("user_orgCode =", value, "userOrgcode");
            return (Criteria) this;
        }

        public Criteria andUserOrgcodeNotEqualTo(String value) {
            addCriterion("user_orgCode <>", value, "userOrgcode");
            return (Criteria) this;
        }

        public Criteria andUserOrgcodeGreaterThan(String value) {
            addCriterion("user_orgCode >", value, "userOrgcode");
            return (Criteria) this;
        }

        public Criteria andUserOrgcodeGreaterThanOrEqualTo(String value) {
            addCriterion("user_orgCode >=", value, "userOrgcode");
            return (Criteria) this;
        }

        public Criteria andUserOrgcodeLessThan(String value) {
            addCriterion("user_orgCode <", value, "userOrgcode");
            return (Criteria) this;
        }

        public Criteria andUserOrgcodeLessThanOrEqualTo(String value) {
            addCriterion("user_orgCode <=", value, "userOrgcode");
            return (Criteria) this;
        }

        public Criteria andUserOrgcodeLike(String value) {
            addCriterion("user_orgCode like", value, "userOrgcode");
            return (Criteria) this;
        }

        public Criteria andUserOrgcodeNotLike(String value) {
            addCriterion("user_orgCode not like", value, "userOrgcode");
            return (Criteria) this;
        }

        public Criteria andUserOrgcodeIn(List<String> values) {
            addCriterion("user_orgCode in", values, "userOrgcode");
            return (Criteria) this;
        }

        public Criteria andUserOrgcodeNotIn(List<String> values) {
            addCriterion("user_orgCode not in", values, "userOrgcode");
            return (Criteria) this;
        }

        public Criteria andUserOrgcodeBetween(String value1, String value2) {
            addCriterion("user_orgCode between", value1, value2, "userOrgcode");
            return (Criteria) this;
        }

        public Criteria andUserOrgcodeNotBetween(String value1, String value2) {
            addCriterion("user_orgCode not between", value1, value2, "userOrgcode");
            return (Criteria) this;
        }

        public Criteria andUserOrgIsNull() {
            addCriterion("user_org is null");
            return (Criteria) this;
        }

        public Criteria andUserOrgIsNotNull() {
            addCriterion("user_org is not null");
            return (Criteria) this;
        }

        public Criteria andUserOrgEqualTo(String value) {
            addCriterion("user_org =", value, "userOrg");
            return (Criteria) this;
        }

        public Criteria andUserOrgNotEqualTo(String value) {
            addCriterion("user_org <>", value, "userOrg");
            return (Criteria) this;
        }

        public Criteria andUserOrgGreaterThan(String value) {
            addCriterion("user_org >", value, "userOrg");
            return (Criteria) this;
        }

        public Criteria andUserOrgGreaterThanOrEqualTo(String value) {
            addCriterion("user_org >=", value, "userOrg");
            return (Criteria) this;
        }

        public Criteria andUserOrgLessThan(String value) {
            addCriterion("user_org <", value, "userOrg");
            return (Criteria) this;
        }

        public Criteria andUserOrgLessThanOrEqualTo(String value) {
            addCriterion("user_org <=", value, "userOrg");
            return (Criteria) this;
        }

        public Criteria andUserOrgLike(String value) {
            addCriterion("user_org like", value, "userOrg");
            return (Criteria) this;
        }

        public Criteria andUserOrgNotLike(String value) {
            addCriterion("user_org not like", value, "userOrg");
            return (Criteria) this;
        }

        public Criteria andUserOrgIn(List<String> values) {
            addCriterion("user_org in", values, "userOrg");
            return (Criteria) this;
        }

        public Criteria andUserOrgNotIn(List<String> values) {
            addCriterion("user_org not in", values, "userOrg");
            return (Criteria) this;
        }

        public Criteria andUserOrgBetween(String value1, String value2) {
            addCriterion("user_org between", value1, value2, "userOrg");
            return (Criteria) this;
        }

        public Criteria andUserOrgNotBetween(String value1, String value2) {
            addCriterion("user_org not between", value1, value2, "userOrg");
            return (Criteria) this;
        }

        public Criteria andMonprojectFlowauditDateIsNull() {
            addCriterion("monproject_flowaudit_date is null");
            return (Criteria) this;
        }

        public Criteria andMonprojectFlowauditDateIsNotNull() {
            addCriterion("monproject_flowaudit_date is not null");
            return (Criteria) this;
        }

        public Criteria andMonprojectFlowauditDateEqualTo(Date value) {
            addCriterion("monproject_flowaudit_date =", value, "monprojectFlowauditDate");
            return (Criteria) this;
        }

        public Criteria andMonprojectFlowauditDateNotEqualTo(Date value) {
            addCriterion("monproject_flowaudit_date <>", value, "monprojectFlowauditDate");
            return (Criteria) this;
        }

        public Criteria andMonprojectFlowauditDateGreaterThan(Date value) {
            addCriterion("monproject_flowaudit_date >", value, "monprojectFlowauditDate");
            return (Criteria) this;
        }

        public Criteria andMonprojectFlowauditDateGreaterThanOrEqualTo(Date value) {
            addCriterion("monproject_flowaudit_date >=", value, "monprojectFlowauditDate");
            return (Criteria) this;
        }

        public Criteria andMonprojectFlowauditDateLessThan(Date value) {
            addCriterion("monproject_flowaudit_date <", value, "monprojectFlowauditDate");
            return (Criteria) this;
        }

        public Criteria andMonprojectFlowauditDateLessThanOrEqualTo(Date value) {
            addCriterion("monproject_flowaudit_date <=", value, "monprojectFlowauditDate");
            return (Criteria) this;
        }

        public Criteria andMonprojectFlowauditDateIn(List<Date> values) {
            addCriterion("monproject_flowaudit_date in", values, "monprojectFlowauditDate");
            return (Criteria) this;
        }

        public Criteria andMonprojectFlowauditDateNotIn(List<Date> values) {
            addCriterion("monproject_flowaudit_date not in", values, "monprojectFlowauditDate");
            return (Criteria) this;
        }

        public Criteria andMonprojectFlowauditDateBetween(Date value1, Date value2) {
            addCriterion("monproject_flowaudit_date between", value1, value2, "monprojectFlowauditDate");
            return (Criteria) this;
        }

        public Criteria andMonprojectFlowauditDateNotBetween(Date value1, Date value2) {
            addCriterion("monproject_flowaudit_date not between", value1, value2, "monprojectFlowauditDate");
            return (Criteria) this;
        }

        public Criteria andMonprojectFlowauditContextIsNull() {
            addCriterion("monproject_flowaudit_context is null");
            return (Criteria) this;
        }

        public Criteria andMonprojectFlowauditContextIsNotNull() {
            addCriterion("monproject_flowaudit_context is not null");
            return (Criteria) this;
        }

        public Criteria andMonprojectFlowauditContextEqualTo(String value) {
            addCriterion("monproject_flowaudit_context =", value, "monprojectFlowauditContext");
            return (Criteria) this;
        }

        public Criteria andMonprojectFlowauditContextNotEqualTo(String value) {
            addCriterion("monproject_flowaudit_context <>", value, "monprojectFlowauditContext");
            return (Criteria) this;
        }

        public Criteria andMonprojectFlowauditContextGreaterThan(String value) {
            addCriterion("monproject_flowaudit_context >", value, "monprojectFlowauditContext");
            return (Criteria) this;
        }

        public Criteria andMonprojectFlowauditContextGreaterThanOrEqualTo(String value) {
            addCriterion("monproject_flowaudit_context >=", value, "monprojectFlowauditContext");
            return (Criteria) this;
        }

        public Criteria andMonprojectFlowauditContextLessThan(String value) {
            addCriterion("monproject_flowaudit_context <", value, "monprojectFlowauditContext");
            return (Criteria) this;
        }

        public Criteria andMonprojectFlowauditContextLessThanOrEqualTo(String value) {
            addCriterion("monproject_flowaudit_context <=", value, "monprojectFlowauditContext");
            return (Criteria) this;
        }

        public Criteria andMonprojectFlowauditContextLike(String value) {
            addCriterion("monproject_flowaudit_context like", value, "monprojectFlowauditContext");
            return (Criteria) this;
        }

        public Criteria andMonprojectFlowauditContextNotLike(String value) {
            addCriterion("monproject_flowaudit_context not like", value, "monprojectFlowauditContext");
            return (Criteria) this;
        }

        public Criteria andMonprojectFlowauditContextIn(List<String> values) {
            addCriterion("monproject_flowaudit_context in", values, "monprojectFlowauditContext");
            return (Criteria) this;
        }

        public Criteria andMonprojectFlowauditContextNotIn(List<String> values) {
            addCriterion("monproject_flowaudit_context not in", values, "monprojectFlowauditContext");
            return (Criteria) this;
        }

        public Criteria andMonprojectFlowauditContextBetween(String value1, String value2) {
            addCriterion("monproject_flowaudit_context between", value1, value2, "monprojectFlowauditContext");
            return (Criteria) this;
        }

        public Criteria andMonprojectFlowauditContextNotBetween(String value1, String value2) {
            addCriterion("monproject_flowaudit_context not between", value1, value2, "monprojectFlowauditContext");
            return (Criteria) this;
        }

        public Criteria andMonprojectFlowauditResultIsNull() {
            addCriterion("monproject_flowaudit_result is null");
            return (Criteria) this;
        }

        public Criteria andMonprojectFlowauditResultIsNotNull() {
            addCriterion("monproject_flowaudit_result is not null");
            return (Criteria) this;
        }

        public Criteria andMonprojectFlowauditResultEqualTo(String value) {
            addCriterion("monproject_flowaudit_result =", value, "monprojectFlowauditResult");
            return (Criteria) this;
        }

        public Criteria andMonprojectFlowauditResultNotEqualTo(String value) {
            addCriterion("monproject_flowaudit_result <>", value, "monprojectFlowauditResult");
            return (Criteria) this;
        }

        public Criteria andMonprojectFlowauditResultGreaterThan(String value) {
            addCriterion("monproject_flowaudit_result >", value, "monprojectFlowauditResult");
            return (Criteria) this;
        }

        public Criteria andMonprojectFlowauditResultGreaterThanOrEqualTo(String value) {
            addCriterion("monproject_flowaudit_result >=", value, "monprojectFlowauditResult");
            return (Criteria) this;
        }

        public Criteria andMonprojectFlowauditResultLessThan(String value) {
            addCriterion("monproject_flowaudit_result <", value, "monprojectFlowauditResult");
            return (Criteria) this;
        }

        public Criteria andMonprojectFlowauditResultLessThanOrEqualTo(String value) {
            addCriterion("monproject_flowaudit_result <=", value, "monprojectFlowauditResult");
            return (Criteria) this;
        }

        public Criteria andMonprojectFlowauditResultLike(String value) {
            addCriterion("monproject_flowaudit_result like", value, "monprojectFlowauditResult");
            return (Criteria) this;
        }

        public Criteria andMonprojectFlowauditResultNotLike(String value) {
            addCriterion("monproject_flowaudit_result not like", value, "monprojectFlowauditResult");
            return (Criteria) this;
        }

        public Criteria andMonprojectFlowauditResultIn(List<String> values) {
            addCriterion("monproject_flowaudit_result in", values, "monprojectFlowauditResult");
            return (Criteria) this;
        }

        public Criteria andMonprojectFlowauditResultNotIn(List<String> values) {
            addCriterion("monproject_flowaudit_result not in", values, "monprojectFlowauditResult");
            return (Criteria) this;
        }

        public Criteria andMonprojectFlowauditResultBetween(String value1, String value2) {
            addCriterion("monproject_flowaudit_result between", value1, value2, "monprojectFlowauditResult");
            return (Criteria) this;
        }

        public Criteria andMonprojectFlowauditResultNotBetween(String value1, String value2) {
            addCriterion("monproject_flowaudit_result not between", value1, value2, "monprojectFlowauditResult");
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