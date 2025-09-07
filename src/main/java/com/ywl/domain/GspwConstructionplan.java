package com.ywl.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * 施工计划表
 * @TableName gspw_constructionplan
 */
@TableName(value ="gspw_constructionplan")
@Data
public class GspwConstructionplan implements Serializable {
    /**
     * 主键
     */
    @TableId(value = "constructionPlan_id", type = IdType.AUTO)
    private Integer constructionplanId;

    /**
     * 工程名称(勘察信息主键)
     */
    @TableField(value = "surveyInfo_id")
    private Integer surveyinfoId;

    /**
     * 作业内容
     */
    @TableField(value = "constructionPlan_content")
    private String constructionplanContent;

    /**
     * 开始时间
     */
    @TableField(value = "constructionPlan_startTime")
    private LocalDateTime constructionplanStarttime;

    /**
     * 结束时间
     */
    @TableField(value = "constructionPlan_endTime")
    private LocalDateTime constructionplanEndtime;

    /**
     * 负责人
     */
    @TableField(value = "archives_name")
    private String archivesName;

    /**
     * 档案id
     */
    @TableField(value = "archives_id")
    private Integer archivesId;

    /**
     * 地点（坐标）
     */
    @TableField(value = "constructionPlan_addr")
    private String constructionplanAddr;

    /**
     * 人数
     */
    @TableField(value = "constructionPlan_number")
    private Integer constructionplanNumber;

    /**
     * 流程任务id
     */
    @TableField(value = "taskid")
    private String taskid;

    /**
     * 状态（0编制 1审核中 2归档 3回退）
     */
    @TableField(value = "constructionPlan_state")
    private String constructionplanState;

    /**
     * 施工计划种类0代表临时施工计划 1代表正常施工计划
     */
    @TableField(value = "constructionPlan_kind")
    private Integer constructionplanKind;

    /**
     * 流程开始时间
     */
    @TableField(value = "flowaudit_startDate")
    private LocalDateTime flowauditStartdate;

    /**
     * 删除标记
     */
    @TableField(value = "deleteMark")
    private Integer deletemark;

    /**
     * 监理人id
     */
    @TableField(value = "super_visor")
    private Integer superVisor;

    /**
     * 监理人名称
     */
    @TableField(value = "supervisor_name")
    private String supervisorName;

    /**
     * 施工人id集合字符串
     */
    @TableField(value = "people_ids")
    private String peopleIds;

    /**
     * 变更时间
     */
    @TableField(value = "update_time")
    private LocalDateTime updateTime;

    /**
     * 变更标记
     */
    @TableField(value = "update_state")
    private Integer updateState;

    /**
     * 技术员名字
     */
    @TableField(value = "safetyOfficer_name")
    private String safetyofficerName;

    /**
     * 技术员名字
     */
    @TableField(value = "technician_name")
    private String technicianName;

    /**
     * 安全员id
     */
    @TableField(value = "safety_officer")
    private Integer safetyOfficer;

    /**
     * 创建时间
     */
    @TableField(value = "create_date")
    private LocalDateTime createDate;

    /**
     * 技术员id
     */
    @TableField(value = "technician")
    private Integer technician;

    /**
     * 监理单位代码
     */
    @TableField(value = "supervisor_orgcode")
    private String supervisorOrgcode;

