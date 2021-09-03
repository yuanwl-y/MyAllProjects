package ywl.dto;

public class GspwOutcompany {
    private Integer id;

    private String loadedPhotoUrl;

    private String safetyPhotoUrl;

    private String qualificationsPhothUrl;

    private String companyname;

    private String subcompany;

    private String legalPerson;

    private String licensePhotoUrl;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLoadedPhotoUrl() {
        return loadedPhotoUrl;
    }

    public void setLoadedPhotoUrl(String loadedPhotoUrl) {
        this.loadedPhotoUrl = loadedPhotoUrl == null ? null : loadedPhotoUrl.trim();
    }

    public String getSafetyPhotoUrl() {
        return safetyPhotoUrl;
    }

    public void setSafetyPhotoUrl(String safetyPhotoUrl) {
        this.safetyPhotoUrl = safetyPhotoUrl == null ? null : safetyPhotoUrl.trim();
    }

    public String getQualificationsPhothUrl() {
        return qualificationsPhothUrl;
    }

    public void setQualificationsPhothUrl(String qualificationsPhothUrl) {
        this.qualificationsPhothUrl = qualificationsPhothUrl == null ? null : qualificationsPhothUrl.trim();
    }

    public String getCompanyname() {
        return companyname;
    }

    public void setCompanyname(String companyname) {
        this.companyname = companyname == null ? null : companyname.trim();
    }

    public String getSubcompany() {
        return subcompany;
    }

    public void setSubcompany(String subcompany) {
        this.subcompany = subcompany == null ? null : subcompany.trim();
    }

    public String getLegalPerson() {
        return legalPerson;
    }

    public void setLegalPerson(String legalPerson) {
        this.legalPerson = legalPerson == null ? null : legalPerson.trim();
    }

    public String getLicensePhotoUrl() {
        return licensePhotoUrl;
    }

    public void setLicensePhotoUrl(String licensePhotoUrl) {
        this.licensePhotoUrl = licensePhotoUrl == null ? null : licensePhotoUrl.trim();
    }
}