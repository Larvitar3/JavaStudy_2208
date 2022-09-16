package interfaces2;

public interface RemoteController {

	// 인터페이스
	// 구현된 것이 아무것도 없는 밑그림만 있는 기본 설계도
	
	
	public static final int SEARIAL_NUMBER = 100;
	// 모든 메서드는 추상 클래스여야 하고, public abstract 키워드를 생략할 수 있다.

	public abstract void trunOn();
	
	void turnOff();
	
}
