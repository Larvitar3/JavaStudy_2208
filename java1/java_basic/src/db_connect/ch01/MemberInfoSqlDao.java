package db_connect.ch01;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import db_connect.ch02.DBClientClone;

public class MemberInfoSqlDao implements IMemberInfoDao {

	private static final String TABLE_NAME = "memberTBL";
	private DBClient client;
	private Connection connection;

	public MemberInfoSqlDao() {
		client = DBClient.getInstance();
		// connection = client.getConnection();
	}

	@Override
	public ArrayList<MemberDto> selectAll() {

		connection = client.getConnection();
		ArrayList<MemberDto> resultData = new ArrayList<>();
		String sqlFormat = "SELECT * FROM %s";
		String sql = String.format(sqlFormat, TABLE_NAME);

		Statement stmt = null;
		ResultSet rs = null;

		try {
			stmt = connection.createStatement();
			rs = stmt.executeQuery(sql);
			while (rs.next()) {
				MemberDto dto = new MemberDto();

				dto.setMamberId(rs.getString("memberId"));
				dto.setMemberName(rs.getString("memberName"));
				dto.setMemberAddress("memberAddress");
				resultData.add(dto);

			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				closeDb(stmt);
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return resultData;

	}

	// excuteQurey
	// excuteUpdata

	@Override
	public MemberDto select(String memberId) {
		connection = client.getConnection();
		MemberDto dto = null;
		// 쿼리문을 생성
		// 결과를 받아야한다.
		String sqlFormat;
		String sql;
		sqlFormat = " SELECT * FROM %s WHERE memberId = '%s' ";
		sql = String.format(sqlFormat, TABLE_NAME, memberId);

		// SQL 구문 객체를 만들어 주어야 한다.
		Statement stmt = null;
		// 결과를 받을 수 있는 객체를 만들어 주어야 한다.
		ResultSet rs = null;
		try {
			stmt = connection.createStatement();
			rs = stmt.executeQuery(sql);

			while (rs.next()) {
				dto = new MemberDto();
				dto.setMamberId(rs.getString("memberId"));
				dto.setMemberName(rs.getString("memberName"));
				dto.setMemberAddress(rs.getString("memberAddress"));

			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (stmt != null) {
				try {
					closeDb(stmt);
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}

		return dto;
	}

	private void closeDb(Statement stmt) throws SQLException {
		stmt.close();
		connection.close();
		DBClient.connectClose();
	}

	@Override
	public int insert(MemberDto dto) {
		connection = client.getConnection();
		// MemberDto를 넘겨 받아 db에 저장하는 기능 구현
		String sqlFormat = "insert into %s values('%s','%s','%s')";
		String sql = String.format(sqlFormat, TABLE_NAME, dto.getMamberId(), dto.getMemberName(),
				dto.getMemberAddress());
		System.out.println(sql);
		Statement stmt = null;
		int result = 0;
		try {
			stmt = connection.createStatement();
			result = stmt.executeUpdate(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				closeDb(stmt);
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return result;

	}

	@Override
	public int update(MemberDto dto) {
		MemberDto contextDto = select(dto.getMamberId());
		// 선행 검사 -- 먼저 SELECT 해서 확인 이후에 데이터를 변경해주는것이 좋다.
		Statement stmt = null;
		connection = client.getConnection();
		int result = 0;
		if (contextDto != null) {
			connection = client.getConnection();
			String sqlFormat = "UPDATE %s SET memberName = '%s' WHERE memberId = '%s' ";
			String sql = String.format(sqlFormat, TABLE_NAME, dto.getMemberName(), dto.getMamberId());
			System.out.println(sql);
			try {
				stmt = connection.createStatement();
				result = stmt .executeUpdate(sql);
			} catch (SQLException e) {
				e.printStackTrace();
			}finally {
				try {
					closeDb(stmt);
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}

		} else {
			System.out.println("해당하는 레코드가 존재하지 않습니다.");
		}
		return result;
	}

	@Override
	public int delete(String memberId) {
		connection = client.getConnection();

		String sqlFormat = "DELETE FROM %s WHERE memberId = '%s' ";
		String sql = String.format(sqlFormat, TABLE_NAME, memberId);
		int result = 0;

		Statement stmt = null;

		try {
			stmt = connection.createStatement();
			result = stmt.executeUpdate(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				stmt.close();
				connection.close();
				DBClientClone.connectClose();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		return result;
	}

}