package dataList;

import java.util.HashMap;
import java.util.Scanner;

public class PhoneNumber {

	public static void main(String[] args) {
		
		HashMap<String, String> map = new HashMap<>();
//		map.put("Key 값 (중복 X) = 번호 // ", "Value 값 (중복 O)  = 이름 ");
		
		Scanner scanner = new Scanner(System.in);
		String number = scanner.nextLine();
		String name = scanner.nextLine();
		boolean flag = true;
		int flagCount = 0;
		
		while(flag) {
			System.out.println(flagCount);
			if(flagCount <=  3) {
				map.put(number, name);
				flagCount ++;

			}else {
				flag = false;

			}
	
		}
	
		System.out.println(map);

		
	}
	
}
