package ch10;

public class Person {

	// this란
	//  1. 인스턴스(객체) 자신의 메모리를 가르킨다.
	// 2. 생성자에서 또 다른 생성자를 호출할 때 사용할 수 있다.
	// 3. 자신의 주소 (참조값, 주소값) 를 반환시킬 수 있다
	
	String name;
	int age;
	int phone;
	String gender;
	
	public Person(String name, int age) {
		// 1. 자기자신을 가르키는 this
		this.name = name;
		this.age = age;
		System.out.println("사용자 정의 생성자 기능을 종료합니다.");

	}
	
	public Person(String name, int age, int phone) {
//		this.name = name;
//		this.age = age;
//		this.phone = phone;
//		this ();
		this(name, age);
		this.phone = phone;		
	}
	public Person(String name, int age, int phone, String gender) {
		this(name, age, phone);
		this.gender = gender;
	}
	
	public  Person() {
		// 2. 생성자에서 또 다른 생성자를 호출할 때 this 사용할 수 있다
		// this.name = "아무개";
		// this.  age = 1;  
		this("아무개", 1);
		System.out.println("기본생성자 기능을 종료합니다.");

	}
	
	// 디자인 패턴 :
	// this 빌더패턴을 이해할 수 있다.
	public Person getPerson() {
		// 3번 자기 자신의 주소값을 반환 시킬 수 있다.
		
		return this;
	}
	
	public void showinfo() {
		System.out.println("이름 : " + name + "   나이 : " + age);
	}
	
	
	
	
	// 잠시 자리 를 빌려서 사용할 수 있다. (자바 문법)
	public static void main(String[] args) {
		 Person person1 = new Person(); 
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
