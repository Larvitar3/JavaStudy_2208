package ch04;

import java.util.Scanner;

public class IfMainTest3 {

	public static void main(String[] args) {
		
		// 1 부터 100까지 연산에 합을 화면에 출력 단, 반복문 활용
		
	
		int result = 0;
		int maxNumber = 10;
		
		for(int i = 1; i <= maxNumber; i++) {
			System.out.println("result : " + result + ",  i :" + i);
			result = result+ i;
			
		}
		
		System.out.println("1 부터 "+ maxNumber  +" 까지의 합은 " +  result + "입니다.");
		

		Scanner sc = new Scanner(System.in);
		
		System.out.println("원하는 숫자를 입력해주세요.");
		int resultUse = sc.nextInt();
		
		for(int i = 1; i <= maxNumber; i++) {
			System.out.println("R" + resultUse + "i   " + i);
			resultUse = resultUse + i ;
			
		}

		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
