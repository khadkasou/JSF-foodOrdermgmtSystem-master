/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.souraj.foodorder.souraj.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ksouraj
 */
public abstract class JdbcAbstractClass<T extends IAbstractEntity> implements JdbcGenericRepo<T>{

    
    private final Connection connection;
    
    public JdbcAbstractClass(){
         Connection conn = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            //
            String url = "jdbc:mysql://localhost:3306/foodordermanagement_db";
            String userName = "root";
            String password = "";
            conn = DriverManager.getConnection(url, userName, password);
            
        } catch (SQLException | ClassNotFoundException exception) {
            
            System.out.println(exception);
        }
        this.connection = conn;  
    }
    
    
    @Override
    public T save(T Object, String query) {
        String sql = "INSERT INTO "+Object.getTableName()+" (username, password, fullname, email) "
                + "VALUES (?, ?, ?, ?)";
        
        try {
            PreparedStatement statement = connection.prepareStatement(query);
            int rowsInserted = statement.executeUpdate();
            if(rowsInserted>0){
                return Object;
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
            
        }
        return null;
    }

    @Override
    public void deleteById(T Object,Long id) {
      
        String sql = "DELETE FROM "+Object.getTableName()+" where id ="+id;
 
     PreparedStatement statement;
        try {
            statement = connection.prepareStatement(sql);
            int rowsDeleted = statement.executeUpdate();
            if (rowsDeleted > 0) {
                System.out.println("Deleted Successfully...");
        }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
     

    }
  @Override
    public ResultSet findById(T Object,Long id) {
       
       String query = " select * from "+Object.getTableName()+" where id="+id;
       
        try {
             Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery(query);
             
                return resultSet;
           
               
        } catch (SQLException ex) {
           ex.printStackTrace();
        }
        
       return  null;
    }
    @Override
    public ResultSet findAll(T Object) {
      
        String sql = "SELECT * FROM "+Object.getTableName();
        Statement statement;
        try {
            statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery(sql);
             
            return resultSet;
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
       
       return null;
    }

  

    @Override
    public T updateById(T Object, Long id) {
        return null;
        
    }
    
    
}
