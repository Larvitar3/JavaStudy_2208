package db_connect.ch02;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class DBClientClone {

	private static final String DB_HOST = "localhost"; 
	private static final int DB_PORT = 3306;
	private static final String DB_DATABASE_NAME = "shopdb";
	private static final String DB_CHARSET = "UTF-8";
	private static final String DB_USER_NAME = "root";
	private static final String DB_PASSWORD = "asd1234";
	
	private static Connection conn = null;
	private static DBClientClone dbClinet;
	
	static DBClientClone getInstance() {
		if(dbClinet == null) {
			dbClinet = new DBClientClone();
		}
		return dbClinet;
	}
	
	public Connection getConnection() {
		if(conn == null) {
			String urlFormat = "jdbc:mysql://%s:%d/%s?serverTimezone=Asia/Seoul&characterEncoding=%s";
			String url = String.format(urlFormat, DB_HOST, DB_PORT, DB_DATABASE_NAME, DB_CHARSET);
			
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				conn = DriverManager.getConnection(url, DB_USER_NAME, DB_PASSWORD);
				System.out.println("연결 성공했습니다.");
			} catch (ClassNotFoundException e) {
				System.out.println("연결 실패 했습니다.");
				e.printStackTrace();
			} catch (SQLException e) {
				System.out.println("연결 실패 했습니다.");
				e.printStackTrace();
			}
		}
		return conn;
	}
	
	public static void connectClose() {
		if(conn != null) {
			try {
				conn.close();
				System.out.println("연결이 정상적으로 종료되었습니다.");
			} catch (SQLException e) {
				System.out.println("연결이 종료되지 않았습니다.");
				e.printStackTrace();
			}
			conn = null;
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
