package com.ywl.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * 单位性质
 * @TableName gspw_orgnature
 */
@TableName(value ="gspw_orgnature")
@Data
public class GspwOrgnature {
    /**
     * 主键
     */
    @TableId(value = "nature_id")
    private Integer natureId;

    /**
     * 单位名
     */
    @TableField(value = "nature_orgname")
    private String natureOrgname;

    /**
     * 性质名称
     */
    @TableField(value = "nature_name")
    private String natureName;

    /**
     * 简称
     */
    @TableField(value = "nature_abbreviation")
    private String natureAbbreviation;

    /**
     * 排序字段
     */
    @TableField(value = "nature_code")
    private String natureCode;

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
        GspwOrgnature other = (GspwOrgnature) that;
        return (this.getNatureId() == null ? other.getNatureId() == null : this.getNatureId().equals(other.getNatureId()))
            && (this.getNatureOrgname() == null ? other.getNatureOrgname() == null : this.getNatureOrgname().equals(other.getNatureOrgname()))
            && (this.getNatureName() == null ? other.getNatureName() == null : this.getNatureName().equals(other.getNatureName()))
            && (this.getNatureAbbreviation() == null ? other.getNatureAbbreviation() == null : this.getNatureAbbreviation().equals(other.getNatureAbbreviation()))
            && (this.getNatureCode() == null ? other.getNatureCode() == null : this.getNatureCode().equals(other.getNatureCode()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getNatureId() == null) ? 0 : getNatureId().hashCode());
        result = prime * result + ((getNatureOrgname() == null) ? 0 : getNatureOrgname().hashCode());
        result = prime * result + ((getNatureName() == null) ? 0 : getNatureName().hashCode());
        result = prime * result + ((getNatureAbbreviation() == null) ? 0 : getNatureAbbreviation().hashCode());
        result = prime * result + ((getNatureCode() == null) ? 0 : getNatureCode().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", natureId=").append(natureId);
        sb.append(", natureOrgname=").append(natureOrgname);
        sb.append(", natureName=").append(natureName);
        sb.append(", natureAbbreviation=").append(natureAbbreviation);
        sb.append(", natureCode=").append(natureCode);
        sb.append("]");
        return sb.toString();
    }
}