package com.ywl.dto;

public class GspwBlacklist {
    private String workcode;

    private String jointime;

    private String accessname;

    private String accessworkcode;

    private String reason;

    private Integer deletemark;

    private Integer blackType;

    public String getWorkcode() {
        return workcode;
    }

    public void setWorkcode(String workcode) {
        this.workcode = workcode == null ? null : workcode.trim();
    }

    public String getJointime() {
        return jointime;
    }

    public void setJointime(String jointime) {
        this.jointime = jointime == null ? null : jointime.trim();
    }

    public String getAccessname() {
        return accessname;
    }

    public void setAccessname(String accessname) {
        this.accessname = accessname == null ? null : accessname.trim();
    }

    public String getAccessworkcode() {
        return accessworkcode;
    }

    public void setAccessworkcode(String accessworkcode) {
        this.accessworkcode = accessworkcode == null ? null : accessworkcode.trim();
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason == null ? null : reason.trim();
    }

    public Integer getDeletemark() {
        return deletemark;
    }

    public void setDeletemark(Integer deletemark) {
        this.deletemark = deletemark;
    }

    public Integer getBlackType() {
        return blackType;
    }

    public void setBlackType(Integer blackType) {
        this.blackType = blackType;
    }
}