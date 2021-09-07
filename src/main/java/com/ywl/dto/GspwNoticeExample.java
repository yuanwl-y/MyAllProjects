package com.ywl.dto;

import java.util.ArrayList;
import java.util.List;

public class GspwNoticeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public GspwNoticeExample() {
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

        public Criteria andFilePathIsNull() {
            addCriterion("file_path is null");
            return (Criteria) this;
        }

        public Criteria andFilePathIsNotNull() {
            addCriterion("file_path is not null");
            return (Criteria) this;
        }

        public Criteria andFilePathEqualTo(String value) {
            addCriterion("file_path =", value, "filePath");
            return (Criteria) this;
        }

        public Criteria andFilePathNotEqualTo(String value) {
            addCriterion("file_path <>", value, "filePath");
            return (Criteria) this;
        }

        public Criteria andFilePathGreaterThan(String value) {
            addCriterion("file_path >", value, "filePath");
            return (Criteria) this;
        }

        public Criteria andFilePathGreaterThanOrEqualTo(String value) {
            addCriterion("file_path >=", value, "filePath");
            return (Criteria) this;
        }

        public Criteria andFilePathLessThan(String value) {
            addCriterion("file_path <", value, "filePath");
            return (Criteria) this;
        }

        public Criteria andFilePathLessThanOrEqualTo(String value) {
            addCriterion("file_path <=", value, "filePath");
            return (Criteria) this;
        }

        public Criteria andFilePathLike(String value) {
            addCriterion("file_path like", value, "filePath");
            return (Criteria) this;
        }

        public Criteria andFilePathNotLike(String value) {
            addCriterion("file_path not like", value, "filePath");
            return (Criteria) this;
        }

        public Criteria andFilePathIn(List<String> values) {
            addCriterion("file_path in", values, "filePath");
            return (Criteria) this;
        }

        public Criteria andFilePathNotIn(List<String> values) {
            addCriterion("file_path not in", values, "filePath");
            return (Criteria) this;
        }

        public Criteria andFilePathBetween(String value1, String value2) {
            addCriterion("file_path between", value1, value2, "filePath");
            return (Criteria) this;
        }

        public Criteria andFilePathNotBetween(String value1, String value2) {
            addCriterion("file_path not between", value1, value2, "filePath");
            return (Criteria) this;
        }

        public Criteria andIsCaseIsNull() {
            addCriterion("is_case is null");
            return (Criteria) this;
        }

        public Criteria andIsCaseIsNotNull() {
            addCriterion("is_case is not null");
            return (Criteria) this;
        }

        public Criteria andIsCaseEqualTo(Integer value) {
            addCriterion("is_case =", value, "isCase");
            return (Criteria) this;
        }

        public Criteria andIsCaseNotEqualTo(Integer value) {
            addCriterion("is_case <>", value, "isCase");
            return (Criteria) this;
        }

        public Criteria andIsCaseGreaterThan(Integer value) {
            addCriterion("is_case >", value, "isCase");
            return (Criteria) this;
        }

