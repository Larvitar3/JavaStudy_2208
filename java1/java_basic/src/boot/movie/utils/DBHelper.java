package boot.movie.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBHelper {
	
	// 단순히 연결과 연결끊기를 하는 기능만 구현

	private static final String DB_HOST = "127.0.0.1";
	private static final int DB_PORT = 3306;
	private static final String DB_DATABASE_NAME = "movies";
	private static final String DB_CHARSET = "UTF-8";
	private static final String DB_USER_NAME = "root";
	private static final String DB_PASSWORD = "asd1234";

	private static DBHelper dbHelper;

	private Connection conn;

	// 싱글톤 DBHelper ( 다른 곳에서 안의 내용은 수정하지 못하게 하는 것 )
	private DBHelper() {

	}

	public static DBHelper gerInstance() {
		if (dbHelper == null) {
			dbHelper = new DBHelper();

		}
		return dbHelper;
	}

	public Connection getConnention() {
		if (conn == null) {
			String urlFormat = "jdbc:mysql://%s:%d/%s?serverTimezone=Asia/Seoul&characterEncoding=%s";
			String url = String.format(urlFormat, DB_HOST, DB_PORT, DB_DATABASE_NAME, DB_CHARSET);

			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				conn = DriverManager.getConnection(url, DB_USER_NAME, DB_PASSWORD);
				System.out.println("연결 성공했습니다.");
			} catch (ClassNotFoundException | SQLException e) {
				e.printStackTrace();
			}

		}
		return conn;
	}

	public void connectionClose() {
		if (conn != null) {
			try {
				conn.close();
				conn = null;
				System.out.println("연결이 정상적으로 종료되었습니다.");
			} catch (SQLException e) {
				System.out.println("연결이 종료되지 않았습니다.");
				e.printStackTrace();
			}
			conn = null;
		}
	}

}
