package com.ywl.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * 
 * @TableName gspw_load_device_type
 */
@TableName(value ="gspw_load_device_type")
@Data
public class GspwLoadDeviceType {
    /**
     * 
     */
    @TableId(value = "devicetype_id", type = IdType.AUTO)
    private Integer devicetypeId;

    /**
     * 设备类型名称
     */
    @TableField(value = "devicetype_name")
    private String devicetypeName;

    /**
     * 0表示删除 1表示未删除
     */
    @TableField(value = "delete_mark")
    private Integer deleteMark;

    /**
     * 0表示 小型设备 1表示大型设备
     */
    @TableField(value = "device_state")
    private Integer deviceState;

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
        GspwLoadDeviceType other = (GspwLoadDeviceType) that;
        return (this.getDevicetypeId() == null ? other.getDevicetypeId() == null : this.getDevicetypeId().equals(other.getDevicetypeId()))
            && (this.getDevicetypeName() == null ? other.getDevicetypeName() == null : this.getDevicetypeName().equals(other.getDevicetypeName()))
            && (this.getDeleteMark() == null ? other.getDeleteMark() == null : this.getDeleteMark().equals(other.getDeleteMark()))
            && (this.getDeviceState() == null ? other.getDeviceState() == null : this.getDeviceState().equals(other.getDeviceState()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getDevicetypeId() == null) ? 0 : getDevicetypeId().hashCode());
        result = prime * result + ((getDevicetypeName() == null) ? 0 : getDevicetypeName().hashCode());
        result = prime * result + ((getDeleteMark() == null) ? 0 : getDeleteMark().hashCode());
        result = prime * result + ((getDeviceState() == null) ? 0 : getDeviceState().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", devicetypeId=").append(devicetypeId);
        sb.append(", devicetypeName=").append(devicetypeName);
        sb.append(", deleteMark=").append(deleteMark);
        sb.append(", deviceState=").append(deviceState);
        sb.append("]");
        return sb.toString();
    }
}