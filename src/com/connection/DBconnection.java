/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.connection;

import java.sql.Connection;
import java.sql.DriverManager;


public class DBconnection {

   
    public static  Connection getConnection(){
        Connection con=null;
         try{
             Class.forName("com.mysql.jdbc.Driver");
             con =DriverManager.getConnection("jdbc:mysql://localhost:3306/registration", "root","111111");
        
             System.out.println("Connected Successfully");
        }
        catch(Exception e){
            System.out.println("Error : " + e.getMessage());
            e.printStackTrace();
        }
         return con;
        
    }
    
}
