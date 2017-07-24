package com.zhen.www.bean;

import javax.persistence.*;

@Entity
@Table(name = "city_route", schema = "travel")
public class CityRoute {
    private int cityrouteId;
    private String cityrouteName;
    private String cityroutePath;
    private Integer locationId;
    private Integer menuid;
    private Integer status;

    @Id
    @Column(name = "cityroute_id")
    public int getCityrouteId() {
        return cityrouteId;
    }

    public void setCityrouteId(int cityrouteId) {
        this.cityrouteId = cityrouteId;
    }

    @Basic
    @Column(name = "cityroute_name")
    public String getCityrouteName() {
        return cityrouteName;
    }

    public void setCityrouteName(String cityrouteName) {
        this.cityrouteName = cityrouteName;
    }

    @Basic
    @Column(name = "cityroute_path")
    public String getCityroutePath() {
        return cityroutePath;
    }

    public void setCityroutePath(String cityroutePath) {
        this.cityroutePath = cityroutePath;
    }

    @Basic
    @Column(name = "location_id")
    public Integer getLocationId() {
        return locationId;
    }

    public void setLocationId(Integer locationId) {
        this.locationId = locationId;
    }

    @Basic
    @Column(name = "menuid")
    public Integer getMenuid() {
        return menuid;
    }

    public void setMenuid(Integer menuid) {
        this.menuid = menuid;
    }

    @Basic
    @Column(name = "status")
    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CityRoute cityRoute = (CityRoute) o;

        if (cityrouteId != cityRoute.cityrouteId) return false;
        if (cityrouteName != null ? !cityrouteName.equals(cityRoute.cityrouteName) : cityRoute.cityrouteName != null)
            return false;
        if (cityroutePath != null ? !cityroutePath.equals(cityRoute.cityroutePath) : cityRoute.cityroutePath != null)
            return false;
        if (locationId != null ? !locationId.equals(cityRoute.locationId) : cityRoute.locationId != null) return false;
        if (menuid != null ? !menuid.equals(cityRoute.menuid) : cityRoute.menuid != null) return false;
        if (status != null ? !status.equals(cityRoute.status) : cityRoute.status != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = cityrouteId;
        result = 31 * result + (cityrouteName != null ? cityrouteName.hashCode() : 0);
        result = 31 * result + (cityroutePath != null ? cityroutePath.hashCode() : 0);
        result = 31 * result + (locationId != null ? locationId.hashCode() : 0);
        result = 31 * result + (menuid != null ? menuid.hashCode() : 0);
        result = 31 * result + (status != null ? status.hashCode() : 0);
        return result;
    }
}
