package ywl.dto;

import java.util.ArrayList;
import java.util.List;

public class GspwUserteamExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public GspwUserteamExample() {
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

        public Criteria andTidIsNull() {
            addCriterion("tId is null");
            return (Criteria) this;
        }

        public Criteria andTidIsNotNull() {
            addCriterion("tId is not null");
            return (Criteria) this;
        }

        public Criteria andTidEqualTo(Integer value) {
            addCriterion("tId =", value, "tid");
            return (Criteria) this;
        }

        public Criteria andTidNotEqualTo(Integer value) {
            addCriterion("tId <>", value, "tid");
            return (Criteria) this;
        }

        public Criteria andTidGreaterThan(Integer value) {
            addCriterion("tId >", value, "tid");
            return (Criteria) this;
        }

        public Criteria andTidGreaterThanOrEqualTo(Integer value) {
            addCriterion("tId >=", value, "tid");
            return (Criteria) this;
        }

        public Criteria andTidLessThan(Integer value) {
            addCriterion("tId <", value, "tid");
            return (Criteria) this;
        }

        public Criteria andTidLessThanOrEqualTo(Integer value) {
            addCriterion("tId <=", value, "tid");
            return (Criteria) this;
        }

        public Criteria andTidIn(List<Integer> values) {
            addCriterion("tId in", values, "tid");
            return (Criteria) this;
        }

        public Criteria andTidNotIn(List<Integer> values) {
            addCriterion("tId not in", values, "tid");
            return (Criteria) this;
        }

        public Criteria andTidBetween(Integer value1, Integer value2) {
            addCriterion("tId between", value1, value2, "tid");
            return (Criteria) this;
        }

        public Criteria andTidNotBetween(Integer value1, Integer value2) {
            addCriterion("tId not between", value1, value2, "tid");
            return (Criteria) this;
        }

        public Criteria andUserdeptnoIsNull() {
            addCriterion("userDeptNo is null");
            return (Criteria) this;
        }

        public Criteria andUserdeptnoIsNotNull() {
            addCriterion("userDeptNo is not null");
            return (Criteria) this;
        }

        public Criteria andUserdeptnoEqualTo(String value) {
            addCriterion("userDeptNo =", value, "userdeptno");
            return (Criteria) this;
        }

        public Criteria andUserdeptnoNotEqualTo(String value) {
            addCriterion("userDeptNo <>", value, "userdeptno");
            return (Criteria) this;
        }

        public Criteria andUserdeptnoGreaterThan(String value) {
            addCriterion("userDeptNo >", value, "userdeptno");
            return (Criteria) this;
        }

        public Criteria andUserdeptnoGreaterThanOrEqualTo(String value) {
            addCriterion("userDeptNo >=", value, "userdeptno");
            return (Criteria) this;
        }

        public Criteria andUserdeptnoLessThan(String value) {
            addCriterion("userDeptNo <", value, "userdeptno");
            return (Criteria) this;
        }

        public Criteria andUserdeptnoLessThanOrEqualTo(String value) {
            addCriterion("userDeptNo <=", value, "userdeptno");
            return (Criteria) this;
        }

        public Criteria andUserdeptnoLike(String value) {
            addCriterion("userDeptNo like", value, "userdeptno");
            return (Criteria) this;
        }

        public Criteria andUserdeptnoNotLike(String value) {
            addCriterion("userDeptNo not like", value, "userdeptno");
            return (Criteria) this;
        }

        public Criteria andUserdeptnoIn(List<String> values) {
            addCriterion("userDeptNo in", values, "userdeptno");
            return (Criteria) this;
        }

        public Criteria andUserdeptnoNotIn(List<String> values) {
            addCriterion("userDeptNo not in", values, "userdeptno");
            return (Criteria) this;
        }

        public Criteria andUserdeptnoBetween(String value1, String value2) {
            addCriterion("userDeptNo between", value1, value2, "userdeptno");
            return (Criteria) this;
        }

        public Criteria andUserdeptnoNotBetween(String value1, String value2) {
            addCriterion("userDeptNo not between", value1, value2, "userdeptno");
            return (Criteria) this;
        }

        public Criteria andUserteamIsNull() {
            addCriterion("userTeam is null");
            return (Criteria) this;
        }

