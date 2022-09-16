package starcrapt3;

public class Unit {

	protected String name;
	protected int power;
	protected int hp;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPower() {
		return power;
	}

	public void setPower(int power) {
		this.power = power;
	}

	public int getHp() {
		return hp;
	}

//
//	// 마린 공격
//	public void attack(Marine marine) {
//		System.out.println("[시스템] " + this.name + " ▶ " + marine.getName() + " 공격");
//		marine.beAttacked(this.power);
//	}
//
//	// 저글링 공격
//	public void attack(Zergrling zergrling) {
//		System.out.println("[시스템] " + this.name + " ▶ " + zergrling.getName() + " 공격");
//		zergrling.beAttacked(this.power);
//	}
//	
//	// 질럿 공격
//		public void attack(Zealot zealot) {
//			System.out.println("[시스템] " + this.name + " ▶ " + zealot.getName() + " 공격" );
//			zealot.beAttacked(power);
//		}

		

		// 공격 당함
		public void beAttacked(int power) {
			this.hp -= power;
			if (hp <= 0) {
				System.out.println("[시스템] " + this.name + " 은 사망하였습니다.");
				hp = 0;
			}else {
				System.out.println();
				System.out.println("[시스템] " +  " ★ Attack ★ " + " 『 "+ this.name + " 』 ");
			}
		}

	public void showInfo() {
		System.out.println();
		System.out.println("====== 정보창 ======");
		System.out.println("이름  : " + name);
		System.out.println("생명력 : " + hp);
		System.out.println("공격력 : " + power);

	}

}
