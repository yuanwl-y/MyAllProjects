package ywl.dto;

import java.util.ArrayList;
import java.util.List;

public class GspwOutcompanyExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public GspwOutcompanyExample() {
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

        public Criteria andLoadedPhotoUrlIsNull() {
            addCriterion("loaded_photo_url is null");
            return (Criteria) this;
        }

        public Criteria andLoadedPhotoUrlIsNotNull() {
            addCriterion("loaded_photo_url is not null");
            return (Criteria) this;
        }

        public Criteria andLoadedPhotoUrlEqualTo(String value) {
            addCriterion("loaded_photo_url =", value, "loadedPhotoUrl");
            return (Criteria) this;
        }

        public Criteria andLoadedPhotoUrlNotEqualTo(String value) {
            addCriterion("loaded_photo_url <>", value, "loadedPhotoUrl");
            return (Criteria) this;
        }

        public Criteria andLoadedPhotoUrlGreaterThan(String value) {
            addCriterion("loaded_photo_url >", value, "loadedPhotoUrl");
            return (Criteria) this;
        }

        public Criteria andLoadedPhotoUrlGreaterThanOrEqualTo(String value) {
            addCriterion("loaded_photo_url >=", value, "loadedPhotoUrl");
            return (Criteria) this;
        }

        public Criteria andLoadedPhotoUrlLessThan(String value) {
            addCriterion("loaded_photo_url <", value, "loadedPhotoUrl");
            return (Criteria) this;
        }

        public Criteria andLoadedPhotoUrlLessThanOrEqualTo(String value) {
            addCriterion("loaded_photo_url <=", value, "loadedPhotoUrl");
            return (Criteria) this;
        }

        public Criteria andLoadedPhotoUrlLike(String value) {
            addCriterion("loaded_photo_url like", value, "loadedPhotoUrl");
            return (Criteria) this;
        }

        public Criteria andLoadedPhotoUrlNotLike(String value) {
            addCriterion("loaded_photo_url not like", value, "loadedPhotoUrl");
            return (Criteria) this;
        }

        public Criteria andLoadedPhotoUrlIn(List<String> values) {
            addCriterion("loaded_photo_url in", values, "loadedPhotoUrl");
            return (Criteria) this;
        }

        public Criteria andLoadedPhotoUrlNotIn(List<String> values) {
            addCriterion("loaded_photo_url not in", values, "loadedPhotoUrl");
            return (Criteria) this;
        }

        public Criteria andLoadedPhotoUrlBetween(String value1, String value2) {
            addCriterion("loaded_photo_url between", value1, value2, "loadedPhotoUrl");
            return (Criteria) this;
        }

        public Criteria andLoadedPhotoUrlNotBetween(String value1, String value2) {
            addCriterion("loaded_photo_url not between", value1, value2, "loadedPhotoUrl");
            return (Criteria) this;
        }

        public Criteria andSafetyPhotoUrlIsNull() {
            addCriterion("safety_photo_url is null");
            return (Criteria) this;
        }

        public Criteria andSafetyPhotoUrlIsNotNull() {
            addCriterion("safety_photo_url is not null");
            return (Criteria) this;
        }

        public Criteria andSafetyPhotoUrlEqualTo(String value) {
            addCriterion("safety_photo_url =", value, "safetyPhotoUrl");
            return (Criteria) this;
        }

        public Criteria andSafetyPhotoUrlNotEqualTo(String value) {
            addCriterion("safety_photo_url <>", value, "safetyPhotoUrl");
            return (Criteria) this;
        }

        public Criteria andSafetyPhotoUrlGreaterThan(String value) {
            addCriterion("safety_photo_url >", value, "safetyPhotoUrl");
            return (Criteria) this;
        }

        public Criteria andSafetyPhotoUrlGreaterThanOrEqualTo(String value) {
            addCriterion("safety_photo_url >=", value, "safetyPhotoUrl");
            return (Criteria) this;
        }

        public Criteria andSafetyPhotoUrlLessThan(String value) {
            addCriterion("safety_photo_url <", value, "safetyPhotoUrl");
            return (Criteria) this;
        }

        public Criteria andSafetyPhotoUrlLessThanOrEqualTo(String value) {
            addCriterion("safety_photo_url <=", value, "safetyPhotoUrl");
            return (Criteria) this;
        }

