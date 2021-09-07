package com.ywl.dto;

import java.util.Date;

public class GspwLog {
    private Integer logId;

    private Integer logOperationid;

    private String logTablename;

    private String logOperation;

    private String logContext;

    private String archivesId;

    private Date logDate;

    private Integer deletemark;

    public Integer getLogId() {
        return logId;
    }

    public void setLogId(Integer logId) {
        this.logId = logId;
    }

    public Integer getLogOperationid() {
        return logOperationid;
    }

    public void setLogOperationid(Integer logOperationid) {
        this.logOperationid = logOperationid;
    }

    public String getLogTablename() {
        return logTablename;
    }

    public void setLogTablename(String logTablename) {
        this.logTablename = logTablename == null ? null : logTablename.trim();
    }

    public String getLogOperation() {
        return logOperation;
    }

    public void setLogOperation(String logOperation) {
        this.logOperation = logOperation == null ? null : logOperation.trim();
    }

    public String getLogContext() {
        return logContext;
    }

    public void setLogContext(String logContext) {
        this.logContext = logContext == null ? null : logContext.trim();
    }

    public String getArchivesId() {
        return archivesId;
    }

    public void setArchivesId(String archivesId) {
        this.archivesId = archivesId == null ? null : archivesId.trim();
    }

    public Date getLogDate() {
        return logDate;
    }

    public void setLogDate(Date logDate) {
        this.logDate = logDate;
    }

    public Integer getDeletemark() {
        return deletemark;
    }

    public void setDeletemark(Integer deletemark) {
        this.deletemark = deletemark;
    }
}