    /**
     * 监理单位名称
     */
    @TableField(value = "supervisor_orgname")
    private String supervisorOrgname;

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
        GspwConstructionplan other = (GspwConstructionplan) that;
        return (this.getConstructionplanId() == null ? other.getConstructionplanId() == null : this.getConstructionplanId().equals(other.getConstructionplanId()))
            && (this.getSurveyinfoId() == null ? other.getSurveyinfoId() == null : this.getSurveyinfoId().equals(other.getSurveyinfoId()))
            && (this.getConstructionplanContent() == null ? other.getConstructionplanContent() == null : this.getConstructionplanContent().equals(other.getConstructionplanContent()))
            && (this.getConstructionplanStarttime() == null ? other.getConstructionplanStarttime() == null : this.getConstructionplanStarttime().equals(other.getConstructionplanStarttime()))
            && (this.getConstructionplanEndtime() == null ? other.getConstructionplanEndtime() == null : this.getConstructionplanEndtime().equals(other.getConstructionplanEndtime()))
            && (this.getArchivesName() == null ? other.getArchivesName() == null : this.getArchivesName().equals(other.getArchivesName()))
            && (this.getArchivesId() == null ? other.getArchivesId() == null : this.getArchivesId().equals(other.getArchivesId()))
            && (this.getConstructionplanAddr() == null ? other.getConstructionplanAddr() == null : this.getConstructionplanAddr().equals(other.getConstructionplanAddr()))
            && (this.getConstructionplanNumber() == null ? other.getConstructionplanNumber() == null : this.getConstructionplanNumber().equals(other.getConstructionplanNumber()))
            && (this.getTaskid() == null ? other.getTaskid() == null : this.getTaskid().equals(other.getTaskid()))
            && (this.getConstructionplanState() == null ? other.getConstructionplanState() == null : this.getConstructionplanState().equals(other.getConstructionplanState()))
            && (this.getConstructionplanKind() == null ? other.getConstructionplanKind() == null : this.getConstructionplanKind().equals(other.getConstructionplanKind()))
            && (this.getFlowauditStartdate() == null ? other.getFlowauditStartdate() == null : this.getFlowauditStartdate().equals(other.getFlowauditStartdate()))
            && (this.getDeletemark() == null ? other.getDeletemark() == null : this.getDeletemark().equals(other.getDeletemark()))
            && (this.getSuperVisor() == null ? other.getSuperVisor() == null : this.getSuperVisor().equals(other.getSuperVisor()))
            && (this.getSupervisorName() == null ? other.getSupervisorName() == null : this.getSupervisorName().equals(other.getSupervisorName()))
            && (this.getPeopleIds() == null ? other.getPeopleIds() == null : this.getPeopleIds().equals(other.getPeopleIds()))
            && (this.getUpdateTime() == null ? other.getUpdateTime() == null : this.getUpdateTime().equals(other.getUpdateTime()))
            && (this.getUpdateState() == null ? other.getUpdateState() == null : this.getUpdateState().equals(other.getUpdateState()))
            && (this.getSafetyofficerName() == null ? other.getSafetyofficerName() == null : this.getSafetyofficerName().equals(other.getSafetyofficerName()))
            && (this.getTechnicianName() == null ? other.getTechnicianName() == null : this.getTechnicianName().equals(other.getTechnicianName()))
            && (this.getSafetyOfficer() == null ? other.getSafetyOfficer() == null : this.getSafetyOfficer().equals(other.getSafetyOfficer()))
            && (this.getCreateDate() == null ? other.getCreateDate() == null : this.getCreateDate().equals(other.getCreateDate()))
            && (this.getTechnician() == null ? other.getTechnician() == null : this.getTechnician().equals(other.getTechnician()))
            && (this.getSupervisorOrgcode() == null ? other.getSupervisorOrgcode() == null : this.getSupervisorOrgcode().equals(other.getSupervisorOrgcode()))
            && (this.getSupervisorOrgname() == null ? other.getSupervisorOrgname() == null : this.getSupervisorOrgname().equals(other.getSupervisorOrgname()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getConstructionplanId() == null) ? 0 : getConstructionplanId().hashCode());
        result = prime * result + ((getSurveyinfoId() == null) ? 0 : getSurveyinfoId().hashCode());
        result = prime * result + ((getConstructionplanContent() == null) ? 0 : getConstructionplanContent().hashCode());
        result = prime * result + ((getConstructionplanStarttime() == null) ? 0 : getConstructionplanStarttime().hashCode());
        result = prime * result + ((getConstructionplanEndtime() == null) ? 0 : getConstructionplanEndtime().hashCode());
        result = prime * result + ((getArchivesName() == null) ? 0 : getArchivesName().hashCode());
        result = prime * result + ((getArchivesId() == null) ? 0 : getArchivesId().hashCode());
        result = prime * result + ((getConstructionplanAddr() == null) ? 0 : getConstructionplanAddr().hashCode());
        result = prime * result + ((getConstructionplanNumber() == null) ? 0 : getConstructionplanNumber().hashCode());
        result = prime * result + ((getTaskid() == null) ? 0 : getTaskid().hashCode());
        result = prime * result + ((getConstructionplanState() == null) ? 0 : getConstructionplanState().hashCode());
        result = prime * result + ((getConstructionplanKind() == null) ? 0 : getConstructionplanKind().hashCode());
        result = prime * result + ((getFlowauditStartdate() == null) ? 0 : getFlowauditStartdate().hashCode());
        result = prime * result + ((getDeletemark() == null) ? 0 : getDeletemark().hashCode());
        result = prime * result + ((getSuperVisor() == null) ? 0 : getSuperVisor().hashCode());
        result = prime * result + ((getSupervisorName() == null) ? 0 : getSupervisorName().hashCode());
        result = prime * result + ((getPeopleIds() == null) ? 0 : getPeopleIds().hashCode());
        result = prime * result + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        result = prime * result + ((getUpdateState() == null) ? 0 : getUpdateState().hashCode());
        result = prime * result + ((getSafetyofficerName() == null) ? 0 : getSafetyofficerName().hashCode());
        result = prime * result + ((getTechnicianName() == null) ? 0 : getTechnicianName().hashCode());
        result = prime * result + ((getSafetyOfficer() == null) ? 0 : getSafetyOfficer().hashCode());
        result = prime * result + ((getCreateDate() == null) ? 0 : getCreateDate().hashCode());
        result = prime * result + ((getTechnician() == null) ? 0 : getTechnician().hashCode());
        result = prime * result + ((getSupervisorOrgcode() == null) ? 0 : getSupervisorOrgcode().hashCode());
        result = prime * result + ((getSupervisorOrgname() == null) ? 0 : getSupervisorOrgname().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", constructionplanId=").append(constructionplanId);
        sb.append(", surveyinfoId=").append(surveyinfoId);
        sb.append(", constructionplanContent=").append(constructionplanContent);
        sb.append(", constructionplanStarttime=").append(constructionplanStarttime);
        sb.append(", constructionplanEndtime=").append(constructionplanEndtime);
        sb.append(", archivesName=").append(archivesName);
        sb.append(", archivesId=").append(archivesId);
        sb.append(", constructionplanAddr=").append(constructionplanAddr);
        sb.append(", constructionplanNumber=").append(constructionplanNumber);
        sb.append(", taskid=").append(taskid);
        sb.append(", constructionplanState=").append(constructionplanState);
        sb.append(", constructionplanKind=").append(constructionplanKind);
        sb.append(", flowauditStartdate=").append(flowauditStartdate);
        sb.append(", deletemark=").append(deletemark);
        sb.append(", superVisor=").append(superVisor);
        sb.append(", supervisorName=").append(supervisorName);
        sb.append(", peopleIds=").append(peopleIds);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", updateState=").append(updateState);
        sb.append(", safetyofficerName=").append(safetyofficerName);
        sb.append(", technicianName=").append(technicianName);
        sb.append(", safetyOfficer=").append(safetyOfficer);
        sb.append(", createDate=").append(createDate);
        sb.append(", technician=").append(technician);
        sb.append(", supervisorOrgcode=").append(supervisorOrgcode);
        sb.append(", supervisorOrgname=").append(supervisorOrgname);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}