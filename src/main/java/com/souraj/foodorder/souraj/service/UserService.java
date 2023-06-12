/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.souraj.foodorder.souraj.service;

import com.souraj.foodorder.souraj.model.User;
import java.util.List;

/**
 *
 * @author ksouraj
 */
public interface UserService {

 User save(User user);
 
 void deleteById(int user_id);
 
 User findById(int user_id);
 
 List<User> findAll();
 
 User updateUser(int user_id);
 
 
}
