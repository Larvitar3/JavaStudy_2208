package ch11;

import java.util.Calendar;

public class CompanyMainTest {

	public static void main(String[] args) {
		
		Company company1 = Company.getInstance();
		Company company2 = Company.getInstance();
		Company company3 = Company.getInstance();
		
		company1.cid = 1;
		System.out.println(company2.cid);
		
		Calendar calendar = Calendar.getInstance();
		System.out.println(calendar.getTimeInMillis());
		
		
		
		
		
		
		
		
		
		
		
	}

}
