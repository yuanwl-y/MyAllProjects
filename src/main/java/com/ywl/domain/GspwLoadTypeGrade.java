package com.ywl.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;

/**
 * 每一个小类的评分
 * @TableName gspw_load_type_grade
 */
@TableName(value ="gspw_load_type_grade")
@Data
public class GspwLoadTypeGrade implements Serializable {
    /**
     * 
     */
    @TableId(value = "grade_id", type = IdType.AUTO)
    private Integer gradeId;

    /**
     * 
     */
    @TableField(value = "grade_vo")
    private Integer gradeVo;

    /**
     * 
     */
    @TableField(value = "grade_url")
    private String gradeUrl;

    /**
     * 
     */
    @TableField(value = "grade_type_id")
    private Integer gradeTypeId;

    /**
     * 
     */
    @TableField(value = "grade_score_id")
    private Integer gradeScoreId;

    /**
     * 
     */
    @TableField(value = "delete_mark")
    private Integer deleteMark;

    /**
     * 角色
     */
    @TableField(value = "role")
    private String role;

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
        GspwLoadTypeGrade other = (GspwLoadTypeGrade) that;
        return (this.getGradeId() == null ? other.getGradeId() == null : this.getGradeId().equals(other.getGradeId()))
            && (this.getGradeVo() == null ? other.getGradeVo() == null : this.getGradeVo().equals(other.getGradeVo()))
            && (this.getGradeUrl() == null ? other.getGradeUrl() == null : this.getGradeUrl().equals(other.getGradeUrl()))
            && (this.getGradeTypeId() == null ? other.getGradeTypeId() == null : this.getGradeTypeId().equals(other.getGradeTypeId()))
            && (this.getGradeScoreId() == null ? other.getGradeScoreId() == null : this.getGradeScoreId().equals(other.getGradeScoreId()))
            && (this.getDeleteMark() == null ? other.getDeleteMark() == null : this.getDeleteMark().equals(other.getDeleteMark()))
            && (this.getRole() == null ? other.getRole() == null : this.getRole().equals(other.getRole()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getGradeId() == null) ? 0 : getGradeId().hashCode());
        result = prime * result + ((getGradeVo() == null) ? 0 : getGradeVo().hashCode());
        result = prime * result + ((getGradeUrl() == null) ? 0 : getGradeUrl().hashCode());
        result = prime * result + ((getGradeTypeId() == null) ? 0 : getGradeTypeId().hashCode());
        result = prime * result + ((getGradeScoreId() == null) ? 0 : getGradeScoreId().hashCode());
        result = prime * result + ((getDeleteMark() == null) ? 0 : getDeleteMark().hashCode());
        result = prime * result + ((getRole() == null) ? 0 : getRole().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", gradeId=").append(gradeId);
        sb.append(", gradeVo=").append(gradeVo);
        sb.append(", gradeUrl=").append(gradeUrl);
        sb.append(", gradeTypeId=").append(gradeTypeId);
        sb.append(", gradeScoreId=").append(gradeScoreId);
        sb.append(", deleteMark=").append(deleteMark);
        sb.append(", role=").append(role);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}