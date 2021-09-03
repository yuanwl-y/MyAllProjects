package ywl.dto;

public class GspwCancelplan {
    private Integer cancelplanid;

    private String starttime;

    private String endtime;

    private Integer cancelId;

    private String cancelName;

    private String canceltime;

    private String cancelresult;

    private Integer constructionplanId;

    private Integer deletemark;

    private String days;

    private String taskid;

    private Integer status;

    private String auditusername;

    private String auditworkcode;

    private String auditresult;

    private String auditcontext;

    public Integer getCancelplanid() {
        return cancelplanid;
    }

    public void setCancelplanid(Integer cancelplanid) {
        this.cancelplanid = cancelplanid;
    }

    public String getStarttime() {
        return starttime;
    }

    public void setStarttime(String starttime) {
        this.starttime = starttime == null ? null : starttime.trim();
    }

    public String getEndtime() {
        return endtime;
    }

    public void setEndtime(String endtime) {
        this.endtime = endtime == null ? null : endtime.trim();
    }

    public Integer getCancelId() {
        return cancelId;
    }

    public void setCancelId(Integer cancelId) {
        this.cancelId = cancelId;
    }

    public String getCancelName() {
        return cancelName;
    }

    public void setCancelName(String cancelName) {
        this.cancelName = cancelName == null ? null : cancelName.trim();
    }

    public String getCanceltime() {
        return canceltime;
    }

    public void setCanceltime(String canceltime) {
        this.canceltime = canceltime == null ? null : canceltime.trim();
    }

    public String getCancelresult() {
        return cancelresult;
    }

    public void setCancelresult(String cancelresult) {
        this.cancelresult = cancelresult == null ? null : cancelresult.trim();
    }

    public Integer getConstructionplanId() {
        return constructionplanId;
    }

    public void setConstructionplanId(Integer constructionplanId) {
        this.constructionplanId = constructionplanId;
    }

    public Integer getDeletemark() {
        return deletemark;
    }

    public void setDeletemark(Integer deletemark) {
        this.deletemark = deletemark;
    }

    public String getDays() {
        return days;
    }

    public void setDays(String days) {
        this.days = days == null ? null : days.trim();
    }

    public String getTaskid() {
        return taskid;
    }

    public void setTaskid(String taskid) {
        this.taskid = taskid == null ? null : taskid.trim();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getAuditusername() {
        return auditusername;
    }

    public void setAuditusername(String auditusername) {
        this.auditusername = auditusername == null ? null : auditusername.trim();
    }

    public String getAuditworkcode() {
        return auditworkcode;
    }

    public void setAuditworkcode(String auditworkcode) {
        this.auditworkcode = auditworkcode == null ? null : auditworkcode.trim();
    }

    public String getAuditresult() {
        return auditresult;
    }

    public void setAuditresult(String auditresult) {
        this.auditresult = auditresult == null ? null : auditresult.trim();
    }

    public String getAuditcontext() {
        return auditcontext;
    }

    public void setAuditcontext(String auditcontext) {
        this.auditcontext = auditcontext == null ? null : auditcontext.trim();
    }
}