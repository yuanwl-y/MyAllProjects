package com.ywl.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * 
 * @TableName gspw_cancelplan
 */
@TableName(value ="gspw_cancelplan")
@Data
public class GspwCancelplan {
    /**
     * 主键
     */
    @TableId(value = "cancelPlanId", type = IdType.AUTO)
    private Integer cancelplanid;

    /**
     * 开始时间
     */
    @TableField(value = "startTime")
    private String starttime;

    /**
     * 结束时间
     */
    @TableField(value = "endTime")
    private String endtime;

    /**
     * 取消人id
     */
    @TableField(value = "cancel_id")
    private Integer cancelId;

    /**
     * 取消人名字
     */
    @TableField(value = "cancel_name")
    private String cancelName;

    /**
     * 取消时间
     */
    @TableField(value = "cancelTime")
    private String canceltime;

    /**
     * 取消原因
     */
    @TableField(value = "cancelResult")
    private String cancelresult;

    /**
     * 施工计划主键
     */
    @TableField(value = "constructionPlan_id")
    private Integer constructionplanId;

    /**
     * 删除标记
     */
    @TableField(value = "deleteMark")
    private Integer deletemark;

    /**
     * 取消天数
     */
    @TableField(value = "days")
    private String days;

    /**
     * 任务id
     */
    @TableField(value = "taskId")
    private String taskid;

    /**
     * 状态（0编制 1审核中 2归档 3回退）
     */
    @TableField(value = "status")
    private Integer status;

    /**
     * 审核人名字
     */
    @TableField(value = "auditUserName")
    private String auditusername;

    /**
     * 审核人工号
     */
    @TableField(value = "auditWorkCode")
    private String auditworkcode;

    /**
     * 审核结果
     */
    @TableField(value = "auditResult")
    private String auditresult;

    /**
     * 审核内容
     */
    @TableField(value = "auditContext")
    private String auditcontext;

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
        GspwCancelplan other = (GspwCancelplan) that;
        return (this.getCancelplanid() == null ? other.getCancelplanid() == null : this.getCancelplanid().equals(other.getCancelplanid()))
            && (this.getStarttime() == null ? other.getStarttime() == null : this.getStarttime().equals(other.getStarttime()))
            && (this.getEndtime() == null ? other.getEndtime() == null : this.getEndtime().equals(other.getEndtime()))
            && (this.getCancelId() == null ? other.getCancelId() == null : this.getCancelId().equals(other.getCancelId()))
            && (this.getCancelName() == null ? other.getCancelName() == null : this.getCancelName().equals(other.getCancelName()))
            && (this.getCanceltime() == null ? other.getCanceltime() == null : this.getCanceltime().equals(other.getCanceltime()))
            && (this.getCancelresult() == null ? other.getCancelresult() == null : this.getCancelresult().equals(other.getCancelresult()))
            && (this.getConstructionplanId() == null ? other.getConstructionplanId() == null : this.getConstructionplanId().equals(other.getConstructionplanId()))
            && (this.getDeletemark() == null ? other.getDeletemark() == null : this.getDeletemark().equals(other.getDeletemark()))
            && (this.getDays() == null ? other.getDays() == null : this.getDays().equals(other.getDays()))
            && (this.getTaskid() == null ? other.getTaskid() == null : this.getTaskid().equals(other.getTaskid()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getAuditusername() == null ? other.getAuditusername() == null : this.getAuditusername().equals(other.getAuditusername()))
            && (this.getAuditworkcode() == null ? other.getAuditworkcode() == null : this.getAuditworkcode().equals(other.getAuditworkcode()))
            && (this.getAuditresult() == null ? other.getAuditresult() == null : this.getAuditresult().equals(other.getAuditresult()))
            && (this.getAuditcontext() == null ? other.getAuditcontext() == null : this.getAuditcontext().equals(other.getAuditcontext()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getCancelplanid() == null) ? 0 : getCancelplanid().hashCode());
        result = prime * result + ((getStarttime() == null) ? 0 : getStarttime().hashCode());
        result = prime * result + ((getEndtime() == null) ? 0 : getEndtime().hashCode());
        result = prime * result + ((getCancelId() == null) ? 0 : getCancelId().hashCode());
        result = prime * result + ((getCancelName() == null) ? 0 : getCancelName().hashCode());
        result = prime * result + ((getCanceltime() == null) ? 0 : getCanceltime().hashCode());
        result = prime * result + ((getCancelresult() == null) ? 0 : getCancelresult().hashCode());
        result = prime * result + ((getConstructionplanId() == null) ? 0 : getConstructionplanId().hashCode());
        result = prime * result + ((getDeletemark() == null) ? 0 : getDeletemark().hashCode());
        result = prime * result + ((getDays() == null) ? 0 : getDays().hashCode());
        result = prime * result + ((getTaskid() == null) ? 0 : getTaskid().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getAuditusername() == null) ? 0 : getAuditusername().hashCode());
        result = prime * result + ((getAuditworkcode() == null) ? 0 : getAuditworkcode().hashCode());
        result = prime * result + ((getAuditresult() == null) ? 0 : getAuditresult().hashCode());
        result = prime * result + ((getAuditcontext() == null) ? 0 : getAuditcontext().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", cancelplanid=").append(cancelplanid);
        sb.append(", starttime=").append(starttime);
        sb.append(", endtime=").append(endtime);
        sb.append(", cancelId=").append(cancelId);
        sb.append(", cancelName=").append(cancelName);
        sb.append(", canceltime=").append(canceltime);
        sb.append(", cancelresult=").append(cancelresult);
        sb.append(", constructionplanId=").append(constructionplanId);
        sb.append(", deletemark=").append(deletemark);
        sb.append(", days=").append(days);
        sb.append(", taskid=").append(taskid);
        sb.append(", status=").append(status);
        sb.append(", auditusername=").append(auditusername);
        sb.append(", auditworkcode=").append(auditworkcode);
        sb.append(", auditresult=").append(auditresult);
        sb.append(", auditcontext=").append(auditcontext);
        sb.append("]");
        return sb.toString();
    }
}