package ywl.dto;

import java.util.ArrayList;
import java.util.List;

public class GspwScoreExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public GspwScoreExample() {
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

        public Criteria andUserWorknumberIsNull() {
            addCriterion("user_worknumber is null");
            return (Criteria) this;
        }

        public Criteria andUserWorknumberIsNotNull() {
            addCriterion("user_worknumber is not null");
            return (Criteria) this;
        }

        public Criteria andUserWorknumberEqualTo(String value) {
            addCriterion("user_worknumber =", value, "userWorknumber");
            return (Criteria) this;
        }

        public Criteria andUserWorknumberNotEqualTo(String value) {
            addCriterion("user_worknumber <>", value, "userWorknumber");
            return (Criteria) this;
        }

        public Criteria andUserWorknumberGreaterThan(String value) {
            addCriterion("user_worknumber >", value, "userWorknumber");
            return (Criteria) this;
        }

        public Criteria andUserWorknumberGreaterThanOrEqualTo(String value) {
            addCriterion("user_worknumber >=", value, "userWorknumber");
            return (Criteria) this;
        }

        public Criteria andUserWorknumberLessThan(String value) {
            addCriterion("user_worknumber <", value, "userWorknumber");
            return (Criteria) this;
        }

        public Criteria andUserWorknumberLessThanOrEqualTo(String value) {
            addCriterion("user_worknumber <=", value, "userWorknumber");
            return (Criteria) this;
        }

        public Criteria andUserWorknumberLike(String value) {
            addCriterion("user_worknumber like", value, "userWorknumber");
            return (Criteria) this;
        }

        public Criteria andUserWorknumberNotLike(String value) {
            addCriterion("user_worknumber not like", value, "userWorknumber");
            return (Criteria) this;
        }

        public Criteria andUserWorknumberIn(List<String> values) {
            addCriterion("user_worknumber in", values, "userWorknumber");
            return (Criteria) this;
        }

        public Criteria andUserWorknumberNotIn(List<String> values) {
            addCriterion("user_worknumber not in", values, "userWorknumber");
            return (Criteria) this;
        }

        public Criteria andUserWorknumberBetween(String value1, String value2) {
            addCriterion("user_worknumber between", value1, value2, "userWorknumber");
            return (Criteria) this;
        }

