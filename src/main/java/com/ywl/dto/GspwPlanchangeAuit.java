package com.ywl.dto;

public class GspwPlanchangeAuit {
    private Integer planchangeauidId;

    private String contentId;

    private String taskid;

    private String auditUsername;

    private String auditWorknum;

    private String auditResult;

    private String auditContext;

    private Integer status;

    private String auditManagername;

    private String auditManagerworknum;

    private String auditManagerResult;

    private String auditManagerContext;

    private String reportTime;

    private String auditTime;

    private String managerAuditTime;

    public Integer getPlanchangeauidId() {
        return planchangeauidId;
    }

    public void setPlanchangeauidId(Integer planchangeauidId) {
        this.planchangeauidId = planchangeauidId;
    }

    public String getContentId() {
        return contentId;
    }

    public void setContentId(String contentId) {
        this.contentId = contentId == null ? null : contentId.trim();
    }

    public String getTaskid() {
        return taskid;
    }

    public void setTaskid(String taskid) {
        this.taskid = taskid == null ? null : taskid.trim();
    }

    public String getAuditUsername() {
        return auditUsername;
    }

    public void setAuditUsername(String auditUsername) {
        this.auditUsername = auditUsername == null ? null : auditUsername.trim();
    }

    public String getAuditWorknum() {
        return auditWorknum;
    }

    public void setAuditWorknum(String auditWorknum) {
        this.auditWorknum = auditWorknum == null ? null : auditWorknum.trim();
    }

    public String getAuditResult() {
        return auditResult;
    }

    public void setAuditResult(String auditResult) {
        this.auditResult = auditResult == null ? null : auditResult.trim();
    }

    public String getAuditContext() {
        return auditContext;
    }

    public void setAuditContext(String auditContext) {
        this.auditContext = auditContext == null ? null : auditContext.trim();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getAuditManagername() {
        return auditManagername;
    }

    public void setAuditManagername(String auditManagername) {
        this.auditManagername = auditManagername == null ? null : auditManagername.trim();
    }

    public String getAuditManagerworknum() {
        return auditManagerworknum;
    }

    public void setAuditManagerworknum(String auditManagerworknum) {
        this.auditManagerworknum = auditManagerworknum == null ? null : auditManagerworknum.trim();
    }

    public String getAuditManagerResult() {
        return auditManagerResult;
    }

    public void setAuditManagerResult(String auditManagerResult) {
        this.auditManagerResult = auditManagerResult == null ? null : auditManagerResult.trim();
    }

    public String getAuditManagerContext() {
        return auditManagerContext;
    }

    public void setAuditManagerContext(String auditManagerContext) {
        this.auditManagerContext = auditManagerContext == null ? null : auditManagerContext.trim();
    }

    public String getReportTime() {
        return reportTime;
    }

    public void setReportTime(String reportTime) {
        this.reportTime = reportTime == null ? null : reportTime.trim();
    }

    public String getAuditTime() {
        return auditTime;
    }

    public void setAuditTime(String auditTime) {
        this.auditTime = auditTime == null ? null : auditTime.trim();
    }

    public String getManagerAuditTime() {
        return managerAuditTime;
    }

    public void setManagerAuditTime(String managerAuditTime) {
        this.managerAuditTime = managerAuditTime == null ? null : managerAuditTime.trim();
    }
}