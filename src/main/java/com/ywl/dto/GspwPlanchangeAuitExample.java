package com.ywl.dto;

import java.util.ArrayList;
import java.util.List;

public class GspwPlanchangeAuitExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public GspwPlanchangeAuitExample() {
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

        public Criteria andPlanchangeauidIdIsNull() {
            addCriterion("planChangeAuid_id is null");
            return (Criteria) this;
        }

        public Criteria andPlanchangeauidIdIsNotNull() {
            addCriterion("planChangeAuid_id is not null");
            return (Criteria) this;
        }

        public Criteria andPlanchangeauidIdEqualTo(Integer value) {
            addCriterion("planChangeAuid_id =", value, "planchangeauidId");
            return (Criteria) this;
        }

        public Criteria andPlanchangeauidIdNotEqualTo(Integer value) {
            addCriterion("planChangeAuid_id <>", value, "planchangeauidId");
            return (Criteria) this;
        }

        public Criteria andPlanchangeauidIdGreaterThan(Integer value) {
            addCriterion("planChangeAuid_id >", value, "planchangeauidId");
            return (Criteria) this;
        }

        public Criteria andPlanchangeauidIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("planChangeAuid_id >=", value, "planchangeauidId");
            return (Criteria) this;
        }

        public Criteria andPlanchangeauidIdLessThan(Integer value) {
            addCriterion("planChangeAuid_id <", value, "planchangeauidId");
            return (Criteria) this;
        }

        public Criteria andPlanchangeauidIdLessThanOrEqualTo(Integer value) {
            addCriterion("planChangeAuid_id <=", value, "planchangeauidId");
            return (Criteria) this;
        }

        public Criteria andPlanchangeauidIdIn(List<Integer> values) {
            addCriterion("planChangeAuid_id in", values, "planchangeauidId");
            return (Criteria) this;
        }

        public Criteria andPlanchangeauidIdNotIn(List<Integer> values) {
            addCriterion("planChangeAuid_id not in", values, "planchangeauidId");
            return (Criteria) this;
        }

        public Criteria andPlanchangeauidIdBetween(Integer value1, Integer value2) {
            addCriterion("planChangeAuid_id between", value1, value2, "planchangeauidId");
            return (Criteria) this;
        }

        public Criteria andPlanchangeauidIdNotBetween(Integer value1, Integer value2) {
            addCriterion("planChangeAuid_id not between", value1, value2, "planchangeauidId");
            return (Criteria) this;
        }

        public Criteria andContentIdIsNull() {
            addCriterion("content_id is null");
            return (Criteria) this;
        }

        public Criteria andContentIdIsNotNull() {
            addCriterion("content_id is not null");
            return (Criteria) this;
        }

        public Criteria andContentIdEqualTo(String value) {
            addCriterion("content_id =", value, "contentId");
            return (Criteria) this;
        }

        public Criteria andContentIdNotEqualTo(String value) {
            addCriterion("content_id <>", value, "contentId");
            return (Criteria) this;
        }

        public Criteria andContentIdGreaterThan(String value) {
            addCriterion("content_id >", value, "contentId");
            return (Criteria) this;
        }

        public Criteria andContentIdGreaterThanOrEqualTo(String value) {
            addCriterion("content_id >=", value, "contentId");
            return (Criteria) this;
        }

        public Criteria andContentIdLessThan(String value) {
            addCriterion("content_id <", value, "contentId");
            return (Criteria) this;
        }

        public Criteria andContentIdLessThanOrEqualTo(String value) {
            addCriterion("content_id <=", value, "contentId");
            return (Criteria) this;
        }

        public Criteria andContentIdLike(String value) {
            addCriterion("content_id like", value, "contentId");
            return (Criteria) this;
        }

        public Criteria andContentIdNotLike(String value) {
            addCriterion("content_id not like", value, "contentId");
            return (Criteria) this;
        }

        public Criteria andContentIdIn(List<String> values) {
            addCriterion("content_id in", values, "contentId");
            return (Criteria) this;
        }

        public Criteria andContentIdNotIn(List<String> values) {
            addCriterion("content_id not in", values, "contentId");
            return (Criteria) this;
        }

        public Criteria andContentIdBetween(String value1, String value2) {
            addCriterion("content_id between", value1, value2, "contentId");
            return (Criteria) this;
        }

        public Criteria andContentIdNotBetween(String value1, String value2) {
            addCriterion("content_id not between", value1, value2, "contentId");
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

        public Criteria andAuditUsernameIsNull() {
            addCriterion("audit_username is null");
            return (Criteria) this;
        }

        public Criteria andAuditUsernameIsNotNull() {
            addCriterion("audit_username is not null");
            return (Criteria) this;
        }

        public Criteria andAuditUsernameEqualTo(String value) {
            addCriterion("audit_username =", value, "auditUsername");
            return (Criteria) this;
        }

        public Criteria andAuditUsernameNotEqualTo(String value) {
            addCriterion("audit_username <>", value, "auditUsername");
            return (Criteria) this;
        }

        public Criteria andAuditUsernameGreaterThan(String value) {
            addCriterion("audit_username >", value, "auditUsername");
            return (Criteria) this;
        }

        public Criteria andAuditUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("audit_username >=", value, "auditUsername");
            return (Criteria) this;
        }

        public Criteria andAuditUsernameLessThan(String value) {
            addCriterion("audit_username <", value, "auditUsername");
            return (Criteria) this;
        }

        public Criteria andAuditUsernameLessThanOrEqualTo(String value) {
            addCriterion("audit_username <=", value, "auditUsername");
            return (Criteria) this;
        }

        public Criteria andAuditUsernameLike(String value) {
            addCriterion("audit_username like", value, "auditUsername");
            return (Criteria) this;
        }

        public Criteria andAuditUsernameNotLike(String value) {
            addCriterion("audit_username not like", value, "auditUsername");
            return (Criteria) this;
        }

        public Criteria andAuditUsernameIn(List<String> values) {
            addCriterion("audit_username in", values, "auditUsername");
            return (Criteria) this;
        }

        public Criteria andAuditUsernameNotIn(List<String> values) {
            addCriterion("audit_username not in", values, "auditUsername");
            return (Criteria) this;
        }

        public Criteria andAuditUsernameBetween(String value1, String value2) {
            addCriterion("audit_username between", value1, value2, "auditUsername");
            return (Criteria) this;
        }

        public Criteria andAuditUsernameNotBetween(String value1, String value2) {
            addCriterion("audit_username not between", value1, value2, "auditUsername");
            return (Criteria) this;
        }

        public Criteria andAuditWorknumIsNull() {
            addCriterion("audit_worknum is null");
            return (Criteria) this;
        }

        public Criteria andAuditWorknumIsNotNull() {
            addCriterion("audit_worknum is not null");
            return (Criteria) this;
        }

        public Criteria andAuditWorknumEqualTo(String value) {
            addCriterion("audit_worknum =", value, "auditWorknum");
            return (Criteria) this;
        }

        public Criteria andAuditWorknumNotEqualTo(String value) {
            addCriterion("audit_worknum <>", value, "auditWorknum");
            return (Criteria) this;
        }

        public Criteria andAuditWorknumGreaterThan(String value) {
            addCriterion("audit_worknum >", value, "auditWorknum");
            return (Criteria) this;
        }

        public Criteria andAuditWorknumGreaterThanOrEqualTo(String value) {
            addCriterion("audit_worknum >=", value, "auditWorknum");
            return (Criteria) this;
        }

        public Criteria andAuditWorknumLessThan(String value) {
            addCriterion("audit_worknum <", value, "auditWorknum");
            return (Criteria) this;
        }

        public Criteria andAuditWorknumLessThanOrEqualTo(String value) {
            addCriterion("audit_worknum <=", value, "auditWorknum");
            return (Criteria) this;
        }

        public Criteria andAuditWorknumLike(String value) {
            addCriterion("audit_worknum like", value, "auditWorknum");
            return (Criteria) this;
        }

        public Criteria andAuditWorknumNotLike(String value) {
            addCriterion("audit_worknum not like", value, "auditWorknum");
            return (Criteria) this;
        }

        public Criteria andAuditWorknumIn(List<String> values) {
            addCriterion("audit_worknum in", values, "auditWorknum");
            return (Criteria) this;
        }

        public Criteria andAuditWorknumNotIn(List<String> values) {
            addCriterion("audit_worknum not in", values, "auditWorknum");
            return (Criteria) this;
        }

        public Criteria andAuditWorknumBetween(String value1, String value2) {
            addCriterion("audit_worknum between", value1, value2, "auditWorknum");
            return (Criteria) this;
        }

        public Criteria andAuditWorknumNotBetween(String value1, String value2) {
            addCriterion("audit_worknum not between", value1, value2, "auditWorknum");
            return (Criteria) this;
        }

        public Criteria andAuditResultIsNull() {
            addCriterion("audit_result is null");
            return (Criteria) this;
        }

        public Criteria andAuditResultIsNotNull() {
            addCriterion("audit_result is not null");
            return (Criteria) this;
        }

        public Criteria andAuditResultEqualTo(String value) {
            addCriterion("audit_result =", value, "auditResult");
            return (Criteria) this;
        }

        public Criteria andAuditResultNotEqualTo(String value) {
            addCriterion("audit_result <>", value, "auditResult");
            return (Criteria) this;
        }

        public Criteria andAuditResultGreaterThan(String value) {
            addCriterion("audit_result >", value, "auditResult");
            return (Criteria) this;
        }

        public Criteria andAuditResultGreaterThanOrEqualTo(String value) {
            addCriterion("audit_result >=", value, "auditResult");
            return (Criteria) this;
        }

        public Criteria andAuditResultLessThan(String value) {
            addCriterion("audit_result <", value, "auditResult");
            return (Criteria) this;
        }

        public Criteria andAuditResultLessThanOrEqualTo(String value) {
            addCriterion("audit_result <=", value, "auditResult");
            return (Criteria) this;
        }

        public Criteria andAuditResultLike(String value) {
            addCriterion("audit_result like", value, "auditResult");
            return (Criteria) this;
        }

        public Criteria andAuditResultNotLike(String value) {
            addCriterion("audit_result not like", value, "auditResult");
            return (Criteria) this;
        }

        public Criteria andAuditResultIn(List<String> values) {
            addCriterion("audit_result in", values, "auditResult");
            return (Criteria) this;
        }

        public Criteria andAuditResultNotIn(List<String> values) {
            addCriterion("audit_result not in", values, "auditResult");
            return (Criteria) this;
        }

        public Criteria andAuditResultBetween(String value1, String value2) {
            addCriterion("audit_result between", value1, value2, "auditResult");
            return (Criteria) this;
        }

        public Criteria andAuditResultNotBetween(String value1, String value2) {
            addCriterion("audit_result not between", value1, value2, "auditResult");
            return (Criteria) this;
        }

        public Criteria andAuditContextIsNull() {
            addCriterion("audit_context is null");
            return (Criteria) this;
        }

        public Criteria andAuditContextIsNotNull() {
            addCriterion("audit_context is not null");
            return (Criteria) this;
        }

        public Criteria andAuditContextEqualTo(String value) {
            addCriterion("audit_context =", value, "auditContext");
            return (Criteria) this;
        }

        public Criteria andAuditContextNotEqualTo(String value) {
            addCriterion("audit_context <>", value, "auditContext");
            return (Criteria) this;
        }

        public Criteria andAuditContextGreaterThan(String value) {
            addCriterion("audit_context >", value, "auditContext");
            return (Criteria) this;
        }

        public Criteria andAuditContextGreaterThanOrEqualTo(String value) {
            addCriterion("audit_context >=", value, "auditContext");
            return (Criteria) this;
        }

        public Criteria andAuditContextLessThan(String value) {
            addCriterion("audit_context <", value, "auditContext");
            return (Criteria) this;
        }

        public Criteria andAuditContextLessThanOrEqualTo(String value) {
            addCriterion("audit_context <=", value, "auditContext");
            return (Criteria) this;
        }

        public Criteria andAuditContextLike(String value) {
            addCriterion("audit_context like", value, "auditContext");
            return (Criteria) this;
        }

        public Criteria andAuditContextNotLike(String value) {
            addCriterion("audit_context not like", value, "auditContext");
            return (Criteria) this;
        }

        public Criteria andAuditContextIn(List<String> values) {
            addCriterion("audit_context in", values, "auditContext");
            return (Criteria) this;
        }

        public Criteria andAuditContextNotIn(List<String> values) {
            addCriterion("audit_context not in", values, "auditContext");
            return (Criteria) this;
        }

        public Criteria andAuditContextBetween(String value1, String value2) {
            addCriterion("audit_context between", value1, value2, "auditContext");
            return (Criteria) this;
        }

        public Criteria andAuditContextNotBetween(String value1, String value2) {
            addCriterion("audit_context not between", value1, value2, "auditContext");
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

        public Criteria andAuditManagernameIsNull() {
            addCriterion("audit_managername is null");
            return (Criteria) this;
        }

        public Criteria andAuditManagernameIsNotNull() {
            addCriterion("audit_managername is not null");
            return (Criteria) this;
        }

        public Criteria andAuditManagernameEqualTo(String value) {
            addCriterion("audit_managername =", value, "auditManagername");
            return (Criteria) this;
        }

        public Criteria andAuditManagernameNotEqualTo(String value) {
            addCriterion("audit_managername <>", value, "auditManagername");
            return (Criteria) this;
        }

        public Criteria andAuditManagernameGreaterThan(String value) {
            addCriterion("audit_managername >", value, "auditManagername");
            return (Criteria) this;
        }

        public Criteria andAuditManagernameGreaterThanOrEqualTo(String value) {
            addCriterion("audit_managername >=", value, "auditManagername");
            return (Criteria) this;
        }

        public Criteria andAuditManagernameLessThan(String value) {
            addCriterion("audit_managername <", value, "auditManagername");
            return (Criteria) this;
        }

        public Criteria andAuditManagernameLessThanOrEqualTo(String value) {
            addCriterion("audit_managername <=", value, "auditManagername");
            return (Criteria) this;
        }

        public Criteria andAuditManagernameLike(String value) {
            addCriterion("audit_managername like", value, "auditManagername");
            return (Criteria) this;
        }

        public Criteria andAuditManagernameNotLike(String value) {
            addCriterion("audit_managername not like", value, "auditManagername");
            return (Criteria) this;
        }

        public Criteria andAuditManagernameIn(List<String> values) {
            addCriterion("audit_managername in", values, "auditManagername");
            return (Criteria) this;
        }

        public Criteria andAuditManagernameNotIn(List<String> values) {
            addCriterion("audit_managername not in", values, "auditManagername");
            return (Criteria) this;
        }

        public Criteria andAuditManagernameBetween(String value1, String value2) {
            addCriterion("audit_managername between", value1, value2, "auditManagername");
            return (Criteria) this;
        }

        public Criteria andAuditManagernameNotBetween(String value1, String value2) {
            addCriterion("audit_managername not between", value1, value2, "auditManagername");
            return (Criteria) this;
        }

        public Criteria andAuditManagerworknumIsNull() {
            addCriterion("audit_managerworknum is null");
            return (Criteria) this;
        }

        public Criteria andAuditManagerworknumIsNotNull() {
            addCriterion("audit_managerworknum is not null");
            return (Criteria) this;
        }

        public Criteria andAuditManagerworknumEqualTo(String value) {
            addCriterion("audit_managerworknum =", value, "auditManagerworknum");
            return (Criteria) this;
        }

        public Criteria andAuditManagerworknumNotEqualTo(String value) {
            addCriterion("audit_managerworknum <>", value, "auditManagerworknum");
            return (Criteria) this;
        }

        public Criteria andAuditManagerworknumGreaterThan(String value) {
            addCriterion("audit_managerworknum >", value, "auditManagerworknum");
            return (Criteria) this;
        }

        public Criteria andAuditManagerworknumGreaterThanOrEqualTo(String value) {
            addCriterion("audit_managerworknum >=", value, "auditManagerworknum");
            return (Criteria) this;
        }

        public Criteria andAuditManagerworknumLessThan(String value) {
            addCriterion("audit_managerworknum <", value, "auditManagerworknum");
            return (Criteria) this;
        }

        public Criteria andAuditManagerworknumLessThanOrEqualTo(String value) {
            addCriterion("audit_managerworknum <=", value, "auditManagerworknum");
            return (Criteria) this;
        }

        public Criteria andAuditManagerworknumLike(String value) {
            addCriterion("audit_managerworknum like", value, "auditManagerworknum");
            return (Criteria) this;
        }

        public Criteria andAuditManagerworknumNotLike(String value) {
            addCriterion("audit_managerworknum not like", value, "auditManagerworknum");
            return (Criteria) this;
        }

        public Criteria andAuditManagerworknumIn(List<String> values) {
            addCriterion("audit_managerworknum in", values, "auditManagerworknum");
            return (Criteria) this;
        }

        public Criteria andAuditManagerworknumNotIn(List<String> values) {
            addCriterion("audit_managerworknum not in", values, "auditManagerworknum");
            return (Criteria) this;
        }

        public Criteria andAuditManagerworknumBetween(String value1, String value2) {
            addCriterion("audit_managerworknum between", value1, value2, "auditManagerworknum");
            return (Criteria) this;
        }

        public Criteria andAuditManagerworknumNotBetween(String value1, String value2) {
            addCriterion("audit_managerworknum not between", value1, value2, "auditManagerworknum");
            return (Criteria) this;
        }

        public Criteria andAuditManagerResultIsNull() {
            addCriterion("audit_manager_result is null");
            return (Criteria) this;
        }

        public Criteria andAuditManagerResultIsNotNull() {
            addCriterion("audit_manager_result is not null");
            return (Criteria) this;
        }

        public Criteria andAuditManagerResultEqualTo(String value) {
            addCriterion("audit_manager_result =", value, "auditManagerResult");
            return (Criteria) this;
        }

        public Criteria andAuditManagerResultNotEqualTo(String value) {
            addCriterion("audit_manager_result <>", value, "auditManagerResult");
            return (Criteria) this;
        }

        public Criteria andAuditManagerResultGreaterThan(String value) {
            addCriterion("audit_manager_result >", value, "auditManagerResult");
            return (Criteria) this;
        }

        public Criteria andAuditManagerResultGreaterThanOrEqualTo(String value) {
            addCriterion("audit_manager_result >=", value, "auditManagerResult");
            return (Criteria) this;
        }

        public Criteria andAuditManagerResultLessThan(String value) {
            addCriterion("audit_manager_result <", value, "auditManagerResult");
            return (Criteria) this;
        }

        public Criteria andAuditManagerResultLessThanOrEqualTo(String value) {
            addCriterion("audit_manager_result <=", value, "auditManagerResult");
            return (Criteria) this;
        }

        public Criteria andAuditManagerResultLike(String value) {
            addCriterion("audit_manager_result like", value, "auditManagerResult");
            return (Criteria) this;
        }

        public Criteria andAuditManagerResultNotLike(String value) {
            addCriterion("audit_manager_result not like", value, "auditManagerResult");
            return (Criteria) this;
        }

        public Criteria andAuditManagerResultIn(List<String> values) {
            addCriterion("audit_manager_result in", values, "auditManagerResult");
            return (Criteria) this;
        }

        public Criteria andAuditManagerResultNotIn(List<String> values) {
            addCriterion("audit_manager_result not in", values, "auditManagerResult");
            return (Criteria) this;
        }

        public Criteria andAuditManagerResultBetween(String value1, String value2) {
            addCriterion("audit_manager_result between", value1, value2, "auditManagerResult");
            return (Criteria) this;
        }

        public Criteria andAuditManagerResultNotBetween(String value1, String value2) {
            addCriterion("audit_manager_result not between", value1, value2, "auditManagerResult");
            return (Criteria) this;
        }

        public Criteria andAuditManagerContextIsNull() {
            addCriterion("audit_manager_context is null");
            return (Criteria) this;
        }

        public Criteria andAuditManagerContextIsNotNull() {
            addCriterion("audit_manager_context is not null");
            return (Criteria) this;
        }

        public Criteria andAuditManagerContextEqualTo(String value) {
            addCriterion("audit_manager_context =", value, "auditManagerContext");
            return (Criteria) this;
        }

        public Criteria andAuditManagerContextNotEqualTo(String value) {
            addCriterion("audit_manager_context <>", value, "auditManagerContext");
            return (Criteria) this;
        }

        public Criteria andAuditManagerContextGreaterThan(String value) {
            addCriterion("audit_manager_context >", value, "auditManagerContext");
            return (Criteria) this;
        }

        public Criteria andAuditManagerContextGreaterThanOrEqualTo(String value) {
            addCriterion("audit_manager_context >=", value, "auditManagerContext");
            return (Criteria) this;
        }

        public Criteria andAuditManagerContextLessThan(String value) {
            addCriterion("audit_manager_context <", value, "auditManagerContext");
            return (Criteria) this;
        }

        public Criteria andAuditManagerContextLessThanOrEqualTo(String value) {
            addCriterion("audit_manager_context <=", value, "auditManagerContext");
            return (Criteria) this;
        }

        public Criteria andAuditManagerContextLike(String value) {
            addCriterion("audit_manager_context like", value, "auditManagerContext");
            return (Criteria) this;
        }

        public Criteria andAuditManagerContextNotLike(String value) {
            addCriterion("audit_manager_context not like", value, "auditManagerContext");
            return (Criteria) this;
        }

        public Criteria andAuditManagerContextIn(List<String> values) {
            addCriterion("audit_manager_context in", values, "auditManagerContext");
            return (Criteria) this;
        }

        public Criteria andAuditManagerContextNotIn(List<String> values) {
            addCriterion("audit_manager_context not in", values, "auditManagerContext");
            return (Criteria) this;
        }

        public Criteria andAuditManagerContextBetween(String value1, String value2) {
            addCriterion("audit_manager_context between", value1, value2, "auditManagerContext");
            return (Criteria) this;
        }

        public Criteria andAuditManagerContextNotBetween(String value1, String value2) {
            addCriterion("audit_manager_context not between", value1, value2, "auditManagerContext");
            return (Criteria) this;
        }

        public Criteria andReportTimeIsNull() {
            addCriterion("report_time is null");
            return (Criteria) this;
        }

        public Criteria andReportTimeIsNotNull() {
            addCriterion("report_time is not null");
            return (Criteria) this;
        }

        public Criteria andReportTimeEqualTo(String value) {
            addCriterion("report_time =", value, "reportTime");
            return (Criteria) this;
        }

        public Criteria andReportTimeNotEqualTo(String value) {
            addCriterion("report_time <>", value, "reportTime");
            return (Criteria) this;
        }

        public Criteria andReportTimeGreaterThan(String value) {
            addCriterion("report_time >", value, "reportTime");
            return (Criteria) this;
        }

        public Criteria andReportTimeGreaterThanOrEqualTo(String value) {
            addCriterion("report_time >=", value, "reportTime");
            return (Criteria) this;
        }

        public Criteria andReportTimeLessThan(String value) {
            addCriterion("report_time <", value, "reportTime");
            return (Criteria) this;
        }

        public Criteria andReportTimeLessThanOrEqualTo(String value) {
            addCriterion("report_time <=", value, "reportTime");
            return (Criteria) this;
        }

        public Criteria andReportTimeLike(String value) {
            addCriterion("report_time like", value, "reportTime");
            return (Criteria) this;
        }

        public Criteria andReportTimeNotLike(String value) {
            addCriterion("report_time not like", value, "reportTime");
            return (Criteria) this;
        }

        public Criteria andReportTimeIn(List<String> values) {
            addCriterion("report_time in", values, "reportTime");
            return (Criteria) this;
        }

        public Criteria andReportTimeNotIn(List<String> values) {
            addCriterion("report_time not in", values, "reportTime");
            return (Criteria) this;
        }

        public Criteria andReportTimeBetween(String value1, String value2) {
            addCriterion("report_time between", value1, value2, "reportTime");
            return (Criteria) this;
        }

        public Criteria andReportTimeNotBetween(String value1, String value2) {
            addCriterion("report_time not between", value1, value2, "reportTime");
            return (Criteria) this;
        }

        public Criteria andAuditTimeIsNull() {
            addCriterion("audit_time is null");
            return (Criteria) this;
        }

        public Criteria andAuditTimeIsNotNull() {
            addCriterion("audit_time is not null");
            return (Criteria) this;
        }

        public Criteria andAuditTimeEqualTo(String value) {
            addCriterion("audit_time =", value, "auditTime");
            return (Criteria) this;
        }

        public Criteria andAuditTimeNotEqualTo(String value) {
            addCriterion("audit_time <>", value, "auditTime");
            return (Criteria) this;
        }

        public Criteria andAuditTimeGreaterThan(String value) {
            addCriterion("audit_time >", value, "auditTime");
            return (Criteria) this;
        }

        public Criteria andAuditTimeGreaterThanOrEqualTo(String value) {
            addCriterion("audit_time >=", value, "auditTime");
            return (Criteria) this;
        }

        public Criteria andAuditTimeLessThan(String value) {
            addCriterion("audit_time <", value, "auditTime");
            return (Criteria) this;
        }

        public Criteria andAuditTimeLessThanOrEqualTo(String value) {
            addCriterion("audit_time <=", value, "auditTime");
            return (Criteria) this;
        }

        public Criteria andAuditTimeLike(String value) {
            addCriterion("audit_time like", value, "auditTime");
            return (Criteria) this;
        }

        public Criteria andAuditTimeNotLike(String value) {
            addCriterion("audit_time not like", value, "auditTime");
            return (Criteria) this;
        }

        public Criteria andAuditTimeIn(List<String> values) {
            addCriterion("audit_time in", values, "auditTime");
            return (Criteria) this;
        }

        public Criteria andAuditTimeNotIn(List<String> values) {
            addCriterion("audit_time not in", values, "auditTime");
            return (Criteria) this;
        }

        public Criteria andAuditTimeBetween(String value1, String value2) {
            addCriterion("audit_time between", value1, value2, "auditTime");
            return (Criteria) this;
        }

        public Criteria andAuditTimeNotBetween(String value1, String value2) {
            addCriterion("audit_time not between", value1, value2, "auditTime");
            return (Criteria) this;
        }

        public Criteria andManagerAuditTimeIsNull() {
            addCriterion("manager_audit_time is null");
            return (Criteria) this;
        }

        public Criteria andManagerAuditTimeIsNotNull() {
            addCriterion("manager_audit_time is not null");
            return (Criteria) this;
        }

        public Criteria andManagerAuditTimeEqualTo(String value) {
            addCriterion("manager_audit_time =", value, "managerAuditTime");
            return (Criteria) this;
        }

        public Criteria andManagerAuditTimeNotEqualTo(String value) {
            addCriterion("manager_audit_time <>", value, "managerAuditTime");
            return (Criteria) this;
        }

        public Criteria andManagerAuditTimeGreaterThan(String value) {
            addCriterion("manager_audit_time >", value, "managerAuditTime");
            return (Criteria) this;
        }

        public Criteria andManagerAuditTimeGreaterThanOrEqualTo(String value) {
            addCriterion("manager_audit_time >=", value, "managerAuditTime");
            return (Criteria) this;
        }

        public Criteria andManagerAuditTimeLessThan(String value) {
            addCriterion("manager_audit_time <", value, "managerAuditTime");
            return (Criteria) this;
        }

        public Criteria andManagerAuditTimeLessThanOrEqualTo(String value) {
            addCriterion("manager_audit_time <=", value, "managerAuditTime");
            return (Criteria) this;
        }

        public Criteria andManagerAuditTimeLike(String value) {
            addCriterion("manager_audit_time like", value, "managerAuditTime");
            return (Criteria) this;
        }

        public Criteria andManagerAuditTimeNotLike(String value) {
            addCriterion("manager_audit_time not like", value, "managerAuditTime");
            return (Criteria) this;
        }

        public Criteria andManagerAuditTimeIn(List<String> values) {
            addCriterion("manager_audit_time in", values, "managerAuditTime");
            return (Criteria) this;
        }

        public Criteria andManagerAuditTimeNotIn(List<String> values) {
            addCriterion("manager_audit_time not in", values, "managerAuditTime");
            return (Criteria) this;
        }

        public Criteria andManagerAuditTimeBetween(String value1, String value2) {
            addCriterion("manager_audit_time between", value1, value2, "managerAuditTime");
            return (Criteria) this;
        }

        public Criteria andManagerAuditTimeNotBetween(String value1, String value2) {
            addCriterion("manager_audit_time not between", value1, value2, "managerAuditTime");
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