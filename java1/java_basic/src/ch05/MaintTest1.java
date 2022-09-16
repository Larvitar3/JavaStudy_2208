package ch05;

public class MaintTest1 {

	public static void main(String[] args) {
		
		System.out.println("프로그램을 시작합니다.");
		
		int num1;
		int num2 = 10;
		
		Student s1 = new Student();
		Student s2 = new Student(); // 변수의 선언과 초기화
		

		System.out.println(num2);
		System.out.println(s2);
		
		// 컴파일 시점 ( 문법 검사 )
		System.out.println(num2);
		System.out.println("===============");
		System.out.println(s2.name);
		System.out.println(s2.height);
		System.out.println(s2.weight);
		
		s2.name = "홍길동";
		s2.height = 170;
		s2.weight = 80.2;
		
		System.out.println(s2.name);
		System.out.println(s2.height);
		System.out.println(s2.weight);
		
		// 참조 타입에 값을 할당하는 방법
		s1.name = "이순신";
		s1.height =185;
		s1.weight = 82.3;
		
		// 참조 타입 s1에 값을 화면에 출력하는 방법.
		System.out.println(s1.name);
		System.out.println(s1.height);
		System.out.println(s1.weight);
		
		
		
		
		
	}

}
