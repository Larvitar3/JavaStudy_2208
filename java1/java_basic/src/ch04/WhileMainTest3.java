package ch04;

import java.util.Scanner;

public class WhileMainTest3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int userInput;
		do {
			System.out.println("▶ ▶ ======= MAIN ======= ◀ ◀");
			System.out.println("메뉴를 선택해주세요.");
			System.out.println();
			System.out.println("0번 프로그램 종료");
			System.out.println("1번 메인화면 출력");
			userInput = sc.nextInt();
			
		}while(userInput != 0);
		System.out.println(" 프로그램 종료합니다");

		
		
		
		
		
		
		
	}
}
