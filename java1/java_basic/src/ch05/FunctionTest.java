package ch05;

public class FunctionTest {

	public static void main(String[] args) {
		
		// 함수를 사용할 때는 함수를 호출
		// 함수나 객체 일땐 괄호가 있음▼
		int myResult = addNum(10, 100);  // 반환(return)값이 있기때문에 변수에 담아줌
		System.out.println(myResult);
		
		sayHello("안녕하세요");
//		String a  = sayHello("안녕하세요"); <= 오류, 반환(return)값이 없기때문에 오류
		sayHello("반갑습니다");
		
		System.out.println("==================");
		int myResult2 = calcSum();
		System.out.println(myResult2);
		
		int num1 = 10;

	} // end of main
	
	// 함수를 설계 ▼ ( 모양) / 함수를 사용하는 모양()
	public static int addNum(int n1, int n2) {

		// 두 개의 매개변수를 받아서 덧셈 하는 기능을 만들기.
		// 함수안에 사용하는 변수를 지역변수라고 부른다.
		int result;
		result = n1 + n2;
		return result;
	}
	
	public static void sayHello(String greeting) {
		System.out.println(greeting + "^^");
	} // end of sayHello
	
	public static int calcSum() {
		int sum = 0;
		int i;
		for(i=0; i <= 100; i++) {
//			sum = sum + i;
			// 복합대입연산자 사용
			sum += i;
		}
		return sum;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
