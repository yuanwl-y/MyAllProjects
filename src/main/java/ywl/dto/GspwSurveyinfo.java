package ywl.dto;

public class GspwSurveyinfo {
    private Integer surveyinfoId;

    private Integer packprojectId;

    private String monprojectId;

    private String surveyinfoWbs;

    private String surveyinfoName;

    private String surveyinfoPosition;

    private Integer deletemark;

    private String panoramicPhoto;

    private String disclosePhoto;

    private String workticketPhoto;

    private String content;

    private Integer isImport;

    public Integer getSurveyinfoId() {
        return surveyinfoId;
    }

    public void setSurveyinfoId(Integer surveyinfoId) {
        this.surveyinfoId = surveyinfoId;
    }

    public Integer getPackprojectId() {
        return packprojectId;
    }

    public void setPackprojectId(Integer packprojectId) {
        this.packprojectId = packprojectId;
    }

    public String getMonprojectId() {
        return monprojectId;
    }

    public void setMonprojectId(String monprojectId) {
        this.monprojectId = monprojectId == null ? null : monprojectId.trim();
    }

    public String getSurveyinfoWbs() {
        return surveyinfoWbs;
    }

    public void setSurveyinfoWbs(String surveyinfoWbs) {
        this.surveyinfoWbs = surveyinfoWbs == null ? null : surveyinfoWbs.trim();
    }

    public String getSurveyinfoName() {
        return surveyinfoName;
    }

    public void setSurveyinfoName(String surveyinfoName) {
        this.surveyinfoName = surveyinfoName == null ? null : surveyinfoName.trim();
    }

    public String getSurveyinfoPosition() {
        return surveyinfoPosition;
    }

    public void setSurveyinfoPosition(String surveyinfoPosition) {
        this.surveyinfoPosition = surveyinfoPosition == null ? null : surveyinfoPosition.trim();
    }

    public Integer getDeletemark() {
        return deletemark;
    }

    public void setDeletemark(Integer deletemark) {
        this.deletemark = deletemark;
    }

    public String getPanoramicPhoto() {
        return panoramicPhoto;
    }

    public void setPanoramicPhoto(String panoramicPhoto) {
        this.panoramicPhoto = panoramicPhoto == null ? null : panoramicPhoto.trim();
    }

    public String getDisclosePhoto() {
        return disclosePhoto;
    }

    public void setDisclosePhoto(String disclosePhoto) {
        this.disclosePhoto = disclosePhoto == null ? null : disclosePhoto.trim();
    }

    public String getWorkticketPhoto() {
        return workticketPhoto;
    }

    public void setWorkticketPhoto(String workticketPhoto) {
        this.workticketPhoto = workticketPhoto == null ? null : workticketPhoto.trim();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public Integer getIsImport() {
        return isImport;
    }

    public void setIsImport(Integer isImport) {
        this.isImport = isImport;
    }
}