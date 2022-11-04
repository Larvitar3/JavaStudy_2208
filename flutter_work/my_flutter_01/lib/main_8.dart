

void main(){
  // Dart에서는 4가지 기본타입을 제공 (Object)
  // 정수 int / 실수 double / 문자열 String / 논리 bool
  // Numbers(int,double)
  // String
  // bool
  // null

  // List
  // Set
  // Map

  // 변수에 넣을 수 있는 모든 것은 객체이고, 모든 객체는 클래스의 인스턴스
  // null을 제외하고 모든 객체는 Object 클래스에서 상속

  // Dart에서 형변환
  // var intTen = '10' as int;  ▶ 오류
  // print(intTen.runtimeType);  ▶ 오류
  // as = 다운캐스팅에서 사용

  // String ▶ int
  var intTen2 = int.parse('10');
  print(intTen2.runtimeType);

  // String ▶ double
  var onePoint = double.parse("1.1");
  print(onePoint);
  print(onePoint.runtimeType);

  // int ▶ String
  String oneAsString = 1.toString();
  print(oneAsString);
  print(oneAsString.runtimeType);

  // double ▶ String
  String pieAsString = 3.1415927.toString();
  print(pieAsString);
  print(pieAsString.runtimeType);

  // double 원하는 소수점 자릿수까지 자르기
  String pieAsString2 = 3.1415927.toStringAsFixed(2);
  print(pieAsString2);

  // String ▶ bool
  String str1 = 'false';
  bool isOk = str1.toLowerCase() == 'true';
  print(isOk);
  print(isOk.runtimeType);

  // bool ▶ String
  bool isEmpty = true;
  String str2 = isEmpty.toString();
  print(str2);
  print(str2.runtimeType);

  // 결과 값이 맞는지 확인 ( runTime 중 오류가 있는지 확인할 때 사용 )
  assert(oneAsString == '1');
  print("String 실행중");

  assert(oneAsString == 1);
  print("int 실행중");
  
  
}