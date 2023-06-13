/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.souraj.foodorder.souraj.model;

import java.util.Date;



/**
 *
 * @author ksouraj
 */

public class Category { 
    int cat_id;
    String name;
    Date createdAt;
    Date updatedAt;
   
     
    public Category() {
    }


    public Category(int cat_id, String name, Date createdAt, Date updatedAt) {
        this.cat_id = cat_id;
        this.name = name;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }
    

    public int getCat_id() {
        return cat_id;
    }

    public void setCat_id(int cat_id) {
        this.cat_id = cat_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
        return "Category{" + "cat_id=" + cat_id + ", name=" + name + ", createdAt=" + createdAt + ", updatedAt=" + updatedAt + '}';
    }
    
    
}
