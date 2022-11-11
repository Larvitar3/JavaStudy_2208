
/// 상수 생성자
/// 상수 생성자는 말 그대로 상수처럼 만들어 준다.
/// 이 말은 해당 클래스가 상수처럼 변하지 않는 객체를 생성한다는 것이다.
/// 상수 생성자를 만들기  위해서 인스턴스 변수가 모두 final 이어야 한다.
/// .연산자로 들어가서 객체의 값을 변경 할 수 없게 하는 것
/// 또한, 생성자는 const 키워드가 붙어야 한다.
void main (){
  Person person1 = const Person('kim', 20);
  Person person2 = const Person('kim', 20);
  Person person3 = new Person('kim', 20);
  Person person4 = Person('kim', 20);
  Person person5 = const Person('hong', 100);
  print(person1);

  // 런타임 시점에 한번 값이 정해지면 상수로 확정
  //person1.age = 100; // 오류 발생

  // Dart에서 주소값을 비교할 수 있는 함수
  // 상수풀 원리와 비슷함 --> 상수풀 복습 다시~
  print(identical(person1, person2));
  print(identical(person3, person4));
  print(identical(person1, person4));
  print(identical(person5, person1));
  // new로(생략가능) 새로 객체를 만들면 서로 다른 객체임!
  // 현재 객체로 생성된 Person은 총 4개

}

class Person {
  // final --> 데이터 타입 명시 !(var로 불가함)
  final String name;
  final int age;

  // 상수 생성자
  const Person(this.name, this.age);

  @override
  String toString() {
    return 'Person{name: $name, age: $age}';
  }
}

//toString 단축키 -> Alt + Insert