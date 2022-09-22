package generic_ex.ch02;

import generic_ex.ch01.Plastic;
import generic_ex.ch01.Powder;

public class MainTest {

	public static void main(String[] args) {
		
		// 재료
		Powder powder = new Powder();
		Plastic plastic = new Plastic();
		
		// 사용 방법
		GenericPrinter<Powder> genericPrinter = new GenericPrinter<>();
		
		// 재료 셋팅
		genericPrinter.setMeterial(powder);
		Powder usePowder = genericPrinter.getMeterial();
		System.out.println(usePowder);
		
		// 플라스틱 사용하는 제네릭 프린터
		GenericPrinter<Plastic> genericPrinter2 = new GenericPrinter<>();
		genericPrinter2.setMeterial(plastic);
		Plastic usePlastic = genericPrinter2.getMeterial();
		System.out.println(usePlastic);
		
	}
	
}
