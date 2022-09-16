package ch15;

public abstract class Animal {
	
	// abstract : 강제성
	// 추상 클래스란 
	// 하나 이상의 추상 메서드를 포함하거나  abstract 키워드를 가진 클래스를 추상 클래스라고 한다
	
	String name;
	
	public void move() {
		System.out.println("동물이 움직입니다.");
	}

	public void eating() {
		System.out.println("먹습니다.");
	}
	
	// 추상메서드 : 메서드에서 선언부만 존재하는 녀석 + abstract
	public abstract void hunt();
	
} // end of Animal class
	
	




























