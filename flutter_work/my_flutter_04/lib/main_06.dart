
void main(){

  String name1 = "이춘식";
  String name2 = "삼춘식";

  print(name1 + name2);

  // nullable - null 이 될 수 있다.
  // non-nullable null 이 될 수 없다
  // null - 아무런 값도 없다

  String name = "이춘식";
  String? name4 = "삼춘식";
  name4 = null;
  print(name4);

  // [ ! ] 여긴 null 값이 들어올 수 없다는 뜻 ( null이 들어올 시 오류 발생 )

  // 상수 const - final

  DateTime now1 = DateTime.now();
  print(now1);


  DateTime now2 = DateTime.now();
  print(now2);

  

  final DateTime now3 = DateTime.now();
  print(now3);

  // 컴파일 타임에 값을 받아야하는데 DateTime 은 실행 시점에서 실행되기때문에
  // 여기서는 사용 안됨
  // const DateTime now4 = DateTime.now();






}
