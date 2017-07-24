package com.zhen.www.bean;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Routeplan {
    private int routeId;
    private String routeName;
    private String routePath;
    private Integer routeLocationid;
    private String routePicpath;

    @Id
    @Column(name = "route_id")
    public int getRouteId() {
        return routeId;
    }

    public void setRouteId(int routeId) {
        this.routeId = routeId;
    }

    @Basic
    @Column(name = "route_name")
    public String getRouteName() {
        return routeName;
    }

    public void setRouteName(String routeName) {
        this.routeName = routeName;
    }

    @Basic
    @Column(name = "route_path")
    public String getRoutePath() {
        return routePath;
    }

    public void setRoutePath(String routePath) {
        this.routePath = routePath;
    }

    @Basic
    @Column(name = "route_locationid")
    public Integer getRouteLocationid() {
        return routeLocationid;
    }

    public void setRouteLocationid(Integer routeLocationid) {
        this.routeLocationid = routeLocationid;
    }

    @Basic
    @Column(name = "route_picpath")
    public String getRoutePicpath() {
        return routePicpath;
    }

    public void setRoutePicpath(String routePicpath) {
        this.routePicpath = routePicpath;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Routeplan routeplan = (Routeplan) o;

        if (routeId != routeplan.routeId) return false;
        if (routeName != null ? !routeName.equals(routeplan.routeName) : routeplan.routeName != null) return false;
        if (routePath != null ? !routePath.equals(routeplan.routePath) : routeplan.routePath != null) return false;
        if (routeLocationid != null ? !routeLocationid.equals(routeplan.routeLocationid) : routeplan.routeLocationid != null)
            return false;
        if (routePicpath != null ? !routePicpath.equals(routeplan.routePicpath) : routeplan.routePicpath != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = routeId;
        result = 31 * result + (routeName != null ? routeName.hashCode() : 0);
        result = 31 * result + (routePath != null ? routePath.hashCode() : 0);
        result = 31 * result + (routeLocationid != null ? routeLocationid.hashCode() : 0);
        result = 31 * result + (routePicpath != null ? routePicpath.hashCode() : 0);
        return result;
    }
}
