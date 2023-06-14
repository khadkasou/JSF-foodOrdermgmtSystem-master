/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.souraj.foodorder.souraj.serviceImpl;

import com.souraj.foodorder.souraj.model.Menu;
import com.souraj.foodorder.souraj.repository.MenuRepo;
import java.util.List;

/**
 *
 * @author ksouraj
 */
public class MenuServiceImpl {
      
    
    public MenuServiceImpl() {
    
    }
    
    
    public  Menu save(Menu clazz, MenuRepo menuRepo){
        return menuRepo.save(clazz);
    }
    
    
    public List<Menu> findAll(MenuRepo menuRepo){
        
        return menuRepo.findAll();
    }
    
}
