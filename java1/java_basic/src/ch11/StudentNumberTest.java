package ch11;

public class StudentNumberTest {

	public static void main(String[] args) {
		StudentNumber studentnumber1 = new StudentNumber();
		StudentNumber studentnumber2 = new StudentNumber();
		StudentNumber studentnumber3 = new StudentNumber();
		StudentNumber studentnumber4 = new StudentNumber();
		StudentNumber studentnumber5 = new StudentNumber();

		System.out.println();
		System.out.println("=== 학생 정보 ===");

		studentnumber1.setStudentName("박춘식");
		studentnumber1.setStudentClass(3);
		System.out.println("학번: " + studentnumber1.getStudentNumber());
		System.out.println("이름 : " + studentnumber1.getStudentName());
		System.out.println("반번호 : " + studentnumber1.getStudetClass());

		System.out.println();
		System.out.println("=== 학생 정보 ===");

		studentnumber2.setStudentName("김춘식");
		studentnumber2.setStudentClass(5);
		System.out.println("학번: " + studentnumber2.getStudentNumber());
		System.out.println("이름 : " + studentnumber2.getStudentName());
		System.out.println("반번호 : " + studentnumber2.getStudetClass());

		System.out.println();
		System.out.println("=== 학생 정보 ===");

		studentnumber3.setStudentName("이춘식");
		studentnumber3.setStudentClass(2);
		System.out.println("학번: " + studentnumber3.getStudentNumber());
		System.out.println("이름 : " + studentnumber3.getStudentName());
		System.out.println("반번호 : " + studentnumber3.getStudetClass());

		System.out.println();
		System.out.println("=== 학생 정보 ===");

		studentnumber4.setStudentName("정춘식");
		studentnumber4.setStudentClass(1);
		System.out.println("학번: " + studentnumber4.getStudentNumber());
		System.out.println("이름 : " + studentnumber4.getStudentName());
		System.out.println("반번호 : " + studentnumber4.getStudetClass());

		System.out.println();
		System.out.println("=== 학생 정보 ===");

		studentnumber5.setStudentName("양춘식");
		studentnumber5.setStudentClass(3);
		System.out.println("학번: " + studentnumber5.getStudentNumber());
		System.out.println("이름 : " + studentnumber5.getStudentName());
		System.out.println("반번호 : " + studentnumber5.getStudetClass());

	}

}
