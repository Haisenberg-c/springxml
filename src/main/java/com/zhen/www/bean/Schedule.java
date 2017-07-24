package com.zhen.www.bean;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Schedule {
    private int scheduleId;
    private String scheduleTitle;
    private Integer scheduleOrder;
    private Integer scheduleProductid;
    private String schedulePicpath;
    private String scheduleDescription;

    @Id
    @Column(name = "schedule_id")
    public int getScheduleId() {
        return scheduleId;
    }

    public void setScheduleId(int scheduleId) {
        this.scheduleId = scheduleId;
    }

    @Basic
    @Column(name = "schedule_title")
    public String getScheduleTitle() {
        return scheduleTitle;
    }

    public void setScheduleTitle(String scheduleTitle) {
        this.scheduleTitle = scheduleTitle;
    }

    @Basic
    @Column(name = "schedule_order")
    public Integer getScheduleOrder() {
        return scheduleOrder;
    }

    public void setScheduleOrder(Integer scheduleOrder) {
        this.scheduleOrder = scheduleOrder;
    }

    @Basic
    @Column(name = "schedule_productid")
    public Integer getScheduleProductid() {
        return scheduleProductid;
    }

    public void setScheduleProductid(Integer scheduleProductid) {
        this.scheduleProductid = scheduleProductid;
    }

    @Basic
    @Column(name = "schedule_picpath")
    public String getSchedulePicpath() {
        return schedulePicpath;
    }

    public void setSchedulePicpath(String schedulePicpath) {
        this.schedulePicpath = schedulePicpath;
    }

    @Basic
    @Column(name = "schedule_description")
    public String getScheduleDescription() {
        return scheduleDescription;
    }

    public void setScheduleDescription(String scheduleDescription) {
        this.scheduleDescription = scheduleDescription;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Schedule schedule = (Schedule) o;

        if (scheduleId != schedule.scheduleId) return false;
        if (scheduleTitle != null ? !scheduleTitle.equals(schedule.scheduleTitle) : schedule.scheduleTitle != null)
            return false;
        if (scheduleOrder != null ? !scheduleOrder.equals(schedule.scheduleOrder) : schedule.scheduleOrder != null)
            return false;
        if (scheduleProductid != null ? !scheduleProductid.equals(schedule.scheduleProductid) : schedule.scheduleProductid != null)
            return false;
        if (schedulePicpath != null ? !schedulePicpath.equals(schedule.schedulePicpath) : schedule.schedulePicpath != null)
            return false;
        if (scheduleDescription != null ? !scheduleDescription.equals(schedule.scheduleDescription) : schedule.scheduleDescription != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = scheduleId;
        result = 31 * result + (scheduleTitle != null ? scheduleTitle.hashCode() : 0);
        result = 31 * result + (scheduleOrder != null ? scheduleOrder.hashCode() : 0);
        result = 31 * result + (scheduleProductid != null ? scheduleProductid.hashCode() : 0);
        result = 31 * result + (schedulePicpath != null ? schedulePicpath.hashCode() : 0);
        result = 31 * result + (scheduleDescription != null ? scheduleDescription.hashCode() : 0);
        return result;
    }
}
