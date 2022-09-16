package ch11;

public class Employee {
	
	public static int serialNum;
	private int empId;
	private String empName;
	private String empDepartment;
	
	public Employee() {
		serialNum++;
		empId = serialNum;
	}
	
	public int getEmpId() {
		return empId;
	}
	
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	
	public String getEmpName() {
		return empName;
	}
	
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	
	public String getEmpDepartment() {
		return empDepartment;
	}

	public void setEmpDepartmenu(String empDepartment) {
		this.empDepartment = empDepartment;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
