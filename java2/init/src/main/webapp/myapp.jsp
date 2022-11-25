<%@page import="java.io.PrintWriter"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <!-- 에러페이지 설정 ▼ -->
    <%@ page errorPage="errorpage.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%!
		String imgDir;
		String testServer;
		String realServer;
		String str;
	%>
	
	<%
	
		imgDir = application.getInitParameter("imgDir");
		testServer = application.getInitParameter("testServer");
		realServer = application.getInitParameter("realServer");
		
		// setAttribute 의 getAttribute 사용
		// application.setAttribute(name, object);
		getServletContext().setAttribute("mySqlServerIP", "177.1.23.12");
		getServletContext().setAttribute("mySqlUser", "root");
		
	%>
	
	testServer : <%=testServer %>
	<br>
	realServer : <%=realServer %>
	<br>
	<div>
		<img src="<%=imgDir %>/image1.jpg" alt="닉 이미지">
	</div>
	
	<p>
		sqlIP : <%=getServletContext().getAttribute("mySqlServerIP") %>
		sqlUser : <%=getServletContext().getAttribute("mySqlUser") %>
	</p>
	
	<%
		/* out.print(str.toString()); */
	
/* 		response.sendRedirect("myapp.jsp"); */
	%>
	
</body>
</html>























