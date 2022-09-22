package generic_ex.ch01;

public class MainTest {

	public static void main(String[] args) {
		
		Powder powder = new Powder();
		Plastic plastic = new Plastic();
		
		ThreedPrinter1 printer1 = new ThreedPrinter1();
		ThreedPrinter2 printer2 = new ThreedPrinter2();
		ThreedPrinter3 printer3 = new ThreedPrinter3();
		
		// 1번 기기
		// 재료 넣기
		printer1.setMetertial(powder);
		// 재료 꺼내기
		System.out.println(printer1.getMetertial());
		
		// 2번 기기
		printer2.setMaterial(plastic);
		System.out.println(printer2.getMaterial());
		
		// 3번 기기
//		printer3.setMaterial(plastic);
//		System.out.println(printer3.getMaterial());
//		printer3.setMaterial(powder);
//		System.out.println(printer3.getMaterial());
		
		printer3.setMaterial(powder);
		
		System.out.println(printer3.getMaterial() + "0-20202");
		
		Plastic usePlastic = (Plastic) printer3.getMaterial();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
}
