
void main(){

  // 논리 연산자

  // 부정
  print("true --> ${!true}");

  // && ( AND )
  print("true && false = ${true && false}");

  // || ( OR )
  print("true || false = ${true || false}");

  // 조건문
  int point = 90;
  if(point >= 90){
    print("A학점");
  }else if (point >= 80){
    print("B학점");
  }else if (point >= 70){
    print("C학점");
  }else if (point >= 60){
    print("D학점");
  }else{
    print("F학점");
  }

  // 삼항연산자 ▶ 조건식 ? (참이면 실행할 조건문) : (거짓이면 실행할 조건문)
  int level = 5;
  print(level >= 10 ? "용사" : "시민");

  // null 대체 연산자
  // 변수의 값이 null이면 ?? 뒤에 값이 출력 되고, null이 아니면 변수의 값이 출력
  String? username = null;
  print(username);
  print(username ?? "이순신");

  String name = "이춘식";
  print(name ?? "null 이춘삼");
  String? name2;
  print(name2 ?? "null 이춘삼");



}