        public Criteria andIsCaseGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_case >=", value, "isCase");
            return (Criteria) this;
        }

        public Criteria andIsCaseLessThan(Integer value) {
            addCriterion("is_case <", value, "isCase");
            return (Criteria) this;
        }

        public Criteria andIsCaseLessThanOrEqualTo(Integer value) {
            addCriterion("is_case <=", value, "isCase");
            return (Criteria) this;
        }

        public Criteria andIsCaseIn(List<Integer> values) {
            addCriterion("is_case in", values, "isCase");
            return (Criteria) this;
        }

        public Criteria andIsCaseNotIn(List<Integer> values) {
            addCriterion("is_case not in", values, "isCase");
            return (Criteria) this;
        }

        public Criteria andIsCaseBetween(Integer value1, Integer value2) {
            addCriterion("is_case between", value1, value2, "isCase");
            return (Criteria) this;
        }

        public Criteria andIsCaseNotBetween(Integer value1, Integer value2) {
            addCriterion("is_case not between", value1, value2, "isCase");
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

        public Criteria andUserOrgCodeIsNull() {
            addCriterion("user_org_code is null");
            return (Criteria) this;
        }

        public Criteria andUserOrgCodeIsNotNull() {
            addCriterion("user_org_code is not null");
            return (Criteria) this;
        }

        public Criteria andUserOrgCodeEqualTo(String value) {
            addCriterion("user_org_code =", value, "userOrgCode");
            return (Criteria) this;
        }

        public Criteria andUserOrgCodeNotEqualTo(String value) {
            addCriterion("user_org_code <>", value, "userOrgCode");
            return (Criteria) this;
        }

        public Criteria andUserOrgCodeGreaterThan(String value) {
            addCriterion("user_org_code >", value, "userOrgCode");
            return (Criteria) this;
        }

        public Criteria andUserOrgCodeGreaterThanOrEqualTo(String value) {
            addCriterion("user_org_code >=", value, "userOrgCode");
            return (Criteria) this;
        }

        public Criteria andUserOrgCodeLessThan(String value) {
            addCriterion("user_org_code <", value, "userOrgCode");
            return (Criteria) this;
        }

        public Criteria andUserOrgCodeLessThanOrEqualTo(String value) {
            addCriterion("user_org_code <=", value, "userOrgCode");
            return (Criteria) this;
        }

        public Criteria andUserOrgCodeLike(String value) {
            addCriterion("user_org_code like", value, "userOrgCode");
            return (Criteria) this;
        }

        public Criteria andUserOrgCodeNotLike(String value) {
            addCriterion("user_org_code not like", value, "userOrgCode");
            return (Criteria) this;
        }

        public Criteria andUserOrgCodeIn(List<String> values) {
            addCriterion("user_org_code in", values, "userOrgCode");
            return (Criteria) this;
        }

        public Criteria andUserOrgCodeNotIn(List<String> values) {
            addCriterion("user_org_code not in", values, "userOrgCode");
            return (Criteria) this;
        }

        public Criteria andUserOrgCodeBetween(String value1, String value2) {
            addCriterion("user_org_code between", value1, value2, "userOrgCode");
            return (Criteria) this;
        }

        public Criteria andUserOrgCodeNotBetween(String value1, String value2) {
            addCriterion("user_org_code not between", value1, value2, "userOrgCode");
            return (Criteria) this;
        }

        public Criteria andUserWorkcodeIsNull() {
            addCriterion("user_workcode is null");
            return (Criteria) this;
        }

        public Criteria andUserWorkcodeIsNotNull() {
            addCriterion("user_workcode is not null");
            return (Criteria) this;
        }

        public Criteria andUserWorkcodeEqualTo(String value) {
            addCriterion("user_workcode =", value, "userWorkcode");
            return (Criteria) this;
        }

        public Criteria andUserWorkcodeNotEqualTo(String value) {
            addCriterion("user_workcode <>", value, "userWorkcode");
            return (Criteria) this;
        }

        public Criteria andUserWorkcodeGreaterThan(String value) {
            addCriterion("user_workcode >", value, "userWorkcode");
            return (Criteria) this;
        }

        public Criteria andUserWorkcodeGreaterThanOrEqualTo(String value) {
            addCriterion("user_workcode >=", value, "userWorkcode");
            return (Criteria) this;
        }

        public Criteria andUserWorkcodeLessThan(String value) {
            addCriterion("user_workcode <", value, "userWorkcode");
            return (Criteria) this;
        }

        public Criteria andUserWorkcodeLessThanOrEqualTo(String value) {
            addCriterion("user_workcode <=", value, "userWorkcode");
            return (Criteria) this;
        }

        public Criteria andUserWorkcodeLike(String value) {
            addCriterion("user_workcode like", value, "userWorkcode");
            return (Criteria) this;
        }

        public Criteria andUserWorkcodeNotLike(String value) {
            addCriterion("user_workcode not like", value, "userWorkcode");
            return (Criteria) this;
        }

        public Criteria andUserWorkcodeIn(List<String> values) {
            addCriterion("user_workcode in", values, "userWorkcode");
            return (Criteria) this;
        }

        public Criteria andUserWorkcodeNotIn(List<String> values) {
            addCriterion("user_workcode not in", values, "userWorkcode");
            return (Criteria) this;
        }

        public Criteria andUserWorkcodeBetween(String value1, String value2) {
            addCriterion("user_workcode between", value1, value2, "userWorkcode");
            return (Criteria) this;
        }

        public Criteria andUserWorkcodeNotBetween(String value1, String value2) {
            addCriterion("user_workcode not between", value1, value2, "userWorkcode");
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

        public Criteria andFileNameIsNull() {
            addCriterion("file_name is null");
            return (Criteria) this;
        }

        public Criteria andFileNameIsNotNull() {
            addCriterion("file_name is not null");
            return (Criteria) this;
        }

        public Criteria andFileNameEqualTo(String value) {
            addCriterion("file_name =", value, "fileName");
            return (Criteria) this;
        }

        public Criteria andFileNameNotEqualTo(String value) {
            addCriterion("file_name <>", value, "fileName");
            return (Criteria) this;
        }

        public Criteria andFileNameGreaterThan(String value) {
            addCriterion("file_name >", value, "fileName");
            return (Criteria) this;
        }

        public Criteria andFileNameGreaterThanOrEqualTo(String value) {
            addCriterion("file_name >=", value, "fileName");
            return (Criteria) this;
        }

        public Criteria andFileNameLessThan(String value) {
            addCriterion("file_name <", value, "fileName");
            return (Criteria) this;
        }

        public Criteria andFileNameLessThanOrEqualTo(String value) {
            addCriterion("file_name <=", value, "fileName");
            return (Criteria) this;
        }

        public Criteria andFileNameLike(String value) {
            addCriterion("file_name like", value, "fileName");
            return (Criteria) this;
        }

        public Criteria andFileNameNotLike(String value) {
            addCriterion("file_name not like", value, "fileName");
            return (Criteria) this;
        }

        public Criteria andFileNameIn(List<String> values) {
            addCriterion("file_name in", values, "fileName");
            return (Criteria) this;
        }

        public Criteria andFileNameNotIn(List<String> values) {
            addCriterion("file_name not in", values, "fileName");
            return (Criteria) this;
        }

        public Criteria andFileNameBetween(String value1, String value2) {
            addCriterion("file_name between", value1, value2, "fileName");
            return (Criteria) this;
        }

        public Criteria andFileNameNotBetween(String value1, String value2) {
            addCriterion("file_name not between", value1, value2, "fileName");
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