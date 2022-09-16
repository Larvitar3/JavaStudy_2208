package ch06;

public class MainTest1 {

	public static void main(String[] args) {
		
		// 객체 : 메모리에 올라갔을 때 객체라고 한다 (인스턴스)
		Student studentKim = new Student();
		studentKim.studentName = "김왕식";
		studentKim.studentId = 1;
		studentKim.address = "강원도 춘천";
		
		//기능
		studentKim.showStudentInfo();
		studentKim.study();
		
		Student studentLee = new Student();
		studentLee.studentName = "이비식";
		studentLee.studentId = 2;
		studentLee.address = "강원도 원주";
		
		studentLee.showStudentInfo();
		studentLee.study();
		
		// kim의 변수 이름에 접그내서 화면에 결과를 출력
		System.out.println(studentKim.studentName);
		System.out.println(studentLee.studentName);
		
		studentKim.study();
		studentLee.study();
		studentKim.breakTime();
		studentKim.cleanUp();

	}

}
