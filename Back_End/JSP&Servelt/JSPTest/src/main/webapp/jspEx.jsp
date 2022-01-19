<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<%@ include file = "header.jsp"%>
	
	<!-- 선언태그 -->
	<%!
	
	int num = 10;
	String str = "jsp";
	ArrayList<String> list = new ArrayList<String>();
	
	public void jspmethod() {
		System.out.println("--jspMethod()--");
	}
	
	%>
	
	<!-- 여기는 HTML 주석 입니다. -->
	<%-- 여기는 JSP 주석 입니다--%>
	
	<!-- 스크립트릿 태그 -->
	<% %>
	
	<%
	if(num > 0) {
	%>
	<p>num > 0</p>
	<%
	} else { 
	%>
	<p>num <= 0</p>
	<%
	}
	%>
	
	<!-- 표현식 태그 -->
	num is <%= num %>
	
	<%@ include file = "Footer.jsp"%>
 

</body>
</html>