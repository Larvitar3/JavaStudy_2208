package ch04;

public class ForMainTest2 {

	public static void main(String[] args) {
		
		// 이중 for문을 사용할 땐 조건을 먼저 적는다.
		
		for(int num = 2 ; num <= 9; num++) {
			
			System.out.println();
// 	    1번.
//			if ( num > 2) {
//				System.out.println("================");
//			}
//			2번.
//			if(num != 2) {
//				System.out.println("================");
//			}
			
			System.out.println( num + " 단 ");
			
			for (int i = 1; i <= 9; i++) {
				System.out.println(num + " X " + i + " = " + (num * i));
				}
			// 만약 num의 값이 5, 6이라면 밑줄을 건너뛰어라.
			if(num != 9) {
				if( num == 5) {
					continue;
				}else if(num == 6 ) {
					continue;
				}
//				if (num == 5 && num == 6) {
//					continue;
//				}
				System.out.println("================");
				
			}
			
			
		}

	}

}
