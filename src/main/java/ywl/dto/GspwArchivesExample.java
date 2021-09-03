package ywl.dto;

import java.util.ArrayList;
import java.util.List;

public class GspwArchivesExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public GspwArchivesExample() {
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

        public Criteria andArchivesIdIsNull() {
            addCriterion("archives_id is null");
            return (Criteria) this;
        }

        public Criteria andArchivesIdIsNotNull() {
            addCriterion("archives_id is not null");
            return (Criteria) this;
        }

        public Criteria andArchivesIdEqualTo(Integer value) {
            addCriterion("archives_id =", value, "archivesId");
            return (Criteria) this;
        }

        public Criteria andArchivesIdNotEqualTo(Integer value) {
            addCriterion("archives_id <>", value, "archivesId");
            return (Criteria) this;
        }

        public Criteria andArchivesIdGreaterThan(Integer value) {
            addCriterion("archives_id >", value, "archivesId");
            return (Criteria) this;
        }

        public Criteria andArchivesIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("archives_id >=", value, "archivesId");
            return (Criteria) this;
        }

        public Criteria andArchivesIdLessThan(Integer value) {
            addCriterion("archives_id <", value, "archivesId");
            return (Criteria) this;
        }

        public Criteria andArchivesIdLessThanOrEqualTo(Integer value) {
            addCriterion("archives_id <=", value, "archivesId");
            return (Criteria) this;
        }

        public Criteria andArchivesIdIn(List<Integer> values) {
            addCriterion("archives_id in", values, "archivesId");
            return (Criteria) this;
        }

        public Criteria andArchivesIdNotIn(List<Integer> values) {
            addCriterion("archives_id not in", values, "archivesId");
            return (Criteria) this;
        }

        public Criteria andArchivesIdBetween(Integer value1, Integer value2) {
            addCriterion("archives_id between", value1, value2, "archivesId");
            return (Criteria) this;
        }

        public Criteria andArchivesIdNotBetween(Integer value1, Integer value2) {
            addCriterion("archives_id not between", value1, value2, "archivesId");
            return (Criteria) this;
        }

        public Criteria andArchivesNameIsNull() {
            addCriterion("archives_name is null");
            return (Criteria) this;
        }

        public Criteria andArchivesNameIsNotNull() {
            addCriterion("archives_name is not null");
            return (Criteria) this;
        }

        public Criteria andArchivesNameEqualTo(String value) {
            addCriterion("archives_name =", value, "archivesName");
            return (Criteria) this;
        }

        public Criteria andArchivesNameNotEqualTo(String value) {
            addCriterion("archives_name <>", value, "archivesName");
            return (Criteria) this;
        }

        public Criteria andArchivesNameGreaterThan(String value) {
            addCriterion("archives_name >", value, "archivesName");
            return (Criteria) this;
        }

        public Criteria andArchivesNameGreaterThanOrEqualTo(String value) {
            addCriterion("archives_name >=", value, "archivesName");
            return (Criteria) this;
        }

        public Criteria andArchivesNameLessThan(String value) {
            addCriterion("archives_name <", value, "archivesName");
            return (Criteria) this;
        }

        public Criteria andArchivesNameLessThanOrEqualTo(String value) {
            addCriterion("archives_name <=", value, "archivesName");
            return (Criteria) this;
        }

        public Criteria andArchivesNameLike(String value) {
            addCriterion("archives_name like", value, "archivesName");
            return (Criteria) this;
        }

        public Criteria andArchivesNameNotLike(String value) {
            addCriterion("archives_name not like", value, "archivesName");
            return (Criteria) this;
        }

        public Criteria andArchivesNameIn(List<String> values) {
            addCriterion("archives_name in", values, "archivesName");
            return (Criteria) this;
        }

        public Criteria andArchivesNameNotIn(List<String> values) {
            addCriterion("archives_name not in", values, "archivesName");
            return (Criteria) this;
        }

        public Criteria andArchivesNameBetween(String value1, String value2) {
            addCriterion("archives_name between", value1, value2, "archivesName");
            return (Criteria) this;
        }

        public Criteria andArchivesNameNotBetween(String value1, String value2) {
            addCriterion("archives_name not between", value1, value2, "archivesName");
            return (Criteria) this;
        }

        public Criteria andArchivesSexIsNull() {
            addCriterion("archives_sex is null");
            return (Criteria) this;
        }

        public Criteria andArchivesSexIsNotNull() {
            addCriterion("archives_sex is not null");
            return (Criteria) this;
        }

        public Criteria andArchivesSexEqualTo(String value) {
            addCriterion("archives_sex =", value, "archivesSex");
            return (Criteria) this;
        }

        public Criteria andArchivesSexNotEqualTo(String value) {
            addCriterion("archives_sex <>", value, "archivesSex");
            return (Criteria) this;
        }

        public Criteria andArchivesSexGreaterThan(String value) {
            addCriterion("archives_sex >", value, "archivesSex");
            return (Criteria) this;
        }

        public Criteria andArchivesSexGreaterThanOrEqualTo(String value) {
            addCriterion("archives_sex >=", value, "archivesSex");
            return (Criteria) this;
        }

        public Criteria andArchivesSexLessThan(String value) {
            addCriterion("archives_sex <", value, "archivesSex");
            return (Criteria) this;
        }

        public Criteria andArchivesSexLessThanOrEqualTo(String value) {
            addCriterion("archives_sex <=", value, "archivesSex");
            return (Criteria) this;
        }

        public Criteria andArchivesSexLike(String value) {
            addCriterion("archives_sex like", value, "archivesSex");
            return (Criteria) this;
        }

        public Criteria andArchivesSexNotLike(String value) {
            addCriterion("archives_sex not like", value, "archivesSex");
            return (Criteria) this;
        }

        public Criteria andArchivesSexIn(List<String> values) {
            addCriterion("archives_sex in", values, "archivesSex");
            return (Criteria) this;
        }

        public Criteria andArchivesSexNotIn(List<String> values) {
            addCriterion("archives_sex not in", values, "archivesSex");
            return (Criteria) this;
        }

        public Criteria andArchivesSexBetween(String value1, String value2) {
            addCriterion("archives_sex between", value1, value2, "archivesSex");
            return (Criteria) this;
        }

        public Criteria andArchivesSexNotBetween(String value1, String value2) {
            addCriterion("archives_sex not between", value1, value2, "archivesSex");
            return (Criteria) this;
        }

        public Criteria andArchivesAgeIsNull() {
            addCriterion("archives_age is null");
            return (Criteria) this;
        }

        public Criteria andArchivesAgeIsNotNull() {
            addCriterion("archives_age is not null");
            return (Criteria) this;
        }

        public Criteria andArchivesAgeEqualTo(String value) {
            addCriterion("archives_age =", value, "archivesAge");
            return (Criteria) this;
        }

        public Criteria andArchivesAgeNotEqualTo(String value) {
            addCriterion("archives_age <>", value, "archivesAge");
            return (Criteria) this;
        }

        public Criteria andArchivesAgeGreaterThan(String value) {
            addCriterion("archives_age >", value, "archivesAge");
            return (Criteria) this;
        }

        public Criteria andArchivesAgeGreaterThanOrEqualTo(String value) {
            addCriterion("archives_age >=", value, "archivesAge");
            return (Criteria) this;
        }

        public Criteria andArchivesAgeLessThan(String value) {
            addCriterion("archives_age <", value, "archivesAge");
            return (Criteria) this;
        }

        public Criteria andArchivesAgeLessThanOrEqualTo(String value) {
            addCriterion("archives_age <=", value, "archivesAge");
            return (Criteria) this;
        }

        public Criteria andArchivesAgeLike(String value) {
            addCriterion("archives_age like", value, "archivesAge");
            return (Criteria) this;
        }

        public Criteria andArchivesAgeNotLike(String value) {
            addCriterion("archives_age not like", value, "archivesAge");
            return (Criteria) this;
        }

        public Criteria andArchivesAgeIn(List<String> values) {
            addCriterion("archives_age in", values, "archivesAge");
            return (Criteria) this;
        }

        public Criteria andArchivesAgeNotIn(List<String> values) {
            addCriterion("archives_age not in", values, "archivesAge");
            return (Criteria) this;
        }

        public Criteria andArchivesAgeBetween(String value1, String value2) {
            addCriterion("archives_age between", value1, value2, "archivesAge");
            return (Criteria) this;
        }

        public Criteria andArchivesAgeNotBetween(String value1, String value2) {
            addCriterion("archives_age not between", value1, value2, "archivesAge");
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

        public Criteria andUserOrgcodeIsNull() {
            addCriterion("user_orgCode is null");
            return (Criteria) this;
        }

        public Criteria andUserOrgcodeIsNotNull() {
            addCriterion("user_orgCode is not null");
            return (Criteria) this;
        }

        public Criteria andUserOrgcodeEqualTo(String value) {
            addCriterion("user_orgCode =", value, "userOrgcode");
            return (Criteria) this;
        }

        public Criteria andUserOrgcodeNotEqualTo(String value) {
            addCriterion("user_orgCode <>", value, "userOrgcode");
            return (Criteria) this;
        }

        public Criteria andUserOrgcodeGreaterThan(String value) {
            addCriterion("user_orgCode >", value, "userOrgcode");
            return (Criteria) this;
        }

        public Criteria andUserOrgcodeGreaterThanOrEqualTo(String value) {
            addCriterion("user_orgCode >=", value, "userOrgcode");
            return (Criteria) this;
        }

        public Criteria andUserOrgcodeLessThan(String value) {
            addCriterion("user_orgCode <", value, "userOrgcode");
            return (Criteria) this;
        }

        public Criteria andUserOrgcodeLessThanOrEqualTo(String value) {
            addCriterion("user_orgCode <=", value, "userOrgcode");
            return (Criteria) this;
        }

        public Criteria andUserOrgcodeLike(String value) {
            addCriterion("user_orgCode like", value, "userOrgcode");
            return (Criteria) this;
        }

        public Criteria andUserOrgcodeNotLike(String value) {
            addCriterion("user_orgCode not like", value, "userOrgcode");
            return (Criteria) this;
        }

        public Criteria andUserOrgcodeIn(List<String> values) {
            addCriterion("user_orgCode in", values, "userOrgcode");
            return (Criteria) this;
        }

        public Criteria andUserOrgcodeNotIn(List<String> values) {
            addCriterion("user_orgCode not in", values, "userOrgcode");
            return (Criteria) this;
        }

        public Criteria andUserOrgcodeBetween(String value1, String value2) {
            addCriterion("user_orgCode between", value1, value2, "userOrgcode");
            return (Criteria) this;
        }

        public Criteria andUserOrgcodeNotBetween(String value1, String value2) {
            addCriterion("user_orgCode not between", value1, value2, "userOrgcode");
            return (Criteria) this;
        }

        public Criteria andUserDeptIsNull() {
            addCriterion("user_dept is null");
            return (Criteria) this;
        }

        public Criteria andUserDeptIsNotNull() {
            addCriterion("user_dept is not null");
            return (Criteria) this;
        }

        public Criteria andUserDeptEqualTo(String value) {
            addCriterion("user_dept =", value, "userDept");
            return (Criteria) this;
        }

        public Criteria andUserDeptNotEqualTo(String value) {
            addCriterion("user_dept <>", value, "userDept");
            return (Criteria) this;
        }

        public Criteria andUserDeptGreaterThan(String value) {
            addCriterion("user_dept >", value, "userDept");
            return (Criteria) this;
        }

        public Criteria andUserDeptGreaterThanOrEqualTo(String value) {
            addCriterion("user_dept >=", value, "userDept");
            return (Criteria) this;
        }

        public Criteria andUserDeptLessThan(String value) {
            addCriterion("user_dept <", value, "userDept");
            return (Criteria) this;
        }

        public Criteria andUserDeptLessThanOrEqualTo(String value) {
            addCriterion("user_dept <=", value, "userDept");
            return (Criteria) this;
        }

        public Criteria andUserDeptLike(String value) {
            addCriterion("user_dept like", value, "userDept");
            return (Criteria) this;
        }

        public Criteria andUserDeptNotLike(String value) {
            addCriterion("user_dept not like", value, "userDept");
            return (Criteria) this;
        }

        public Criteria andUserDeptIn(List<String> values) {
            addCriterion("user_dept in", values, "userDept");
            return (Criteria) this;
        }

        public Criteria andUserDeptNotIn(List<String> values) {
            addCriterion("user_dept not in", values, "userDept");
            return (Criteria) this;
        }

        public Criteria andUserDeptBetween(String value1, String value2) {
            addCriterion("user_dept between", value1, value2, "userDept");
            return (Criteria) this;
        }

        public Criteria andUserDeptNotBetween(String value1, String value2) {
            addCriterion("user_dept not between", value1, value2, "userDept");
            return (Criteria) this;
        }

        public Criteria andUserDeptcodeIsNull() {
            addCriterion("user_deptCode is null");
            return (Criteria) this;
        }

        public Criteria andUserDeptcodeIsNotNull() {
            addCriterion("user_deptCode is not null");
            return (Criteria) this;
        }

        public Criteria andUserDeptcodeEqualTo(String value) {
            addCriterion("user_deptCode =", value, "userDeptcode");
            return (Criteria) this;
        }

        public Criteria andUserDeptcodeNotEqualTo(String value) {
            addCriterion("user_deptCode <>", value, "userDeptcode");
            return (Criteria) this;
        }

        public Criteria andUserDeptcodeGreaterThan(String value) {
            addCriterion("user_deptCode >", value, "userDeptcode");
            return (Criteria) this;
        }

        public Criteria andUserDeptcodeGreaterThanOrEqualTo(String value) {
            addCriterion("user_deptCode >=", value, "userDeptcode");
            return (Criteria) this;
        }

        public Criteria andUserDeptcodeLessThan(String value) {
            addCriterion("user_deptCode <", value, "userDeptcode");
            return (Criteria) this;
        }

        public Criteria andUserDeptcodeLessThanOrEqualTo(String value) {
            addCriterion("user_deptCode <=", value, "userDeptcode");
            return (Criteria) this;
        }

        public Criteria andUserDeptcodeLike(String value) {
            addCriterion("user_deptCode like", value, "userDeptcode");
            return (Criteria) this;
        }

        public Criteria andUserDeptcodeNotLike(String value) {
            addCriterion("user_deptCode not like", value, "userDeptcode");
            return (Criteria) this;
        }

        public Criteria andUserDeptcodeIn(List<String> values) {
            addCriterion("user_deptCode in", values, "userDeptcode");
            return (Criteria) this;
        }

        public Criteria andUserDeptcodeNotIn(List<String> values) {
            addCriterion("user_deptCode not in", values, "userDeptcode");
            return (Criteria) this;
        }

        public Criteria andUserDeptcodeBetween(String value1, String value2) {
            addCriterion("user_deptCode between", value1, value2, "userDeptcode");
            return (Criteria) this;
        }

        public Criteria andUserDeptcodeNotBetween(String value1, String value2) {
            addCriterion("user_deptCode not between", value1, value2, "userDeptcode");
            return (Criteria) this;
        }

        public Criteria andUserTypeIsNull() {
            addCriterion("user_type is null");
            return (Criteria) this;
        }

        public Criteria andUserTypeIsNotNull() {
            addCriterion("user_type is not null");
            return (Criteria) this;
        }

        public Criteria andUserTypeEqualTo(String value) {
            addCriterion("user_type =", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeNotEqualTo(String value) {
            addCriterion("user_type <>", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeGreaterThan(String value) {
            addCriterion("user_type >", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeGreaterThanOrEqualTo(String value) {
            addCriterion("user_type >=", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeLessThan(String value) {
            addCriterion("user_type <", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeLessThanOrEqualTo(String value) {
            addCriterion("user_type <=", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeLike(String value) {
            addCriterion("user_type like", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeNotLike(String value) {
            addCriterion("user_type not like", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeIn(List<String> values) {
            addCriterion("user_type in", values, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeNotIn(List<String> values) {
            addCriterion("user_type not in", values, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeBetween(String value1, String value2) {
            addCriterion("user_type between", value1, value2, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeNotBetween(String value1, String value2) {
            addCriterion("user_type not between", value1, value2, "userType");
            return (Criteria) this;
        }

        public Criteria andArchivesCertificateTypeIsNull() {
            addCriterion("archives_certificate_type is null");
            return (Criteria) this;
        }

        public Criteria andArchivesCertificateTypeIsNotNull() {
            addCriterion("archives_certificate_type is not null");
            return (Criteria) this;
        }

        public Criteria andArchivesCertificateTypeEqualTo(String value) {
            addCriterion("archives_certificate_type =", value, "archivesCertificateType");
            return (Criteria) this;
        }

        public Criteria andArchivesCertificateTypeNotEqualTo(String value) {
            addCriterion("archives_certificate_type <>", value, "archivesCertificateType");
            return (Criteria) this;
        }

        public Criteria andArchivesCertificateTypeGreaterThan(String value) {
            addCriterion("archives_certificate_type >", value, "archivesCertificateType");
            return (Criteria) this;
        }

        public Criteria andArchivesCertificateTypeGreaterThanOrEqualTo(String value) {
            addCriterion("archives_certificate_type >=", value, "archivesCertificateType");
            return (Criteria) this;
        }

        public Criteria andArchivesCertificateTypeLessThan(String value) {
            addCriterion("archives_certificate_type <", value, "archivesCertificateType");
            return (Criteria) this;
        }

        public Criteria andArchivesCertificateTypeLessThanOrEqualTo(String value) {
            addCriterion("archives_certificate_type <=", value, "archivesCertificateType");
            return (Criteria) this;
        }

        public Criteria andArchivesCertificateTypeLike(String value) {
            addCriterion("archives_certificate_type like", value, "archivesCertificateType");
            return (Criteria) this;
        }

        public Criteria andArchivesCertificateTypeNotLike(String value) {
            addCriterion("archives_certificate_type not like", value, "archivesCertificateType");
            return (Criteria) this;
        }

        public Criteria andArchivesCertificateTypeIn(List<String> values) {
            addCriterion("archives_certificate_type in", values, "archivesCertificateType");
            return (Criteria) this;
        }

        public Criteria andArchivesCertificateTypeNotIn(List<String> values) {
            addCriterion("archives_certificate_type not in", values, "archivesCertificateType");
            return (Criteria) this;
        }

        public Criteria andArchivesCertificateTypeBetween(String value1, String value2) {
            addCriterion("archives_certificate_type between", value1, value2, "archivesCertificateType");
            return (Criteria) this;
        }

        public Criteria andArchivesCertificateTypeNotBetween(String value1, String value2) {
            addCriterion("archives_certificate_type not between", value1, value2, "archivesCertificateType");
            return (Criteria) this;
        }

        public Criteria andArchivesCertificateNumberIsNull() {
            addCriterion("archives_certificate_number is null");
            return (Criteria) this;
        }

        public Criteria andArchivesCertificateNumberIsNotNull() {
            addCriterion("archives_certificate_number is not null");
            return (Criteria) this;
        }

        public Criteria andArchivesCertificateNumberEqualTo(String value) {
            addCriterion("archives_certificate_number =", value, "archivesCertificateNumber");
            return (Criteria) this;
        }

        public Criteria andArchivesCertificateNumberNotEqualTo(String value) {
            addCriterion("archives_certificate_number <>", value, "archivesCertificateNumber");
            return (Criteria) this;
        }

        public Criteria andArchivesCertificateNumberGreaterThan(String value) {
            addCriterion("archives_certificate_number >", value, "archivesCertificateNumber");
            return (Criteria) this;
        }

        public Criteria andArchivesCertificateNumberGreaterThanOrEqualTo(String value) {
            addCriterion("archives_certificate_number >=", value, "archivesCertificateNumber");
            return (Criteria) this;
        }

        public Criteria andArchivesCertificateNumberLessThan(String value) {
            addCriterion("archives_certificate_number <", value, "archivesCertificateNumber");
            return (Criteria) this;
        }

        public Criteria andArchivesCertificateNumberLessThanOrEqualTo(String value) {
            addCriterion("archives_certificate_number <=", value, "archivesCertificateNumber");
            return (Criteria) this;
        }

        public Criteria andArchivesCertificateNumberLike(String value) {
            addCriterion("archives_certificate_number like", value, "archivesCertificateNumber");
            return (Criteria) this;
        }

        public Criteria andArchivesCertificateNumberNotLike(String value) {
            addCriterion("archives_certificate_number not like", value, "archivesCertificateNumber");
            return (Criteria) this;
        }

        public Criteria andArchivesCertificateNumberIn(List<String> values) {
            addCriterion("archives_certificate_number in", values, "archivesCertificateNumber");
            return (Criteria) this;
        }

        public Criteria andArchivesCertificateNumberNotIn(List<String> values) {
            addCriterion("archives_certificate_number not in", values, "archivesCertificateNumber");
            return (Criteria) this;
        }

        public Criteria andArchivesCertificateNumberBetween(String value1, String value2) {
            addCriterion("archives_certificate_number between", value1, value2, "archivesCertificateNumber");
            return (Criteria) this;
        }

        public Criteria andArchivesCertificateNumberNotBetween(String value1, String value2) {
            addCriterion("archives_certificate_number not between", value1, value2, "archivesCertificateNumber");
            return (Criteria) this;
        }

        public Criteria andArchivesTestStateIsNull() {
            addCriterion("archives_test_state is null");
            return (Criteria) this;
        }

        public Criteria andArchivesTestStateIsNotNull() {
            addCriterion("archives_test_state is not null");
            return (Criteria) this;
        }

        public Criteria andArchivesTestStateEqualTo(String value) {
            addCriterion("archives_test_state =", value, "archivesTestState");
            return (Criteria) this;
        }

        public Criteria andArchivesTestStateNotEqualTo(String value) {
            addCriterion("archives_test_state <>", value, "archivesTestState");
            return (Criteria) this;
        }

        public Criteria andArchivesTestStateGreaterThan(String value) {
            addCriterion("archives_test_state >", value, "archivesTestState");
            return (Criteria) this;
        }

        public Criteria andArchivesTestStateGreaterThanOrEqualTo(String value) {
            addCriterion("archives_test_state >=", value, "archivesTestState");
            return (Criteria) this;
        }

        public Criteria andArchivesTestStateLessThan(String value) {
            addCriterion("archives_test_state <", value, "archivesTestState");
            return (Criteria) this;
        }

        public Criteria andArchivesTestStateLessThanOrEqualTo(String value) {
            addCriterion("archives_test_state <=", value, "archivesTestState");
            return (Criteria) this;
        }

        public Criteria andArchivesTestStateLike(String value) {
            addCriterion("archives_test_state like", value, "archivesTestState");
            return (Criteria) this;
        }

        public Criteria andArchivesTestStateNotLike(String value) {
            addCriterion("archives_test_state not like", value, "archivesTestState");
            return (Criteria) this;
        }

        public Criteria andArchivesTestStateIn(List<String> values) {
            addCriterion("archives_test_state in", values, "archivesTestState");
            return (Criteria) this;
        }

        public Criteria andArchivesTestStateNotIn(List<String> values) {
            addCriterion("archives_test_state not in", values, "archivesTestState");
            return (Criteria) this;
        }

        public Criteria andArchivesTestStateBetween(String value1, String value2) {
            addCriterion("archives_test_state between", value1, value2, "archivesTestState");
            return (Criteria) this;
        }

        public Criteria andArchivesTestStateNotBetween(String value1, String value2) {
            addCriterion("archives_test_state not between", value1, value2, "archivesTestState");
            return (Criteria) this;
        }

        public Criteria andArchivesInsuranceStateIsNull() {
            addCriterion("archives_insurance_state is null");
            return (Criteria) this;
        }

        public Criteria andArchivesInsuranceStateIsNotNull() {
            addCriterion("archives_insurance_state is not null");
            return (Criteria) this;
        }

        public Criteria andArchivesInsuranceStateEqualTo(String value) {
            addCriterion("archives_insurance_state =", value, "archivesInsuranceState");
            return (Criteria) this;
        }

        public Criteria andArchivesInsuranceStateNotEqualTo(String value) {
            addCriterion("archives_insurance_state <>", value, "archivesInsuranceState");
            return (Criteria) this;
        }

        public Criteria andArchivesInsuranceStateGreaterThan(String value) {
            addCriterion("archives_insurance_state >", value, "archivesInsuranceState");
            return (Criteria) this;
        }

        public Criteria andArchivesInsuranceStateGreaterThanOrEqualTo(String value) {
            addCriterion("archives_insurance_state >=", value, "archivesInsuranceState");
            return (Criteria) this;
        }

        public Criteria andArchivesInsuranceStateLessThan(String value) {
            addCriterion("archives_insurance_state <", value, "archivesInsuranceState");
            return (Criteria) this;
        }

        public Criteria andArchivesInsuranceStateLessThanOrEqualTo(String value) {
            addCriterion("archives_insurance_state <=", value, "archivesInsuranceState");
            return (Criteria) this;
        }

        public Criteria andArchivesInsuranceStateLike(String value) {
            addCriterion("archives_insurance_state like", value, "archivesInsuranceState");
            return (Criteria) this;
        }

        public Criteria andArchivesInsuranceStateNotLike(String value) {
            addCriterion("archives_insurance_state not like", value, "archivesInsuranceState");
            return (Criteria) this;
        }

        public Criteria andArchivesInsuranceStateIn(List<String> values) {
            addCriterion("archives_insurance_state in", values, "archivesInsuranceState");
            return (Criteria) this;
        }

        public Criteria andArchivesInsuranceStateNotIn(List<String> values) {
            addCriterion("archives_insurance_state not in", values, "archivesInsuranceState");
            return (Criteria) this;
        }

        public Criteria andArchivesInsuranceStateBetween(String value1, String value2) {
            addCriterion("archives_insurance_state between", value1, value2, "archivesInsuranceState");
            return (Criteria) this;
        }

        public Criteria andArchivesInsuranceStateNotBetween(String value1, String value2) {
            addCriterion("archives_insurance_state not between", value1, value2, "archivesInsuranceState");
            return (Criteria) this;
        }

        public Criteria andArchivesPhysicalStateIsNull() {
            addCriterion("archives_physical_state is null");
            return (Criteria) this;
        }

        public Criteria andArchivesPhysicalStateIsNotNull() {
            addCriterion("archives_physical_state is not null");
            return (Criteria) this;
        }

        public Criteria andArchivesPhysicalStateEqualTo(String value) {
            addCriterion("archives_physical_state =", value, "archivesPhysicalState");
            return (Criteria) this;
        }

        public Criteria andArchivesPhysicalStateNotEqualTo(String value) {
            addCriterion("archives_physical_state <>", value, "archivesPhysicalState");
            return (Criteria) this;
        }

        public Criteria andArchivesPhysicalStateGreaterThan(String value) {
            addCriterion("archives_physical_state >", value, "archivesPhysicalState");
            return (Criteria) this;
        }

        public Criteria andArchivesPhysicalStateGreaterThanOrEqualTo(String value) {
            addCriterion("archives_physical_state >=", value, "archivesPhysicalState");
            return (Criteria) this;
        }

        public Criteria andArchivesPhysicalStateLessThan(String value) {
            addCriterion("archives_physical_state <", value, "archivesPhysicalState");
            return (Criteria) this;
        }

        public Criteria andArchivesPhysicalStateLessThanOrEqualTo(String value) {
            addCriterion("archives_physical_state <=", value, "archivesPhysicalState");
            return (Criteria) this;
        }

        public Criteria andArchivesPhysicalStateLike(String value) {
            addCriterion("archives_physical_state like", value, "archivesPhysicalState");
            return (Criteria) this;
        }

        public Criteria andArchivesPhysicalStateNotLike(String value) {
            addCriterion("archives_physical_state not like", value, "archivesPhysicalState");
            return (Criteria) this;
        }

        public Criteria andArchivesPhysicalStateIn(List<String> values) {
            addCriterion("archives_physical_state in", values, "archivesPhysicalState");
            return (Criteria) this;
        }

        public Criteria andArchivesPhysicalStateNotIn(List<String> values) {
            addCriterion("archives_physical_state not in", values, "archivesPhysicalState");
            return (Criteria) this;
        }

        public Criteria andArchivesPhysicalStateBetween(String value1, String value2) {
            addCriterion("archives_physical_state between", value1, value2, "archivesPhysicalState");
            return (Criteria) this;
        }

        public Criteria andArchivesPhysicalStateNotBetween(String value1, String value2) {
            addCriterion("archives_physical_state not between", value1, value2, "archivesPhysicalState");
            return (Criteria) this;
        }

        public Criteria andArchivesStateIsNull() {
            addCriterion("archives_state is null");
            return (Criteria) this;
        }

        public Criteria andArchivesStateIsNotNull() {
            addCriterion("archives_state is not null");
            return (Criteria) this;
        }

        public Criteria andArchivesStateEqualTo(String value) {
            addCriterion("archives_state =", value, "archivesState");
            return (Criteria) this;
        }

        public Criteria andArchivesStateNotEqualTo(String value) {
            addCriterion("archives_state <>", value, "archivesState");
            return (Criteria) this;
        }

        public Criteria andArchivesStateGreaterThan(String value) {
            addCriterion("archives_state >", value, "archivesState");
            return (Criteria) this;
        }

        public Criteria andArchivesStateGreaterThanOrEqualTo(String value) {
            addCriterion("archives_state >=", value, "archivesState");
            return (Criteria) this;
        }

        public Criteria andArchivesStateLessThan(String value) {
            addCriterion("archives_state <", value, "archivesState");
            return (Criteria) this;
        }

        public Criteria andArchivesStateLessThanOrEqualTo(String value) {
            addCriterion("archives_state <=", value, "archivesState");
            return (Criteria) this;
        }

        public Criteria andArchivesStateLike(String value) {
            addCriterion("archives_state like", value, "archivesState");
            return (Criteria) this;
        }

        public Criteria andArchivesStateNotLike(String value) {
            addCriterion("archives_state not like", value, "archivesState");
            return (Criteria) this;
        }

        public Criteria andArchivesStateIn(List<String> values) {
            addCriterion("archives_state in", values, "archivesState");
            return (Criteria) this;
        }

        public Criteria andArchivesStateNotIn(List<String> values) {
            addCriterion("archives_state not in", values, "archivesState");
            return (Criteria) this;
        }

        public Criteria andArchivesStateBetween(String value1, String value2) {
            addCriterion("archives_state between", value1, value2, "archivesState");
            return (Criteria) this;
        }

        public Criteria andArchivesStateNotBetween(String value1, String value2) {
            addCriterion("archives_state not between", value1, value2, "archivesState");
            return (Criteria) this;
        }

        public Criteria andArchivesPhotoIsNull() {
            addCriterion("archives_photo is null");
            return (Criteria) this;
        }

        public Criteria andArchivesPhotoIsNotNull() {
            addCriterion("archives_photo is not null");
            return (Criteria) this;
        }

        public Criteria andArchivesPhotoEqualTo(String value) {
            addCriterion("archives_photo =", value, "archivesPhoto");
            return (Criteria) this;
        }

        public Criteria andArchivesPhotoNotEqualTo(String value) {
            addCriterion("archives_photo <>", value, "archivesPhoto");
            return (Criteria) this;
        }

        public Criteria andArchivesPhotoGreaterThan(String value) {
            addCriterion("archives_photo >", value, "archivesPhoto");
            return (Criteria) this;
        }

        public Criteria andArchivesPhotoGreaterThanOrEqualTo(String value) {
            addCriterion("archives_photo >=", value, "archivesPhoto");
            return (Criteria) this;
        }

        public Criteria andArchivesPhotoLessThan(String value) {
            addCriterion("archives_photo <", value, "archivesPhoto");
            return (Criteria) this;
        }

        public Criteria andArchivesPhotoLessThanOrEqualTo(String value) {
            addCriterion("archives_photo <=", value, "archivesPhoto");
            return (Criteria) this;
        }

        public Criteria andArchivesPhotoLike(String value) {
            addCriterion("archives_photo like", value, "archivesPhoto");
            return (Criteria) this;
        }

        public Criteria andArchivesPhotoNotLike(String value) {
            addCriterion("archives_photo not like", value, "archivesPhoto");
            return (Criteria) this;
        }

        public Criteria andArchivesPhotoIn(List<String> values) {
            addCriterion("archives_photo in", values, "archivesPhoto");
            return (Criteria) this;
        }

        public Criteria andArchivesPhotoNotIn(List<String> values) {
            addCriterion("archives_photo not in", values, "archivesPhoto");
            return (Criteria) this;
        }

        public Criteria andArchivesPhotoBetween(String value1, String value2) {
            addCriterion("archives_photo between", value1, value2, "archivesPhoto");
            return (Criteria) this;
        }

        public Criteria andArchivesPhotoNotBetween(String value1, String value2) {
            addCriterion("archives_photo not between", value1, value2, "archivesPhoto");
            return (Criteria) this;
        }

        public Criteria andArchivesPhotoUrIsNull() {
            addCriterion("archives_photo_ur is null");
            return (Criteria) this;
        }

        public Criteria andArchivesPhotoUrIsNotNull() {
            addCriterion("archives_photo_ur is not null");
            return (Criteria) this;
        }

        public Criteria andArchivesPhotoUrEqualTo(String value) {
            addCriterion("archives_photo_ur =", value, "archivesPhotoUr");
            return (Criteria) this;
        }

        public Criteria andArchivesPhotoUrNotEqualTo(String value) {
            addCriterion("archives_photo_ur <>", value, "archivesPhotoUr");
            return (Criteria) this;
        }

        public Criteria andArchivesPhotoUrGreaterThan(String value) {
            addCriterion("archives_photo_ur >", value, "archivesPhotoUr");
            return (Criteria) this;
        }

        public Criteria andArchivesPhotoUrGreaterThanOrEqualTo(String value) {
            addCriterion("archives_photo_ur >=", value, "archivesPhotoUr");
            return (Criteria) this;
        }

        public Criteria andArchivesPhotoUrLessThan(String value) {
            addCriterion("archives_photo_ur <", value, "archivesPhotoUr");
            return (Criteria) this;
        }

        public Criteria andArchivesPhotoUrLessThanOrEqualTo(String value) {
            addCriterion("archives_photo_ur <=", value, "archivesPhotoUr");
            return (Criteria) this;
        }

        public Criteria andArchivesPhotoUrLike(String value) {
            addCriterion("archives_photo_ur like", value, "archivesPhotoUr");
            return (Criteria) this;
        }

        public Criteria andArchivesPhotoUrNotLike(String value) {
            addCriterion("archives_photo_ur not like", value, "archivesPhotoUr");
            return (Criteria) this;
        }

        public Criteria andArchivesPhotoUrIn(List<String> values) {
            addCriterion("archives_photo_ur in", values, "archivesPhotoUr");
            return (Criteria) this;
        }

        public Criteria andArchivesPhotoUrNotIn(List<String> values) {
            addCriterion("archives_photo_ur not in", values, "archivesPhotoUr");
            return (Criteria) this;
        }

        public Criteria andArchivesPhotoUrBetween(String value1, String value2) {
            addCriterion("archives_photo_ur between", value1, value2, "archivesPhotoUr");
            return (Criteria) this;
        }

        public Criteria andArchivesPhotoUrNotBetween(String value1, String value2) {
            addCriterion("archives_photo_ur not between", value1, value2, "archivesPhotoUr");
            return (Criteria) this;
        }

        public Criteria andArchivesCodeIsNull() {
            addCriterion("archives_code is null");
            return (Criteria) this;
        }

        public Criteria andArchivesCodeIsNotNull() {
            addCriterion("archives_code is not null");
            return (Criteria) this;
        }

        public Criteria andArchivesCodeEqualTo(String value) {
            addCriterion("archives_code =", value, "archivesCode");
            return (Criteria) this;
        }

        public Criteria andArchivesCodeNotEqualTo(String value) {
            addCriterion("archives_code <>", value, "archivesCode");
            return (Criteria) this;
        }

        public Criteria andArchivesCodeGreaterThan(String value) {
            addCriterion("archives_code >", value, "archivesCode");
            return (Criteria) this;
        }

        public Criteria andArchivesCodeGreaterThanOrEqualTo(String value) {
            addCriterion("archives_code >=", value, "archivesCode");
            return (Criteria) this;
        }

        public Criteria andArchivesCodeLessThan(String value) {
            addCriterion("archives_code <", value, "archivesCode");
            return (Criteria) this;
        }

        public Criteria andArchivesCodeLessThanOrEqualTo(String value) {
            addCriterion("archives_code <=", value, "archivesCode");
            return (Criteria) this;
        }

        public Criteria andArchivesCodeLike(String value) {
            addCriterion("archives_code like", value, "archivesCode");
            return (Criteria) this;
        }

        public Criteria andArchivesCodeNotLike(String value) {
            addCriterion("archives_code not like", value, "archivesCode");
            return (Criteria) this;
        }

        public Criteria andArchivesCodeIn(List<String> values) {
            addCriterion("archives_code in", values, "archivesCode");
            return (Criteria) this;
        }

        public Criteria andArchivesCodeNotIn(List<String> values) {
            addCriterion("archives_code not in", values, "archivesCode");
            return (Criteria) this;
        }

        public Criteria andArchivesCodeBetween(String value1, String value2) {
            addCriterion("archives_code between", value1, value2, "archivesCode");
            return (Criteria) this;
        }

        public Criteria andArchivesCodeNotBetween(String value1, String value2) {
            addCriterion("archives_code not between", value1, value2, "archivesCode");
            return (Criteria) this;
        }

        public Criteria andUserWorkcodeIsNull() {
            addCriterion("user_workCode is null");
            return (Criteria) this;
        }

        public Criteria andUserWorkcodeIsNotNull() {
            addCriterion("user_workCode is not null");
            return (Criteria) this;
        }

        public Criteria andUserWorkcodeEqualTo(String value) {
            addCriterion("user_workCode =", value, "userWorkcode");
            return (Criteria) this;
        }

        public Criteria andUserWorkcodeNotEqualTo(String value) {
            addCriterion("user_workCode <>", value, "userWorkcode");
            return (Criteria) this;
        }

        public Criteria andUserWorkcodeGreaterThan(String value) {
            addCriterion("user_workCode >", value, "userWorkcode");
            return (Criteria) this;
        }

        public Criteria andUserWorkcodeGreaterThanOrEqualTo(String value) {
            addCriterion("user_workCode >=", value, "userWorkcode");
            return (Criteria) this;
        }

        public Criteria andUserWorkcodeLessThan(String value) {
            addCriterion("user_workCode <", value, "userWorkcode");
            return (Criteria) this;
        }

        public Criteria andUserWorkcodeLessThanOrEqualTo(String value) {
            addCriterion("user_workCode <=", value, "userWorkcode");
            return (Criteria) this;
        }

        public Criteria andUserWorkcodeLike(String value) {
            addCriterion("user_workCode like", value, "userWorkcode");
            return (Criteria) this;
        }

        public Criteria andUserWorkcodeNotLike(String value) {
            addCriterion("user_workCode not like", value, "userWorkcode");
            return (Criteria) this;
        }

        public Criteria andUserWorkcodeIn(List<String> values) {
            addCriterion("user_workCode in", values, "userWorkcode");
            return (Criteria) this;
        }

        public Criteria andUserWorkcodeNotIn(List<String> values) {
            addCriterion("user_workCode not in", values, "userWorkcode");
            return (Criteria) this;
        }

        public Criteria andUserWorkcodeBetween(String value1, String value2) {
            addCriterion("user_workCode between", value1, value2, "userWorkcode");
            return (Criteria) this;
        }

        public Criteria andUserWorkcodeNotBetween(String value1, String value2) {
            addCriterion("user_workCode not between", value1, value2, "userWorkcode");
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

        public Criteria andUserPlaceIsNull() {
            addCriterion("user_place is null");
            return (Criteria) this;
        }

        public Criteria andUserPlaceIsNotNull() {
            addCriterion("user_place is not null");
            return (Criteria) this;
        }

        public Criteria andUserPlaceEqualTo(String value) {
            addCriterion("user_place =", value, "userPlace");
            return (Criteria) this;
        }

        public Criteria andUserPlaceNotEqualTo(String value) {
            addCriterion("user_place <>", value, "userPlace");
            return (Criteria) this;
        }

        public Criteria andUserPlaceGreaterThan(String value) {
            addCriterion("user_place >", value, "userPlace");
            return (Criteria) this;
        }

        public Criteria andUserPlaceGreaterThanOrEqualTo(String value) {
            addCriterion("user_place >=", value, "userPlace");
            return (Criteria) this;
        }

        public Criteria andUserPlaceLessThan(String value) {
            addCriterion("user_place <", value, "userPlace");
            return (Criteria) this;
        }

        public Criteria andUserPlaceLessThanOrEqualTo(String value) {
            addCriterion("user_place <=", value, "userPlace");
            return (Criteria) this;
        }

        public Criteria andUserPlaceLike(String value) {
            addCriterion("user_place like", value, "userPlace");
            return (Criteria) this;
        }

        public Criteria andUserPlaceNotLike(String value) {
            addCriterion("user_place not like", value, "userPlace");
            return (Criteria) this;
        }

        public Criteria andUserPlaceIn(List<String> values) {
            addCriterion("user_place in", values, "userPlace");
            return (Criteria) this;
        }

        public Criteria andUserPlaceNotIn(List<String> values) {
            addCriterion("user_place not in", values, "userPlace");
            return (Criteria) this;
        }

        public Criteria andUserPlaceBetween(String value1, String value2) {
            addCriterion("user_place between", value1, value2, "userPlace");
            return (Criteria) this;
        }

        public Criteria andUserPlaceNotBetween(String value1, String value2) {
            addCriterion("user_place not between", value1, value2, "userPlace");
            return (Criteria) this;
        }

        public Criteria andUserPlacecodeIsNull() {
            addCriterion("user_placeCode is null");
            return (Criteria) this;
        }

        public Criteria andUserPlacecodeIsNotNull() {
            addCriterion("user_placeCode is not null");
            return (Criteria) this;
        }

        public Criteria andUserPlacecodeEqualTo(String value) {
            addCriterion("user_placeCode =", value, "userPlacecode");
            return (Criteria) this;
        }

        public Criteria andUserPlacecodeNotEqualTo(String value) {
            addCriterion("user_placeCode <>", value, "userPlacecode");
            return (Criteria) this;
        }

        public Criteria andUserPlacecodeGreaterThan(String value) {
            addCriterion("user_placeCode >", value, "userPlacecode");
            return (Criteria) this;
        }

        public Criteria andUserPlacecodeGreaterThanOrEqualTo(String value) {
            addCriterion("user_placeCode >=", value, "userPlacecode");
            return (Criteria) this;
        }

        public Criteria andUserPlacecodeLessThan(String value) {
            addCriterion("user_placeCode <", value, "userPlacecode");
            return (Criteria) this;
        }

        public Criteria andUserPlacecodeLessThanOrEqualTo(String value) {
            addCriterion("user_placeCode <=", value, "userPlacecode");
            return (Criteria) this;
        }

        public Criteria andUserPlacecodeLike(String value) {
            addCriterion("user_placeCode like", value, "userPlacecode");
            return (Criteria) this;
        }

        public Criteria andUserPlacecodeNotLike(String value) {
            addCriterion("user_placeCode not like", value, "userPlacecode");
            return (Criteria) this;
        }

        public Criteria andUserPlacecodeIn(List<String> values) {
            addCriterion("user_placeCode in", values, "userPlacecode");
            return (Criteria) this;
        }

        public Criteria andUserPlacecodeNotIn(List<String> values) {
            addCriterion("user_placeCode not in", values, "userPlacecode");
            return (Criteria) this;
        }

        public Criteria andUserPlacecodeBetween(String value1, String value2) {
            addCriterion("user_placeCode between", value1, value2, "userPlacecode");
            return (Criteria) this;
        }

        public Criteria andUserPlacecodeNotBetween(String value1, String value2) {
            addCriterion("user_placeCode not between", value1, value2, "userPlacecode");
            return (Criteria) this;
        }

        public Criteria andUserPostIsNull() {
            addCriterion("user_post is null");
            return (Criteria) this;
        }

        public Criteria andUserPostIsNotNull() {
            addCriterion("user_post is not null");
            return (Criteria) this;
        }

        public Criteria andUserPostEqualTo(String value) {
            addCriterion("user_post =", value, "userPost");
            return (Criteria) this;
        }

        public Criteria andUserPostNotEqualTo(String value) {
            addCriterion("user_post <>", value, "userPost");
            return (Criteria) this;
        }

        public Criteria andUserPostGreaterThan(String value) {
            addCriterion("user_post >", value, "userPost");
            return (Criteria) this;
        }

        public Criteria andUserPostGreaterThanOrEqualTo(String value) {
            addCriterion("user_post >=", value, "userPost");
            return (Criteria) this;
        }

        public Criteria andUserPostLessThan(String value) {
            addCriterion("user_post <", value, "userPost");
            return (Criteria) this;
        }

        public Criteria andUserPostLessThanOrEqualTo(String value) {
            addCriterion("user_post <=", value, "userPost");
            return (Criteria) this;
        }

        public Criteria andUserPostLike(String value) {
            addCriterion("user_post like", value, "userPost");
            return (Criteria) this;
        }

        public Criteria andUserPostNotLike(String value) {
            addCriterion("user_post not like", value, "userPost");
            return (Criteria) this;
        }

        public Criteria andUserPostIn(List<String> values) {
            addCriterion("user_post in", values, "userPost");
            return (Criteria) this;
        }

        public Criteria andUserPostNotIn(List<String> values) {
            addCriterion("user_post not in", values, "userPost");
            return (Criteria) this;
        }

        public Criteria andUserPostBetween(String value1, String value2) {
            addCriterion("user_post between", value1, value2, "userPost");
            return (Criteria) this;
        }

        public Criteria andUserPostNotBetween(String value1, String value2) {
            addCriterion("user_post not between", value1, value2, "userPost");
            return (Criteria) this;
        }

        public Criteria andUserSubpackageIsNull() {
            addCriterion("user_subpackage is null");
            return (Criteria) this;
        }

        public Criteria andUserSubpackageIsNotNull() {
            addCriterion("user_subpackage is not null");
            return (Criteria) this;
        }

        public Criteria andUserSubpackageEqualTo(String value) {
            addCriterion("user_subpackage =", value, "userSubpackage");
            return (Criteria) this;
        }

        public Criteria andUserSubpackageNotEqualTo(String value) {
            addCriterion("user_subpackage <>", value, "userSubpackage");
            return (Criteria) this;
        }

        public Criteria andUserSubpackageGreaterThan(String value) {
            addCriterion("user_subpackage >", value, "userSubpackage");
            return (Criteria) this;
        }

        public Criteria andUserSubpackageGreaterThanOrEqualTo(String value) {
            addCriterion("user_subpackage >=", value, "userSubpackage");
            return (Criteria) this;
        }

        public Criteria andUserSubpackageLessThan(String value) {
            addCriterion("user_subpackage <", value, "userSubpackage");
            return (Criteria) this;
        }

        public Criteria andUserSubpackageLessThanOrEqualTo(String value) {
            addCriterion("user_subpackage <=", value, "userSubpackage");
            return (Criteria) this;
        }

        public Criteria andUserSubpackageLike(String value) {
            addCriterion("user_subpackage like", value, "userSubpackage");
            return (Criteria) this;
        }

        public Criteria andUserSubpackageNotLike(String value) {
            addCriterion("user_subpackage not like", value, "userSubpackage");
            return (Criteria) this;
        }

        public Criteria andUserSubpackageIn(List<String> values) {
            addCriterion("user_subpackage in", values, "userSubpackage");
            return (Criteria) this;
        }

        public Criteria andUserSubpackageNotIn(List<String> values) {
            addCriterion("user_subpackage not in", values, "userSubpackage");
            return (Criteria) this;
        }

        public Criteria andUserSubpackageBetween(String value1, String value2) {
            addCriterion("user_subpackage between", value1, value2, "userSubpackage");
            return (Criteria) this;
        }

        public Criteria andUserSubpackageNotBetween(String value1, String value2) {
            addCriterion("user_subpackage not between", value1, value2, "userSubpackage");
            return (Criteria) this;
        }

        public Criteria andDepartmentinfoIsNull() {
            addCriterion("departMentInfo is null");
            return (Criteria) this;
        }

        public Criteria andDepartmentinfoIsNotNull() {
            addCriterion("departMentInfo is not null");
            return (Criteria) this;
        }

        public Criteria andDepartmentinfoEqualTo(String value) {
            addCriterion("departMentInfo =", value, "departmentinfo");
            return (Criteria) this;
        }

        public Criteria andDepartmentinfoNotEqualTo(String value) {
            addCriterion("departMentInfo <>", value, "departmentinfo");
            return (Criteria) this;
        }

        public Criteria andDepartmentinfoGreaterThan(String value) {
            addCriterion("departMentInfo >", value, "departmentinfo");
            return (Criteria) this;
        }

        public Criteria andDepartmentinfoGreaterThanOrEqualTo(String value) {
            addCriterion("departMentInfo >=", value, "departmentinfo");
            return (Criteria) this;
        }

        public Criteria andDepartmentinfoLessThan(String value) {
            addCriterion("departMentInfo <", value, "departmentinfo");
            return (Criteria) this;
        }

        public Criteria andDepartmentinfoLessThanOrEqualTo(String value) {
            addCriterion("departMentInfo <=", value, "departmentinfo");
            return (Criteria) this;
        }

        public Criteria andDepartmentinfoLike(String value) {
            addCriterion("departMentInfo like", value, "departmentinfo");
            return (Criteria) this;
        }

        public Criteria andDepartmentinfoNotLike(String value) {
            addCriterion("departMentInfo not like", value, "departmentinfo");
            return (Criteria) this;
        }

        public Criteria andDepartmentinfoIn(List<String> values) {
            addCriterion("departMentInfo in", values, "departmentinfo");
            return (Criteria) this;
        }

        public Criteria andDepartmentinfoNotIn(List<String> values) {
            addCriterion("departMentInfo not in", values, "departmentinfo");
            return (Criteria) this;
        }

        public Criteria andDepartmentinfoBetween(String value1, String value2) {
            addCriterion("departMentInfo between", value1, value2, "departmentinfo");
            return (Criteria) this;
        }

        public Criteria andDepartmentinfoNotBetween(String value1, String value2) {
            addCriterion("departMentInfo not between", value1, value2, "departmentinfo");
            return (Criteria) this;
        }

        public Criteria andUserfirstorgIsNull() {
            addCriterion("userFirstOrg is null");
            return (Criteria) this;
        }

        public Criteria andUserfirstorgIsNotNull() {
            addCriterion("userFirstOrg is not null");
            return (Criteria) this;
        }

        public Criteria andUserfirstorgEqualTo(String value) {
            addCriterion("userFirstOrg =", value, "userfirstorg");
            return (Criteria) this;
        }

        public Criteria andUserfirstorgNotEqualTo(String value) {
            addCriterion("userFirstOrg <>", value, "userfirstorg");
            return (Criteria) this;
        }

        public Criteria andUserfirstorgGreaterThan(String value) {
            addCriterion("userFirstOrg >", value, "userfirstorg");
            return (Criteria) this;
        }

        public Criteria andUserfirstorgGreaterThanOrEqualTo(String value) {
            addCriterion("userFirstOrg >=", value, "userfirstorg");
            return (Criteria) this;
        }

        public Criteria andUserfirstorgLessThan(String value) {
            addCriterion("userFirstOrg <", value, "userfirstorg");
            return (Criteria) this;
        }

        public Criteria andUserfirstorgLessThanOrEqualTo(String value) {
            addCriterion("userFirstOrg <=", value, "userfirstorg");
            return (Criteria) this;
        }

        public Criteria andUserfirstorgLike(String value) {
            addCriterion("userFirstOrg like", value, "userfirstorg");
            return (Criteria) this;
        }

        public Criteria andUserfirstorgNotLike(String value) {
            addCriterion("userFirstOrg not like", value, "userfirstorg");
            return (Criteria) this;
        }

        public Criteria andUserfirstorgIn(List<String> values) {
            addCriterion("userFirstOrg in", values, "userfirstorg");
            return (Criteria) this;
        }

        public Criteria andUserfirstorgNotIn(List<String> values) {
            addCriterion("userFirstOrg not in", values, "userfirstorg");
            return (Criteria) this;
        }

        public Criteria andUserfirstorgBetween(String value1, String value2) {
            addCriterion("userFirstOrg between", value1, value2, "userfirstorg");
            return (Criteria) this;
        }

        public Criteria andUserfirstorgNotBetween(String value1, String value2) {
            addCriterion("userFirstOrg not between", value1, value2, "userfirstorg");
            return (Criteria) this;
        }

        public Criteria andUserfirstorgcodeIsNull() {
            addCriterion("userFirstOrgCode is null");
            return (Criteria) this;
        }

        public Criteria andUserfirstorgcodeIsNotNull() {
            addCriterion("userFirstOrgCode is not null");
            return (Criteria) this;
        }

        public Criteria andUserfirstorgcodeEqualTo(String value) {
            addCriterion("userFirstOrgCode =", value, "userfirstorgcode");
            return (Criteria) this;
        }

        public Criteria andUserfirstorgcodeNotEqualTo(String value) {
            addCriterion("userFirstOrgCode <>", value, "userfirstorgcode");
            return (Criteria) this;
        }

        public Criteria andUserfirstorgcodeGreaterThan(String value) {
            addCriterion("userFirstOrgCode >", value, "userfirstorgcode");
            return (Criteria) this;
        }

        public Criteria andUserfirstorgcodeGreaterThanOrEqualTo(String value) {
            addCriterion("userFirstOrgCode >=", value, "userfirstorgcode");
            return (Criteria) this;
        }

        public Criteria andUserfirstorgcodeLessThan(String value) {
            addCriterion("userFirstOrgCode <", value, "userfirstorgcode");
            return (Criteria) this;
        }

        public Criteria andUserfirstorgcodeLessThanOrEqualTo(String value) {
            addCriterion("userFirstOrgCode <=", value, "userfirstorgcode");
            return (Criteria) this;
        }

        public Criteria andUserfirstorgcodeLike(String value) {
            addCriterion("userFirstOrgCode like", value, "userfirstorgcode");
            return (Criteria) this;
        }

        public Criteria andUserfirstorgcodeNotLike(String value) {
            addCriterion("userFirstOrgCode not like", value, "userfirstorgcode");
            return (Criteria) this;
        }

        public Criteria andUserfirstorgcodeIn(List<String> values) {
            addCriterion("userFirstOrgCode in", values, "userfirstorgcode");
            return (Criteria) this;
        }

        public Criteria andUserfirstorgcodeNotIn(List<String> values) {
            addCriterion("userFirstOrgCode not in", values, "userfirstorgcode");
            return (Criteria) this;
        }

        public Criteria andUserfirstorgcodeBetween(String value1, String value2) {
            addCriterion("userFirstOrgCode between", value1, value2, "userfirstorgcode");
            return (Criteria) this;
        }

        public Criteria andUserfirstorgcodeNotBetween(String value1, String value2) {
            addCriterion("userFirstOrgCode not between", value1, value2, "userfirstorgcode");
            return (Criteria) this;
        }

        public Criteria andIdcardIsNull() {
            addCriterion("idCard is null");
            return (Criteria) this;
        }

        public Criteria andIdcardIsNotNull() {
            addCriterion("idCard is not null");
            return (Criteria) this;
        }

        public Criteria andIdcardEqualTo(String value) {
            addCriterion("idCard =", value, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardNotEqualTo(String value) {
            addCriterion("idCard <>", value, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardGreaterThan(String value) {
            addCriterion("idCard >", value, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardGreaterThanOrEqualTo(String value) {
            addCriterion("idCard >=", value, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardLessThan(String value) {
            addCriterion("idCard <", value, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardLessThanOrEqualTo(String value) {
            addCriterion("idCard <=", value, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardLike(String value) {
            addCriterion("idCard like", value, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardNotLike(String value) {
            addCriterion("idCard not like", value, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardIn(List<String> values) {
            addCriterion("idCard in", values, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardNotIn(List<String> values) {
            addCriterion("idCard not in", values, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardBetween(String value1, String value2) {
            addCriterion("idCard between", value1, value2, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardNotBetween(String value1, String value2) {
            addCriterion("idCard not between", value1, value2, "idcard");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNull() {
            addCriterion("phone is null");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNotNull() {
            addCriterion("phone is not null");
            return (Criteria) this;
        }

        public Criteria andPhoneEqualTo(String value) {
            addCriterion("phone =", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotEqualTo(String value) {
            addCriterion("phone <>", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThan(String value) {
            addCriterion("phone >", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("phone >=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThan(String value) {
            addCriterion("phone <", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThanOrEqualTo(String value) {
            addCriterion("phone <=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLike(String value) {
            addCriterion("phone like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotLike(String value) {
            addCriterion("phone not like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneIn(List<String> values) {
            addCriterion("phone in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotIn(List<String> values) {
            addCriterion("phone not in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneBetween(String value1, String value2) {
            addCriterion("phone between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotBetween(String value1, String value2) {
            addCriterion("phone not between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andIsblacklistIsNull() {
            addCriterion("isBlackList is null");
            return (Criteria) this;
        }

        public Criteria andIsblacklistIsNotNull() {
            addCriterion("isBlackList is not null");
            return (Criteria) this;
        }

        public Criteria andIsblacklistEqualTo(Integer value) {
            addCriterion("isBlackList =", value, "isblacklist");
            return (Criteria) this;
        }

        public Criteria andIsblacklistNotEqualTo(Integer value) {
            addCriterion("isBlackList <>", value, "isblacklist");
            return (Criteria) this;
        }

        public Criteria andIsblacklistGreaterThan(Integer value) {
            addCriterion("isBlackList >", value, "isblacklist");
            return (Criteria) this;
        }

        public Criteria andIsblacklistGreaterThanOrEqualTo(Integer value) {
            addCriterion("isBlackList >=", value, "isblacklist");
            return (Criteria) this;
        }

        public Criteria andIsblacklistLessThan(Integer value) {
            addCriterion("isBlackList <", value, "isblacklist");
            return (Criteria) this;
        }

        public Criteria andIsblacklistLessThanOrEqualTo(Integer value) {
            addCriterion("isBlackList <=", value, "isblacklist");
            return (Criteria) this;
        }

        public Criteria andIsblacklistIn(List<Integer> values) {
            addCriterion("isBlackList in", values, "isblacklist");
            return (Criteria) this;
        }

        public Criteria andIsblacklistNotIn(List<Integer> values) {
            addCriterion("isBlackList not in", values, "isblacklist");
            return (Criteria) this;
        }

        public Criteria andIsblacklistBetween(Integer value1, Integer value2) {
            addCriterion("isBlackList between", value1, value2, "isblacklist");
            return (Criteria) this;
        }

        public Criteria andIsblacklistNotBetween(Integer value1, Integer value2) {
            addCriterion("isBlackList not between", value1, value2, "isblacklist");
            return (Criteria) this;
        }

        public Criteria andOutcompanyidIsNull() {
            addCriterion("outCompanyId is null");
            return (Criteria) this;
        }

        public Criteria andOutcompanyidIsNotNull() {
            addCriterion("outCompanyId is not null");
            return (Criteria) this;
        }

        public Criteria andOutcompanyidEqualTo(Integer value) {
            addCriterion("outCompanyId =", value, "outcompanyid");
            return (Criteria) this;
        }

        public Criteria andOutcompanyidNotEqualTo(Integer value) {
            addCriterion("outCompanyId <>", value, "outcompanyid");
            return (Criteria) this;
        }

        public Criteria andOutcompanyidGreaterThan(Integer value) {
            addCriterion("outCompanyId >", value, "outcompanyid");
            return (Criteria) this;
        }

        public Criteria andOutcompanyidGreaterThanOrEqualTo(Integer value) {
            addCriterion("outCompanyId >=", value, "outcompanyid");
            return (Criteria) this;
        }

        public Criteria andOutcompanyidLessThan(Integer value) {
            addCriterion("outCompanyId <", value, "outcompanyid");
            return (Criteria) this;
        }

        public Criteria andOutcompanyidLessThanOrEqualTo(Integer value) {
            addCriterion("outCompanyId <=", value, "outcompanyid");
            return (Criteria) this;
        }

        public Criteria andOutcompanyidIn(List<Integer> values) {
            addCriterion("outCompanyId in", values, "outcompanyid");
            return (Criteria) this;
        }

        public Criteria andOutcompanyidNotIn(List<Integer> values) {
            addCriterion("outCompanyId not in", values, "outcompanyid");
            return (Criteria) this;
        }

        public Criteria andOutcompanyidBetween(Integer value1, Integer value2) {
            addCriterion("outCompanyId between", value1, value2, "outcompanyid");
            return (Criteria) this;
        }

        public Criteria andOutcompanyidNotBetween(Integer value1, Integer value2) {
            addCriterion("outCompanyId not between", value1, value2, "outcompanyid");
            return (Criteria) this;
        }

        public Criteria andUserteamidIsNull() {
            addCriterion("userTeamId is null");
            return (Criteria) this;
        }

        public Criteria andUserteamidIsNotNull() {
            addCriterion("userTeamId is not null");
            return (Criteria) this;
        }

        public Criteria andUserteamidEqualTo(Integer value) {
            addCriterion("userTeamId =", value, "userteamid");
            return (Criteria) this;
        }

        public Criteria andUserteamidNotEqualTo(Integer value) {
            addCriterion("userTeamId <>", value, "userteamid");
            return (Criteria) this;
        }

        public Criteria andUserteamidGreaterThan(Integer value) {
            addCriterion("userTeamId >", value, "userteamid");
            return (Criteria) this;
        }

        public Criteria andUserteamidGreaterThanOrEqualTo(Integer value) {
            addCriterion("userTeamId >=", value, "userteamid");
            return (Criteria) this;
        }

        public Criteria andUserteamidLessThan(Integer value) {
            addCriterion("userTeamId <", value, "userteamid");
            return (Criteria) this;
        }

        public Criteria andUserteamidLessThanOrEqualTo(Integer value) {
            addCriterion("userTeamId <=", value, "userteamid");
            return (Criteria) this;
        }

        public Criteria andUserteamidIn(List<Integer> values) {
            addCriterion("userTeamId in", values, "userteamid");
            return (Criteria) this;
        }

        public Criteria andUserteamidNotIn(List<Integer> values) {
            addCriterion("userTeamId not in", values, "userteamid");
            return (Criteria) this;
        }

        public Criteria andUserteamidBetween(Integer value1, Integer value2) {
            addCriterion("userTeamId between", value1, value2, "userteamid");
            return (Criteria) this;
        }

        public Criteria andUserteamidNotBetween(Integer value1, Integer value2) {
            addCriterion("userTeamId not between", value1, value2, "userteamid");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNull() {
            addCriterion("createtime is null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNotNull() {
            addCriterion("createtime is not null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeEqualTo(String value) {
            addCriterion("createtime =", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotEqualTo(String value) {
            addCriterion("createtime <>", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThan(String value) {
            addCriterion("createtime >", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThanOrEqualTo(String value) {
            addCriterion("createtime >=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThan(String value) {
            addCriterion("createtime <", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThanOrEqualTo(String value) {
            addCriterion("createtime <=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLike(String value) {
            addCriterion("createtime like", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotLike(String value) {
            addCriterion("createtime not like", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIn(List<String> values) {
            addCriterion("createtime in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotIn(List<String> values) {
            addCriterion("createtime not in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeBetween(String value1, String value2) {
            addCriterion("createtime between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotBetween(String value1, String value2) {
            addCriterion("createtime not between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andIdcardUrlIsNull() {
            addCriterion("idcard_url is null");
            return (Criteria) this;
        }

        public Criteria andIdcardUrlIsNotNull() {
            addCriterion("idcard_url is not null");
            return (Criteria) this;
        }

        public Criteria andIdcardUrlEqualTo(String value) {
            addCriterion("idcard_url =", value, "idcardUrl");
            return (Criteria) this;
        }

        public Criteria andIdcardUrlNotEqualTo(String value) {
            addCriterion("idcard_url <>", value, "idcardUrl");
            return (Criteria) this;
        }

        public Criteria andIdcardUrlGreaterThan(String value) {
            addCriterion("idcard_url >", value, "idcardUrl");
            return (Criteria) this;
        }

        public Criteria andIdcardUrlGreaterThanOrEqualTo(String value) {
            addCriterion("idcard_url >=", value, "idcardUrl");
            return (Criteria) this;
        }

        public Criteria andIdcardUrlLessThan(String value) {
            addCriterion("idcard_url <", value, "idcardUrl");
            return (Criteria) this;
        }

        public Criteria andIdcardUrlLessThanOrEqualTo(String value) {
            addCriterion("idcard_url <=", value, "idcardUrl");
            return (Criteria) this;
        }

        public Criteria andIdcardUrlLike(String value) {
            addCriterion("idcard_url like", value, "idcardUrl");
            return (Criteria) this;
        }

        public Criteria andIdcardUrlNotLike(String value) {
            addCriterion("idcard_url not like", value, "idcardUrl");
            return (Criteria) this;
        }

        public Criteria andIdcardUrlIn(List<String> values) {
            addCriterion("idcard_url in", values, "idcardUrl");
            return (Criteria) this;
        }

        public Criteria andIdcardUrlNotIn(List<String> values) {
            addCriterion("idcard_url not in", values, "idcardUrl");
            return (Criteria) this;
        }

        public Criteria andIdcardUrlBetween(String value1, String value2) {
            addCriterion("idcard_url between", value1, value2, "idcardUrl");
            return (Criteria) this;
        }

        public Criteria andIdcardUrlNotBetween(String value1, String value2) {
            addCriterion("idcard_url not between", value1, value2, "idcardUrl");
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