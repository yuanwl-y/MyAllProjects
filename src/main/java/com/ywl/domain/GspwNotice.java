package com.ywl.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * 
 * @TableName gspw_notice
 */
@TableName(value ="gspw_notice")
@Data
public class GspwNotice {
    /**
     * 
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 文件路径
     */
    @TableField(value = "file_path")
    private String filePath;

    /**
     * 是否案例
     */
    @TableField(value = "is_case")
    private Integer isCase;

    /**
     * 上传人所在县单位名称
     */
    @TableField(value = "user_org")
    private String userOrg;

    /**
     * 上传人所在县单位编码
     */
    @TableField(value = "user_org_code")
    private String userOrgCode;

    /**
     * 上传人工号
     */
    @TableField(value = "user_workcode")
    private String userWorkcode;

    /**
     * 上传人姓名
     */
    @TableField(value = "user_name")
    private String userName;

    /**
     * 文件名
     */
    @TableField(value = "file_name")
    private String fileName;

    /**
     * 删除标记
     */
    @TableField(value = "deletemark")
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
        GspwNotice other = (GspwNotice) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getFilePath() == null ? other.getFilePath() == null : this.getFilePath().equals(other.getFilePath()))
            && (this.getIsCase() == null ? other.getIsCase() == null : this.getIsCase().equals(other.getIsCase()))
            && (this.getUserOrg() == null ? other.getUserOrg() == null : this.getUserOrg().equals(other.getUserOrg()))
            && (this.getUserOrgCode() == null ? other.getUserOrgCode() == null : this.getUserOrgCode().equals(other.getUserOrgCode()))
            && (this.getUserWorkcode() == null ? other.getUserWorkcode() == null : this.getUserWorkcode().equals(other.getUserWorkcode()))
            && (this.getUserName() == null ? other.getUserName() == null : this.getUserName().equals(other.getUserName()))
            && (this.getFileName() == null ? other.getFileName() == null : this.getFileName().equals(other.getFileName()))
            && (this.getDeletemark() == null ? other.getDeletemark() == null : this.getDeletemark().equals(other.getDeletemark()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getFilePath() == null) ? 0 : getFilePath().hashCode());
        result = prime * result + ((getIsCase() == null) ? 0 : getIsCase().hashCode());
        result = prime * result + ((getUserOrg() == null) ? 0 : getUserOrg().hashCode());
        result = prime * result + ((getUserOrgCode() == null) ? 0 : getUserOrgCode().hashCode());
        result = prime * result + ((getUserWorkcode() == null) ? 0 : getUserWorkcode().hashCode());
        result = prime * result + ((getUserName() == null) ? 0 : getUserName().hashCode());
        result = prime * result + ((getFileName() == null) ? 0 : getFileName().hashCode());
        result = prime * result + ((getDeletemark() == null) ? 0 : getDeletemark().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", filePath=").append(filePath);
        sb.append(", isCase=").append(isCase);
        sb.append(", userOrg=").append(userOrg);
        sb.append(", userOrgCode=").append(userOrgCode);
        sb.append(", userWorkcode=").append(userWorkcode);
        sb.append(", userName=").append(userName);
        sb.append(", fileName=").append(fileName);
        sb.append(", deletemark=").append(deletemark);
        sb.append("]");
        return sb.toString();
    }
}