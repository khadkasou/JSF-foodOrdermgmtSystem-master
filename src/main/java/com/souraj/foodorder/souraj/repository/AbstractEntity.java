/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.souraj.foodorder.souraj.repository;

/**
 *
 * @author ksouraj
 */
public abstract class AbstractEntity implements IAbstractEntity{

    private Long id;
    
    @Override
    public  void setId(long id){
        this.id = id;
    }

    @Override
    public  Long getId(){
        return  id;
    }
    
    
 

    
    
    
}
