package ywl.dto;

public class GspwLoadDeviceType {
    private Integer devicetypeId;

    private String devicetypeName;

    private Integer deleteMark;

    private Integer deviceState;

    public Integer getDevicetypeId() {
        return devicetypeId;
    }

    public void setDevicetypeId(Integer devicetypeId) {
        this.devicetypeId = devicetypeId;
    }

    public String getDevicetypeName() {
        return devicetypeName;
    }

    public void setDevicetypeName(String devicetypeName) {
        this.devicetypeName = devicetypeName == null ? null : devicetypeName.trim();
    }

    public Integer getDeleteMark() {
        return deleteMark;
    }

    public void setDeleteMark(Integer deleteMark) {
        this.deleteMark = deleteMark;
    }

    public Integer getDeviceState() {
        return deviceState;
    }

    public void setDeviceState(Integer deviceState) {
        this.deviceState = deviceState;
    }
}