package ywl.dto;

import java.util.ArrayList;
import java.util.List;

public class GspwPreparationExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public GspwPreparationExample() {
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

        public Criteria andPreparationIdIsNull() {
            addCriterion("preparation_id is null");
            return (Criteria) this;
        }

        public Criteria andPreparationIdIsNotNull() {
            addCriterion("preparation_id is not null");
            return (Criteria) this;
        }

        public Criteria andPreparationIdEqualTo(Integer value) {
            addCriterion("preparation_id =", value, "preparationId");
            return (Criteria) this;
        }

        public Criteria andPreparationIdNotEqualTo(Integer value) {
            addCriterion("preparation_id <>", value, "preparationId");
            return (Criteria) this;
        }

        public Criteria andPreparationIdGreaterThan(Integer value) {
            addCriterion("preparation_id >", value, "preparationId");
            return (Criteria) this;
        }

        public Criteria andPreparationIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("preparation_id >=", value, "preparationId");
            return (Criteria) this;
        }

        public Criteria andPreparationIdLessThan(Integer value) {
            addCriterion("preparation_id <", value, "preparationId");
            return (Criteria) this;
        }

        public Criteria andPreparationIdLessThanOrEqualTo(Integer value) {
            addCriterion("preparation_id <=", value, "preparationId");
            return (Criteria) this;
        }

        public Criteria andPreparationIdIn(List<Integer> values) {
            addCriterion("preparation_id in", values, "preparationId");
            return (Criteria) this;
        }

        public Criteria andPreparationIdNotIn(List<Integer> values) {
            addCriterion("preparation_id not in", values, "preparationId");
            return (Criteria) this;
        }

        public Criteria andPreparationIdBetween(Integer value1, Integer value2) {
            addCriterion("preparation_id between", value1, value2, "preparationId");
            return (Criteria) this;
        }

        public Criteria andPreparationIdNotBetween(Integer value1, Integer value2) {
            addCriterion("preparation_id not between", value1, value2, "preparationId");
            return (Criteria) this;
        }

        public Criteria andPreparationConstructionplanIdIsNull() {
            addCriterion("preparation_constructionPlan_id is null");
            return (Criteria) this;
        }

        public Criteria andPreparationConstructionplanIdIsNotNull() {
            addCriterion("preparation_constructionPlan_id is not null");
            return (Criteria) this;
        }

        public Criteria andPreparationConstructionplanIdEqualTo(Integer value) {
            addCriterion("preparation_constructionPlan_id =", value, "preparationConstructionplanId");
            return (Criteria) this;
        }

        public Criteria andPreparationConstructionplanIdNotEqualTo(Integer value) {
            addCriterion("preparation_constructionPlan_id <>", value, "preparationConstructionplanId");
            return (Criteria) this;
        }

        public Criteria andPreparationConstructionplanIdGreaterThan(Integer value) {
            addCriterion("preparation_constructionPlan_id >", value, "preparationConstructionplanId");
            return (Criteria) this;
        }

        public Criteria andPreparationConstructionplanIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("preparation_constructionPlan_id >=", value, "preparationConstructionplanId");
            return (Criteria) this;
        }

        public Criteria andPreparationConstructionplanIdLessThan(Integer value) {
            addCriterion("preparation_constructionPlan_id <", value, "preparationConstructionplanId");
            return (Criteria) this;
        }

        public Criteria andPreparationConstructionplanIdLessThanOrEqualTo(Integer value) {
            addCriterion("preparation_constructionPlan_id <=", value, "preparationConstructionplanId");
            return (Criteria) this;
        }

        public Criteria andPreparationConstructionplanIdIn(List<Integer> values) {
            addCriterion("preparation_constructionPlan_id in", values, "preparationConstructionplanId");
            return (Criteria) this;
        }

        public Criteria andPreparationConstructionplanIdNotIn(List<Integer> values) {
            addCriterion("preparation_constructionPlan_id not in", values, "preparationConstructionplanId");
            return (Criteria) this;
        }

        public Criteria andPreparationConstructionplanIdBetween(Integer value1, Integer value2) {
            addCriterion("preparation_constructionPlan_id between", value1, value2, "preparationConstructionplanId");
            return (Criteria) this;
        }

        public Criteria andPreparationConstructionplanIdNotBetween(Integer value1, Integer value2) {
            addCriterion("preparation_constructionPlan_id not between", value1, value2, "preparationConstructionplanId");
            return (Criteria) this;
        }

        public Criteria andPreparationJiaodiIsNull() {
            addCriterion("preparation_jiaodi is null");
            return (Criteria) this;
        }

        public Criteria andPreparationJiaodiIsNotNull() {
            addCriterion("preparation_jiaodi is not null");
            return (Criteria) this;
        }

        public Criteria andPreparationJiaodiEqualTo(String value) {
            addCriterion("preparation_jiaodi =", value, "preparationJiaodi");
            return (Criteria) this;
        }

        public Criteria andPreparationJiaodiNotEqualTo(String value) {
            addCriterion("preparation_jiaodi <>", value, "preparationJiaodi");
            return (Criteria) this;
        }

        public Criteria andPreparationJiaodiGreaterThan(String value) {
            addCriterion("preparation_jiaodi >", value, "preparationJiaodi");
            return (Criteria) this;
        }

        public Criteria andPreparationJiaodiGreaterThanOrEqualTo(String value) {
            addCriterion("preparation_jiaodi >=", value, "preparationJiaodi");
            return (Criteria) this;
        }

        public Criteria andPreparationJiaodiLessThan(String value) {
            addCriterion("preparation_jiaodi <", value, "preparationJiaodi");
            return (Criteria) this;
        }

        public Criteria andPreparationJiaodiLessThanOrEqualTo(String value) {
            addCriterion("preparation_jiaodi <=", value, "preparationJiaodi");
            return (Criteria) this;
        }

        public Criteria andPreparationJiaodiLike(String value) {
            addCriterion("preparation_jiaodi like", value, "preparationJiaodi");
            return (Criteria) this;
        }

        public Criteria andPreparationJiaodiNotLike(String value) {
            addCriterion("preparation_jiaodi not like", value, "preparationJiaodi");
            return (Criteria) this;
        }

        public Criteria andPreparationJiaodiIn(List<String> values) {
            addCriterion("preparation_jiaodi in", values, "preparationJiaodi");
            return (Criteria) this;
        }

        public Criteria andPreparationJiaodiNotIn(List<String> values) {
            addCriterion("preparation_jiaodi not in", values, "preparationJiaodi");
            return (Criteria) this;
        }

        public Criteria andPreparationJiaodiBetween(String value1, String value2) {
            addCriterion("preparation_jiaodi between", value1, value2, "preparationJiaodi");
            return (Criteria) this;
        }

        public Criteria andPreparationJiaodiNotBetween(String value1, String value2) {
            addCriterion("preparation_jiaodi not between", value1, value2, "preparationJiaodi");
            return (Criteria) this;
        }

        public Criteria andPreparationLantuIsNull() {
            addCriterion("preparation_lantu is null");
            return (Criteria) this;
        }

        public Criteria andPreparationLantuIsNotNull() {
            addCriterion("preparation_lantu is not null");
            return (Criteria) this;
        }

        public Criteria andPreparationLantuEqualTo(String value) {
            addCriterion("preparation_lantu =", value, "preparationLantu");
            return (Criteria) this;
        }

        public Criteria andPreparationLantuNotEqualTo(String value) {
            addCriterion("preparation_lantu <>", value, "preparationLantu");
            return (Criteria) this;
        }

        public Criteria andPreparationLantuGreaterThan(String value) {
            addCriterion("preparation_lantu >", value, "preparationLantu");
            return (Criteria) this;
        }

        public Criteria andPreparationLantuGreaterThanOrEqualTo(String value) {
            addCriterion("preparation_lantu >=", value, "preparationLantu");
            return (Criteria) this;
        }

        public Criteria andPreparationLantuLessThan(String value) {
            addCriterion("preparation_lantu <", value, "preparationLantu");
            return (Criteria) this;
        }

        public Criteria andPreparationLantuLessThanOrEqualTo(String value) {
            addCriterion("preparation_lantu <=", value, "preparationLantu");
            return (Criteria) this;
        }

        public Criteria andPreparationLantuLike(String value) {
            addCriterion("preparation_lantu like", value, "preparationLantu");
            return (Criteria) this;
        }

        public Criteria andPreparationLantuNotLike(String value) {
            addCriterion("preparation_lantu not like", value, "preparationLantu");
            return (Criteria) this;
        }

        public Criteria andPreparationLantuIn(List<String> values) {
            addCriterion("preparation_lantu in", values, "preparationLantu");
            return (Criteria) this;
        }

        public Criteria andPreparationLantuNotIn(List<String> values) {
            addCriterion("preparation_lantu not in", values, "preparationLantu");
            return (Criteria) this;
        }

        public Criteria andPreparationLantuBetween(String value1, String value2) {
            addCriterion("preparation_lantu between", value1, value2, "preparationLantu");
            return (Criteria) this;
        }

        public Criteria andPreparationLantuNotBetween(String value1, String value2) {
            addCriterion("preparation_lantu not between", value1, value2, "preparationLantu");
            return (Criteria) this;
        }

        public Criteria andPreparationPiaoIsNull() {
            addCriterion("preparation_piao is null");
            return (Criteria) this;
        }

        public Criteria andPreparationPiaoIsNotNull() {
            addCriterion("preparation_piao is not null");
            return (Criteria) this;
        }

        public Criteria andPreparationPiaoEqualTo(String value) {
            addCriterion("preparation_piao =", value, "preparationPiao");
            return (Criteria) this;
        }

        public Criteria andPreparationPiaoNotEqualTo(String value) {
            addCriterion("preparation_piao <>", value, "preparationPiao");
            return (Criteria) this;
        }

        public Criteria andPreparationPiaoGreaterThan(String value) {
            addCriterion("preparation_piao >", value, "preparationPiao");
            return (Criteria) this;
        }

        public Criteria andPreparationPiaoGreaterThanOrEqualTo(String value) {
            addCriterion("preparation_piao >=", value, "preparationPiao");
            return (Criteria) this;
        }

        public Criteria andPreparationPiaoLessThan(String value) {
            addCriterion("preparation_piao <", value, "preparationPiao");
            return (Criteria) this;
        }

        public Criteria andPreparationPiaoLessThanOrEqualTo(String value) {
            addCriterion("preparation_piao <=", value, "preparationPiao");
            return (Criteria) this;
        }

        public Criteria andPreparationPiaoLike(String value) {
            addCriterion("preparation_piao like", value, "preparationPiao");
            return (Criteria) this;
        }

        public Criteria andPreparationPiaoNotLike(String value) {
            addCriterion("preparation_piao not like", value, "preparationPiao");
            return (Criteria) this;
        }

        public Criteria andPreparationPiaoIn(List<String> values) {
            addCriterion("preparation_piao in", values, "preparationPiao");
            return (Criteria) this;
        }

        public Criteria andPreparationPiaoNotIn(List<String> values) {
            addCriterion("preparation_piao not in", values, "preparationPiao");
            return (Criteria) this;
        }

        public Criteria andPreparationPiaoBetween(String value1, String value2) {
            addCriterion("preparation_piao between", value1, value2, "preparationPiao");
            return (Criteria) this;
        }

        public Criteria andPreparationPiaoNotBetween(String value1, String value2) {
            addCriterion("preparation_piao not between", value1, value2, "preparationPiao");
            return (Criteria) this;
        }

        public Criteria andPreparationJiediIsNull() {
            addCriterion("preparation_jiedi is null");
            return (Criteria) this;
        }

        public Criteria andPreparationJiediIsNotNull() {
            addCriterion("preparation_jiedi is not null");
            return (Criteria) this;
        }

        public Criteria andPreparationJiediEqualTo(String value) {
            addCriterion("preparation_jiedi =", value, "preparationJiedi");
            return (Criteria) this;
        }

        public Criteria andPreparationJiediNotEqualTo(String value) {
            addCriterion("preparation_jiedi <>", value, "preparationJiedi");
            return (Criteria) this;
        }

        public Criteria andPreparationJiediGreaterThan(String value) {
            addCriterion("preparation_jiedi >", value, "preparationJiedi");
            return (Criteria) this;
        }

        public Criteria andPreparationJiediGreaterThanOrEqualTo(String value) {
            addCriterion("preparation_jiedi >=", value, "preparationJiedi");
            return (Criteria) this;
        }

        public Criteria andPreparationJiediLessThan(String value) {
            addCriterion("preparation_jiedi <", value, "preparationJiedi");
            return (Criteria) this;
        }

        public Criteria andPreparationJiediLessThanOrEqualTo(String value) {
            addCriterion("preparation_jiedi <=", value, "preparationJiedi");
            return (Criteria) this;
        }

        public Criteria andPreparationJiediLike(String value) {
            addCriterion("preparation_jiedi like", value, "preparationJiedi");
            return (Criteria) this;
        }

        public Criteria andPreparationJiediNotLike(String value) {
            addCriterion("preparation_jiedi not like", value, "preparationJiedi");
            return (Criteria) this;
        }

        public Criteria andPreparationJiediIn(List<String> values) {
            addCriterion("preparation_jiedi in", values, "preparationJiedi");
            return (Criteria) this;
        }

        public Criteria andPreparationJiediNotIn(List<String> values) {
            addCriterion("preparation_jiedi not in", values, "preparationJiedi");
            return (Criteria) this;
        }

        public Criteria andPreparationJiediBetween(String value1, String value2) {
            addCriterion("preparation_jiedi between", value1, value2, "preparationJiedi");
            return (Criteria) this;
        }

        public Criteria andPreparationJiediNotBetween(String value1, String value2) {
            addCriterion("preparation_jiedi not between", value1, value2, "preparationJiedi");
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