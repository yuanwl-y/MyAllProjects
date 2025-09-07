package com.ywl.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;

/**
 * 综合计划表
 * @TableName gspw_integratedproject
 */
@TableName(value ="gspw_integratedproject")
@Data
public class GspwIntegratedproject implements Serializable {
    /**
     * 综合计划批次id
     */
    @TableId(value = "integratedProject_id", type = IdType.AUTO)
    private Integer integratedprojectId;

    /**
     * 综合计划批次名称
     */
    @TableField(value = "integratedProject_name")
    private String integratedprojectName;

    /**
     * 批次年度
     */
    @TableField(value = "integratedProject_year")
    private String integratedprojectYear;

    /**
     * 批次状态
     */
    @TableField(value = "integratedProject_state")
    private Integer integratedprojectState;

    /**
     * 置顶字段
     */
    @TableField(value = "integratedProject_stick")
    private Integer integratedprojectStick;

    /**
     * 删除标记（1 已删除）
     */
    @TableField(value = "deleteMark")
    private Integer deletemark;

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
        GspwIntegratedproject other = (GspwIntegratedproject) that;
        return (this.getIntegratedprojectId() == null ? other.getIntegratedprojectId() == null : this.getIntegratedprojectId().equals(other.getIntegratedprojectId()))
            && (this.getIntegratedprojectName() == null ? other.getIntegratedprojectName() == null : this.getIntegratedprojectName().equals(other.getIntegratedprojectName()))
            && (this.getIntegratedprojectYear() == null ? other.getIntegratedprojectYear() == null : this.getIntegratedprojectYear().equals(other.getIntegratedprojectYear()))
            && (this.getIntegratedprojectState() == null ? other.getIntegratedprojectState() == null : this.getIntegratedprojectState().equals(other.getIntegratedprojectState()))
            && (this.getIntegratedprojectStick() == null ? other.getIntegratedprojectStick() == null : this.getIntegratedprojectStick().equals(other.getIntegratedprojectStick()))
            && (this.getDeletemark() == null ? other.getDeletemark() == null : this.getDeletemark().equals(other.getDeletemark()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getIntegratedprojectId() == null) ? 0 : getIntegratedprojectId().hashCode());
        result = prime * result + ((getIntegratedprojectName() == null) ? 0 : getIntegratedprojectName().hashCode());
        result = prime * result + ((getIntegratedprojectYear() == null) ? 0 : getIntegratedprojectYear().hashCode());
        result = prime * result + ((getIntegratedprojectState() == null) ? 0 : getIntegratedprojectState().hashCode());
        result = prime * result + ((getIntegratedprojectStick() == null) ? 0 : getIntegratedprojectStick().hashCode());
        result = prime * result + ((getDeletemark() == null) ? 0 : getDeletemark().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", integratedprojectId=").append(integratedprojectId);
        sb.append(", integratedprojectName=").append(integratedprojectName);
        sb.append(", integratedprojectYear=").append(integratedprojectYear);
        sb.append(", integratedprojectState=").append(integratedprojectState);
        sb.append(", integratedprojectStick=").append(integratedprojectStick);
        sb.append(", deletemark=").append(deletemark);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}