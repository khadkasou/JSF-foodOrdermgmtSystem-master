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
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;


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
        cat.setId(sc.nextInt());

        System.out.println("enter category name: ");
        cat.setName(sc.next());
        
        System.out.println("Enter createdAt: ");
        String createdAtStr = sc.next();
        LocalDate createdAt = LocalDate.parse(createdAtStr, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        cat.setCreatedAt(createdAt);
        
        System.out.println("Enter updatedAt: ");
        String updatedAtStr = sc.next();
        LocalDate updatedAt = LocalDate.parse(updatedAtStr, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        cat.setUpdatedAt(updatedAt);
        
       
        catergoryService.save(cat,categoryRepo);
        System.out.println(cat);
        
        return  true;
    }
    
    public Boolean saveUser(){
        
        User user = new User();
        System.out.println("Create/Register new user");
        
        System.out.println("Enter id: ");
        user.setUser_id(sc.nextInt());
        
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
        menu.setMenu_id(sc.nextInt());
        
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
         food.setFoo_id(sc.nextInt());
          
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
          
          System.out.println(catergoryService.findAll(categoryRepo)); 
          
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
    
    int id = sc.nextInt();
    sc.nextLine();
    
    Category cat = categoryRepo.findById(id);
    
    if (cat != null) {
        System.out.println("Category details:");
        System.out.println("ID: " + cat.getId());
        System.out.println("Name: " + cat.getName());
        System.out.println("CreatedAt: "+ cat.getCreatedAt());
        System.out.println("UpdateAt: "+ cat.getUpdatedAt());
        return true;
        
    } else {
        System.out.println("Category not found.");
        return false;
    }
}



      
      
}
