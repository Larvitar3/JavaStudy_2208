package lambdaEx.ch01;

public class AddTest1 {
	public static void main(String[] args) {
		
		IAdd iAdd = (int x, int y) -> {return x + y;};		
		System.out.println(iAdd.add(10, 50));
		System.out.println(iAdd.add(100, 50));
		System.out.println(iAdd.add(1000, 50));
		
		IAdd iAdd2 = new IAdd() {
			
			@Override
			public int add(int x, int y) {
				return x + y;
			}
		};
		
	}
}

// 람다식 사용하기 위해서는 미리 정의되어 있어야 한다 --> 인터페이스 (단, 추상메서드는 반드시 한개여야한다.)

interface IAdd{
	
	public int add(int x, int y);
	// public int minus();
	
	
}
