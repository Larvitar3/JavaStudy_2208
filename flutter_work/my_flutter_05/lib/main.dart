/// 초기화 리스트
/// 초기화 리스트를 사용하면 생성자의 구현부가 실행되기 전에 인스턴스 변수를 초기화 할 수 있다.
/// (인스턴스 변수 초기화 대상 - 부모클래스, this)
/// 생성자 옆에  : (콜론)으로 선언 가능하다.
///  모양 1 ) 생성자 : 초기화 리스트 { }
///  모양2 )
///  Person () : name = ' 홍길동' { }
///  생성자 : 변수명 = 값 { }
void main() {
  Person p1 = Person();
  Person p2 = Person.init(); // 이름이 있는 생성자 호출

  print(p1.name);
  print(p2.name + " : ${p2.age}");
}

class Person {
  var name;
  var age;

  Person() : name = '홍길동'; //이것도 가능
  // Person( ) : name = '홍길동'{}

// 이름이 있는 생성자 + 초기화 리스트
  Person.init() : age = 10 {
    this.name = '홍길동';
  }
}
