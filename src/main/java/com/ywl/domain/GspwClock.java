package com.ywl.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;

/**
 * 签到记录表
 * @TableName gspw_clock
 */
@TableName(value ="gspw_clock")
@Data
public class GspwClock implements Serializable {
    /**
     * 主键
     */
    @TableId(value = "clock_id", type = IdType.AUTO)
    private Integer clockId;

    /**
     * 签到时间
     */
    @TableField(value = "sign_time")
    private String signTime;

    /**
     * 签退时间
     */
    @TableField(value = "back_time")
    private String backTime;

    /**
     * 签到坐标
     */
    @TableField(value = "clock_addr")
    private String clockAddr;

    /**
     * 签到标记(1:正常 2:迟到)
     */
    @TableField(value = "sign_clock_mark")
    private Integer signClockMark;

    /**
     * 用户id
     */
    @TableField(value = "archives_id")
    private Integer archivesId;

    /**
     * 删除标记
     */
    @TableField(value = "deleteMark")
    private Integer deletemark;

    /**
     * 
     */
    @TableField(value = "day")
    private Integer day;

    /**
     * 签退标记
     */
    @TableField(value = "back_clock_mark")
    private Integer backClockMark;

    /**
     * 
     */
    @TableField(value = "back_addr")
    private String backAddr;

    /**
     * 
     */
    @TableField(value = "constructionPlan_id")
    private Integer constructionplanId;

    /**
     * 
     */
    @TableField(value = "sign_lati")
    private String signLati;

    /**
     * 
     */
    @TableField(value = "back_lati")
    private String backLati;

    /**
     * 
     */
    @TableField(value = "workLoad")
    private String workload;

    /**
     * 
     */
    @TableField(value = "path")
    private String path;

    /**
     * 工作票照片
     */
    @TableField(value = "work_ticket_url")
    private String workTicketUrl;

    /**
     * 接地保护照片
     */
    @TableField(value = "ground_protect_url")
    private String groundProtectUrl;

    /**
     * 施工蓝图
     */
    @TableField(value = "work_map_url")
    private String workMapUrl;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;

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
        GspwClock other = (GspwClock) that;
        return (this.getClockId() == null ? other.getClockId() == null : this.getClockId().equals(other.getClockId()))
            && (this.getSignTime() == null ? other.getSignTime() == null : this.getSignTime().equals(other.getSignTime()))
            && (this.getBackTime() == null ? other.getBackTime() == null : this.getBackTime().equals(other.getBackTime()))
            && (this.getClockAddr() == null ? other.getClockAddr() == null : this.getClockAddr().equals(other.getClockAddr()))
            && (this.getSignClockMark() == null ? other.getSignClockMark() == null : this.getSignClockMark().equals(other.getSignClockMark()))
            && (this.getArchivesId() == null ? other.getArchivesId() == null : this.getArchivesId().equals(other.getArchivesId()))
            && (this.getDeletemark() == null ? other.getDeletemark() == null : this.getDeletemark().equals(other.getDeletemark()))
            && (this.getDay() == null ? other.getDay() == null : this.getDay().equals(other.getDay()))
            && (this.getBackClockMark() == null ? other.getBackClockMark() == null : this.getBackClockMark().equals(other.getBackClockMark()))
            && (this.getBackAddr() == null ? other.getBackAddr() == null : this.getBackAddr().equals(other.getBackAddr()))
            && (this.getConstructionplanId() == null ? other.getConstructionplanId() == null : this.getConstructionplanId().equals(other.getConstructionplanId()))
            && (this.getSignLati() == null ? other.getSignLati() == null : this.getSignLati().equals(other.getSignLati()))
            && (this.getBackLati() == null ? other.getBackLati() == null : this.getBackLati().equals(other.getBackLati()))
            && (this.getWorkload() == null ? other.getWorkload() == null : this.getWorkload().equals(other.getWorkload()))
            && (this.getPath() == null ? other.getPath() == null : this.getPath().equals(other.getPath()))
            && (this.getWorkTicketUrl() == null ? other.getWorkTicketUrl() == null : this.getWorkTicketUrl().equals(other.getWorkTicketUrl()))
            && (this.getGroundProtectUrl() == null ? other.getGroundProtectUrl() == null : this.getGroundProtectUrl().equals(other.getGroundProtectUrl()))
            && (this.getWorkMapUrl() == null ? other.getWorkMapUrl() == null : this.getWorkMapUrl().equals(other.getWorkMapUrl()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getClockId() == null) ? 0 : getClockId().hashCode());
        result = prime * result + ((getSignTime() == null) ? 0 : getSignTime().hashCode());
        result = prime * result + ((getBackTime() == null) ? 0 : getBackTime().hashCode());
        result = prime * result + ((getClockAddr() == null) ? 0 : getClockAddr().hashCode());
        result = prime * result + ((getSignClockMark() == null) ? 0 : getSignClockMark().hashCode());
        result = prime * result + ((getArchivesId() == null) ? 0 : getArchivesId().hashCode());
        result = prime * result + ((getDeletemark() == null) ? 0 : getDeletemark().hashCode());
        result = prime * result + ((getDay() == null) ? 0 : getDay().hashCode());
        result = prime * result + ((getBackClockMark() == null) ? 0 : getBackClockMark().hashCode());
        result = prime * result + ((getBackAddr() == null) ? 0 : getBackAddr().hashCode());
        result = prime * result + ((getConstructionplanId() == null) ? 0 : getConstructionplanId().hashCode());
        result = prime * result + ((getSignLati() == null) ? 0 : getSignLati().hashCode());
        result = prime * result + ((getBackLati() == null) ? 0 : getBackLati().hashCode());
        result = prime * result + ((getWorkload() == null) ? 0 : getWorkload().hashCode());
        result = prime * result + ((getPath() == null) ? 0 : getPath().hashCode());
        result = prime * result + ((getWorkTicketUrl() == null) ? 0 : getWorkTicketUrl().hashCode());
        result = prime * result + ((getGroundProtectUrl() == null) ? 0 : getGroundProtectUrl().hashCode());
        result = prime * result + ((getWorkMapUrl() == null) ? 0 : getWorkMapUrl().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", clockId=").append(clockId);
        sb.append(", signTime=").append(signTime);
        sb.append(", backTime=").append(backTime);
        sb.append(", clockAddr=").append(clockAddr);
        sb.append(", signClockMark=").append(signClockMark);
        sb.append(", archivesId=").append(archivesId);
        sb.append(", deletemark=").append(deletemark);
        sb.append(", day=").append(day);
        sb.append(", backClockMark=").append(backClockMark);
        sb.append(", backAddr=").append(backAddr);
        sb.append(", constructionplanId=").append(constructionplanId);
        sb.append(", signLati=").append(signLati);
        sb.append(", backLati=").append(backLati);
        sb.append(", workload=").append(workload);
        sb.append(", path=").append(path);
        sb.append(", workTicketUrl=").append(workTicketUrl);
        sb.append(", groundProtectUrl=").append(groundProtectUrl);
        sb.append(", workMapUrl=").append(workMapUrl);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}