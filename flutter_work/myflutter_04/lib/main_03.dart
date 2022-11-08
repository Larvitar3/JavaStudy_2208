

void main() {
  // 상수생성자
// 상수생성자는 말 그대로 상수처럼 만들어준다.
// 해당 클래스가 상수처럼 변하지 않는 객체를 생성한다는 것
// 변수가 모두 final 이어야 한다. 또한 생성자는 const 키워드가 붙어야한다.

Person person1 = const Person("Me", 20);
Person person2 = const Person("Me", 20);
Person person3 = new Person("Me", 20);
Person person4 = Person("Me", 20);
Person person5 = const Person("You", 20);
// 메모리는 총 4개가 올라간다

// Dart에서 주소값을 비교할 수 있는 함수
  print(identical(person1, person2));
  print(identical(person3, person4));
  print(identical(person1, person4));
  print(identical(person1, person5));


}

class Person{
  final String name;
  final int age;

  // 상수생성자. ( 변수에 final을 넣지않으면 오류 발생 )
  const Person(this.name, this.age);

  @override
  String toString() {
    return 'Person{name: $name, age: $age}';
  }
}


