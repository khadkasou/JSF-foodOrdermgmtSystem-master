/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.souraj.foodorder.souraj;

import com.souraj.foodorder.souraj.model.Category;
import com.souraj.foodorder.souraj.serviceImpl.UserInput;
import java.util.Scanner;

/**
 *
 * @author ksouraj
 */
public class FoodOrderManagementSystemSouraj {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        UserInput input = new UserInput();

        while (true) {
            System.out.println("What do you want to add?");
            System.out.println("1. Category");
            System.out.println("2. Menu");
            System.out.println("3. FoodItem");
            System.out.println("4. Exit");

            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    CategoryAction(input, sc);
                    break;
                case 2:
                    MenuAction(input, sc);
                    break;
                case 3:
                    FoodItemAction(input, sc);
                    break;
                case 4:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid choice!");
                    continue;
            }

            System.out.println("Do you want to add more? (Y/N)");
            String addMoreChoice = sc.next();

            if (addMoreChoice.equalsIgnoreCase("N")) {
                System.out.println("Exiting...");
                break;
            }
        }

    }

    private static void CategoryAction(UserInput input, Scanner sc) {
        System.out.println("What do you want to do?");
        System.out.println("a. Add Category");
        System.out.println("b. List Category");
        System.out.println("c. Find  Category");
        System.out.println("d. Update Category");
        System.out.println("e. Delete Category");
        String choose = sc.next();

        switch (choose) {
            case "a":
                input.categoryInput();
                break;
            case "b":
                input.findAllCategory();
                break;
            case "c":
                input.findCategoryById();
                break;
//            case "d":
//                input.updateCategory();
//                break;
            case "e":
                input.deleteCategory();
                break;
            
            
        }
    }

    private static void MenuAction(UserInput input, Scanner sc) {
        System.out.println("What do you want to do?");
        System.out.println("a. Add Menu");
        System.out.println("b. List Menu");
        System.out.println("c. Update Menu");
        System.out.println("d. Delete Menu");
        String choose = sc.next();

        switch (choose) {
            case "a":
                input.menuInput();
                break;
            case "b":
                input.findAllFoodItem();
                break;

        }
    }

    private static void FoodItemAction(UserInput input, Scanner sc) {
        System.out.println("What do you want to do?");
        System.out.println("a. Add FoodItem");
        System.out.println("b. List FoodItem");
        System.out.println("c. Update FoodItem");
        System.out.println("d. Delete FoodItem");
        String choose = sc.next();

        switch (choose) {
            case "a":
                input.saveFoodItem();
                break;
            case "b":
                input.findAllFoodItem();
                break;

        }
    }

}
