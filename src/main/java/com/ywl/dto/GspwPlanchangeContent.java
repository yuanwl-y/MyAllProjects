package com.ywl.dto;

import java.util.Date;

public class GspwPlanchangeContent {
    private String uuid;

    private Integer constructionplanId;

    private Integer planchangeType;

    private String planchangeContent;

    private String lastContent;

    private String reason;

    private Date createDate;

    private Integer deletemark;

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid == null ? null : uuid.trim();
    }

    public Integer getConstructionplanId() {
        return constructionplanId;
    }

    public void setConstructionplanId(Integer constructionplanId) {
        this.constructionplanId = constructionplanId;
    }

    public Integer getPlanchangeType() {
        return planchangeType;
    }

    public void setPlanchangeType(Integer planchangeType) {
        this.planchangeType = planchangeType;
    }

    public String getPlanchangeContent() {
        return planchangeContent;
    }

    public void setPlanchangeContent(String planchangeContent) {
        this.planchangeContent = planchangeContent == null ? null : planchangeContent.trim();
    }

    public String getLastContent() {
        return lastContent;
    }

    public void setLastContent(String lastContent) {
        this.lastContent = lastContent == null ? null : lastContent.trim();
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason == null ? null : reason.trim();
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Integer getDeletemark() {
        return deletemark;
    }

    public void setDeletemark(Integer deletemark) {
        this.deletemark = deletemark;
    }
}