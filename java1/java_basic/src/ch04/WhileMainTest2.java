package ch04;

public class WhileMainTest2 {

	public static void main(String[] args) {
		
		// 1 ~ 10까지 연산
		// (조건식)
		// 무한 반복
		int num = 1;
		int sum = 0;
		
//		while(num <= 10) {
//			System.out.println("현재 값 : " + num);
////			sum = sum + num;
//			sum += num;
//			num++;
//	}
//		System.out.println("연산에 대한 결과 값은 " + sum + "입니다.");
		
			while(num <= 10) {
			System.out.print("--");
			try {
				// 메인 쓰래드 (0.01초 잠들고 일어나서 수행)
				Thread.sleep(100); // 시간 조정
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			num++;
			
		}
		


	}

}
