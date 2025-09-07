package com.ywl.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * 
 * @TableName gspw_archives_record
 */
@TableName(value ="gspw_archives_record")
@Data
public class GspwArchivesRecord {
    /**
     * 
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 身份证
     */
    @TableField(value = "id_card")
    private String idCard;

    /**
     * 修改时间
     */
    @TableField(value = "update_time")
    private String updateTime;

    /**
     * 修改人id
     */
    @TableField(value = "update_person_id")
    private Integer updatePersonId;

    /**
     * 修改人名字
     */
    @TableField(value = "update_person_name")
    private String updatePersonName;

    /**
     * 以前所在公司名字
     */
    @TableField(value = "oldcompany_name")
    private String oldcompanyName;

    /**
     * 以前所在公司编码
     */
    @TableField(value = "oldcompany_code")
    private String oldcompanyCode;

    /**
     * 现在所在公司名称
     */
    @TableField(value = "nowcompany_name")
    private String nowcompanyName;

    /**
     * 现在所在公司编码
     */
    @TableField(value = "nowcompany_code")
    private String nowcompanyCode;

    /**
     * 以前分包单位名称
     */
    @TableField(value = "oldoutcompany_name")
    private String oldoutcompanyName;

    /**
     * 以前分包单位编码
     */
    @TableField(value = "oldoutcompany_code")
    private String oldoutcompanyCode;

    /**
     * 现在分包单位名称
     */
    @TableField(value = "nowoutcompany_name")
    private String nowoutcompanyName;

    /**
     * 现在分包单位编码
     */
    @TableField(value = "nowoutcompany_code")
    private String nowoutcompanyCode;

    /**
     * 被修改人主键
     */
    @TableField(value = "archives_id")
    private Integer archivesId;

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        GspwArchivesRecord other = (GspwArchivesRecord) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getIdCard() == null ? other.getIdCard() == null : this.getIdCard().equals(other.getIdCard()))
            && (this.getUpdateTime() == null ? other.getUpdateTime() == null : this.getUpdateTime().equals(other.getUpdateTime()))
            && (this.getUpdatePersonId() == null ? other.getUpdatePersonId() == null : this.getUpdatePersonId().equals(other.getUpdatePersonId()))
            && (this.getUpdatePersonName() == null ? other.getUpdatePersonName() == null : this.getUpdatePersonName().equals(other.getUpdatePersonName()))
            && (this.getOldcompanyName() == null ? other.getOldcompanyName() == null : this.getOldcompanyName().equals(other.getOldcompanyName()))
            && (this.getOldcompanyCode() == null ? other.getOldcompanyCode() == null : this.getOldcompanyCode().equals(other.getOldcompanyCode()))
            && (this.getNowcompanyName() == null ? other.getNowcompanyName() == null : this.getNowcompanyName().equals(other.getNowcompanyName()))
            && (this.getNowcompanyCode() == null ? other.getNowcompanyCode() == null : this.getNowcompanyCode().equals(other.getNowcompanyCode()))
            && (this.getOldoutcompanyName() == null ? other.getOldoutcompanyName() == null : this.getOldoutcompanyName().equals(other.getOldoutcompanyName()))
            && (this.getOldoutcompanyCode() == null ? other.getOldoutcompanyCode() == null : this.getOldoutcompanyCode().equals(other.getOldoutcompanyCode()))
            && (this.getNowoutcompanyName() == null ? other.getNowoutcompanyName() == null : this.getNowoutcompanyName().equals(other.getNowoutcompanyName()))
            && (this.getNowoutcompanyCode() == null ? other.getNowoutcompanyCode() == null : this.getNowoutcompanyCode().equals(other.getNowoutcompanyCode()))
            && (this.getArchivesId() == null ? other.getArchivesId() == null : this.getArchivesId().equals(other.getArchivesId()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getIdCard() == null) ? 0 : getIdCard().hashCode());
        result = prime * result + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        result = prime * result + ((getUpdatePersonId() == null) ? 0 : getUpdatePersonId().hashCode());
        result = prime * result + ((getUpdatePersonName() == null) ? 0 : getUpdatePersonName().hashCode());
        result = prime * result + ((getOldcompanyName() == null) ? 0 : getOldcompanyName().hashCode());
        result = prime * result + ((getOldcompanyCode() == null) ? 0 : getOldcompanyCode().hashCode());
        result = prime * result + ((getNowcompanyName() == null) ? 0 : getNowcompanyName().hashCode());
        result = prime * result + ((getNowcompanyCode() == null) ? 0 : getNowcompanyCode().hashCode());
        result = prime * result + ((getOldoutcompanyName() == null) ? 0 : getOldoutcompanyName().hashCode());
        result = prime * result + ((getOldoutcompanyCode() == null) ? 0 : getOldoutcompanyCode().hashCode());
        result = prime * result + ((getNowoutcompanyName() == null) ? 0 : getNowoutcompanyName().hashCode());
        result = prime * result + ((getNowoutcompanyCode() == null) ? 0 : getNowoutcompanyCode().hashCode());
        result = prime * result + ((getArchivesId() == null) ? 0 : getArchivesId().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", idCard=").append(idCard);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", updatePersonId=").append(updatePersonId);
        sb.append(", updatePersonName=").append(updatePersonName);
        sb.append(", oldcompanyName=").append(oldcompanyName);
        sb.append(", oldcompanyCode=").append(oldcompanyCode);
        sb.append(", nowcompanyName=").append(nowcompanyName);
        sb.append(", nowcompanyCode=").append(nowcompanyCode);
        sb.append(", oldoutcompanyName=").append(oldoutcompanyName);
        sb.append(", oldoutcompanyCode=").append(oldoutcompanyCode);
        sb.append(", nowoutcompanyName=").append(nowoutcompanyName);
        sb.append(", nowoutcompanyCode=").append(nowoutcompanyCode);
        sb.append(", archivesId=").append(archivesId);
        sb.append("]");
        return sb.toString();
    }
}