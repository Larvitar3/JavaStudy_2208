package starcrapt3;

public class Marine extends Unit implements Terran{

	public Marine(String name) {
		this.name = name;
		this.power = 5;
		this.hp = 80;
	}

	@Override
	public void attack(Unit unit) {		
			// instaceOf
			System.out.println("[시스템] " + this.name + " ▶ " + unit.getName() + " 공격");
			unit.beAttacked(this.power);
		
	}

	

}