        public Criteria andSafetyPhotoUrlLike(String value) {
            addCriterion("safety_photo_url like", value, "safetyPhotoUrl");
            return (Criteria) this;
        }

        public Criteria andSafetyPhotoUrlNotLike(String value) {
            addCriterion("safety_photo_url not like", value, "safetyPhotoUrl");
            return (Criteria) this;
        }

        public Criteria andSafetyPhotoUrlIn(List<String> values) {
            addCriterion("safety_photo_url in", values, "safetyPhotoUrl");
            return (Criteria) this;
        }

        public Criteria andSafetyPhotoUrlNotIn(List<String> values) {
            addCriterion("safety_photo_url not in", values, "safetyPhotoUrl");
            return (Criteria) this;
        }

        public Criteria andSafetyPhotoUrlBetween(String value1, String value2) {
            addCriterion("safety_photo_url between", value1, value2, "safetyPhotoUrl");
            return (Criteria) this;
        }

        public Criteria andSafetyPhotoUrlNotBetween(String value1, String value2) {
            addCriterion("safety_photo_url not between", value1, value2, "safetyPhotoUrl");
            return (Criteria) this;
        }

        public Criteria andQualificationsPhothUrlIsNull() {
            addCriterion("qualifications_photh_url is null");
            return (Criteria) this;
        }

        public Criteria andQualificationsPhothUrlIsNotNull() {
            addCriterion("qualifications_photh_url is not null");
            return (Criteria) this;
        }

        public Criteria andQualificationsPhothUrlEqualTo(String value) {
            addCriterion("qualifications_photh_url =", value, "qualificationsPhothUrl");
            return (Criteria) this;
        }

        public Criteria andQualificationsPhothUrlNotEqualTo(String value) {
            addCriterion("qualifications_photh_url <>", value, "qualificationsPhothUrl");
            return (Criteria) this;
        }

        public Criteria andQualificationsPhothUrlGreaterThan(String value) {
            addCriterion("qualifications_photh_url >", value, "qualificationsPhothUrl");
            return (Criteria) this;
        }

        public Criteria andQualificationsPhothUrlGreaterThanOrEqualTo(String value) {
            addCriterion("qualifications_photh_url >=", value, "qualificationsPhothUrl");
            return (Criteria) this;
        }

        public Criteria andQualificationsPhothUrlLessThan(String value) {
            addCriterion("qualifications_photh_url <", value, "qualificationsPhothUrl");
            return (Criteria) this;
        }

        public Criteria andQualificationsPhothUrlLessThanOrEqualTo(String value) {
            addCriterion("qualifications_photh_url <=", value, "qualificationsPhothUrl");
            return (Criteria) this;
        }

        public Criteria andQualificationsPhothUrlLike(String value) {
            addCriterion("qualifications_photh_url like", value, "qualificationsPhothUrl");
            return (Criteria) this;
        }

        public Criteria andQualificationsPhothUrlNotLike(String value) {
            addCriterion("qualifications_photh_url not like", value, "qualificationsPhothUrl");
            return (Criteria) this;
        }

        public Criteria andQualificationsPhothUrlIn(List<String> values) {
            addCriterion("qualifications_photh_url in", values, "qualificationsPhothUrl");
            return (Criteria) this;
        }

        public Criteria andQualificationsPhothUrlNotIn(List<String> values) {
            addCriterion("qualifications_photh_url not in", values, "qualificationsPhothUrl");
            return (Criteria) this;
        }

        public Criteria andQualificationsPhothUrlBetween(String value1, String value2) {
            addCriterion("qualifications_photh_url between", value1, value2, "qualificationsPhothUrl");
            return (Criteria) this;
        }

        public Criteria andQualificationsPhothUrlNotBetween(String value1, String value2) {
            addCriterion("qualifications_photh_url not between", value1, value2, "qualificationsPhothUrl");
            return (Criteria) this;
        }

        public Criteria andCompanynameIsNull() {
            addCriterion("companyName is null");
            return (Criteria) this;
        }

        public Criteria andCompanynameIsNotNull() {
            addCriterion("companyName is not null");
            return (Criteria) this;
        }

        public Criteria andCompanynameEqualTo(String value) {
            addCriterion("companyName =", value, "companyname");
            return (Criteria) this;
        }

