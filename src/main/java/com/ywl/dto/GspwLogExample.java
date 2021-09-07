package com.ywl.dto;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class GspwLogExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public GspwLogExample() {
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

        public Criteria andLogIdIsNull() {
            addCriterion("log_id is null");
            return (Criteria) this;
        }

        public Criteria andLogIdIsNotNull() {
            addCriterion("log_id is not null");
            return (Criteria) this;
        }

        public Criteria andLogIdEqualTo(Integer value) {
            addCriterion("log_id =", value, "logId");
            return (Criteria) this;
        }

        public Criteria andLogIdNotEqualTo(Integer value) {
            addCriterion("log_id <>", value, "logId");
            return (Criteria) this;
        }

        public Criteria andLogIdGreaterThan(Integer value) {
            addCriterion("log_id >", value, "logId");
            return (Criteria) this;
        }

        public Criteria andLogIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("log_id >=", value, "logId");
            return (Criteria) this;
        }

        public Criteria andLogIdLessThan(Integer value) {
            addCriterion("log_id <", value, "logId");
            return (Criteria) this;
        }

        public Criteria andLogIdLessThanOrEqualTo(Integer value) {
            addCriterion("log_id <=", value, "logId");
            return (Criteria) this;
        }

        public Criteria andLogIdIn(List<Integer> values) {
            addCriterion("log_id in", values, "logId");
            return (Criteria) this;
        }

        public Criteria andLogIdNotIn(List<Integer> values) {
            addCriterion("log_id not in", values, "logId");
            return (Criteria) this;
        }

        public Criteria andLogIdBetween(Integer value1, Integer value2) {
            addCriterion("log_id between", value1, value2, "logId");
            return (Criteria) this;
        }

        public Criteria andLogIdNotBetween(Integer value1, Integer value2) {
            addCriterion("log_id not between", value1, value2, "logId");
            return (Criteria) this;
        }

        public Criteria andLogOperationidIsNull() {
            addCriterion("log_operationid is null");
            return (Criteria) this;
        }

        public Criteria andLogOperationidIsNotNull() {
            addCriterion("log_operationid is not null");
            return (Criteria) this;
        }

        public Criteria andLogOperationidEqualTo(Integer value) {
            addCriterion("log_operationid =", value, "logOperationid");
            return (Criteria) this;
        }

        public Criteria andLogOperationidNotEqualTo(Integer value) {
            addCriterion("log_operationid <>", value, "logOperationid");
            return (Criteria) this;
        }

        public Criteria andLogOperationidGreaterThan(Integer value) {
            addCriterion("log_operationid >", value, "logOperationid");
            return (Criteria) this;
        }

        public Criteria andLogOperationidGreaterThanOrEqualTo(Integer value) {
            addCriterion("log_operationid >=", value, "logOperationid");
            return (Criteria) this;
        }

        public Criteria andLogOperationidLessThan(Integer value) {
            addCriterion("log_operationid <", value, "logOperationid");
            return (Criteria) this;
        }

        public Criteria andLogOperationidLessThanOrEqualTo(Integer value) {
            addCriterion("log_operationid <=", value, "logOperationid");
            return (Criteria) this;
        }

        public Criteria andLogOperationidIn(List<Integer> values) {
            addCriterion("log_operationid in", values, "logOperationid");
            return (Criteria) this;
        }

        public Criteria andLogOperationidNotIn(List<Integer> values) {
            addCriterion("log_operationid not in", values, "logOperationid");
            return (Criteria) this;
        }

        public Criteria andLogOperationidBetween(Integer value1, Integer value2) {
            addCriterion("log_operationid between", value1, value2, "logOperationid");
            return (Criteria) this;
        }

        public Criteria andLogOperationidNotBetween(Integer value1, Integer value2) {
            addCriterion("log_operationid not between", value1, value2, "logOperationid");
            return (Criteria) this;
        }

        public Criteria andLogTablenameIsNull() {
            addCriterion("log_tablename is null");
            return (Criteria) this;
        }

        public Criteria andLogTablenameIsNotNull() {
            addCriterion("log_tablename is not null");
            return (Criteria) this;
        }

        public Criteria andLogTablenameEqualTo(String value) {
            addCriterion("log_tablename =", value, "logTablename");
            return (Criteria) this;
        }

        public Criteria andLogTablenameNotEqualTo(String value) {
            addCriterion("log_tablename <>", value, "logTablename");
            return (Criteria) this;
        }

        public Criteria andLogTablenameGreaterThan(String value) {
            addCriterion("log_tablename >", value, "logTablename");
            return (Criteria) this;
        }

        public Criteria andLogTablenameGreaterThanOrEqualTo(String value) {
            addCriterion("log_tablename >=", value, "logTablename");
            return (Criteria) this;
        }

        public Criteria andLogTablenameLessThan(String value) {
            addCriterion("log_tablename <", value, "logTablename");
            return (Criteria) this;
        }

        public Criteria andLogTablenameLessThanOrEqualTo(String value) {
            addCriterion("log_tablename <=", value, "logTablename");
            return (Criteria) this;
        }

        public Criteria andLogTablenameLike(String value) {
            addCriterion("log_tablename like", value, "logTablename");
            return (Criteria) this;
        }

        public Criteria andLogTablenameNotLike(String value) {
            addCriterion("log_tablename not like", value, "logTablename");
            return (Criteria) this;
        }

        public Criteria andLogTablenameIn(List<String> values) {
            addCriterion("log_tablename in", values, "logTablename");
            return (Criteria) this;
        }

        public Criteria andLogTablenameNotIn(List<String> values) {
            addCriterion("log_tablename not in", values, "logTablename");
            return (Criteria) this;
        }

        public Criteria andLogTablenameBetween(String value1, String value2) {
            addCriterion("log_tablename between", value1, value2, "logTablename");
            return (Criteria) this;
        }

        public Criteria andLogTablenameNotBetween(String value1, String value2) {
            addCriterion("log_tablename not between", value1, value2, "logTablename");
            return (Criteria) this;
        }

        public Criteria andLogOperationIsNull() {
            addCriterion("log_operation is null");
            return (Criteria) this;
        }

        public Criteria andLogOperationIsNotNull() {
            addCriterion("log_operation is not null");
            return (Criteria) this;
        }

        public Criteria andLogOperationEqualTo(String value) {
            addCriterion("log_operation =", value, "logOperation");
            return (Criteria) this;
        }

        public Criteria andLogOperationNotEqualTo(String value) {
            addCriterion("log_operation <>", value, "logOperation");
            return (Criteria) this;
        }

        public Criteria andLogOperationGreaterThan(String value) {
            addCriterion("log_operation >", value, "logOperation");
            return (Criteria) this;
        }

        public Criteria andLogOperationGreaterThanOrEqualTo(String value) {
            addCriterion("log_operation >=", value, "logOperation");
            return (Criteria) this;
        }

        public Criteria andLogOperationLessThan(String value) {
            addCriterion("log_operation <", value, "logOperation");
            return (Criteria) this;
        }

        public Criteria andLogOperationLessThanOrEqualTo(String value) {
            addCriterion("log_operation <=", value, "logOperation");
            return (Criteria) this;
        }

        public Criteria andLogOperationLike(String value) {
            addCriterion("log_operation like", value, "logOperation");
            return (Criteria) this;
        }

        public Criteria andLogOperationNotLike(String value) {
            addCriterion("log_operation not like", value, "logOperation");
            return (Criteria) this;
        }

        public Criteria andLogOperationIn(List<String> values) {
            addCriterion("log_operation in", values, "logOperation");
            return (Criteria) this;
        }

        public Criteria andLogOperationNotIn(List<String> values) {
            addCriterion("log_operation not in", values, "logOperation");
            return (Criteria) this;
        }

        public Criteria andLogOperationBetween(String value1, String value2) {
            addCriterion("log_operation between", value1, value2, "logOperation");
            return (Criteria) this;
        }

        public Criteria andLogOperationNotBetween(String value1, String value2) {
            addCriterion("log_operation not between", value1, value2, "logOperation");
            return (Criteria) this;
        }

        public Criteria andLogContextIsNull() {
            addCriterion("log_context is null");
            return (Criteria) this;
        }

        public Criteria andLogContextIsNotNull() {
            addCriterion("log_context is not null");
            return (Criteria) this;
        }

        public Criteria andLogContextEqualTo(String value) {
            addCriterion("log_context =", value, "logContext");
            return (Criteria) this;
        }

        public Criteria andLogContextNotEqualTo(String value) {
            addCriterion("log_context <>", value, "logContext");
            return (Criteria) this;
        }

        public Criteria andLogContextGreaterThan(String value) {
            addCriterion("log_context >", value, "logContext");
            return (Criteria) this;
        }

        public Criteria andLogContextGreaterThanOrEqualTo(String value) {
            addCriterion("log_context >=", value, "logContext");
            return (Criteria) this;
        }

        public Criteria andLogContextLessThan(String value) {
            addCriterion("log_context <", value, "logContext");
            return (Criteria) this;
        }

        public Criteria andLogContextLessThanOrEqualTo(String value) {
            addCriterion("log_context <=", value, "logContext");
            return (Criteria) this;
        }

        public Criteria andLogContextLike(String value) {
            addCriterion("log_context like", value, "logContext");
            return (Criteria) this;
        }

        public Criteria andLogContextNotLike(String value) {
            addCriterion("log_context not like", value, "logContext");
            return (Criteria) this;
        }

        public Criteria andLogContextIn(List<String> values) {
            addCriterion("log_context in", values, "logContext");
            return (Criteria) this;
        }

        public Criteria andLogContextNotIn(List<String> values) {
            addCriterion("log_context not in", values, "logContext");
            return (Criteria) this;
        }

        public Criteria andLogContextBetween(String value1, String value2) {
            addCriterion("log_context between", value1, value2, "logContext");
            return (Criteria) this;
        }

        public Criteria andLogContextNotBetween(String value1, String value2) {
            addCriterion("log_context not between", value1, value2, "logContext");
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

        public Criteria andArchivesIdEqualTo(String value) {
            addCriterion("archives_id =", value, "archivesId");
            return (Criteria) this;
        }

        public Criteria andArchivesIdNotEqualTo(String value) {
            addCriterion("archives_id <>", value, "archivesId");
            return (Criteria) this;
        }

        public Criteria andArchivesIdGreaterThan(String value) {
            addCriterion("archives_id >", value, "archivesId");
            return (Criteria) this;
        }

        public Criteria andArchivesIdGreaterThanOrEqualTo(String value) {
            addCriterion("archives_id >=", value, "archivesId");
            return (Criteria) this;
        }

        public Criteria andArchivesIdLessThan(String value) {
            addCriterion("archives_id <", value, "archivesId");
            return (Criteria) this;
        }

        public Criteria andArchivesIdLessThanOrEqualTo(String value) {
            addCriterion("archives_id <=", value, "archivesId");
            return (Criteria) this;
        }

        public Criteria andArchivesIdLike(String value) {
            addCriterion("archives_id like", value, "archivesId");
            return (Criteria) this;
        }

        public Criteria andArchivesIdNotLike(String value) {
            addCriterion("archives_id not like", value, "archivesId");
            return (Criteria) this;
        }

        public Criteria andArchivesIdIn(List<String> values) {
            addCriterion("archives_id in", values, "archivesId");
            return (Criteria) this;
        }

        public Criteria andArchivesIdNotIn(List<String> values) {
            addCriterion("archives_id not in", values, "archivesId");
            return (Criteria) this;
        }

        public Criteria andArchivesIdBetween(String value1, String value2) {
            addCriterion("archives_id between", value1, value2, "archivesId");
            return (Criteria) this;
        }

        public Criteria andArchivesIdNotBetween(String value1, String value2) {
            addCriterion("archives_id not between", value1, value2, "archivesId");
            return (Criteria) this;
        }

        public Criteria andLogDateIsNull() {
            addCriterion("log_date is null");
            return (Criteria) this;
        }

        public Criteria andLogDateIsNotNull() {
            addCriterion("log_date is not null");
            return (Criteria) this;
        }

        public Criteria andLogDateEqualTo(Date value) {
            addCriterion("log_date =", value, "logDate");
            return (Criteria) this;
        }

        public Criteria andLogDateNotEqualTo(Date value) {
            addCriterion("log_date <>", value, "logDate");
            return (Criteria) this;
        }

        public Criteria andLogDateGreaterThan(Date value) {
            addCriterion("log_date >", value, "logDate");
            return (Criteria) this;
        }

        public Criteria andLogDateGreaterThanOrEqualTo(Date value) {
            addCriterion("log_date >=", value, "logDate");
            return (Criteria) this;
        }

        public Criteria andLogDateLessThan(Date value) {
            addCriterion("log_date <", value, "logDate");
            return (Criteria) this;
        }

        public Criteria andLogDateLessThanOrEqualTo(Date value) {
            addCriterion("log_date <=", value, "logDate");
            return (Criteria) this;
        }

        public Criteria andLogDateIn(List<Date> values) {
            addCriterion("log_date in", values, "logDate");
            return (Criteria) this;
        }

        public Criteria andLogDateNotIn(List<Date> values) {
            addCriterion("log_date not in", values, "logDate");
            return (Criteria) this;
        }

        public Criteria andLogDateBetween(Date value1, Date value2) {
            addCriterion("log_date between", value1, value2, "logDate");
            return (Criteria) this;
        }

        public Criteria andLogDateNotBetween(Date value1, Date value2) {
            addCriterion("log_date not between", value1, value2, "logDate");
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