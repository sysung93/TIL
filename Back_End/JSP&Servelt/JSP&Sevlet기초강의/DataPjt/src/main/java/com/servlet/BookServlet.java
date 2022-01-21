package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/bs")
public class BookServlet extends HttpServlet {
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();
		
		private final String JDBC_DRIVER = "com.mysql.jdbc.Driver"; //����̹�
		private final String DB_URL = "jdbc:mysql://localhost/3306student_db?&useSSL=false"; //������ DB ����
			
		private final String USER_NAME = "student_manager"; //DB�� ������ ����� �̸��� ����� ����
		private final String PASSWORD = "student0509"; //������� ��й�ȣ�� ����� ����
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		doGet(request, response);
	}

}
