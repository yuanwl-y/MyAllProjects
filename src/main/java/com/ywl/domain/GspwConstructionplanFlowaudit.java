package com.ywl.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * 施工计划审核表
 * @TableName gspw_constructionplan_flowaudit
 */
@TableName(value ="gspw_constructionplan_flowaudit")
@Data
public class GspwConstructionplanFlowaudit implements Serializable {
    /**
     * 主键
     */
    @TableId(value = "constructionPlan_flowaudit_id", type = IdType.AUTO)
    private Integer constructionplanFlowauditId;

    /**
     * 审核任务id
     */
    @TableField(value = "constructionPlan_id")
    private Integer constructionplanId;

    /**
     * 审核人姓名
     */
    @TableField(value = "user_name")
    private String userName;

    /**
     * 审核人部门编码
     */
    @TableField(value = "user_deptCode")
    private String userDeptcode;

    /**
     * 审核人部门
     */
    @TableField(value = "user_dept")
    private String userDept;

    /**
     * 审核人工号
     */
    @TableField(value = "user_workCode")
    private String userWorkcode;

    /**
     * 审核单位编码
     */
    @TableField(value = "user_orgCode")
    private String userOrgcode;

    /**
     * 审核单位
     */
    @TableField(value = "user_org")
    private String userOrg;

    /**
     * 审核时间
     */
    @TableField(value = "constructionPlan_flowaudit_date")
    private LocalDateTime constructionplanFlowauditDate;

    /**
     * 审核意见
     */
    @TableField(value = "constructionPlan_flowaudit_context")
    private String constructionplanFlowauditContext;

    /**
     * 审核结果
     */
    @TableField(value = "constructionPlan_flowaudit_result")
    private String constructionplanFlowauditResult;

    /**
     * 任务id
     */
    @TableField(value = "taskid")
    private String taskid;

    /**
     * 删除标记(1 已删除)
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
        GspwConstructionplanFlowaudit other = (GspwConstructionplanFlowaudit) that;
        return (this.getConstructionplanFlowauditId() == null ? other.getConstructionplanFlowauditId() == null : this.getConstructionplanFlowauditId().equals(other.getConstructionplanFlowauditId()))
            && (this.getConstructionplanId() == null ? other.getConstructionplanId() == null : this.getConstructionplanId().equals(other.getConstructionplanId()))
            && (this.getUserName() == null ? other.getUserName() == null : this.getUserName().equals(other.getUserName()))
            && (this.getUserDeptcode() == null ? other.getUserDeptcode() == null : this.getUserDeptcode().equals(other.getUserDeptcode()))
            && (this.getUserDept() == null ? other.getUserDept() == null : this.getUserDept().equals(other.getUserDept()))
            && (this.getUserWorkcode() == null ? other.getUserWorkcode() == null : this.getUserWorkcode().equals(other.getUserWorkcode()))
            && (this.getUserOrgcode() == null ? other.getUserOrgcode() == null : this.getUserOrgcode().equals(other.getUserOrgcode()))
            && (this.getUserOrg() == null ? other.getUserOrg() == null : this.getUserOrg().equals(other.getUserOrg()))
            && (this.getConstructionplanFlowauditDate() == null ? other.getConstructionplanFlowauditDate() == null : this.getConstructionplanFlowauditDate().equals(other.getConstructionplanFlowauditDate()))
            && (this.getConstructionplanFlowauditContext() == null ? other.getConstructionplanFlowauditContext() == null : this.getConstructionplanFlowauditContext().equals(other.getConstructionplanFlowauditContext()))
            && (this.getConstructionplanFlowauditResult() == null ? other.getConstructionplanFlowauditResult() == null : this.getConstructionplanFlowauditResult().equals(other.getConstructionplanFlowauditResult()))
            && (this.getTaskid() == null ? other.getTaskid() == null : this.getTaskid().equals(other.getTaskid()))
            && (this.getDeletemark() == null ? other.getDeletemark() == null : this.getDeletemark().equals(other.getDeletemark()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getConstructionplanFlowauditId() == null) ? 0 : getConstructionplanFlowauditId().hashCode());
        result = prime * result + ((getConstructionplanId() == null) ? 0 : getConstructionplanId().hashCode());
        result = prime * result + ((getUserName() == null) ? 0 : getUserName().hashCode());
        result = prime * result + ((getUserDeptcode() == null) ? 0 : getUserDeptcode().hashCode());
        result = prime * result + ((getUserDept() == null) ? 0 : getUserDept().hashCode());
        result = prime * result + ((getUserWorkcode() == null) ? 0 : getUserWorkcode().hashCode());
        result = prime * result + ((getUserOrgcode() == null) ? 0 : getUserOrgcode().hashCode());
        result = prime * result + ((getUserOrg() == null) ? 0 : getUserOrg().hashCode());
        result = prime * result + ((getConstructionplanFlowauditDate() == null) ? 0 : getConstructionplanFlowauditDate().hashCode());
        result = prime * result + ((getConstructionplanFlowauditContext() == null) ? 0 : getConstructionplanFlowauditContext().hashCode());
        result = prime * result + ((getConstructionplanFlowauditResult() == null) ? 0 : getConstructionplanFlowauditResult().hashCode());
        result = prime * result + ((getTaskid() == null) ? 0 : getTaskid().hashCode());
        result = prime * result + ((getDeletemark() == null) ? 0 : getDeletemark().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", constructionplanFlowauditId=").append(constructionplanFlowauditId);
        sb.append(", constructionplanId=").append(constructionplanId);
        sb.append(", userName=").append(userName);
        sb.append(", userDeptcode=").append(userDeptcode);
        sb.append(", userDept=").append(userDept);
        sb.append(", userWorkcode=").append(userWorkcode);
        sb.append(", userOrgcode=").append(userOrgcode);
        sb.append(", userOrg=").append(userOrg);
        sb.append(", constructionplanFlowauditDate=").append(constructionplanFlowauditDate);
        sb.append(", constructionplanFlowauditContext=").append(constructionplanFlowauditContext);
        sb.append(", constructionplanFlowauditResult=").append(constructionplanFlowauditResult);
        sb.append(", taskid=").append(taskid);
        sb.append(", deletemark=").append(deletemark);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}