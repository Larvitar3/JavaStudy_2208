package ch03;

public class MainTest4 {

	public static void main(String[] args) {

		// 증감 연산자, 감소 연산자
		int num1 = 1;
		num1++;
		System.out.println(num1);
//		num1--;
//     System.out.println(num1);

		int num2 = 1;
		System.out.println(num2);
		num2--;
		System.out.println(num2);

		// 1. 증감 연산자를 num1 식을 풀어서 코딩. 이름은 num3
		int num3 = num1 + 1;
		System.out.println(num3);

		// 2. 증감 연산자를 num2 식을 풀어서 코딩. 이름은 num4
		int num4 = num2 - 1;
		System.out.println(num4);

		//
		int number1 = 10;
//		number1++;
//		System.out.println(number1);
		int number2 = number1++; // <- 세미콜론이 끝나고 나서 동작
		// statement 기준으로 동작을 앞에있을 때와 뒤에 있을 때 다르게 동작한다.
		// 세미콜론을 기준으로 ++(변수); => 먼저 더해진 후 결과 출력, (변수)++; => 변수가 먼저 출력 된 후에 더해진다.
		System.out.println(number2); // 10
		System.out.println(number1); // 11 
		
		int num = 5;
		int ber;
		// ber = --num; // num 값에 1이 증가한 후 ber 변수에 대입 => 결과 값 : 6
	//	System.out.println(ber);
		ber = num--; // ber 변수에 num의 값이 먼저 대입된 후 값이 1씩 증가 => 결과 값 : 5
		System.out.println(ber);

	}

}
