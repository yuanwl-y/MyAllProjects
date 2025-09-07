package com.ywl.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * 
 * @TableName gspw_result_summary
 */
@TableName(value ="gspw_result_summary")
@Data
public class GspwResultSummary {
    /**
     * 主键
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 单位名称
     */
    @TableField(value = "org_name")
    private String orgName;

    /**
     * 单位编码
     */
    @TableField(value = "org_code")
    private String orgCode;

    /**
     * 考核结果
     */
    @TableField(value = "result")
    private String result;

    /**
     * 发布事件
     */
    @TableField(value = "release_time")
    private String releaseTime;

    /**
     * 发布人名字
     */
    @TableField(value = "user_name")
    private String userName;

    /**
     * 发布人工号
     */
    @TableField(value = "user_workcode")
    private String userWorkcode;

    /**
     * 总成绩
     */
    @TableField(value = "total_score")
    private Integer totalScore;

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
        GspwResultSummary other = (GspwResultSummary) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getOrgName() == null ? other.getOrgName() == null : this.getOrgName().equals(other.getOrgName()))
            && (this.getOrgCode() == null ? other.getOrgCode() == null : this.getOrgCode().equals(other.getOrgCode()))
            && (this.getResult() == null ? other.getResult() == null : this.getResult().equals(other.getResult()))
            && (this.getReleaseTime() == null ? other.getReleaseTime() == null : this.getReleaseTime().equals(other.getReleaseTime()))
            && (this.getUserName() == null ? other.getUserName() == null : this.getUserName().equals(other.getUserName()))
            && (this.getUserWorkcode() == null ? other.getUserWorkcode() == null : this.getUserWorkcode().equals(other.getUserWorkcode()))
            && (this.getTotalScore() == null ? other.getTotalScore() == null : this.getTotalScore().equals(other.getTotalScore()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getOrgName() == null) ? 0 : getOrgName().hashCode());
        result = prime * result + ((getOrgCode() == null) ? 0 : getOrgCode().hashCode());
        result = prime * result + ((getResult() == null) ? 0 : getResult().hashCode());
        result = prime * result + ((getReleaseTime() == null) ? 0 : getReleaseTime().hashCode());
        result = prime * result + ((getUserName() == null) ? 0 : getUserName().hashCode());
        result = prime * result + ((getUserWorkcode() == null) ? 0 : getUserWorkcode().hashCode());
        result = prime * result + ((getTotalScore() == null) ? 0 : getTotalScore().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", orgName=").append(orgName);
        sb.append(", orgCode=").append(orgCode);
        sb.append(", result=").append(result);
        sb.append(", releaseTime=").append(releaseTime);
        sb.append(", userName=").append(userName);
        sb.append(", userWorkcode=").append(userWorkcode);
        sb.append(", totalScore=").append(totalScore);
        sb.append("]");
        return sb.toString();
    }
}