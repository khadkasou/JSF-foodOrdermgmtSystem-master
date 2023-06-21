/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.souraj.foodorder.souraj.repository;

import java.time.LocalDate;

/**
 *
 * @author ksouraj
 */
public interface IAbstractEntity {
    
   Long getId();
   void setId(long id);
   String getName();
   void setName(String name);
   LocalDate getCreatedAt();
   void setCreatedAt(LocalDate createdAt);
   LocalDate getUpdatedAt();
   void setUpdatedAt(LocalDate updatedAt);
   String getTableName();
    
    
}
