package ch07;

public class Person {

	int height;
	int weight;
	String gender;
	String name;
	int age;
	
	public Person() {
		// 기능 호출
		this.ShowInfo();
	}
	
	public Person(int height, int weight, String gender, String name, int age) {
		this.height = height;
		this.weight = weight;
		this.gender =gender;
		this.name = name;
		this.age = age;
	}
	
	public String ShowInfo(){
		return "키 : " + height + "  몸무게 : " + weight + "  성별 : " + gender + 
				"  이름 : " + name + "  나이 : " + age;
	}
	
}
