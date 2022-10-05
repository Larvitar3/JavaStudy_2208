package lambdaEx.ch02;

public class MainTest1 {

	public static void main(String[] args) {
		
		IMaxNumber2 iMaxNumber = (num1, num2) -> {
			if(num1 < num2) {
				System.out.println("첫번째 람다 :  " + num2);
			}else {
				System.out.println("첫번째 람다 :  " + num1);
			}
		};
		iMaxNumber.maxNumber(50, 30);
		
		
		IMaxNumber2 iMaxNumber2 = (num1, num2) ->{
			int maxNum = (num1 > num2) ? num1 : num2;
			System.out.println("두번째 람다 :  " + maxNum);
		};
		
		iMaxNumber2.maxNumber(100, 50);
		
		// 람다식 만들기
		IMaxNumber maxNumber = (num1, num2) ->{
			return (num1 > num2) ? num1 : num2;
		};
		
		System.out.println("세번째 람다 :  " + maxNumber.getMax(150, 100));
		
		// 자바 람다 표현식이란.
		// 함수형 인터페이스를 제공 람다 표현식으로 생성 후에 사용할 수 있다.
		// 반복적인 코드를 줄여서 간소화를 순수 함수 사이드 이펙트 영향을 줄이는데 목적이 있다.
		// 단, 가독성이 떨어진다.

	}
}

@FunctionalInterface
interface IMaxNumber2{
	// 테스트용 인터페이스
	 void maxNumber(int num1, int num2);
}





