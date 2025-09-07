package com.ywl.domain;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;

/**
 * 专项批次
 * @TableName gspw_specialintegrated
 */
@TableName(value ="gspw_specialintegrated")
@Data
public class GspwSpecialintegrated implements Serializable {
    /**
     * 主键
     */
    @TableId(value = "special_id")
    private String specialId;

    /**
     * 专项批次名字
     */
    @TableField(value = "special_name")
    private String specialName;

    /**
     * 年度
     */
    @TableField(value = "special_year")
    private String specialYear;

    /**
     * 置顶标记
     */
    @TableField(value = "special_stick")
    private Integer specialStick;

    /**
     * 批次主键用,分隔
     */
    @TableField(value = "integrated_id")
    private String integratedId;

    /**
     * 备注
     */
    @TableField(value = "special_remark")
    private String specialRemark;

    /**
     * 
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
        GspwSpecialintegrated other = (GspwSpecialintegrated) that;
        return (this.getSpecialId() == null ? other.getSpecialId() == null : this.getSpecialId().equals(other.getSpecialId()))
            && (this.getSpecialName() == null ? other.getSpecialName() == null : this.getSpecialName().equals(other.getSpecialName()))
            && (this.getSpecialYear() == null ? other.getSpecialYear() == null : this.getSpecialYear().equals(other.getSpecialYear()))
            && (this.getSpecialStick() == null ? other.getSpecialStick() == null : this.getSpecialStick().equals(other.getSpecialStick()))
            && (this.getIntegratedId() == null ? other.getIntegratedId() == null : this.getIntegratedId().equals(other.getIntegratedId()))
            && (this.getSpecialRemark() == null ? other.getSpecialRemark() == null : this.getSpecialRemark().equals(other.getSpecialRemark()))
            && (this.getDeletemark() == null ? other.getDeletemark() == null : this.getDeletemark().equals(other.getDeletemark()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getSpecialId() == null) ? 0 : getSpecialId().hashCode());
        result = prime * result + ((getSpecialName() == null) ? 0 : getSpecialName().hashCode());
        result = prime * result + ((getSpecialYear() == null) ? 0 : getSpecialYear().hashCode());
        result = prime * result + ((getSpecialStick() == null) ? 0 : getSpecialStick().hashCode());
        result = prime * result + ((getIntegratedId() == null) ? 0 : getIntegratedId().hashCode());
        result = prime * result + ((getSpecialRemark() == null) ? 0 : getSpecialRemark().hashCode());
        result = prime * result + ((getDeletemark() == null) ? 0 : getDeletemark().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", specialId=").append(specialId);
        sb.append(", specialName=").append(specialName);
        sb.append(", specialYear=").append(specialYear);
        sb.append(", specialStick=").append(specialStick);
        sb.append(", integratedId=").append(integratedId);
        sb.append(", specialRemark=").append(specialRemark);
        sb.append(", deletemark=").append(deletemark);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}