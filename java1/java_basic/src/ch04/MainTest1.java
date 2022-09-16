package ch04;

import java.util.Scanner;

public class MainTest1 {

	public static void main(String[] args) {
		
		// 1. 문제
		// a = 10, b 변수에 20담아둔다
		// a 변수와 b변수의 값을 서로 바꿔서 출력
		int a = 10;
		int b = 20;
		int x =  a;
		
		a = b; // a = 20
		b = x;

		System.out.println("a = " + a + ",  b = " + b);
		
		// 2. 문제
		// 3. 시작값, 종료값을 받아서 연산의 합을 출력
		Scanner sc = new Scanner (System.in);
		
		System.out.println("시작값을 입력해주세요.");
		int start = sc.nextInt();
		
		System.out.println("종료값을 입력해주세요.");
		int end = sc.nextInt();
		
		int startN = start;
		
		for(int i = 0; i < end; i++) {
			System.out.println(start + i);
			System.out.println("==============");
			start = start + i;
		}
		System.out.println(startN + "부터 " + end + "번  : " + start + "입니다.");
		
		// 3. 문제
		// 2번 문제에서 변수 하나를 상수로 변경해서 코드를 수정

		System.out.println("시작값을 입력해주세요.");
		int startA = sc.nextInt();
		
		System.out.println("종료값을 입력해주세요.");
		final int END = sc.nextInt();
		
		int startB = startA;
		
		for(int i = 0; i < END; i++) {
			System.out.println(startA + i);
			startA = startA+ i;
		}
		System.out.println(startB + "부터 " + END + "의 합은 : " + startA + "입니다.");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
