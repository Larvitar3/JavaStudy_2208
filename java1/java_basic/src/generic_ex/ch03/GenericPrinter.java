package generic_ex.ch03;

public class GenericPrinter <T extends Material>{

	// T라는 대체 문자 사용, (아무 문자나 사용 가능)
	// E - element, K - Key, V - value, T - type
	// 자료형 매개변수 (type paramenter)
	
	private T meterial; // T 자료형으로 선언한 변수
	
	public T getMeterial() { // T 자료형으로 반환하는 제네릭 메서드
		return meterial;
	}
	
	// T (자료형 매개변수가 사용되는 메서드를 제네릭 메서드라고 한다.
	public void setMeterial(T material) {
		this.meterial = material;
	}
	
	@Override
	public String toString() {
		return "Generic";
	}
	
	
}
