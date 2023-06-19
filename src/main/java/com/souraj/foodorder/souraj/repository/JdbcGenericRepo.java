/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.souraj.foodorder.souraj.repository;
import java.sql.ResultSet;

/**
 *
 * @author ksouraj
 * @param <T>
 */
public interface JdbcGenericRepo<T> {
    
    
   public T save(T Object,String query);
    
   public void deleteById(T Object ,Long id);
   
   public ResultSet findAll(T Object);
   
   public ResultSet findById(T Obejct,Long id);
   
   public T updateById(T Object, Long id );
       

}
