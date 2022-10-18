package db_connect.ch03;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.mysql.cj.xdevapi.PreparableStatement;

public class EmployeeDao implements IEmployeeDao {

	// 의존성 컴포지션 관계
	private DBHelper dbHelper;
	private Connection connection;
//	private Statement stateme0nt;  ▼
	private PreparedStatement preparedStatement;

	private ResultSet resultSet;

	public EmployeeDao() {
		this.dbHelper = DBHelper.gerInstance();
	}

	@Override
	public ArrayList<EmployeeDto> showTitleEmpInfo(String title) {

		ArrayList<EmployeeDto> resultList = new ArrayList<>();
		/*
		 * SELECT * FROM employees as E JOIN titles as T ON E.emp_no = T.emp_no WHERE
		 * T.title = ?
		 */

		// preparedStatement를 사용하면 '%s'를 ?로만 사용할 수 있다.
		String sql = "SELECT * " + " FROM employees as E " + " JOIN titles as T " 
				+ " ON E.emp_no = T.emp_no"
				+ " WHERE T.title =  ? ";

		try {
			preparedStatement = dbHelper.getConnention().prepareStatement(sql);
			preparedStatement.setString(1, title);
			resultSet = preparedStatement.executeQuery();
			System.out.println(sql);

			while (resultSet.next()) {
				EmployeeDto dto = new EmployeeDto();
				dto.setEmpNo(resultSet.getString("emp_no"));
				dto.setFirstName(resultSet.getString("first_name"));
				dto.setTitle(resultSet.getString("title"));

				resultList.add(dto);
			}
		} catch (Exception e) {

		} finally {
			try {
				resultSet.close();
				preparedStatement.close();
				dbHelper.connectionClose();
			} catch (Exception e2) {

			}

		}
		return resultList;
	}

	@Override
	public ArrayList<EmployeeDto> showManagerInfo(String deptName) {

		ArrayList<EmployeeDto> resultList = new ArrayList<>();

		String sql = "SELECT *" 
		        + " FROM dept_manager AS DM " 
				+ " JOIN departments  AS D" 
		        + " ON D.dept_no = DM.dept_no "
				+ " JOIN employees AS E" 
		        + " ON DM.emp_no = E.emp_no"
				+ " WHERE D.dept_name =  ? ";

		try {
			preparedStatement = dbHelper.getConnention().prepareStatement(sql);
			preparedStatement.setString(1, deptName);
			resultSet = preparedStatement.executeQuery();

			while (resultSet.next()) {
				EmployeeDto dto = new EmployeeDto();
				dto.setEmpNo(resultSet.getString("emp_no"));
				dto.setDeptNo(resultSet.getString("dept_no"));
				dto.setDeptName(resultSet.getString("dept_name"));
				dto.setFirstName(resultSet.getString("first_name"));

				resultList.add(dto);
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				resultSet.close();
				preparedStatement.close();
				dbHelper.connectionClose();
			} catch (Exception e) {

			}

		}

		return resultList;
	}

	@Override
	public ArrayList<Integer> showSalaryCount(String firstName, String lastName) {

		ArrayList<Integer> IntegerList = new ArrayList<>();
		
		int value = 0;
		String sql = " SELECT COUNT(*) AS C"
				+ " FROM salaries as S"
				+ " JOIN employees as E"
				+ " ON S.emp_no = E.emp_no"
				+ " WHERE E.first_name = ? and E.last_name = ?"
				+ " GROUP BY E.emp_no ";
		try {
			preparedStatement = dbHelper.getConnention().prepareStatement(sql);
			preparedStatement.setString(1, firstName);
			preparedStatement.setString(2, lastName); 
			resultSet = preparedStatement.executeQuery();

			while (resultSet.next()) {
				
				value = resultSet.getInt("C");
				IntegerList.add(value);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				preparedStatement.close();
				dbHelper.connectionClose();
			} catch (SQLException e) {
				e.printStackTrace();
			} 
		}

		return IntegerList ;
	}

	@Override
	public int showTitleEmpCount(String title) {

		int value = 0;
		String sql = "SELECT COUNT(*) AS C" + " FROM titles as T" + " WHERE T.title = ? ";

		try {
			preparedStatement = dbHelper.getConnention().prepareStatement(sql);
			preparedStatement.setString(1, title);
			resultSet = preparedStatement.executeQuery();
			
			if(resultSet.next()) {
				value = resultSet.getInt("C");
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				resultSet.close();
				preparedStatement.close();
				dbHelper.connectionClose();
			} catch (Exception e) {

			}
		}

		return value;
	}

	@Override
	public ArrayList<EmployeeDto> showSalary(String firstName, String lastName) {
		
		ArrayList<EmployeeDto> resultList = new ArrayList<>();
		
		String sql ="SELECT *, MAX(S.salary) AS MS , MAX(S.from_date) AS MD"
				+ " FROM salaries AS S"
				+ " JOIN employees AS E"
				+ " ON S.emp_no = E.emp_no"
				+ " WHERE E.first_name = ? AND E.last_name = ?"
				+ " GROUP BY E.emp_no" ; 
		
		try {
			preparedStatement = dbHelper.getConnention().prepareStatement(sql);
			preparedStatement.setString(1, firstName);
			preparedStatement.setString(2, lastName);
			resultSet = preparedStatement.executeQuery();

			while (resultSet.next()) {
				EmployeeDto dto = new EmployeeDto();
				dto.setFirstName(resultSet.getString("first_name"));
				dto.setLastName(resultSet.getString("last_name"));
				dto.setEmpNo(resultSet.getString("emp_no"));
				dto.setMaxSalary(resultSet.getString("MS"));
				dto.setDate(resultSet.getString("MD"));
				
				resultList.add(dto);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				preparedStatement.close();
				dbHelper.connectionClose();
			} catch (SQLException e) {
				e.printStackTrace();
			} 
		}
		
		
		return resultList;
	}
	// 재료를 사용해 결과를 뽑아내는 기능을 구현

}
