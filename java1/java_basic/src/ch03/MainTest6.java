package ch03;

public class MainTest6 {

	public static void main(String[] args) {
		
		// 논리 연산자 ( &&, || ) 엠퍼센트, 버티컬 바
		// 관계 연산자와 혼합하여 많이 사용한다
		// 연산의 결과 값은 true, false
		
		int num1 = 10;
		int num2 = 20;
		
		// && (논리 곱) => and
		boolean flag1 = (num1 > 0) && (num2 > 0); 
		System.out.println(flag1);
		
		flag1 = (num1 > 0) && (num2 < 0);
		System.out.println(flag1);
		
		// || (논리 합) => or
		boolean flag2 = (num1 > 0) || (num2 > 0 ); 
		System.out.println(flag2);

		boolean flag3 = (num1 < 0) || (num2 > 0 ); 
		System.out.println(flag3);
		
		boolean flag4 = (num1 < 0) || (num2 < 0 ); 
		System.out.println(flag4);
		
		System.out.println("====================");
		
		// ! (부정) => 반전
		System.out.println(!flag2);
		System.out.println(flag2); // 출력 값을 반전 ★ 입력 값은 그대로 ★
		
		System.out.println("====================");
		boolean flag5 = !(num1 < 0) && (num2 > 0 ); 
		System.out.println(flag5);
		
		///////////////////////////////////////////////////////////
		
		// short circuit evaluation

		
//		boolean mValue = ( (n = n + 10) > 10) && ( (i = i + 2) < 10 );
//		System.out.println(n);
//		System.out.println(i);
//		System.out.println(mValue);

		
		// && : 앞의 결과가 false면 뒤 항의 결과를 평가하지 않음
//		boolean mValue = ( (n = n + 10) < 10) && ( (i = i + 2) < 10 );
//		System.out.println(n);
//		System.out.println(i);
//		System.out.println(mValue);
		
		
		
		
		// || : 앞의 결과가 true면 뒤 항의 결과를 평가하지 않음
//		boolean mValue = ( (n = n + 10) > 10) || ( (i = i + 2) > 10 );
//		System.out.println(n);
//		System.out.println(i);
//		System.out.println(mValue);
		
		System.out.println("====================");
		
		// 논리 곱 문제 생성
		
		int n = 5;
		int i = 0;
		
		boolean bValue = ( (n = n + 23) < 27 ) && ( (i = i +20) < 2 );
		System.out.println(n);
		System.out.println(i);
		System.out.println(bValue);
		// bValue 의 결과 값?
		
		System.out.println(" e====================");
		
		int e = 6;
		final int F = (e++);
		
		boolean eValue = ((e = e + 30) <  35) && ((F < 10) );
		System.out.println(e);
		System.out.println(F);
		System.out.println(eValue);
		// e의 값?
		// eValue의 결과 값?
		
		System.out.println("====================");
		
	
		
		// 논리 합 문제 생성
		
		int a = 3;
		int b = 5;
		
		boolean cValue = ( (a = a + 10) < 27 ) || ( (b = b * 10) < 2 );
		System.out.println(a);
		System.out.println(b);
		System.out.println(cValue);
		// cValue의 결과 값 ?
		
		System.out.println("====================");
		
		int c = 10;
		int d = 15;
		
		boolean dValue = ( (c = c + 10) > 27 ) || ( (d = d * 10) < 2 );
		System.out.println(c);
		System.out.println(d);
		System.out.println(dValue);
		// d의 값?
		// dValue의 결과 값?
		
		
		
		
	}

}




























