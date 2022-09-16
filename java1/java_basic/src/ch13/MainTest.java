package ch13;

public class MainTest {

	public static void main(String[] args) {

		C c = new C("안녕");
		
		c.num1 = 1;
		c.num2 = 2;
		c.num3 = 3;
		c.num4 = 4;
		c.num5 = 5;
		
		System.out.println(c.num1);
		System.out.println(c.num2);
		System.out.println(c.num3);
		System.out.println(c.num4);
		System.out.println(c.num5);

	}

}

// 선임 클래스
class ANumber {

	public int num1;
	public int num2;
	public int num3;
	String name;
	
	public ANumber(String name) {
		this.name = name;
		System.out.println("A클래스가 메모리에 올라갔습니다.");
	
	}

}

class B {
	public int num1;
	public int num2;
	public int num3;
	public int num4;
	public int num5;
	public int num6;
}

// 상속 ( extends )
class C extends ANumber {

	public int num4;
	public int num5;
	
	public C(String pname) {
		
		
		//  부모 super(); - 부모 생성자를 호출하는 키워드
		// this ();
		super("안녕");
		
		
		System.out.println("C클래스가 메모리에 올라갔습니다");
	}

}
























