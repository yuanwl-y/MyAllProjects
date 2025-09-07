package com.ywl.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * 
 * @TableName gspw_blacklist
 */
@TableName(value ="gspw_blacklist")
@Data
public class GspwBlacklist {
    /**
     * 工号
     */
    @TableField(value = "workCode")
    private String workcode;

    /**
     * 加入时间
     */
    @TableField(value = "joinTime")
    private String jointime;

    /**
     * 加入人名字
     */
    @TableField(value = "accessName")
    private String accessname;

    /**
     * 加入人工号
     */
    @TableField(value = "accessWorkCode")
    private String accessworkcode;

    /**
     * 原因
     */
    @TableField(value = "reason")
    private String reason;

    /**
     * 删除标记
     */
    @TableField(value = "deleteMark")
    private Integer deletemark;

    /**
     * 
     */
    @TableField(value = "black_type")
    private Integer blackType;

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
        GspwBlacklist other = (GspwBlacklist) that;
        return (this.getWorkcode() == null ? other.getWorkcode() == null : this.getWorkcode().equals(other.getWorkcode()))
            && (this.getJointime() == null ? other.getJointime() == null : this.getJointime().equals(other.getJointime()))
            && (this.getAccessname() == null ? other.getAccessname() == null : this.getAccessname().equals(other.getAccessname()))
            && (this.getAccessworkcode() == null ? other.getAccessworkcode() == null : this.getAccessworkcode().equals(other.getAccessworkcode()))
            && (this.getReason() == null ? other.getReason() == null : this.getReason().equals(other.getReason()))
            && (this.getDeletemark() == null ? other.getDeletemark() == null : this.getDeletemark().equals(other.getDeletemark()))
            && (this.getBlackType() == null ? other.getBlackType() == null : this.getBlackType().equals(other.getBlackType()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getWorkcode() == null) ? 0 : getWorkcode().hashCode());
        result = prime * result + ((getJointime() == null) ? 0 : getJointime().hashCode());
        result = prime * result + ((getAccessname() == null) ? 0 : getAccessname().hashCode());
        result = prime * result + ((getAccessworkcode() == null) ? 0 : getAccessworkcode().hashCode());
        result = prime * result + ((getReason() == null) ? 0 : getReason().hashCode());
        result = prime * result + ((getDeletemark() == null) ? 0 : getDeletemark().hashCode());
        result = prime * result + ((getBlackType() == null) ? 0 : getBlackType().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", workcode=").append(workcode);
        sb.append(", jointime=").append(jointime);
        sb.append(", accessname=").append(accessname);
        sb.append(", accessworkcode=").append(accessworkcode);
        sb.append(", reason=").append(reason);
        sb.append(", deletemark=").append(deletemark);
        sb.append(", blackType=").append(blackType);
        sb.append("]");
        return sb.toString();
    }
}