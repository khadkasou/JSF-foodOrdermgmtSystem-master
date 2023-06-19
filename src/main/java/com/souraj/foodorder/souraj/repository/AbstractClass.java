/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.souraj.foodorder.souraj.repository;

import com.souraj.foodorder.souraj.model.Category;
import com.sun.corba.se.spi.ior.Identifiable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


/**
 *
 * @author ksouraj
 */
public abstract class AbstractClass<T extends IAbstractEntity> implements GenericRepo<T>{


    private List<T> database ;
    
    
    
    public AbstractClass(){
        database = new ArrayList<>();
     
    }
      
    
    @Override
    public T save(T Object) {
        database.add(Object);
        return Object;
    }
    
         
    @Override
    public void deleteById(Long id){
        T t = findById(id);
        database.remove(t);
    }

        
    @Override
    public List<T> findAll() {
        return database;
    }

    @Override
    public T findById(Long id) {
         
    for (T categ : database) {
        if (categ.getId() == id) {
            return categ;
        }
    }
    return null;
      
    }
    
    
   @Override
   public T updateById(T obj, Long id) {
    for (int i = 0; i < database.size(); i++) {
        T t = database.get(i);
        if (t instanceof Identifiable) {
            Identifiable identifiable = (Identifiable) t;
            if (identifiable.getId() == id) {
                database.set(i, obj);
                return obj;
            }
        }
    }
    return null; 
}



}
