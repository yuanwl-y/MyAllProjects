package ywl.dto;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class GspwPlanchangeContentExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public GspwPlanchangeContentExample() {
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

        public Criteria andUuidIsNull() {
            addCriterion("uuid is null");
            return (Criteria) this;
        }

        public Criteria andUuidIsNotNull() {
            addCriterion("uuid is not null");
            return (Criteria) this;
        }

        public Criteria andUuidEqualTo(String value) {
            addCriterion("uuid =", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidNotEqualTo(String value) {
            addCriterion("uuid <>", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidGreaterThan(String value) {
            addCriterion("uuid >", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidGreaterThanOrEqualTo(String value) {
            addCriterion("uuid >=", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidLessThan(String value) {
            addCriterion("uuid <", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidLessThanOrEqualTo(String value) {
            addCriterion("uuid <=", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidLike(String value) {
            addCriterion("uuid like", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidNotLike(String value) {
            addCriterion("uuid not like", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidIn(List<String> values) {
            addCriterion("uuid in", values, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidNotIn(List<String> values) {
            addCriterion("uuid not in", values, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidBetween(String value1, String value2) {
            addCriterion("uuid between", value1, value2, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidNotBetween(String value1, String value2) {
            addCriterion("uuid not between", value1, value2, "uuid");
            return (Criteria) this;
        }

        public Criteria andConstructionplanIdIsNull() {
            addCriterion("constructionplan_id is null");
            return (Criteria) this;
        }

        public Criteria andConstructionplanIdIsNotNull() {
            addCriterion("constructionplan_id is not null");
            return (Criteria) this;
        }

        public Criteria andConstructionplanIdEqualTo(Integer value) {
            addCriterion("constructionplan_id =", value, "constructionplanId");
            return (Criteria) this;
        }

        public Criteria andConstructionplanIdNotEqualTo(Integer value) {
            addCriterion("constructionplan_id <>", value, "constructionplanId");
            return (Criteria) this;
        }

        public Criteria andConstructionplanIdGreaterThan(Integer value) {
            addCriterion("constructionplan_id >", value, "constructionplanId");
            return (Criteria) this;
        }

        public Criteria andConstructionplanIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("constructionplan_id >=", value, "constructionplanId");
            return (Criteria) this;
        }

        public Criteria andConstructionplanIdLessThan(Integer value) {
            addCriterion("constructionplan_id <", value, "constructionplanId");
            return (Criteria) this;
        }

        public Criteria andConstructionplanIdLessThanOrEqualTo(Integer value) {
            addCriterion("constructionplan_id <=", value, "constructionplanId");
            return (Criteria) this;
        }

        public Criteria andConstructionplanIdIn(List<Integer> values) {
            addCriterion("constructionplan_id in", values, "constructionplanId");
            return (Criteria) this;
        }

        public Criteria andConstructionplanIdNotIn(List<Integer> values) {
            addCriterion("constructionplan_id not in", values, "constructionplanId");
            return (Criteria) this;
        }

        public Criteria andConstructionplanIdBetween(Integer value1, Integer value2) {
            addCriterion("constructionplan_id between", value1, value2, "constructionplanId");
            return (Criteria) this;
        }

        public Criteria andConstructionplanIdNotBetween(Integer value1, Integer value2) {
            addCriterion("constructionplan_id not between", value1, value2, "constructionplanId");
            return (Criteria) this;
        }

        public Criteria andPlanchangeTypeIsNull() {
            addCriterion("planchange_type is null");
            return (Criteria) this;
        }

        public Criteria andPlanchangeTypeIsNotNull() {
            addCriterion("planchange_type is not null");
            return (Criteria) this;
        }

        public Criteria andPlanchangeTypeEqualTo(Integer value) {
            addCriterion("planchange_type =", value, "planchangeType");
            return (Criteria) this;
        }

        public Criteria andPlanchangeTypeNotEqualTo(Integer value) {
            addCriterion("planchange_type <>", value, "planchangeType");
            return (Criteria) this;
        }

        public Criteria andPlanchangeTypeGreaterThan(Integer value) {
            addCriterion("planchange_type >", value, "planchangeType");
            return (Criteria) this;
        }

        public Criteria andPlanchangeTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("planchange_type >=", value, "planchangeType");
            return (Criteria) this;
        }

        public Criteria andPlanchangeTypeLessThan(Integer value) {
            addCriterion("planchange_type <", value, "planchangeType");
            return (Criteria) this;
        }

        public Criteria andPlanchangeTypeLessThanOrEqualTo(Integer value) {
            addCriterion("planchange_type <=", value, "planchangeType");
            return (Criteria) this;
        }

        public Criteria andPlanchangeTypeIn(List<Integer> values) {
            addCriterion("planchange_type in", values, "planchangeType");
            return (Criteria) this;
        }

        public Criteria andPlanchangeTypeNotIn(List<Integer> values) {
            addCriterion("planchange_type not in", values, "planchangeType");
            return (Criteria) this;
        }

        public Criteria andPlanchangeTypeBetween(Integer value1, Integer value2) {
            addCriterion("planchange_type between", value1, value2, "planchangeType");
            return (Criteria) this;
        }

        public Criteria andPlanchangeTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("planchange_type not between", value1, value2, "planchangeType");
            return (Criteria) this;
        }

        public Criteria andPlanchangeContentIsNull() {
            addCriterion("planchange_content is null");
            return (Criteria) this;
        }

        public Criteria andPlanchangeContentIsNotNull() {
            addCriterion("planchange_content is not null");
            return (Criteria) this;
        }

        public Criteria andPlanchangeContentEqualTo(String value) {
            addCriterion("planchange_content =", value, "planchangeContent");
            return (Criteria) this;
        }

        public Criteria andPlanchangeContentNotEqualTo(String value) {
            addCriterion("planchange_content <>", value, "planchangeContent");
            return (Criteria) this;
        }

        public Criteria andPlanchangeContentGreaterThan(String value) {
            addCriterion("planchange_content >", value, "planchangeContent");
            return (Criteria) this;
        }

        public Criteria andPlanchangeContentGreaterThanOrEqualTo(String value) {
            addCriterion("planchange_content >=", value, "planchangeContent");
            return (Criteria) this;
        }

        public Criteria andPlanchangeContentLessThan(String value) {
            addCriterion("planchange_content <", value, "planchangeContent");
            return (Criteria) this;
        }

        public Criteria andPlanchangeContentLessThanOrEqualTo(String value) {
            addCriterion("planchange_content <=", value, "planchangeContent");
            return (Criteria) this;
        }

        public Criteria andPlanchangeContentLike(String value) {
            addCriterion("planchange_content like", value, "planchangeContent");
            return (Criteria) this;
        }

        public Criteria andPlanchangeContentNotLike(String value) {
            addCriterion("planchange_content not like", value, "planchangeContent");
            return (Criteria) this;
        }

        public Criteria andPlanchangeContentIn(List<String> values) {
            addCriterion("planchange_content in", values, "planchangeContent");
            return (Criteria) this;
        }

        public Criteria andPlanchangeContentNotIn(List<String> values) {
            addCriterion("planchange_content not in", values, "planchangeContent");
            return (Criteria) this;
        }

        public Criteria andPlanchangeContentBetween(String value1, String value2) {
            addCriterion("planchange_content between", value1, value2, "planchangeContent");
            return (Criteria) this;
        }

        public Criteria andPlanchangeContentNotBetween(String value1, String value2) {
            addCriterion("planchange_content not between", value1, value2, "planchangeContent");
            return (Criteria) this;
        }

        public Criteria andLastContentIsNull() {
            addCriterion("last_content is null");
            return (Criteria) this;
        }

        public Criteria andLastContentIsNotNull() {
            addCriterion("last_content is not null");
            return (Criteria) this;
        }

        public Criteria andLastContentEqualTo(String value) {
            addCriterion("last_content =", value, "lastContent");
            return (Criteria) this;
        }

        public Criteria andLastContentNotEqualTo(String value) {
            addCriterion("last_content <>", value, "lastContent");
            return (Criteria) this;
        }

        public Criteria andLastContentGreaterThan(String value) {
            addCriterion("last_content >", value, "lastContent");
            return (Criteria) this;
        }

        public Criteria andLastContentGreaterThanOrEqualTo(String value) {
            addCriterion("last_content >=", value, "lastContent");
            return (Criteria) this;
        }

        public Criteria andLastContentLessThan(String value) {
            addCriterion("last_content <", value, "lastContent");
            return (Criteria) this;
        }

        public Criteria andLastContentLessThanOrEqualTo(String value) {
            addCriterion("last_content <=", value, "lastContent");
            return (Criteria) this;
        }

        public Criteria andLastContentLike(String value) {
            addCriterion("last_content like", value, "lastContent");
            return (Criteria) this;
        }

        public Criteria andLastContentNotLike(String value) {
            addCriterion("last_content not like", value, "lastContent");
            return (Criteria) this;
        }

        public Criteria andLastContentIn(List<String> values) {
            addCriterion("last_content in", values, "lastContent");
            return (Criteria) this;
        }

        public Criteria andLastContentNotIn(List<String> values) {
            addCriterion("last_content not in", values, "lastContent");
            return (Criteria) this;
        }

        public Criteria andLastContentBetween(String value1, String value2) {
            addCriterion("last_content between", value1, value2, "lastContent");
            return (Criteria) this;
        }

        public Criteria andLastContentNotBetween(String value1, String value2) {
            addCriterion("last_content not between", value1, value2, "lastContent");
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

        public Criteria andCreateDateIsNull() {
            addCriterion("create_date is null");
            return (Criteria) this;
        }

        public Criteria andCreateDateIsNotNull() {
            addCriterion("create_date is not null");
            return (Criteria) this;
        }

        public Criteria andCreateDateEqualTo(Date value) {
            addCriterion("create_date =", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotEqualTo(Date value) {
            addCriterion("create_date <>", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThan(Date value) {
            addCriterion("create_date >", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThanOrEqualTo(Date value) {
            addCriterion("create_date >=", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThan(Date value) {
            addCriterion("create_date <", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThanOrEqualTo(Date value) {
            addCriterion("create_date <=", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateIn(List<Date> values) {
            addCriterion("create_date in", values, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotIn(List<Date> values) {
            addCriterion("create_date not in", values, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateBetween(Date value1, Date value2) {
            addCriterion("create_date between", value1, value2, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotBetween(Date value1, Date value2) {
            addCriterion("create_date not between", value1, value2, "createDate");
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