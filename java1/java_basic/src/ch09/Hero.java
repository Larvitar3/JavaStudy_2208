package ch09;

public class Hero {

	private String name;
	private int hp;
	private int power;
	private double defense;
	private int level;

	// getter, setter 메서드 만들기
	// 단 setter 메서드 => 방어적 코드 넣기

	// getter ▼
	
	public String getName() {
		return this.name;
	}
	
	public int getHp() {
		return this.hp;
	}

	public int getPower() {
		return this.power;
	}

	public double getDefense() {
		return this.defense;
	}

	public int getLevel() {
		return this.level;
	}

	// setter ▼
	public void setName(String name) {
		if(name.length() <= 2) {
			System.out.println("세글자이상 입력하세요.");
		}else {
			this.name = name;
		}
		
	}

	public void setHp(int hp) {
		if(hp <= 0 ) {
			System.out.println("잘못된 입력입니다.");
		}else {
			this.hp = hp;
		}
	}

	public void setPower(int power) {
		if(power <= 0 ) {
			System.out.println("잘못된 입력입니다.");
		}else {
			this.power = power;
		}
	}
	
	public void setDefense(double defense) {
		if(defense <= 0) {
			System.out.println("잘못된 입력입니다.");
		}else {
			this.defense = defense;
		}
	}

	public void setLevel(int level) {
		if(level <= 0) {
			System.out.println("잘못된 입력입니다.");
		}else {
			this.level = level;
		}
	}
	
	public void showInfo() {
		System.out.println("name : " + name);
		System.out.println("hp : " + hp);
		System.out.println("power : " + power);
		System.out.println("defense : " + defense);
		System.out.println("level : " + level);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
