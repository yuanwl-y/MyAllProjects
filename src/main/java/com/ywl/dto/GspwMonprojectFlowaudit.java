package com.ywl.dto;

import java.util.Date;

public class GspwMonprojectFlowaudit {
    private String monprojectFlowauditId;

    private String monprojectId;

    private String userName;

    private String userDeptcode;

    private String userDept;

    private String userWorkcode;

    private String userOrgcode;

    private String userOrg;

    private Date monprojectFlowauditDate;

    private String monprojectFlowauditContext;

    private String monprojectFlowauditResult;

    private String taskid;

    private Integer deletemark;

    public String getMonprojectFlowauditId() {
        return monprojectFlowauditId;
    }

    public void setMonprojectFlowauditId(String monprojectFlowauditId) {
        this.monprojectFlowauditId = monprojectFlowauditId == null ? null : monprojectFlowauditId.trim();
    }

    public String getMonprojectId() {
        return monprojectId;
    }

    public void setMonprojectId(String monprojectId) {
        this.monprojectId = monprojectId == null ? null : monprojectId.trim();
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

    public Date getMonprojectFlowauditDate() {
        return monprojectFlowauditDate;
    }

    public void setMonprojectFlowauditDate(Date monprojectFlowauditDate) {
        this.monprojectFlowauditDate = monprojectFlowauditDate;
    }

    public String getMonprojectFlowauditContext() {
        return monprojectFlowauditContext;
    }

    public void setMonprojectFlowauditContext(String monprojectFlowauditContext) {
        this.monprojectFlowauditContext = monprojectFlowauditContext == null ? null : monprojectFlowauditContext.trim();
    }

    public String getMonprojectFlowauditResult() {
        return monprojectFlowauditResult;
    }

    public void setMonprojectFlowauditResult(String monprojectFlowauditResult) {
        this.monprojectFlowauditResult = monprojectFlowauditResult == null ? null : monprojectFlowauditResult.trim();
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