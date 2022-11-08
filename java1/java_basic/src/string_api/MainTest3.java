package string_api;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class MainTest3 {
	public static void main(String[] args) {
		
		List<String> sList = new ArrayList<>();
		sList.add("Tomas");
		sList.add("Edward");
		sList.add("Jack");
		sList.add("Amy");
		
		Stream<String> stream = sList.stream();
		
		// 기본
		stream.forEach(n -> System.out.println(n));
		
		// 정렬
		sList.stream().sorted().forEach(s -> System.out.println(s));
		
		// map
		sList.stream().map(s -> s.length()).forEach( n-> System.out.println(n));
		
		// filter
		sList.stream().filter(s -> s.length() >= 5 ).forEach(s -> System.out.println(s));
		
		
	}
}
