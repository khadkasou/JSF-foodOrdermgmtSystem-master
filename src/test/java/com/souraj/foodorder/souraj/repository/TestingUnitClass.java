/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.souraj.foodorder.souraj.repository;

import com.souraj.foodorder.souraj.model.Category;
import java.sql.ResultSet;
import java.time.LocalDate;
import static org.junit.Assert.assertNotNull;
import org.junit.Before;
import org.junit.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

/**
 *
 * @author ksouraj
 */
public class TestingUnitClass {
    
private JdbcAbstractClass jdbcAbstractClass;

  @Before
    public void setUp() {
       
        jdbcAbstractClass = new JdbcAbstractClassImpl();
    }
   

     @Test
    public void testSave() {
        
        Category category = new Category();
        category.setName("souraj");
        
        LocalDate date1 = LocalDate.now();
        
        category.setCreatedAt(date1);
        category.setUpdatedAt(date1);

        
        IAbstractEntity savedCategory = jdbcAbstractClass.save(category);
        assertNotNull(savedCategory);
    }



    
    
  
 @Test
    public void testDeleteById() {
    
        Category category = new Category();
        
        category.setId(15L);
        ResultSet result = jdbcAbstractClass.findById(category, 15L);
        jdbcAbstractClass.deleteById(category, 15L);
        
        assertNull(result);
    }
    
    
    
     @Test
    public void testFindById() {
        JdbcAbstractClass instance = new JdbcAbstractClassImpl();
        Category object = new Category();
        Long id = 16L;
        ResultSet result = instance.findById(object, id);
         assertNotNull(result);
    }
    
   
    
    
    
    
    @Test
    public void testFindAll() {
        System.out.println("findAll");
        Category Object = new Category();
        
        JdbcAbstractClass instance = new JdbcAbstractClassImpl();

        ResultSet result = instance.findAll(Object);
        
        assertNotNull(result);


    }
    
    
     @Test
    public void testUpdateById() {
        Category category = new Category();
        category.setId(16L);
        category.setName("hari");
        LocalDate date2 = LocalDate.now();
        
        category.setCreatedAt(date2);
        category.setUpdatedAt(date2);

        IAbstractEntity updatedCategory = jdbcAbstractClass.updateById(category, 16L);
        assertNotNull(updatedCategory);

 
    }
    
    
    

    private static class JdbcAbstractClassImpl extends JdbcAbstractClass {

        public JdbcAbstractClassImpl() {
        }
    }



    
    
}
