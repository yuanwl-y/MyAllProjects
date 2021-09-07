package com.ywl.dto;

import java.util.Date;

public class GspwConstructionplan {
    private Integer constructionplanId;

    private Integer surveyinfoId;

    private String constructionplanContent;

    private Date constructionplanStarttime;

    private Date constructionplanEndtime;

    private String archivesName;

    private Integer archivesId;

    private String constructionplanAddr;

    private Integer constructionplanNumber;

    private String taskid;

    private String constructionplanState;

    private Integer constructionplanKind;

    private Date flowauditStartdate;

    private Integer deletemark;

    private Integer superVisor;

    private String supervisorName;

    private String peopleIds;

    private Date updateTime;

    private Integer updateState;

    private String safetyofficerName;

    private String technicianName;

    private Integer safetyOfficer;

    private Date createDate;

    private Integer technician;

    private String supervisorOrgcode;

    private String supervisorOrgname;

    public Integer getConstructionplanId() {
        return constructionplanId;
    }

    public void setConstructionplanId(Integer constructionplanId) {
        this.constructionplanId = constructionplanId;
    }

    public Integer getSurveyinfoId() {
        return surveyinfoId;
    }

    public void setSurveyinfoId(Integer surveyinfoId) {
        this.surveyinfoId = surveyinfoId;
    }

    public String getConstructionplanContent() {
        return constructionplanContent;
    }

    public void setConstructionplanContent(String constructionplanContent) {
        this.constructionplanContent = constructionplanContent == null ? null : constructionplanContent.trim();
    }

    public Date getConstructionplanStarttime() {
        return constructionplanStarttime;
    }

    public void setConstructionplanStarttime(Date constructionplanStarttime) {
        this.constructionplanStarttime = constructionplanStarttime;
    }

    public Date getConstructionplanEndtime() {
        return constructionplanEndtime;
    }

    public void setConstructionplanEndtime(Date constructionplanEndtime) {
        this.constructionplanEndtime = constructionplanEndtime;
    }

    public String getArchivesName() {
        return archivesName;
    }

    public void setArchivesName(String archivesName) {
        this.archivesName = archivesName == null ? null : archivesName.trim();
    }

    public Integer getArchivesId() {
        return archivesId;
    }

    public void setArchivesId(Integer archivesId) {
        this.archivesId = archivesId;
    }

    public String getConstructionplanAddr() {
        return constructionplanAddr;
    }

    public void setConstructionplanAddr(String constructionplanAddr) {
        this.constructionplanAddr = constructionplanAddr == null ? null : constructionplanAddr.trim();
    }

    public Integer getConstructionplanNumber() {
        return constructionplanNumber;
    }

    public void setConstructionplanNumber(Integer constructionplanNumber) {
        this.constructionplanNumber = constructionplanNumber;
    }

    public String getTaskid() {
        return taskid;
    }

    public void setTaskid(String taskid) {
        this.taskid = taskid == null ? null : taskid.trim();
    }

    public String getConstructionplanState() {
        return constructionplanState;
    }

    public void setConstructionplanState(String constructionplanState) {
        this.constructionplanState = constructionplanState == null ? null : constructionplanState.trim();
    }

    public Integer getConstructionplanKind() {
        return constructionplanKind;
    }

    public void setConstructionplanKind(Integer constructionplanKind) {
        this.constructionplanKind = constructionplanKind;
    }

    public Date getFlowauditStartdate() {
        return flowauditStartdate;
    }

    public void setFlowauditStartdate(Date flowauditStartdate) {
        this.flowauditStartdate = flowauditStartdate;
    }

    public Integer getDeletemark() {
        return deletemark;
    }

    public void setDeletemark(Integer deletemark) {
        this.deletemark = deletemark;
    }

    public Integer getSuperVisor() {
        return superVisor;
    }

    public void setSuperVisor(Integer superVisor) {
        this.superVisor = superVisor;
    }

    public String getSupervisorName() {
        return supervisorName;
    }

    public void setSupervisorName(String supervisorName) {
        this.supervisorName = supervisorName == null ? null : supervisorName.trim();
    }

    public String getPeopleIds() {
        return peopleIds;
    }

    public void setPeopleIds(String peopleIds) {
        this.peopleIds = peopleIds == null ? null : peopleIds.trim();
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Integer getUpdateState() {
        return updateState;
    }

    public void setUpdateState(Integer updateState) {
        this.updateState = updateState;
    }

    public String getSafetyofficerName() {
        return safetyofficerName;
    }

    public void setSafetyofficerName(String safetyofficerName) {
        this.safetyofficerName = safetyofficerName == null ? null : safetyofficerName.trim();
    }

    public String getTechnicianName() {
        return technicianName;
    }

    public void setTechnicianName(String technicianName) {
        this.technicianName = technicianName == null ? null : technicianName.trim();
    }

    public Integer getSafetyOfficer() {
        return safetyOfficer;
    }

    public void setSafetyOfficer(Integer safetyOfficer) {
        this.safetyOfficer = safetyOfficer;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Integer getTechnician() {
        return technician;
    }

    public void setTechnician(Integer technician) {
        this.technician = technician;
    }

    public String getSupervisorOrgcode() {
        return supervisorOrgcode;
    }

    public void setSupervisorOrgcode(String supervisorOrgcode) {
        this.supervisorOrgcode = supervisorOrgcode == null ? null : supervisorOrgcode.trim();
    }

    public String getSupervisorOrgname() {
        return supervisorOrgname;
    }

    public void setSupervisorOrgname(String supervisorOrgname) {
        this.supervisorOrgname = supervisorOrgname == null ? null : supervisorOrgname.trim();
    }
}