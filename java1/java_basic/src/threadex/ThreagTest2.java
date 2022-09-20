package threadex;

public class ThreagTest2 {

	public static void main(String[] args) {
		
		for (int i = 0; i < 30; i++) {
			System.out.print("-0-");
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
	
	
	}
}
