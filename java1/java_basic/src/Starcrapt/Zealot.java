package Starcrapt;

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

	// 기능
	// 마린 공격
	public void attackMarine(Marine marine) {
		System.out.println("[시스템] " + this.name + " ▶ " + marine.getName() +" 공격");
		marine.beAttacked(this.power);
	}

	// 저글링 공격
	public void attackZergling(Zergrling zergrling) {
		System.out.println("[시스템] "  + this.name + " ▶ " + zergrling.getName() + " 공격");
		zergrling.beAttacked(this.power);
	}

	// 공격 당함
	public void beAttacked(int power) {
		this.hp -= power;
		if( hp <= 0 ) {
			System.out.println("[시스템] "+ this.name + " 은 사망하였습니다.");
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
