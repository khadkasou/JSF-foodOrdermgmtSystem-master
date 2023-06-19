/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.souraj.foodorder.souraj.model;

import com.souraj.foodorder.souraj.repository.AbstractEntity;
import com.souraj.foodorder.souraj.repository.IAbstractEntity;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author ksouraj
 */
public class User extends AbstractEntity implements IAbstractEntity{

//@Id
//@GeneratedValue(strategy = GenerationType.IDENTITY)
   
    String firstName;
    String lastName;
    String username;
    String email;
    String password;
    Date createdAt;
    Date updatedAt;

    //many to many relationship with user
    //many user can have many roles
// @ManyToMany(fetch = FetchType.EAGER,cascade = CascadeType.ALL)
//    @JoinTable(name="user_roles",
//        joinColumns = @JoinColumn(name="user_id"),
//            inverseJoinColumns = @JoinColumn(name="role_id"))
// private Set<Role> roles = new HashSet<>();
    public User() {
    }

    public User(String firstName, String lastName, String username, String email, String password, Date createdAt, Date updatedAt) {
        
        this.firstName = firstName;
        this.lastName = lastName;
        this.username = username;
        this.email = email;
        this.password = password;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;

    }

//   @PrePersist
//    protected void onCreate(){
//        this.createdAt = new Date();
//    }
//
//    @PreUpdate
//    protected void onUpdate(){
//        this.updatedAt = new Date();
//    }

  

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    @Override
    public String toString() {
        return "User{" + "firstName=" + firstName + ", "
                + "lastName=" + lastName + ", username=" + username + ", "
                + "email=" + email + ", password=" + password + ", "
                + "createdAt=" + createdAt + ", updatedAt=" + updatedAt + "\n";
    }

    @Override
    public String getTableName() {
    return "user"; 
        }

   
    
}
