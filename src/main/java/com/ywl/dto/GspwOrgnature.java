package com.ywl.dto;

public class GspwOrgnature {
    private Integer natureId;

    private String natureOrgname;

    private String natureName;

    private String natureAbbreviation;

    private String natureCode;

    public Integer getNatureId() {
        return natureId;
    }

    public void setNatureId(Integer natureId) {
        this.natureId = natureId;
    }

    public String getNatureOrgname() {
        return natureOrgname;
    }

    public void setNatureOrgname(String natureOrgname) {
        this.natureOrgname = natureOrgname == null ? null : natureOrgname.trim();
    }

    public String getNatureName() {
        return natureName;
    }

    public void setNatureName(String natureName) {
        this.natureName = natureName == null ? null : natureName.trim();
    }

    public String getNatureAbbreviation() {
        return natureAbbreviation;
    }

    public void setNatureAbbreviation(String natureAbbreviation) {
        this.natureAbbreviation = natureAbbreviation == null ? null : natureAbbreviation.trim();
    }

    public String getNatureCode() {
        return natureCode;
    }

    public void setNatureCode(String natureCode) {
        this.natureCode = natureCode == null ? null : natureCode.trim();
    }
}