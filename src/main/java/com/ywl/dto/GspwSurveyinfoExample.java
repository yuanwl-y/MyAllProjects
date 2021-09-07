package com.ywl.dto;

import java.util.ArrayList;
import java.util.List;

public class GspwSurveyinfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public GspwSurveyinfoExample() {
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

        public Criteria andSurveyinfoIdIsNull() {
            addCriterion("surveyInfo_id is null");
            return (Criteria) this;
        }

        public Criteria andSurveyinfoIdIsNotNull() {
            addCriterion("surveyInfo_id is not null");
            return (Criteria) this;
        }

        public Criteria andSurveyinfoIdEqualTo(Integer value) {
            addCriterion("surveyInfo_id =", value, "surveyinfoId");
            return (Criteria) this;
        }

        public Criteria andSurveyinfoIdNotEqualTo(Integer value) {
            addCriterion("surveyInfo_id <>", value, "surveyinfoId");
            return (Criteria) this;
        }

        public Criteria andSurveyinfoIdGreaterThan(Integer value) {
            addCriterion("surveyInfo_id >", value, "surveyinfoId");
            return (Criteria) this;
        }

        public Criteria andSurveyinfoIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("surveyInfo_id >=", value, "surveyinfoId");
            return (Criteria) this;
        }

        public Criteria andSurveyinfoIdLessThan(Integer value) {
            addCriterion("surveyInfo_id <", value, "surveyinfoId");
            return (Criteria) this;
        }

        public Criteria andSurveyinfoIdLessThanOrEqualTo(Integer value) {
            addCriterion("surveyInfo_id <=", value, "surveyinfoId");
            return (Criteria) this;
        }

        public Criteria andSurveyinfoIdIn(List<Integer> values) {
            addCriterion("surveyInfo_id in", values, "surveyinfoId");
            return (Criteria) this;
        }

        public Criteria andSurveyinfoIdNotIn(List<Integer> values) {
            addCriterion("surveyInfo_id not in", values, "surveyinfoId");
            return (Criteria) this;
        }

        public Criteria andSurveyinfoIdBetween(Integer value1, Integer value2) {
            addCriterion("surveyInfo_id between", value1, value2, "surveyinfoId");
            return (Criteria) this;
        }

        public Criteria andSurveyinfoIdNotBetween(Integer value1, Integer value2) {
            addCriterion("surveyInfo_id not between", value1, value2, "surveyinfoId");
            return (Criteria) this;
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

        public Criteria andMonprojectIdIsNull() {
            addCriterion("monproject_id is null");
            return (Criteria) this;
        }

        public Criteria andMonprojectIdIsNotNull() {
            addCriterion("monproject_id is not null");
            return (Criteria) this;
        }

        public Criteria andMonprojectIdEqualTo(String value) {
            addCriterion("monproject_id =", value, "monprojectId");
            return (Criteria) this;
        }

        public Criteria andMonprojectIdNotEqualTo(String value) {
            addCriterion("monproject_id <>", value, "monprojectId");
            return (Criteria) this;
        }

        public Criteria andMonprojectIdGreaterThan(String value) {
            addCriterion("monproject_id >", value, "monprojectId");
            return (Criteria) this;
        }

        public Criteria andMonprojectIdGreaterThanOrEqualTo(String value) {
            addCriterion("monproject_id >=", value, "monprojectId");
            return (Criteria) this;
        }

        public Criteria andMonprojectIdLessThan(String value) {
            addCriterion("monproject_id <", value, "monprojectId");
            return (Criteria) this;
        }

        public Criteria andMonprojectIdLessThanOrEqualTo(String value) {
            addCriterion("monproject_id <=", value, "monprojectId");
            return (Criteria) this;
        }

        public Criteria andMonprojectIdLike(String value) {
            addCriterion("monproject_id like", value, "monprojectId");
            return (Criteria) this;
        }

        public Criteria andMonprojectIdNotLike(String value) {
            addCriterion("monproject_id not like", value, "monprojectId");
            return (Criteria) this;
        }

        public Criteria andMonprojectIdIn(List<String> values) {
            addCriterion("monproject_id in", values, "monprojectId");
            return (Criteria) this;
        }

        public Criteria andMonprojectIdNotIn(List<String> values) {
            addCriterion("monproject_id not in", values, "monprojectId");
            return (Criteria) this;
        }

        public Criteria andMonprojectIdBetween(String value1, String value2) {
            addCriterion("monproject_id between", value1, value2, "monprojectId");
            return (Criteria) this;
        }

        public Criteria andMonprojectIdNotBetween(String value1, String value2) {
            addCriterion("monproject_id not between", value1, value2, "monprojectId");
            return (Criteria) this;
        }

        public Criteria andSurveyinfoWbsIsNull() {
            addCriterion("surveyInfo_wbs is null");
            return (Criteria) this;
        }

        public Criteria andSurveyinfoWbsIsNotNull() {
            addCriterion("surveyInfo_wbs is not null");
            return (Criteria) this;
        }

        public Criteria andSurveyinfoWbsEqualTo(String value) {
            addCriterion("surveyInfo_wbs =", value, "surveyinfoWbs");
            return (Criteria) this;
        }

        public Criteria andSurveyinfoWbsNotEqualTo(String value) {
            addCriterion("surveyInfo_wbs <>", value, "surveyinfoWbs");
            return (Criteria) this;
        }

        public Criteria andSurveyinfoWbsGreaterThan(String value) {
            addCriterion("surveyInfo_wbs >", value, "surveyinfoWbs");
            return (Criteria) this;
        }

        public Criteria andSurveyinfoWbsGreaterThanOrEqualTo(String value) {
            addCriterion("surveyInfo_wbs >=", value, "surveyinfoWbs");
            return (Criteria) this;
        }

        public Criteria andSurveyinfoWbsLessThan(String value) {
            addCriterion("surveyInfo_wbs <", value, "surveyinfoWbs");
            return (Criteria) this;
        }

        public Criteria andSurveyinfoWbsLessThanOrEqualTo(String value) {
            addCriterion("surveyInfo_wbs <=", value, "surveyinfoWbs");
            return (Criteria) this;
        }

        public Criteria andSurveyinfoWbsLike(String value) {
            addCriterion("surveyInfo_wbs like", value, "surveyinfoWbs");
            return (Criteria) this;
        }

        public Criteria andSurveyinfoWbsNotLike(String value) {
            addCriterion("surveyInfo_wbs not like", value, "surveyinfoWbs");
            return (Criteria) this;
        }

        public Criteria andSurveyinfoWbsIn(List<String> values) {
            addCriterion("surveyInfo_wbs in", values, "surveyinfoWbs");
            return (Criteria) this;
        }

        public Criteria andSurveyinfoWbsNotIn(List<String> values) {
            addCriterion("surveyInfo_wbs not in", values, "surveyinfoWbs");
            return (Criteria) this;
        }

        public Criteria andSurveyinfoWbsBetween(String value1, String value2) {
            addCriterion("surveyInfo_wbs between", value1, value2, "surveyinfoWbs");
            return (Criteria) this;
        }

        public Criteria andSurveyinfoWbsNotBetween(String value1, String value2) {
            addCriterion("surveyInfo_wbs not between", value1, value2, "surveyinfoWbs");
            return (Criteria) this;
        }

        public Criteria andSurveyinfoNameIsNull() {
            addCriterion("surveyInfo_name is null");
            return (Criteria) this;
        }

        public Criteria andSurveyinfoNameIsNotNull() {
            addCriterion("surveyInfo_name is not null");
            return (Criteria) this;
        }

        public Criteria andSurveyinfoNameEqualTo(String value) {
            addCriterion("surveyInfo_name =", value, "surveyinfoName");
            return (Criteria) this;
        }

        public Criteria andSurveyinfoNameNotEqualTo(String value) {
            addCriterion("surveyInfo_name <>", value, "surveyinfoName");
            return (Criteria) this;
        }

        public Criteria andSurveyinfoNameGreaterThan(String value) {
            addCriterion("surveyInfo_name >", value, "surveyinfoName");
            return (Criteria) this;
        }

        public Criteria andSurveyinfoNameGreaterThanOrEqualTo(String value) {
            addCriterion("surveyInfo_name >=", value, "surveyinfoName");
            return (Criteria) this;
        }

        public Criteria andSurveyinfoNameLessThan(String value) {
            addCriterion("surveyInfo_name <", value, "surveyinfoName");
            return (Criteria) this;
        }

        public Criteria andSurveyinfoNameLessThanOrEqualTo(String value) {
            addCriterion("surveyInfo_name <=", value, "surveyinfoName");
            return (Criteria) this;
        }

        public Criteria andSurveyinfoNameLike(String value) {
            addCriterion("surveyInfo_name like", value, "surveyinfoName");
            return (Criteria) this;
        }

        public Criteria andSurveyinfoNameNotLike(String value) {
            addCriterion("surveyInfo_name not like", value, "surveyinfoName");
            return (Criteria) this;
        }

        public Criteria andSurveyinfoNameIn(List<String> values) {
            addCriterion("surveyInfo_name in", values, "surveyinfoName");
            return (Criteria) this;
        }

        public Criteria andSurveyinfoNameNotIn(List<String> values) {
            addCriterion("surveyInfo_name not in", values, "surveyinfoName");
            return (Criteria) this;
        }

        public Criteria andSurveyinfoNameBetween(String value1, String value2) {
            addCriterion("surveyInfo_name between", value1, value2, "surveyinfoName");
            return (Criteria) this;
        }

        public Criteria andSurveyinfoNameNotBetween(String value1, String value2) {
            addCriterion("surveyInfo_name not between", value1, value2, "surveyinfoName");
            return (Criteria) this;
        }

        public Criteria andSurveyinfoPositionIsNull() {
            addCriterion("surveyInfo_position is null");
            return (Criteria) this;
        }

        public Criteria andSurveyinfoPositionIsNotNull() {
            addCriterion("surveyInfo_position is not null");
            return (Criteria) this;
        }

        public Criteria andSurveyinfoPositionEqualTo(String value) {
            addCriterion("surveyInfo_position =", value, "surveyinfoPosition");
            return (Criteria) this;
        }

        public Criteria andSurveyinfoPositionNotEqualTo(String value) {
            addCriterion("surveyInfo_position <>", value, "surveyinfoPosition");
            return (Criteria) this;
        }

        public Criteria andSurveyinfoPositionGreaterThan(String value) {
            addCriterion("surveyInfo_position >", value, "surveyinfoPosition");
            return (Criteria) this;
        }

        public Criteria andSurveyinfoPositionGreaterThanOrEqualTo(String value) {
            addCriterion("surveyInfo_position >=", value, "surveyinfoPosition");
            return (Criteria) this;
        }

        public Criteria andSurveyinfoPositionLessThan(String value) {
            addCriterion("surveyInfo_position <", value, "surveyinfoPosition");
            return (Criteria) this;
        }

        public Criteria andSurveyinfoPositionLessThanOrEqualTo(String value) {
            addCriterion("surveyInfo_position <=", value, "surveyinfoPosition");
            return (Criteria) this;
        }

        public Criteria andSurveyinfoPositionLike(String value) {
            addCriterion("surveyInfo_position like", value, "surveyinfoPosition");
            return (Criteria) this;
        }

        public Criteria andSurveyinfoPositionNotLike(String value) {
            addCriterion("surveyInfo_position not like", value, "surveyinfoPosition");
            return (Criteria) this;
        }

        public Criteria andSurveyinfoPositionIn(List<String> values) {
            addCriterion("surveyInfo_position in", values, "surveyinfoPosition");
            return (Criteria) this;
        }

        public Criteria andSurveyinfoPositionNotIn(List<String> values) {
            addCriterion("surveyInfo_position not in", values, "surveyinfoPosition");
            return (Criteria) this;
        }

        public Criteria andSurveyinfoPositionBetween(String value1, String value2) {
            addCriterion("surveyInfo_position between", value1, value2, "surveyinfoPosition");
            return (Criteria) this;
        }

        public Criteria andSurveyinfoPositionNotBetween(String value1, String value2) {
            addCriterion("surveyInfo_position not between", value1, value2, "surveyinfoPosition");
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

        public Criteria andPanoramicPhotoIsNull() {
            addCriterion("panoramic_photo is null");
            return (Criteria) this;
        }

        public Criteria andPanoramicPhotoIsNotNull() {
            addCriterion("panoramic_photo is not null");
            return (Criteria) this;
        }

        public Criteria andPanoramicPhotoEqualTo(String value) {
            addCriterion("panoramic_photo =", value, "panoramicPhoto");
            return (Criteria) this;
        }

        public Criteria andPanoramicPhotoNotEqualTo(String value) {
            addCriterion("panoramic_photo <>", value, "panoramicPhoto");
            return (Criteria) this;
        }

        public Criteria andPanoramicPhotoGreaterThan(String value) {
            addCriterion("panoramic_photo >", value, "panoramicPhoto");
            return (Criteria) this;
        }

        public Criteria andPanoramicPhotoGreaterThanOrEqualTo(String value) {
            addCriterion("panoramic_photo >=", value, "panoramicPhoto");
            return (Criteria) this;
        }

        public Criteria andPanoramicPhotoLessThan(String value) {
            addCriterion("panoramic_photo <", value, "panoramicPhoto");
            return (Criteria) this;
        }

        public Criteria andPanoramicPhotoLessThanOrEqualTo(String value) {
            addCriterion("panoramic_photo <=", value, "panoramicPhoto");
            return (Criteria) this;
        }

        public Criteria andPanoramicPhotoLike(String value) {
            addCriterion("panoramic_photo like", value, "panoramicPhoto");
            return (Criteria) this;
        }

        public Criteria andPanoramicPhotoNotLike(String value) {
            addCriterion("panoramic_photo not like", value, "panoramicPhoto");
            return (Criteria) this;
        }

        public Criteria andPanoramicPhotoIn(List<String> values) {
            addCriterion("panoramic_photo in", values, "panoramicPhoto");
            return (Criteria) this;
        }

        public Criteria andPanoramicPhotoNotIn(List<String> values) {
            addCriterion("panoramic_photo not in", values, "panoramicPhoto");
            return (Criteria) this;
        }

        public Criteria andPanoramicPhotoBetween(String value1, String value2) {
            addCriterion("panoramic_photo between", value1, value2, "panoramicPhoto");
            return (Criteria) this;
        }

        public Criteria andPanoramicPhotoNotBetween(String value1, String value2) {
            addCriterion("panoramic_photo not between", value1, value2, "panoramicPhoto");
            return (Criteria) this;
        }

        public Criteria andDisclosePhotoIsNull() {
            addCriterion("disclose_photo is null");
            return (Criteria) this;
        }

        public Criteria andDisclosePhotoIsNotNull() {
            addCriterion("disclose_photo is not null");
            return (Criteria) this;
        }

        public Criteria andDisclosePhotoEqualTo(String value) {
            addCriterion("disclose_photo =", value, "disclosePhoto");
            return (Criteria) this;
        }

        public Criteria andDisclosePhotoNotEqualTo(String value) {
            addCriterion("disclose_photo <>", value, "disclosePhoto");
            return (Criteria) this;
        }

        public Criteria andDisclosePhotoGreaterThan(String value) {
            addCriterion("disclose_photo >", value, "disclosePhoto");
            return (Criteria) this;
        }

        public Criteria andDisclosePhotoGreaterThanOrEqualTo(String value) {
            addCriterion("disclose_photo >=", value, "disclosePhoto");
            return (Criteria) this;
        }

        public Criteria andDisclosePhotoLessThan(String value) {
            addCriterion("disclose_photo <", value, "disclosePhoto");
            return (Criteria) this;
        }

        public Criteria andDisclosePhotoLessThanOrEqualTo(String value) {
            addCriterion("disclose_photo <=", value, "disclosePhoto");
            return (Criteria) this;
        }

        public Criteria andDisclosePhotoLike(String value) {
            addCriterion("disclose_photo like", value, "disclosePhoto");
            return (Criteria) this;
        }

        public Criteria andDisclosePhotoNotLike(String value) {
            addCriterion("disclose_photo not like", value, "disclosePhoto");
            return (Criteria) this;
        }

        public Criteria andDisclosePhotoIn(List<String> values) {
            addCriterion("disclose_photo in", values, "disclosePhoto");
            return (Criteria) this;
        }

        public Criteria andDisclosePhotoNotIn(List<String> values) {
            addCriterion("disclose_photo not in", values, "disclosePhoto");
            return (Criteria) this;
        }

        public Criteria andDisclosePhotoBetween(String value1, String value2) {
            addCriterion("disclose_photo between", value1, value2, "disclosePhoto");
            return (Criteria) this;
        }

        public Criteria andDisclosePhotoNotBetween(String value1, String value2) {
            addCriterion("disclose_photo not between", value1, value2, "disclosePhoto");
            return (Criteria) this;
        }

        public Criteria andWorkticketPhotoIsNull() {
            addCriterion("workTicket_photo is null");
            return (Criteria) this;
        }

        public Criteria andWorkticketPhotoIsNotNull() {
            addCriterion("workTicket_photo is not null");
            return (Criteria) this;
        }

        public Criteria andWorkticketPhotoEqualTo(String value) {
            addCriterion("workTicket_photo =", value, "workticketPhoto");
            return (Criteria) this;
        }

        public Criteria andWorkticketPhotoNotEqualTo(String value) {
            addCriterion("workTicket_photo <>", value, "workticketPhoto");
            return (Criteria) this;
        }

        public Criteria andWorkticketPhotoGreaterThan(String value) {
            addCriterion("workTicket_photo >", value, "workticketPhoto");
            return (Criteria) this;
        }

        public Criteria andWorkticketPhotoGreaterThanOrEqualTo(String value) {
            addCriterion("workTicket_photo >=", value, "workticketPhoto");
            return (Criteria) this;
        }

        public Criteria andWorkticketPhotoLessThan(String value) {
            addCriterion("workTicket_photo <", value, "workticketPhoto");
            return (Criteria) this;
        }

        public Criteria andWorkticketPhotoLessThanOrEqualTo(String value) {
            addCriterion("workTicket_photo <=", value, "workticketPhoto");
            return (Criteria) this;
        }

        public Criteria andWorkticketPhotoLike(String value) {
            addCriterion("workTicket_photo like", value, "workticketPhoto");
            return (Criteria) this;
        }

        public Criteria andWorkticketPhotoNotLike(String value) {
            addCriterion("workTicket_photo not like", value, "workticketPhoto");
            return (Criteria) this;
        }

        public Criteria andWorkticketPhotoIn(List<String> values) {
            addCriterion("workTicket_photo in", values, "workticketPhoto");
            return (Criteria) this;
        }

        public Criteria andWorkticketPhotoNotIn(List<String> values) {
            addCriterion("workTicket_photo not in", values, "workticketPhoto");
            return (Criteria) this;
        }

        public Criteria andWorkticketPhotoBetween(String value1, String value2) {
            addCriterion("workTicket_photo between", value1, value2, "workticketPhoto");
            return (Criteria) this;
        }

        public Criteria andWorkticketPhotoNotBetween(String value1, String value2) {
            addCriterion("workTicket_photo not between", value1, value2, "workticketPhoto");
            return (Criteria) this;
        }

        public Criteria andContentIsNull() {
            addCriterion("content is null");
            return (Criteria) this;
        }

        public Criteria andContentIsNotNull() {
            addCriterion("content is not null");
            return (Criteria) this;
        }

        public Criteria andContentEqualTo(String value) {
            addCriterion("content =", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotEqualTo(String value) {
            addCriterion("content <>", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentGreaterThan(String value) {
            addCriterion("content >", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentGreaterThanOrEqualTo(String value) {
            addCriterion("content >=", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLessThan(String value) {
            addCriterion("content <", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLessThanOrEqualTo(String value) {
            addCriterion("content <=", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLike(String value) {
            addCriterion("content like", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotLike(String value) {
            addCriterion("content not like", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentIn(List<String> values) {
            addCriterion("content in", values, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotIn(List<String> values) {
            addCriterion("content not in", values, "content");
            return (Criteria) this;
        }

        public Criteria andContentBetween(String value1, String value2) {
            addCriterion("content between", value1, value2, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotBetween(String value1, String value2) {
            addCriterion("content not between", value1, value2, "content");
            return (Criteria) this;
        }

        public Criteria andIsImportIsNull() {
            addCriterion("is_import is null");
            return (Criteria) this;
        }

        public Criteria andIsImportIsNotNull() {
            addCriterion("is_import is not null");
            return (Criteria) this;
        }

        public Criteria andIsImportEqualTo(Integer value) {
            addCriterion("is_import =", value, "isImport");
            return (Criteria) this;
        }

        public Criteria andIsImportNotEqualTo(Integer value) {
            addCriterion("is_import <>", value, "isImport");
            return (Criteria) this;
        }

        public Criteria andIsImportGreaterThan(Integer value) {
            addCriterion("is_import >", value, "isImport");
            return (Criteria) this;
        }

        public Criteria andIsImportGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_import >=", value, "isImport");
            return (Criteria) this;
        }

        public Criteria andIsImportLessThan(Integer value) {
            addCriterion("is_import <", value, "isImport");
            return (Criteria) this;
        }

        public Criteria andIsImportLessThanOrEqualTo(Integer value) {
            addCriterion("is_import <=", value, "isImport");
            return (Criteria) this;
        }

        public Criteria andIsImportIn(List<Integer> values) {
            addCriterion("is_import in", values, "isImport");
            return (Criteria) this;
        }

        public Criteria andIsImportNotIn(List<Integer> values) {
            addCriterion("is_import not in", values, "isImport");
            return (Criteria) this;
        }

        public Criteria andIsImportBetween(Integer value1, Integer value2) {
            addCriterion("is_import between", value1, value2, "isImport");
            return (Criteria) this;
        }

        public Criteria andIsImportNotBetween(Integer value1, Integer value2) {
            addCriterion("is_import not between", value1, value2, "isImport");
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