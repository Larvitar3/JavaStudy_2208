package ch11;

public class StudentNumber {

	public static int serialNum;
	public int studentNumber;
	private String studentName;
	private int studentClass;

	public StudentNumber() {
		serialNum++;
		studentNumber = serialNum;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public int getStudentNumber() {
		return studentNumber;
	}

	public void setStudentNumber(int studentNumber) {
		this.studentNumber = studentNumber;
	}

	public int getStudetClass() {
		return studentClass;
	}

	public void setStudentClass(int studentClass) {
		this.studentClass = studentClass;
	}

}
