package string_api;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class MainTest2 {
	public static void main(String[] args) {
		
		// 중간연산
		// filter(), map()
		// filter : 조건에 맞는 요소를 추출
		// map : 해당하는 요소를 변형
		
		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		list.add(7);
		list.add(8);
		list.add(9);
		list.add(10);
		list.add(11);
		
		// 1. 스트림 생성
		Stream<Integer> myStream = list.stream();
		
		myStream.forEach(s1 -> System.out.println(s1));
		
//		myStream.filter(s -> (s >= 5)).forEach(n -> System.out.println(n));
		System.out.println(list);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
