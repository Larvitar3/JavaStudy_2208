package ch15;

//추상클래스를 상속 받을 수 있다.
	// 하지만 추상메서드가 (부모) 존재한다면
	// 1. Human 추상 클래스로 만들어서 추상 클래스를 선언
	// 2. 추상 메서드를 일반 메서드로 재구현 해주면 된다.

// 1. 방법
public abstract class  Human extends Animal {
	
// 2. 방법
//	@Override
//	public void hunt() {
//		System.out.println("사람이 도끼를 들고 사냥을 합니다.");
//	}
	
}
