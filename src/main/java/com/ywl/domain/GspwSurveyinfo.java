package com.ywl.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;

/**
 * 现场勘查表
 * @TableName gspw_surveyinfo
 */
@TableName(value ="gspw_surveyinfo")
@Data
public class GspwSurveyinfo implements Serializable {
    /**
     * 主键
     */
    @TableId(value = "surveyInfo_id", type = IdType.AUTO)
    private Integer surveyinfoId;

    /**
     * 项目名称(项目打包主键）
     */
    @TableField(value = "packProject_id")
    private Integer packprojectId;

    /**
     * 
     */
    @TableField(value = "monproject_id")
    private String monprojectId;

    /**
     * ERP项目编码
     */
    @TableField(value = "surveyInfo_wbs")
    private String surveyinfoWbs;

    /**
     * 工程名称
     */
    @TableField(value = "surveyInfo_name")
    private String surveyinfoName;

    /**
     * 工程位置（坐标）
     */
    @TableField(value = "surveyInfo_position")
    private String surveyinfoPosition;

    /**
     * 删除标记
     */
    @TableField(value = "deleteMark")
    private Integer deletemark;

    /**
     * 全景照片
     */
    @TableField(value = "panoramic_photo")
    private String panoramicPhoto;

    /**
     * 交底照片
     */
    @TableField(value = "disclose_photo")
    private String disclosePhoto;

    /**
     * 工作量照片
     */
    @TableField(value = "workTicket_photo")
    private String workticketPhoto;

    /**
     * 勘察备注
     */
    @TableField(value = "content")
    private String content;

    /**
     * 
     */
    @TableField(value = "is_import")
    private Integer isImport;

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
        GspwSurveyinfo other = (GspwSurveyinfo) that;
        return (this.getSurveyinfoId() == null ? other.getSurveyinfoId() == null : this.getSurveyinfoId().equals(other.getSurveyinfoId()))
            && (this.getPackprojectId() == null ? other.getPackprojectId() == null : this.getPackprojectId().equals(other.getPackprojectId()))
            && (this.getMonprojectId() == null ? other.getMonprojectId() == null : this.getMonprojectId().equals(other.getMonprojectId()))
            && (this.getSurveyinfoWbs() == null ? other.getSurveyinfoWbs() == null : this.getSurveyinfoWbs().equals(other.getSurveyinfoWbs()))
            && (this.getSurveyinfoName() == null ? other.getSurveyinfoName() == null : this.getSurveyinfoName().equals(other.getSurveyinfoName()))
            && (this.getSurveyinfoPosition() == null ? other.getSurveyinfoPosition() == null : this.getSurveyinfoPosition().equals(other.getSurveyinfoPosition()))
            && (this.getDeletemark() == null ? other.getDeletemark() == null : this.getDeletemark().equals(other.getDeletemark()))
            && (this.getPanoramicPhoto() == null ? other.getPanoramicPhoto() == null : this.getPanoramicPhoto().equals(other.getPanoramicPhoto()))
            && (this.getDisclosePhoto() == null ? other.getDisclosePhoto() == null : this.getDisclosePhoto().equals(other.getDisclosePhoto()))
            && (this.getWorkticketPhoto() == null ? other.getWorkticketPhoto() == null : this.getWorkticketPhoto().equals(other.getWorkticketPhoto()))
            && (this.getContent() == null ? other.getContent() == null : this.getContent().equals(other.getContent()))
            && (this.getIsImport() == null ? other.getIsImport() == null : this.getIsImport().equals(other.getIsImport()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getSurveyinfoId() == null) ? 0 : getSurveyinfoId().hashCode());
        result = prime * result + ((getPackprojectId() == null) ? 0 : getPackprojectId().hashCode());
        result = prime * result + ((getMonprojectId() == null) ? 0 : getMonprojectId().hashCode());
        result = prime * result + ((getSurveyinfoWbs() == null) ? 0 : getSurveyinfoWbs().hashCode());
        result = prime * result + ((getSurveyinfoName() == null) ? 0 : getSurveyinfoName().hashCode());
        result = prime * result + ((getSurveyinfoPosition() == null) ? 0 : getSurveyinfoPosition().hashCode());
        result = prime * result + ((getDeletemark() == null) ? 0 : getDeletemark().hashCode());
        result = prime * result + ((getPanoramicPhoto() == null) ? 0 : getPanoramicPhoto().hashCode());
        result = prime * result + ((getDisclosePhoto() == null) ? 0 : getDisclosePhoto().hashCode());
        result = prime * result + ((getWorkticketPhoto() == null) ? 0 : getWorkticketPhoto().hashCode());
        result = prime * result + ((getContent() == null) ? 0 : getContent().hashCode());
        result = prime * result + ((getIsImport() == null) ? 0 : getIsImport().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", surveyinfoId=").append(surveyinfoId);
        sb.append(", packprojectId=").append(packprojectId);
        sb.append(", monprojectId=").append(monprojectId);
        sb.append(", surveyinfoWbs=").append(surveyinfoWbs);
        sb.append(", surveyinfoName=").append(surveyinfoName);
        sb.append(", surveyinfoPosition=").append(surveyinfoPosition);
        sb.append(", deletemark=").append(deletemark);
        sb.append(", panoramicPhoto=").append(panoramicPhoto);
        sb.append(", disclosePhoto=").append(disclosePhoto);
        sb.append(", workticketPhoto=").append(workticketPhoto);
        sb.append(", content=").append(content);
        sb.append(", isImport=").append(isImport);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}