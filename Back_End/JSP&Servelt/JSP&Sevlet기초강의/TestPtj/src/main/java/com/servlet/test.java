package com.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.sql.*;
 
public class test{
    public static void main(String args[]){
        Connection con = null;
 
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            con=DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/mydb?serverTimezone=UTC", // DB URL
                    "root", "0000");  // USER_NAME°ú PASSWORD
            System.out.println("Success");
        }
        catch(SQLException ex){ 
            System.out.println("SQLException" + ex);
            ex.printStackTrace();
        }
        catch(Exception ex){ 
            System.out.println("Exception:" + ex);
            ex.printStackTrace();
        }
    }
}