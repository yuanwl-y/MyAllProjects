package com.ywl.dto;

import java.util.Date;

public class GspwConstructionplanFlowaudit {
    private Integer constructionplanFlowauditId;

    private Integer constructionplanId;

    private String userName;

    private String userDeptcode;

    private String userDept;

    private String userWorkcode;

    private String userOrgcode;

    private String userOrg;

    private Date constructionplanFlowauditDate;

    private String constructionplanFlowauditContext;

    private String constructionplanFlowauditResult;

    private String taskid;

    private Integer deletemark;

    public Integer getConstructionplanFlowauditId() {
        return constructionplanFlowauditId;
    }

    public void setConstructionplanFlowauditId(Integer constructionplanFlowauditId) {
        this.constructionplanFlowauditId = constructionplanFlowauditId;
    }

    public Integer getConstructionplanId() {
        return constructionplanId;
    }

    public void setConstructionplanId(Integer constructionplanId) {
        this.constructionplanId = constructionplanId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getUserDeptcode() {
        return userDeptcode;
    }

    public void setUserDeptcode(String userDeptcode) {
        this.userDeptcode = userDeptcode == null ? null : userDeptcode.trim();
    }

    public String getUserDept() {
        return userDept;
    }

    public void setUserDept(String userDept) {
        this.userDept = userDept == null ? null : userDept.trim();
    }

    public String getUserWorkcode() {
        return userWorkcode;
    }

    public void setUserWorkcode(String userWorkcode) {
        this.userWorkcode = userWorkcode == null ? null : userWorkcode.trim();
    }

    public String getUserOrgcode() {
        return userOrgcode;
    }

    public void setUserOrgcode(String userOrgcode) {
        this.userOrgcode = userOrgcode == null ? null : userOrgcode.trim();
    }

    public String getUserOrg() {
        return userOrg;
    }

    public void setUserOrg(String userOrg) {
        this.userOrg = userOrg == null ? null : userOrg.trim();
    }

    public Date getConstructionplanFlowauditDate() {
        return constructionplanFlowauditDate;
    }

    public void setConstructionplanFlowauditDate(Date constructionplanFlowauditDate) {
        this.constructionplanFlowauditDate = constructionplanFlowauditDate;
    }

    public String getConstructionplanFlowauditContext() {
        return constructionplanFlowauditContext;
    }

    public void setConstructionplanFlowauditContext(String constructionplanFlowauditContext) {
        this.constructionplanFlowauditContext = constructionplanFlowauditContext == null ? null : constructionplanFlowauditContext.trim();
    }

    public String getConstructionplanFlowauditResult() {
        return constructionplanFlowauditResult;
    }

    public void setConstructionplanFlowauditResult(String constructionplanFlowauditResult) {
        this.constructionplanFlowauditResult = constructionplanFlowauditResult == null ? null : constructionplanFlowauditResult.trim();
    }

    public String getTaskid() {
        return taskid;
    }

    public void setTaskid(String taskid) {
        this.taskid = taskid == null ? null : taskid.trim();
    }

    public Integer getDeletemark() {
        return deletemark;
    }

    public void setDeletemark(Integer deletemark) {
        this.deletemark = deletemark;
    }
}