package ch04;

public class ContinueTest1 {

	public static void main(String[] args) {
		
		// 상수를 활용해서 코드의 가독성을 높여보자.
		final int MULTIPLE = 5;
		final int MAX = 1000;
		
		int num = 0;
		int count = 0;
		
		for(num = 1; num <= MAX; num++) {
				// 만약 3의 배수이면 화면에 출력 X
			if(num % MULTIPLE == 0) {
				count++;
				continue;
			}
			System.out.println("현재 값  : " + num);
		}
		System.out.println(MULTIPLE + "의 배수는 " + count + "입니다.");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
