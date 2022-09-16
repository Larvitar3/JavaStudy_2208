package ch11;

public class CompanyTest {
	
	
	// 1.
	private CompanyTest() {
		
	}
	
	
	// 2.
	private static int number = 10; 
	private static CompanyTest instance = new CompanyTest();
	
	
	// 3.
	public static CompanyTest getInstance() {
		return instance;
	}
	
	
}
