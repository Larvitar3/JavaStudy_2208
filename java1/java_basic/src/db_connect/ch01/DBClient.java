package db_connect.ch01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class DBClient {

	// String url =
	// "jdbc:mysql://localhost:3306/shopdb?serverTimezone=Asia/Seoul&characterEncoding=UTF-8";
	private static final String DB_HOST = "localhost"; // 127.0.0.1
	private static final int DB_PORT = 3306;
	private static final String DB_DATABASE_NAME = "shopdb";
	private static final String DB_CHARSET = "UTF-8";
	private static final String DB_USER_NAME = "root";
	private static final String DB_PASSWORD = "asd1234";

	private static Connection conn = null; // 자바 개바자들이 만들어준
	private static DBClient dbClinet; // 사용자 정의 클래스

	// 외부에서 바로 생성하는 것을 막게 설계
	private DBClient() {

	}

	static DBClient getInstance() {
		// 동기화 필요
		if (dbClinet == null) {
			dbClinet = new DBClient();
		}
		return dbClinet;
	}

	private static void unBindingDBClient() {
		dbClinet = null;
	}

	// 연결
	public Connection getConnection() {
		// 방어적 코드
		if (conn == null) {
			// 연결
			String urlFormat = "jdbc:mysql://%s:%d/%s?serverTimezone=Asia/Seoul&characterEncoding=%s";
			String url = String.format(urlFormat, DB_HOST, DB_PORT, DB_DATABASE_NAME, DB_CHARSET);
			// MYSQL JDBC 드라이버를 클래스로 로딩해서 DriverManager 클래스를 사용한다.
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				conn = DriverManager.getConnection(url, DB_USER_NAME, DB_PASSWORD);
				System.out.println(">>> Connetion Success <<<");
			} catch (ClassNotFoundException e) {
				System.out.println(">>> Connetion Fail <<<");
				e.printStackTrace();
			} catch (SQLException e) {
				System.out.println(">>> Connetion Fail <<<");
				e.printStackTrace();
			}

		}
		return conn;
	}

	// 해제
	public static void connectClose() {
		if (conn != null) {
			try {
				conn.close();
				System.out.println(">>> Connetion Close OK <<<");
			} catch (SQLException e) {
				System.out.println(">>> Connetion Close No <<<");
				e.printStackTrace();
			}
			conn = null;
		}
	}

}
