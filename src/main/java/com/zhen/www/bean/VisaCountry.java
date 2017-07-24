package com.zhen.www.bean;

import javax.persistence.*;

@Entity
@Table(name = "visa_country", schema = "travel")
public class VisaCountry {
    private int countryId;
    private String countryName;
    private String countryPicpath;
    private String countryPath;
    private Integer countryStatus;
    private Integer countryZid;

    @Id
    @Column(name = "country_id")
    public int getCountryId() {
        return countryId;
    }

    public void setCountryId(int countryId) {
        this.countryId = countryId;
    }

    @Basic
    @Column(name = "country_name")
    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    @Basic
    @Column(name = "country_picpath")
    public String getCountryPicpath() {
        return countryPicpath;
    }

    public void setCountryPicpath(String countryPicpath) {
        this.countryPicpath = countryPicpath;
    }

    @Basic
    @Column(name = "country_path")
    public String getCountryPath() {
        return countryPath;
    }

    public void setCountryPath(String countryPath) {
        this.countryPath = countryPath;
    }

    @Basic
    @Column(name = "country_status")
    public Integer getCountryStatus() {
        return countryStatus;
    }

    public void setCountryStatus(Integer countryStatus) {
        this.countryStatus = countryStatus;
    }

    @Basic
    @Column(name = "country_zid")
    public Integer getCountryZid() {
        return countryZid;
    }

    public void setCountryZid(Integer countryZid) {
        this.countryZid = countryZid;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        VisaCountry that = (VisaCountry) o;

        if (countryId != that.countryId) return false;
        if (countryName != null ? !countryName.equals(that.countryName) : that.countryName != null) return false;
        if (countryPicpath != null ? !countryPicpath.equals(that.countryPicpath) : that.countryPicpath != null)
            return false;
        if (countryPath != null ? !countryPath.equals(that.countryPath) : that.countryPath != null) return false;
        if (countryStatus != null ? !countryStatus.equals(that.countryStatus) : that.countryStatus != null)
            return false;
        if (countryZid != null ? !countryZid.equals(that.countryZid) : that.countryZid != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = countryId;
        result = 31 * result + (countryName != null ? countryName.hashCode() : 0);
        result = 31 * result + (countryPicpath != null ? countryPicpath.hashCode() : 0);
        result = 31 * result + (countryPath != null ? countryPath.hashCode() : 0);
        result = 31 * result + (countryStatus != null ? countryStatus.hashCode() : 0);
        result = 31 * result + (countryZid != null ? countryZid.hashCode() : 0);
        return result;
    }
}
