package ch02;

public class TypeConversion {

	public static void main(String[] args) {
		
		// 형 변환 : 데이터 타입을 변환하는 것을 말한다.
		// 강제 형 변환, 자동 형 변환이 있다
		
		int iNumber1 = 100;
		
		System.out.println(iNumber1);
		
		// 묵시적 형 변환 (자동 형 변환)
		double dNumber1 = iNumber1;
		System.out.println(dNumber1);
		
		// 명시적 형 변환 (강제 형 변환)
		double dNumber2 = 1.12345;
		int iNumber2 = (int) dNumber2;
		System.out.println(iNumber2); // 강제 형 변환으로 소수점이 사라진다.
		
		// 강제 형 변환시 데이터에 손실이 발생할 수 있다.
		
		// 연습 (강제 형 변환)
		final double a;
		final int b;
		
	    a  = 0.5;
		b = (int)10.5;
		
		System.out.println(b);
		
		double c = 2.345;  // double(8byet)
		int e = (int) c; // int로 형변환
		
		System.out.println(e);
		
		
		
		
		
		
	} // end of main

} // end of class



















