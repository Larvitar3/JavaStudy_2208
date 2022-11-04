
import 'package:my_flutter_04/student.dart';

void main(){
  // 함수
  // 특별한 목적의 작업을 수행하기 위해 독립적으로 설계된 코드의 집합
  // 반복적인 프로그래밍을 피하고 코드를 재사용 할 수 있게 해줌
  // 함수로 프로그래밍을 나누어 작성하면 모듈화가 되고 코드의 가독성이 좋아지고
  // 문제가 발생했을 때 손쉽게 유지 보수를 할 수 있다

  // 모듈화란
  // main이 포함되어 있어 실행이 가능한 코드를 프로그램이라고 한다

  // import 된 상태
  print(Student());
  var student1 = Student();
  student1.hello("반가워");
  // main에서 모듈을 호출한다.

  var temp = f(100);
  print(temp);

  // 익명 함수와 람다식
  // return 키워들르 적지 않아도 값이 반환 되지만
  // 익명 함수는 값을 반환하려면 return 키워드를 꼭 적어야 함

  // 익명 함수 표현식
  // (매개변수){동작 or 반환값};

  magicBox((){
    print("더하기");
  });

  magicBox((){
    print("나누기");
  });

  // 함수를 매개변수로 전달할 수 있다.
  // 변수에 익명 함수를 대입할 수도 있다 (이때 Function 타입을 사용)

  Function add = (int n1, int n2){
    print(n1+n2);
  };
  add(3,10);
  print(add);

// 람다식
// 함수를 하나의 식으로 표현
// (매개변수)=> 동작 or 반환 값

// 람다 표현식
  Function addOne = (n)=>n+1;
  print(addOne(1));

  Function addTwo = (n){
    return n + 2;
  };
  print(addTwo(100));

}


// 함수의 형태
int f(int n){
  return n;
}

// Dart 에서는 함수를 매개변수로 전달 받을 때는 Function 키워드를 사용
void magicBox(Function f){
  // 함수를 호출하기 위해서는 () 사용
  f();

}