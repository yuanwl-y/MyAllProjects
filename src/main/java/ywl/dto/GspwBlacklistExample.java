package ywl.dto;

import java.util.ArrayList;
import java.util.List;

public class GspwBlacklistExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public GspwBlacklistExample() {
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

        public Criteria andWorkcodeIsNull() {
            addCriterion("workCode is null");
            return (Criteria) this;
        }

        public Criteria andWorkcodeIsNotNull() {
            addCriterion("workCode is not null");
            return (Criteria) this;
        }

        public Criteria andWorkcodeEqualTo(String value) {
            addCriterion("workCode =", value, "workcode");
            return (Criteria) this;
        }

        public Criteria andWorkcodeNotEqualTo(String value) {
            addCriterion("workCode <>", value, "workcode");
            return (Criteria) this;
        }

        public Criteria andWorkcodeGreaterThan(String value) {
            addCriterion("workCode >", value, "workcode");
            return (Criteria) this;
        }

        public Criteria andWorkcodeGreaterThanOrEqualTo(String value) {
            addCriterion("workCode >=", value, "workcode");
            return (Criteria) this;
        }

        public Criteria andWorkcodeLessThan(String value) {
            addCriterion("workCode <", value, "workcode");
            return (Criteria) this;
        }

        public Criteria andWorkcodeLessThanOrEqualTo(String value) {
            addCriterion("workCode <=", value, "workcode");
            return (Criteria) this;
        }

        public Criteria andWorkcodeLike(String value) {
            addCriterion("workCode like", value, "workcode");
            return (Criteria) this;
        }

        public Criteria andWorkcodeNotLike(String value) {
            addCriterion("workCode not like", value, "workcode");
            return (Criteria) this;
        }

        public Criteria andWorkcodeIn(List<String> values) {
            addCriterion("workCode in", values, "workcode");
            return (Criteria) this;
        }

        public Criteria andWorkcodeNotIn(List<String> values) {
            addCriterion("workCode not in", values, "workcode");
            return (Criteria) this;
        }

        public Criteria andWorkcodeBetween(String value1, String value2) {
            addCriterion("workCode between", value1, value2, "workcode");
            return (Criteria) this;
        }

        public Criteria andWorkcodeNotBetween(String value1, String value2) {
            addCriterion("workCode not between", value1, value2, "workcode");
            return (Criteria) this;
        }

        public Criteria andJointimeIsNull() {
            addCriterion("joinTime is null");
            return (Criteria) this;
        }

        public Criteria andJointimeIsNotNull() {
            addCriterion("joinTime is not null");
            return (Criteria) this;
        }

        public Criteria andJointimeEqualTo(String value) {
            addCriterion("joinTime =", value, "jointime");
            return (Criteria) this;
        }

        public Criteria andJointimeNotEqualTo(String value) {
            addCriterion("joinTime <>", value, "jointime");
            return (Criteria) this;
        }

        public Criteria andJointimeGreaterThan(String value) {
            addCriterion("joinTime >", value, "jointime");
            return (Criteria) this;
        }

        public Criteria andJointimeGreaterThanOrEqualTo(String value) {
            addCriterion("joinTime >=", value, "jointime");
            return (Criteria) this;
        }

        public Criteria andJointimeLessThan(String value) {
            addCriterion("joinTime <", value, "jointime");
            return (Criteria) this;
        }

        public Criteria andJointimeLessThanOrEqualTo(String value) {
            addCriterion("joinTime <=", value, "jointime");
            return (Criteria) this;
        }

        public Criteria andJointimeLike(String value) {
            addCriterion("joinTime like", value, "jointime");
            return (Criteria) this;
        }

        public Criteria andJointimeNotLike(String value) {
            addCriterion("joinTime not like", value, "jointime");
            return (Criteria) this;
        }

        public Criteria andJointimeIn(List<String> values) {
            addCriterion("joinTime in", values, "jointime");
            return (Criteria) this;
        }

