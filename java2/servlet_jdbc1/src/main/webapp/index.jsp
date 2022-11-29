<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
	body {

}
</style>
</head>
<body>
	<header>
		<h1>MySQL 연결 테스트</h1>
	</header>
	<div>
	<%
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		String url = "jdbc:mysql://localhost:3306/shopdb?serverTimezone=Asia/Seoul&characterEncoding=UTF-8";
		
		String dbUser = "root";
		String dbPw = "asd1234";
		String qurey = "SELECT * FROM usertbl";
		
		try{
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection(url, dbUser, dbPw);
			stmt = conn.createStatement();
			rs = stmt.executeQuery(qurey);
			
			while(rs.next()){
				out.print("<br/>");
				out.print(rs.getString("userName"));
				out.print(rs.getString("birtYear"));
				out.print(rs.getString("address"));
				out.print(rs.getString("mobile"));
				out.print("<br/>");
			}
			
		}catch (Exception e){
			
		}finally{
			try{
				rs.close();
				stmt.close();
				conn.close();
				
			}catch (Exception e){
			}

		}

	%>
	</div>
	<div>
		<form action="us"  method="post">
			userName :  <input type="text" name = "username">
			<input type="submit" value="유저 검색 ">
		</form>
	</div>
	
	<div>
		<form action="as" method="post">
			번호 :  <input type="text" name = "number">
			<input type="submit" value="번호 검색 ">
		</form>
	</div>
	
	<div>
		<form action="as" method="post">
			번호 :  <input type="text" name = "number">
			이름 :  <input type="text" name = "name">
			<input type="submit" value="배우 등록">

		</form>
	</div>
	
</body>
</html>




















