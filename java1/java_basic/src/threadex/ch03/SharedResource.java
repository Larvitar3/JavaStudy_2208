package threadex.ch03;

public class SharedResource {

	public static void main(String[] args) {

		// 현재 10만원
		BankAccount bankAccount = new BankAccount();
		
		Father father = new Father(bankAccount);
		
		Mother mother = new Mother(bankAccount);
		
		// 아버지가 먼저 입금
		
		father.start();
		mother.start();
		
		// 레이스 컨디션 상태일때, 즉, 임계 영역이 발생할 때는
		// 의도지 않은 결과를 생성시킬 수 있다.
		// 그래서 다른 작업자 (쓰레드)가 사용하지 못하도록
		// 안정적인 결과값을 얻을 수 있다.
		
		// 해결방법
		// 자바에서 동기화 처리
		
		// 1. (synchronized) 메서드
		// 2. (synchronized) 블록

	}

}
