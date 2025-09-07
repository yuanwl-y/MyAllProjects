package com.ywl.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * 人员档案表
 * @TableName gspw_archives
 */
@TableName(value ="gspw_archives")
@Data
public class GspwArchives {
    /**
     * 主键
     */
    @TableId(value = "archives_id", type = IdType.AUTO)
    private Integer archivesId;

    /**
     * 姓名
     */
    @TableField(value = "archives_name")
    private String archivesName;

    /**
     * 性别
     */
    @TableField(value = "archives_sex")
    private String archivesSex;

    /**
     * 年龄
     */
    @TableField(value = "archives_age")
    private String archivesAge;

    /**
     * 所属单位
     */
    @TableField(value = "user_org")
    private String userOrg;

    /**
     * 所属单位编码
     */
    @TableField(value = "user_orgCode")
    private String userOrgcode;

    /**
     * 所属部门
     */
    @TableField(value = "user_dept")
    private String userDept;

    /**
     * 所属部门编码
     */
    @TableField(value = "user_deptCode")
    private String userDeptcode;

    /**
     * 人员类型
     */
    @TableField(value = "user_type")
    private String userType;

    /**
     * 证书类型
     */
    @TableField(value = "archives_certificate_type")
    private String archivesCertificateType;

    /**
     * 证书编号
     */
    @TableField(value = "archives_certificate_number")
    private String archivesCertificateNumber;

    /**
     * 安规考试
     */
    @TableField(value = "archives_test_state")
    private String archivesTestState;

    /**
     * 保险购置
     */
    @TableField(value = "archives_insurance_state")
    private String archivesInsuranceState;

    /**
     * 体检状态
     */
    @TableField(value = "archives_physical_state")
    private String archivesPhysicalState;

    /**
     * 人员状态
     */
    @TableField(value = "archives_state")
    private String archivesState;

    /**
     * 照片信息
     */
    @TableField(value = "archives_photo")
    private String archivesPhoto;

    /**
     * 照片路径
     */
    @TableField(value = "archives_photo_ur")
    private String archivesPhotoUr;

    /**
     * 二维码信息
     */
    @TableField(value = "archives_code")
    private String archivesCode;

    /**
     * 用户工号
     */
    @TableField(value = "user_workCode")
    private String userWorkcode;

    /**
     * 删除标记
     */
    @TableField(value = "deleteMark")
    private Integer deletemark;

    /**
     * 负责单位
     */
    @TableField(value = "user_place")
    private String userPlace;

    /**
     * 负责单位编码
     */
    @TableField(value = "user_placeCode")
    private String userPlacecode;

    /**
     * 岗位/职务
     */
    @TableField(value = "user_post")
    private String userPost;

    /**
     * 分包标识（0是，1否）
     */
    @TableField(value = "user_subpackage")
    private String userSubpackage;

    /**
     * 部门/单位
     */
    @TableField(value = "departMentInfo")
    private String departmentinfo;

    /**
     * 市州单位名称
     */
    @TableField(value = "userFirstOrg")
    private String userfirstorg;

    /**
     * 市州单位编码
     */
    @TableField(value = "userFirstOrgCode")
    private String userfirstorgcode;

    /**
     * 
     */
    @TableField(value = "idCard")
    private String idcard;

    /**
     * 
     */
    @TableField(value = "phone")
    private String phone;

    /**
     * 
     */
    @TableField(value = "isBlackList")
    private Integer isblacklist;

    /**
     * 
     */
    @TableField(value = "outCompanyId")
    private Integer outcompanyid;

    /**
     * 班组id
     */
    @TableField(value = "userTeamId")
    private Integer userteamid;

    /**
     * 档案创建时间
     */
    @TableField(value = "createtime")
    private String createtime;

