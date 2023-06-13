/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.souraj.foodorder.souraj.serviceImpl;

import com.souraj.foodorder.souraj.model.FoodItem;
import com.souraj.foodorder.souraj.repository.FoodItemRepo;

/**
 *
 * @author ksouraj
 */
public class FoodItemServiceImpl extends FoodItem{
    
    public FoodItemServiceImpl(){
        
    }
    
    public  FoodItem save(FoodItem foodItem, FoodItemRepo foodItemRepo){
        
        return foodItemRepo.save(foodItem);
    }
    
    
}
