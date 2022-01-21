<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<%!
	String adminId;
	String adminPw;
	
	String imgDir;
	String testServerIP;
	String realServerIP;
	%>
	
	<!-- config -->
	<%
	adminId = config.getInitParameter("adminId");
	adminPw = config.getInitParameter("adminPw");
	%>
	
	<p>adminId: <%= adminId %> </p>
	<p>adminPw: <%= adminPw %> </p>
	 
	 <!-- application -->
	<%
	imgDir = application.getInitParameter("imgDir");
	testServerIP = application.getInitParameter("testServerIP");			
	realServerIP = application.getInitParameter("realServerIP");
	%>
	
	<p>imgDir : <%=imgDir %></p>
	<p>testServerIp : <%= testServerIP %></p>
	<p>realServerIP : <%= realServerIP %></p>
	
	
</body>
</html>