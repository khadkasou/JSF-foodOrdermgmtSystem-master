package com.souraj.foodorder.souraj.model;

import com.souraj.foodorder.souraj.repository.Iid;
import java.time.LocalDate;
import java.util.Date;


public class Menu implements Iid{
    int menu_id;
    String name;
    LocalDate fromDate;
    LocalDate toDate;
    Date createdAt;
    Date updatedAt;


    public Menu() {
    }

 public Menu(int menu_id, String name, LocalDate fromDate, 
         LocalDate toDate, Date createdAt, Date updatedAt) {
        this.menu_id = menu_id;
        this.name = name;
        this.fromDate = fromDate;
        this.toDate = toDate;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }
 
 
    public int getMenu_id() {
        return menu_id;
    }

    public void setMenu_id(int menu_id) {
        this.menu_id = menu_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getFromDate() {
        return fromDate;
    }

    public void setFromDate(LocalDate fromDate) {
        this.fromDate = fromDate;
    }

    public LocalDate getToDate() {
        return toDate;
    }

    public void setToDate(LocalDate toDate) {
        this.toDate = toDate;
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
        return "Menu{" + "menu_id=" + menu_id + ", name=" + name + ", fromDate="
                + fromDate + ", toDate=" + toDate + ", createdAt=" 
                + createdAt + ", updatedAt=" + updatedAt + "}\n";
    }

    @Override
    public int getId() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
}
