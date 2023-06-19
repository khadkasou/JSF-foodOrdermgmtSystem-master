/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.souraj.foodorder.souraj.serviceImpl;

import com.souraj.foodorder.souraj.model.Category;
import com.souraj.foodorder.souraj.repository.CategoryRepo;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;



/**
 *
 * @author ksouraj
 */
public class CatergoryServiceImpl extends CategoryRepo{
    
    
    public CatergoryServiceImpl() {
        
    }
    
    
    public Category save(Category clazz, CategoryRepo categoryRepo, String query) {
        
    return  categoryRepo.save( clazz, query);
    }

    
    
  public ResultSet findById(Long id, CategoryRepo categoryRepo) {
         
        ResultSet resultSet = categoryRepo.findById(new Category(), id);
        return resultSet;
}

    
    
  public  ResultSet findAll(CategoryRepo categoryRepo){
   ResultSet resultSet = categoryRepo.findAll(new Category());
       
   return resultSet;
  }
  
  
  
  
  
  public  Category updateById(Category category,Long id ,CategoryRepo categoryRepo){
      
      return categoryRepo.updateById(category, id);
      
  }
    
  public  void deleteById(Long id, CategoryRepo categoryRepo, Category category){
      
      categoryRepo.deleteById(category,id);
  }
    
    
    
}
