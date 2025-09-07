package com.ywl.domain;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * 单体项目
 * @TableName gspw_monproject
 */
@TableName(value ="gspw_monproject")
@Data
public class GspwMonproject implements Serializable {
    /**
     * 主键
     */
    @TableId(value = "monproject_id")
    private String monprojectId;

    /**
     * 单体项目名称
     */
    @TableField(value = "monproject_name")
    private String monprojectName;

    /**
     * 单体项目编码
     */
    @TableField(value = "monproject_wbs")
    private String monprojectWbs;

    /**
     * 打包wbs编码
     */
    @TableField(value = "project_wbs")
    private String projectWbs;

    /**
     * 投资金额
     */
    @TableField(value = "monproject_investment")
    private String monprojectInvestment;

    /**
     * 单体项目内容
     */
    @TableField(value = "monproject_context")
    private String monprojectContext;

    /**
     * 
     */
    @TableField(value = "monproject_date")
    private LocalDateTime monprojectDate;

    /**
     * 
     */
    @TableField(value = "monproject_flowaudit_userWorkCode")
    private String monprojectFlowauditUserworkcode;

    /**
     * 
     */
    @TableField(value = "monproject_flowaudit_userName")
    private String monprojectFlowauditUsername;

    /**
     * 
     */
    @TableField(value = "monproject_report_userName")
    private String monprojectReportUsername;

    /**
     * 
     */
    @TableField(value = "monproject_report_userWorkCode")
    private String monprojectReportUserworkcode;

    /**
     * 
     */
    @TableField(value = "monproject_isUse")
    private Integer monprojectIsuse;

    /**
     * 
     */
    @TableField(value = "status")
    private String status;

    /**
     * 
     */
    @TableField(value = "taskid")
    private String taskid;

    /**
     * 
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
        GspwMonproject other = (GspwMonproject) that;
        return (this.getMonprojectId() == null ? other.getMonprojectId() == null : this.getMonprojectId().equals(other.getMonprojectId()))
            && (this.getMonprojectName() == null ? other.getMonprojectName() == null : this.getMonprojectName().equals(other.getMonprojectName()))
            && (this.getMonprojectWbs() == null ? other.getMonprojectWbs() == null : this.getMonprojectWbs().equals(other.getMonprojectWbs()))
            && (this.getProjectWbs() == null ? other.getProjectWbs() == null : this.getProjectWbs().equals(other.getProjectWbs()))
            && (this.getMonprojectInvestment() == null ? other.getMonprojectInvestment() == null : this.getMonprojectInvestment().equals(other.getMonprojectInvestment()))
            && (this.getMonprojectContext() == null ? other.getMonprojectContext() == null : this.getMonprojectContext().equals(other.getMonprojectContext()))
            && (this.getMonprojectDate() == null ? other.getMonprojectDate() == null : this.getMonprojectDate().equals(other.getMonprojectDate()))
            && (this.getMonprojectFlowauditUserworkcode() == null ? other.getMonprojectFlowauditUserworkcode() == null : this.getMonprojectFlowauditUserworkcode().equals(other.getMonprojectFlowauditUserworkcode()))
            && (this.getMonprojectFlowauditUsername() == null ? other.getMonprojectFlowauditUsername() == null : this.getMonprojectFlowauditUsername().equals(other.getMonprojectFlowauditUsername()))
            && (this.getMonprojectReportUsername() == null ? other.getMonprojectReportUsername() == null : this.getMonprojectReportUsername().equals(other.getMonprojectReportUsername()))
            && (this.getMonprojectReportUserworkcode() == null ? other.getMonprojectReportUserworkcode() == null : this.getMonprojectReportUserworkcode().equals(other.getMonprojectReportUserworkcode()))
            && (this.getMonprojectIsuse() == null ? other.getMonprojectIsuse() == null : this.getMonprojectIsuse().equals(other.getMonprojectIsuse()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getTaskid() == null ? other.getTaskid() == null : this.getTaskid().equals(other.getTaskid()))
            && (this.getDeletemark() == null ? other.getDeletemark() == null : this.getDeletemark().equals(other.getDeletemark()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getMonprojectId() == null) ? 0 : getMonprojectId().hashCode());
        result = prime * result + ((getMonprojectName() == null) ? 0 : getMonprojectName().hashCode());
        result = prime * result + ((getMonprojectWbs() == null) ? 0 : getMonprojectWbs().hashCode());
        result = prime * result + ((getProjectWbs() == null) ? 0 : getProjectWbs().hashCode());
        result = prime * result + ((getMonprojectInvestment() == null) ? 0 : getMonprojectInvestment().hashCode());
        result = prime * result + ((getMonprojectContext() == null) ? 0 : getMonprojectContext().hashCode());
        result = prime * result + ((getMonprojectDate() == null) ? 0 : getMonprojectDate().hashCode());
        result = prime * result + ((getMonprojectFlowauditUserworkcode() == null) ? 0 : getMonprojectFlowauditUserworkcode().hashCode());
        result = prime * result + ((getMonprojectFlowauditUsername() == null) ? 0 : getMonprojectFlowauditUsername().hashCode());
        result = prime * result + ((getMonprojectReportUsername() == null) ? 0 : getMonprojectReportUsername().hashCode());
        result = prime * result + ((getMonprojectReportUserworkcode() == null) ? 0 : getMonprojectReportUserworkcode().hashCode());
        result = prime * result + ((getMonprojectIsuse() == null) ? 0 : getMonprojectIsuse().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
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
        sb.append(", monprojectId=").append(monprojectId);
        sb.append(", monprojectName=").append(monprojectName);
        sb.append(", monprojectWbs=").append(monprojectWbs);
        sb.append(", projectWbs=").append(projectWbs);
        sb.append(", monprojectInvestment=").append(monprojectInvestment);
        sb.append(", monprojectContext=").append(monprojectContext);
        sb.append(", monprojectDate=").append(monprojectDate);
        sb.append(", monprojectFlowauditUserworkcode=").append(monprojectFlowauditUserworkcode);
        sb.append(", monprojectFlowauditUsername=").append(monprojectFlowauditUsername);
        sb.append(", monprojectReportUsername=").append(monprojectReportUsername);
        sb.append(", monprojectReportUserworkcode=").append(monprojectReportUserworkcode);
        sb.append(", monprojectIsuse=").append(monprojectIsuse);
        sb.append(", status=").append(status);
        sb.append(", taskid=").append(taskid);
        sb.append(", deletemark=").append(deletemark);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}