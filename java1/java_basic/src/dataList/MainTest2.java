package dataList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;

public class MainTest2 {

	public static void main(String[] args) {
		
		ArrayList<Integer> arrayList = new ArrayList<>();
		
		for(int i = 1; i <= 45; i++) {
			arrayList.add(i);
		}
		
		Collections.shuffle(arrayList); // 섞는 것
		System.out.println(arrayList.subList(0, 6));// ArrayList를 원하는 부분만 출력
		
		
	}
}
