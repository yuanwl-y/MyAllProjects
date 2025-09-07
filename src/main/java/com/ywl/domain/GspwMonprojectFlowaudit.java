package com.ywl.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.time.LocalDateTime;
import lombok.Data;

/**
 * 单体项目审核表
 * @TableName gspw_monproject_flowaudit
 */
@TableName(value ="gspw_monproject_flowaudit")
@Data
public class GspwMonprojectFlowaudit {
    /**
     * uuid
     */
    @TableId(value = "monproject_flowaudit_id")
    private String monprojectFlowauditId;

    /**
     * 单体项目主键
     */
    @TableField(value = "monproject_id")
    private String monprojectId;

    /**
     * 审核人姓名
     */
    @TableField(value = "user_name")
    private String userName;

    /**
     * 审核人单位编码
     */
    @TableField(value = "user_deptCode")
    private String userDeptcode;

    /**
     * 审核人部门
     */
    @TableField(value = "user_dept")
    private String userDept;

    /**
     * 审核工号
     */
    @TableField(value = "user_workCode")
    private String userWorkcode;

    /**
     * 审核人单位编码
     */
    @TableField(value = "user_orgCode")
    private String userOrgcode;

    /**
     * 审核人单位
     */
    @TableField(value = "user_org")
    private String userOrg;

    /**
     * 审核时间
     */
    @TableField(value = "monproject_flowaudit_date")
    private LocalDateTime monprojectFlowauditDate;

    /**
     * 审核内容
     */
    @TableField(value = "monproject_flowaudit_context")
    private String monprojectFlowauditContext;

    /**
     * 审核结果
     */
    @TableField(value = "monproject_flowaudit_result")
    private String monprojectFlowauditResult;

    /**
     * 任务id
     */
    @TableField(value = "taskid")
    private String taskid;

    /**
     * 
     */
    @TableField(value = "deleteMark")
    private Integer deletemark;

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
        GspwMonprojectFlowaudit other = (GspwMonprojectFlowaudit) that;
        return (this.getMonprojectFlowauditId() == null ? other.getMonprojectFlowauditId() == null : this.getMonprojectFlowauditId().equals(other.getMonprojectFlowauditId()))
            && (this.getMonprojectId() == null ? other.getMonprojectId() == null : this.getMonprojectId().equals(other.getMonprojectId()))
            && (this.getUserName() == null ? other.getUserName() == null : this.getUserName().equals(other.getUserName()))
            && (this.getUserDeptcode() == null ? other.getUserDeptcode() == null : this.getUserDeptcode().equals(other.getUserDeptcode()))
            && (this.getUserDept() == null ? other.getUserDept() == null : this.getUserDept().equals(other.getUserDept()))
            && (this.getUserWorkcode() == null ? other.getUserWorkcode() == null : this.getUserWorkcode().equals(other.getUserWorkcode()))
            && (this.getUserOrgcode() == null ? other.getUserOrgcode() == null : this.getUserOrgcode().equals(other.getUserOrgcode()))
            && (this.getUserOrg() == null ? other.getUserOrg() == null : this.getUserOrg().equals(other.getUserOrg()))
            && (this.getMonprojectFlowauditDate() == null ? other.getMonprojectFlowauditDate() == null : this.getMonprojectFlowauditDate().equals(other.getMonprojectFlowauditDate()))
            && (this.getMonprojectFlowauditContext() == null ? other.getMonprojectFlowauditContext() == null : this.getMonprojectFlowauditContext().equals(other.getMonprojectFlowauditContext()))
            && (this.getMonprojectFlowauditResult() == null ? other.getMonprojectFlowauditResult() == null : this.getMonprojectFlowauditResult().equals(other.getMonprojectFlowauditResult()))
            && (this.getTaskid() == null ? other.getTaskid() == null : this.getTaskid().equals(other.getTaskid()))
            && (this.getDeletemark() == null ? other.getDeletemark() == null : this.getDeletemark().equals(other.getDeletemark()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getMonprojectFlowauditId() == null) ? 0 : getMonprojectFlowauditId().hashCode());
        result = prime * result + ((getMonprojectId() == null) ? 0 : getMonprojectId().hashCode());
        result = prime * result + ((getUserName() == null) ? 0 : getUserName().hashCode());
        result = prime * result + ((getUserDeptcode() == null) ? 0 : getUserDeptcode().hashCode());
        result = prime * result + ((getUserDept() == null) ? 0 : getUserDept().hashCode());
        result = prime * result + ((getUserWorkcode() == null) ? 0 : getUserWorkcode().hashCode());
        result = prime * result + ((getUserOrgcode() == null) ? 0 : getUserOrgcode().hashCode());
        result = prime * result + ((getUserOrg() == null) ? 0 : getUserOrg().hashCode());
        result = prime * result + ((getMonprojectFlowauditDate() == null) ? 0 : getMonprojectFlowauditDate().hashCode());
        result = prime * result + ((getMonprojectFlowauditContext() == null) ? 0 : getMonprojectFlowauditContext().hashCode());
        result = prime * result + ((getMonprojectFlowauditResult() == null) ? 0 : getMonprojectFlowauditResult().hashCode());
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
        sb.append(", monprojectFlowauditId=").append(monprojectFlowauditId);
        sb.append(", monprojectId=").append(monprojectId);
        sb.append(", userName=").append(userName);
        sb.append(", userDeptcode=").append(userDeptcode);
        sb.append(", userDept=").append(userDept);
        sb.append(", userWorkcode=").append(userWorkcode);
        sb.append(", userOrgcode=").append(userOrgcode);
        sb.append(", userOrg=").append(userOrg);
        sb.append(", monprojectFlowauditDate=").append(monprojectFlowauditDate);
        sb.append(", monprojectFlowauditContext=").append(monprojectFlowauditContext);
        sb.append(", monprojectFlowauditResult=").append(monprojectFlowauditResult);
        sb.append(", taskid=").append(taskid);
        sb.append(", deletemark=").append(deletemark);
        sb.append("]");
        return sb.toString();
    }
}