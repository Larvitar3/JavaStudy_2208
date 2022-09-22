package Test.Ex09;

public interface Moveable {

	public abstract void left();

	public abstract void right();

	public abstract void up();

	/**
	 *   default를 사용하면 인터페이스도 몸체가 있는 메서드를 만들 수 있다.
	 *   어댑더 패턴 대용으로 사용하기도 한다.
	 */
	default public void down() {
		
	};

}
