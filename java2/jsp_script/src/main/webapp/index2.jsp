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

	<%!int num = 10;
	String str = "1234";
	ArrayList<String> list = new ArrayList<String>();

	public void myMethod() {

	}%>

	<%
	if (num > 100) {
	%>

	<div>
		<p>num은 100보다 크다</p>
	</div>

	<%
	} else {
	%>

	<div>
		<p>num은 100보다 작다</p>
	</div>

	<%
	}
	%>

<div>
	<p>num의 값은 <%=num %>이다</p>
</div>


</body>
</html>