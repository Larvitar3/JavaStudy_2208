package com.boot;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/as")
public class ActorServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	// get 과  post  둘 다 사용 시
	Connection conn = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	
	String url = "jdbc:mysql://localhost:3306/movies?serverTimezone=Asia/Seoul&characterEncoding=UTF-8";
	
	String dbUser = "root";
	String dbPw = "asd1234";
	String driverName = "com.mysql.cj.jdbc.Driver";

	public ActorServlet() {
		try {
			Class.forName(driverName);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		// 요청 처리
		request.setCharacterEncoding("UTF-8");
		String number =  request.getParameter("number");
		
		// 응답 처리
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();
		
		 String query = "SELECT * FROM 배우 WHERE 번호 = ? ";
		try {
			conn = DriverManager.getConnection(url, dbUser, dbPw);
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1,number);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				out.print(rs.getString("번호"));
				out.print(rs.getString("이름"));
				out.print(rs.getString("출생"));
				out.print(rs.getString("키"));
				out.print(rs.getString("몸무게"));
				out.print(rs.getString("배우자"));
				out.print("</br>");
			}
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				rs.close();
				pstmt.close();
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	
		}
		
		
	}
	
	private String getCurrentTime() {
		
		LocalDateTime now = LocalDateTime.now();
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:dd:ss");
		String nowTime = formatter.format(now);
		System.out.println(nowTime);
		return "";
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		// 요청처리
		request.setCharacterEncoding("UTF-8");
		String num = request.getParameter("number");
		String name = request.getParameter("name");
		String birth = request.getParameter(getCurrentTime());
		
		// 응답 처리
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();
		
		String qurey = "insert into 배우(번호, 이름, 출생) values (?, ?, ?)";
		// DB 접근 처리
		int result = -1;
		try {
			Connection conn = DriverManager.getConnection(url, dbUser, dbPw);
			pstmt = conn.prepareStatement(qurey);
			pstmt.setString(1, num);
			pstmt.setString(2, name);
			pstmt.setString(3, birth);
			result =  pstmt.executeUpdate();
			if(result == 1) {
				System.out.println("정상 처리");
			}else {
				System.out.println("잘못 된 요청");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if(pstmt != null) pstmt.close();
				if(conn != null) conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	
		}
		
		
	}

}
















