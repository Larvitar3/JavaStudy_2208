package db_connect.ch02;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import db_connect.ch01.DBClient;

public class MemberInfoSqlDaoClone implements IMemberInfoDaoClone {

	private static final String TABLE_NAME = "userTBL";
	private DBClientClone client;
	private Connection connection;

	public MemberInfoSqlDaoClone() {
		client = DBClientClone.getInstance();
	}

	@Override
	public ArrayList<MemberDtoClone> selectAll() {

		connection = client.getConnection();
		ArrayList<MemberDtoClone> resultData = new ArrayList<>();
		String sqlFormat = "SELECT * FROM %s";
		String sql = String.format(sqlFormat, TABLE_NAME);

		Statement stmt = null;
		ResultSet rs = null;

		try {
			stmt = connection.createStatement();
			rs = stmt.executeQuery(sql);
			while (rs.next()) {
				MemberDtoClone dtoc = new MemberDtoClone();

				dtoc.setUserName(rs.getString("userName"));
				dtoc.setBirtYear(rs.getInt("birtYear"));
				dtoc.setAddress(rs.getString("address"));
				dtoc.setMobile(rs.getString("mobile"));
				resultData.add(dtoc);

			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (stmt != null) {
				try {
					stmt.close();
					connection.close();
					DBClientClone.connectClose();
				} catch (SQLException e) {
					e.printStackTrace();
				}

			}

		}

		return resultData;
	}

	@Override
	public MemberDtoClone select(String userName) {
		connection = client.getConnection();
		MemberDtoClone dtoc = null;
		String sqlFormat = "SELECT * FROM %s WHERE userName = '%s' ";
		String sql = String.format(sqlFormat, TABLE_NAME, userName);

		Statement stmt = null;
		ResultSet rs = null;

		try {
			stmt = connection.createStatement();
			rs = stmt.executeQuery(sql);

			while (rs.next()) {
				dtoc = new MemberDtoClone();
				dtoc.setUserName(rs.getString("userName"));
				dtoc.setBirtYear(rs.getInt("birtYear"));
				dtoc.setAddress(rs.getString("address"));
				dtoc.setMobile(rs.getString("mobile"));
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (stmt != null) {
				try {
					stmt.close();
					connection.close();
					DBClientClone.connectClose();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}

		return dtoc;
	}

	@Override
	public int insert(MemberDtoClone dtoc) {
		connection = client.getConnection();

		String sqlFormat = " INSERT INTO %s VALUES('%s',%s,'%s','%s') ";
		String sql = String.format(sqlFormat, TABLE_NAME, dtoc.getUserName(), dtoc.getBirtYear(), dtoc.getAddress(),
				dtoc.getMobile());
		System.out.println(sql);

		Statement stmt = null;
		int result = 0;

		try {
			stmt = connection.createStatement();
			result = stmt.executeUpdate(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (stmt != null) {
				try {
					stmt.close();
					connection.close();
					DBClientClone.connectClose();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}

		return result;
	}

	@Override
	public int update(MemberDtoClone dtoc) {
		MemberDtoClone memberDtoClone = select(dtoc.getUserName());
		Statement stmt = null;
		connection = client.getConnection();
		int result = 0;
		if (memberDtoClone != null) {
			connection = client.getConnection();
			String sqlFormat = "UPDATE %s SET mobile = '%s' WHERE userName = '%s' ";
			String sql = String.format(sqlFormat, TABLE_NAME, dtoc.getMobile(), dtoc.getUserName());
			System.out.println(sql);

			try {
				stmt = connection.createStatement();
				result = stmt.executeUpdate(sql);
			} catch (SQLException e) {
				e.printStackTrace();
			} finally {
				if (stmt != null) {
					try {
						stmt.close();
						connection.close();
						DBClientClone.connectClose();
					} catch (SQLException e) {
						e.printStackTrace();
					}
				}
			}
		} else {
			System.out.println("해당하는 레코드가 존재하지 않습니다.");
		}

		return result;
	}

	@Override
	public int delete(String userName) {
		connection = client.getConnection();
		
		String sqlFormat = "DELETE FROM %s WHERE userName = '%s' ";
		String sql = String.format(sqlFormat, TABLE_NAME, userName);
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
