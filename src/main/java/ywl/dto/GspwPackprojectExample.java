package ywl.dto;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class GspwPackprojectExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public GspwPackprojectExample() {
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

        public Criteria andPackprojectIdIsNull() {
            addCriterion("packProject_id is null");
            return (Criteria) this;
        }

        public Criteria andPackprojectIdIsNotNull() {
            addCriterion("packProject_id is not null");
            return (Criteria) this;
        }

        public Criteria andPackprojectIdEqualTo(Integer value) {
            addCriterion("packProject_id =", value, "packprojectId");
            return (Criteria) this;
        }

        public Criteria andPackprojectIdNotEqualTo(Integer value) {
            addCriterion("packProject_id <>", value, "packprojectId");
            return (Criteria) this;
        }

        public Criteria andPackprojectIdGreaterThan(Integer value) {
            addCriterion("packProject_id >", value, "packprojectId");
            return (Criteria) this;
        }

        public Criteria andPackprojectIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("packProject_id >=", value, "packprojectId");
            return (Criteria) this;
        }

        public Criteria andPackprojectIdLessThan(Integer value) {
            addCriterion("packProject_id <", value, "packprojectId");
            return (Criteria) this;
        }

        public Criteria andPackprojectIdLessThanOrEqualTo(Integer value) {
            addCriterion("packProject_id <=", value, "packprojectId");
            return (Criteria) this;
        }

        public Criteria andPackprojectIdIn(List<Integer> values) {
            addCriterion("packProject_id in", values, "packprojectId");
            return (Criteria) this;
        }

        public Criteria andPackprojectIdNotIn(List<Integer> values) {
            addCriterion("packProject_id not in", values, "packprojectId");
            return (Criteria) this;
        }

        public Criteria andPackprojectIdBetween(Integer value1, Integer value2) {
            addCriterion("packProject_id between", value1, value2, "packprojectId");
            return (Criteria) this;
        }

        public Criteria andPackprojectIdNotBetween(Integer value1, Integer value2) {
            addCriterion("packProject_id not between", value1, value2, "packprojectId");
            return (Criteria) this;
        }

        public Criteria andPackprojectNameIsNull() {
            addCriterion("packProject_name is null");
            return (Criteria) this;
        }

        public Criteria andPackprojectNameIsNotNull() {
            addCriterion("packProject_name is not null");
            return (Criteria) this;
        }

        public Criteria andPackprojectNameEqualTo(String value) {
            addCriterion("packProject_name =", value, "packprojectName");
            return (Criteria) this;
        }

        public Criteria andPackprojectNameNotEqualTo(String value) {
            addCriterion("packProject_name <>", value, "packprojectName");
            return (Criteria) this;
        }

        public Criteria andPackprojectNameGreaterThan(String value) {
            addCriterion("packProject_name >", value, "packprojectName");
            return (Criteria) this;
        }

        public Criteria andPackprojectNameGreaterThanOrEqualTo(String value) {
            addCriterion("packProject_name >=", value, "packprojectName");
            return (Criteria) this;
        }

        public Criteria andPackprojectNameLessThan(String value) {
            addCriterion("packProject_name <", value, "packprojectName");
            return (Criteria) this;
        }

        public Criteria andPackprojectNameLessThanOrEqualTo(String value) {
            addCriterion("packProject_name <=", value, "packprojectName");
            return (Criteria) this;
        }

        public Criteria andPackprojectNameLike(String value) {
            addCriterion("packProject_name like", value, "packprojectName");
            return (Criteria) this;
        }

        public Criteria andPackprojectNameNotLike(String value) {
            addCriterion("packProject_name not like", value, "packprojectName");
            return (Criteria) this;
        }

        public Criteria andPackprojectNameIn(List<String> values) {
            addCriterion("packProject_name in", values, "packprojectName");
            return (Criteria) this;
        }

        public Criteria andPackprojectNameNotIn(List<String> values) {
            addCriterion("packProject_name not in", values, "packprojectName");
            return (Criteria) this;
        }

        public Criteria andPackprojectNameBetween(String value1, String value2) {
            addCriterion("packProject_name between", value1, value2, "packprojectName");
            return (Criteria) this;
        }

        public Criteria andPackprojectNameNotBetween(String value1, String value2) {
            addCriterion("packProject_name not between", value1, value2, "packprojectName");
            return (Criteria) this;
        }

        public Criteria andPackprojectWbsIsNull() {
            addCriterion("packProject_wbs is null");
            return (Criteria) this;
        }

        public Criteria andPackprojectWbsIsNotNull() {
            addCriterion("packProject_wbs is not null");
            return (Criteria) this;
        }

        public Criteria andPackprojectWbsEqualTo(String value) {
            addCriterion("packProject_wbs =", value, "packprojectWbs");
            return (Criteria) this;
        }

        public Criteria andPackprojectWbsNotEqualTo(String value) {
            addCriterion("packProject_wbs <>", value, "packprojectWbs");
            return (Criteria) this;
        }

        public Criteria andPackprojectWbsGreaterThan(String value) {
            addCriterion("packProject_wbs >", value, "packprojectWbs");
            return (Criteria) this;
        }

        public Criteria andPackprojectWbsGreaterThanOrEqualTo(String value) {
            addCriterion("packProject_wbs >=", value, "packprojectWbs");
            return (Criteria) this;
        }

        public Criteria andPackprojectWbsLessThan(String value) {
            addCriterion("packProject_wbs <", value, "packprojectWbs");
            return (Criteria) this;
        }

        public Criteria andPackprojectWbsLessThanOrEqualTo(String value) {
            addCriterion("packProject_wbs <=", value, "packprojectWbs");
            return (Criteria) this;
        }

        public Criteria andPackprojectWbsLike(String value) {
            addCriterion("packProject_wbs like", value, "packprojectWbs");
            return (Criteria) this;
        }

        public Criteria andPackprojectWbsNotLike(String value) {
            addCriterion("packProject_wbs not like", value, "packprojectWbs");
            return (Criteria) this;
        }

        public Criteria andPackprojectWbsIn(List<String> values) {
            addCriterion("packProject_wbs in", values, "packprojectWbs");
            return (Criteria) this;
        }

        public Criteria andPackprojectWbsNotIn(List<String> values) {
            addCriterion("packProject_wbs not in", values, "packprojectWbs");
            return (Criteria) this;
        }

        public Criteria andPackprojectWbsBetween(String value1, String value2) {
            addCriterion("packProject_wbs between", value1, value2, "packprojectWbs");
            return (Criteria) this;
        }

        public Criteria andPackprojectWbsNotBetween(String value1, String value2) {
            addCriterion("packProject_wbs not between", value1, value2, "packprojectWbs");
            return (Criteria) this;
        }

        public Criteria andPackprojectNumberIsNull() {
            addCriterion("packProject_number is null");
            return (Criteria) this;
        }

        public Criteria andPackprojectNumberIsNotNull() {
            addCriterion("packProject_number is not null");
            return (Criteria) this;
        }

        public Criteria andPackprojectNumberEqualTo(String value) {
            addCriterion("packProject_number =", value, "packprojectNumber");
            return (Criteria) this;
        }

        public Criteria andPackprojectNumberNotEqualTo(String value) {
            addCriterion("packProject_number <>", value, "packprojectNumber");
            return (Criteria) this;
        }

        public Criteria andPackprojectNumberGreaterThan(String value) {
            addCriterion("packProject_number >", value, "packprojectNumber");
            return (Criteria) this;
        }

        public Criteria andPackprojectNumberGreaterThanOrEqualTo(String value) {
            addCriterion("packProject_number >=", value, "packprojectNumber");
            return (Criteria) this;
        }

        public Criteria andPackprojectNumberLessThan(String value) {
            addCriterion("packProject_number <", value, "packprojectNumber");
            return (Criteria) this;
        }

        public Criteria andPackprojectNumberLessThanOrEqualTo(String value) {
            addCriterion("packProject_number <=", value, "packprojectNumber");
            return (Criteria) this;
        }

        public Criteria andPackprojectNumberLike(String value) {
            addCriterion("packProject_number like", value, "packprojectNumber");
            return (Criteria) this;
        }

        public Criteria andPackprojectNumberNotLike(String value) {
            addCriterion("packProject_number not like", value, "packprojectNumber");
            return (Criteria) this;
        }

        public Criteria andPackprojectNumberIn(List<String> values) {
            addCriterion("packProject_number in", values, "packprojectNumber");
            return (Criteria) this;
        }

        public Criteria andPackprojectNumberNotIn(List<String> values) {
            addCriterion("packProject_number not in", values, "packprojectNumber");
            return (Criteria) this;
        }

        public Criteria andPackprojectNumberBetween(String value1, String value2) {
            addCriterion("packProject_number between", value1, value2, "packprojectNumber");
            return (Criteria) this;
        }

        public Criteria andPackprojectNumberNotBetween(String value1, String value2) {
            addCriterion("packProject_number not between", value1, value2, "packprojectNumber");
            return (Criteria) this;
        }

        public Criteria andIntegratedprojectIdIsNull() {
            addCriterion("integratedProject_id is null");
            return (Criteria) this;
        }

        public Criteria andIntegratedprojectIdIsNotNull() {
            addCriterion("integratedProject_id is not null");
            return (Criteria) this;
        }

        public Criteria andIntegratedprojectIdEqualTo(Integer value) {
            addCriterion("integratedProject_id =", value, "integratedprojectId");
            return (Criteria) this;
        }

        public Criteria andIntegratedprojectIdNotEqualTo(Integer value) {
            addCriterion("integratedProject_id <>", value, "integratedprojectId");
            return (Criteria) this;
        }

        public Criteria andIntegratedprojectIdGreaterThan(Integer value) {
            addCriterion("integratedProject_id >", value, "integratedprojectId");
            return (Criteria) this;
        }

        public Criteria andIntegratedprojectIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("integratedProject_id >=", value, "integratedprojectId");
            return (Criteria) this;
        }

        public Criteria andIntegratedprojectIdLessThan(Integer value) {
            addCriterion("integratedProject_id <", value, "integratedprojectId");
            return (Criteria) this;
        }

        public Criteria andIntegratedprojectIdLessThanOrEqualTo(Integer value) {
            addCriterion("integratedProject_id <=", value, "integratedprojectId");
            return (Criteria) this;
        }

        public Criteria andIntegratedprojectIdIn(List<Integer> values) {
            addCriterion("integratedProject_id in", values, "integratedprojectId");
            return (Criteria) this;
        }

        public Criteria andIntegratedprojectIdNotIn(List<Integer> values) {
            addCriterion("integratedProject_id not in", values, "integratedprojectId");
            return (Criteria) this;
        }

        public Criteria andIntegratedprojectIdBetween(Integer value1, Integer value2) {
            addCriterion("integratedProject_id between", value1, value2, "integratedprojectId");
            return (Criteria) this;
        }

        public Criteria andIntegratedprojectIdNotBetween(Integer value1, Integer value2) {
            addCriterion("integratedProject_id not between", value1, value2, "integratedprojectId");
            return (Criteria) this;
        }

        public Criteria andPackprojectOrgIsNull() {
            addCriterion("packProject_org is null");
            return (Criteria) this;
        }

        public Criteria andPackprojectOrgIsNotNull() {
            addCriterion("packProject_org is not null");
            return (Criteria) this;
        }

        public Criteria andPackprojectOrgEqualTo(String value) {
            addCriterion("packProject_org =", value, "packprojectOrg");
            return (Criteria) this;
        }

        public Criteria andPackprojectOrgNotEqualTo(String value) {
            addCriterion("packProject_org <>", value, "packprojectOrg");
            return (Criteria) this;
        }

        public Criteria andPackprojectOrgGreaterThan(String value) {
            addCriterion("packProject_org >", value, "packprojectOrg");
            return (Criteria) this;
        }

        public Criteria andPackprojectOrgGreaterThanOrEqualTo(String value) {
            addCriterion("packProject_org >=", value, "packprojectOrg");
            return (Criteria) this;
        }

        public Criteria andPackprojectOrgLessThan(String value) {
            addCriterion("packProject_org <", value, "packprojectOrg");
            return (Criteria) this;
        }

        public Criteria andPackprojectOrgLessThanOrEqualTo(String value) {
            addCriterion("packProject_org <=", value, "packprojectOrg");
            return (Criteria) this;
        }

        public Criteria andPackprojectOrgLike(String value) {
            addCriterion("packProject_org like", value, "packprojectOrg");
            return (Criteria) this;
        }

        public Criteria andPackprojectOrgNotLike(String value) {
            addCriterion("packProject_org not like", value, "packprojectOrg");
            return (Criteria) this;
        }

        public Criteria andPackprojectOrgIn(List<String> values) {
            addCriterion("packProject_org in", values, "packprojectOrg");
            return (Criteria) this;
        }

        public Criteria andPackprojectOrgNotIn(List<String> values) {
            addCriterion("packProject_org not in", values, "packprojectOrg");
            return (Criteria) this;
        }

        public Criteria andPackprojectOrgBetween(String value1, String value2) {
            addCriterion("packProject_org between", value1, value2, "packprojectOrg");
            return (Criteria) this;
        }

        public Criteria andPackprojectOrgNotBetween(String value1, String value2) {
            addCriterion("packProject_org not between", value1, value2, "packprojectOrg");
            return (Criteria) this;
        }

        public Criteria andPackprojectOrgcodeIsNull() {
            addCriterion("packProject_orgCode is null");
            return (Criteria) this;
        }

        public Criteria andPackprojectOrgcodeIsNotNull() {
            addCriterion("packProject_orgCode is not null");
            return (Criteria) this;
        }

        public Criteria andPackprojectOrgcodeEqualTo(String value) {
            addCriterion("packProject_orgCode =", value, "packprojectOrgcode");
            return (Criteria) this;
        }

        public Criteria andPackprojectOrgcodeNotEqualTo(String value) {
            addCriterion("packProject_orgCode <>", value, "packprojectOrgcode");
            return (Criteria) this;
        }

        public Criteria andPackprojectOrgcodeGreaterThan(String value) {
            addCriterion("packProject_orgCode >", value, "packprojectOrgcode");
            return (Criteria) this;
        }

        public Criteria andPackprojectOrgcodeGreaterThanOrEqualTo(String value) {
            addCriterion("packProject_orgCode >=", value, "packprojectOrgcode");
            return (Criteria) this;
        }

        public Criteria andPackprojectOrgcodeLessThan(String value) {
            addCriterion("packProject_orgCode <", value, "packprojectOrgcode");
            return (Criteria) this;
        }

        public Criteria andPackprojectOrgcodeLessThanOrEqualTo(String value) {
            addCriterion("packProject_orgCode <=", value, "packprojectOrgcode");
            return (Criteria) this;
        }

        public Criteria andPackprojectOrgcodeLike(String value) {
            addCriterion("packProject_orgCode like", value, "packprojectOrgcode");
            return (Criteria) this;
        }

        public Criteria andPackprojectOrgcodeNotLike(String value) {
            addCriterion("packProject_orgCode not like", value, "packprojectOrgcode");
            return (Criteria) this;
        }

        public Criteria andPackprojectOrgcodeIn(List<String> values) {
            addCriterion("packProject_orgCode in", values, "packprojectOrgcode");
            return (Criteria) this;
        }

        public Criteria andPackprojectOrgcodeNotIn(List<String> values) {
            addCriterion("packProject_orgCode not in", values, "packprojectOrgcode");
            return (Criteria) this;
        }

        public Criteria andPackprojectOrgcodeBetween(String value1, String value2) {
            addCriterion("packProject_orgCode between", value1, value2, "packprojectOrgcode");
            return (Criteria) this;
        }

        public Criteria andPackprojectOrgcodeNotBetween(String value1, String value2) {
            addCriterion("packProject_orgCode not between", value1, value2, "packprojectOrgcode");
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

        public Criteria andTimeIsNull() {
            addCriterion("time is null");
            return (Criteria) this;
        }

        public Criteria andTimeIsNotNull() {
            addCriterion("time is not null");
            return (Criteria) this;
        }

        public Criteria andTimeEqualTo(Date value) {
            addCriterion("time =", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotEqualTo(Date value) {
            addCriterion("time <>", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeGreaterThan(Date value) {
            addCriterion("time >", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("time >=", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeLessThan(Date value) {
            addCriterion("time <", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeLessThanOrEqualTo(Date value) {
            addCriterion("time <=", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeIn(List<Date> values) {
            addCriterion("time in", values, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotIn(List<Date> values) {
            addCriterion("time not in", values, "time");
            return (Criteria) this;
        }

        public Criteria andTimeBetween(Date value1, Date value2) {
            addCriterion("time between", value1, value2, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotBetween(Date value1, Date value2) {
            addCriterion("time not between", value1, value2, "time");
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