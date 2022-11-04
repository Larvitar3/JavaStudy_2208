package ch03;

import com.google.gson.JsonObject;

public class Book {
	
	public static void main(String[] args) {
		
		JsonObject jsonObject1 = new JsonObject();
		jsonObject1.addProperty("bookId", "1");
		jsonObject1.addProperty("title", "이춘식의 모험");
		jsonObject1.addProperty("author", "이춘식");
		jsonObject1.addProperty("price", "12000");

		System.out.println(jsonObject1);
		System.out.println("----------------▲ 원형 ▲---------------");
		System.out.println();
		
		JsonObject jsonObject2 = jsonObject1;
		jsonObject2.addProperty("발행날짜", "2022.10.31");
		System.out.println(jsonObject1 + " object1");
		System.out.println(jsonObject2 + " object2");
		System.out.println("----------------▲ 얕은 복사 ▲-------------");
		System.out.println();
		
		JsonObject jsonObject3 = jsonObject1.deepCopy();
		jsonObject3.addProperty("장르", "소설");
		System.out.println(jsonObject1 + " object1");
		System.out.println(jsonObject2 + " object2");
		System.out.println(jsonObject3 + " object3");
		System.out.println("-------------▲ 깊은 복사 ▲ ---------------");
		
	}
}
