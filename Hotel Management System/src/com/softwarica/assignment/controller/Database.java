/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.softwarica.assignment.controller;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author NV
 */
public class Database {
    private Connection conn;
    protected  PreparedStatement pstmt = null;
    protected  ResultSet rs = null;
    
    public Database() throws ClassNotFoundException{
        Class.forName("com.mysql.jdbc.Driver");
        
    }
    public void open() throws SQLException{
        conn=DriverManager.getConnection("jdbc:mysql://localhost:3360/hotel", "root", "");
        
    }
    public void close() throws SQLException{
        if(conn!=null && !conn.isClosed()){
            conn.close();
            conn=null;
        }
        
    }
    
    
   
   
    }
  
    
    

