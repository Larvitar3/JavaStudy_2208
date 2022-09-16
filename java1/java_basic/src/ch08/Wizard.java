package ch08;

public class Wizard {
	// 상태
		// 캐릭 이름
		// 체력
		// 공격력
		String name;
		int hp;
		int power;
		int cPower;
		

		// 생성자
		public Wizard(String name) {
			this.name = name;
			this.hp = 10000;
		}

		// 기능
		// 공격받는다 (공격력) power
		public void beAttack(int power) {
			System.out.println();
			if( hp < power ) {
				System.out.println("[시스템] "+ name + "이 사망하였습니다!");
				hp = 0;
			}else {
				hp-= power;
				System.out.println();
				System.out.println();
				System.out.println("[시스템] "+ name + "이 " + power + "만큼 공격을 받았습니다!");
				System.out.println();
				System.out.println("[시스템] "+ name + "이 " + "공격을 받아 체력이 " +
				hp + "만큼 남았습니다.");
			}
			
			
			
		}
		
		
		public void showInfo() {
			System.out.println();
			System.out.println("== 캐릭 정보 ==");
			System.out.println("캐릭 명 : " + name );
			System.out.println("체력 : " + hp );
			System.out.println("공격력 : " + cPower );
			
		}
}
