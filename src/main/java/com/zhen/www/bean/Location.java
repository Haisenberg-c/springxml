package com.zhen.www.bean;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Location {
    private int locationId;
    private String locationName;
    private String locationPath;
    private Integer parentid;
    private Integer status;
    private Integer menuId;
    private Integer hot;
    private String description;
    private String picpath;

    @Id
    @Column(name = "location_id")
    public int getLocationId() {
        return locationId;
    }

    public void setLocationId(int locationId) {
        this.locationId = locationId;
    }

    @Basic
    @Column(name = "location_name")
    public String getLocationName() {
        return locationName;
    }

    public void setLocationName(String locationName) {
        this.locationName = locationName;
    }

    @Basic
    @Column(name = "location_path")
    public String getLocationPath() {
        return locationPath;
    }

    public void setLocationPath(String locationPath) {
        this.locationPath = locationPath;
    }

    @Basic
    @Column(name = "parentid")
    public Integer getParentid() {
        return parentid;
    }

    public void setParentid(Integer parentid) {
        this.parentid = parentid;
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

    @Basic
    @Column(name = "hot")
    public Integer getHot() {
        return hot;
    }

    public void setHot(Integer hot) {
        this.hot = hot;
    }

    @Basic
    @Column(name = "description")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Basic
    @Column(name = "picpath")
    public String getPicpath() {
        return picpath;
    }

    public void setPicpath(String picpath) {
        this.picpath = picpath;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Location location = (Location) o;

        if (locationId != location.locationId) return false;
        if (locationName != null ? !locationName.equals(location.locationName) : location.locationName != null)
            return false;
        if (locationPath != null ? !locationPath.equals(location.locationPath) : location.locationPath != null)
            return false;
        if (parentid != null ? !parentid.equals(location.parentid) : location.parentid != null) return false;
        if (status != null ? !status.equals(location.status) : location.status != null) return false;
        if (menuId != null ? !menuId.equals(location.menuId) : location.menuId != null) return false;
        if (hot != null ? !hot.equals(location.hot) : location.hot != null) return false;
        if (description != null ? !description.equals(location.description) : location.description != null)
            return false;
        if (picpath != null ? !picpath.equals(location.picpath) : location.picpath != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = locationId;
        result = 31 * result + (locationName != null ? locationName.hashCode() : 0);
        result = 31 * result + (locationPath != null ? locationPath.hashCode() : 0);
        result = 31 * result + (parentid != null ? parentid.hashCode() : 0);
        result = 31 * result + (status != null ? status.hashCode() : 0);
        result = 31 * result + (menuId != null ? menuId.hashCode() : 0);
        result = 31 * result + (hot != null ? hot.hashCode() : 0);
        result = 31 * result + (description != null ? description.hashCode() : 0);
        result = 31 * result + (picpath != null ? picpath.hashCode() : 0);
        return result;
    }
}