        public Criteria andCompanynameNotEqualTo(String value) {
            addCriterion("companyName <>", value, "companyname");
            return (Criteria) this;
        }

        public Criteria andCompanynameGreaterThan(String value) {
            addCriterion("companyName >", value, "companyname");
            return (Criteria) this;
        }

        public Criteria andCompanynameGreaterThanOrEqualTo(String value) {
            addCriterion("companyName >=", value, "companyname");
            return (Criteria) this;
        }

        public Criteria andCompanynameLessThan(String value) {
            addCriterion("companyName <", value, "companyname");
            return (Criteria) this;
        }

        public Criteria andCompanynameLessThanOrEqualTo(String value) {
            addCriterion("companyName <=", value, "companyname");
            return (Criteria) this;
        }

        public Criteria andCompanynameLike(String value) {
            addCriterion("companyName like", value, "companyname");
            return (Criteria) this;
        }

        public Criteria andCompanynameNotLike(String value) {
            addCriterion("companyName not like", value, "companyname");
            return (Criteria) this;
        }

        public Criteria andCompanynameIn(List<String> values) {
            addCriterion("companyName in", values, "companyname");
            return (Criteria) this;
        }

        public Criteria andCompanynameNotIn(List<String> values) {
            addCriterion("companyName not in", values, "companyname");
            return (Criteria) this;
        }

        public Criteria andCompanynameBetween(String value1, String value2) {
            addCriterion("companyName between", value1, value2, "companyname");
            return (Criteria) this;
        }

        public Criteria andCompanynameNotBetween(String value1, String value2) {
            addCriterion("companyName not between", value1, value2, "companyname");
            return (Criteria) this;
        }

        public Criteria andSubcompanyIsNull() {
            addCriterion("subCompany is null");
            return (Criteria) this;
        }

        public Criteria andSubcompanyIsNotNull() {
            addCriterion("subCompany is not null");
            return (Criteria) this;
        }

        public Criteria andSubcompanyEqualTo(String value) {
            addCriterion("subCompany =", value, "subcompany");
            return (Criteria) this;
        }

        public Criteria andSubcompanyNotEqualTo(String value) {
            addCriterion("subCompany <>", value, "subcompany");
            return (Criteria) this;
        }

        public Criteria andSubcompanyGreaterThan(String value) {
            addCriterion("subCompany >", value, "subcompany");
            return (Criteria) this;
        }

        public Criteria andSubcompanyGreaterThanOrEqualTo(String value) {
            addCriterion("subCompany >=", value, "subcompany");
            return (Criteria) this;
        }

        public Criteria andSubcompanyLessThan(String value) {
            addCriterion("subCompany <", value, "subcompany");
            return (Criteria) this;
        }

        public Criteria andSubcompanyLessThanOrEqualTo(String value) {
            addCriterion("subCompany <=", value, "subcompany");
            return (Criteria) this;
        }

        public Criteria andSubcompanyLike(String value) {
            addCriterion("subCompany like", value, "subcompany");
            return (Criteria) this;
        }

        public Criteria andSubcompanyNotLike(String value) {
            addCriterion("subCompany not like", value, "subcompany");
            return (Criteria) this;
        }

        public Criteria andSubcompanyIn(List<String> values) {
            addCriterion("subCompany in", values, "subcompany");
            return (Criteria) this;
        }

        public Criteria andSubcompanyNotIn(List<String> values) {
            addCriterion("subCompany not in", values, "subcompany");
            return (Criteria) this;
        }

        public Criteria andSubcompanyBetween(String value1, String value2) {
            addCriterion("subCompany between", value1, value2, "subcompany");
            return (Criteria) this;
        }

        public Criteria andSubcompanyNotBetween(String value1, String value2) {
            addCriterion("subCompany not between", value1, value2, "subcompany");
            return (Criteria) this;
        }

        public Criteria andLegalPersonIsNull() {
            addCriterion("legal_person is null");
            return (Criteria) this;
        }

        public Criteria andLegalPersonIsNotNull() {
            addCriterion("legal_person is not null");
            return (Criteria) this;
        }

        public Criteria andLegalPersonEqualTo(String value) {
            addCriterion("legal_person =", value, "legalPerson");
            return (Criteria) this;
        }

