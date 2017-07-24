package com.zhen.www.bean;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Visa {
    private int visaId;
    private String visaName;
    private Double visaPrice;
    private String visaType;
    private String visaLifetime;
    private String visaMaxtime;
    private String visaNeedtime;
    private Integer visaStatus;
    private String visaPicpath;
    private String visaPash;
    private Integer hot;
    private Integer visaCounrtyid;
    private String visaBigpic;

    @Id
    @Column(name = "visa_id")
    public int getVisaId() {
        return visaId;
    }

    public void setVisaId(int visaId) {
        this.visaId = visaId;
    }

    @Basic
    @Column(name = "visa_name")
    public String getVisaName() {
        return visaName;
    }

    public void setVisaName(String visaName) {
        this.visaName = visaName;
    }

    @Basic
    @Column(name = "visa_price")
    public Double getVisaPrice() {
        return visaPrice;
    }

    public void setVisaPrice(Double visaPrice) {
        this.visaPrice = visaPrice;
    }

    @Basic
    @Column(name = "visa_type")
    public String getVisaType() {
        return visaType;
    }

    public void setVisaType(String visaType) {
        this.visaType = visaType;
    }

    @Basic
    @Column(name = "visa_lifetime")
    public String getVisaLifetime() {
        return visaLifetime;
    }

    public void setVisaLifetime(String visaLifetime) {
        this.visaLifetime = visaLifetime;
    }

    @Basic
    @Column(name = "visa_maxtime")
    public String getVisaMaxtime() {
        return visaMaxtime;
    }

    public void setVisaMaxtime(String visaMaxtime) {
        this.visaMaxtime = visaMaxtime;
    }

    @Basic
    @Column(name = "visa_needtime")
    public String getVisaNeedtime() {
        return visaNeedtime;
    }

    public void setVisaNeedtime(String visaNeedtime) {
        this.visaNeedtime = visaNeedtime;
    }

    @Basic
    @Column(name = "visa_status")
    public Integer getVisaStatus() {
        return visaStatus;
    }

    public void setVisaStatus(Integer visaStatus) {
        this.visaStatus = visaStatus;
    }

    @Basic
    @Column(name = "visa_picpath")
    public String getVisaPicpath() {
        return visaPicpath;
    }

    public void setVisaPicpath(String visaPicpath) {
        this.visaPicpath = visaPicpath;
    }

    @Basic
    @Column(name = "visa_pash")
    public String getVisaPash() {
        return visaPash;
    }

    public void setVisaPash(String visaPash) {
        this.visaPash = visaPash;
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
    @Column(name = "visa_counrtyid")
    public Integer getVisaCounrtyid() {
        return visaCounrtyid;
    }

    public void setVisaCounrtyid(Integer visaCounrtyid) {
        this.visaCounrtyid = visaCounrtyid;
    }

    @Basic
    @Column(name = "visa_bigpic")
    public String getVisaBigpic() {
        return visaBigpic;
    }

    public void setVisaBigpic(String visaBigpic) {
        this.visaBigpic = visaBigpic;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Visa visa = (Visa) o;

        if (visaId != visa.visaId) return false;
        if (visaName != null ? !visaName.equals(visa.visaName) : visa.visaName != null) return false;
        if (visaPrice != null ? !visaPrice.equals(visa.visaPrice) : visa.visaPrice != null) return false;
        if (visaType != null ? !visaType.equals(visa.visaType) : visa.visaType != null) return false;
        if (visaLifetime != null ? !visaLifetime.equals(visa.visaLifetime) : visa.visaLifetime != null) return false;
        if (visaMaxtime != null ? !visaMaxtime.equals(visa.visaMaxtime) : visa.visaMaxtime != null) return false;
        if (visaNeedtime != null ? !visaNeedtime.equals(visa.visaNeedtime) : visa.visaNeedtime != null) return false;
        if (visaStatus != null ? !visaStatus.equals(visa.visaStatus) : visa.visaStatus != null) return false;
        if (visaPicpath != null ? !visaPicpath.equals(visa.visaPicpath) : visa.visaPicpath != null) return false;
        if (visaPash != null ? !visaPash.equals(visa.visaPash) : visa.visaPash != null) return false;
        if (hot != null ? !hot.equals(visa.hot) : visa.hot != null) return false;
        if (visaCounrtyid != null ? !visaCounrtyid.equals(visa.visaCounrtyid) : visa.visaCounrtyid != null)
            return false;
        if (visaBigpic != null ? !visaBigpic.equals(visa.visaBigpic) : visa.visaBigpic != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = visaId;
        result = 31 * result + (visaName != null ? visaName.hashCode() : 0);
        result = 31 * result + (visaPrice != null ? visaPrice.hashCode() : 0);
        result = 31 * result + (visaType != null ? visaType.hashCode() : 0);
        result = 31 * result + (visaLifetime != null ? visaLifetime.hashCode() : 0);
        result = 31 * result + (visaMaxtime != null ? visaMaxtime.hashCode() : 0);
        result = 31 * result + (visaNeedtime != null ? visaNeedtime.hashCode() : 0);
        result = 31 * result + (visaStatus != null ? visaStatus.hashCode() : 0);
        result = 31 * result + (visaPicpath != null ? visaPicpath.hashCode() : 0);
        result = 31 * result + (visaPash != null ? visaPash.hashCode() : 0);
        result = 31 * result + (hot != null ? hot.hashCode() : 0);
        result = 31 * result + (visaCounrtyid != null ? visaCounrtyid.hashCode() : 0);
        result = 31 * result + (visaBigpic != null ? visaBigpic.hashCode() : 0);
        return result;
    }
}
