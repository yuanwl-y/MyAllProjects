package com.ywl.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;

/**
 * 承载力分析_打分详情表
 * @TableName gspw_load_score
 */
@TableName(value ="gspw_load_score")
@Data
public class GspwLoadScore implements Serializable {
    /**
     * 主键
     */
    @TableId(value = "score_id", type = IdType.AUTO)
    private Integer scoreId;

    /**
     * 工程名称
     */
    @TableField(value = "score_project_name")
    private String scoreProjectName;

    /**
     * 工程id
     */
    @TableField(value = "score_project_id")
    private Integer scoreProjectId;

    /**
     * 承包商
     */
    @TableField(value = "score_contractor")
    private String scoreContractor;

    /**
     * 承包商编码
     */
    @TableField(value = "score_contractor_code")
    private String scoreContractorCode;

    /**
     * 业主评分
     */
    @TableField(value = "score_owner_grade")
    private Integer scoreOwnerGrade;

    /**
     * 市公司管理评分
     */
    @TableField(value = "score_city_grade")
    private Integer scoreCityGrade;

    /**
     * 施工项目部
     */
    @TableField(value = "score_dept_name")
    private String scoreDeptName;

    /**
     * 施工项目部编码
     */
    @TableField(value = "score_dept_code")
    private String scoreDeptCode;

    /**
     * 评分组
     */
    @TableField(value = "score_group")
    private String scoreGroup;

    /**
     * 评分组编码
     */
    @TableField(value = "score_group_code")
    private String scoreGroupCode;

    /**
     * 合计
     */
    @TableField(value = "score_total")
    private String scoreTotal;

    /**
     * 发布时间
     */
    @TableField(value = "score_time")
    private String scoreTime;

    /**
     * 发布状态0发布 1未发布
     */
    @TableField(value = "score_state")
    private Integer scoreState;

    /**
     * 负责单位编码
     */
    @TableField(value = "score_orgcode")
    private String scoreOrgcode;

    /**
     * 市州单位编码
     */
    @TableField(value = "score_orgcitycode")
    private String scoreOrgcitycode;

    /**
     * 
     */
    @TableField(value = "delete_mark")
    private String deleteMark;

