package ch04;

public class BreakTest1 {

	public static void main(String[] args) {
		
		// 예약어 break
		// 중간에 멈춤
		
		for(int i = 1; i <= 10; i++) {
			System.out.println("i : " + i);
			// 만약 i값이 소수 7이면 멈춤
			if(i % 7 == 0) {
				break;
			} // end of if
			
			// break 구문은 가장 가까운 하나의 for문을 종료
			
		} // end of for

	}

}
