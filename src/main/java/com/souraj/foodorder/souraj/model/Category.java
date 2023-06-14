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

public class Category { 
    int id;
    String name;
    LocalDate createdAt;
    LocalDate updatedAt;
   
     
    public Category() {
    }

    public Category(int id, String name, LocalDate createdAt, LocalDate updatedAt) {
        this.id = id;
        this.name = name;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

   
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
        return "Category{" + "id=" + id + ", name=" + name + ", "
                + "createdAt=" + createdAt + ", updatedAt=" + updatedAt + "}\n";
    }

   

  
}
