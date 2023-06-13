/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.souraj.foodorder.souraj.serviceImpl;

import com.souraj.foodorder.souraj.model.Category;
import com.souraj.foodorder.souraj.repository.CategoryRepo;



/**
 *
 * @author ksouraj
 */
public class CatergoryServiceImpl extends CategoryRepo{
    
    
    
    public CatergoryServiceImpl() {
    }
    
    
    
    public Category save(Category clazz, CategoryRepo categoryRepo) {
        
    return  categoryRepo.save( clazz);
    }

    
    
   
    
    
    
}
