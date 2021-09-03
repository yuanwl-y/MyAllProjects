package ywl.dto;

public class GspwClock {
    private Integer clockId;

    private String signTime;

    private String backTime;

    private String clockAddr;

    private Integer signClockMark;

    private Integer archivesId;

    private Integer deletemark;

    private Integer day;

    private Integer backClockMark;

    private String backAddr;

    private Integer constructionplanId;

    private String signLati;

    private String backLati;

    private String workload;

    private String path;

    private String workTicketUrl;

    private String groundProtectUrl;

    private String workMapUrl;

    public Integer getClockId() {
        return clockId;
    }

    public void setClockId(Integer clockId) {
        this.clockId = clockId;
    }

    public String getSignTime() {
        return signTime;
    }

    public void setSignTime(String signTime) {
        this.signTime = signTime == null ? null : signTime.trim();
    }

    public String getBackTime() {
        return backTime;
    }

    public void setBackTime(String backTime) {
        this.backTime = backTime == null ? null : backTime.trim();
    }

    public String getClockAddr() {
        return clockAddr;
    }

    public void setClockAddr(String clockAddr) {
        this.clockAddr = clockAddr == null ? null : clockAddr.trim();
    }

    public Integer getSignClockMark() {
        return signClockMark;
    }

    public void setSignClockMark(Integer signClockMark) {
        this.signClockMark = signClockMark;
    }

    public Integer getArchivesId() {
        return archivesId;
    }

    public void setArchivesId(Integer archivesId) {
        this.archivesId = archivesId;
    }

    public Integer getDeletemark() {
        return deletemark;
    }

    public void setDeletemark(Integer deletemark) {
        this.deletemark = deletemark;
    }

    public Integer getDay() {
        return day;
    }

    public void setDay(Integer day) {
        this.day = day;
    }

    public Integer getBackClockMark() {
        return backClockMark;
    }

    public void setBackClockMark(Integer backClockMark) {
        this.backClockMark = backClockMark;
    }

    public String getBackAddr() {
        return backAddr;
    }

    public void setBackAddr(String backAddr) {
        this.backAddr = backAddr == null ? null : backAddr.trim();
    }

    public Integer getConstructionplanId() {
        return constructionplanId;
    }

    public void setConstructionplanId(Integer constructionplanId) {
        this.constructionplanId = constructionplanId;
    }

    public String getSignLati() {
        return signLati;
    }

    public void setSignLati(String signLati) {
        this.signLati = signLati == null ? null : signLati.trim();
    }

    public String getBackLati() {
        return backLati;
    }

    public void setBackLati(String backLati) {
        this.backLati = backLati == null ? null : backLati.trim();
    }

    public String getWorkload() {
        return workload;
    }

    public void setWorkload(String workload) {
        this.workload = workload == null ? null : workload.trim();
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path == null ? null : path.trim();
    }

    public String getWorkTicketUrl() {
        return workTicketUrl;
    }

    public void setWorkTicketUrl(String workTicketUrl) {
        this.workTicketUrl = workTicketUrl == null ? null : workTicketUrl.trim();
    }

    public String getGroundProtectUrl() {
        return groundProtectUrl;
    }

    public void setGroundProtectUrl(String groundProtectUrl) {
        this.groundProtectUrl = groundProtectUrl == null ? null : groundProtectUrl.trim();
    }

    public String getWorkMapUrl() {
        return workMapUrl;
    }

    public void setWorkMapUrl(String workMapUrl) {
        this.workMapUrl = workMapUrl == null ? null : workMapUrl.trim();
    }
}