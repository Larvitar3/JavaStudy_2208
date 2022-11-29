<%@page import="javax.sql.DataSource"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@page import="javax.naming.InitialContext"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		InitialContext initialContext = new InitialContext();
		DataSource dataSource = (DataSource)initialContext.lookup("java:comp/env/jdbc/mysqlDB");
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		String query = "select * from 영화";
		
		conn = dataSource.getConnection();
		pstmt = conn.prepareStatement(query);
		rs = pstmt.executeQuery();
		
		while(rs.next()){
			out.print(rs.getString("이름"));
			out.print("<br/>");
		}
		
	%>

	<h3>
		<a href="/boot/movieInfo">영화 정보 모두 조회하기</a>
	</h3> 
	<div>
		<form action="movieInfo" method="get">
		<input type="submit" value="영화 정보 모두 조회하기">
		</form>
	</div>
	
	<div>
	<h3>
		영화 정보 이름 조회하기
	</h3> 
		<form action="MovieInfoSelectServlet" method="get">
			영화이름 : <input type="text" name="movieName"> 
			<input type="submit" value="영화 검색 ">
		</form>
	</div>


</body>
</html>