        public Criteria andUserWorknumberNotBetween(String value1, String value2) {
            addCriterion("user_worknumber not between", value1, value2, "userWorknumber");
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

        public Criteria andOrgNameIsNull() {
            addCriterion("org_name is null");
            return (Criteria) this;
        }

        public Criteria andOrgNameIsNotNull() {
            addCriterion("org_name is not null");
            return (Criteria) this;
        }

        public Criteria andOrgNameEqualTo(String value) {
            addCriterion("org_name =", value, "orgName");
            return (Criteria) this;
        }

        public Criteria andOrgNameNotEqualTo(String value) {
            addCriterion("org_name <>", value, "orgName");
            return (Criteria) this;
        }

        public Criteria andOrgNameGreaterThan(String value) {
            addCriterion("org_name >", value, "orgName");
            return (Criteria) this;
        }

        public Criteria andOrgNameGreaterThanOrEqualTo(String value) {
            addCriterion("org_name >=", value, "orgName");
            return (Criteria) this;
        }

        public Criteria andOrgNameLessThan(String value) {
            addCriterion("org_name <", value, "orgName");
            return (Criteria) this;
        }

        public Criteria andOrgNameLessThanOrEqualTo(String value) {
            addCriterion("org_name <=", value, "orgName");
            return (Criteria) this;
        }

        public Criteria andOrgNameLike(String value) {
            addCriterion("org_name like", value, "orgName");
            return (Criteria) this;
        }

        public Criteria andOrgNameNotLike(String value) {
            addCriterion("org_name not like", value, "orgName");
            return (Criteria) this;
        }

        public Criteria andOrgNameIn(List<String> values) {
            addCriterion("org_name in", values, "orgName");
            return (Criteria) this;
        }

        public Criteria andOrgNameNotIn(List<String> values) {
            addCriterion("org_name not in", values, "orgName");
            return (Criteria) this;
        }

        public Criteria andOrgNameBetween(String value1, String value2) {
            addCriterion("org_name between", value1, value2, "orgName");
            return (Criteria) this;
        }

        public Criteria andOrgNameNotBetween(String value1, String value2) {
            addCriterion("org_name not between", value1, value2, "orgName");
            return (Criteria) this;
        }

        public Criteria andOrgCodeIsNull() {
            addCriterion("org_code is null");
            return (Criteria) this;
        }

        public Criteria andOrgCodeIsNotNull() {
            addCriterion("org_code is not null");
            return (Criteria) this;
        }

        public Criteria andOrgCodeEqualTo(String value) {
            addCriterion("org_code =", value, "orgCode");
            return (Criteria) this;
        }

        public Criteria andOrgCodeNotEqualTo(String value) {
            addCriterion("org_code <>", value, "orgCode");
            return (Criteria) this;
        }

        public Criteria andOrgCodeGreaterThan(String value) {
            addCriterion("org_code >", value, "orgCode");
            return (Criteria) this;
        }

        public Criteria andOrgCodeGreaterThanOrEqualTo(String value) {
            addCriterion("org_code >=", value, "orgCode");
            return (Criteria) this;
        }

        public Criteria andOrgCodeLessThan(String value) {
            addCriterion("org_code <", value, "orgCode");
            return (Criteria) this;
        }

        public Criteria andOrgCodeLessThanOrEqualTo(String value) {
            addCriterion("org_code <=", value, "orgCode");
            return (Criteria) this;
        }

        public Criteria andOrgCodeLike(String value) {
            addCriterion("org_code like", value, "orgCode");
            return (Criteria) this;
        }

        public Criteria andOrgCodeNotLike(String value) {
            addCriterion("org_code not like", value, "orgCode");
            return (Criteria) this;
        }

        public Criteria andOrgCodeIn(List<String> values) {
            addCriterion("org_code in", values, "orgCode");
            return (Criteria) this;
        }

        public Criteria andOrgCodeNotIn(List<String> values) {
            addCriterion("org_code not in", values, "orgCode");
            return (Criteria) this;
        }

        public Criteria andOrgCodeBetween(String value1, String value2) {
            addCriterion("org_code between", value1, value2, "orgCode");
            return (Criteria) this;
        }

        public Criteria andOrgCodeNotBetween(String value1, String value2) {
            addCriterion("org_code not between", value1, value2, "orgCode");
            return (Criteria) this;
        }

        public Criteria andBuildDepartmentGradeIsNull() {
            addCriterion("build_department_grade is null");
            return (Criteria) this;
        }

        public Criteria andBuildDepartmentGradeIsNotNull() {
            addCriterion("build_department_grade is not null");
            return (Criteria) this;
        }

        public Criteria andBuildDepartmentGradeEqualTo(Integer value) {
            addCriterion("build_department_grade =", value, "buildDepartmentGrade");
            return (Criteria) this;
        }

        public Criteria andBuildDepartmentGradeNotEqualTo(Integer value) {
            addCriterion("build_department_grade <>", value, "buildDepartmentGrade");
            return (Criteria) this;
        }

        public Criteria andBuildDepartmentGradeGreaterThan(Integer value) {
            addCriterion("build_department_grade >", value, "buildDepartmentGrade");
            return (Criteria) this;
        }

        public Criteria andBuildDepartmentGradeGreaterThanOrEqualTo(Integer value) {
            addCriterion("build_department_grade >=", value, "buildDepartmentGrade");
            return (Criteria) this;
        }

        public Criteria andBuildDepartmentGradeLessThan(Integer value) {
            addCriterion("build_department_grade <", value, "buildDepartmentGrade");
            return (Criteria) this;
        }

        public Criteria andBuildDepartmentGradeLessThanOrEqualTo(Integer value) {
            addCriterion("build_department_grade <=", value, "buildDepartmentGrade");
            return (Criteria) this;
        }

        public Criteria andBuildDepartmentGradeIn(List<Integer> values) {
            addCriterion("build_department_grade in", values, "buildDepartmentGrade");
            return (Criteria) this;
        }

        public Criteria andBuildDepartmentGradeNotIn(List<Integer> values) {
            addCriterion("build_department_grade not in", values, "buildDepartmentGrade");
            return (Criteria) this;
        }

        public Criteria andBuildDepartmentGradeBetween(Integer value1, Integer value2) {
            addCriterion("build_department_grade between", value1, value2, "buildDepartmentGrade");
            return (Criteria) this;
        }

        public Criteria andBuildDepartmentGradeNotBetween(Integer value1, Integer value2) {
            addCriterion("build_department_grade not between", value1, value2, "buildDepartmentGrade");
            return (Criteria) this;
        }

        public Criteria andWorkGradeIsNull() {
            addCriterion("work_grade is null");
            return (Criteria) this;
        }

        public Criteria andWorkGradeIsNotNull() {
            addCriterion("work_grade is not null");
            return (Criteria) this;
        }

        public Criteria andWorkGradeEqualTo(Integer value) {
            addCriterion("work_grade =", value, "workGrade");
            return (Criteria) this;
        }

        public Criteria andWorkGradeNotEqualTo(Integer value) {
            addCriterion("work_grade <>", value, "workGrade");
            return (Criteria) this;
        }

        public Criteria andWorkGradeGreaterThan(Integer value) {
            addCriterion("work_grade >", value, "workGrade");
            return (Criteria) this;
        }

        public Criteria andWorkGradeGreaterThanOrEqualTo(Integer value) {
            addCriterion("work_grade >=", value, "workGrade");
            return (Criteria) this;
        }

        public Criteria andWorkGradeLessThan(Integer value) {
            addCriterion("work_grade <", value, "workGrade");
            return (Criteria) this;
        }

        public Criteria andWorkGradeLessThanOrEqualTo(Integer value) {
            addCriterion("work_grade <=", value, "workGrade");
            return (Criteria) this;
        }

        public Criteria andWorkGradeIn(List<Integer> values) {
            addCriterion("work_grade in", values, "workGrade");
            return (Criteria) this;
        }

        public Criteria andWorkGradeNotIn(List<Integer> values) {
            addCriterion("work_grade not in", values, "workGrade");
            return (Criteria) this;
        }

        public Criteria andWorkGradeBetween(Integer value1, Integer value2) {
            addCriterion("work_grade between", value1, value2, "workGrade");
            return (Criteria) this;
        }

        public Criteria andWorkGradeNotBetween(Integer value1, Integer value2) {
            addCriterion("work_grade not between", value1, value2, "workGrade");
            return (Criteria) this;
        }

        public Criteria andPayGradeIsNull() {
            addCriterion("pay_grade is null");
            return (Criteria) this;
        }

        public Criteria andPayGradeIsNotNull() {
            addCriterion("pay_grade is not null");
            return (Criteria) this;
        }

        public Criteria andPayGradeEqualTo(Integer value) {
            addCriterion("pay_grade =", value, "payGrade");
            return (Criteria) this;
        }

        public Criteria andPayGradeNotEqualTo(Integer value) {
            addCriterion("pay_grade <>", value, "payGrade");
            return (Criteria) this;
        }

        public Criteria andPayGradeGreaterThan(Integer value) {
            addCriterion("pay_grade >", value, "payGrade");
            return (Criteria) this;
        }

        public Criteria andPayGradeGreaterThanOrEqualTo(Integer value) {
            addCriterion("pay_grade >=", value, "payGrade");
            return (Criteria) this;
        }

        public Criteria andPayGradeLessThan(Integer value) {
            addCriterion("pay_grade <", value, "payGrade");
            return (Criteria) this;
        }

        public Criteria andPayGradeLessThanOrEqualTo(Integer value) {
            addCriterion("pay_grade <=", value, "payGrade");
            return (Criteria) this;
        }

        public Criteria andPayGradeIn(List<Integer> values) {
            addCriterion("pay_grade in", values, "payGrade");
            return (Criteria) this;
        }

        public Criteria andPayGradeNotIn(List<Integer> values) {
            addCriterion("pay_grade not in", values, "payGrade");
            return (Criteria) this;
        }

        public Criteria andPayGradeBetween(Integer value1, Integer value2) {
            addCriterion("pay_grade between", value1, value2, "payGrade");
            return (Criteria) this;
        }

        public Criteria andPayGradeNotBetween(Integer value1, Integer value2) {
            addCriterion("pay_grade not between", value1, value2, "payGrade");
            return (Criteria) this;
        }

        public Criteria andMaterialGradeIsNull() {
            addCriterion("material_grade is null");
            return (Criteria) this;
        }

        public Criteria andMaterialGradeIsNotNull() {
            addCriterion("material_grade is not null");
            return (Criteria) this;
        }

        public Criteria andMaterialGradeEqualTo(Integer value) {
            addCriterion("material_grade =", value, "materialGrade");
            return (Criteria) this;
        }

        public Criteria andMaterialGradeNotEqualTo(Integer value) {
            addCriterion("material_grade <>", value, "materialGrade");
            return (Criteria) this;
        }

        public Criteria andMaterialGradeGreaterThan(Integer value) {
            addCriterion("material_grade >", value, "materialGrade");
            return (Criteria) this;
        }

        public Criteria andMaterialGradeGreaterThanOrEqualTo(Integer value) {
            addCriterion("material_grade >=", value, "materialGrade");
            return (Criteria) this;
        }

        public Criteria andMaterialGradeLessThan(Integer value) {
            addCriterion("material_grade <", value, "materialGrade");
            return (Criteria) this;
        }

        public Criteria andMaterialGradeLessThanOrEqualTo(Integer value) {
            addCriterion("material_grade <=", value, "materialGrade");
            return (Criteria) this;
        }

        public Criteria andMaterialGradeIn(List<Integer> values) {
            addCriterion("material_grade in", values, "materialGrade");
            return (Criteria) this;
        }

        public Criteria andMaterialGradeNotIn(List<Integer> values) {
            addCriterion("material_grade not in", values, "materialGrade");
            return (Criteria) this;
        }

        public Criteria andMaterialGradeBetween(Integer value1, Integer value2) {
            addCriterion("material_grade between", value1, value2, "materialGrade");
            return (Criteria) this;
        }

        public Criteria andMaterialGradeNotBetween(Integer value1, Integer value2) {
            addCriterion("material_grade not between", value1, value2, "materialGrade");
            return (Criteria) this;
        }

        public Criteria andWasteMaterialGradeIsNull() {
            addCriterion("waste_material_grade is null");
            return (Criteria) this;
        }

        public Criteria andWasteMaterialGradeIsNotNull() {
            addCriterion("waste_material_grade is not null");
            return (Criteria) this;
        }

        public Criteria andWasteMaterialGradeEqualTo(Integer value) {
            addCriterion("waste_material_grade =", value, "wasteMaterialGrade");
            return (Criteria) this;
        }

        public Criteria andWasteMaterialGradeNotEqualTo(Integer value) {
            addCriterion("waste_material_grade <>", value, "wasteMaterialGrade");
            return (Criteria) this;
        }

        public Criteria andWasteMaterialGradeGreaterThan(Integer value) {
            addCriterion("waste_material_grade >", value, "wasteMaterialGrade");
            return (Criteria) this;
        }

        public Criteria andWasteMaterialGradeGreaterThanOrEqualTo(Integer value) {
            addCriterion("waste_material_grade >=", value, "wasteMaterialGrade");
            return (Criteria) this;
        }

        public Criteria andWasteMaterialGradeLessThan(Integer value) {
            addCriterion("waste_material_grade <", value, "wasteMaterialGrade");
            return (Criteria) this;
        }

        public Criteria andWasteMaterialGradeLessThanOrEqualTo(Integer value) {
            addCriterion("waste_material_grade <=", value, "wasteMaterialGrade");
            return (Criteria) this;
        }

        public Criteria andWasteMaterialGradeIn(List<Integer> values) {
            addCriterion("waste_material_grade in", values, "wasteMaterialGrade");
            return (Criteria) this;
        }

        public Criteria andWasteMaterialGradeNotIn(List<Integer> values) {
            addCriterion("waste_material_grade not in", values, "wasteMaterialGrade");
            return (Criteria) this;
        }

        public Criteria andWasteMaterialGradeBetween(Integer value1, Integer value2) {
            addCriterion("waste_material_grade between", value1, value2, "wasteMaterialGrade");
            return (Criteria) this;
        }

        public Criteria andWasteMaterialGradeNotBetween(Integer value1, Integer value2) {
            addCriterion("waste_material_grade not between", value1, value2, "wasteMaterialGrade");
            return (Criteria) this;
        }

        public Criteria andProjectSafeGradeIsNull() {
            addCriterion("project_safe_grade is null");
            return (Criteria) this;
        }

        public Criteria andProjectSafeGradeIsNotNull() {
            addCriterion("project_safe_grade is not null");
            return (Criteria) this;
        }

        public Criteria andProjectSafeGradeEqualTo(Integer value) {
            addCriterion("project_safe_grade =", value, "projectSafeGrade");
            return (Criteria) this;
        }

        public Criteria andProjectSafeGradeNotEqualTo(Integer value) {
            addCriterion("project_safe_grade <>", value, "projectSafeGrade");
            return (Criteria) this;
        }

        public Criteria andProjectSafeGradeGreaterThan(Integer value) {
            addCriterion("project_safe_grade >", value, "projectSafeGrade");
            return (Criteria) this;
        }

        public Criteria andProjectSafeGradeGreaterThanOrEqualTo(Integer value) {
            addCriterion("project_safe_grade >=", value, "projectSafeGrade");
            return (Criteria) this;
        }

        public Criteria andProjectSafeGradeLessThan(Integer value) {
            addCriterion("project_safe_grade <", value, "projectSafeGrade");
            return (Criteria) this;
        }

        public Criteria andProjectSafeGradeLessThanOrEqualTo(Integer value) {
            addCriterion("project_safe_grade <=", value, "projectSafeGrade");
            return (Criteria) this;
        }

        public Criteria andProjectSafeGradeIn(List<Integer> values) {
            addCriterion("project_safe_grade in", values, "projectSafeGrade");
            return (Criteria) this;
        }

        public Criteria andProjectSafeGradeNotIn(List<Integer> values) {
            addCriterion("project_safe_grade not in", values, "projectSafeGrade");
            return (Criteria) this;
        }

        public Criteria andProjectSafeGradeBetween(Integer value1, Integer value2) {
            addCriterion("project_safe_grade between", value1, value2, "projectSafeGrade");
            return (Criteria) this;
        }

        public Criteria andProjectSafeGradeNotBetween(Integer value1, Integer value2) {
            addCriterion("project_safe_grade not between", value1, value2, "projectSafeGrade");
            return (Criteria) this;
        }

        public Criteria andProjectQualityGradeIsNull() {
            addCriterion("project_quality_grade is null");
            return (Criteria) this;
        }

        public Criteria andProjectQualityGradeIsNotNull() {
            addCriterion("project_quality_grade is not null");
            return (Criteria) this;
        }

        public Criteria andProjectQualityGradeEqualTo(Integer value) {
            addCriterion("project_quality_grade =", value, "projectQualityGrade");
            return (Criteria) this;
        }

        public Criteria andProjectQualityGradeNotEqualTo(Integer value) {
            addCriterion("project_quality_grade <>", value, "projectQualityGrade");
            return (Criteria) this;
        }

        public Criteria andProjectQualityGradeGreaterThan(Integer value) {
            addCriterion("project_quality_grade >", value, "projectQualityGrade");
            return (Criteria) this;
        }

        public Criteria andProjectQualityGradeGreaterThanOrEqualTo(Integer value) {
            addCriterion("project_quality_grade >=", value, "projectQualityGrade");
            return (Criteria) this;
        }

        public Criteria andProjectQualityGradeLessThan(Integer value) {
            addCriterion("project_quality_grade <", value, "projectQualityGrade");
            return (Criteria) this;
        }

        public Criteria andProjectQualityGradeLessThanOrEqualTo(Integer value) {
            addCriterion("project_quality_grade <=", value, "projectQualityGrade");
            return (Criteria) this;
        }

        public Criteria andProjectQualityGradeIn(List<Integer> values) {
            addCriterion("project_quality_grade in", values, "projectQualityGrade");
            return (Criteria) this;
        }

        public Criteria andProjectQualityGradeNotIn(List<Integer> values) {
            addCriterion("project_quality_grade not in", values, "projectQualityGrade");
            return (Criteria) this;
        }

        public Criteria andProjectQualityGradeBetween(Integer value1, Integer value2) {
            addCriterion("project_quality_grade between", value1, value2, "projectQualityGrade");
            return (Criteria) this;
        }

        public Criteria andProjectQualityGradeNotBetween(Integer value1, Integer value2) {
            addCriterion("project_quality_grade not between", value1, value2, "projectQualityGrade");
            return (Criteria) this;
        }

        public Criteria andProjectProgressGradeIsNull() {
            addCriterion("project_progress_grade is null");
            return (Criteria) this;
        }

        public Criteria andProjectProgressGradeIsNotNull() {
            addCriterion("project_progress_grade is not null");
            return (Criteria) this;
        }

        public Criteria andProjectProgressGradeEqualTo(Integer value) {
            addCriterion("project_progress_grade =", value, "projectProgressGrade");
            return (Criteria) this;
        }

        public Criteria andProjectProgressGradeNotEqualTo(Integer value) {
            addCriterion("project_progress_grade <>", value, "projectProgressGrade");
            return (Criteria) this;
        }

        public Criteria andProjectProgressGradeGreaterThan(Integer value) {
            addCriterion("project_progress_grade >", value, "projectProgressGrade");
            return (Criteria) this;
        }

        public Criteria andProjectProgressGradeGreaterThanOrEqualTo(Integer value) {
            addCriterion("project_progress_grade >=", value, "projectProgressGrade");
            return (Criteria) this;
        }

        public Criteria andProjectProgressGradeLessThan(Integer value) {
            addCriterion("project_progress_grade <", value, "projectProgressGrade");
            return (Criteria) this;
        }

        public Criteria andProjectProgressGradeLessThanOrEqualTo(Integer value) {
            addCriterion("project_progress_grade <=", value, "projectProgressGrade");
            return (Criteria) this;
        }

        public Criteria andProjectProgressGradeIn(List<Integer> values) {
            addCriterion("project_progress_grade in", values, "projectProgressGrade");
            return (Criteria) this;
        }

        public Criteria andProjectProgressGradeNotIn(List<Integer> values) {
            addCriterion("project_progress_grade not in", values, "projectProgressGrade");
            return (Criteria) this;
        }

        public Criteria andProjectProgressGradeBetween(Integer value1, Integer value2) {
            addCriterion("project_progress_grade between", value1, value2, "projectProgressGrade");
            return (Criteria) this;
        }

        public Criteria andProjectProgressGradeNotBetween(Integer value1, Integer value2) {
            addCriterion("project_progress_grade not between", value1, value2, "projectProgressGrade");
            return (Criteria) this;
        }

        public Criteria andSystemApplicationGradeIsNull() {
            addCriterion("system_application_grade is null");
            return (Criteria) this;
        }

        public Criteria andSystemApplicationGradeIsNotNull() {
            addCriterion("system_application_grade is not null");
            return (Criteria) this;
        }

        public Criteria andSystemApplicationGradeEqualTo(Integer value) {
            addCriterion("system_application_grade =", value, "systemApplicationGrade");
            return (Criteria) this;
        }

        public Criteria andSystemApplicationGradeNotEqualTo(Integer value) {
            addCriterion("system_application_grade <>", value, "systemApplicationGrade");
            return (Criteria) this;
        }

        public Criteria andSystemApplicationGradeGreaterThan(Integer value) {
            addCriterion("system_application_grade >", value, "systemApplicationGrade");
            return (Criteria) this;
        }

        public Criteria andSystemApplicationGradeGreaterThanOrEqualTo(Integer value) {
            addCriterion("system_application_grade >=", value, "systemApplicationGrade");
            return (Criteria) this;
        }

        public Criteria andSystemApplicationGradeLessThan(Integer value) {
            addCriterion("system_application_grade <", value, "systemApplicationGrade");
            return (Criteria) this;
        }

        public Criteria andSystemApplicationGradeLessThanOrEqualTo(Integer value) {
            addCriterion("system_application_grade <=", value, "systemApplicationGrade");
            return (Criteria) this;
        }

        public Criteria andSystemApplicationGradeIn(List<Integer> values) {
            addCriterion("system_application_grade in", values, "systemApplicationGrade");
            return (Criteria) this;
        }

        public Criteria andSystemApplicationGradeNotIn(List<Integer> values) {
            addCriterion("system_application_grade not in", values, "systemApplicationGrade");
            return (Criteria) this;
        }

        public Criteria andSystemApplicationGradeBetween(Integer value1, Integer value2) {
            addCriterion("system_application_grade between", value1, value2, "systemApplicationGrade");
            return (Criteria) this;
        }

        public Criteria andSystemApplicationGradeNotBetween(Integer value1, Integer value2) {
            addCriterion("system_application_grade not between", value1, value2, "systemApplicationGrade");
            return (Criteria) this;
        }

        public Criteria andQuantityGradeIsNull() {
            addCriterion("quantity_grade is null");
            return (Criteria) this;
        }

        public Criteria andQuantityGradeIsNotNull() {
            addCriterion("quantity_grade is not null");
            return (Criteria) this;
        }

        public Criteria andQuantityGradeEqualTo(Integer value) {
            addCriterion("quantity_grade =", value, "quantityGrade");
            return (Criteria) this;
        }

        public Criteria andQuantityGradeNotEqualTo(Integer value) {
            addCriterion("quantity_grade <>", value, "quantityGrade");
            return (Criteria) this;
        }

        public Criteria andQuantityGradeGreaterThan(Integer value) {
            addCriterion("quantity_grade >", value, "quantityGrade");
            return (Criteria) this;
        }

        public Criteria andQuantityGradeGreaterThanOrEqualTo(Integer value) {
            addCriterion("quantity_grade >=", value, "quantityGrade");
            return (Criteria) this;
        }

        public Criteria andQuantityGradeLessThan(Integer value) {
            addCriterion("quantity_grade <", value, "quantityGrade");
            return (Criteria) this;
        }

        public Criteria andQuantityGradeLessThanOrEqualTo(Integer value) {
            addCriterion("quantity_grade <=", value, "quantityGrade");
            return (Criteria) this;
        }

        public Criteria andQuantityGradeIn(List<Integer> values) {
            addCriterion("quantity_grade in", values, "quantityGrade");
            return (Criteria) this;
        }

        public Criteria andQuantityGradeNotIn(List<Integer> values) {
            addCriterion("quantity_grade not in", values, "quantityGrade");
            return (Criteria) this;
        }

        public Criteria andQuantityGradeBetween(Integer value1, Integer value2) {
            addCriterion("quantity_grade between", value1, value2, "quantityGrade");
            return (Criteria) this;
        }

        public Criteria andQuantityGradeNotBetween(Integer value1, Integer value2) {
            addCriterion("quantity_grade not between", value1, value2, "quantityGrade");
            return (Criteria) this;
        }

        public Criteria andFinishGradeIsNull() {
            addCriterion("finish_grade is null");
            return (Criteria) this;
        }

        public Criteria andFinishGradeIsNotNull() {
            addCriterion("finish_grade is not null");
            return (Criteria) this;
        }

        public Criteria andFinishGradeEqualTo(Integer value) {
            addCriterion("finish_grade =", value, "finishGrade");
            return (Criteria) this;
        }

        public Criteria andFinishGradeNotEqualTo(Integer value) {
            addCriterion("finish_grade <>", value, "finishGrade");
            return (Criteria) this;
        }

        public Criteria andFinishGradeGreaterThan(Integer value) {
            addCriterion("finish_grade >", value, "finishGrade");
            return (Criteria) this;
        }

        public Criteria andFinishGradeGreaterThanOrEqualTo(Integer value) {
            addCriterion("finish_grade >=", value, "finishGrade");
            return (Criteria) this;
        }

        public Criteria andFinishGradeLessThan(Integer value) {
            addCriterion("finish_grade <", value, "finishGrade");
            return (Criteria) this;
        }

        public Criteria andFinishGradeLessThanOrEqualTo(Integer value) {
            addCriterion("finish_grade <=", value, "finishGrade");
            return (Criteria) this;
        }

        public Criteria andFinishGradeIn(List<Integer> values) {
            addCriterion("finish_grade in", values, "finishGrade");
            return (Criteria) this;
        }

        public Criteria andFinishGradeNotIn(List<Integer> values) {
            addCriterion("finish_grade not in", values, "finishGrade");
            return (Criteria) this;
        }

        public Criteria andFinishGradeBetween(Integer value1, Integer value2) {
            addCriterion("finish_grade between", value1, value2, "finishGrade");
            return (Criteria) this;
        }

        public Criteria andFinishGradeNotBetween(Integer value1, Integer value2) {
            addCriterion("finish_grade not between", value1, value2, "finishGrade");
            return (Criteria) this;
        }

        public Criteria andDataGradeIsNull() {
            addCriterion("data_grade is null");
            return (Criteria) this;
        }

        public Criteria andDataGradeIsNotNull() {
            addCriterion("data_grade is not null");
            return (Criteria) this;
        }

        public Criteria andDataGradeEqualTo(Integer value) {
            addCriterion("data_grade =", value, "dataGrade");
            return (Criteria) this;
        }

        public Criteria andDataGradeNotEqualTo(Integer value) {
            addCriterion("data_grade <>", value, "dataGrade");
            return (Criteria) this;
        }

        public Criteria andDataGradeGreaterThan(Integer value) {
            addCriterion("data_grade >", value, "dataGrade");
            return (Criteria) this;
        }

        public Criteria andDataGradeGreaterThanOrEqualTo(Integer value) {
            addCriterion("data_grade >=", value, "dataGrade");
            return (Criteria) this;
        }

        public Criteria andDataGradeLessThan(Integer value) {
            addCriterion("data_grade <", value, "dataGrade");
            return (Criteria) this;
        }

        public Criteria andDataGradeLessThanOrEqualTo(Integer value) {
            addCriterion("data_grade <=", value, "dataGrade");
            return (Criteria) this;
        }

        public Criteria andDataGradeIn(List<Integer> values) {
            addCriterion("data_grade in", values, "dataGrade");
            return (Criteria) this;
        }

        public Criteria andDataGradeNotIn(List<Integer> values) {
            addCriterion("data_grade not in", values, "dataGrade");
            return (Criteria) this;
        }

        public Criteria andDataGradeBetween(Integer value1, Integer value2) {
            addCriterion("data_grade between", value1, value2, "dataGrade");
            return (Criteria) this;
        }

        public Criteria andDataGradeNotBetween(Integer value1, Integer value2) {
            addCriterion("data_grade not between", value1, value2, "dataGrade");
            return (Criteria) this;
        }

        public Criteria andCompanyGradeIsNull() {
            addCriterion("company_grade is null");
            return (Criteria) this;
        }

        public Criteria andCompanyGradeIsNotNull() {
            addCriterion("company_grade is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyGradeEqualTo(Integer value) {
            addCriterion("company_grade =", value, "companyGrade");
            return (Criteria) this;
        }

        public Criteria andCompanyGradeNotEqualTo(Integer value) {
            addCriterion("company_grade <>", value, "companyGrade");
            return (Criteria) this;
        }

        public Criteria andCompanyGradeGreaterThan(Integer value) {
            addCriterion("company_grade >", value, "companyGrade");
            return (Criteria) this;
        }

        public Criteria andCompanyGradeGreaterThanOrEqualTo(Integer value) {
            addCriterion("company_grade >=", value, "companyGrade");
            return (Criteria) this;
        }

        public Criteria andCompanyGradeLessThan(Integer value) {
            addCriterion("company_grade <", value, "companyGrade");
            return (Criteria) this;
        }

        public Criteria andCompanyGradeLessThanOrEqualTo(Integer value) {
            addCriterion("company_grade <=", value, "companyGrade");
            return (Criteria) this;
        }

        public Criteria andCompanyGradeIn(List<Integer> values) {
            addCriterion("company_grade in", values, "companyGrade");
            return (Criteria) this;
        }

        public Criteria andCompanyGradeNotIn(List<Integer> values) {
            addCriterion("company_grade not in", values, "companyGrade");
            return (Criteria) this;
        }

        public Criteria andCompanyGradeBetween(Integer value1, Integer value2) {
            addCriterion("company_grade between", value1, value2, "companyGrade");
            return (Criteria) this;
        }

        public Criteria andCompanyGradeNotBetween(Integer value1, Integer value2) {
            addCriterion("company_grade not between", value1, value2, "companyGrade");
            return (Criteria) this;
        }

        public Criteria andEngineerGradeIsNull() {
            addCriterion("engineer_grade is null");
            return (Criteria) this;
        }

        public Criteria andEngineerGradeIsNotNull() {
            addCriterion("engineer_grade is not null");
            return (Criteria) this;
        }

        public Criteria andEngineerGradeEqualTo(Integer value) {
            addCriterion("engineer_grade =", value, "engineerGrade");
            return (Criteria) this;
        }

        public Criteria andEngineerGradeNotEqualTo(Integer value) {
            addCriterion("engineer_grade <>", value, "engineerGrade");
            return (Criteria) this;
        }

        public Criteria andEngineerGradeGreaterThan(Integer value) {
            addCriterion("engineer_grade >", value, "engineerGrade");
            return (Criteria) this;
        }

        public Criteria andEngineerGradeGreaterThanOrEqualTo(Integer value) {
            addCriterion("engineer_grade >=", value, "engineerGrade");
            return (Criteria) this;
        }

        public Criteria andEngineerGradeLessThan(Integer value) {
            addCriterion("engineer_grade <", value, "engineerGrade");
            return (Criteria) this;
        }

        public Criteria andEngineerGradeLessThanOrEqualTo(Integer value) {
            addCriterion("engineer_grade <=", value, "engineerGrade");
            return (Criteria) this;
        }

        public Criteria andEngineerGradeIn(List<Integer> values) {
            addCriterion("engineer_grade in", values, "engineerGrade");
            return (Criteria) this;
        }

        public Criteria andEngineerGradeNotIn(List<Integer> values) {
            addCriterion("engineer_grade not in", values, "engineerGrade");
            return (Criteria) this;
        }

        public Criteria andEngineerGradeBetween(Integer value1, Integer value2) {
            addCriterion("engineer_grade between", value1, value2, "engineerGrade");
            return (Criteria) this;
        }

        public Criteria andEngineerGradeNotBetween(Integer value1, Integer value2) {
            addCriterion("engineer_grade not between", value1, value2, "engineerGrade");
            return (Criteria) this;
        }

        public Criteria andManagerGradeIsNull() {
            addCriterion("manager_grade is null");
            return (Criteria) this;
        }

        public Criteria andManagerGradeIsNotNull() {
            addCriterion("manager_grade is not null");
            return (Criteria) this;
        }

        public Criteria andManagerGradeEqualTo(Integer value) {
            addCriterion("manager_grade =", value, "managerGrade");
            return (Criteria) this;
        }

        public Criteria andManagerGradeNotEqualTo(Integer value) {
            addCriterion("manager_grade <>", value, "managerGrade");
            return (Criteria) this;
        }

        public Criteria andManagerGradeGreaterThan(Integer value) {
            addCriterion("manager_grade >", value, "managerGrade");
            return (Criteria) this;
        }

        public Criteria andManagerGradeGreaterThanOrEqualTo(Integer value) {
            addCriterion("manager_grade >=", value, "managerGrade");
            return (Criteria) this;
        }

        public Criteria andManagerGradeLessThan(Integer value) {
            addCriterion("manager_grade <", value, "managerGrade");
            return (Criteria) this;
        }

        public Criteria andManagerGradeLessThanOrEqualTo(Integer value) {
            addCriterion("manager_grade <=", value, "managerGrade");
            return (Criteria) this;
        }

        public Criteria andManagerGradeIn(List<Integer> values) {
            addCriterion("manager_grade in", values, "managerGrade");
            return (Criteria) this;
        }

        public Criteria andManagerGradeNotIn(List<Integer> values) {
            addCriterion("manager_grade not in", values, "managerGrade");
            return (Criteria) this;
        }

        public Criteria andManagerGradeBetween(Integer value1, Integer value2) {
            addCriterion("manager_grade between", value1, value2, "managerGrade");
            return (Criteria) this;
        }

        public Criteria andManagerGradeNotBetween(Integer value1, Integer value2) {
            addCriterion("manager_grade not between", value1, value2, "managerGrade");
            return (Criteria) this;
        }

        public Criteria andResultGradeIsNull() {
            addCriterion("result_grade is null");
            return (Criteria) this;
        }

        public Criteria andResultGradeIsNotNull() {
            addCriterion("result_grade is not null");
            return (Criteria) this;
        }

        public Criteria andResultGradeEqualTo(Integer value) {
            addCriterion("result_grade =", value, "resultGrade");
            return (Criteria) this;
        }

        public Criteria andResultGradeNotEqualTo(Integer value) {
            addCriterion("result_grade <>", value, "resultGrade");
            return (Criteria) this;
        }

        public Criteria andResultGradeGreaterThan(Integer value) {
            addCriterion("result_grade >", value, "resultGrade");
            return (Criteria) this;
        }

        public Criteria andResultGradeGreaterThanOrEqualTo(Integer value) {
            addCriterion("result_grade >=", value, "resultGrade");
            return (Criteria) this;
        }

        public Criteria andResultGradeLessThan(Integer value) {
            addCriterion("result_grade <", value, "resultGrade");
            return (Criteria) this;
        }

        public Criteria andResultGradeLessThanOrEqualTo(Integer value) {
            addCriterion("result_grade <=", value, "resultGrade");
            return (Criteria) this;
        }

        public Criteria andResultGradeIn(List<Integer> values) {
            addCriterion("result_grade in", values, "resultGrade");
            return (Criteria) this;
        }

        public Criteria andResultGradeNotIn(List<Integer> values) {
            addCriterion("result_grade not in", values, "resultGrade");
            return (Criteria) this;
        }

        public Criteria andResultGradeBetween(Integer value1, Integer value2) {
            addCriterion("result_grade between", value1, value2, "resultGrade");
            return (Criteria) this;
        }

        public Criteria andResultGradeNotBetween(Integer value1, Integer value2) {
            addCriterion("result_grade not between", value1, value2, "resultGrade");
            return (Criteria) this;
        }

        public Criteria andPersonGradeIsNull() {
            addCriterion("person_grade is null");
            return (Criteria) this;
        }

        public Criteria andPersonGradeIsNotNull() {
            addCriterion("person_grade is not null");
            return (Criteria) this;
        }

        public Criteria andPersonGradeEqualTo(Integer value) {
            addCriterion("person_grade =", value, "personGrade");
            return (Criteria) this;
        }

        public Criteria andPersonGradeNotEqualTo(Integer value) {
            addCriterion("person_grade <>", value, "personGrade");
            return (Criteria) this;
        }

        public Criteria andPersonGradeGreaterThan(Integer value) {
            addCriterion("person_grade >", value, "personGrade");
            return (Criteria) this;
        }

        public Criteria andPersonGradeGreaterThanOrEqualTo(Integer value) {
            addCriterion("person_grade >=", value, "personGrade");
            return (Criteria) this;
        }

        public Criteria andPersonGradeLessThan(Integer value) {
            addCriterion("person_grade <", value, "personGrade");
            return (Criteria) this;
        }

        public Criteria andPersonGradeLessThanOrEqualTo(Integer value) {
            addCriterion("person_grade <=", value, "personGrade");
            return (Criteria) this;
        }

        public Criteria andPersonGradeIn(List<Integer> values) {
            addCriterion("person_grade in", values, "personGrade");
            return (Criteria) this;
        }

        public Criteria andPersonGradeNotIn(List<Integer> values) {
            addCriterion("person_grade not in", values, "personGrade");
            return (Criteria) this;
        }

        public Criteria andPersonGradeBetween(Integer value1, Integer value2) {
            addCriterion("person_grade between", value1, value2, "personGrade");
            return (Criteria) this;
        }

        public Criteria andPersonGradeNotBetween(Integer value1, Integer value2) {
            addCriterion("person_grade not between", value1, value2, "personGrade");
            return (Criteria) this;
        }

        public Criteria andRecordGradeIsNull() {
            addCriterion("record_grade is null");
            return (Criteria) this;
        }

        public Criteria andRecordGradeIsNotNull() {
            addCriterion("record_grade is not null");
            return (Criteria) this;
        }

        public Criteria andRecordGradeEqualTo(Integer value) {
            addCriterion("record_grade =", value, "recordGrade");
            return (Criteria) this;
        }

        public Criteria andRecordGradeNotEqualTo(Integer value) {
            addCriterion("record_grade <>", value, "recordGrade");
            return (Criteria) this;
        }

        public Criteria andRecordGradeGreaterThan(Integer value) {
            addCriterion("record_grade >", value, "recordGrade");
            return (Criteria) this;
        }

        public Criteria andRecordGradeGreaterThanOrEqualTo(Integer value) {
            addCriterion("record_grade >=", value, "recordGrade");
            return (Criteria) this;
        }

        public Criteria andRecordGradeLessThan(Integer value) {
            addCriterion("record_grade <", value, "recordGrade");
            return (Criteria) this;
        }

        public Criteria andRecordGradeLessThanOrEqualTo(Integer value) {
            addCriterion("record_grade <=", value, "recordGrade");
            return (Criteria) this;
        }

        public Criteria andRecordGradeIn(List<Integer> values) {
            addCriterion("record_grade in", values, "recordGrade");
            return (Criteria) this;
        }

        public Criteria andRecordGradeNotIn(List<Integer> values) {
            addCriterion("record_grade not in", values, "recordGrade");
            return (Criteria) this;
        }

        public Criteria andRecordGradeBetween(Integer value1, Integer value2) {
            addCriterion("record_grade between", value1, value2, "recordGrade");
            return (Criteria) this;
        }

        public Criteria andRecordGradeNotBetween(Integer value1, Integer value2) {
            addCriterion("record_grade not between", value1, value2, "recordGrade");
            return (Criteria) this;
        }

        public Criteria andProjectManagerGradeIsNull() {
            addCriterion("project_manager_grade is null");
            return (Criteria) this;
        }

        public Criteria andProjectManagerGradeIsNotNull() {
            addCriterion("project_manager_grade is not null");
            return (Criteria) this;
        }

        public Criteria andProjectManagerGradeEqualTo(Integer value) {
            addCriterion("project_manager_grade =", value, "projectManagerGrade");
            return (Criteria) this;
        }

        public Criteria andProjectManagerGradeNotEqualTo(Integer value) {
            addCriterion("project_manager_grade <>", value, "projectManagerGrade");
            return (Criteria) this;
        }

        public Criteria andProjectManagerGradeGreaterThan(Integer value) {
            addCriterion("project_manager_grade >", value, "projectManagerGrade");
            return (Criteria) this;
        }

        public Criteria andProjectManagerGradeGreaterThanOrEqualTo(Integer value) {
            addCriterion("project_manager_grade >=", value, "projectManagerGrade");
            return (Criteria) this;
        }

        public Criteria andProjectManagerGradeLessThan(Integer value) {
            addCriterion("project_manager_grade <", value, "projectManagerGrade");
            return (Criteria) this;
        }

        public Criteria andProjectManagerGradeLessThanOrEqualTo(Integer value) {
            addCriterion("project_manager_grade <=", value, "projectManagerGrade");
            return (Criteria) this;
        }

        public Criteria andProjectManagerGradeIn(List<Integer> values) {
            addCriterion("project_manager_grade in", values, "projectManagerGrade");
            return (Criteria) this;
        }

        public Criteria andProjectManagerGradeNotIn(List<Integer> values) {
            addCriterion("project_manager_grade not in", values, "projectManagerGrade");
            return (Criteria) this;
        }

        public Criteria andProjectManagerGradeBetween(Integer value1, Integer value2) {
            addCriterion("project_manager_grade between", value1, value2, "projectManagerGrade");
            return (Criteria) this;
        }

        public Criteria andProjectManagerGradeNotBetween(Integer value1, Integer value2) {
            addCriterion("project_manager_grade not between", value1, value2, "projectManagerGrade");
            return (Criteria) this;
        }

        public Criteria andPrizeGradeIsNull() {
            addCriterion("prize_grade is null");
            return (Criteria) this;
        }

        public Criteria andPrizeGradeIsNotNull() {
            addCriterion("prize_grade is not null");
            return (Criteria) this;
        }

        public Criteria andPrizeGradeEqualTo(Integer value) {
            addCriterion("prize_grade =", value, "prizeGrade");
            return (Criteria) this;
        }

        public Criteria andPrizeGradeNotEqualTo(Integer value) {
            addCriterion("prize_grade <>", value, "prizeGrade");
            return (Criteria) this;
        }

        public Criteria andPrizeGradeGreaterThan(Integer value) {
            addCriterion("prize_grade >", value, "prizeGrade");
            return (Criteria) this;
        }

        public Criteria andPrizeGradeGreaterThanOrEqualTo(Integer value) {
            addCriterion("prize_grade >=", value, "prizeGrade");
            return (Criteria) this;
        }

        public Criteria andPrizeGradeLessThan(Integer value) {
            addCriterion("prize_grade <", value, "prizeGrade");
            return (Criteria) this;
        }

        public Criteria andPrizeGradeLessThanOrEqualTo(Integer value) {
            addCriterion("prize_grade <=", value, "prizeGrade");
            return (Criteria) this;
        }

        public Criteria andPrizeGradeIn(List<Integer> values) {
            addCriterion("prize_grade in", values, "prizeGrade");
            return (Criteria) this;
        }

        public Criteria andPrizeGradeNotIn(List<Integer> values) {
            addCriterion("prize_grade not in", values, "prizeGrade");
            return (Criteria) this;
        }

        public Criteria andPrizeGradeBetween(Integer value1, Integer value2) {
            addCriterion("prize_grade between", value1, value2, "prizeGrade");
            return (Criteria) this;
        }

        public Criteria andPrizeGradeNotBetween(Integer value1, Integer value2) {
            addCriterion("prize_grade not between", value1, value2, "prizeGrade");
            return (Criteria) this;
        }

        public Criteria andBreakRulesGradeIsNull() {
            addCriterion("break_rules_grade is null");
            return (Criteria) this;
        }

        public Criteria andBreakRulesGradeIsNotNull() {
            addCriterion("break_rules_grade is not null");
            return (Criteria) this;
        }

        public Criteria andBreakRulesGradeEqualTo(Integer value) {
            addCriterion("break_rules_grade =", value, "breakRulesGrade");
            return (Criteria) this;
        }

        public Criteria andBreakRulesGradeNotEqualTo(Integer value) {
            addCriterion("break_rules_grade <>", value, "breakRulesGrade");
            return (Criteria) this;
        }

        public Criteria andBreakRulesGradeGreaterThan(Integer value) {
            addCriterion("break_rules_grade >", value, "breakRulesGrade");
            return (Criteria) this;
        }

        public Criteria andBreakRulesGradeGreaterThanOrEqualTo(Integer value) {
            addCriterion("break_rules_grade >=", value, "breakRulesGrade");
            return (Criteria) this;
        }

        public Criteria andBreakRulesGradeLessThan(Integer value) {
            addCriterion("break_rules_grade <", value, "breakRulesGrade");
            return (Criteria) this;
        }

        public Criteria andBreakRulesGradeLessThanOrEqualTo(Integer value) {
            addCriterion("break_rules_grade <=", value, "breakRulesGrade");
            return (Criteria) this;
        }

        public Criteria andBreakRulesGradeIn(List<Integer> values) {
            addCriterion("break_rules_grade in", values, "breakRulesGrade");
            return (Criteria) this;
        }

        public Criteria andBreakRulesGradeNotIn(List<Integer> values) {
            addCriterion("break_rules_grade not in", values, "breakRulesGrade");
            return (Criteria) this;
        }

        public Criteria andBreakRulesGradeBetween(Integer value1, Integer value2) {
            addCriterion("break_rules_grade between", value1, value2, "breakRulesGrade");
            return (Criteria) this;
        }

        public Criteria andBreakRulesGradeNotBetween(Integer value1, Integer value2) {
            addCriterion("break_rules_grade not between", value1, value2, "breakRulesGrade");
            return (Criteria) this;
        }

        public Criteria andDefaultGradeIsNull() {
            addCriterion("default_grade is null");
            return (Criteria) this;
        }

        public Criteria andDefaultGradeIsNotNull() {
            addCriterion("default_grade is not null");
            return (Criteria) this;
        }

        public Criteria andDefaultGradeEqualTo(Integer value) {
            addCriterion("default_grade =", value, "defaultGrade");
            return (Criteria) this;
        }

        public Criteria andDefaultGradeNotEqualTo(Integer value) {
            addCriterion("default_grade <>", value, "defaultGrade");
            return (Criteria) this;
        }

        public Criteria andDefaultGradeGreaterThan(Integer value) {
            addCriterion("default_grade >", value, "defaultGrade");
            return (Criteria) this;
        }

        public Criteria andDefaultGradeGreaterThanOrEqualTo(Integer value) {
            addCriterion("default_grade >=", value, "defaultGrade");
            return (Criteria) this;
        }

        public Criteria andDefaultGradeLessThan(Integer value) {
            addCriterion("default_grade <", value, "defaultGrade");
            return (Criteria) this;
        }

        public Criteria andDefaultGradeLessThanOrEqualTo(Integer value) {
            addCriterion("default_grade <=", value, "defaultGrade");
            return (Criteria) this;
        }

        public Criteria andDefaultGradeIn(List<Integer> values) {
            addCriterion("default_grade in", values, "defaultGrade");
            return (Criteria) this;
        }

        public Criteria andDefaultGradeNotIn(List<Integer> values) {
            addCriterion("default_grade not in", values, "defaultGrade");
            return (Criteria) this;
        }

        public Criteria andDefaultGradeBetween(Integer value1, Integer value2) {
            addCriterion("default_grade between", value1, value2, "defaultGrade");
            return (Criteria) this;
        }

        public Criteria andDefaultGradeNotBetween(Integer value1, Integer value2) {
            addCriterion("default_grade not between", value1, value2, "defaultGrade");
            return (Criteria) this;
        }

        public Criteria andBreakPromiseGradeIsNull() {
            addCriterion("break_promise_grade is null");
            return (Criteria) this;
        }

        public Criteria andBreakPromiseGradeIsNotNull() {
            addCriterion("break_promise_grade is not null");
            return (Criteria) this;
        }

        public Criteria andBreakPromiseGradeEqualTo(Integer value) {
            addCriterion("break_promise_grade =", value, "breakPromiseGrade");
            return (Criteria) this;
        }

        public Criteria andBreakPromiseGradeNotEqualTo(Integer value) {
            addCriterion("break_promise_grade <>", value, "breakPromiseGrade");
            return (Criteria) this;
        }

        public Criteria andBreakPromiseGradeGreaterThan(Integer value) {
            addCriterion("break_promise_grade >", value, "breakPromiseGrade");
            return (Criteria) this;
        }

        public Criteria andBreakPromiseGradeGreaterThanOrEqualTo(Integer value) {
            addCriterion("break_promise_grade >=", value, "breakPromiseGrade");
            return (Criteria) this;
        }

        public Criteria andBreakPromiseGradeLessThan(Integer value) {
            addCriterion("break_promise_grade <", value, "breakPromiseGrade");
            return (Criteria) this;
        }

        public Criteria andBreakPromiseGradeLessThanOrEqualTo(Integer value) {
            addCriterion("break_promise_grade <=", value, "breakPromiseGrade");
            return (Criteria) this;
        }

        public Criteria andBreakPromiseGradeIn(List<Integer> values) {
            addCriterion("break_promise_grade in", values, "breakPromiseGrade");
            return (Criteria) this;
        }

        public Criteria andBreakPromiseGradeNotIn(List<Integer> values) {
            addCriterion("break_promise_grade not in", values, "breakPromiseGrade");
            return (Criteria) this;
        }

        public Criteria andBreakPromiseGradeBetween(Integer value1, Integer value2) {
            addCriterion("break_promise_grade between", value1, value2, "breakPromiseGrade");
            return (Criteria) this;
        }

        public Criteria andBreakPromiseGradeNotBetween(Integer value1, Integer value2) {
            addCriterion("break_promise_grade not between", value1, value2, "breakPromiseGrade");
            return (Criteria) this;
        }

        public Criteria andReleaseOrgNameIsNull() {
            addCriterion("release_org_name is null");
            return (Criteria) this;
        }

        public Criteria andReleaseOrgNameIsNotNull() {
            addCriterion("release_org_name is not null");
            return (Criteria) this;
        }

        public Criteria andReleaseOrgNameEqualTo(String value) {
            addCriterion("release_org_name =", value, "releaseOrgName");
            return (Criteria) this;
        }

        public Criteria andReleaseOrgNameNotEqualTo(String value) {
            addCriterion("release_org_name <>", value, "releaseOrgName");
            return (Criteria) this;
        }

        public Criteria andReleaseOrgNameGreaterThan(String value) {
            addCriterion("release_org_name >", value, "releaseOrgName");
            return (Criteria) this;
        }

        public Criteria andReleaseOrgNameGreaterThanOrEqualTo(String value) {
            addCriterion("release_org_name >=", value, "releaseOrgName");
            return (Criteria) this;
        }

        public Criteria andReleaseOrgNameLessThan(String value) {
            addCriterion("release_org_name <", value, "releaseOrgName");
            return (Criteria) this;
        }

        public Criteria andReleaseOrgNameLessThanOrEqualTo(String value) {
            addCriterion("release_org_name <=", value, "releaseOrgName");
            return (Criteria) this;
        }

        public Criteria andReleaseOrgNameLike(String value) {
            addCriterion("release_org_name like", value, "releaseOrgName");
            return (Criteria) this;
        }

        public Criteria andReleaseOrgNameNotLike(String value) {
            addCriterion("release_org_name not like", value, "releaseOrgName");
            return (Criteria) this;
        }

        public Criteria andReleaseOrgNameIn(List<String> values) {
            addCriterion("release_org_name in", values, "releaseOrgName");
            return (Criteria) this;
        }

        public Criteria andReleaseOrgNameNotIn(List<String> values) {
            addCriterion("release_org_name not in", values, "releaseOrgName");
            return (Criteria) this;
        }

        public Criteria andReleaseOrgNameBetween(String value1, String value2) {
            addCriterion("release_org_name between", value1, value2, "releaseOrgName");
            return (Criteria) this;
        }

        public Criteria andReleaseOrgNameNotBetween(String value1, String value2) {
            addCriterion("release_org_name not between", value1, value2, "releaseOrgName");
            return (Criteria) this;
        }

        public Criteria andReleaseOrgCodeIsNull() {
            addCriterion("release_org_code is null");
            return (Criteria) this;
        }

        public Criteria andReleaseOrgCodeIsNotNull() {
            addCriterion("release_org_code is not null");
            return (Criteria) this;
        }

        public Criteria andReleaseOrgCodeEqualTo(String value) {
            addCriterion("release_org_code =", value, "releaseOrgCode");
            return (Criteria) this;
        }

        public Criteria andReleaseOrgCodeNotEqualTo(String value) {
            addCriterion("release_org_code <>", value, "releaseOrgCode");
            return (Criteria) this;
        }

        public Criteria andReleaseOrgCodeGreaterThan(String value) {
            addCriterion("release_org_code >", value, "releaseOrgCode");
            return (Criteria) this;
        }

        public Criteria andReleaseOrgCodeGreaterThanOrEqualTo(String value) {
            addCriterion("release_org_code >=", value, "releaseOrgCode");
            return (Criteria) this;
        }

        public Criteria andReleaseOrgCodeLessThan(String value) {
            addCriterion("release_org_code <", value, "releaseOrgCode");
            return (Criteria) this;
        }

        public Criteria andReleaseOrgCodeLessThanOrEqualTo(String value) {
            addCriterion("release_org_code <=", value, "releaseOrgCode");
            return (Criteria) this;
        }

        public Criteria andReleaseOrgCodeLike(String value) {
            addCriterion("release_org_code like", value, "releaseOrgCode");
            return (Criteria) this;
        }

        public Criteria andReleaseOrgCodeNotLike(String value) {
            addCriterion("release_org_code not like", value, "releaseOrgCode");
            return (Criteria) this;
        }

        public Criteria andReleaseOrgCodeIn(List<String> values) {
            addCriterion("release_org_code in", values, "releaseOrgCode");
            return (Criteria) this;
        }

        public Criteria andReleaseOrgCodeNotIn(List<String> values) {
            addCriterion("release_org_code not in", values, "releaseOrgCode");
            return (Criteria) this;
        }

        public Criteria andReleaseOrgCodeBetween(String value1, String value2) {
            addCriterion("release_org_code between", value1, value2, "releaseOrgCode");
            return (Criteria) this;
        }

        public Criteria andReleaseOrgCodeNotBetween(String value1, String value2) {
            addCriterion("release_org_code not between", value1, value2, "releaseOrgCode");
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