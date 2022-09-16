package starcrapt3;

public class Archer extends Hero{
	
	public Archer(String name, int hp) {
		super(name, hp);
	}
	
	public void fireArrow() {
		System.out.println("궁수가 불화살을 사용합니다.");
	}

}
