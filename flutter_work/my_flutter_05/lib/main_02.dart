///리다이렉팅 생성자
///생성자에서 다른 생성자를 호출하는 것
///초기화 리스트를 약간 응용하면 단순히 리다이렉팅을 위한 생성자를 만들 수 있다.
///이러한 생성자는 본체가 비어있고 메인 생성자에게 위임 (delegate)하는 역할을 한다.
void main() {
  Person person = Person.init("티모");
  print(person);
  print(person.name);
  print(person.age);
}

class Person {
  var name;
  var age;

  Person(this.name, this.age) {
    print("this is Person ${name} , ${age}");
  }

  // 초기화 리스트를 활용한 리다이렉팅 생성자
  Person.init(String name) : this(name, 20);
}
