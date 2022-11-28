<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	
	<!-- 
		로그인 페이지에서 쿠키 값을 확인해서 값이 있다면 화면에 출력
	 -->
	 
	 <%
	 	String saveId = null;
	 Cookie[] cookies = request.getCookies();
	 if(cookies != null){
		 for(Cookie c : cookies){
			 if(c.getName().equals("memberId")){
				 saveId = c.getValue();
			 }
		 }
	 }


	 %>
	
	<form action="loginProc" method="post">
	<%
		if(saveId != null){
	%>
			id : <input type = "text" name="mId"  value="<%=saveId%>">
<%			
		} else {
	 %>
	 id : <input type = "text" name="mId"  value="">
	 <%} %>
		pw : <input type = "text" name="mPw">
		rememberMe <input type="checkbox" name="isSaveId"> 
		<button type="submit"  value="login">login</button>
	</form>
	
</body>
</html>








