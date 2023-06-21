/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.souraj.foodorder.souraj.model;

import com.souraj.foodorder.souraj.repository.AbstractEntity;
import com.souraj.foodorder.souraj.repository.IAbstractEntity;
import java.time.LocalDate;




/**
 *
 * @author ksouraj
 */

public class Category extends AbstractEntity implements IAbstractEntity{ 
 
    String name;
    LocalDate createdAt;
    LocalDate updatedAt;
   
     
    public Category() {
    }

    public Category(String name, LocalDate createdAt, LocalDate updatedAt) {
        this.name = name;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
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
        return "Category{ id=" + super.getId() + "," + " name=" +name + ", "
                + "createdAt=" + createdAt + ", updatedAt=" + updatedAt + "}\n";
    }



    @Override
    public String getTableName() {
        return "Category";
    }

    

  


    

   

  
}
