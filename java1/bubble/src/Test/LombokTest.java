package Test;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
// 컴파일 시점에 자동으로 게터를 넣어줌.
@Setter
// 컴파일 시점에 자동으로 세터를 넣어줌
@AllArgsConstructor
// 생성자의 형식을 미리 만듬
@NoArgsConstructor
// 기본 생성자 생성
class Dog {

	private String name;
	private int age;

}

public class LombokTest {

	public static void main(String[] args) {
		Dog dog = new Dog("아루루룰", 10);
		dog.setName("알알");
		dog.setAge(12);
		System.out.println(dog.getName());
	}

}
