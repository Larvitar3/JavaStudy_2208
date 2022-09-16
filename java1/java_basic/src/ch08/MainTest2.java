package ch08;

public class MainTest2 {

	public static void main(String[] args) {
		
		Subway subway1 = new Subway(1);
		
		subway1.take(5, 1300);
		subway1.showInfo();
		
		subway1.takeOff(5);
		subway1.showInfo();
		

	}

}
