//package com.souraj.foodorder.souraj.model;
//
//
//import com.souraj.foodorder.souraj.repository.AbstractEntity;
//import com.souraj.foodorder.souraj.repository.IAbstractEntity;
//import java.time.LocalDate;
//import java.util.Date;
//
//
//public class Menu extends AbstractEntity implements IAbstractEntity {
//    String name;
//    LocalDate fromDate;
//    LocalDate toDate;
//    Date createdAt;
//    Date updatedAt;
//
//
//    public Menu() {
//    }
//
// public Menu(String name, LocalDate fromDate, 
//         LocalDate toDate, Date createdAt, Date updatedAt) {
//        this.name = name;
//        this.fromDate = fromDate;
//        this.toDate = toDate;
//        this.createdAt = createdAt;
//        this.updatedAt = updatedAt;
//    }
// 
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public LocalDate getFromDate() {
//        return fromDate;
//    }
//
//    public void setFromDate(LocalDate fromDate) {
//        this.fromDate = fromDate;
//    }
//
//    public LocalDate getToDate() {
//        return toDate;
//    }
//
//    public void setToDate(LocalDate toDate) {
//        this.toDate = toDate;
//    }
//
//    public Date getCreatedAt() {
//        return createdAt;
//    }
//
//    public void setCreatedAt(Date createdAt) {
//        this.createdAt = createdAt;
//    }
//
//    public Date getUpdatedAt() {
//        return updatedAt;
//    }
//
//    public void setUpdatedAt(Date updatedAt) {
//        this.updatedAt = updatedAt;
//    }
//
//   
//    
//    
//
//    @Override
//    public String toString() {
//        return "Menu{" + "name=" + name + ", fromDate="
//                + fromDate + ", toDate=" + toDate + ", createdAt=" 
//                + createdAt + ", updatedAt=" + updatedAt + "}\n";
//    }
//
//    @Override
//    public String getTableName() {
//        return "menu";
//    }
//
// 
//   
//    
//}
