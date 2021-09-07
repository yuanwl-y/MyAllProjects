package com.ywl.dto;

public class GspwLoadDevice {
    private Integer deviceId;

    private Integer deviceScoreId;

    private Integer deviceTypeId;

    private String deviceName;

    private String devicePurpose;

    private String deviceNo;

    private String deviceFinalNo;

    private String deviceContext;

    private String deviceUrl;

    private String deviceGrade;

    private Integer deleteMark;

    public Integer getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(Integer deviceId) {
        this.deviceId = deviceId;
    }

    public Integer getDeviceScoreId() {
        return deviceScoreId;
    }

    public void setDeviceScoreId(Integer deviceScoreId) {
        this.deviceScoreId = deviceScoreId;
    }

    public Integer getDeviceTypeId() {
        return deviceTypeId;
    }

    public void setDeviceTypeId(Integer deviceTypeId) {
        this.deviceTypeId = deviceTypeId;
    }

    public String getDeviceName() {
        return deviceName;
    }

    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName == null ? null : deviceName.trim();
    }

    public String getDevicePurpose() {
        return devicePurpose;
    }

    public void setDevicePurpose(String devicePurpose) {
        this.devicePurpose = devicePurpose == null ? null : devicePurpose.trim();
    }

    public String getDeviceNo() {
        return deviceNo;
    }

    public void setDeviceNo(String deviceNo) {
        this.deviceNo = deviceNo == null ? null : deviceNo.trim();
    }

    public String getDeviceFinalNo() {
        return deviceFinalNo;
    }

    public void setDeviceFinalNo(String deviceFinalNo) {
        this.deviceFinalNo = deviceFinalNo == null ? null : deviceFinalNo.trim();
    }

    public String getDeviceContext() {
        return deviceContext;
    }

    public void setDeviceContext(String deviceContext) {
        this.deviceContext = deviceContext == null ? null : deviceContext.trim();
    }

    public String getDeviceUrl() {
        return deviceUrl;
    }

    public void setDeviceUrl(String deviceUrl) {
        this.deviceUrl = deviceUrl == null ? null : deviceUrl.trim();
    }

    public String getDeviceGrade() {
        return deviceGrade;
    }

    public void setDeviceGrade(String deviceGrade) {
        this.deviceGrade = deviceGrade == null ? null : deviceGrade.trim();
    }

    public Integer getDeleteMark() {
        return deleteMark;
    }

    public void setDeleteMark(Integer deleteMark) {
        this.deleteMark = deleteMark;
    }
}