        public Criteria andJointimeNotIn(List<String> values) {
            addCriterion("joinTime not in", values, "jointime");
            return (Criteria) this;
        }

        public Criteria andJointimeBetween(String value1, String value2) {
            addCriterion("joinTime between", value1, value2, "jointime");
            return (Criteria) this;
        }

        public Criteria andJointimeNotBetween(String value1, String value2) {
            addCriterion("joinTime not between", value1, value2, "jointime");
            return (Criteria) this;
        }

        public Criteria andAccessnameIsNull() {
            addCriterion("accessName is null");
            return (Criteria) this;
        }

        public Criteria andAccessnameIsNotNull() {
            addCriterion("accessName is not null");
            return (Criteria) this;
        }

        public Criteria andAccessnameEqualTo(String value) {
            addCriterion("accessName =", value, "accessname");
            return (Criteria) this;
        }

        public Criteria andAccessnameNotEqualTo(String value) {
            addCriterion("accessName <>", value, "accessname");
            return (Criteria) this;
        }

        public Criteria andAccessnameGreaterThan(String value) {
            addCriterion("accessName >", value, "accessname");
            return (Criteria) this;
        }

        public Criteria andAccessnameGreaterThanOrEqualTo(String value) {
            addCriterion("accessName >=", value, "accessname");
            return (Criteria) this;
        }

        public Criteria andAccessnameLessThan(String value) {
            addCriterion("accessName <", value, "accessname");
            return (Criteria) this;
        }

        public Criteria andAccessnameLessThanOrEqualTo(String value) {
            addCriterion("accessName <=", value, "accessname");
            return (Criteria) this;
        }

        public Criteria andAccessnameLike(String value) {
            addCriterion("accessName like", value, "accessname");
            return (Criteria) this;
        }

        public Criteria andAccessnameNotLike(String value) {
            addCriterion("accessName not like", value, "accessname");
            return (Criteria) this;
        }

        public Criteria andAccessnameIn(List<String> values) {
            addCriterion("accessName in", values, "accessname");
            return (Criteria) this;
        }

        public Criteria andAccessnameNotIn(List<String> values) {
            addCriterion("accessName not in", values, "accessname");
            return (Criteria) this;
        }

        public Criteria andAccessnameBetween(String value1, String value2) {
            addCriterion("accessName between", value1, value2, "accessname");
            return (Criteria) this;
        }

        public Criteria andAccessnameNotBetween(String value1, String value2) {
            addCriterion("accessName not between", value1, value2, "accessname");
            return (Criteria) this;
        }

        public Criteria andAccessworkcodeIsNull() {
            addCriterion("accessWorkCode is null");
            return (Criteria) this;
        }

        public Criteria andAccessworkcodeIsNotNull() {
            addCriterion("accessWorkCode is not null");
            return (Criteria) this;
        }

        public Criteria andAccessworkcodeEqualTo(String value) {
            addCriterion("accessWorkCode =", value, "accessworkcode");
            return (Criteria) this;
        }

        public Criteria andAccessworkcodeNotEqualTo(String value) {
            addCriterion("accessWorkCode <>", value, "accessworkcode");
            return (Criteria) this;
        }

        public Criteria andAccessworkcodeGreaterThan(String value) {
            addCriterion("accessWorkCode >", value, "accessworkcode");
            return (Criteria) this;
        }

        public Criteria andAccessworkcodeGreaterThanOrEqualTo(String value) {
            addCriterion("accessWorkCode >=", value, "accessworkcode");
            return (Criteria) this;
        }

        public Criteria andAccessworkcodeLessThan(String value) {
            addCriterion("accessWorkCode <", value, "accessworkcode");
            return (Criteria) this;
        }

        public Criteria andAccessworkcodeLessThanOrEqualTo(String value) {
            addCriterion("accessWorkCode <=", value, "accessworkcode");
            return (Criteria) this;
        }

