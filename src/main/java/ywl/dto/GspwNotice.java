package ywl.dto;

public class GspwNotice {
    private Integer id;

    private String filePath;

    private Integer isCase;

    private String userOrg;

    private String userOrgCode;

    private String userWorkcode;

    private String userName;

    private String fileName;

    private Integer deletemark;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath == null ? null : filePath.trim();
    }

    public Integer getIsCase() {
        return isCase;
    }

    public void setIsCase(Integer isCase) {
        this.isCase = isCase;
    }

    public String getUserOrg() {
        return userOrg;
    }

    public void setUserOrg(String userOrg) {
        this.userOrg = userOrg == null ? null : userOrg.trim();
    }

    public String getUserOrgCode() {
        return userOrgCode;
    }

    public void setUserOrgCode(String userOrgCode) {
        this.userOrgCode = userOrgCode == null ? null : userOrgCode.trim();
    }

    public String getUserWorkcode() {
        return userWorkcode;
    }

    public void setUserWorkcode(String userWorkcode) {
        this.userWorkcode = userWorkcode == null ? null : userWorkcode.trim();
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName == null ? null : fileName.trim();
    }

    public Integer getDeletemark() {
        return deletemark;
    }

    public void setDeletemark(Integer deletemark) {
        this.deletemark = deletemark;
    }
}