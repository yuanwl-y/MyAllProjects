package ywl.dto;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class GspwMonprojectExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public GspwMonprojectExample() {
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

        public Criteria andMonprojectNameIsNull() {
            addCriterion("monproject_name is null");
            return (Criteria) this;
        }

        public Criteria andMonprojectNameIsNotNull() {
            addCriterion("monproject_name is not null");
            return (Criteria) this;
        }

        public Criteria andMonprojectNameEqualTo(String value) {
            addCriterion("monproject_name =", value, "monprojectName");
            return (Criteria) this;
        }

        public Criteria andMonprojectNameNotEqualTo(String value) {
            addCriterion("monproject_name <>", value, "monprojectName");
            return (Criteria) this;
        }

        public Criteria andMonprojectNameGreaterThan(String value) {
            addCriterion("monproject_name >", value, "monprojectName");
            return (Criteria) this;
        }

        public Criteria andMonprojectNameGreaterThanOrEqualTo(String value) {
            addCriterion("monproject_name >=", value, "monprojectName");
            return (Criteria) this;
        }

        public Criteria andMonprojectNameLessThan(String value) {
            addCriterion("monproject_name <", value, "monprojectName");
            return (Criteria) this;
        }

        public Criteria andMonprojectNameLessThanOrEqualTo(String value) {
            addCriterion("monproject_name <=", value, "monprojectName");
            return (Criteria) this;
        }

        public Criteria andMonprojectNameLike(String value) {
            addCriterion("monproject_name like", value, "monprojectName");
            return (Criteria) this;
        }

        public Criteria andMonprojectNameNotLike(String value) {
            addCriterion("monproject_name not like", value, "monprojectName");
            return (Criteria) this;
        }

        public Criteria andMonprojectNameIn(List<String> values) {
            addCriterion("monproject_name in", values, "monprojectName");
            return (Criteria) this;
        }

        public Criteria andMonprojectNameNotIn(List<String> values) {
            addCriterion("monproject_name not in", values, "monprojectName");
            return (Criteria) this;
        }

        public Criteria andMonprojectNameBetween(String value1, String value2) {
            addCriterion("monproject_name between", value1, value2, "monprojectName");
            return (Criteria) this;
        }

        public Criteria andMonprojectNameNotBetween(String value1, String value2) {
            addCriterion("monproject_name not between", value1, value2, "monprojectName");
            return (Criteria) this;
        }

        public Criteria andMonprojectWbsIsNull() {
            addCriterion("monproject_wbs is null");
            return (Criteria) this;
        }

        public Criteria andMonprojectWbsIsNotNull() {
            addCriterion("monproject_wbs is not null");
            return (Criteria) this;
        }

        public Criteria andMonprojectWbsEqualTo(String value) {
            addCriterion("monproject_wbs =", value, "monprojectWbs");
            return (Criteria) this;
        }

        public Criteria andMonprojectWbsNotEqualTo(String value) {
            addCriterion("monproject_wbs <>", value, "monprojectWbs");
            return (Criteria) this;
        }

        public Criteria andMonprojectWbsGreaterThan(String value) {
            addCriterion("monproject_wbs >", value, "monprojectWbs");
            return (Criteria) this;
        }

        public Criteria andMonprojectWbsGreaterThanOrEqualTo(String value) {
            addCriterion("monproject_wbs >=", value, "monprojectWbs");
            return (Criteria) this;
        }

        public Criteria andMonprojectWbsLessThan(String value) {
            addCriterion("monproject_wbs <", value, "monprojectWbs");
            return (Criteria) this;
        }

        public Criteria andMonprojectWbsLessThanOrEqualTo(String value) {
            addCriterion("monproject_wbs <=", value, "monprojectWbs");
            return (Criteria) this;
        }

        public Criteria andMonprojectWbsLike(String value) {
            addCriterion("monproject_wbs like", value, "monprojectWbs");
            return (Criteria) this;
        }

        public Criteria andMonprojectWbsNotLike(String value) {
            addCriterion("monproject_wbs not like", value, "monprojectWbs");
            return (Criteria) this;
        }

        public Criteria andMonprojectWbsIn(List<String> values) {
            addCriterion("monproject_wbs in", values, "monprojectWbs");
            return (Criteria) this;
        }

        public Criteria andMonprojectWbsNotIn(List<String> values) {
            addCriterion("monproject_wbs not in", values, "monprojectWbs");
            return (Criteria) this;
        }

        public Criteria andMonprojectWbsBetween(String value1, String value2) {
            addCriterion("monproject_wbs between", value1, value2, "monprojectWbs");
            return (Criteria) this;
        }

        public Criteria andMonprojectWbsNotBetween(String value1, String value2) {
            addCriterion("monproject_wbs not between", value1, value2, "monprojectWbs");
            return (Criteria) this;
        }

        public Criteria andProjectWbsIsNull() {
            addCriterion("project_wbs is null");
            return (Criteria) this;
        }

        public Criteria andProjectWbsIsNotNull() {
            addCriterion("project_wbs is not null");
            return (Criteria) this;
        }

        public Criteria andProjectWbsEqualTo(String value) {
            addCriterion("project_wbs =", value, "projectWbs");
            return (Criteria) this;
        }

        public Criteria andProjectWbsNotEqualTo(String value) {
            addCriterion("project_wbs <>", value, "projectWbs");
            return (Criteria) this;
        }

        public Criteria andProjectWbsGreaterThan(String value) {
            addCriterion("project_wbs >", value, "projectWbs");
            return (Criteria) this;
        }

        public Criteria andProjectWbsGreaterThanOrEqualTo(String value) {
            addCriterion("project_wbs >=", value, "projectWbs");
            return (Criteria) this;
        }

        public Criteria andProjectWbsLessThan(String value) {
            addCriterion("project_wbs <", value, "projectWbs");
            return (Criteria) this;
        }

        public Criteria andProjectWbsLessThanOrEqualTo(String value) {
            addCriterion("project_wbs <=", value, "projectWbs");
            return (Criteria) this;
        }

        public Criteria andProjectWbsLike(String value) {
            addCriterion("project_wbs like", value, "projectWbs");
            return (Criteria) this;
        }

        public Criteria andProjectWbsNotLike(String value) {
            addCriterion("project_wbs not like", value, "projectWbs");
            return (Criteria) this;
        }

        public Criteria andProjectWbsIn(List<String> values) {
            addCriterion("project_wbs in", values, "projectWbs");
            return (Criteria) this;
        }

        public Criteria andProjectWbsNotIn(List<String> values) {
            addCriterion("project_wbs not in", values, "projectWbs");
            return (Criteria) this;
        }

        public Criteria andProjectWbsBetween(String value1, String value2) {
            addCriterion("project_wbs between", value1, value2, "projectWbs");
            return (Criteria) this;
        }

        public Criteria andProjectWbsNotBetween(String value1, String value2) {
            addCriterion("project_wbs not between", value1, value2, "projectWbs");
            return (Criteria) this;
        }

        public Criteria andMonprojectInvestmentIsNull() {
            addCriterion("monproject_investment is null");
            return (Criteria) this;
        }

        public Criteria andMonprojectInvestmentIsNotNull() {
            addCriterion("monproject_investment is not null");
            return (Criteria) this;
        }

        public Criteria andMonprojectInvestmentEqualTo(String value) {
            addCriterion("monproject_investment =", value, "monprojectInvestment");
            return (Criteria) this;
        }

        public Criteria andMonprojectInvestmentNotEqualTo(String value) {
            addCriterion("monproject_investment <>", value, "monprojectInvestment");
            return (Criteria) this;
        }

        public Criteria andMonprojectInvestmentGreaterThan(String value) {
            addCriterion("monproject_investment >", value, "monprojectInvestment");
            return (Criteria) this;
        }

        public Criteria andMonprojectInvestmentGreaterThanOrEqualTo(String value) {
            addCriterion("monproject_investment >=", value, "monprojectInvestment");
            return (Criteria) this;
        }

        public Criteria andMonprojectInvestmentLessThan(String value) {
            addCriterion("monproject_investment <", value, "monprojectInvestment");
            return (Criteria) this;
        }

        public Criteria andMonprojectInvestmentLessThanOrEqualTo(String value) {
            addCriterion("monproject_investment <=", value, "monprojectInvestment");
            return (Criteria) this;
        }

        public Criteria andMonprojectInvestmentLike(String value) {
            addCriterion("monproject_investment like", value, "monprojectInvestment");
            return (Criteria) this;
        }

        public Criteria andMonprojectInvestmentNotLike(String value) {
            addCriterion("monproject_investment not like", value, "monprojectInvestment");
            return (Criteria) this;
        }

        public Criteria andMonprojectInvestmentIn(List<String> values) {
            addCriterion("monproject_investment in", values, "monprojectInvestment");
            return (Criteria) this;
        }

        public Criteria andMonprojectInvestmentNotIn(List<String> values) {
            addCriterion("monproject_investment not in", values, "monprojectInvestment");
            return (Criteria) this;
        }

        public Criteria andMonprojectInvestmentBetween(String value1, String value2) {
            addCriterion("monproject_investment between", value1, value2, "monprojectInvestment");
            return (Criteria) this;
        }

        public Criteria andMonprojectInvestmentNotBetween(String value1, String value2) {
            addCriterion("monproject_investment not between", value1, value2, "monprojectInvestment");
            return (Criteria) this;
        }

        public Criteria andMonprojectContextIsNull() {
            addCriterion("monproject_context is null");
            return (Criteria) this;
        }

        public Criteria andMonprojectContextIsNotNull() {
            addCriterion("monproject_context is not null");
            return (Criteria) this;
        }

        public Criteria andMonprojectContextEqualTo(String value) {
            addCriterion("monproject_context =", value, "monprojectContext");
            return (Criteria) this;
        }

        public Criteria andMonprojectContextNotEqualTo(String value) {
            addCriterion("monproject_context <>", value, "monprojectContext");
            return (Criteria) this;
        }

        public Criteria andMonprojectContextGreaterThan(String value) {
            addCriterion("monproject_context >", value, "monprojectContext");
            return (Criteria) this;
        }

        public Criteria andMonprojectContextGreaterThanOrEqualTo(String value) {
            addCriterion("monproject_context >=", value, "monprojectContext");
            return (Criteria) this;
        }

        public Criteria andMonprojectContextLessThan(String value) {
            addCriterion("monproject_context <", value, "monprojectContext");
            return (Criteria) this;
        }

        public Criteria andMonprojectContextLessThanOrEqualTo(String value) {
            addCriterion("monproject_context <=", value, "monprojectContext");
            return (Criteria) this;
        }

        public Criteria andMonprojectContextLike(String value) {
            addCriterion("monproject_context like", value, "monprojectContext");
            return (Criteria) this;
        }

        public Criteria andMonprojectContextNotLike(String value) {
            addCriterion("monproject_context not like", value, "monprojectContext");
            return (Criteria) this;
        }

        public Criteria andMonprojectContextIn(List<String> values) {
            addCriterion("monproject_context in", values, "monprojectContext");
            return (Criteria) this;
        }

        public Criteria andMonprojectContextNotIn(List<String> values) {
            addCriterion("monproject_context not in", values, "monprojectContext");
            return (Criteria) this;
        }

        public Criteria andMonprojectContextBetween(String value1, String value2) {
            addCriterion("monproject_context between", value1, value2, "monprojectContext");
            return (Criteria) this;
        }

        public Criteria andMonprojectContextNotBetween(String value1, String value2) {
            addCriterion("monproject_context not between", value1, value2, "monprojectContext");
            return (Criteria) this;
        }

        public Criteria andMonprojectDateIsNull() {
            addCriterion("monproject_date is null");
            return (Criteria) this;
        }

        public Criteria andMonprojectDateIsNotNull() {
            addCriterion("monproject_date is not null");
            return (Criteria) this;
        }

        public Criteria andMonprojectDateEqualTo(Date value) {
            addCriterion("monproject_date =", value, "monprojectDate");
            return (Criteria) this;
        }

        public Criteria andMonprojectDateNotEqualTo(Date value) {
            addCriterion("monproject_date <>", value, "monprojectDate");
            return (Criteria) this;
        }

        public Criteria andMonprojectDateGreaterThan(Date value) {
            addCriterion("monproject_date >", value, "monprojectDate");
            return (Criteria) this;
        }

        public Criteria andMonprojectDateGreaterThanOrEqualTo(Date value) {
            addCriterion("monproject_date >=", value, "monprojectDate");
            return (Criteria) this;
        }

        public Criteria andMonprojectDateLessThan(Date value) {
            addCriterion("monproject_date <", value, "monprojectDate");
            return (Criteria) this;
        }

        public Criteria andMonprojectDateLessThanOrEqualTo(Date value) {
            addCriterion("monproject_date <=", value, "monprojectDate");
            return (Criteria) this;
        }

        public Criteria andMonprojectDateIn(List<Date> values) {
            addCriterion("monproject_date in", values, "monprojectDate");
            return (Criteria) this;
        }

        public Criteria andMonprojectDateNotIn(List<Date> values) {
            addCriterion("monproject_date not in", values, "monprojectDate");
            return (Criteria) this;
        }

        public Criteria andMonprojectDateBetween(Date value1, Date value2) {
            addCriterion("monproject_date between", value1, value2, "monprojectDate");
            return (Criteria) this;
        }

        public Criteria andMonprojectDateNotBetween(Date value1, Date value2) {
            addCriterion("monproject_date not between", value1, value2, "monprojectDate");
            return (Criteria) this;
        }

        public Criteria andMonprojectFlowauditUserworkcodeIsNull() {
            addCriterion("monproject_flowaudit_userWorkCode is null");
            return (Criteria) this;
        }

        public Criteria andMonprojectFlowauditUserworkcodeIsNotNull() {
            addCriterion("monproject_flowaudit_userWorkCode is not null");
            return (Criteria) this;
        }

        public Criteria andMonprojectFlowauditUserworkcodeEqualTo(String value) {
            addCriterion("monproject_flowaudit_userWorkCode =", value, "monprojectFlowauditUserworkcode");
            return (Criteria) this;
        }

        public Criteria andMonprojectFlowauditUserworkcodeNotEqualTo(String value) {
            addCriterion("monproject_flowaudit_userWorkCode <>", value, "monprojectFlowauditUserworkcode");
            return (Criteria) this;
        }

        public Criteria andMonprojectFlowauditUserworkcodeGreaterThan(String value) {
            addCriterion("monproject_flowaudit_userWorkCode >", value, "monprojectFlowauditUserworkcode");
            return (Criteria) this;
        }

        public Criteria andMonprojectFlowauditUserworkcodeGreaterThanOrEqualTo(String value) {
            addCriterion("monproject_flowaudit_userWorkCode >=", value, "monprojectFlowauditUserworkcode");
            return (Criteria) this;
        }

        public Criteria andMonprojectFlowauditUserworkcodeLessThan(String value) {
            addCriterion("monproject_flowaudit_userWorkCode <", value, "monprojectFlowauditUserworkcode");
            return (Criteria) this;
        }

        public Criteria andMonprojectFlowauditUserworkcodeLessThanOrEqualTo(String value) {
            addCriterion("monproject_flowaudit_userWorkCode <=", value, "monprojectFlowauditUserworkcode");
            return (Criteria) this;
        }

        public Criteria andMonprojectFlowauditUserworkcodeLike(String value) {
            addCriterion("monproject_flowaudit_userWorkCode like", value, "monprojectFlowauditUserworkcode");
            return (Criteria) this;
        }

        public Criteria andMonprojectFlowauditUserworkcodeNotLike(String value) {
            addCriterion("monproject_flowaudit_userWorkCode not like", value, "monprojectFlowauditUserworkcode");
            return (Criteria) this;
        }

        public Criteria andMonprojectFlowauditUserworkcodeIn(List<String> values) {
            addCriterion("monproject_flowaudit_userWorkCode in", values, "monprojectFlowauditUserworkcode");
            return (Criteria) this;
        }

        public Criteria andMonprojectFlowauditUserworkcodeNotIn(List<String> values) {
            addCriterion("monproject_flowaudit_userWorkCode not in", values, "monprojectFlowauditUserworkcode");
            return (Criteria) this;
        }

        public Criteria andMonprojectFlowauditUserworkcodeBetween(String value1, String value2) {
            addCriterion("monproject_flowaudit_userWorkCode between", value1, value2, "monprojectFlowauditUserworkcode");
            return (Criteria) this;
        }

        public Criteria andMonprojectFlowauditUserworkcodeNotBetween(String value1, String value2) {
            addCriterion("monproject_flowaudit_userWorkCode not between", value1, value2, "monprojectFlowauditUserworkcode");
            return (Criteria) this;
        }

        public Criteria andMonprojectFlowauditUsernameIsNull() {
            addCriterion("monproject_flowaudit_userName is null");
            return (Criteria) this;
        }

        public Criteria andMonprojectFlowauditUsernameIsNotNull() {
            addCriterion("monproject_flowaudit_userName is not null");
            return (Criteria) this;
        }

        public Criteria andMonprojectFlowauditUsernameEqualTo(String value) {
            addCriterion("monproject_flowaudit_userName =", value, "monprojectFlowauditUsername");
            return (Criteria) this;
        }

        public Criteria andMonprojectFlowauditUsernameNotEqualTo(String value) {
            addCriterion("monproject_flowaudit_userName <>", value, "monprojectFlowauditUsername");
            return (Criteria) this;
        }

        public Criteria andMonprojectFlowauditUsernameGreaterThan(String value) {
            addCriterion("monproject_flowaudit_userName >", value, "monprojectFlowauditUsername");
            return (Criteria) this;
        }

        public Criteria andMonprojectFlowauditUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("monproject_flowaudit_userName >=", value, "monprojectFlowauditUsername");
            return (Criteria) this;
        }

        public Criteria andMonprojectFlowauditUsernameLessThan(String value) {
            addCriterion("monproject_flowaudit_userName <", value, "monprojectFlowauditUsername");
            return (Criteria) this;
        }

        public Criteria andMonprojectFlowauditUsernameLessThanOrEqualTo(String value) {
            addCriterion("monproject_flowaudit_userName <=", value, "monprojectFlowauditUsername");
            return (Criteria) this;
        }

        public Criteria andMonprojectFlowauditUsernameLike(String value) {
            addCriterion("monproject_flowaudit_userName like", value, "monprojectFlowauditUsername");
            return (Criteria) this;
        }

        public Criteria andMonprojectFlowauditUsernameNotLike(String value) {
            addCriterion("monproject_flowaudit_userName not like", value, "monprojectFlowauditUsername");
            return (Criteria) this;
        }

        public Criteria andMonprojectFlowauditUsernameIn(List<String> values) {
            addCriterion("monproject_flowaudit_userName in", values, "monprojectFlowauditUsername");
            return (Criteria) this;
        }

        public Criteria andMonprojectFlowauditUsernameNotIn(List<String> values) {
            addCriterion("monproject_flowaudit_userName not in", values, "monprojectFlowauditUsername");
            return (Criteria) this;
        }

        public Criteria andMonprojectFlowauditUsernameBetween(String value1, String value2) {
            addCriterion("monproject_flowaudit_userName between", value1, value2, "monprojectFlowauditUsername");
            return (Criteria) this;
        }

        public Criteria andMonprojectFlowauditUsernameNotBetween(String value1, String value2) {
            addCriterion("monproject_flowaudit_userName not between", value1, value2, "monprojectFlowauditUsername");
            return (Criteria) this;
        }

        public Criteria andMonprojectReportUsernameIsNull() {
            addCriterion("monproject_report_userName is null");
            return (Criteria) this;
        }

        public Criteria andMonprojectReportUsernameIsNotNull() {
            addCriterion("monproject_report_userName is not null");
            return (Criteria) this;
        }

        public Criteria andMonprojectReportUsernameEqualTo(String value) {
            addCriterion("monproject_report_userName =", value, "monprojectReportUsername");
            return (Criteria) this;
        }

        public Criteria andMonprojectReportUsernameNotEqualTo(String value) {
            addCriterion("monproject_report_userName <>", value, "monprojectReportUsername");
            return (Criteria) this;
        }

        public Criteria andMonprojectReportUsernameGreaterThan(String value) {
            addCriterion("monproject_report_userName >", value, "monprojectReportUsername");
            return (Criteria) this;
        }

        public Criteria andMonprojectReportUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("monproject_report_userName >=", value, "monprojectReportUsername");
            return (Criteria) this;
        }

        public Criteria andMonprojectReportUsernameLessThan(String value) {
            addCriterion("monproject_report_userName <", value, "monprojectReportUsername");
            return (Criteria) this;
        }

        public Criteria andMonprojectReportUsernameLessThanOrEqualTo(String value) {
            addCriterion("monproject_report_userName <=", value, "monprojectReportUsername");
            return (Criteria) this;
        }

        public Criteria andMonprojectReportUsernameLike(String value) {
            addCriterion("monproject_report_userName like", value, "monprojectReportUsername");
            return (Criteria) this;
        }

        public Criteria andMonprojectReportUsernameNotLike(String value) {
            addCriterion("monproject_report_userName not like", value, "monprojectReportUsername");
            return (Criteria) this;
        }

        public Criteria andMonprojectReportUsernameIn(List<String> values) {
            addCriterion("monproject_report_userName in", values, "monprojectReportUsername");
            return (Criteria) this;
        }

        public Criteria andMonprojectReportUsernameNotIn(List<String> values) {
            addCriterion("monproject_report_userName not in", values, "monprojectReportUsername");
            return (Criteria) this;
        }

        public Criteria andMonprojectReportUsernameBetween(String value1, String value2) {
            addCriterion("monproject_report_userName between", value1, value2, "monprojectReportUsername");
            return (Criteria) this;
        }

        public Criteria andMonprojectReportUsernameNotBetween(String value1, String value2) {
            addCriterion("monproject_report_userName not between", value1, value2, "monprojectReportUsername");
            return (Criteria) this;
        }

        public Criteria andMonprojectReportUserworkcodeIsNull() {
            addCriterion("monproject_report_userWorkCode is null");
            return (Criteria) this;
        }

        public Criteria andMonprojectReportUserworkcodeIsNotNull() {
            addCriterion("monproject_report_userWorkCode is not null");
            return (Criteria) this;
        }

        public Criteria andMonprojectReportUserworkcodeEqualTo(String value) {
            addCriterion("monproject_report_userWorkCode =", value, "monprojectReportUserworkcode");
            return (Criteria) this;
        }

        public Criteria andMonprojectReportUserworkcodeNotEqualTo(String value) {
            addCriterion("monproject_report_userWorkCode <>", value, "monprojectReportUserworkcode");
            return (Criteria) this;
        }

        public Criteria andMonprojectReportUserworkcodeGreaterThan(String value) {
            addCriterion("monproject_report_userWorkCode >", value, "monprojectReportUserworkcode");
            return (Criteria) this;
        }

        public Criteria andMonprojectReportUserworkcodeGreaterThanOrEqualTo(String value) {
            addCriterion("monproject_report_userWorkCode >=", value, "monprojectReportUserworkcode");
            return (Criteria) this;
        }

        public Criteria andMonprojectReportUserworkcodeLessThan(String value) {
            addCriterion("monproject_report_userWorkCode <", value, "monprojectReportUserworkcode");
            return (Criteria) this;
        }

        public Criteria andMonprojectReportUserworkcodeLessThanOrEqualTo(String value) {
            addCriterion("monproject_report_userWorkCode <=", value, "monprojectReportUserworkcode");
            return (Criteria) this;
        }

        public Criteria andMonprojectReportUserworkcodeLike(String value) {
            addCriterion("monproject_report_userWorkCode like", value, "monprojectReportUserworkcode");
            return (Criteria) this;
        }

        public Criteria andMonprojectReportUserworkcodeNotLike(String value) {
            addCriterion("monproject_report_userWorkCode not like", value, "monprojectReportUserworkcode");
            return (Criteria) this;
        }

        public Criteria andMonprojectReportUserworkcodeIn(List<String> values) {
            addCriterion("monproject_report_userWorkCode in", values, "monprojectReportUserworkcode");
            return (Criteria) this;
        }

        public Criteria andMonprojectReportUserworkcodeNotIn(List<String> values) {
            addCriterion("monproject_report_userWorkCode not in", values, "monprojectReportUserworkcode");
            return (Criteria) this;
        }

        public Criteria andMonprojectReportUserworkcodeBetween(String value1, String value2) {
            addCriterion("monproject_report_userWorkCode between", value1, value2, "monprojectReportUserworkcode");
            return (Criteria) this;
        }

        public Criteria andMonprojectReportUserworkcodeNotBetween(String value1, String value2) {
            addCriterion("monproject_report_userWorkCode not between", value1, value2, "monprojectReportUserworkcode");
            return (Criteria) this;
        }

        public Criteria andMonprojectIsuseIsNull() {
            addCriterion("monproject_isUse is null");
            return (Criteria) this;
        }

        public Criteria andMonprojectIsuseIsNotNull() {
            addCriterion("monproject_isUse is not null");
            return (Criteria) this;
        }

        public Criteria andMonprojectIsuseEqualTo(Integer value) {
            addCriterion("monproject_isUse =", value, "monprojectIsuse");
            return (Criteria) this;
        }

        public Criteria andMonprojectIsuseNotEqualTo(Integer value) {
            addCriterion("monproject_isUse <>", value, "monprojectIsuse");
            return (Criteria) this;
        }

        public Criteria andMonprojectIsuseGreaterThan(Integer value) {
            addCriterion("monproject_isUse >", value, "monprojectIsuse");
            return (Criteria) this;
        }

        public Criteria andMonprojectIsuseGreaterThanOrEqualTo(Integer value) {
            addCriterion("monproject_isUse >=", value, "monprojectIsuse");
            return (Criteria) this;
        }

        public Criteria andMonprojectIsuseLessThan(Integer value) {
            addCriterion("monproject_isUse <", value, "monprojectIsuse");
            return (Criteria) this;
        }

        public Criteria andMonprojectIsuseLessThanOrEqualTo(Integer value) {
            addCriterion("monproject_isUse <=", value, "monprojectIsuse");
            return (Criteria) this;
        }

        public Criteria andMonprojectIsuseIn(List<Integer> values) {
            addCriterion("monproject_isUse in", values, "monprojectIsuse");
            return (Criteria) this;
        }

        public Criteria andMonprojectIsuseNotIn(List<Integer> values) {
            addCriterion("monproject_isUse not in", values, "monprojectIsuse");
            return (Criteria) this;
        }

        public Criteria andMonprojectIsuseBetween(Integer value1, Integer value2) {
            addCriterion("monproject_isUse between", value1, value2, "monprojectIsuse");
            return (Criteria) this;
        }

        public Criteria andMonprojectIsuseNotBetween(Integer value1, Integer value2) {
            addCriterion("monproject_isUse not between", value1, value2, "monprojectIsuse");
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

        public Criteria andStatusEqualTo(String value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(String value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(String value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(String value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(String value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(String value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLike(String value) {
            addCriterion("status like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotLike(String value) {
            addCriterion("status not like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<String> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<String> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(String value1, String value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(String value1, String value2) {
            addCriterion("status not between", value1, value2, "status");
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