package ch04;

import java.util.Scanner;

public class IfMainTest2 {

	public static void main(String[] args) {
		
		System.out.println("성적을 입력해주세요.");
		Scanner scanner = new Scanner(System.in);
		int point = scanner.nextInt();
		char reslut = 'Z';
		
		// 1. 100~ 91까진 A학점. 단 논리곱 연산을 활용
		// 2. 90~ 81까진 B학점. 단 논리곱 연산을 활용
		// 3. 80~ 71까진 학점. 단 논리곱 연산을 활용
		// 4. 나머진 F학점. 단 논리곱 연산을 활용
		
		if ( point > 100 ){
			System.out.println("잘못된 입력입니다.");
	    }else if((point <= 100) && (point > 90)){
			reslut = 'A';
		}else if ((point <= 90) && (point > 80)) {
			reslut = 'B';
		}else if ((point) <= 80 && (point > 70)) {
			reslut = 'C';
		}else if ((point < 70) && (point >=0 )){
			reslut = 'F';
		}
		
		// 방어적 코드
		if(reslut != 'Z') {
			System.out.println(reslut + "학점입니다.");
		}else {
			System.out.println("잘못된 입력입니다.");
		}
		
		

	}

}
