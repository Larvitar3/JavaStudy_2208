package ch08;

public class MainTest3 {

	public static void main(String[] args) {
		
		Warrior warrior1 = new Warrior("전사1");
		Wizard wizard1 = new Wizard("법사1");
		
		warrior1.beAttack(300);
		warrior1.showInfo();
		
		wizard1.beAttack(100020);
		wizard1.showInfo();
		
	}

}
