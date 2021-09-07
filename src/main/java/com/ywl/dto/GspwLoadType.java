package com.ywl.dto;

public class GspwLoadType {
    private Integer typeId;

    private String typeName;

    private String typeGrade;

    private String typeMethod;

    private String typeStandard;

    private Integer deleteMark;

    public Integer getTypeId() {
        return typeId;
    }

    public void setTypeId(Integer typeId) {
        this.typeId = typeId;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName == null ? null : typeName.trim();
    }

    public String getTypeGrade() {
        return typeGrade;
    }

    public void setTypeGrade(String typeGrade) {
        this.typeGrade = typeGrade == null ? null : typeGrade.trim();
    }

    public String getTypeMethod() {
        return typeMethod;
    }

    public void setTypeMethod(String typeMethod) {
        this.typeMethod = typeMethod == null ? null : typeMethod.trim();
    }

    public String getTypeStandard() {
        return typeStandard;
    }

    public void setTypeStandard(String typeStandard) {
        this.typeStandard = typeStandard == null ? null : typeStandard.trim();
    }

    public Integer getDeleteMark() {
        return deleteMark;
    }

    public void setDeleteMark(Integer deleteMark) {
        this.deleteMark = deleteMark;
    }
}