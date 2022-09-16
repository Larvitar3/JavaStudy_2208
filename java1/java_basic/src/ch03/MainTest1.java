package ch03;

public class MainTest1 {

	
	// 메인 작업자(쓰레드)
	// 코드의 시작점
	public static void main(String[] args) {
		
		// 부호 연산자 (+.-)
		
		int number = 10;
		System.out.println(-number); // 실제 값은 변하지 않음
		
		number = -number; 
		// 실제 변수에 부호를 변경하는건 ( = ) 대입연산자 사용
		System.out.println(number);

	} // end of main

} // end of class
