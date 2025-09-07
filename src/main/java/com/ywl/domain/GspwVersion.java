package com.ywl.domain;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;

/**
 * 版本表
 * @TableName gspw_version
 */
@TableName(value ="gspw_version")
@Data
public class GspwVersion implements Serializable {
    /**
     * 主键
     */
    @TableId(value = "version_id")
    private Integer versionId;

    /**
     * 版本号
     */
    @TableField(value = "version_no")
    private String versionNo;

    /**
     * 版本名
     */
    @TableField(value = "version_name")
    private String versionName;

    /**
     * 是否强制更新（0:不强制  1:强制）
     */
    @TableField(value = "version_force")
    private Integer versionForce;

    /**
     * 更新内容
     */
    @TableField(value = "version_context")
    private String versionContext;

    /**
     * 下载路径
     */
    @TableField(value = "version_url")
    private String versionUrl;

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
        GspwVersion other = (GspwVersion) that;
        return (this.getVersionId() == null ? other.getVersionId() == null : this.getVersionId().equals(other.getVersionId()))
            && (this.getVersionNo() == null ? other.getVersionNo() == null : this.getVersionNo().equals(other.getVersionNo()))
            && (this.getVersionName() == null ? other.getVersionName() == null : this.getVersionName().equals(other.getVersionName()))
            && (this.getVersionForce() == null ? other.getVersionForce() == null : this.getVersionForce().equals(other.getVersionForce()))
            && (this.getVersionContext() == null ? other.getVersionContext() == null : this.getVersionContext().equals(other.getVersionContext()))
            && (this.getVersionUrl() == null ? other.getVersionUrl() == null : this.getVersionUrl().equals(other.getVersionUrl()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getVersionId() == null) ? 0 : getVersionId().hashCode());
        result = prime * result + ((getVersionNo() == null) ? 0 : getVersionNo().hashCode());
        result = prime * result + ((getVersionName() == null) ? 0 : getVersionName().hashCode());
        result = prime * result + ((getVersionForce() == null) ? 0 : getVersionForce().hashCode());
        result = prime * result + ((getVersionContext() == null) ? 0 : getVersionContext().hashCode());
        result = prime * result + ((getVersionUrl() == null) ? 0 : getVersionUrl().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", versionId=").append(versionId);
        sb.append(", versionNo=").append(versionNo);
        sb.append(", versionName=").append(versionName);
        sb.append(", versionForce=").append(versionForce);
        sb.append(", versionContext=").append(versionContext);
        sb.append(", versionUrl=").append(versionUrl);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}