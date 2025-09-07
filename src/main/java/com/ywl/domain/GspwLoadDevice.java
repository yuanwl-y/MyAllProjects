package com.ywl.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;

/**
 * 承载力分析_设备详情表
 * @TableName gspw_load_device
 */
@TableName(value ="gspw_load_device")
@Data
public class GspwLoadDevice implements Serializable {
    /**
     * 主键
     */
    @TableId(value = "device_id", type = IdType.AUTO)
    private Integer deviceId;

    /**
     * 评分详情id
     */
    @TableField(value = "device_score_id")
    private Integer deviceScoreId;

    /**
     * 设备类型id
     */
    @TableField(value = "device_type_id")
    private Integer deviceTypeId;

    /**
     * 设备名称
     */
    @TableField(value = "device_name")
    private String deviceName;

    /**
     * 用途
     */
    @TableField(value = "device_purpose")
    private String devicePurpose;

    /**
     * 必备数量
     */
    @TableField(value = "device_no")
    private String deviceNo;

    /**
     * 实际数量
     */
    @TableField(value = "device_final_no")
    private String deviceFinalNo;

    /**
     * 备注
     */
    @TableField(value = "device_context")
    private String deviceContext;

    /**
     * 图片url集合
     */
    @TableField(value = "device_url")
    private String deviceUrl;

    /**
     * 分数
     */
    @TableField(value = "device_grade")
    private String deviceGrade;

    /**
     * 设备类型0小类1大类
     */
    @TableField(value = "delete_mark")
    private Integer deleteMark;

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
        GspwLoadDevice other = (GspwLoadDevice) that;
        return (this.getDeviceId() == null ? other.getDeviceId() == null : this.getDeviceId().equals(other.getDeviceId()))
            && (this.getDeviceScoreId() == null ? other.getDeviceScoreId() == null : this.getDeviceScoreId().equals(other.getDeviceScoreId()))
            && (this.getDeviceTypeId() == null ? other.getDeviceTypeId() == null : this.getDeviceTypeId().equals(other.getDeviceTypeId()))
            && (this.getDeviceName() == null ? other.getDeviceName() == null : this.getDeviceName().equals(other.getDeviceName()))
            && (this.getDevicePurpose() == null ? other.getDevicePurpose() == null : this.getDevicePurpose().equals(other.getDevicePurpose()))
            && (this.getDeviceNo() == null ? other.getDeviceNo() == null : this.getDeviceNo().equals(other.getDeviceNo()))
            && (this.getDeviceFinalNo() == null ? other.getDeviceFinalNo() == null : this.getDeviceFinalNo().equals(other.getDeviceFinalNo()))
            && (this.getDeviceContext() == null ? other.getDeviceContext() == null : this.getDeviceContext().equals(other.getDeviceContext()))
            && (this.getDeviceUrl() == null ? other.getDeviceUrl() == null : this.getDeviceUrl().equals(other.getDeviceUrl()))
            && (this.getDeviceGrade() == null ? other.getDeviceGrade() == null : this.getDeviceGrade().equals(other.getDeviceGrade()))
            && (this.getDeleteMark() == null ? other.getDeleteMark() == null : this.getDeleteMark().equals(other.getDeleteMark()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getDeviceId() == null) ? 0 : getDeviceId().hashCode());
        result = prime * result + ((getDeviceScoreId() == null) ? 0 : getDeviceScoreId().hashCode());
        result = prime * result + ((getDeviceTypeId() == null) ? 0 : getDeviceTypeId().hashCode());
        result = prime * result + ((getDeviceName() == null) ? 0 : getDeviceName().hashCode());
        result = prime * result + ((getDevicePurpose() == null) ? 0 : getDevicePurpose().hashCode());
        result = prime * result + ((getDeviceNo() == null) ? 0 : getDeviceNo().hashCode());
        result = prime * result + ((getDeviceFinalNo() == null) ? 0 : getDeviceFinalNo().hashCode());
        result = prime * result + ((getDeviceContext() == null) ? 0 : getDeviceContext().hashCode());
        result = prime * result + ((getDeviceUrl() == null) ? 0 : getDeviceUrl().hashCode());
        result = prime * result + ((getDeviceGrade() == null) ? 0 : getDeviceGrade().hashCode());
        result = prime * result + ((getDeleteMark() == null) ? 0 : getDeleteMark().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", deviceId=").append(deviceId);
        sb.append(", deviceScoreId=").append(deviceScoreId);
        sb.append(", deviceTypeId=").append(deviceTypeId);
        sb.append(", deviceName=").append(deviceName);
        sb.append(", devicePurpose=").append(devicePurpose);
        sb.append(", deviceNo=").append(deviceNo);
        sb.append(", deviceFinalNo=").append(deviceFinalNo);
        sb.append(", deviceContext=").append(deviceContext);
        sb.append(", deviceUrl=").append(deviceUrl);
        sb.append(", deviceGrade=").append(deviceGrade);
        sb.append(", deleteMark=").append(deleteMark);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}