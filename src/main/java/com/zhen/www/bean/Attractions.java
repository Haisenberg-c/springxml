package com.zhen.www.bean;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Attractions {
    private int attractionsId;
    private String attractionsName;
    private String LocationEntity;
    private Integer locationId;
    private Integer hot;
    private Integer status;
    private Integer menuId;

    @Id
    @Column(name = "attractions_id")
    public int getAttractionsId() {
        return attractionsId;
    }

    public void setAttractionsId(int attractionsId) {
        this.attractionsId = attractionsId;
    }

    @Basic
    @Column(name = "attractions_name")
    public String getAttractionsName() {
        return attractionsName;
    }

    public void setAttractionsName(String attractionsName) {
        this.attractionsName = attractionsName;
    }

    @Basic
    @Column(name = "attractions_path")
    public String getLocationEntity() {
        return LocationEntity;
    }

    public void setLocationEntity(String locationEntity) {
        LocationEntity = locationEntity;
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
    @Column(name = "hot")
    public Integer getHot() {
        return hot;
    }

    public void setHot(Integer hot) {
        this.hot = hot;
    }

    @Basic
    @Column(name = "status")
    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    @Basic
    @Column(name = "menu_id")
    public Integer getMenuId() {
        return menuId;
    }

    public void setMenuId(Integer menuId) {
        this.menuId = menuId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Attractions that = (Attractions) o;

        if (attractionsId != that.attractionsId) return false;
        if (attractionsName != null ? !attractionsName.equals(that.attractionsName) : that.attractionsName != null)
            return false;
        if (LocationEntity != null ? !LocationEntity.equals(that.LocationEntity) : that.LocationEntity != null)
            return false;
        if (locationId != null ? !locationId.equals(that.locationId) : that.locationId != null) return false;
        if (hot != null ? !hot.equals(that.hot) : that.hot != null) return false;
        if (status != null ? !status.equals(that.status) : that.status != null) return false;
        if (menuId != null ? !menuId.equals(that.menuId) : that.menuId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = attractionsId;
        result = 31 * result + (attractionsName != null ? attractionsName.hashCode() : 0);
        result = 31 * result + (LocationEntity != null ? LocationEntity.hashCode() : 0);
        result = 31 * result + (locationId != null ? locationId.hashCode() : 0);
        result = 31 * result + (hot != null ? hot.hashCode() : 0);
        result = 31 * result + (status != null ? status.hashCode() : 0);
        result = 31 * result + (menuId != null ? menuId.hashCode() : 0);
        return result;
    }
}
