package com.zhen.www.bean;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Qq {
    private int qqId;
    private String qqNumber;
    private String qqPath;
    private String qqPicpath;

    @Id
    @Column(name = "qq_id")
    public int getQqId() {
        return qqId;
    }

    public void setQqId(int qqId) {
        this.qqId = qqId;
    }

    @Basic
    @Column(name = "qq_number")
    public String getQqNumber() {
        return qqNumber;
    }

    public void setQqNumber(String qqNumber) {
        this.qqNumber = qqNumber;
    }

    @Basic
    @Column(name = "qq_path")
    public String getQqPath() {
        return qqPath;
    }

    public void setQqPath(String qqPath) {
        this.qqPath = qqPath;
    }

    @Basic
    @Column(name = "qq_picpath")
    public String getQqPicpath() {
        return qqPicpath;
    }

    public void setQqPicpath(String qqPicpath) {
        this.qqPicpath = qqPicpath;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Qq qq = (Qq) o;

        if (qqId != qq.qqId) return false;
        if (qqNumber != null ? !qqNumber.equals(qq.qqNumber) : qq.qqNumber != null) return false;
        if (qqPath != null ? !qqPath.equals(qq.qqPath) : qq.qqPath != null) return false;
        if (qqPicpath != null ? !qqPicpath.equals(qq.qqPicpath) : qq.qqPicpath != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = qqId;
        result = 31 * result + (qqNumber != null ? qqNumber.hashCode() : 0);
        result = 31 * result + (qqPath != null ? qqPath.hashCode() : 0);
        result = 31 * result + (qqPicpath != null ? qqPicpath.hashCode() : 0);
        return result;
    }
}
