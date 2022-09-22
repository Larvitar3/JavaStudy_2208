package generic_ex.ch03;

import generic_ex.ch03.Plastic;
import generic_ex.ch03.Powder;


public class MainTest {

	public static void main(String[] args) {

		Water water = new Water();
		Powder powder = new Powder();
		Plastic plastic = new Plastic();

		GenericPrinter<Powder> genericPrinter = new GenericPrinter<>();
		GenericPrinter<Plastic> genericPrinter2 = new GenericPrinter<>();
		
		genericPrinter.setMeterial(powder);
		
		System.out.println(genericPrinter.getMeterial());
		System.out.println();

		// <T extends>
		// T 자료형의 범위를 제한할 수 있음 제한 하지 않으면 자료형으로 아무 클래스나 올 수 있다.
		
	}

}