    /**
     * 0发布 1未发布
     */
    @TableField(value = "select_state")
    private Integer selectState;

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
        GspwLoadScore other = (GspwLoadScore) that;
        return (this.getScoreId() == null ? other.getScoreId() == null : this.getScoreId().equals(other.getScoreId()))
            && (this.getScoreProjectName() == null ? other.getScoreProjectName() == null : this.getScoreProjectName().equals(other.getScoreProjectName()))
            && (this.getScoreProjectId() == null ? other.getScoreProjectId() == null : this.getScoreProjectId().equals(other.getScoreProjectId()))
            && (this.getScoreContractor() == null ? other.getScoreContractor() == null : this.getScoreContractor().equals(other.getScoreContractor()))
            && (this.getScoreContractorCode() == null ? other.getScoreContractorCode() == null : this.getScoreContractorCode().equals(other.getScoreContractorCode()))
            && (this.getScoreOwnerGrade() == null ? other.getScoreOwnerGrade() == null : this.getScoreOwnerGrade().equals(other.getScoreOwnerGrade()))
            && (this.getScoreCityGrade() == null ? other.getScoreCityGrade() == null : this.getScoreCityGrade().equals(other.getScoreCityGrade()))
            && (this.getScoreDeptName() == null ? other.getScoreDeptName() == null : this.getScoreDeptName().equals(other.getScoreDeptName()))
            && (this.getScoreDeptCode() == null ? other.getScoreDeptCode() == null : this.getScoreDeptCode().equals(other.getScoreDeptCode()))
            && (this.getScoreGroup() == null ? other.getScoreGroup() == null : this.getScoreGroup().equals(other.getScoreGroup()))
            && (this.getScoreGroupCode() == null ? other.getScoreGroupCode() == null : this.getScoreGroupCode().equals(other.getScoreGroupCode()))
            && (this.getScoreTotal() == null ? other.getScoreTotal() == null : this.getScoreTotal().equals(other.getScoreTotal()))
            && (this.getScoreTime() == null ? other.getScoreTime() == null : this.getScoreTime().equals(other.getScoreTime()))
            && (this.getScoreState() == null ? other.getScoreState() == null : this.getScoreState().equals(other.getScoreState()))
            && (this.getScoreOrgcode() == null ? other.getScoreOrgcode() == null : this.getScoreOrgcode().equals(other.getScoreOrgcode()))
            && (this.getScoreOrgcitycode() == null ? other.getScoreOrgcitycode() == null : this.getScoreOrgcitycode().equals(other.getScoreOrgcitycode()))
            && (this.getDeleteMark() == null ? other.getDeleteMark() == null : this.getDeleteMark().equals(other.getDeleteMark()))
            && (this.getSelectState() == null ? other.getSelectState() == null : this.getSelectState().equals(other.getSelectState()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getScoreId() == null) ? 0 : getScoreId().hashCode());
        result = prime * result + ((getScoreProjectName() == null) ? 0 : getScoreProjectName().hashCode());
        result = prime * result + ((getScoreProjectId() == null) ? 0 : getScoreProjectId().hashCode());
        result = prime * result + ((getScoreContractor() == null) ? 0 : getScoreContractor().hashCode());
        result = prime * result + ((getScoreContractorCode() == null) ? 0 : getScoreContractorCode().hashCode());
        result = prime * result + ((getScoreOwnerGrade() == null) ? 0 : getScoreOwnerGrade().hashCode());
        result = prime * result + ((getScoreCityGrade() == null) ? 0 : getScoreCityGrade().hashCode());
        result = prime * result + ((getScoreDeptName() == null) ? 0 : getScoreDeptName().hashCode());
        result = prime * result + ((getScoreDeptCode() == null) ? 0 : getScoreDeptCode().hashCode());
        result = prime * result + ((getScoreGroup() == null) ? 0 : getScoreGroup().hashCode());
        result = prime * result + ((getScoreGroupCode() == null) ? 0 : getScoreGroupCode().hashCode());
        result = prime * result + ((getScoreTotal() == null) ? 0 : getScoreTotal().hashCode());
        result = prime * result + ((getScoreTime() == null) ? 0 : getScoreTime().hashCode());
        result = prime * result + ((getScoreState() == null) ? 0 : getScoreState().hashCode());
        result = prime * result + ((getScoreOrgcode() == null) ? 0 : getScoreOrgcode().hashCode());
        result = prime * result + ((getScoreOrgcitycode() == null) ? 0 : getScoreOrgcitycode().hashCode());
        result = prime * result + ((getDeleteMark() == null) ? 0 : getDeleteMark().hashCode());
        result = prime * result + ((getSelectState() == null) ? 0 : getSelectState().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", scoreId=").append(scoreId);
        sb.append(", scoreProjectName=").append(scoreProjectName);
        sb.append(", scoreProjectId=").append(scoreProjectId);
        sb.append(", scoreContractor=").append(scoreContractor);
        sb.append(", scoreContractorCode=").append(scoreContractorCode);
        sb.append(", scoreOwnerGrade=").append(scoreOwnerGrade);
        sb.append(", scoreCityGrade=").append(scoreCityGrade);
        sb.append(", scoreDeptName=").append(scoreDeptName);
        sb.append(", scoreDeptCode=").append(scoreDeptCode);
        sb.append(", scoreGroup=").append(scoreGroup);
        sb.append(", scoreGroupCode=").append(scoreGroupCode);
        sb.append(", scoreTotal=").append(scoreTotal);
        sb.append(", scoreTime=").append(scoreTime);
        sb.append(", scoreState=").append(scoreState);
        sb.append(", scoreOrgcode=").append(scoreOrgcode);
        sb.append(", scoreOrgcitycode=").append(scoreOrgcitycode);
        sb.append(", deleteMark=").append(deleteMark);
        sb.append(", selectState=").append(selectState);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}