        public Criteria andLegalPersonNotEqualTo(String value) {
            addCriterion("legal_person <>", value, "legalPerson");
            return (Criteria) this;
        }

        public Criteria andLegalPersonGreaterThan(String value) {
            addCriterion("legal_person >", value, "legalPerson");
            return (Criteria) this;
        }

        public Criteria andLegalPersonGreaterThanOrEqualTo(String value) {
            addCriterion("legal_person >=", value, "legalPerson");
            return (Criteria) this;
        }

        public Criteria andLegalPersonLessThan(String value) {
            addCriterion("legal_person <", value, "legalPerson");
            return (Criteria) this;
        }

        public Criteria andLegalPersonLessThanOrEqualTo(String value) {
            addCriterion("legal_person <=", value, "legalPerson");
            return (Criteria) this;
        }

        public Criteria andLegalPersonLike(String value) {
            addCriterion("legal_person like", value, "legalPerson");
            return (Criteria) this;
        }

        public Criteria andLegalPersonNotLike(String value) {
            addCriterion("legal_person not like", value, "legalPerson");
            return (Criteria) this;
        }

        public Criteria andLegalPersonIn(List<String> values) {
            addCriterion("legal_person in", values, "legalPerson");
            return (Criteria) this;
        }

        public Criteria andLegalPersonNotIn(List<String> values) {
            addCriterion("legal_person not in", values, "legalPerson");
            return (Criteria) this;
        }

        public Criteria andLegalPersonBetween(String value1, String value2) {
            addCriterion("legal_person between", value1, value2, "legalPerson");
            return (Criteria) this;
        }

        public Criteria andLegalPersonNotBetween(String value1, String value2) {
            addCriterion("legal_person not between", value1, value2, "legalPerson");
            return (Criteria) this;
        }

        public Criteria andLicensePhotoUrlIsNull() {
            addCriterion("license_photo_url is null");
            return (Criteria) this;
        }

        public Criteria andLicensePhotoUrlIsNotNull() {
            addCriterion("license_photo_url is not null");
            return (Criteria) this;
        }

        public Criteria andLicensePhotoUrlEqualTo(String value) {
            addCriterion("license_photo_url =", value, "licensePhotoUrl");
            return (Criteria) this;
        }

        public Criteria andLicensePhotoUrlNotEqualTo(String value) {
            addCriterion("license_photo_url <>", value, "licensePhotoUrl");
            return (Criteria) this;
        }

        public Criteria andLicensePhotoUrlGreaterThan(String value) {
            addCriterion("license_photo_url >", value, "licensePhotoUrl");
            return (Criteria) this;
        }

        public Criteria andLicensePhotoUrlGreaterThanOrEqualTo(String value) {
            addCriterion("license_photo_url >=", value, "licensePhotoUrl");
            return (Criteria) this;
        }

        public Criteria andLicensePhotoUrlLessThan(String value) {
            addCriterion("license_photo_url <", value, "licensePhotoUrl");
            return (Criteria) this;
        }

        public Criteria andLicensePhotoUrlLessThanOrEqualTo(String value) {
            addCriterion("license_photo_url <=", value, "licensePhotoUrl");
            return (Criteria) this;
        }

        public Criteria andLicensePhotoUrlLike(String value) {
            addCriterion("license_photo_url like", value, "licensePhotoUrl");
            return (Criteria) this;
        }

        public Criteria andLicensePhotoUrlNotLike(String value) {
            addCriterion("license_photo_url not like", value, "licensePhotoUrl");
            return (Criteria) this;
        }

        public Criteria andLicensePhotoUrlIn(List<String> values) {
            addCriterion("license_photo_url in", values, "licensePhotoUrl");
            return (Criteria) this;
        }

        public Criteria andLicensePhotoUrlNotIn(List<String> values) {
            addCriterion("license_photo_url not in", values, "licensePhotoUrl");
            return (Criteria) this;
        }

        public Criteria andLicensePhotoUrlBetween(String value1, String value2) {
            addCriterion("license_photo_url between", value1, value2, "licensePhotoUrl");
            return (Criteria) this;
        }

        public Criteria andLicensePhotoUrlNotBetween(String value1, String value2) {
            addCriterion("license_photo_url not between", value1, value2, "licensePhotoUrl");
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