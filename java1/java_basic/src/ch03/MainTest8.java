package ch03;

import java.util.Scanner;

public class MainTest8 {

	public static void main(String[] args) {
			
		Scanner sc = new Scanner(System.in);
		
		double dob = 0;
		
		System.out.println("소수점 두 개를 입력해주세요");
		
		System.out.println("소수점 입력1 : ");
		double v = sc.nextDouble();
		System.out.println("소수점 입력2 : ");
		double k = sc.nextDouble();
		
		 dob= ( v > k)  ? v : k;
		 
		System.out.println("입력한 두 소수점 중 큰 수는 : " + dob);
		
		
		
		
		
	
		 
		
		
		
	 
		
	} // end of main

} //  end of class
















