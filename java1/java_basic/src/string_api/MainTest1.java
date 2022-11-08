package string_api;

import java.util.Arrays;

public class MainTest1 {

	public static void main(String[] args) {
		
		// Stream API -> stream과는 다른 개념 (파일 IO / 소켓)XX
		// Java8.ver 부터 추가된 유용한 클래스
		// 자바에서는 많은 양의 데이터를 저장하기 위해서 배열이나 컬렉션프레임워크를 사용
		// 코드의 길이가 너무 길어지고 가독성이 떨어지며 코드의 재사용이 거의 불가능하다
		
		// 반복자 ( iterator ) -> Stream API 도입
		// Stream API 를 이용하면 배열이나 컬렉션 등 모두 같은 방법으로 다룰 수 있게 된다
		
		// Stream API의 동작 흐름
		// 스트림이라는 클래스가 생성
		// 스트림의 중간 연산
		//  스트림의 최종 연산
		
		// 추가 개념
		// 한번 생성한 스트림은 재사용이 불가능,
		// 단, 한번만 사용이 가능
		// 스트림은 원본 데이터를 변경하지 않음
		// 스트림은 연산으 필터 - 맵 기반 API를 사용하면 지연(Lazy)연산을 통해 성능을 최적화
		
		int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9}; 
		int sumValue = Arrays.stream(arr).sum();
		System.out.println(sumValue);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
