package string_api;

import java.util.ArrayList;
import java.util.List;

public class MainTest4 {

	public static void main(String[] args) {
		
		int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9}; 
		
		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		list.add(7);
		list.add(8);
		
		int sum2 = list.stream().mapToInt(n -> n.intValue()).sum();
		System.out.println(sum2);

		
		
		
	}
}
