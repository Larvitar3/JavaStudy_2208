

void main(){

  // Dart 언어의 생성자 종류
  // 1. defult constructor ( 기본생성자 )
  // 2. Named constructor ( 이름이 있는 생성자 )
  // 3. Initalizer list ( 리다이렉팅 생성자 )
  // 4. constant constructor ( 상수 생성자 )
  // 5. Factory constructor ( 팩토리 생성자 )

  Student student = Student("춘식이");


}

class Person2{
  var name;
  var age;
  Person2(this.name){
    this.name = "xxx";
    this.age = 0;
    print("222222222222222");
  }
  @override
  String toString() {
    return "[$age, $name]";
  }
}

class Student extends Person2{
  Student(sName) : super(sName){
    print("1111111111111");
  }
}

class Person{

}

class Person{

}

