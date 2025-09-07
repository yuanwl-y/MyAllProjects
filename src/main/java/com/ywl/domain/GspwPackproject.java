package com.ywl.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.time.LocalDateTime;
import lombok.Data;

/**
 * 项目打包表
 * @TableName gspw_packproject
 */
@TableName(value ="gspw_packproject")
@Data
public class GspwPackproject {
    /**
     * 主键
     */
    @TableId(value = "packProject_id", type = IdType.AUTO)
    private Integer packprojectId;

    /**
     * 项目名称
     */
    @TableField(value = "packProject_name")
    private String packprojectName;

    /**
     * 打包项目wbs编码
     */
    @TableField(value = "packProject_wbs")
    private String packprojectWbs;

    /**
     * 业务编码
     */
    @TableField(value = "packProject_number")
    private String packprojectNumber;

    /**
     * 综合计划批次id
     */
    @TableField(value = "integratedProject_id")
    private Integer integratedprojectId;

    /**
     * 创建单位
     */
    @TableField(value = "packProject_org")
    private String packprojectOrg;

    /**
     * 创建单位编码
     */
    @TableField(value = "packProject_orgCode")
    private String packprojectOrgcode;

    /**
     * 删除标记
     */
    @TableField(value = "deleteMark")
    private Integer deletemark;

    /**
     * 
     */
    @TableField(value = "time")
    private LocalDateTime time;

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
        GspwPackproject other = (GspwPackproject) that;
        return (this.getPackprojectId() == null ? other.getPackprojectId() == null : this.getPackprojectId().equals(other.getPackprojectId()))
            && (this.getPackprojectName() == null ? other.getPackprojectName() == null : this.getPackprojectName().equals(other.getPackprojectName()))
            && (this.getPackprojectWbs() == null ? other.getPackprojectWbs() == null : this.getPackprojectWbs().equals(other.getPackprojectWbs()))
            && (this.getPackprojectNumber() == null ? other.getPackprojectNumber() == null : this.getPackprojectNumber().equals(other.getPackprojectNumber()))
            && (this.getIntegratedprojectId() == null ? other.getIntegratedprojectId() == null : this.getIntegratedprojectId().equals(other.getIntegratedprojectId()))
            && (this.getPackprojectOrg() == null ? other.getPackprojectOrg() == null : this.getPackprojectOrg().equals(other.getPackprojectOrg()))
            && (this.getPackprojectOrgcode() == null ? other.getPackprojectOrgcode() == null : this.getPackprojectOrgcode().equals(other.getPackprojectOrgcode()))
            && (this.getDeletemark() == null ? other.getDeletemark() == null : this.getDeletemark().equals(other.getDeletemark()))
            && (this.getTime() == null ? other.getTime() == null : this.getTime().equals(other.getTime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getPackprojectId() == null) ? 0 : getPackprojectId().hashCode());
        result = prime * result + ((getPackprojectName() == null) ? 0 : getPackprojectName().hashCode());
        result = prime * result + ((getPackprojectWbs() == null) ? 0 : getPackprojectWbs().hashCode());
        result = prime * result + ((getPackprojectNumber() == null) ? 0 : getPackprojectNumber().hashCode());
        result = prime * result + ((getIntegratedprojectId() == null) ? 0 : getIntegratedprojectId().hashCode());
        result = prime * result + ((getPackprojectOrg() == null) ? 0 : getPackprojectOrg().hashCode());
        result = prime * result + ((getPackprojectOrgcode() == null) ? 0 : getPackprojectOrgcode().hashCode());
        result = prime * result + ((getDeletemark() == null) ? 0 : getDeletemark().hashCode());
        result = prime * result + ((getTime() == null) ? 0 : getTime().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", packprojectId=").append(packprojectId);
        sb.append(", packprojectName=").append(packprojectName);
        sb.append(", packprojectWbs=").append(packprojectWbs);
        sb.append(", packprojectNumber=").append(packprojectNumber);
        sb.append(", integratedprojectId=").append(integratedprojectId);
        sb.append(", packprojectOrg=").append(packprojectOrg);
        sb.append(", packprojectOrgcode=").append(packprojectOrgcode);
        sb.append(", deletemark=").append(deletemark);
        sb.append(", time=").append(time);
        sb.append("]");
        return sb.toString();
    }
}