package com.ywl.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

/**
 * 人员档案表
 * @TableName gspw_archives
 */
@TableName(value ="gspw_archives")
@Data
@ApiModel(description = "人员档案表")
public class GspwArchives implements Serializable {
    /**
     * 主键
     */
    @TableId(value = "archives_id", type = IdType.AUTO)
    @ApiModelProperty(value = "主键")
    private Integer archivesId;

    /**
     * 姓名
     */
    @TableField(value = "archives_name")
    @ApiModelProperty(value = "姓名")
    private String archivesName;

    /**
     * 性别
     */
    @TableField(value = "archives_sex")
    @ApiModelProperty(value = "性别")
    private String archivesSex;

    /**
     * 年龄
     */
    @TableField(value = "archives_age")
    @ApiModelProperty(value = "年龄")
    private String archivesAge;

    /**
     * 所属单位
     */
    @TableField(value = "user_org")
    @ApiModelProperty(value = "所属单位")
    private String userOrg;

    /**
     * 所属单位编码
     */
    @TableField(value = "user_orgCode")
    @ApiModelProperty(value = "所属单位编码")
    private String userOrgcode;

    /**
     * 所属部门
     */
    @TableField(value = "user_dept")
    @ApiModelProperty(value = "所属部门")
    private String userDept;

    /**
     * 所属部门编码
     */
    @TableField(value = "user_deptCode")
    @ApiModelProperty(value = "所属部门编码")
    private String userDeptcode;

    /**
     * 人员类型
     */
    @TableField(value = "user_type")
    @ApiModelProperty(value = "人员类型")
    private String userType;

    /**
     * 证书类型
     */
    @TableField(value = "archives_certificate_type")
    @ApiModelProperty(value = "证书类型")
    private String archivesCertificateType;

    /**
     * 证书编号
     */
    @TableField(value = "archives_certificate_number")
    @ApiModelProperty(value = "证书编号")
    private String archivesCertificateNumber;

    /**
     * 安规考试
     */
    @TableField(value = "archives_test_state")
    @ApiModelProperty(value = "安规考试")
    private String archivesTestState;

    /**
     * 保险购置
     */
    @TableField(value = "archives_insurance_state")
    @ApiModelProperty(value = "保险购置")
    private String archivesInsuranceState;

    /**
     * 体检状态
     */
    @TableField(value = "archives_physical_state")
    @ApiModelProperty(value = "体检状态")
    private String archivesPhysicalState;

    /**
     * 人员状态
     */
    @TableField(value = "archives_state")
    @ApiModelProperty(value = "人员状态")
    private String archivesState;

    /**
     * 照片信息
     */
    @TableField(value = "archives_photo")
    @ApiModelProperty(value = "照片信息")
    private String archivesPhoto;

    /**
     * 照片路径
     */
    @TableField(value = "archives_photo_ur")
    @ApiModelProperty(value = "照片路径")
    private String archivesPhotoUr;

    /**
     * 二维码信息
     */
    @TableField(value = "archives_code")
    @ApiModelProperty(value = "二维码信息")
    private String archivesCode;

    /**
     * 用户工号
     */
    @TableField(value = "user_workCode")
    @ApiModelProperty(value = "用户工号")
    private String userWorkcode;

    /**
     * 删除标记
     */
    @TableField(value = "deleteMark")
    @ApiModelProperty(value = "删除标记")
    private Integer deletemark;

    /**
     * 负责单位
     */
    @TableField(value = "user_place")
    @ApiModelProperty(value = "负责单位")
    private String userPlace;

    /**
     * 负责单位编码
     */
    @TableField(value = "user_placeCode")
    @ApiModelProperty(value = "负责单位编码")
    private String userPlacecode;

    /**
     * 岗位/职务
     */
    @TableField(value = "user_post")
    @ApiModelProperty(value = "岗位/职务")
    private String userPost;

    /**
     * 分包标识（0是，1否）
     */
    @TableField(value = "user_subpackage")
    @ApiModelProperty(value = "分包标识（0是，1否）")
    private String userSubpackage;

    /**
     * 部门/单位
     */
    @TableField(value = "departMentInfo")
    @ApiModelProperty(value = "部门/单位")
    private String departmentinfo;

    /**
     * 市州单位名称
     */
    @TableField(value = "userFirstOrg")
    @ApiModelProperty(value = "市州单位名称")
    private String userfirstorg;

    /**
     * 市州单位编码
     */
    @TableField(value = "userFirstOrgCode")
    @ApiModelProperty(value = "市州单位编码")
    private String userfirstorgcode;

    /**
     * 身份证号
     */
    @TableField(value = "idCard")
    @ApiModelProperty(value = "身份证号")
    private String idcard;

    /**
     * 电话号码
     */
    @TableField(value = "phone")
    @ApiModelProperty(value = "电话号码")
    private String phone;

    /**
     * 是否黑名单
     */
    @TableField(value = "isBlackList")
    @ApiModelProperty(value = "是否黑名单")
    private Integer isblacklist;

    /**
     * 外部公司ID
     */
    @TableField(value = "outCompanyId")
    @ApiModelProperty(value = "外部公司ID")
    private Integer outcompanyid;

    /**
     * 班组id
     */
    @TableField(value = "userTeamId")
    @ApiModelProperty(value = "班组id")
    private Integer userteamid;

    /**
     * 档案创建时间
     */
    @TableField(value = "createtime")
    @ApiModelProperty(value = "档案创建时间")
    private String createtime;

    /**
     * 身份证照片路径
     */
    @TableField(value = "idcard_url")
    @ApiModelProperty(value = "身份证照片路径")
    private String idcardUrl;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;

}
