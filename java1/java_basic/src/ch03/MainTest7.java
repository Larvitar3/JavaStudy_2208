package ch03;

import java.util.Scanner;

public class MainTest7 {

	public static void main(String[] args) {
		
		// 삼항 연산자
		// 조건식 ? 결과1 : 결과2;
		
		int num1 = ( 5 > 1 ) ? 10 : 20 ; // 5는 1보다 크므로 결과 1 출력
		//System.out.println(num1);
		
		// JDK
		int max = 0;
		System.out.println("입력 받은 두 수 중 큰 수를 출력하세요");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("입력 1 : ");
		int x =sc.nextInt();
		System.out.println("입력 2 : ");
		int y =sc.nextInt();
		
	  // 사용자가 입력한 값 중 큰 수를 출력

		max = (x > y) ? x : y ;
		
		System.out.println(" 입력한 두 수 중 큰 수는 : " + max);
		
	} // end of main

} //  end of class
