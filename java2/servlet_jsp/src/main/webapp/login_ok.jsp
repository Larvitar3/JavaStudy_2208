<%@page import="java.io.PrintWriter"%>
<%@page import="java.util.Enumeration"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3>여기는 login_form.html에서 넘어온 데이터를 처리하는 곳</h3>
	<p>넘어온 데이터를 처리하고 다시 사용자 한테 응답 처리까지 진행한다.</p>

	<%!String email;
	String pwd;%>
	<%
	
	// 요청 응답 시 한글 처리를 위해서 셋팅
	// get 방식 때 한글처리를 따로, post 방식 때 한글 처리 따로
	/* request.setCharacterEncoding("UTF-8"); */
	// 스트립트 릿에서 request 객체를 이용해서 값을 받아보자
	// 문제: 전체 key 값을 받고 싶다면 ?
	Enumeration<String> key = request.getParameterNames();
	
	while (key.hasMoreElements()) {
		String data = key.nextElement();
		System.out.println("key 값 확인 : " + data);
	}
	
	email = request.getParameter("email");
	pwd = request.getParameter("pwd");
	String hobby = request.getParameter("hobby");
	String[] likes = request.getParameterValues("like");
	
	PrintWriter printWriter = response.getWriter();
	printWriter.write("email : " + email + "<br/>");
	printWriter.write("pwd : " + pwd + "<br/>");
	printWriter.write("hobby : " + hobby + "<br/>");
	
	for(int i =0; i <likes.length; i++){
		System.out.println("likes :  " + likes[i]);
	} 
	
	
/* 	response.setContentType("text/html; charset=UTF-8");
	PrintWriter printWriter = response.getWriter();
	out.write("email : " + email + "<br/>");
	out.write("pwd : " + pwd + "<br/>");
	out.write("hobby : " + hobby + "<br/>");
	
	for(int i =0; i <likes.length; i++){
		out.print("likes : "+ likes[i] + "<br/>");
	} */
	
	%>
	

</body>
</html>












