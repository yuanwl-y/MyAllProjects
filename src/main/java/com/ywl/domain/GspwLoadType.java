package com.ywl.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;

/**
 * 承载力分析_打分类型表
 * @TableName gspw_load_type
 */
@TableName(value ="gspw_load_type")
@Data
public class GspwLoadType implements Serializable {
    /**
     * 
     */
    @TableId(value = "type_id", type = IdType.AUTO)
    private Integer typeId;

    /**
     * 打分类型名称
     */
    @TableField(value = "type_name")
    private String typeName;

    /**
     * 该类型的总分
     */
    @TableField(value = "type_grade")
    private String typeGrade;

    /**
     * 评价方法
     */
    @TableField(value = "type_method")
    private String typeMethod;

    /**
     * 评价标准
     */
    @TableField(value = "type_standard")
    private String typeStandard;

    /**
     * 删除标记
     */
    @TableField(value = "delete_mark")
    private Integer deleteMark;

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
        GspwLoadType other = (GspwLoadType) that;
        return (this.getTypeId() == null ? other.getTypeId() == null : this.getTypeId().equals(other.getTypeId()))
            && (this.getTypeName() == null ? other.getTypeName() == null : this.getTypeName().equals(other.getTypeName()))
            && (this.getTypeGrade() == null ? other.getTypeGrade() == null : this.getTypeGrade().equals(other.getTypeGrade()))
            && (this.getTypeMethod() == null ? other.getTypeMethod() == null : this.getTypeMethod().equals(other.getTypeMethod()))
            && (this.getTypeStandard() == null ? other.getTypeStandard() == null : this.getTypeStandard().equals(other.getTypeStandard()))
            && (this.getDeleteMark() == null ? other.getDeleteMark() == null : this.getDeleteMark().equals(other.getDeleteMark()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getTypeId() == null) ? 0 : getTypeId().hashCode());
        result = prime * result + ((getTypeName() == null) ? 0 : getTypeName().hashCode());
        result = prime * result + ((getTypeGrade() == null) ? 0 : getTypeGrade().hashCode());
        result = prime * result + ((getTypeMethod() == null) ? 0 : getTypeMethod().hashCode());
        result = prime * result + ((getTypeStandard() == null) ? 0 : getTypeStandard().hashCode());
        result = prime * result + ((getDeleteMark() == null) ? 0 : getDeleteMark().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", typeId=").append(typeId);
        sb.append(", typeName=").append(typeName);
        sb.append(", typeGrade=").append(typeGrade);
        sb.append(", typeMethod=").append(typeMethod);
        sb.append(", typeStandard=").append(typeStandard);
        sb.append(", deleteMark=").append(deleteMark);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}