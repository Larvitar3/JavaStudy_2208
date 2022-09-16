package ch04;

import java.util.Random;
import java.util.Scanner;

public class WhileMainTest4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Random random = new Random();
		
		int randomResult;
		int userInput;
		
		randomResult = random.nextInt(5)+1;
//		System.out.println(randomResult);
		// 사용자에게 입력을 받아 3번안에 맞추면 안타입니다. 3번 다 틀렸으면 아웃입니다 출력

		//
		// 사용자에게 입력받은 값과 랜덤으로 나온 값이 == 면 안타, != 이면 아웃
			System.out.println("● ● ● 야구게임 ● ● ● ");
			System.out.println("랜덤으로 나오는 숫자 중 3개를 맞추면 안타, 틀리면 아웃입니다.");
			System.out.println("게임을 시작하려면 숫자키를 누른 후 엔터를 눌러주세요.");
			userInput = sc.nextInt();
			System.out.println("첫번째 숫자를 입력해주세요.");
			userInput = sc.nextInt();
			System.out.println("입력 숫자 : "+ userInput);
			System.out.println("랜덤 숫자 : "+ randomResult);

//		while(userInput != randomResult) {
//			System.out.println("● ○ ○");
//			System.out.println("숫자를 입력해주세요.");
//			userInput = sc.nextInt();
//			System.out.println("입력 숫자 : "+ userInput);
//			System.out.println("랜덤 숫자 : "+ randomResult);
//		}
			
				if(userInput == randomResult) {
					System.out.println("● ○ ○");
					System.out.println("두번째 숫자를 입력해주세요.");
					userInput = sc.nextInt();
					System.out.println("입력 숫자 : "+ userInput);
					System.out.println("랜덤 숫자 : "+ randomResult);
				}else {
					System.out.println("○ ○ ○");
					System.out.println("두번째 숫자를 입력해주세요.");
					userInput = sc.nextInt();
					System.out.println("입력 숫자 : "+ userInput);
					System.out.println("랜덤 숫자 : "+ randomResult);
				}
				if(userInput == randomResult) {
					System.out.println("● ● ○");
					System.out.println("세번째 숫자를 입력해주세요.");
					userInput = sc.nextInt();
					System.out.println("입력 숫자 : "+ userInput);
					System.out.println("랜덤 숫자 : "+ randomResult);
				}else {
					System.out.println("○ ○ ○");
					System.out.println("세번째 숫자를 입력해주세요.");
					userInput = sc.nextInt();
					System.out.println("입력 숫자 : "+ userInput);
					System.out.println("랜덤 숫자 : "+ randomResult);
				}

				if(userInput == randomResult) {
					System.out.println("● ● ●");
					System.out.println("♬ 안타 ♬");	
				}else {
					System.out.println("♨ 아웃 ♨");
				}

			
//			if(userInput == randomResult) {
//				System.out.println("● ○ ○");
//				System.out.println("두번째 숫자를 입력해주세요.");
//				userInput = sc.nextInt();
//				System.out.println("입력 숫자 : "+ userInput);
//				System.out.println("랜덤 숫자 : "+ randomResult);
//			}
//			if(userInput == randomResult) {
//				System.out.println("● ● ○");
//				System.out.println("세번째 숫자를 입력해주세요.");
//				userInput = sc.nextInt();
//				System.out.println("입력 숫자 : "+ userInput);
//				System.out.println("랜덤 숫자 : "+ randomResult);
//			}
//			if(userInput == randomResult) {
//				System.out.println("● ● ●");
//				System.out.println("♬ 안타 ♬");	
//			}else {
//				System.out.println("♨ 아웃 ♨");
//			}
			
			
			
		System.out.println("게임이 종료되었습니다.");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
