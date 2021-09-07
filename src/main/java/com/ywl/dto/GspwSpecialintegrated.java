package com.ywl.dto;

public class GspwSpecialintegrated {
    private String specialId;

    private String specialName;

    private String specialYear;

    private Integer specialStick;

    private String integratedId;

    private String specialRemark;

    private Integer deletemark;

    public String getSpecialId() {
        return specialId;
    }

    public void setSpecialId(String specialId) {
        this.specialId = specialId == null ? null : specialId.trim();
    }

    public String getSpecialName() {
        return specialName;
    }

    public void setSpecialName(String specialName) {
        this.specialName = specialName == null ? null : specialName.trim();
    }

    public String getSpecialYear() {
        return specialYear;
    }

    public void setSpecialYear(String specialYear) {
        this.specialYear = specialYear == null ? null : specialYear.trim();
    }

    public Integer getSpecialStick() {
        return specialStick;
    }

    public void setSpecialStick(Integer specialStick) {
        this.specialStick = specialStick;
    }

    public String getIntegratedId() {
        return integratedId;
    }

    public void setIntegratedId(String integratedId) {
        this.integratedId = integratedId == null ? null : integratedId.trim();
    }

    public String getSpecialRemark() {
        return specialRemark;
    }

    public void setSpecialRemark(String specialRemark) {
        this.specialRemark = specialRemark == null ? null : specialRemark.trim();
    }

    public Integer getDeletemark() {
        return deletemark;
    }

    public void setDeletemark(Integer deletemark) {
        this.deletemark = deletemark;
    }
}