        public Criteria andAccessworkcodeLike(String value) {
            addCriterion("accessWorkCode like", value, "accessworkcode");
            return (Criteria) this;
        }

        public Criteria andAccessworkcodeNotLike(String value) {
            addCriterion("accessWorkCode not like", value, "accessworkcode");
            return (Criteria) this;
        }

        public Criteria andAccessworkcodeIn(List<String> values) {
            addCriterion("accessWorkCode in", values, "accessworkcode");
            return (Criteria) this;
        }

        public Criteria andAccessworkcodeNotIn(List<String> values) {
            addCriterion("accessWorkCode not in", values, "accessworkcode");
            return (Criteria) this;
        }

        public Criteria andAccessworkcodeBetween(String value1, String value2) {
            addCriterion("accessWorkCode between", value1, value2, "accessworkcode");
            return (Criteria) this;
        }

        public Criteria andAccessworkcodeNotBetween(String value1, String value2) {
            addCriterion("accessWorkCode not between", value1, value2, "accessworkcode");
            return (Criteria) this;
        }

        public Criteria andReasonIsNull() {
            addCriterion("reason is null");
            return (Criteria) this;
        }

        public Criteria andReasonIsNotNull() {
            addCriterion("reason is not null");
            return (Criteria) this;
        }

        public Criteria andReasonEqualTo(String value) {
            addCriterion("reason =", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonNotEqualTo(String value) {
            addCriterion("reason <>", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonGreaterThan(String value) {
            addCriterion("reason >", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonGreaterThanOrEqualTo(String value) {
            addCriterion("reason >=", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonLessThan(String value) {
            addCriterion("reason <", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonLessThanOrEqualTo(String value) {
            addCriterion("reason <=", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonLike(String value) {
            addCriterion("reason like", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonNotLike(String value) {
            addCriterion("reason not like", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonIn(List<String> values) {
            addCriterion("reason in", values, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonNotIn(List<String> values) {
            addCriterion("reason not in", values, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonBetween(String value1, String value2) {
            addCriterion("reason between", value1, value2, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonNotBetween(String value1, String value2) {
            addCriterion("reason not between", value1, value2, "reason");
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

        public Criteria andBlackTypeIsNull() {
            addCriterion("black_type is null");
            return (Criteria) this;
        }

        public Criteria andBlackTypeIsNotNull() {
            addCriterion("black_type is not null");
            return (Criteria) this;
        }

        public Criteria andBlackTypeEqualTo(Integer value) {
            addCriterion("black_type =", value, "blackType");
            return (Criteria) this;
        }

        public Criteria andBlackTypeNotEqualTo(Integer value) {
            addCriterion("black_type <>", value, "blackType");
            return (Criteria) this;
        }

        public Criteria andBlackTypeGreaterThan(Integer value) {
            addCriterion("black_type >", value, "blackType");
            return (Criteria) this;
        }

        public Criteria andBlackTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("black_type >=", value, "blackType");
            return (Criteria) this;
        }

        public Criteria andBlackTypeLessThan(Integer value) {
            addCriterion("black_type <", value, "blackType");
            return (Criteria) this;
        }

        public Criteria andBlackTypeLessThanOrEqualTo(Integer value) {
            addCriterion("black_type <=", value, "blackType");
            return (Criteria) this;
        }

        public Criteria andBlackTypeIn(List<Integer> values) {
            addCriterion("black_type in", values, "blackType");
            return (Criteria) this;
        }

        public Criteria andBlackTypeNotIn(List<Integer> values) {
            addCriterion("black_type not in", values, "blackType");
            return (Criteria) this;
        }

        public Criteria andBlackTypeBetween(Integer value1, Integer value2) {
            addCriterion("black_type between", value1, value2, "blackType");
            return (Criteria) this;
        }

        public Criteria andBlackTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("black_type not between", value1, value2, "blackType");
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