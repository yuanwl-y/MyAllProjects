package ywl.dto;

import java.util.Date;

public class GspwDispatch {
    private Integer dispatchId;

    private Integer archivesId;

    private Date startTime;

    private Date endTime;

    private Integer deletemark;

    private Integer constructionplanId;

    private String dispatchType;

    private Integer dispatchState;

    public Integer getDispatchId() {
        return dispatchId;
    }

    public void setDispatchId(Integer dispatchId) {
        this.dispatchId = dispatchId;
    }

    public Integer getArchivesId() {
        return archivesId;
    }

    public void setArchivesId(Integer archivesId) {
        this.archivesId = archivesId;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public Integer getDeletemark() {
        return deletemark;
    }

    public void setDeletemark(Integer deletemark) {
        this.deletemark = deletemark;
    }

    public Integer getConstructionplanId() {
        return constructionplanId;
    }

    public void setConstructionplanId(Integer constructionplanId) {
        this.constructionplanId = constructionplanId;
    }

    public String getDispatchType() {
        return dispatchType;
    }

    public void setDispatchType(String dispatchType) {
        this.dispatchType = dispatchType == null ? null : dispatchType.trim();
    }

    public Integer getDispatchState() {
        return dispatchState;
    }

    public void setDispatchState(Integer dispatchState) {
        this.dispatchState = dispatchState;
    }
}