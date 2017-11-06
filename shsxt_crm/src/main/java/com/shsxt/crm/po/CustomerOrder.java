package com.shsxt.crm.po;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.shsxt.base.BaseEntity;

public class CustomerOrder extends BaseEntity{
    private Integer id;

    private Integer cusId;

    private String orderNo;

    @JsonFormat(pattern="yyyy-MM-dd",timezone="GMT+8")
    private Date orderDate;

    private String address;

    private Integer state;

    

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCusId() {
        return cusId;
    }

    public void setCusId(Integer cusId) {
        this.cusId = cusId;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo == null ? null : orderNo.trim();
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    
}