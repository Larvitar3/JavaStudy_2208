package com.boot;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/us")
public class UserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public UserServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		String url = "jdbc:mysql://localhost:3306/shopdb?serverTimezone=Asia/Seoul&characterEncoding=UTF-8";
		
		String dbUser = "root";
		String dbPw = "asd1234";
		String driverName = "com.mysql.cj.jdbc.Driver";
		
		// 요청 처리
		request.setCharacterEncoding("UTF-8");
		String userName = request.getParameter("username");
		
		// 응답 처리
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();
		
		String qurey = "SELECT * FROM usertbl WHERE username = '"+userName+"'";
		System.out.println(qurey);
		
		// DB 접근 처리
		try {
			
			Class.forName(driverName);
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
				
		} catch (ClassNotFoundException e) {
			
		} catch (Exception e) {
			
		}finally {
			try {
				rs.close();
				stmt.close();
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	
		}
		
		
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

















