/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.souraj.foodorder.souraj.model;

import com.souraj.foodorder.souraj.repository.Iid;

/**
 *
 * @author ksouraj
 */
public class OrderDetails implements Iid{

 private  int id;
 private Double quantity;

// private Menu menu;
// private Order order;
// private  OrderStatus orderStatus;
 private Double price;
 
  public OrderDetails() {
    }

    public OrderDetails(int id, Double quantity, Double price) {
        this.id = id;
        this.quantity = quantity;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Double getQuantity() {
        return quantity;
    }

    public void setQuantity(Double quantity) {
        this.quantity = quantity;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "OrderDetails{" + "id=" + id + ", quantity=" + quantity + ", "
                + "price=" + price + "}\n";
    }
  
  
}
