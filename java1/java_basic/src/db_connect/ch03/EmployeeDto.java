package db_connect.ch03;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class EmployeeDto {
	
	private String empNo;
	private String deptNo;
	private String deptName;
	private String firstName;
	private String lastName;
	private String title;
	private String maxSalary;
	private String date;
	
	@Override
	public String toString() {
		return "[직원 번호 : " + empNo + ", 부서 번호 : " + deptNo + ", 부서 이름 : " + deptName + ", 직원 이름 : "
				+ firstName + ", 직원 성  : " + lastName + ", 직함  :  " + title + ", 최고 연봉 : " + maxSalary + 
				", 최근 지급 날짜 : " + date + "]";
	}
	
	

}
