/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.souraj.foodorder.souraj.serviceImpl;

import com.souraj.foodorder.souraj.model.User;
import com.souraj.foodorder.souraj.repository.UserRepo;

import java.util.List;
/**
 *
 * @author ksouraj
 */
public class UserServiceImpl extends UserRepo{

    public UserServiceImpl(){
        
    }
    
    public User saveUser(User user, UserRepo userRepo){
        return userRepo.save(user);
    }
    
    public List<User> findAllUser(UserRepo userRepo){
        return userRepo.findAll();
    }
}
