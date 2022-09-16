package ch05;

// 설계도
public class Student {
	
	// 학생의 상태 (속성)
	String name; // 멤버변수 ( 참조타입 )
	int height;
	double weight;
	
	Order order; // 멤버
	// 행위 (기능)
	
	public static void main(String[] args) {
		int num1; // 지역
		Order order; // 지역
		Student student; // 지역변수
		
		System.out.println(intAdd(10, 20, 40)); // 바로 호출
		int iAdd = intAdd(10, 20, 30); // 함수에 담아서 호출 <= stack 메모리
		
		System.out.println(doubleAdd(3.7, 2.3, 3.4));
		double dAdd = doubleAdd(3.5, 4.5, 6.5);
		
		System.out.println(iAdd);
		System.out.println(dAdd);
		printAriticle("문 자");
		
		
	}
	
	public static void addNum(int n1) {
		int resuilt;
		UserInfo userInfo;
		n1 = 10;
	}
	
	public static int intAdd(int n1, int n2, int n3) {
		int result = n1 + n2 + n3;
		return  result; 
	}
	public static double doubleAdd(double d1, double d2, double d3) {
		double result = d1 + d2 + d3;
		return result;
	}
	public static void  printAriticle(String article){
		System.out.println(article);
	}
	
}
















