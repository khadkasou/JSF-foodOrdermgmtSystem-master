/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.souraj.foodorder.souraj.model;

import java.time.LocalDate;

/**
 *
 * @author ksouraj
 */
public class Order {
    
 private int order_id;
// private OrderStatus orderStatus;
// private  User user;
 private LocalDate orderDate;
 private String remarks;
 private String description;
 private LocalDate createdAt;
 private LocalDate updatedAt;

    public Order() {
    }

    public Order(int order_id, LocalDate orderDate, String remarks, String description, LocalDate createdAt, LocalDate updatedAt) {
        this.order_id = order_id;
        this.orderDate = orderDate;
        this.remarks = remarks;
        this.description = description;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public int getOrder_id() {
        return order_id;
    }

    public void setOrder_id(int order_id) {
        this.order_id = order_id;
    }

    public LocalDate getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(LocalDate orderDate) {
        this.orderDate = orderDate;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDate createdAt) {
        this.createdAt = createdAt;
    }

    public LocalDate getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(LocalDate updatedAt) {
        this.updatedAt = updatedAt;
    }

    @Override
    public String toString() {
        return "Order{" + "order_id=" + order_id + ", orderDate=" + orderDate + ", remarks=" + remarks + ", description=" + description + ", createdAt=" + createdAt + ", updatedAt=" + updatedAt + '}';
    }
 
 
 
 
}
