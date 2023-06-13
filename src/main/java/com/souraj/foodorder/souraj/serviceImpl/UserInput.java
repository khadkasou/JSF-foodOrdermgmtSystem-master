/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.souraj.foodorder.souraj.serviceImpl;

import com.souraj.foodorder.souraj.model.Category;
import com.souraj.foodorder.souraj.model.FoodItem;
import com.souraj.foodorder.souraj.model.Menu;
import com.souraj.foodorder.souraj.repository.CategoryRepo;
import com.souraj.foodorder.souraj.repository.FoodItemRepo;
import com.souraj.foodorder.souraj.repository.MenuRepo;
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
    
    

    public  Boolean categoryInput() {

        System.out.println("Add category");

        Category cat = new Category();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter category Id: ");
        cat.setCat_id(sc.nextInt());

        System.out.println("enter category name: ");
        cat.setName(sc.next());

        CatergoryServiceImpl catergoryService = new CatergoryServiceImpl();
        cat = catergoryService.save(cat,categoryRepo);

        System.out.println(cat);
        return  true;
    }

    public Boolean menuInput() {
        
        System.out.println("Create Menu");
        
        Menu menu = new Menu();
        Scanner sc = new Scanner(System.in);
        
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
        
        MenuServiceImpl menuService = new MenuServiceImpl();
        menu = menuService.save(menu, menuRepo);
         
        System.out.println(menu);
        return true;
        
    }

    
    
     public Boolean saveFoodItem(){
         
         System.out.println("Enter the foodItem: ");
         
         FoodItem food = new FoodItem(); 
         Scanner  sc = new Scanner(System.in);
         
         System.out.println("Enter id: ");
          food.setFoo_id(sc.nextInt());
          
         System.out.println("Enter name: ");
         food.setName(sc.next());
         
         System.out.println("Enter Description: ");
         food.setDescription(sc.next());
       
         System.out.println("Enter price: ");
         food.setPrice(sc.nextDouble());
         
         FoodItemServiceImpl foodItemService = new FoodItemServiceImpl();
         
         food = foodItemService.save(food, foodItemRepo);
         
         System.out.println(food);
        
        return true; 
     }
     
     
         
}
