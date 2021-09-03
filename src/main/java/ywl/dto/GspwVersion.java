package ywl.dto;

public class GspwVersion {
    private Integer versionId;

    private String versionNo;

    private String versionName;

    private Integer versionForce;

    private String versionContext;

    private String versionUrl;

    public Integer getVersionId() {
        return versionId;
    }

    public void setVersionId(Integer versionId) {
        this.versionId = versionId;
    }

    public String getVersionNo() {
        return versionNo;
    }

    public void setVersionNo(String versionNo) {
        this.versionNo = versionNo == null ? null : versionNo.trim();
    }

    public String getVersionName() {
        return versionName;
    }

    public void setVersionName(String versionName) {
        this.versionName = versionName == null ? null : versionName.trim();
    }

    public Integer getVersionForce() {
        return versionForce;
    }

    public void setVersionForce(Integer versionForce) {
        this.versionForce = versionForce;
    }

    public String getVersionContext() {
        return versionContext;
    }

    public void setVersionContext(String versionContext) {
        this.versionContext = versionContext == null ? null : versionContext.trim();
    }

    public String getVersionUrl() {
        return versionUrl;
    }

    public void setVersionUrl(String versionUrl) {
        this.versionUrl = versionUrl == null ? null : versionUrl.trim();
    }
}