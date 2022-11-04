package ch03;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

public class MainTest1 {
	
	public static void main(String[] args) {
		
		JsonObject jsonObject = new JsonObject(); // ▶ 단일 객체
		jsonObject.addProperty("name", "렝가"); 
		jsonObject.addProperty("age", 13); 
		
		System.out.println(jsonObject);
		System.out.println();
		
		
		JsonObject jsonObject1 = jsonObject.deepCopy();
		JsonObject jsonObject2 = jsonObject.deepCopy();
		jsonObject2.addProperty("name", "애쉬");
		jsonObject2.addProperty("age", 23);		
		JsonObject jsonObject3 = jsonObject.deepCopy();
		jsonObject3.addProperty("name", "티모");
		jsonObject3.addProperty("age", 15);
		System.out.println();
		// 배열 [{}, {}, {}]
		JsonArray jsonArray = new JsonArray();
		jsonArray.add(jsonObject1);
		jsonArray.add(jsonObject2);
		jsonArray.add(jsonObject3);
		System.out.println(jsonArray);
		System.out.println();
		// 리스트 계열 꺼내는 법
		System.out.println("-----------------------");
		System.out.println();
		System.out.println(jsonArray.get(2));
		System.out.println("-----------------------");
		System.out.println();
		System.out.println();
		// [{},{},{}] ▶ {"key" : [{},{},{}]}
		JsonObject mainObject = new JsonObject();		
		mainObject.add("arr", jsonArray);
		System.out.println(mainObject);
		
		// mainObject > list > lastObject
		
		int last =mainObject.getAsJsonArray("arr").size()-1;
		System.out.println();
		System.out.println(mainObject.getAsJsonArray("arr").get(last));
		System.out.println();
		System.out.println(mainObject.getAsJsonArray("arr").get(2).getAsJsonObject().get("name"));
		
		
		
		
		
		
		
		
	}
}
