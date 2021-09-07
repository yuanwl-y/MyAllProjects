package com.ywl.dto;

import java.util.Date;

public class GspwPackproject {
    private Integer packprojectId;

    private String packprojectName;

    private String packprojectWbs;

    private String packprojectNumber;

    private Integer integratedprojectId;

    private String packprojectOrg;

    private String packprojectOrgcode;

    private Integer deletemark;

    private Date time;

    public Integer getPackprojectId() {
        return packprojectId;
    }

    public void setPackprojectId(Integer packprojectId) {
        this.packprojectId = packprojectId;
    }

    public String getPackprojectName() {
        return packprojectName;
    }

    public void setPackprojectName(String packprojectName) {
        this.packprojectName = packprojectName == null ? null : packprojectName.trim();
    }

    public String getPackprojectWbs() {
        return packprojectWbs;
    }

    public void setPackprojectWbs(String packprojectWbs) {
        this.packprojectWbs = packprojectWbs == null ? null : packprojectWbs.trim();
    }

    public String getPackprojectNumber() {
        return packprojectNumber;
    }

    public void setPackprojectNumber(String packprojectNumber) {
        this.packprojectNumber = packprojectNumber == null ? null : packprojectNumber.trim();
    }

    public Integer getIntegratedprojectId() {
        return integratedprojectId;
    }

    public void setIntegratedprojectId(Integer integratedprojectId) {
        this.integratedprojectId = integratedprojectId;
    }

    public String getPackprojectOrg() {
        return packprojectOrg;
    }

    public void setPackprojectOrg(String packprojectOrg) {
        this.packprojectOrg = packprojectOrg == null ? null : packprojectOrg.trim();
    }

    public String getPackprojectOrgcode() {
        return packprojectOrgcode;
    }

    public void setPackprojectOrgcode(String packprojectOrgcode) {
        this.packprojectOrgcode = packprojectOrgcode == null ? null : packprojectOrgcode.trim();
    }

    public Integer getDeletemark() {
        return deletemark;
    }

    public void setDeletemark(Integer deletemark) {
        this.deletemark = deletemark;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }
}