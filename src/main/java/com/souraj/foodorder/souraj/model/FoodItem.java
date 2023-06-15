/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.souraj.foodorder.souraj.model;

import com.souraj.foodorder.souraj.repository.Iid;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author ksouraj
 */
public class FoodItem implements Iid{

private int foo_id;
private String name;
private String description;
private Double price;
private Date createdAt;
private Date updatedAt;

   

    public FoodItem() {
        
    }

     public FoodItem(int foo_id, String name, String description, Double price, 
             Date createdAt, Date updatedAt) {
        this.foo_id = foo_id;
        this.name = name;
        this.description = description;
        this.price = price;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }
  

    public int getFoo_id() {
        return foo_id;
    }

    public void setFoo_id(int foo_id) {
        this.foo_id = foo_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

   

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }


   @Override
    public String toString() {
        return "FoodItem{" + "foo_id=" + foo_id + ", name=" + name + ", "
                + "description=" + description + ", price=" + price + ", "
                + "createdAt=" + createdAt + ", updatedAt=" + updatedAt + "}\n";
    }

    @Override
    public int getId() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
      
    

}
