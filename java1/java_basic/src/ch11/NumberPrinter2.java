package ch11;

public class NumberPrinter2 {
	
	public int id;
	
	public static  int waitNumber;
	
	public NumberPrinter2(int id){
		this.id = id;
		this.waitNumber = 1;
	}
	
	// static 메서드 안에서는 멤버 변수를 활용 할 수없다.
	// 객체가 메모리에 올라갔다라는 보장을 하지 못하기 때문
	public static int getWaitNumber() {
	// 	id = 100;
		return waitNumber;
	}

	public NumberPrinter2() {
		this.waitNumber = 1;
	}
	
	// 번호표를 출력
	public void printWaitNumber() {
		System.out.println( id + "기기의대기 순번  : " + waitNumber);
		waitNumber++;
	}
	// static 변수, 클래스 변수, 정적 변수
	// 클래스 이름으로 접근해서 사용할 수 있다.
	

	
}
