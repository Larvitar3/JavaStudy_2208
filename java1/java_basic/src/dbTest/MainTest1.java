package dbTest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.naming.spi.DirStateFactory.Result;

public class MainTest1 {
	
	public static void main(String[] args) {
		
		// 리플렉션
		try {
			// 동적 바인딩
			// 컴파일 시점에 문자열로 저장해두고 런 타임 시점에 클래스를 메모리에 올리는 것
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			String url = "jdbc:mysql://localhost:3306/shopdb?serverTimezone=Asia/Seoul&characterEncoding=UTF-8";
			
			Connection conn = DriverManager.getConnection(url, "root", "asd1234");
			
			Statement stmt = conn.createStatement();
			String sql = "SELECT * FROM membertbl";
			ResultSet rs = stmt.executeQuery(sql);
			while(rs.next()) {
				System.out.println(rs.getString("memberId"));
				System.out.println(rs.getString("memberName"));
			}

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	
		
		
		
		
		
		
	}
}
