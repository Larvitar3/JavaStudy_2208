package db_connect.ch03;

import java.util.ArrayList;

public interface IEmployeeDao {
	// 기능을 출력하기 위한 재료를 넣는 코드
	
	// 해당 직함의 직원 이력 출력 ( 하나가 아닌 여러개의 결과가 출력되므로 Array사용 )
	// 매개변수에는 필요한 조건의 컬럼명을 적는다.
	ArrayList<EmployeeDto> showTitleEmpInfo(String title);
	
	// 부서명을 받아서 해당 부서의 역대 매니저 정보 출력
	ArrayList<EmployeeDto> showManagerInfo(String deptName);
	
	// 이름 받아서 연봉 받은 횟수 반환
	ArrayList<Integer> showSalaryCount(String firstName, String lastName);
	
	// 현재 해당 직함을 가진 직원 수 반환
	int showTitleEmpCount(String title);
	
	// 직원이 가장 최근에 받은 연봉(최고 연봉) 반환
	ArrayList<EmployeeDto> showSalary(String firstName, String lastName);
	
}
