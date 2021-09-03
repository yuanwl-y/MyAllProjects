package ywl.dto;

public class GspwLoadScore {
    private Integer scoreId;

    private String scoreProjectName;

    private Integer scoreProjectId;

    private String scoreContractor;

    private String scoreContractorCode;

    private Integer scoreOwnerGrade;

    private Integer scoreCityGrade;

    private String scoreDeptName;

    private String scoreDeptCode;

    private String scoreGroup;

    private String scoreGroupCode;

    private String scoreTotal;

    private String scoreTime;

    private Integer scoreState;

    private String scoreOrgcode;

    private String scoreOrgcitycode;

    private String deleteMark;

    private Integer selectState;

    public Integer getScoreId() {
        return scoreId;
    }

    public void setScoreId(Integer scoreId) {
        this.scoreId = scoreId;
    }

    public String getScoreProjectName() {
        return scoreProjectName;
    }

    public void setScoreProjectName(String scoreProjectName) {
        this.scoreProjectName = scoreProjectName == null ? null : scoreProjectName.trim();
    }

    public Integer getScoreProjectId() {
        return scoreProjectId;
    }

    public void setScoreProjectId(Integer scoreProjectId) {
        this.scoreProjectId = scoreProjectId;
    }

    public String getScoreContractor() {
        return scoreContractor;
    }

    public void setScoreContractor(String scoreContractor) {
        this.scoreContractor = scoreContractor == null ? null : scoreContractor.trim();
    }

    public String getScoreContractorCode() {
        return scoreContractorCode;
    }

    public void setScoreContractorCode(String scoreContractorCode) {
        this.scoreContractorCode = scoreContractorCode == null ? null : scoreContractorCode.trim();
    }

    public Integer getScoreOwnerGrade() {
        return scoreOwnerGrade;
    }

    public void setScoreOwnerGrade(Integer scoreOwnerGrade) {
        this.scoreOwnerGrade = scoreOwnerGrade;
    }

    public Integer getScoreCityGrade() {
        return scoreCityGrade;
    }

    public void setScoreCityGrade(Integer scoreCityGrade) {
        this.scoreCityGrade = scoreCityGrade;
    }

    public String getScoreDeptName() {
        return scoreDeptName;
    }

    public void setScoreDeptName(String scoreDeptName) {
        this.scoreDeptName = scoreDeptName == null ? null : scoreDeptName.trim();
    }

    public String getScoreDeptCode() {
        return scoreDeptCode;
    }

    public void setScoreDeptCode(String scoreDeptCode) {
        this.scoreDeptCode = scoreDeptCode == null ? null : scoreDeptCode.trim();
    }

    public String getScoreGroup() {
        return scoreGroup;
    }

    public void setScoreGroup(String scoreGroup) {
        this.scoreGroup = scoreGroup == null ? null : scoreGroup.trim();
    }

    public String getScoreGroupCode() {
        return scoreGroupCode;
    }

    public void setScoreGroupCode(String scoreGroupCode) {
        this.scoreGroupCode = scoreGroupCode == null ? null : scoreGroupCode.trim();
    }

    public String getScoreTotal() {
        return scoreTotal;
    }

    public void setScoreTotal(String scoreTotal) {
        this.scoreTotal = scoreTotal == null ? null : scoreTotal.trim();
    }

    public String getScoreTime() {
        return scoreTime;
    }

    public void setScoreTime(String scoreTime) {
        this.scoreTime = scoreTime == null ? null : scoreTime.trim();
    }

    public Integer getScoreState() {
        return scoreState;
    }

    public void setScoreState(Integer scoreState) {
        this.scoreState = scoreState;
    }

    public String getScoreOrgcode() {
        return scoreOrgcode;
    }

    public void setScoreOrgcode(String scoreOrgcode) {
        this.scoreOrgcode = scoreOrgcode == null ? null : scoreOrgcode.trim();
    }

    public String getScoreOrgcitycode() {
        return scoreOrgcitycode;
    }

    public void setScoreOrgcitycode(String scoreOrgcitycode) {
        this.scoreOrgcitycode = scoreOrgcitycode == null ? null : scoreOrgcitycode.trim();
    }

    public String getDeleteMark() {
        return deleteMark;
    }

    public void setDeleteMark(String deleteMark) {
        this.deleteMark = deleteMark == null ? null : deleteMark.trim();
    }

    public Integer getSelectState() {
        return selectState;
    }

    public void setSelectState(Integer selectState) {
        this.selectState = selectState;
    }
}