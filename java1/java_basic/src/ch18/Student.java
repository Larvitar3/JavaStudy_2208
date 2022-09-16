package ch18;

// !! 모든 클래스의 최상위 클래스는 Object class이다.
// 자바에서는 extends 키워드를 단 한번만 사용할 수 있다.
// 자바에서는 다중 상속을 지원하지 않는다.
// 단, 최상이 클래스인 Object클래스는 예외
public class Student extends Object{

	private int studentId;
	private String studentName;
	
	public Student(int studentId, String studentName) {
		this.studentId = studentId;
		this.studentName = studentName;
	}
	// 문제 1
	// toString 메서드 재정의
	// 학번 : , 이름 :
	
	@Override
	public String toString() {
		return "학번 : " + studentId + "  이름 : " + studentName; 
	}
	
	// 문제 2
	// equals메서드 재정의
	// 조건 : 학생의 이름과 학생의 ID값이 같다면 같은 학생
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Student) {
			Student tempStudent = (Student) obj;
			if(this.studentId == tempStudent.studentId
					&& this.studentName == tempStudent.studentName) {
				return true;
			}
		}
		return false;
	}
	
	
	
	
	
	
	
	
}
