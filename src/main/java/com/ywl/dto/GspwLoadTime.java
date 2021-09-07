package com.ywl.dto;

public class GspwLoadTime {
    private Integer timeId;

    private String timeDetails;

    private String timeOrgCode;

    private Integer timeScoreId;

    public Integer getTimeId() {
        return timeId;
    }

    public void setTimeId(Integer timeId) {
        this.timeId = timeId;
    }

    public String getTimeDetails() {
        return timeDetails;
    }

    public void setTimeDetails(String timeDetails) {
        this.timeDetails = timeDetails == null ? null : timeDetails.trim();
    }

    public String getTimeOrgCode() {
        return timeOrgCode;
    }

    public void setTimeOrgCode(String timeOrgCode) {
        this.timeOrgCode = timeOrgCode == null ? null : timeOrgCode.trim();
    }

    public Integer getTimeScoreId() {
        return timeScoreId;
    }

    public void setTimeScoreId(Integer timeScoreId) {
        this.timeScoreId = timeScoreId;
    }
}