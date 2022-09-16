package Starcrapt.copy;

import java.util.Random;

public class MainTest1 {

	public static void main(String[] args) {
		
		final int ZEALOT =  1;
		final int MARINE = 2;
		final int ZERGRLING = 3;
		
		Zealot zealot1 = new Zealot("질럿1");
		Zealot zealot2 = new Zealot("질럿2");

		Marine marine1 = new Marine("마린1");
		Marine marine2 = new Marine("마린2");
		
		Zergrling zergrling1 = new Zergrling("저글링1");
		Zergrling zergrling2 = new Zergrling("저글링2");
		
		Random random = new Random();
		int number = random.nextInt(3)+1;
		
		if (number == ZEALOT) {
			zealot1.attack(marine1);
			zealot1.attack(zergrling1);
		}else if(number == MARINE) {
			marine1.attack(zealot1);
			marine1.attack(zergrling1);
		}else if(number == ZERGRLING) {
			zergrling1.attack(zealot1);
			zergrling1.attack(marine1);
		}
		
		zealot1.attack(zealot1);
//		zealot1.showInfo();
//		marine1.showInfo();
//		zergrling1.showInfo();
		
		
		
		
		
		
		
	}

}
