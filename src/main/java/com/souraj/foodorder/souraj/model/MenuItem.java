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
public class MenuItem implements Iid{
     
  private  int id ;
//  private Menu menu;
//  private FoodItem foodItem;
  private  Double price;
  
  
    public MenuItem() {
    }

    public MenuItem(int id, Double price) {
        this.id = id;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "MenuItem{" + "id=" + id + ", price=" + price + "}\n";
    }
    
    
    
  
  
}
