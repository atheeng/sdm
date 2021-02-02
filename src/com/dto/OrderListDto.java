/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dto;
public class OrderListDto {
    String orderNo;
    int ItemNo;
    double totalAmt;
    String orderDate;
    String oderBy;

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public int getItemNo() {
        return ItemNo;
    }

    public void setItemNo(int ItemNo) {
        this.ItemNo = ItemNo;
    }

    public double getTotalAmt() {
        return totalAmt;
    }

    public void setTotalAmt(double totalAmt) {
        this.totalAmt = totalAmt;
    }

    public String getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(String orderDate) {
        this.orderDate = orderDate;
    }

    public String getOderBy() {
        return oderBy;
    }

    public void setOderBy(String oderBy) {
        this.oderBy = oderBy;
    }
    
}
