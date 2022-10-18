package db_connect.ch03;

import java.util.ArrayList;

public class MainTest {
	

	public static void main(String[] args) {
		EmployeeDao dao = new EmployeeDao();
		ArrayList<EmployeeDto> eList = dao.showTitleEmpInfo("Staff");
		for (EmployeeDto employeeDto : eList) {
			System.out.println(employeeDto);
		}
		
		ArrayList<EmployeeDto> dList = dao.showManagerInfo("Customer Service");
		for (EmployeeDto employeeDto : dList) {
			System.out.println(employeeDto);
		}


		ArrayList<Integer> salaryCount = dao.showSalaryCount("Georgi", "Facello");				
		System.out.println
		( "연봉을 받은 횟수 『 " +  salaryCount + " 』 회 입니다. ");
		
		int titleCount = dao.showTitleEmpCount("Senior Engineer");
		System.out.println("직원 수 『 " + titleCount + "』 명 입니다.");
		
		ArrayList<EmployeeDto> SList = dao.showSalary("Kazuhide", "Peha");
		for (EmployeeDto employeeDto : SList) {
			System.out.println(employeeDto);
		}
		
		
	}
}
