
void main(){
  Person person1 = Person();
  Person person2 = Person.init();
  Person person3 = Person.ageInit("20");

  print(person1);
  print(person2);
  print(person3);
}



class Person{
  var name;
  var age;

  // 이름이 없는 생성자
  // ★ 이름이 없는 생성자는 단, 하나만 만들 수 있다.
  Person(){

  }

  // 이름이 있는 생성자
  Person.init(){
  this.name = '이춘식';
  this.age = 12;
  }

  // 이름 있는 생성자
  Person.ageInit(this.age);
// 단축기 Alt + Ins
  @override
  String toString() {
    return 'Person{name: $name, age: $age}';
  }
}