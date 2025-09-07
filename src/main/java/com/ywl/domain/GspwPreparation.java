package com.ywl.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * 施工计划签到前需要的施工蓝图，安全接地，安全交底，工作票照片路径
 * @TableName gspw_preparation
 */
@TableName(value ="gspw_preparation")
@Data
public class GspwPreparation {
    /**
     * 主键id
     */
    @TableId(value = "preparation_id", type = IdType.AUTO)
    private Integer preparationId;

    /**
     * 对应的施工计划id
     */
    @TableField(value = "preparation_constructionPlan_id")
    private Integer preparationConstructionplanId;

    /**
     * 交底
     */
    @TableField(value = "preparation_jiaodi")
    private String preparationJiaodi;

    /**
     * 蓝图
     */
    @TableField(value = "preparation_lantu")
    private String preparationLantu;

    /**
     * 工作票
     */
    @TableField(value = "preparation_piao")
    private String preparationPiao;

    /**
     * 接地
     */
    @TableField(value = "preparation_jiedi")
    private String preparationJiedi;

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
        GspwPreparation other = (GspwPreparation) that;
        return (this.getPreparationId() == null ? other.getPreparationId() == null : this.getPreparationId().equals(other.getPreparationId()))
            && (this.getPreparationConstructionplanId() == null ? other.getPreparationConstructionplanId() == null : this.getPreparationConstructionplanId().equals(other.getPreparationConstructionplanId()))
            && (this.getPreparationJiaodi() == null ? other.getPreparationJiaodi() == null : this.getPreparationJiaodi().equals(other.getPreparationJiaodi()))
            && (this.getPreparationLantu() == null ? other.getPreparationLantu() == null : this.getPreparationLantu().equals(other.getPreparationLantu()))
            && (this.getPreparationPiao() == null ? other.getPreparationPiao() == null : this.getPreparationPiao().equals(other.getPreparationPiao()))
            && (this.getPreparationJiedi() == null ? other.getPreparationJiedi() == null : this.getPreparationJiedi().equals(other.getPreparationJiedi()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getPreparationId() == null) ? 0 : getPreparationId().hashCode());
        result = prime * result + ((getPreparationConstructionplanId() == null) ? 0 : getPreparationConstructionplanId().hashCode());
        result = prime * result + ((getPreparationJiaodi() == null) ? 0 : getPreparationJiaodi().hashCode());
        result = prime * result + ((getPreparationLantu() == null) ? 0 : getPreparationLantu().hashCode());
        result = prime * result + ((getPreparationPiao() == null) ? 0 : getPreparationPiao().hashCode());
        result = prime * result + ((getPreparationJiedi() == null) ? 0 : getPreparationJiedi().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", preparationId=").append(preparationId);
        sb.append(", preparationConstructionplanId=").append(preparationConstructionplanId);
        sb.append(", preparationJiaodi=").append(preparationJiaodi);
        sb.append(", preparationLantu=").append(preparationLantu);
        sb.append(", preparationPiao=").append(preparationPiao);
        sb.append(", preparationJiedi=").append(preparationJiedi);
        sb.append("]");
        return sb.toString();
    }
}