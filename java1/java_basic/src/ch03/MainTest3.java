package ch03;

public class MainTest3 {

	public static void main(String[] args) {

		// 복합 대입 연산자
		// 다른연산자와 대입 연사자를 함께 사용하는 것

		/*
		 * int num1 = 1; num1 = num1 + 10; int num2= 1; num2 = num2 + 10; int num3= 1;
		 * num3 = num3 + 10;
		 */

		// 같은 동작을 여러번 입력하여 코드가 길어짐.
		// 복합대입연산자를 활용해서 코드를 간소화 할 수 있음

		int num1 = 1;
		// num1 = num1 + 10;
		num1 += 10;

		int num2 = 10;
		num2 -= 100;
		System.out.println(num2);
		System.out.println("=================");

//		num2 = num2 - 100;
		System.out.println(num2);
		System.out.println("=================");
		
//		num1 = num1 * 2;
//		System.out.println(num1);
		num1 *= 2;
		System.out.println(num1);
		
//		num1 = num1 / 2;
//		System.out.println(num1);
		num1 /= 2;
		System.out.println(num1);
		
//		num1 = num1 % 2;
//		System.out.println(num1);
		num1 %= 2;
		System.out.println(num1);

	} // end of main

} // end of class
