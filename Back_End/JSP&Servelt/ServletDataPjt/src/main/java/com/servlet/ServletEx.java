package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Servlet;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ServletEx")
public class ServletEx extends HttpServlet implements Servlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//servletParameter
		String adminId = getServletConfig().getInitParameter("adminId");
		String adminPw = getServletConfig().getInitParameter("adminPw");
		
		PrintWriter out = response.getWriter();
		out.print("<p>adminId : " +  adminId + "</p>");
		out.print("<p>adminPw : " +  adminPw + "</p>");
		
		//Context Parameter
		String imgDir =  getServletContext().getInitParameter("imgDir");
		String testServerIp =  getServletContext().getInitParameter("testServerIp");
		
		PrintWriter out1 = response.getWriter();
		out1.print("<p>imgDir : " +  imgDir + "</p>");
		out1.print("<p>testServerIp : " +  testServerIp + "</p>");
		
		//contextAttribute
		getServletContext().setAttribute("connectedIP", "165.62.58.33");
		getServletContext().setAttribute("connectedUser", "gildong");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