    /**
     * 身份证照片路径
     */
    @TableField(value = "idcard_url")
    private String idcardUrl;

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
        GspwArchives other = (GspwArchives) that;
        return (this.getArchivesId() == null ? other.getArchivesId() == null : this.getArchivesId().equals(other.getArchivesId()))
            && (this.getArchivesName() == null ? other.getArchivesName() == null : this.getArchivesName().equals(other.getArchivesName()))
            && (this.getArchivesSex() == null ? other.getArchivesSex() == null : this.getArchivesSex().equals(other.getArchivesSex()))
            && (this.getArchivesAge() == null ? other.getArchivesAge() == null : this.getArchivesAge().equals(other.getArchivesAge()))
            && (this.getUserOrg() == null ? other.getUserOrg() == null : this.getUserOrg().equals(other.getUserOrg()))
            && (this.getUserOrgcode() == null ? other.getUserOrgcode() == null : this.getUserOrgcode().equals(other.getUserOrgcode()))
            && (this.getUserDept() == null ? other.getUserDept() == null : this.getUserDept().equals(other.getUserDept()))
            && (this.getUserDeptcode() == null ? other.getUserDeptcode() == null : this.getUserDeptcode().equals(other.getUserDeptcode()))
            && (this.getUserType() == null ? other.getUserType() == null : this.getUserType().equals(other.getUserType()))
            && (this.getArchivesCertificateType() == null ? other.getArchivesCertificateType() == null : this.getArchivesCertificateType().equals(other.getArchivesCertificateType()))
            && (this.getArchivesCertificateNumber() == null ? other.getArchivesCertificateNumber() == null : this.getArchivesCertificateNumber().equals(other.getArchivesCertificateNumber()))
            && (this.getArchivesTestState() == null ? other.getArchivesTestState() == null : this.getArchivesTestState().equals(other.getArchivesTestState()))
            && (this.getArchivesInsuranceState() == null ? other.getArchivesInsuranceState() == null : this.getArchivesInsuranceState().equals(other.getArchivesInsuranceState()))
            && (this.getArchivesPhysicalState() == null ? other.getArchivesPhysicalState() == null : this.getArchivesPhysicalState().equals(other.getArchivesPhysicalState()))
            && (this.getArchivesState() == null ? other.getArchivesState() == null : this.getArchivesState().equals(other.getArchivesState()))
            && (this.getArchivesPhoto() == null ? other.getArchivesPhoto() == null : this.getArchivesPhoto().equals(other.getArchivesPhoto()))
            && (this.getArchivesPhotoUr() == null ? other.getArchivesPhotoUr() == null : this.getArchivesPhotoUr().equals(other.getArchivesPhotoUr()))
            && (this.getArchivesCode() == null ? other.getArchivesCode() == null : this.getArchivesCode().equals(other.getArchivesCode()))
            && (this.getUserWorkcode() == null ? other.getUserWorkcode() == null : this.getUserWorkcode().equals(other.getUserWorkcode()))
            && (this.getDeletemark() == null ? other.getDeletemark() == null : this.getDeletemark().equals(other.getDeletemark()))
            && (this.getUserPlace() == null ? other.getUserPlace() == null : this.getUserPlace().equals(other.getUserPlace()))
            && (this.getUserPlacecode() == null ? other.getUserPlacecode() == null : this.getUserPlacecode().equals(other.getUserPlacecode()))
            && (this.getUserPost() == null ? other.getUserPost() == null : this.getUserPost().equals(other.getUserPost()))
            && (this.getUserSubpackage() == null ? other.getUserSubpackage() == null : this.getUserSubpackage().equals(other.getUserSubpackage()))
            && (this.getDepartmentinfo() == null ? other.getDepartmentinfo() == null : this.getDepartmentinfo().equals(other.getDepartmentinfo()))
            && (this.getUserfirstorg() == null ? other.getUserfirstorg() == null : this.getUserfirstorg().equals(other.getUserfirstorg()))
            && (this.getUserfirstorgcode() == null ? other.getUserfirstorgcode() == null : this.getUserfirstorgcode().equals(other.getUserfirstorgcode()))
            && (this.getIdcard() == null ? other.getIdcard() == null : this.getIdcard().equals(other.getIdcard()))
            && (this.getPhone() == null ? other.getPhone() == null : this.getPhone().equals(other.getPhone()))
            && (this.getIsblacklist() == null ? other.getIsblacklist() == null : this.getIsblacklist().equals(other.getIsblacklist()))
            && (this.getOutcompanyid() == null ? other.getOutcompanyid() == null : this.getOutcompanyid().equals(other.getOutcompanyid()))
            && (this.getUserteamid() == null ? other.getUserteamid() == null : this.getUserteamid().equals(other.getUserteamid()))
            && (this.getCreatetime() == null ? other.getCreatetime() == null : this.getCreatetime().equals(other.getCreatetime()))
            && (this.getIdcardUrl() == null ? other.getIdcardUrl() == null : this.getIdcardUrl().equals(other.getIdcardUrl()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getArchivesId() == null) ? 0 : getArchivesId().hashCode());
        result = prime * result + ((getArchivesName() == null) ? 0 : getArchivesName().hashCode());
        result = prime * result + ((getArchivesSex() == null) ? 0 : getArchivesSex().hashCode());
        result = prime * result + ((getArchivesAge() == null) ? 0 : getArchivesAge().hashCode());
        result = prime * result + ((getUserOrg() == null) ? 0 : getUserOrg().hashCode());
        result = prime * result + ((getUserOrgcode() == null) ? 0 : getUserOrgcode().hashCode());
        result = prime * result + ((getUserDept() == null) ? 0 : getUserDept().hashCode());
        result = prime * result + ((getUserDeptcode() == null) ? 0 : getUserDeptcode().hashCode());
        result = prime * result + ((getUserType() == null) ? 0 : getUserType().hashCode());
        result = prime * result + ((getArchivesCertificateType() == null) ? 0 : getArchivesCertificateType().hashCode());
        result = prime * result + ((getArchivesCertificateNumber() == null) ? 0 : getArchivesCertificateNumber().hashCode());
        result = prime * result + ((getArchivesTestState() == null) ? 0 : getArchivesTestState().hashCode());
        result = prime * result + ((getArchivesInsuranceState() == null) ? 0 : getArchivesInsuranceState().hashCode());
        result = prime * result + ((getArchivesPhysicalState() == null) ? 0 : getArchivesPhysicalState().hashCode());
        result = prime * result + ((getArchivesState() == null) ? 0 : getArchivesState().hashCode());
        result = prime * result + ((getArchivesPhoto() == null) ? 0 : getArchivesPhoto().hashCode());
        result = prime * result + ((getArchivesPhotoUr() == null) ? 0 : getArchivesPhotoUr().hashCode());
        result = prime * result + ((getArchivesCode() == null) ? 0 : getArchivesCode().hashCode());
        result = prime * result + ((getUserWorkcode() == null) ? 0 : getUserWorkcode().hashCode());
        result = prime * result + ((getDeletemark() == null) ? 0 : getDeletemark().hashCode());
        result = prime * result + ((getUserPlace() == null) ? 0 : getUserPlace().hashCode());
        result = prime * result + ((getUserPlacecode() == null) ? 0 : getUserPlacecode().hashCode());
        result = prime * result + ((getUserPost() == null) ? 0 : getUserPost().hashCode());
        result = prime * result + ((getUserSubpackage() == null) ? 0 : getUserSubpackage().hashCode());
        result = prime * result + ((getDepartmentinfo() == null) ? 0 : getDepartmentinfo().hashCode());
        result = prime * result + ((getUserfirstorg() == null) ? 0 : getUserfirstorg().hashCode());
        result = prime * result + ((getUserfirstorgcode() == null) ? 0 : getUserfirstorgcode().hashCode());
        result = prime * result + ((getIdcard() == null) ? 0 : getIdcard().hashCode());
        result = prime * result + ((getPhone() == null) ? 0 : getPhone().hashCode());
        result = prime * result + ((getIsblacklist() == null) ? 0 : getIsblacklist().hashCode());
        result = prime * result + ((getOutcompanyid() == null) ? 0 : getOutcompanyid().hashCode());
        result = prime * result + ((getUserteamid() == null) ? 0 : getUserteamid().hashCode());
        result = prime * result + ((getCreatetime() == null) ? 0 : getCreatetime().hashCode());
        result = prime * result + ((getIdcardUrl() == null) ? 0 : getIdcardUrl().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", archivesId=").append(archivesId);
        sb.append(", archivesName=").append(archivesName);
        sb.append(", archivesSex=").append(archivesSex);
        sb.append(", archivesAge=").append(archivesAge);
        sb.append(", userOrg=").append(userOrg);
        sb.append(", userOrgcode=").append(userOrgcode);
        sb.append(", userDept=").append(userDept);
        sb.append(", userDeptcode=").append(userDeptcode);
        sb.append(", userType=").append(userType);
        sb.append(", archivesCertificateType=").append(archivesCertificateType);
        sb.append(", archivesCertificateNumber=").append(archivesCertificateNumber);
        sb.append(", archivesTestState=").append(archivesTestState);
        sb.append(", archivesInsuranceState=").append(archivesInsuranceState);
        sb.append(", archivesPhysicalState=").append(archivesPhysicalState);
        sb.append(", archivesState=").append(archivesState);
        sb.append(", archivesPhoto=").append(archivesPhoto);
        sb.append(", archivesPhotoUr=").append(archivesPhotoUr);
        sb.append(", archivesCode=").append(archivesCode);
        sb.append(", userWorkcode=").append(userWorkcode);
        sb.append(", deletemark=").append(deletemark);
        sb.append(", userPlace=").append(userPlace);
        sb.append(", userPlacecode=").append(userPlacecode);
        sb.append(", userPost=").append(userPost);
        sb.append(", userSubpackage=").append(userSubpackage);
        sb.append(", departmentinfo=").append(departmentinfo);
        sb.append(", userfirstorg=").append(userfirstorg);
        sb.append(", userfirstorgcode=").append(userfirstorgcode);
        sb.append(", idcard=").append(idcard);
        sb.append(", phone=").append(phone);
        sb.append(", isblacklist=").append(isblacklist);
        sb.append(", outcompanyid=").append(outcompanyid);
        sb.append(", userteamid=").append(userteamid);
        sb.append(", createtime=").append(createtime);
        sb.append(", idcardUrl=").append(idcardUrl);
        sb.append("]");
        return sb.toString();
    }
}