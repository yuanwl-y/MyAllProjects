package com.ywl.domain;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * 施工计划变更 内容表
 * @TableName gspw_planchange_content
 */
@TableName(value ="gspw_planchange_content")
@Data
public class GspwPlanchangeContent implements Serializable {
    /**
     * 
     */
    @TableId(value = "uuid")
    private String uuid;

    /**
     * 审核表主键
     */
    @TableField(value = "constructionplan_id")
    private Integer constructionplanId;

    /**
     * 变更类型（1,变更内容  2，变更人员  3变更日计划时间）
     */
    @TableField(value = "planchange_type")
    private Integer planchangeType;

    /**
     * 变更内容
     */
    @TableField(value = "planchange_content")
    private String planchangeContent;

    /**
     * 变更前的内容
     */
    @TableField(value = "last_content")
    private String lastContent;

    /**
     * 变更原因
     */
    @TableField(value = "reason")
    private String reason;

    /**
     * 创建时间
     */
    @TableField(value = "create_date")
    private LocalDateTime createDate;

    /**
     * 删除标记
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
        GspwPlanchangeContent other = (GspwPlanchangeContent) that;
        return (this.getUuid() == null ? other.getUuid() == null : this.getUuid().equals(other.getUuid()))
            && (this.getConstructionplanId() == null ? other.getConstructionplanId() == null : this.getConstructionplanId().equals(other.getConstructionplanId()))
            && (this.getPlanchangeType() == null ? other.getPlanchangeType() == null : this.getPlanchangeType().equals(other.getPlanchangeType()))
            && (this.getPlanchangeContent() == null ? other.getPlanchangeContent() == null : this.getPlanchangeContent().equals(other.getPlanchangeContent()))
            && (this.getLastContent() == null ? other.getLastContent() == null : this.getLastContent().equals(other.getLastContent()))
            && (this.getReason() == null ? other.getReason() == null : this.getReason().equals(other.getReason()))
            && (this.getCreateDate() == null ? other.getCreateDate() == null : this.getCreateDate().equals(other.getCreateDate()))
            && (this.getDeletemark() == null ? other.getDeletemark() == null : this.getDeletemark().equals(other.getDeletemark()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getUuid() == null) ? 0 : getUuid().hashCode());
        result = prime * result + ((getConstructionplanId() == null) ? 0 : getConstructionplanId().hashCode());
        result = prime * result + ((getPlanchangeType() == null) ? 0 : getPlanchangeType().hashCode());
        result = prime * result + ((getPlanchangeContent() == null) ? 0 : getPlanchangeContent().hashCode());
        result = prime * result + ((getLastContent() == null) ? 0 : getLastContent().hashCode());
        result = prime * result + ((getReason() == null) ? 0 : getReason().hashCode());
        result = prime * result + ((getCreateDate() == null) ? 0 : getCreateDate().hashCode());
        result = prime * result + ((getDeletemark() == null) ? 0 : getDeletemark().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", uuid=").append(uuid);
        sb.append(", constructionplanId=").append(constructionplanId);
        sb.append(", planchangeType=").append(planchangeType);
        sb.append(", planchangeContent=").append(planchangeContent);
        sb.append(", lastContent=").append(lastContent);
        sb.append(", reason=").append(reason);
        sb.append(", createDate=").append(createDate);
        sb.append(", deletemark=").append(deletemark);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}