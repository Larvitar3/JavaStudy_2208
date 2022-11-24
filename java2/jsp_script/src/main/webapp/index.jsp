<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<!-- Jsp 선언태그 -->
<!-- 멤버 변수와 메서드 등 선언 가능 -->
<!-- 선언 태그에선 식 사용 불가 ( 선언만 가능 -->
	<%!
		int num = 10;
		String str = "1234";
		ArrayList<String> list = new ArrayList<String>();
		
		public void myMethod(){
	
		}
		
	%>
	
	<%--  --%>
	
	<%
		System.out.println(num);
	%>

<section>
	<p>당신의 한국나이는 <%= num %> 입니다.</p>
</section>

</body>
</html>
















