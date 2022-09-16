package Starcrapt;

public class MainTest1 {

	public static void main(String[] args) {
		
		Zealot zealot1 = new Zealot("질럿1");
		Marine marine1 = new Marine("마린1");
		Zergrling zergrling1 = new Zergrling("저글링1");
		Zergrling zergrling2 = new Zergrling("저글링2");
		
		zealot1.attackMarine(marine1);
		zealot1.attackZergling(zergrling1);
		marine1.attackZealot(zealot1);
		marine1.attackZergling(zergrling1);
		zergrling1.attackMarine(marine1);
		zergrling1.attackZealot(zealot1);
		
		// 객체와 객체간의 상호작용 
		
		zealot1.showInfo();
		marine1.showInfo();
		zergrling1.showInfo();
		
	}

}
