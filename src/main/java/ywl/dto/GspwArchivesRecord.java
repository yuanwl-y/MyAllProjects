package ywl.dto;

public class GspwArchivesRecord {
    private Integer id;

    private String idCard;

    private String updateTime;

    private Integer updatePersonId;

    private String updatePersonName;

    private String oldcompanyName;

    private String oldcompanyCode;

    private String nowcompanyName;

    private String nowcompanyCode;

    private String oldoutcompanyName;

    private String oldoutcompanyCode;

    private String nowoutcompanyName;

    private String nowoutcompanyCode;

    private Integer archivesId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard == null ? null : idCard.trim();
    }

    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime == null ? null : updateTime.trim();
    }

    public Integer getUpdatePersonId() {
        return updatePersonId;
    }

    public void setUpdatePersonId(Integer updatePersonId) {
        this.updatePersonId = updatePersonId;
    }

    public String getUpdatePersonName() {
        return updatePersonName;
    }

    public void setUpdatePersonName(String updatePersonName) {
        this.updatePersonName = updatePersonName == null ? null : updatePersonName.trim();
    }

    public String getOldcompanyName() {
        return oldcompanyName;
    }

    public void setOldcompanyName(String oldcompanyName) {
        this.oldcompanyName = oldcompanyName == null ? null : oldcompanyName.trim();
    }

    public String getOldcompanyCode() {
        return oldcompanyCode;
    }

    public void setOldcompanyCode(String oldcompanyCode) {
        this.oldcompanyCode = oldcompanyCode == null ? null : oldcompanyCode.trim();
    }

    public String getNowcompanyName() {
        return nowcompanyName;
    }

    public void setNowcompanyName(String nowcompanyName) {
        this.nowcompanyName = nowcompanyName == null ? null : nowcompanyName.trim();
    }

    public String getNowcompanyCode() {
        return nowcompanyCode;
    }

    public void setNowcompanyCode(String nowcompanyCode) {
        this.nowcompanyCode = nowcompanyCode == null ? null : nowcompanyCode.trim();
    }

    public String getOldoutcompanyName() {
        return oldoutcompanyName;
    }

    public void setOldoutcompanyName(String oldoutcompanyName) {
        this.oldoutcompanyName = oldoutcompanyName == null ? null : oldoutcompanyName.trim();
    }

    public String getOldoutcompanyCode() {
        return oldoutcompanyCode;
    }

    public void setOldoutcompanyCode(String oldoutcompanyCode) {
        this.oldoutcompanyCode = oldoutcompanyCode == null ? null : oldoutcompanyCode.trim();
    }

    public String getNowoutcompanyName() {
        return nowoutcompanyName;
    }

    public void setNowoutcompanyName(String nowoutcompanyName) {
        this.nowoutcompanyName = nowoutcompanyName == null ? null : nowoutcompanyName.trim();
    }

    public String getNowoutcompanyCode() {
        return nowoutcompanyCode;
    }

    public void setNowoutcompanyCode(String nowoutcompanyCode) {
        this.nowoutcompanyCode = nowoutcompanyCode == null ? null : nowoutcompanyCode.trim();
    }

    public Integer getArchivesId() {
        return archivesId;
    }

    public void setArchivesId(Integer archivesId) {
        this.archivesId = archivesId;
    }
}