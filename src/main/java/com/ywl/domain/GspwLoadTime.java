package com.ywl.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * 承载力模块_评分发布时间表
 * @TableName gspw_load_time
 */
@TableName(value ="gspw_load_time")
@Data
public class GspwLoadTime {
    /**
     * 主键
     */
    @TableId(value = "time_id", type = IdType.AUTO)
    private Integer timeId;

    /**
     * 时间详情
     */
    @TableField(value = "time_details")
    private String timeDetails;

    /**
     * 被发布的施工单位
     */
    @TableField(value = "time_org_code")
    private String timeOrgCode;

    /**
     * 发布详情
     */
    @TableField(value = "time_score_id")
    private Integer timeScoreId;

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
        GspwLoadTime other = (GspwLoadTime) that;
        return (this.getTimeId() == null ? other.getTimeId() == null : this.getTimeId().equals(other.getTimeId()))
            && (this.getTimeDetails() == null ? other.getTimeDetails() == null : this.getTimeDetails().equals(other.getTimeDetails()))
            && (this.getTimeOrgCode() == null ? other.getTimeOrgCode() == null : this.getTimeOrgCode().equals(other.getTimeOrgCode()))
            && (this.getTimeScoreId() == null ? other.getTimeScoreId() == null : this.getTimeScoreId().equals(other.getTimeScoreId()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getTimeId() == null) ? 0 : getTimeId().hashCode());
        result = prime * result + ((getTimeDetails() == null) ? 0 : getTimeDetails().hashCode());
        result = prime * result + ((getTimeOrgCode() == null) ? 0 : getTimeOrgCode().hashCode());
        result = prime * result + ((getTimeScoreId() == null) ? 0 : getTimeScoreId().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", timeId=").append(timeId);
        sb.append(", timeDetails=").append(timeDetails);
        sb.append(", timeOrgCode=").append(timeOrgCode);
        sb.append(", timeScoreId=").append(timeScoreId);
        sb.append("]");
        return sb.toString();
    }
}