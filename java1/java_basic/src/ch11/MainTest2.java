package ch11;

public class MainTest2 {
	public static void main(String[] args) {
	
		NumberPrinter2 numberPrinter1;
		
		NumberPrinter2.waitNumber = 10;
		System.out.println(NumberPrinter2.waitNumber);
		
		NumberPrinter2 printer2 = new NumberPrinter2();
		printer2.id = 1;
		
		NumberPrinter2.getWaitNumber();
		
		System.out.println(printer2.id);

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
