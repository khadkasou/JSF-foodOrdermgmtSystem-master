/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.souraj.foodorder.souraj.serviceImpl;

import com.souraj.foodorder.souraj.model.Category;
import com.souraj.foodorder.souraj.repository.CategoryRepo;
import java.util.List;



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

    
    
  public Category findById(int id, CategoryRepo categoryRepo) {
         
    return categoryRepo.findById(id);
}

    
    
  public  List<Category> findAll(CategoryRepo categoryRepo){

      return  categoryRepo.findAll();
     
  }
  
//  public  Category updateById(Category category,int id ,CategoryRepo categoryRepo){
//      
//      return categoryRepo.updateById(category, id);
//      
//  }
//    
//  public  void deleteById(int id, CategoryRepo categoryRepo){
//      categoryRepo.deleteById(id);
//  }
//    
    
    
}
