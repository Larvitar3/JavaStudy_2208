package ch03;

public class MainTest2 {

	public static void main(String[] args) {
		
		// 산술 연산자
		int number1 = 5 + 3;
		int number2 = 5 - 3;
		int number3 = 5 * 3;
		// double number4 = 5/ 3; 
		// (=)대입연산자는 우선순위가 가장 낮기때문에 5/3이 먼저 계산되어 들어간다. 
		double number4 = 5 / 3.0; // 정확한 소수점을 얻기 위해선 한쪽이라도 실수가 있어야한다.
		int number5 = 5 % 3;
		
		System.out.println(number1);
		System.out.println(number2);
		System.out.println(number3);
		System.out.println(number4);
		System.out.println(number5);
		
		// 문제
		// 1. (12 + 3 ) / 3 값을 출력하고 값이 맞는지 검증
		double num1 = (12+3) / 3.0;
		System.out.println(num1);
		num1 = (int)(12+3) / 3.0;
		System.out.println(num1);
		
		// 2. (25 % 2) 값을 화면에 출력
		int num2 = 25 % 2;
		System.out.println(num2);
		
	}

}
