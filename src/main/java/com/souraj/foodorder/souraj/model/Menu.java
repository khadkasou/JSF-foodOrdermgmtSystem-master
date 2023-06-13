package com.souraj.foodorder.souraj.model;

import java.time.LocalDate;
import java.util.Date;


public class Menu {
    int menu_id;
    String name;
    LocalDate fromDate;
    LocalDate toDate;
    Date createdAt;
    Date updatedAt;

//    List<Menu> menusList = new ArrayList<>();

    public Menu() {
    }

    public Menu(int menu_id, String name, LocalDate fromDate, LocalDate toDate, Date createdAt, Date updatedAt) {
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
    
    

//    public Boolean addMenu() {
//        System.out.println("Create Menu");
//
//        Scanner sc = new Scanner(System.in);
//
//        System.out.println("Enter menu id:");
//        int menu_id = sc.nextInt();
//
//        System.out.println("Enter menu name: ");
//        String name = sc.next();
//
//        System.out.println("Enter the fromDate (in dd/MM/yyyy format): ");
//        String fromDateStr = sc.next();
//        LocalDate fromDate = LocalDate.parse(fromDateStr, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
//
//        System.out.println("Enter the toDate (in dd/MM/yyyy format): ");
//        String toDateStr = sc.next();
//        LocalDate toDate = LocalDate.parse(toDateStr, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
//
//        menusList.add( new Menu( menu_id,name, fromDate,toDate, null, null));
//        
//        return true;
//    }
//    
//    public  Boolean returnMenu(){
//        
//        for(Menu menu :menusList){
//            System.out.println(menu.getMenu_id());
//            System.out.println( menu.getName());
//            System.out.println(  menu.getFromDate());
//            System.out.println(menu.getToDate());
//            
//        }
//        return  true;
//    }

    @Override
    public String toString() {
        return "Menu{" + "menu_id=" + menu_id + ", name=" + name + ", fromDate=" + fromDate + ", toDate=" + toDate + ", createdAt=" + createdAt + ", updatedAt=" + updatedAt + '}';
    }
    
    
}
