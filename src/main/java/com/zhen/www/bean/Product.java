package com.zhen.www.bean;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Date;

@Entity
public class Product {
    private int productId;
    private String productName;
    private String feature;
    private String startPlace;
    private String puposePalce;
    private Date startTime;
    private Integer locationId;
    private Integer menuId;
    private Double productPrice;
    private Double goldenPrice;
    private Integer special;
    private Integer hot;
    private String productPath;
    private String productPicPath;
    private String expensesExplain;
    private String reminder;
    private Integer status;
    private Integer planId;

    @Id
    @Column(name = "product_id")
    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    @Basic
    @Column(name = "product_name")
    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    @Basic
    @Column(name = "feature")
    public String getFeature() {
        return feature;
    }

    public void setFeature(String feature) {
        this.feature = feature;
    }

    @Basic
    @Column(name = "start_place")
    public String getStartPlace() {
        return startPlace;
    }

    public void setStartPlace(String startPlace) {
        this.startPlace = startPlace;
    }

    @Basic
    @Column(name = "pupose_palce")
    public String getPuposePalce() {
        return puposePalce;
    }

    public void setPuposePalce(String puposePalce) {
        this.puposePalce = puposePalce;
    }

    @Basic
    @Column(name = "start_time")
    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
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
    @Column(name = "menu_id")
    public Integer getMenuId() {
        return menuId;
    }

    public void setMenuId(Integer menuId) {
        this.menuId = menuId;
    }

    @Basic
    @Column(name = "product_price")
    public Double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(Double productPrice) {
        this.productPrice = productPrice;
    }

    @Basic
    @Column(name = "golden_price")
    public Double getGoldenPrice() {
        return goldenPrice;
    }

    public void setGoldenPrice(Double goldenPrice) {
        this.goldenPrice = goldenPrice;
    }

    @Basic
    @Column(name = "special")
    public Integer getSpecial() {
        return special;
    }

    public void setSpecial(Integer special) {
        this.special = special;
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
    @Column(name = "product_path")
    public String getProductPath() {
        return productPath;
    }

    public void setProductPath(String productPath) {
        this.productPath = productPath;
    }

    @Basic
    @Column(name = "product_picPath")
    public String getProductPicPath() {
        return productPicPath;
    }

    public void setProductPicPath(String productPicPath) {
        this.productPicPath = productPicPath;
    }

    @Basic
    @Column(name = "expenses_explain")
    public String getExpensesExplain() {
        return expensesExplain;
    }

    public void setExpensesExplain(String expensesExplain) {
        this.expensesExplain = expensesExplain;
    }

    @Basic
    @Column(name = "reminder")
    public String getReminder() {
        return reminder;
    }

    public void setReminder(String reminder) {
        this.reminder = reminder;
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
    @Column(name = "plan_id")
    public Integer getPlanId() {
        return planId;
    }

    public void setPlanId(Integer planId) {
        this.planId = planId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Product product = (Product) o;

        if (productId != product.productId) return false;
        if (productName != null ? !productName.equals(product.productName) : product.productName != null) return false;
        if (feature != null ? !feature.equals(product.feature) : product.feature != null) return false;
        if (startPlace != null ? !startPlace.equals(product.startPlace) : product.startPlace != null) return false;
        if (puposePalce != null ? !puposePalce.equals(product.puposePalce) : product.puposePalce != null) return false;
        if (startTime != null ? !startTime.equals(product.startTime) : product.startTime != null) return false;
        if (locationId != null ? !locationId.equals(product.locationId) : product.locationId != null) return false;
        if (menuId != null ? !menuId.equals(product.menuId) : product.menuId != null) return false;
        if (productPrice != null ? !productPrice.equals(product.productPrice) : product.productPrice != null)
            return false;
        if (goldenPrice != null ? !goldenPrice.equals(product.goldenPrice) : product.goldenPrice != null) return false;
        if (special != null ? !special.equals(product.special) : product.special != null) return false;
        if (hot != null ? !hot.equals(product.hot) : product.hot != null) return false;
        if (productPath != null ? !productPath.equals(product.productPath) : product.productPath != null) return false;
        if (productPicPath != null ? !productPicPath.equals(product.productPicPath) : product.productPicPath != null)
            return false;
        if (expensesExplain != null ? !expensesExplain.equals(product.expensesExplain) : product.expensesExplain != null)
            return false;
        if (reminder != null ? !reminder.equals(product.reminder) : product.reminder != null) return false;
        if (status != null ? !status.equals(product.status) : product.status != null) return false;
        if (planId != null ? !planId.equals(product.planId) : product.planId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = productId;
        result = 31 * result + (productName != null ? productName.hashCode() : 0);
        result = 31 * result + (feature != null ? feature.hashCode() : 0);
        result = 31 * result + (startPlace != null ? startPlace.hashCode() : 0);
        result = 31 * result + (puposePalce != null ? puposePalce.hashCode() : 0);
        result = 31 * result + (startTime != null ? startTime.hashCode() : 0);
        result = 31 * result + (locationId != null ? locationId.hashCode() : 0);
        result = 31 * result + (menuId != null ? menuId.hashCode() : 0);
        result = 31 * result + (productPrice != null ? productPrice.hashCode() : 0);
        result = 31 * result + (goldenPrice != null ? goldenPrice.hashCode() : 0);
        result = 31 * result + (special != null ? special.hashCode() : 0);
        result = 31 * result + (hot != null ? hot.hashCode() : 0);
        result = 31 * result + (productPath != null ? productPath.hashCode() : 0);
        result = 31 * result + (productPicPath != null ? productPicPath.hashCode() : 0);
        result = 31 * result + (expensesExplain != null ? expensesExplain.hashCode() : 0);
        result = 31 * result + (reminder != null ? reminder.hashCode() : 0);
        result = 31 * result + (status != null ? status.hashCode() : 0);
        result = 31 * result + (planId != null ? planId.hashCode() : 0);
        return result;
    }
}
