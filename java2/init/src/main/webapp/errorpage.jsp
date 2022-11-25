<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <!-- error 발생 시 넘어오는 페이지 ▼ -->
    <%@ page isErrorPage="true" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	여기에 올까요????
	<%
		exception.getClass().getName();
	%>
</body>
</html>