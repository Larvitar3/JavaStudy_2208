package ch02;

import com.google.gson.JsonObject;

public class MainTest1 {
	
	public static void main(String[] args) {
		
		JsonObject jsonObject1 = new JsonObject();
		jsonObject1.addProperty("name", "홍길동");
		jsonObject1.addProperty("age", "20");
		jsonObject1.addProperty("job", "개발자");
		
		System.out.println(jsonObject1);
		
		System.out.println(jsonObject1.get("name"));
		
		System.out.println("-------------------------------------------");
		
		 // 얕은 복사
		JsonObject jsonObject2 = jsonObject1; 
		System.out.println(jsonObject2);
		
		System.out.println("-------------------------------------------");
		
		jsonObject1.addProperty("취미", "코딩");
		System.out.println(jsonObject2);
		
		// 깊은 복사
		JsonObject jsonObject3 = jsonObject1.deepCopy();
		jsonObject3.addProperty("결혼여부", false);
		
		System.out.println("-----------------------------------------");
		System.out.println(jsonObject1);
		System.out.println(jsonObject3);
		
		
		
		
		
		
		
	}
}
