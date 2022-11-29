<%@page import="java.util.ArrayList"%>
<%@page import="com.dto.MovieDto" %>
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
		ArrayList<MovieDto> list = (ArrayList<MovieDto>)request.getAttribute("movieList");
	%>
	
		
	<table>
		<thead>
			<tr>
				<td>번호</td>
				<td>영화이름</td>
			</tr>
		</thead>
		<tbody>
			<%
				for(int i =0; i < list.size(); i++){ %>
					<tr>
						<td><%= list.get(i).get번호() %></td>
						<td><%= list.get(i).get이름() %></td>
					</tr>
			<%	}
			%>
		</tbody>
	</table>
</body>
</html>