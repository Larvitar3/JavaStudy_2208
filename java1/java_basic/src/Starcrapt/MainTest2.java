package Starcrapt;

import java.util.Scanner;

public class MainTest2 {

	public static void main(String[] args) {

		// 상수 활용
		final int ZEALOT = 1;
		final int MARINE = 2;
		final int ZERGRLING = 3;

		Zealot zealot1 = new Zealot("질럿1");
		Marine marine1 = new Marine("마린1");
		Zergrling zergrlin1 = new Zergrling("저글링1");

		Scanner scanner = new Scanner(System.in);

		// 1. 유닛 선택하기
		System.out.println("유닛을 선택하세요");
		System.out.println("1. 질럿\t2. 마린\t3. 저글링");

		// 입력값 받기
		int unitChoice = scanner.nextInt();
		if (unitChoice == ZEALOT) {
			// 질럿 선택
			zealot1.showInfo();
			System.out.println();
			System.out.println("어떤 유닛을 공격 하시겠습니까");
			System.out.println("2. 마린\t3. 저글링");
			int attackChoice = scanner.nextInt();
			System.out.println();
			// 공격 유닛 마린 선택 ▼
			if (attackChoice == MARINE) {
				zealot1.attackMarine(marine1);
				System.out.println();
				// 효과 ▼
				for (int i = 0; i < 10; i++) {
					System.out.print(">>");
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				} // end of for
				System.out.println();
				// ▼ 마린의 상태 보여줌
				marine1.showInfo();
			} else{
				System.out.println("잘못 입력 하셨습니다.");
			}// end of zealot
			
		} else if (unitChoice == MARINE) {
			// 마린 선택
			marine1.showInfo();
			System.out.println("어떤 유닛을 공격하시겠습니까");
			System.out.println("1. 질럿\t3. 저글링");
			int attackChoice = scanner.nextInt();

			if (attackChoice == ZEALOT) {
				// 공격유닛 질럿 선택 ▼
				marine1.attackZealot(zealot1);
				// 효과 ▼
				System.out.println();
				for (int i = 0; i < 10; i++) {
					System.out.print(">>");
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				} // end of for
				System.out.println();
				// ▼ 질럿의 상태 보여줌
				zealot1.showInfo();

			} else if (attackChoice == ZERGRLING) {
				// 공격유닛 저글링 선택
				marine1.attackZergling(zergrlin1);

				// 효과 ▼
				System.out.println();
				for (int i = 0; i < 10; i++) {
					System.out.print(">>");
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				} // end of for
				System.out.println();
				zergrlin1.showInfo();
			} else{
				System.out.println("잘못 입력 하셨습니다.");
			} // end of zergrling


		} else if (unitChoice == ZERGRLING) {
			// 저글링 선택
			zergrlin1.showInfo();
			System.out.println();
			System.out.println("어떤 유닛을 공격하시겠습니까");
			System.out.println("1. 질럿\t2. 마린");
			int attackChoice = scanner.nextInt();
			// ▼ 공격 유닛 질럿 선택
			if(attackChoice == ZEALOT) {
				zergrlin1.attackZealot(zealot1);
				System.out.println();
				// 효과 ▼
				for (int i = 0; i < 10; i++) {
					System.out.print(">>");
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				} // end of for
				System.out.println();
				// 질럿의 상태를 보여줌 ▼
				zealot1.showInfo();
				
			}else if(attackChoice == MARINE) {
				// ▼ 공격 유닛 마린 선택
				zergrlin1.attackMarine(marine1);
				// 효과 ▼
				System.out.println();
				for (int i = 0; i < 10; i++) {
					System.out.print(">>");
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				} // end of for
				System.out.println();
				// 마린의 상태를 보여줌 ▼
				marine1.showInfo();
			}else {
				System.out.println("잘못 입력 하셨습니다.");
			} // end of zergrling
		} else {
			System.out.println("잘못 입력 하셨습니다.");
		}

	}

}
