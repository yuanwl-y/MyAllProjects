package ywl.dto;

import java.util.ArrayList;
import java.util.List;

public class GspwVersionExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public GspwVersionExample() {
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

        public Criteria andVersionIdIsNull() {
            addCriterion("version_id is null");
            return (Criteria) this;
        }

        public Criteria andVersionIdIsNotNull() {
            addCriterion("version_id is not null");
            return (Criteria) this;
        }

        public Criteria andVersionIdEqualTo(Integer value) {
            addCriterion("version_id =", value, "versionId");
            return (Criteria) this;
        }

        public Criteria andVersionIdNotEqualTo(Integer value) {
            addCriterion("version_id <>", value, "versionId");
            return (Criteria) this;
        }

        public Criteria andVersionIdGreaterThan(Integer value) {
            addCriterion("version_id >", value, "versionId");
            return (Criteria) this;
        }

        public Criteria andVersionIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("version_id >=", value, "versionId");
            return (Criteria) this;
        }

        public Criteria andVersionIdLessThan(Integer value) {
            addCriterion("version_id <", value, "versionId");
            return (Criteria) this;
        }

        public Criteria andVersionIdLessThanOrEqualTo(Integer value) {
            addCriterion("version_id <=", value, "versionId");
            return (Criteria) this;
        }

        public Criteria andVersionIdIn(List<Integer> values) {
            addCriterion("version_id in", values, "versionId");
            return (Criteria) this;
        }

        public Criteria andVersionIdNotIn(List<Integer> values) {
            addCriterion("version_id not in", values, "versionId");
            return (Criteria) this;
        }

        public Criteria andVersionIdBetween(Integer value1, Integer value2) {
            addCriterion("version_id between", value1, value2, "versionId");
            return (Criteria) this;
        }

        public Criteria andVersionIdNotBetween(Integer value1, Integer value2) {
            addCriterion("version_id not between", value1, value2, "versionId");
            return (Criteria) this;
        }

        public Criteria andVersionNoIsNull() {
            addCriterion("version_no is null");
            return (Criteria) this;
        }

        public Criteria andVersionNoIsNotNull() {
            addCriterion("version_no is not null");
            return (Criteria) this;
        }

        public Criteria andVersionNoEqualTo(String value) {
            addCriterion("version_no =", value, "versionNo");
            return (Criteria) this;
        }

        public Criteria andVersionNoNotEqualTo(String value) {
            addCriterion("version_no <>", value, "versionNo");
            return (Criteria) this;
        }

        public Criteria andVersionNoGreaterThan(String value) {
            addCriterion("version_no >", value, "versionNo");
            return (Criteria) this;
        }

        public Criteria andVersionNoGreaterThanOrEqualTo(String value) {
            addCriterion("version_no >=", value, "versionNo");
            return (Criteria) this;
        }

        public Criteria andVersionNoLessThan(String value) {
            addCriterion("version_no <", value, "versionNo");
            return (Criteria) this;
        }

        public Criteria andVersionNoLessThanOrEqualTo(String value) {
            addCriterion("version_no <=", value, "versionNo");
            return (Criteria) this;
        }

        public Criteria andVersionNoLike(String value) {
            addCriterion("version_no like", value, "versionNo");
            return (Criteria) this;
        }

        public Criteria andVersionNoNotLike(String value) {
            addCriterion("version_no not like", value, "versionNo");
            return (Criteria) this;
        }

        public Criteria andVersionNoIn(List<String> values) {
            addCriterion("version_no in", values, "versionNo");
            return (Criteria) this;
        }

        public Criteria andVersionNoNotIn(List<String> values) {
            addCriterion("version_no not in", values, "versionNo");
            return (Criteria) this;
        }

        public Criteria andVersionNoBetween(String value1, String value2) {
            addCriterion("version_no between", value1, value2, "versionNo");
            return (Criteria) this;
        }

        public Criteria andVersionNoNotBetween(String value1, String value2) {
            addCriterion("version_no not between", value1, value2, "versionNo");
            return (Criteria) this;
        }

        public Criteria andVersionNameIsNull() {
            addCriterion("version_name is null");
            return (Criteria) this;
        }

        public Criteria andVersionNameIsNotNull() {
            addCriterion("version_name is not null");
            return (Criteria) this;
        }

        public Criteria andVersionNameEqualTo(String value) {
            addCriterion("version_name =", value, "versionName");
            return (Criteria) this;
        }

        public Criteria andVersionNameNotEqualTo(String value) {
            addCriterion("version_name <>", value, "versionName");
            return (Criteria) this;
        }

        public Criteria andVersionNameGreaterThan(String value) {
            addCriterion("version_name >", value, "versionName");
            return (Criteria) this;
        }

        public Criteria andVersionNameGreaterThanOrEqualTo(String value) {
            addCriterion("version_name >=", value, "versionName");
            return (Criteria) this;
        }

        public Criteria andVersionNameLessThan(String value) {
            addCriterion("version_name <", value, "versionName");
            return (Criteria) this;
        }

        public Criteria andVersionNameLessThanOrEqualTo(String value) {
            addCriterion("version_name <=", value, "versionName");
            return (Criteria) this;
        }

        public Criteria andVersionNameLike(String value) {
            addCriterion("version_name like", value, "versionName");
            return (Criteria) this;
        }

        public Criteria andVersionNameNotLike(String value) {
            addCriterion("version_name not like", value, "versionName");
            return (Criteria) this;
        }

        public Criteria andVersionNameIn(List<String> values) {
            addCriterion("version_name in", values, "versionName");
            return (Criteria) this;
        }

        public Criteria andVersionNameNotIn(List<String> values) {
            addCriterion("version_name not in", values, "versionName");
            return (Criteria) this;
        }

        public Criteria andVersionNameBetween(String value1, String value2) {
            addCriterion("version_name between", value1, value2, "versionName");
            return (Criteria) this;
        }

        public Criteria andVersionNameNotBetween(String value1, String value2) {
            addCriterion("version_name not between", value1, value2, "versionName");
            return (Criteria) this;
        }

        public Criteria andVersionForceIsNull() {
            addCriterion("version_force is null");
            return (Criteria) this;
        }

        public Criteria andVersionForceIsNotNull() {
            addCriterion("version_force is not null");
            return (Criteria) this;
        }

        public Criteria andVersionForceEqualTo(Integer value) {
            addCriterion("version_force =", value, "versionForce");
            return (Criteria) this;
        }

        public Criteria andVersionForceNotEqualTo(Integer value) {
            addCriterion("version_force <>", value, "versionForce");
            return (Criteria) this;
        }

        public Criteria andVersionForceGreaterThan(Integer value) {
            addCriterion("version_force >", value, "versionForce");
            return (Criteria) this;
        }

        public Criteria andVersionForceGreaterThanOrEqualTo(Integer value) {
            addCriterion("version_force >=", value, "versionForce");
            return (Criteria) this;
        }

        public Criteria andVersionForceLessThan(Integer value) {
            addCriterion("version_force <", value, "versionForce");
            return (Criteria) this;
        }

        public Criteria andVersionForceLessThanOrEqualTo(Integer value) {
            addCriterion("version_force <=", value, "versionForce");
            return (Criteria) this;
        }

        public Criteria andVersionForceIn(List<Integer> values) {
            addCriterion("version_force in", values, "versionForce");
            return (Criteria) this;
        }

        public Criteria andVersionForceNotIn(List<Integer> values) {
            addCriterion("version_force not in", values, "versionForce");
            return (Criteria) this;
        }

        public Criteria andVersionForceBetween(Integer value1, Integer value2) {
            addCriterion("version_force between", value1, value2, "versionForce");
            return (Criteria) this;
        }

        public Criteria andVersionForceNotBetween(Integer value1, Integer value2) {
            addCriterion("version_force not between", value1, value2, "versionForce");
            return (Criteria) this;
        }

        public Criteria andVersionContextIsNull() {
            addCriterion("version_context is null");
            return (Criteria) this;
        }

        public Criteria andVersionContextIsNotNull() {
            addCriterion("version_context is not null");
            return (Criteria) this;
        }

        public Criteria andVersionContextEqualTo(String value) {
            addCriterion("version_context =", value, "versionContext");
            return (Criteria) this;
        }

        public Criteria andVersionContextNotEqualTo(String value) {
            addCriterion("version_context <>", value, "versionContext");
            return (Criteria) this;
        }

        public Criteria andVersionContextGreaterThan(String value) {
            addCriterion("version_context >", value, "versionContext");
            return (Criteria) this;
        }

        public Criteria andVersionContextGreaterThanOrEqualTo(String value) {
            addCriterion("version_context >=", value, "versionContext");
            return (Criteria) this;
        }

        public Criteria andVersionContextLessThan(String value) {
            addCriterion("version_context <", value, "versionContext");
            return (Criteria) this;
        }

        public Criteria andVersionContextLessThanOrEqualTo(String value) {
            addCriterion("version_context <=", value, "versionContext");
            return (Criteria) this;
        }

        public Criteria andVersionContextLike(String value) {
            addCriterion("version_context like", value, "versionContext");
            return (Criteria) this;
        }

        public Criteria andVersionContextNotLike(String value) {
            addCriterion("version_context not like", value, "versionContext");
            return (Criteria) this;
        }

        public Criteria andVersionContextIn(List<String> values) {
            addCriterion("version_context in", values, "versionContext");
            return (Criteria) this;
        }

        public Criteria andVersionContextNotIn(List<String> values) {
            addCriterion("version_context not in", values, "versionContext");
            return (Criteria) this;
        }

        public Criteria andVersionContextBetween(String value1, String value2) {
            addCriterion("version_context between", value1, value2, "versionContext");
            return (Criteria) this;
        }

        public Criteria andVersionContextNotBetween(String value1, String value2) {
            addCriterion("version_context not between", value1, value2, "versionContext");
            return (Criteria) this;
        }

        public Criteria andVersionUrlIsNull() {
            addCriterion("version_url is null");
            return (Criteria) this;
        }

        public Criteria andVersionUrlIsNotNull() {
            addCriterion("version_url is not null");
            return (Criteria) this;
        }

        public Criteria andVersionUrlEqualTo(String value) {
            addCriterion("version_url =", value, "versionUrl");
            return (Criteria) this;
        }

        public Criteria andVersionUrlNotEqualTo(String value) {
            addCriterion("version_url <>", value, "versionUrl");
            return (Criteria) this;
        }

        public Criteria andVersionUrlGreaterThan(String value) {
            addCriterion("version_url >", value, "versionUrl");
            return (Criteria) this;
        }

        public Criteria andVersionUrlGreaterThanOrEqualTo(String value) {
            addCriterion("version_url >=", value, "versionUrl");
            return (Criteria) this;
        }

        public Criteria andVersionUrlLessThan(String value) {
            addCriterion("version_url <", value, "versionUrl");
            return (Criteria) this;
        }

        public Criteria andVersionUrlLessThanOrEqualTo(String value) {
            addCriterion("version_url <=", value, "versionUrl");
            return (Criteria) this;
        }

        public Criteria andVersionUrlLike(String value) {
            addCriterion("version_url like", value, "versionUrl");
            return (Criteria) this;
        }

        public Criteria andVersionUrlNotLike(String value) {
            addCriterion("version_url not like", value, "versionUrl");
            return (Criteria) this;
        }

        public Criteria andVersionUrlIn(List<String> values) {
            addCriterion("version_url in", values, "versionUrl");
            return (Criteria) this;
        }

        public Criteria andVersionUrlNotIn(List<String> values) {
            addCriterion("version_url not in", values, "versionUrl");
            return (Criteria) this;
        }

        public Criteria andVersionUrlBetween(String value1, String value2) {
            addCriterion("version_url between", value1, value2, "versionUrl");
            return (Criteria) this;
        }

        public Criteria andVersionUrlNotBetween(String value1, String value2) {
            addCriterion("version_url not between", value1, value2, "versionUrl");
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