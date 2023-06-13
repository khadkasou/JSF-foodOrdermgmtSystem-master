/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.souraj.foodorder.souraj;

import com.souraj.foodorder.souraj.model.Category;
import com.souraj.foodorder.souraj.model.Menu;
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
            System.out.println("3. Exit");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    input.categoryInput();
                    break;
                case 2:
                    input.menuInput();
                    break;
                case 3:
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
}


