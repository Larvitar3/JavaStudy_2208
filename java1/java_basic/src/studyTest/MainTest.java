package studyTest;

import java.util.Scanner;

public class MainTest {

	public static void main(String[] args) {

		// 객체 배열 생성
		Zealot[] zealots = new Zealot[3];
		Marine[] marines = new Marine[3];
		Zealot zealot = new Zealot("질럿");
		Marine marine = new Marine("마린");

		Scanner scanner = new Scanner(System.in);

		int reapeatCount = 5;
		boolean flag = true;

		while (flag) {
			// 배열에 값 넣기
			for (int i = 0; i < zealots.length; i++) {
				zealots[i] = new Zealot("질럿" + (i + 1));
			}
			for (int i = 0; i < marines.length; i++) {
				marines[i] = new Marine("마린" + (i + 1));
			}

			// 공격 유닛 선택
			System.out.println("공격 유닛을 선택해주세요.");
			System.out.println("1. 질럿 \t 2.마린");
			int attackUnit = scanner.nextInt();
			if (attackUnit == 1) {
				for (int i = 0; i < 10; i++) {
					System.out.print(">>");
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				} // end of for
				System.out.println();
				System.out.println("『 ★ 질럿 ★ 』");
				System.out.println("질럿을 선택하셨습니다.");
				System.out.println();
				System.out.println("공격할 유닛을 선택해주세요.");
				System.out.println("1. 마린1 \t 2. 마린2 \t 3. 마린3");
				int beAttackUnit = scanner.nextInt();
				if (beAttackUnit == 1) {
					zealot.attack(marines[0]);
					marines[0].showInfo();
				} else if (beAttackUnit == 2) {
					zealot.attack(marines[1]);
					marines[1].showInfo();
				} else if (beAttackUnit == 3) {
					zealot.attack(marines[2]);
					marines[2].showInfo();
				} else {
					System.out.println("잘못된 입력입니다.");
				}
			} else if (attackUnit == 2) {
				for (int i = 0; i < 10; i++) {
					System.out.print(">>");
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				} // end of for
				System.out.println();
				System.out.println("『 ★ 마린 ★ 』");
				System.out.println("마린을 선택하셨습니다.");
				System.out.println();
				System.out.println("공격할 유닛을 선택해주세요.");
				System.out.println("1. 질럿1 \t 2. 질럿2 \t 3. 질럿3");
				int beAttackUnit = scanner.nextInt();
				if (beAttackUnit == 1) {
					marine.attack(zealots[0]);
					zealots[0].showInfo();
				} else if (beAttackUnit == 2) {
					marine.attack(zealots[1]);
					zealots[1].showInfo();
				} else if (beAttackUnit == 3) {
					marine.attack(zealots[2]);
					zealots[2].showInfo();
				} else {
					System.out.println("잘못된 입력입니다.");
				}
			} else {
				System.out.println("잘못된 입력입니다.");
			}
			
			System.out.println();
			System.out.println("게임을 재시작 하시겠습니까? ");
			System.out.println("1. 재시작, 2. 종료 ");
			int menuNumber = scanner.nextInt();
			if (menuNumber == 1) {
				System.out.println("게임을 재시작합니다.");
				System.out.println();
			} else if(menuNumber == 2) {
				System.out.println("종료");
				flag = false;
			}else {
				System.out.println("잘못된 입력입니다.");
			}
		}

	}

}
