/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.souraj.foodorder.souraj.serviceImpl;

import com.souraj.foodorder.souraj.model.Category;
import com.souraj.foodorder.souraj.model.FoodItem;
import com.souraj.foodorder.souraj.model.Menu;
import com.souraj.foodorder.souraj.model.User;
import com.souraj.foodorder.souraj.repository.CategoryRepo;
import com.souraj.foodorder.souraj.repository.FoodItemRepo;
import com.souraj.foodorder.souraj.repository.MenuRepo;
import com.souraj.foodorder.souraj.repository.UserRepo;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;


/**
 *
 * @author ksouraj
 */
public class UserInput {
    
    CategoryRepo categoryRepo = new CategoryRepo();
    MenuRepo menuRepo = new MenuRepo();
    FoodItemRepo foodItemRepo = new FoodItemRepo();
    UserRepo userRepo = new UserRepo();
    
    CatergoryServiceImpl catergoryService = new CatergoryServiceImpl();
    MenuServiceImpl menuService = new MenuServiceImpl();
    FoodItemServiceImpl foodItemService = new FoodItemServiceImpl();
    UserServiceImpl userService = new UserServiceImpl();
     
    Scanner sc = new Scanner(System.in);

       public  Boolean categoryInput() {
           

        Category cat = new Category();
        System.out.println("Add category");

        
        System.out.println("Enter category Id: ");
//        cat.setId(sc.nextInt());
          cat.setId(sc.nextLong());

        System.out.println("enter category name: ");
        String name = sc.next();
        cat.setName(name);
        
        System.out.println("Enter createdAt: ");
        String createdAtStr = sc.next();
        LocalDate createdAt = LocalDate.parse(createdAtStr, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        cat.setCreatedAt(createdAt);
        
        System.out.println("Enter updatedAt: ");
        String updatedAtStr = sc.next();
        LocalDate updatedAt = LocalDate.parse(updatedAtStr, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        cat.setUpdatedAt(updatedAt);
        
        String sql = "INSERT INTO Category (name, createdAt, updatedAt)"
                 + " VALUES ('"+name+"','"+createdAt+"','"+updatedAt+"')";
       
        catergoryService.save(cat,categoryRepo,sql);
        System.out.println(cat);
        
        return  true;
    }
    
    public Boolean saveUser(){
        
        User user = new User();
        System.out.println("Create/Register new user");
        
//        System.out.println("Enter id: ");
////        user.setUser_id(sc.nextInt());
        
        System.out.println("Enter first name: ");
        user.setFirstName(sc.next());
        
        System.out.println("Enter last name: ");
        user.setLastName(sc.next());
        
        System.out.println("Enter username: ");
        user.setUsername(sc.next());
        
        System.out.println("Enter password :");
        user.setPassword(sc.next());
        
        
        user = userService.saveUser(user, userRepo);
        System.out.println(user);
        
        return true;
    }

    public Boolean menuInput() {
        
        Menu menu = new Menu();
        System.out.println("Create Menu");
              
        System.out.println("Enter menu Id: ");
//        menu.setMenu_id(sc.nextInt());
        
        System.out.println("Enter menu name: ");
        menu.setName(sc.next());
        
        System.out.println("Enter fromDate (in dd/MM/yyyy format): ");
        String fromDateStr = sc.next();
        LocalDate fromDate = LocalDate.parse(fromDateStr, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        menu.setFromDate(fromDate);
        
        System.out.println("Enter toDate (in dd/MM/yyyy format): ");
        String toDateStr = sc.next();
        LocalDate toDate = LocalDate.parse(toDateStr, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        menu.setToDate(toDate);
        
        
        menu = menuService.save(menu, menuRepo);
        System.out.println(menu);
        
        return true;
        
    }

    
    
     public Boolean saveFoodItem(){
         FoodItem food = new FoodItem();
         System.out.println("Enter the foodItem: ");
                  
         System.out.println("Enter id: ");
//         food.setFoo_id(sc.nextInt());
          
         System.out.println("Enter name: ");
         food.setName(sc.next());
         
         System.out.println("Enter Description: ");
         food.setDescription(sc.next());
       
         System.out.println("Enter price: ");
         food.setPrice(sc.nextDouble());
                          
         food = foodItemService.save(food, foodItemRepo);
         System.out.println(food);
        
        return true; 
     }
     
    
      public Boolean findAllCategory(){
          ResultSet resultSet = catergoryService.findAll(categoryRepo); 
          List<Category> cat= new ArrayList<>();
        try {
            while (resultSet.next()){
                Long id = resultSet.getLong(1);
                String name = resultSet.getString(2);
                LocalDate createdAt= resultSet.getTimestamp(3).toLocalDateTime().toLocalDate();
                LocalDate updatedAt = resultSet.getTimestamp(4).toLocalDateTime().toLocalDate();
                
                Category category = new Category();
                category.setId(id);
                category.setName(name);
                category.setCreatedAt(createdAt);
                category.setUpdatedAt(updatedAt);
                cat.add(category);
            }       } catch (SQLException ex) {
                ex.printStackTrace();
        }
          System.out.println(cat); 
          
          return true;
      }
         
      public Boolean findAllMenu(){
          
          System.out.println(menuService.findAll(menuRepo));
          return true;
                 
      }
      
      public Boolean findAllFoodItem(){
          System.out.println(foodItemService.findAllFoodItem(foodItemRepo));
          return true;
                 
    }
      
      
public Boolean findCategoryById() {
    System.out.println("Enter id:");
    
    Long id = sc.nextLong();
    sc.nextLine();
    Category category = new Category();
    
      ResultSet resultSet = categoryRepo.findById(category,id);
     try{
          if (resultSet != null && resultSet.next()) {
                Long iid = resultSet.getLong(1);
                String name = resultSet.getString(2);
                LocalDate createdAt= resultSet.getTimestamp(3).toLocalDateTime().toLocalDate();
                LocalDate updatedAt = resultSet.getTimestamp(4).toLocalDateTime().toLocalDate();
        
                System.out.println("Id "+iid);
                System.out.println("Name: "+name);
                System.out.println("CreatedAt "+createdAt);
                System.out.println("UpdatedAt "+updatedAt);
    } else {
        System.out.println("Id not found.");
        return false;
    }
         
     }catch(Exception ex){
         ex.printStackTrace();
     }
   return true;
}



public Boolean deleteCategory() {
    System.out.println("Enter the category ID to delete:");
    Long id = sc.nextLong();
    sc.nextLine();
    Category category = new Category();
    ResultSet resultSet =categoryRepo.findById(category, id);

    if (resultSet != null) {
         categoryRepo.deleteById(category, id);
        System.out.println("Category deleted successfully.");
        return true;
    } else {
        System.out.println("ID not found.");
        return false;
    }
}


   

//public Boolean updateCategory() {
//    System.out.println("Enter the category ID to update:");
//    Long id = sc.nextLong();
//    sc.nextLine();
//    
//    Category category = categoryRepo.findById(id);
//
//    if (category != null) {
//        System.out.println("Enter new category name:");
//        String newName = sc.nextLine();
//        category.setName(newName);
//
//        category = categoryRepo.updateById(category,id);
//        return true;
//    } else {
//        System.out.println("ID not found.");
//        return false;
//    }
//}

   

      
}
