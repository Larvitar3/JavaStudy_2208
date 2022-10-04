package dataList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ArrayListEx {
	
	public static void main(String[] args) {
		
		List list0 = new LinkedList<>();
		List<Integer> list = new ArrayList<>();
		
		list.add(1);
		list.add(2);
		list.add(3);
		
		System.out.println(list);

		list.add(0, 1000); // 인덱스 앞순서로 바로 추가할 수 있음.
		list.add(null);
		list.add(0, 5000);
		System.out.println(list);
		// addAll  확인해보기
		
		
		// 값 삭제하는 방법
		
		// 인덱스 번호로 삭제하기
		list.remove(4);
		System.out.println(list);
//		list.remove(5000); -> 인덱스 번호로 인식한다.
		// 오브젝트 단위로 삭제하기
		list.remove(new Integer(5000));
		System.out.println(list);
		
		// 한번에 모든 배열 내용 삭제하기.
//		list.clear();
//		System.out.println(list);
		
		
		// 사이즈 확인 방법
		System.out.println(list.size());
		
		// 값을 하나하나 출력하고 싶다면 a[19]
		// get 메서드 사용
		System.out.println(list.get(0));
		// 인덱스의 크기는 n-1개
		System.out.println(list.size() -1 );
		
		// 수정하기
		list.set(0, 2000);
		System.out.println(list);
		
		// 출력하는 방법
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		// while
		// 요소 순화(반복자) 컬렉션 프레임워크에 저장된 요소들을 하나씩 참조해주는 녀석
		Iterator<Integer> iter = list.iterator();
		
		while (iter.hasNext()) {
			System.out.println("요소 확인 : " + iter.next());
		}
		
		// 추가적으로 유용한 기능
		// contains = 리스트 안에 검색하려는 object가 있는지 확인해 주는 녀석 (object = 요소)
		System.out.println(list.contains(new Integer(2001)));
		
		System.out.println(list.contains(new Integer(2000)));
		
		// 해당 오브젝트가 몇번째 인덱스에 존재하는지 알고 싶다면 indexOf를 사용하면 된다.
		System.out.println("인덱스 위치 확인  : " + list.indexOf(2000));
		System.out.println("인덱스 위치 확인  : " + list.indexOf(2));
		
		// 만약 리스트안에 Object가 존재하지 않으면  -1을 반환한다.
		System.out.println("인덱스 위치 확인 : " + list.indexOf(100));
		
		List<String> list2 = new LinkedList<>();
		
		list2.add("가");
		list2.add("나");
		list2.add("다");
		list2.add("라");
		
		System.out.println(list2);
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
