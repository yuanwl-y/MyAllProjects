package com.ywl.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * 
 * @TableName gspw_dispatch
 */
@TableName(value ="gspw_dispatch")
@Data
public class GspwDispatch implements Serializable {
    /**
     * 调度主键
     */
    @TableId(value = "dispatch_id", type = IdType.AUTO)
    private Integer dispatchId;

    /**
     * 关联人员档案id
     */
    @TableField(value = "archives_id")
    private Integer archivesId;

    /**
     * 开始时间
     */
    @TableField(value = "start_time")
    private LocalDateTime startTime;

    /**
     * 结束时间
     */
    @TableField(value = "end_time")
    private LocalDateTime endTime;

    /**
     * 删除标记
     */
    @TableField(value = "deletemark")
    private Integer deletemark;

    /**
     * 施工计划关联的id
     */
    @TableField(value = "constructionPlan_id")
    private Integer constructionplanId;

    /**
     * 人员调度种类
     */
    @TableField(value = "dispatch_type")
    private String dispatchType;

    /**
     * 人员调度状态 0,空闲 1,执行 2,挂起
     */
    @TableField(value = "dispatch_state")
    private Integer dispatchState;

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
        GspwDispatch other = (GspwDispatch) that;
        return (this.getDispatchId() == null ? other.getDispatchId() == null : this.getDispatchId().equals(other.getDispatchId()))
            && (this.getArchivesId() == null ? other.getArchivesId() == null : this.getArchivesId().equals(other.getArchivesId()))
            && (this.getStartTime() == null ? other.getStartTime() == null : this.getStartTime().equals(other.getStartTime()))
            && (this.getEndTime() == null ? other.getEndTime() == null : this.getEndTime().equals(other.getEndTime()))
            && (this.getDeletemark() == null ? other.getDeletemark() == null : this.getDeletemark().equals(other.getDeletemark()))
            && (this.getConstructionplanId() == null ? other.getConstructionplanId() == null : this.getConstructionplanId().equals(other.getConstructionplanId()))
            && (this.getDispatchType() == null ? other.getDispatchType() == null : this.getDispatchType().equals(other.getDispatchType()))
            && (this.getDispatchState() == null ? other.getDispatchState() == null : this.getDispatchState().equals(other.getDispatchState()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getDispatchId() == null) ? 0 : getDispatchId().hashCode());
        result = prime * result + ((getArchivesId() == null) ? 0 : getArchivesId().hashCode());
        result = prime * result + ((getStartTime() == null) ? 0 : getStartTime().hashCode());
        result = prime * result + ((getEndTime() == null) ? 0 : getEndTime().hashCode());
        result = prime * result + ((getDeletemark() == null) ? 0 : getDeletemark().hashCode());
        result = prime * result + ((getConstructionplanId() == null) ? 0 : getConstructionplanId().hashCode());
        result = prime * result + ((getDispatchType() == null) ? 0 : getDispatchType().hashCode());
        result = prime * result + ((getDispatchState() == null) ? 0 : getDispatchState().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", dispatchId=").append(dispatchId);
        sb.append(", archivesId=").append(archivesId);
        sb.append(", startTime=").append(startTime);
        sb.append(", endTime=").append(endTime);
        sb.append(", deletemark=").append(deletemark);
        sb.append(", constructionplanId=").append(constructionplanId);
        sb.append(", dispatchType=").append(dispatchType);
        sb.append(", dispatchState=").append(dispatchState);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}