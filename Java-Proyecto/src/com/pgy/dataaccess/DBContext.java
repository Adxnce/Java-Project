/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pgy.dataaccess;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author adsan
 */
public class DBContext {
    
    private Connection conexion;
    
    public DBContext() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/BD_DulceHogar";
            String user = "root";
            String pass = "Ad14032001an#";
            conexion = (Connection) DriverManager.getConnection(url,user,pass);
        }
        catch(SQLException | ClassNotFoundException ex){
            System.out.println("Error: " + ex.getMessage());
        }
    }
    
    public Connection getConexion(){
        return conexion;
    }
}   
