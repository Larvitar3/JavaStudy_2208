package ch01;

public class DataTypeTest {

	public static void main(String[] args) {
		
		// 1. 정수 550을 name1 이름에 변수로 담는다.
		int name1 = 550;
		
		// 2. 정수 22억을 name2 이름에 변수로 담는다
		long name2 = 2200000000L;
		
		// 3. 문자형 A를 name3 이름에 변수로 담는다.
		char name3 = 'A';
		
		// 4. 실수 float 타입으로 0.12345678을 name4 이름에 변수로 담는다.
	
		float name4 = 0.12345678F;
		float name4_1 = (float)0.12345678;
		
		// ▲ 기본 연산자가 double로 적용되기 때문에 float연산을 사용할 것이다 라고 자바에게 
		// 알려주므로 입력해도 정상적으로 값이 들어간다
		
		// 5. 실수 double 타입으로 200.0012를 name5 이름에 변수로 담는다.
		double name5 = 200.0012;
		
		// 6. 논리 자료형 isOK 라는 이름으로 변수를 선언
		boolean isOk;
		
		// 7. isOK 변수에 리터럴값 false 로 초기화
		isOk = false;
		
		// 8. isOK 변수를 true 값으로 변경
		isOk = true;
		
		// 9. 변수란 무엇인지 서술
		// 변하는 수, 저장하는 데이터의 값
		
		// 10. 기본데이터타입 8가지의 크기를 서술
		// byte (1byte), short(2byte), int(4byte), long(8byte)
		// char(2byte), float(4byte), double(8byte), boolean(1byte)

	}

}
