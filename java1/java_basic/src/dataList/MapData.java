package dataList;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class MapData {
	
	public static void main(String[] args) {
		
		Map map;
		// key 와 value구조로 데이터를 저장
		
		HashMap<String, String> map1 = new HashMap<>();
		
		map1.put("A01","김포공항정문");
		map1.put("A02","김포공항후문");
		map1.put("A03","김포공항후문");
		map1.put("A04", null);
		map1.put("A04", "중복값");
		
		System.out.println(map1);
		
		// 값을 꺼내는 방법
		System.out.println(map1.get("A01"));
		
		// 없는 값은 null로 반환
		System.out.println(map1.get("C01"));
		
		// null 값을 저장하지 않는 map 계열
//		Hashtable<String, String> hashtable = new Hashtable<>();
//		hashtable.put("h1", "안녕");
//		hashtable.put("h2", null); // 단점  : 컴파일 시점에 확인되지않는다.
//		System.out.println(hashtable);
		
		// 값 수정
		map1.put("A01", "값수정");
		System.out.println(map1);
		
		// 삭제 방법
		map1.remove("A01");
		map1.remove("A01", new ArrayList<>());
		System.out.println(map1);
		
		// 전체 삭제
//		map1.clear();
//		System.out.println(map1);
		
		// map 인덱스
		for(int i = 0; i < map1.size(); i ++) {
			System.out.println(map1.get(i));
		}
		
		// map 계열을 반복문을 사용할 때 foreach를 사용
		for (String key : map1.keySet()) {
			System.out.println("key : " + key);
			// 값을 꺼낼 때
			System.out.println("value : " + map1.get(key));
		}
		
		for(Entry<String, String> entry : map1.entrySet()) {
			System.out.println("[Key] : " + entry.getKey() + "," + " value : " + entry.getValue());
		}
		
		
		
		
		
	}

}
