package ywl.dto;

import java.util.Date;

public class GspwFile {
    private Integer fileId;

    private String fileName;

    private String fileUrl;

    private Date fileDate;

    private Integer deletemark;

    public Integer getFileId() {
        return fileId;
    }

    public void setFileId(Integer fileId) {
        this.fileId = fileId;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName == null ? null : fileName.trim();
    }

    public String getFileUrl() {
        return fileUrl;
    }

    public void setFileUrl(String fileUrl) {
        this.fileUrl = fileUrl == null ? null : fileUrl.trim();
    }

    public Date getFileDate() {
        return fileDate;
    }

    public void setFileDate(Date fileDate) {
        this.fileDate = fileDate;
    }

    public Integer getDeletemark() {
        return deletemark;
    }

    public void setDeletemark(Integer deletemark) {
        this.deletemark = deletemark;
    }
}