package ch10;

public class Animal {

	// 1.
	String name;
	int age;
	int weight;
	int height;
	
	public Animal(String name, int age, int weight) {
		this.name = name;
		this.age = age;
		this.weight = weight;
		System.out.println("1");
	}
	
	public Animal(String name, int age) {
		this.name = "코돌이";
		this.age = 22;
		System.out.println("2");
	}
	
	public Animal() {
		this("푸바오", 3);
	}
	
	public void showInfo() {
	}
	
	public static void main(String[] args) {
		Animal animal = new Animal();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
