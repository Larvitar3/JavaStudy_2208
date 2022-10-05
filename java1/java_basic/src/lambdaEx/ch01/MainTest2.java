package lambdaEx.ch01;

public class MainTest2 {
	public static void main(String[] args) {
		
		// 매개변수 데이터타입 생략 가능		
		
		// 람다식 선언 (수행문이 한 줄일 경우 중괄호 생략 가능)
		IPrint iPrint = (a, token) -> {System.out.println(a + token);};
		
		// 람다식 사용
		iPrint.print1("이춘식", "-");
		iPrint.print1("삼춘식", "-");
		iPrint.print1("사춘식", "-");
		iPrint.print1("오춘식", "-");
		iPrint.print1("육춘식", "-");
		
		IPrint2 iPrint2 = () -> {return "이춘싁";}; 
		// 매개변수가 없기때문에 앞에 return을 붙여주어야한다.
		System.out.println(iPrint2.print2());
		System.out.println(iPrint2.print2());
		System.out.println(iPrint2.print2());
		System.out.println(iPrint2.print2());
		System.out.println(iPrint2.print2());
		System.out.println(iPrint2.print2());
		
		
	}
}

// ▼ 람다식을 사용하려고 만든 인터페이스란 뜻.
@FunctionalInterface 
interface IPrint{
	void print1(String a , String token);
	// 매개변수가 있는 인터페이스
}

@FunctionalInterface
interface IPrint2{
	String print2();
	// 매개 변수가 없는 인터페이스
}
