package ywl.dto;

import java.util.Date;

public class GspwMonproject {
    private String monprojectId;

    private String monprojectName;

    private String monprojectWbs;

    private String projectWbs;

    private String monprojectInvestment;

    private String monprojectContext;

    private Date monprojectDate;

    private String monprojectFlowauditUserworkcode;

    private String monprojectFlowauditUsername;

    private String monprojectReportUsername;

    private String monprojectReportUserworkcode;

    private Integer monprojectIsuse;

    private String status;

    private String taskid;

    private Integer deletemark;

    public String getMonprojectId() {
        return monprojectId;
    }

    public void setMonprojectId(String monprojectId) {
        this.monprojectId = monprojectId == null ? null : monprojectId.trim();
    }

    public String getMonprojectName() {
        return monprojectName;
    }

    public void setMonprojectName(String monprojectName) {
        this.monprojectName = monprojectName == null ? null : monprojectName.trim();
    }

    public String getMonprojectWbs() {
        return monprojectWbs;
    }

    public void setMonprojectWbs(String monprojectWbs) {
        this.monprojectWbs = monprojectWbs == null ? null : monprojectWbs.trim();
    }

    public String getProjectWbs() {
        return projectWbs;
    }

    public void setProjectWbs(String projectWbs) {
        this.projectWbs = projectWbs == null ? null : projectWbs.trim();
    }

    public String getMonprojectInvestment() {
        return monprojectInvestment;
    }

    public void setMonprojectInvestment(String monprojectInvestment) {
        this.monprojectInvestment = monprojectInvestment == null ? null : monprojectInvestment.trim();
    }

    public String getMonprojectContext() {
        return monprojectContext;
    }

    public void setMonprojectContext(String monprojectContext) {
        this.monprojectContext = monprojectContext == null ? null : monprojectContext.trim();
    }

    public Date getMonprojectDate() {
        return monprojectDate;
    }

    public void setMonprojectDate(Date monprojectDate) {
        this.monprojectDate = monprojectDate;
    }

    public String getMonprojectFlowauditUserworkcode() {
        return monprojectFlowauditUserworkcode;
    }

    public void setMonprojectFlowauditUserworkcode(String monprojectFlowauditUserworkcode) {
        this.monprojectFlowauditUserworkcode = monprojectFlowauditUserworkcode == null ? null : monprojectFlowauditUserworkcode.trim();
    }

    public String getMonprojectFlowauditUsername() {
        return monprojectFlowauditUsername;
    }

    public void setMonprojectFlowauditUsername(String monprojectFlowauditUsername) {
        this.monprojectFlowauditUsername = monprojectFlowauditUsername == null ? null : monprojectFlowauditUsername.trim();
    }

    public String getMonprojectReportUsername() {
        return monprojectReportUsername;
    }

    public void setMonprojectReportUsername(String monprojectReportUsername) {
        this.monprojectReportUsername = monprojectReportUsername == null ? null : monprojectReportUsername.trim();
    }

    public String getMonprojectReportUserworkcode() {
        return monprojectReportUserworkcode;
    }

    public void setMonprojectReportUserworkcode(String monprojectReportUserworkcode) {
        this.monprojectReportUserworkcode = monprojectReportUserworkcode == null ? null : monprojectReportUserworkcode.trim();
    }

    public Integer getMonprojectIsuse() {
        return monprojectIsuse;
    }

    public void setMonprojectIsuse(Integer monprojectIsuse) {
        this.monprojectIsuse = monprojectIsuse;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
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