        public Criteria andUserteamIsNotNull() {
            addCriterion("userTeam is not null");
            return (Criteria) this;
        }

        public Criteria andUserteamEqualTo(String value) {
            addCriterion("userTeam =", value, "userteam");
            return (Criteria) this;
        }

        public Criteria andUserteamNotEqualTo(String value) {
            addCriterion("userTeam <>", value, "userteam");
            return (Criteria) this;
        }

        public Criteria andUserteamGreaterThan(String value) {
            addCriterion("userTeam >", value, "userteam");
            return (Criteria) this;
        }

        public Criteria andUserteamGreaterThanOrEqualTo(String value) {
            addCriterion("userTeam >=", value, "userteam");
            return (Criteria) this;
        }

        public Criteria andUserteamLessThan(String value) {
            addCriterion("userTeam <", value, "userteam");
            return (Criteria) this;
        }

        public Criteria andUserteamLessThanOrEqualTo(String value) {
            addCriterion("userTeam <=", value, "userteam");
            return (Criteria) this;
        }

        public Criteria andUserteamLike(String value) {
            addCriterion("userTeam like", value, "userteam");
            return (Criteria) this;
        }

        public Criteria andUserteamNotLike(String value) {
            addCriterion("userTeam not like", value, "userteam");
            return (Criteria) this;
        }

        public Criteria andUserteamIn(List<String> values) {
            addCriterion("userTeam in", values, "userteam");
            return (Criteria) this;
        }

        public Criteria andUserteamNotIn(List<String> values) {
            addCriterion("userTeam not in", values, "userteam");
            return (Criteria) this;
        }

        public Criteria andUserteamBetween(String value1, String value2) {
            addCriterion("userTeam between", value1, value2, "userteam");
            return (Criteria) this;
        }

        public Criteria andUserteamNotBetween(String value1, String value2) {
            addCriterion("userTeam not between", value1, value2, "userteam");
            return (Criteria) this;
        }

        public Criteria andUserdeptnameIsNull() {
            addCriterion("userDeptName is null");
            return (Criteria) this;
        }

        public Criteria andUserdeptnameIsNotNull() {
            addCriterion("userDeptName is not null");
            return (Criteria) this;
        }

        public Criteria andUserdeptnameEqualTo(String value) {
            addCriterion("userDeptName =", value, "userdeptname");
            return (Criteria) this;
        }

        public Criteria andUserdeptnameNotEqualTo(String value) {
            addCriterion("userDeptName <>", value, "userdeptname");
            return (Criteria) this;
        }

        public Criteria andUserdeptnameGreaterThan(String value) {
            addCriterion("userDeptName >", value, "userdeptname");
            return (Criteria) this;
        }

        public Criteria andUserdeptnameGreaterThanOrEqualTo(String value) {
            addCriterion("userDeptName >=", value, "userdeptname");
            return (Criteria) this;
        }

        public Criteria andUserdeptnameLessThan(String value) {
            addCriterion("userDeptName <", value, "userdeptname");
            return (Criteria) this;
        }

        public Criteria andUserdeptnameLessThanOrEqualTo(String value) {
            addCriterion("userDeptName <=", value, "userdeptname");
            return (Criteria) this;
        }

        public Criteria andUserdeptnameLike(String value) {
            addCriterion("userDeptName like", value, "userdeptname");
            return (Criteria) this;
        }

        public Criteria andUserdeptnameNotLike(String value) {
            addCriterion("userDeptName not like", value, "userdeptname");
            return (Criteria) this;
        }

        public Criteria andUserdeptnameIn(List<String> values) {
            addCriterion("userDeptName in", values, "userdeptname");
            return (Criteria) this;
        }

        public Criteria andUserdeptnameNotIn(List<String> values) {
            addCriterion("userDeptName not in", values, "userdeptname");
            return (Criteria) this;
        }

        public Criteria andUserdeptnameBetween(String value1, String value2) {
            addCriterion("userDeptName between", value1, value2, "userdeptname");
            return (Criteria) this;
        }

        public Criteria andUserdeptnameNotBetween(String value1, String value2) {
            addCriterion("userDeptName not between", value1, value2, "userdeptname");
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