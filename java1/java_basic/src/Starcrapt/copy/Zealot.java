package Starcrapt.copy;

public class Zealot {

	// private int id;
	private String name;
	private int power;
	private int hp;

	public Zealot(String name) {
		this.name = name;
		this.power = 10;
		this.hp = 100;
	}

	public String getName() {
		return name;
	}

	public int getPower() {
		return power;
	}

	public int getHp() {
		return hp;
	}

	// 메서드 오버로딩 : 같은이름을 선언하지만 매개변수 개수나 타입에 따라서 구분해서 호출
	public void attack(Zealot zealot) {
		if (this == zealot) {
			System.out.println("[시스템]  자신은 공격할 수 없습니다.");
			
			// 1. 값을 반환할 때 사용, 2.실행의 흐름을 종료
			return;
		}
		System.out.println("[시스템] " + this.name + " ▶ " + zealot.getName() + " 공격");
		zealot.beAttacked(this.power);
	}

	// 기능
	// 마린 공격
	public void attack(Marine marine) {
		System.out.println("[시스템] " + this.name + " ▶ " + marine.getName() + " 공격");
		marine.beAttacked(this.power);
	}

	// 저글링 공격
	public void attack(Zergrling zergrling) {
		System.out.println("[시스템] " + this.name + " ▶ " + zergrling.getName() + " 공격");
		zergrling.beAttacked(this.power);
	}

	// 공격 당함
	public void beAttacked(int power) {
		this.hp -= power;
		if (hp <= 0) {
			System.out.println("[시스템] " + this.name + " 은 사망하였습니다.");
			hp = 0;
		} else {
			System.out.println();
			System.out.println("[시스템] " + " ★ Attack ★ " + " 『 " + this.name + " 』 ");
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
