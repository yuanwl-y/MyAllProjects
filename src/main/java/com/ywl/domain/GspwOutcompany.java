package com.ywl.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;

/**
 * 
 * @TableName gspw_outcompany
 */
@TableName(value ="gspw_outcompany")
@Data
public class GspwOutcompany implements Serializable {
    /**
     * 
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 
     */
    @TableField(value = "loaded_photo_url")
    private String loadedPhotoUrl;

    /**
     * 
     */
    @TableField(value = "safety_photo_url")
    private String safetyPhotoUrl;

    /**
     * 
     */
    @TableField(value = "qualifications_photh_url")
    private String qualificationsPhothUrl;

    /**
     * 外包单位名称
     */
    @TableField(value = "companyName")
    private String companyname;

    /**
     * 所属单位
     */
    @TableField(value = "subCompany")
    private String subcompany;

    /**
     * 
     */
    @TableField(value = "legal_person")
    private String legalPerson;

    /**
     * 
     */
    @TableField(value = "license_photo_url")
    private String licensePhotoUrl;

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
        GspwOutcompany other = (GspwOutcompany) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getLoadedPhotoUrl() == null ? other.getLoadedPhotoUrl() == null : this.getLoadedPhotoUrl().equals(other.getLoadedPhotoUrl()))
            && (this.getSafetyPhotoUrl() == null ? other.getSafetyPhotoUrl() == null : this.getSafetyPhotoUrl().equals(other.getSafetyPhotoUrl()))
            && (this.getQualificationsPhothUrl() == null ? other.getQualificationsPhothUrl() == null : this.getQualificationsPhothUrl().equals(other.getQualificationsPhothUrl()))
            && (this.getCompanyname() == null ? other.getCompanyname() == null : this.getCompanyname().equals(other.getCompanyname()))
            && (this.getSubcompany() == null ? other.getSubcompany() == null : this.getSubcompany().equals(other.getSubcompany()))
            && (this.getLegalPerson() == null ? other.getLegalPerson() == null : this.getLegalPerson().equals(other.getLegalPerson()))
            && (this.getLicensePhotoUrl() == null ? other.getLicensePhotoUrl() == null : this.getLicensePhotoUrl().equals(other.getLicensePhotoUrl()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getLoadedPhotoUrl() == null) ? 0 : getLoadedPhotoUrl().hashCode());
        result = prime * result + ((getSafetyPhotoUrl() == null) ? 0 : getSafetyPhotoUrl().hashCode());
        result = prime * result + ((getQualificationsPhothUrl() == null) ? 0 : getQualificationsPhothUrl().hashCode());
        result = prime * result + ((getCompanyname() == null) ? 0 : getCompanyname().hashCode());
        result = prime * result + ((getSubcompany() == null) ? 0 : getSubcompany().hashCode());
        result = prime * result + ((getLegalPerson() == null) ? 0 : getLegalPerson().hashCode());
        result = prime * result + ((getLicensePhotoUrl() == null) ? 0 : getLicensePhotoUrl().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", loadedPhotoUrl=").append(loadedPhotoUrl);
        sb.append(", safetyPhotoUrl=").append(safetyPhotoUrl);
        sb.append(", qualificationsPhothUrl=").append(qualificationsPhothUrl);
        sb.append(", companyname=").append(companyname);
        sb.append(", subcompany=").append(subcompany);
        sb.append(", legalPerson=").append(legalPerson);
        sb.append(", licensePhotoUrl=").append(licensePhotoUrl);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}