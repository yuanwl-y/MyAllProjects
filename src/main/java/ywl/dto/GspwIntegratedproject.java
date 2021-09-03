package ywl.dto;

public class GspwIntegratedproject {
    private Integer integratedprojectId;

    private String integratedprojectName;

    private String integratedprojectYear;

    private Integer integratedprojectState;

    private Integer integratedprojectStick;

    private Integer deletemark;

    public Integer getIntegratedprojectId() {
        return integratedprojectId;
    }

    public void setIntegratedprojectId(Integer integratedprojectId) {
        this.integratedprojectId = integratedprojectId;
    }

    public String getIntegratedprojectName() {
        return integratedprojectName;
    }

    public void setIntegratedprojectName(String integratedprojectName) {
        this.integratedprojectName = integratedprojectName == null ? null : integratedprojectName.trim();
    }

    public String getIntegratedprojectYear() {
        return integratedprojectYear;
    }

    public void setIntegratedprojectYear(String integratedprojectYear) {
        this.integratedprojectYear = integratedprojectYear == null ? null : integratedprojectYear.trim();
    }

    public Integer getIntegratedprojectState() {
        return integratedprojectState;
    }

    public void setIntegratedprojectState(Integer integratedprojectState) {
        this.integratedprojectState = integratedprojectState;
    }

    public Integer getIntegratedprojectStick() {
        return integratedprojectStick;
    }

    public void setIntegratedprojectStick(Integer integratedprojectStick) {
        this.integratedprojectStick = integratedprojectStick;
    }

    public Integer getDeletemark() {
        return deletemark;
    }

    public void setDeletemark(Integer deletemark) {
        this.deletemark = deletemark;
    }
}