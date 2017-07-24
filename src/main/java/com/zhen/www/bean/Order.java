package com.zhen.www.bean;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Date;

@Entity
public class Order {
    private int orderId;
    private String orderProname;
    private String orderUsername;
    private String orderPhone;
    private String orderQq;
    private Date orderStarttime;
    private Integer orderPeoplesum;
    private String orderDesc;

    @Id
    @Column(name = "order_id")
    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    @Basic
    @Column(name = "order_proname")
    public String getOrderProname() {
        return orderProname;
    }

    public void setOrderProname(String orderProname) {
        this.orderProname = orderProname;
    }

    @Basic
    @Column(name = "order_username")
    public String getOrderUsername() {
        return orderUsername;
    }

    public void setOrderUsername(String orderUsername) {
        this.orderUsername = orderUsername;
    }

    @Basic
    @Column(name = "order_phone")
    public String getOrderPhone() {
        return orderPhone;
    }

    public void setOrderPhone(String orderPhone) {
        this.orderPhone = orderPhone;
    }

    @Basic
    @Column(name = "order_qq")
    public String getOrderQq() {
        return orderQq;
    }

    public void setOrderQq(String orderQq) {
        this.orderQq = orderQq;
    }

    @Basic
    @Column(name = "order_starttime")
    public Date getOrderStarttime() {
        return orderStarttime;
    }

    public void setOrderStarttime(Date orderStarttime) {
        this.orderStarttime = orderStarttime;
    }

    @Basic
    @Column(name = "order_peoplesum")
    public Integer getOrderPeoplesum() {
        return orderPeoplesum;
    }

    public void setOrderPeoplesum(Integer orderPeoplesum) {
        this.orderPeoplesum = orderPeoplesum;
    }

    @Basic
    @Column(name = "order_desc")
    public String getOrderDesc() {
        return orderDesc;
    }

    public void setOrderDesc(String orderDesc) {
        this.orderDesc = orderDesc;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Order order = (Order) o;

        if (orderId != order.orderId) return false;
        if (orderProname != null ? !orderProname.equals(order.orderProname) : order.orderProname != null) return false;
        if (orderUsername != null ? !orderUsername.equals(order.orderUsername) : order.orderUsername != null)
            return false;
        if (orderPhone != null ? !orderPhone.equals(order.orderPhone) : order.orderPhone != null) return false;
        if (orderQq != null ? !orderQq.equals(order.orderQq) : order.orderQq != null) return false;
        if (orderStarttime != null ? !orderStarttime.equals(order.orderStarttime) : order.orderStarttime != null)
            return false;
        if (orderPeoplesum != null ? !orderPeoplesum.equals(order.orderPeoplesum) : order.orderPeoplesum != null)
            return false;
        if (orderDesc != null ? !orderDesc.equals(order.orderDesc) : order.orderDesc != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = orderId;
        result = 31 * result + (orderProname != null ? orderProname.hashCode() : 0);
        result = 31 * result + (orderUsername != null ? orderUsername.hashCode() : 0);
        result = 31 * result + (orderPhone != null ? orderPhone.hashCode() : 0);
        result = 31 * result + (orderQq != null ? orderQq.hashCode() : 0);
        result = 31 * result + (orderStarttime != null ? orderStarttime.hashCode() : 0);
        result = 31 * result + (orderPeoplesum != null ? orderPeoplesum.hashCode() : 0);
        result = 31 * result + (orderDesc != null ? orderDesc.hashCode() : 0);
        return result;
    }
}
