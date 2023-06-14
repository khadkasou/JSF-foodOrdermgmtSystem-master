/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.souraj.foodorder.souraj.repository;

import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author ksouraj
 */
public abstract class AbstractClass<T> implements GenericRepo<T>{


    public  List<T> database;
       
      
    public AbstractClass() {
        
        database = new ArrayList<>();
    }
    
    @Override
    public T save(T Object) {
        database.add(Object);
        return Object;
    }

    @Override
    public void deleteById(int id) {
        database.remove(id);
    }

    
    @Override
    public List<T> findAll() {
        return database;
    }

    @Override
    public T findById(int id) {
      return database.get(id);
      
    }
//    @Override
//     public T findById(int id) {
//    if (id >= 0 && id < database.size()) {
//        return database.get(id);
//    } else {
//        return null;
//    }
//}

    @Override
    public T updateById(T Object, int id) {
        return updateById(Object,id);
    
    }
    
    
}
