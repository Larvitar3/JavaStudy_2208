package Starcrapt.copy;

public class D {

	
	private int numberId = 1000;
	
	public int getNumberId() {
		return numberId;
	}
	
	public D() {
		System.out.println("D 클래스를 메모리에 올려서 객체화");
	}
	
	public void showInfo() {
		System.out.println("여기는 D showInfo");
	}
	
	public static void main(String[] args) {
		A a = new A();
		int temp = a.b.c.d.numberId;
//		System.out.println(a.b);
//		System.out.println(a.b.c.d);
//		a.b.c.d.showInfo();
		System.out.println("==========");
		System.out.println();
		System.out.println(temp);

		
		
		
		
		
	}
	
}
