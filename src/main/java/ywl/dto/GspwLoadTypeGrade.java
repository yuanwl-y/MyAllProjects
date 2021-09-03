package ywl.dto;

public class GspwLoadTypeGrade {
    private Integer gradeId;

    private Integer gradeVo;

    private String gradeUrl;

    private Integer gradeTypeId;

    private Integer gradeScoreId;

    private Integer deleteMark;

    private String role;

    public Integer getGradeId() {
        return gradeId;
    }

    public void setGradeId(Integer gradeId) {
        this.gradeId = gradeId;
    }

    public Integer getGradeVo() {
        return gradeVo;
    }

    public void setGradeVo(Integer gradeVo) {
        this.gradeVo = gradeVo;
    }

    public String getGradeUrl() {
        return gradeUrl;
    }

    public void setGradeUrl(String gradeUrl) {
        this.gradeUrl = gradeUrl == null ? null : gradeUrl.trim();
    }

    public Integer getGradeTypeId() {
        return gradeTypeId;
    }

    public void setGradeTypeId(Integer gradeTypeId) {
        this.gradeTypeId = gradeTypeId;
    }

    public Integer getGradeScoreId() {
        return gradeScoreId;
    }

    public void setGradeScoreId(Integer gradeScoreId) {
        this.gradeScoreId = gradeScoreId;
    }

    public Integer getDeleteMark() {
        return deleteMark;
    }

    public void setDeleteMark(Integer deleteMark) {
        this.deleteMark = deleteMark;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role == null ? null : role.trim();
    }
}