/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.souraj.foodorder.souraj.repository;

import java.time.LocalDate;

/**
 *
 * @author ksouraj
 */
public abstract class AbstractEntity implements IAbstractEntity{

    private Long id;
    private String name;
    private LocalDate createdAt;
    private LocalDate updatedAt;
    
    @Override
    public  void setId(long id){
        this.id = id;
    }

    @Override
    public  Long getId(){
        return  this.id;
    }  
 
    @Override
    public void setName(String name){
        this.name=name;
    }

    @Override
    public String getName(){
        return this.name;
             
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



    
    
    
}
