/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.souraj.foodorder.souraj.model;

/**
 *
 * @author ksouraj
 */
public class Role {
 //@Id
//@GeneratedValue(strategy = GenerationType.IDENTITY)
private int id;
private String name;

   
 public Role() {
    }
    
 public Role(int id, String name) {
        this.id = id;
        this.name = name;
    }

   

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

 
 
}
