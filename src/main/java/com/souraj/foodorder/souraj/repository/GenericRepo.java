/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.souraj.foodorder.souraj.repository;

import com.sun.xml.internal.ws.spi.db.FieldGetter;
import java.util.List;

/**
 *
 * @author ksouraj
 * @param <T>
 */
public interface GenericRepo<T> {
    
    
   public T save(T Object);
    
   public void deleteById(int id);
   
   public List<T> findAll();
   
   public T findById(int id);
   
   public T updateById(T Object, int id );
    

}
