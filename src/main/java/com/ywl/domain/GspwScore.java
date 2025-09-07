package com.ywl.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * 
 * @TableName gspw_score
 */
@TableName(value ="gspw_score")
@Data
public class GspwScore {
    /**
     * 
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 添加人工号
     */
    @TableField(value = "user_worknumber")
    private String userWorknumber;

    /**
     * 添加人名字
     */
    @TableField(value = "user_name")
    private String userName;

    /**
     * 添加人所属单位名称
     */
    @TableField(value = "org_name")
    private String orgName;

    /**
     * 添加人所属单位编码
     */
    @TableField(value = "org_code")
    private String orgCode;

    /**
     * 项目部建设分数
     */
    @TableField(value = "build_department_grade")
    private Integer buildDepartmentGrade;

    /**
     * 文明施工分数
     */
    @TableField(value = "work_grade")
    private Integer workGrade;

    /**
     * 资金支付分数
     */
    @TableField(value = "pay_grade")
    private Integer payGrade;

    /**
     * 结余物资分数
     */
    @TableField(value = "material_grade")
    private Integer materialGrade;

    /**
     * 废旧物资分数
     */
    @TableField(value = "waste_material_grade")
    private Integer wasteMaterialGrade;

    /**
     * 项目安全分数
     */
    @TableField(value = "project_safe_grade")
    private Integer projectSafeGrade;

    /**
     * 项目质量分数
     */
    @TableField(value = "project_quality_grade")
    private Integer projectQualityGrade;

    /**
     * 项目进度分数
     */
    @TableField(value = "project_progress_grade")
    private Integer projectProgressGrade;

    /**
     * 系统应用分数
     */
    @TableField(value = "system_application_grade")
    private Integer systemApplicationGrade;

    /**
     * 工程量准确性分数
     */
    @TableField(value = "quantity_grade")
    private Integer quantityGrade;

    /**
     * 竣工结算分数
     */
    @TableField(value = "finish_grade")
    private Integer finishGrade;

    /**
     * 资料及时性分数
     */
    @TableField(value = "data_grade")
    private Integer dataGrade;

    /**
     * 企业资质分数
     */
    @TableField(value = "company_grade")
    private Integer companyGrade;

    /**
     * 大型机械分数
     */
    @TableField(value = "engineer_grade")
    private Integer engineerGrade;

    /**
     * 
     */
    @TableField(value = "manager_grade")
    private Integer managerGrade;

    /**
     * 业绩分数
     */
    @TableField(value = "result_grade")
    private Integer resultGrade;

    /**
     * 企业人员分数
     */
    @TableField(value = "person_grade")
    private Integer personGrade;

    /**
     * 企业不良信用记录分数
     */
    @TableField(value = "record_grade")
    private Integer recordGrade;

    /**
     * 项目经理分数
     */
    @TableField(value = "project_manager_grade")
    private Integer projectManagerGrade;

    /**
     * 获奖加分分数
     */
    @TableField(value = "prize_grade")
    private Integer prizeGrade;

    /**
     * 违章事件扣分分数
     */
    @TableField(value = "break_rules_grade")
    private Integer breakRulesGrade;

    /**
     * 违约事件扣分分数
     */
    @TableField(value = "default_grade")
    private Integer defaultGrade;

    /**
     * 失信事件扣分分数
     */
    @TableField(value = "break_promise_grade")
    private Integer breakPromiseGrade;

    /**
     * 发布单位名称
     */
    @TableField(value = "release_org_name")
    private String releaseOrgName;

