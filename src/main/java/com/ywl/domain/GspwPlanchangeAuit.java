package com.ywl.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * 
 * @TableName gspw_planchange_auit
 */
@TableName(value ="gspw_planchange_auit")
@Data
public class GspwPlanchangeAuit {
    /**
     * 变更审核主键
     */
    @TableId(value = "planChangeAuid_id", type = IdType.AUTO)
    private Integer planchangeauidId;

    /**
     * 变更表id
     */
    @TableField(value = "content_id")
    private String contentId;

    /**
     * 任务id
     */
    @TableField(value = "taskId")
    private String taskid;

    /**
     * 审核业主名字
     */
    @TableField(value = "audit_username")
    private String auditUsername;

    /**
     * 审核业主工号
     */
    @TableField(value = "audit_worknum")
    private String auditWorknum;

    /**
     * 审核结果
     */
    @TableField(value = "audit_result")
    private String auditResult;

    /**
     * 审核内容
     */
    @TableField(value = "audit_context")
    private String auditContext;

    /**
     * 状态（0编制 1审核中 2归档 3回退 4.未全员审核通过）
     */
    @TableField(value = "status")
    private Integer status;

    /**
     * 审核的市管理员名字
     */
    @TableField(value = "audit_managername")
    private String auditManagername;

    /**
     * 审核的市管理员工号
     */
    @TableField(value = "audit_managerworknum")
    private String auditManagerworknum;

    /**
     * 市管理员审核结果
     */
    @TableField(value = "audit_manager_result")
    private String auditManagerResult;

    /**
     * 市管理员审核内容
     */
    @TableField(value = "audit_manager_context")
    private String auditManagerContext;

    /**
     * 上报时间
     */
    @TableField(value = "report_time")
    private String reportTime;

    /**
     * 审核时间
     */
    @TableField(value = "audit_time")
    private String auditTime;

    /**
     * 市管理员审核时间
     */
    @TableField(value = "manager_audit_time")
    private String managerAuditTime;

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
        GspwPlanchangeAuit other = (GspwPlanchangeAuit) that;
        return (this.getPlanchangeauidId() == null ? other.getPlanchangeauidId() == null : this.getPlanchangeauidId().equals(other.getPlanchangeauidId()))
            && (this.getContentId() == null ? other.getContentId() == null : this.getContentId().equals(other.getContentId()))
            && (this.getTaskid() == null ? other.getTaskid() == null : this.getTaskid().equals(other.getTaskid()))
            && (this.getAuditUsername() == null ? other.getAuditUsername() == null : this.getAuditUsername().equals(other.getAuditUsername()))
            && (this.getAuditWorknum() == null ? other.getAuditWorknum() == null : this.getAuditWorknum().equals(other.getAuditWorknum()))
            && (this.getAuditResult() == null ? other.getAuditResult() == null : this.getAuditResult().equals(other.getAuditResult()))
            && (this.getAuditContext() == null ? other.getAuditContext() == null : this.getAuditContext().equals(other.getAuditContext()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getAuditManagername() == null ? other.getAuditManagername() == null : this.getAuditManagername().equals(other.getAuditManagername()))
            && (this.getAuditManagerworknum() == null ? other.getAuditManagerworknum() == null : this.getAuditManagerworknum().equals(other.getAuditManagerworknum()))
            && (this.getAuditManagerResult() == null ? other.getAuditManagerResult() == null : this.getAuditManagerResult().equals(other.getAuditManagerResult()))
            && (this.getAuditManagerContext() == null ? other.getAuditManagerContext() == null : this.getAuditManagerContext().equals(other.getAuditManagerContext()))
            && (this.getReportTime() == null ? other.getReportTime() == null : this.getReportTime().equals(other.getReportTime()))
            && (this.getAuditTime() == null ? other.getAuditTime() == null : this.getAuditTime().equals(other.getAuditTime()))
            && (this.getManagerAuditTime() == null ? other.getManagerAuditTime() == null : this.getManagerAuditTime().equals(other.getManagerAuditTime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getPlanchangeauidId() == null) ? 0 : getPlanchangeauidId().hashCode());
        result = prime * result + ((getContentId() == null) ? 0 : getContentId().hashCode());
        result = prime * result + ((getTaskid() == null) ? 0 : getTaskid().hashCode());
        result = prime * result + ((getAuditUsername() == null) ? 0 : getAuditUsername().hashCode());
        result = prime * result + ((getAuditWorknum() == null) ? 0 : getAuditWorknum().hashCode());
        result = prime * result + ((getAuditResult() == null) ? 0 : getAuditResult().hashCode());
        result = prime * result + ((getAuditContext() == null) ? 0 : getAuditContext().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getAuditManagername() == null) ? 0 : getAuditManagername().hashCode());
        result = prime * result + ((getAuditManagerworknum() == null) ? 0 : getAuditManagerworknum().hashCode());
        result = prime * result + ((getAuditManagerResult() == null) ? 0 : getAuditManagerResult().hashCode());
        result = prime * result + ((getAuditManagerContext() == null) ? 0 : getAuditManagerContext().hashCode());
        result = prime * result + ((getReportTime() == null) ? 0 : getReportTime().hashCode());
        result = prime * result + ((getAuditTime() == null) ? 0 : getAuditTime().hashCode());
        result = prime * result + ((getManagerAuditTime() == null) ? 0 : getManagerAuditTime().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", planchangeauidId=").append(planchangeauidId);
        sb.append(", contentId=").append(contentId);
        sb.append(", taskid=").append(taskid);
        sb.append(", auditUsername=").append(auditUsername);
        sb.append(", auditWorknum=").append(auditWorknum);
        sb.append(", auditResult=").append(auditResult);
        sb.append(", auditContext=").append(auditContext);
        sb.append(", status=").append(status);
        sb.append(", auditManagername=").append(auditManagername);
        sb.append(", auditManagerworknum=").append(auditManagerworknum);
        sb.append(", auditManagerResult=").append(auditManagerResult);
        sb.append(", auditManagerContext=").append(auditManagerContext);
        sb.append(", reportTime=").append(reportTime);
        sb.append(", auditTime=").append(auditTime);
        sb.append(", managerAuditTime=").append(managerAuditTime);
        sb.append("]");
        return sb.toString();
    }
}