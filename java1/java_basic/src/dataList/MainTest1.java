package dataList;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;

public class MainTest1 {

	public static int getLottoNumber() {
		Random random = new Random();
		int result = random.nextInt(45) + 1;
		return result;
	}

	public static void main(String[] args) {
		
		boolean flag = true;

		HashSet<Integer> hashSet = new HashSet<>();

		for (int i = 0; i < 6; i++) {
			hashSet.add(getLottoNumber());
		}

		while(flag) {
			if(hashSet.size() < 6) {
				// 중복값이 나오면 덮어쓰기되어 hashSet의 Size가 중복 값이 있는 만큼 줄어들기 때문에
				// size값이 6보다 작으면 하나 더 추가하게 만들어준다.
				hashSet.add(getLottoNumber());
			}else {
				flag = false;
				// 만약 hashSize의 값이 6보다 작지않다면 while문을 종료
			}
		}
		
		System.out.println(hashSet);
		
	}

}