    /**
     * 发布单位编码
     */
    @TableField(value = "release_org_code")
    private String releaseOrgCode;

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
        GspwScore other = (GspwScore) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getUserWorknumber() == null ? other.getUserWorknumber() == null : this.getUserWorknumber().equals(other.getUserWorknumber()))
            && (this.getUserName() == null ? other.getUserName() == null : this.getUserName().equals(other.getUserName()))
            && (this.getOrgName() == null ? other.getOrgName() == null : this.getOrgName().equals(other.getOrgName()))
            && (this.getOrgCode() == null ? other.getOrgCode() == null : this.getOrgCode().equals(other.getOrgCode()))
            && (this.getBuildDepartmentGrade() == null ? other.getBuildDepartmentGrade() == null : this.getBuildDepartmentGrade().equals(other.getBuildDepartmentGrade()))
            && (this.getWorkGrade() == null ? other.getWorkGrade() == null : this.getWorkGrade().equals(other.getWorkGrade()))
            && (this.getPayGrade() == null ? other.getPayGrade() == null : this.getPayGrade().equals(other.getPayGrade()))
            && (this.getMaterialGrade() == null ? other.getMaterialGrade() == null : this.getMaterialGrade().equals(other.getMaterialGrade()))
            && (this.getWasteMaterialGrade() == null ? other.getWasteMaterialGrade() == null : this.getWasteMaterialGrade().equals(other.getWasteMaterialGrade()))
            && (this.getProjectSafeGrade() == null ? other.getProjectSafeGrade() == null : this.getProjectSafeGrade().equals(other.getProjectSafeGrade()))
            && (this.getProjectQualityGrade() == null ? other.getProjectQualityGrade() == null : this.getProjectQualityGrade().equals(other.getProjectQualityGrade()))
            && (this.getProjectProgressGrade() == null ? other.getProjectProgressGrade() == null : this.getProjectProgressGrade().equals(other.getProjectProgressGrade()))
            && (this.getSystemApplicationGrade() == null ? other.getSystemApplicationGrade() == null : this.getSystemApplicationGrade().equals(other.getSystemApplicationGrade()))
            && (this.getQuantityGrade() == null ? other.getQuantityGrade() == null : this.getQuantityGrade().equals(other.getQuantityGrade()))
            && (this.getFinishGrade() == null ? other.getFinishGrade() == null : this.getFinishGrade().equals(other.getFinishGrade()))
            && (this.getDataGrade() == null ? other.getDataGrade() == null : this.getDataGrade().equals(other.getDataGrade()))
            && (this.getCompanyGrade() == null ? other.getCompanyGrade() == null : this.getCompanyGrade().equals(other.getCompanyGrade()))
            && (this.getEngineerGrade() == null ? other.getEngineerGrade() == null : this.getEngineerGrade().equals(other.getEngineerGrade()))
            && (this.getManagerGrade() == null ? other.getManagerGrade() == null : this.getManagerGrade().equals(other.getManagerGrade()))
            && (this.getResultGrade() == null ? other.getResultGrade() == null : this.getResultGrade().equals(other.getResultGrade()))
            && (this.getPersonGrade() == null ? other.getPersonGrade() == null : this.getPersonGrade().equals(other.getPersonGrade()))
            && (this.getRecordGrade() == null ? other.getRecordGrade() == null : this.getRecordGrade().equals(other.getRecordGrade()))
            && (this.getProjectManagerGrade() == null ? other.getProjectManagerGrade() == null : this.getProjectManagerGrade().equals(other.getProjectManagerGrade()))
            && (this.getPrizeGrade() == null ? other.getPrizeGrade() == null : this.getPrizeGrade().equals(other.getPrizeGrade()))
            && (this.getBreakRulesGrade() == null ? other.getBreakRulesGrade() == null : this.getBreakRulesGrade().equals(other.getBreakRulesGrade()))
            && (this.getDefaultGrade() == null ? other.getDefaultGrade() == null : this.getDefaultGrade().equals(other.getDefaultGrade()))
            && (this.getBreakPromiseGrade() == null ? other.getBreakPromiseGrade() == null : this.getBreakPromiseGrade().equals(other.getBreakPromiseGrade()))
            && (this.getReleaseOrgName() == null ? other.getReleaseOrgName() == null : this.getReleaseOrgName().equals(other.getReleaseOrgName()))
            && (this.getReleaseOrgCode() == null ? other.getReleaseOrgCode() == null : this.getReleaseOrgCode().equals(other.getReleaseOrgCode()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getUserWorknumber() == null) ? 0 : getUserWorknumber().hashCode());
        result = prime * result + ((getUserName() == null) ? 0 : getUserName().hashCode());
        result = prime * result + ((getOrgName() == null) ? 0 : getOrgName().hashCode());
        result = prime * result + ((getOrgCode() == null) ? 0 : getOrgCode().hashCode());
        result = prime * result + ((getBuildDepartmentGrade() == null) ? 0 : getBuildDepartmentGrade().hashCode());
        result = prime * result + ((getWorkGrade() == null) ? 0 : getWorkGrade().hashCode());
        result = prime * result + ((getPayGrade() == null) ? 0 : getPayGrade().hashCode());
        result = prime * result + ((getMaterialGrade() == null) ? 0 : getMaterialGrade().hashCode());
        result = prime * result + ((getWasteMaterialGrade() == null) ? 0 : getWasteMaterialGrade().hashCode());
        result = prime * result + ((getProjectSafeGrade() == null) ? 0 : getProjectSafeGrade().hashCode());
        result = prime * result + ((getProjectQualityGrade() == null) ? 0 : getProjectQualityGrade().hashCode());
        result = prime * result + ((getProjectProgressGrade() == null) ? 0 : getProjectProgressGrade().hashCode());
        result = prime * result + ((getSystemApplicationGrade() == null) ? 0 : getSystemApplicationGrade().hashCode());
        result = prime * result + ((getQuantityGrade() == null) ? 0 : getQuantityGrade().hashCode());
        result = prime * result + ((getFinishGrade() == null) ? 0 : getFinishGrade().hashCode());
        result = prime * result + ((getDataGrade() == null) ? 0 : getDataGrade().hashCode());
        result = prime * result + ((getCompanyGrade() == null) ? 0 : getCompanyGrade().hashCode());
        result = prime * result + ((getEngineerGrade() == null) ? 0 : getEngineerGrade().hashCode());
        result = prime * result + ((getManagerGrade() == null) ? 0 : getManagerGrade().hashCode());
        result = prime * result + ((getResultGrade() == null) ? 0 : getResultGrade().hashCode());
        result = prime * result + ((getPersonGrade() == null) ? 0 : getPersonGrade().hashCode());
        result = prime * result + ((getRecordGrade() == null) ? 0 : getRecordGrade().hashCode());
        result = prime * result + ((getProjectManagerGrade() == null) ? 0 : getProjectManagerGrade().hashCode());
        result = prime * result + ((getPrizeGrade() == null) ? 0 : getPrizeGrade().hashCode());
        result = prime * result + ((getBreakRulesGrade() == null) ? 0 : getBreakRulesGrade().hashCode());
        result = prime * result + ((getDefaultGrade() == null) ? 0 : getDefaultGrade().hashCode());
        result = prime * result + ((getBreakPromiseGrade() == null) ? 0 : getBreakPromiseGrade().hashCode());
        result = prime * result + ((getReleaseOrgName() == null) ? 0 : getReleaseOrgName().hashCode());
        result = prime * result + ((getReleaseOrgCode() == null) ? 0 : getReleaseOrgCode().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", userWorknumber=").append(userWorknumber);
        sb.append(", userName=").append(userName);
        sb.append(", orgName=").append(orgName);
        sb.append(", orgCode=").append(orgCode);
        sb.append(", buildDepartmentGrade=").append(buildDepartmentGrade);
        sb.append(", workGrade=").append(workGrade);
        sb.append(", payGrade=").append(payGrade);
        sb.append(", materialGrade=").append(materialGrade);
        sb.append(", wasteMaterialGrade=").append(wasteMaterialGrade);
        sb.append(", projectSafeGrade=").append(projectSafeGrade);
        sb.append(", projectQualityGrade=").append(projectQualityGrade);
        sb.append(", projectProgressGrade=").append(projectProgressGrade);
        sb.append(", systemApplicationGrade=").append(systemApplicationGrade);
        sb.append(", quantityGrade=").append(quantityGrade);
        sb.append(", finishGrade=").append(finishGrade);
        sb.append(", dataGrade=").append(dataGrade);
        sb.append(", companyGrade=").append(companyGrade);
        sb.append(", engineerGrade=").append(engineerGrade);
        sb.append(", managerGrade=").append(managerGrade);
        sb.append(", resultGrade=").append(resultGrade);
        sb.append(", personGrade=").append(personGrade);
        sb.append(", recordGrade=").append(recordGrade);
        sb.append(", projectManagerGrade=").append(projectManagerGrade);
        sb.append(", prizeGrade=").append(prizeGrade);
        sb.append(", breakRulesGrade=").append(breakRulesGrade);
        sb.append(", defaultGrade=").append(defaultGrade);
        sb.append(", breakPromiseGrade=").append(breakPromiseGrade);
        sb.append(", releaseOrgName=").append(releaseOrgName);
        sb.append(", releaseOrgCode=").append(releaseOrgCode);
        sb.append("]");
        return sb.toString();
    }
}