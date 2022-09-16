package ch04;

public class ContinueTest2 {

	public static void main(String[] args) {
		
		// 예약어 ( continue )
		// 무시하고 진행하는 continue
		
//		final int MULLTIPLE = 7;
		
		int num = 0;
		int count = 0;
		
		for(num = 1; num <= 10; num++) {
			// 만약 2의 배수이면 화면에 출력
			if(num % 2 == 0) {
				count++;
				continue;
			}
			
			System.out.println("num 의 값은  : " + num);
			
		}
		System.out.println("2의 배수는 " + count + "개 입니다.");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
