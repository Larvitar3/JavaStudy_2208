void main() {

  /// 변수를 사용할 때 명시적 타입
  /// 타입 추론은 값이 들어 올 때 타입을 추론하여 변수를 초기화화
 int n1 = 1;
  double d1 = 10.1;
  bool b1 = true;
  String s1 = "이순신";

//   print("정수 : " + n1); 안댬
  print("정수 :  $n1 ");
  print("실수 : $d1");
  print("부울 : $b1");
  print ("문자열 $s1 반가워");
  print("정수 : ${n1 + 10} = ??");

  print('정수 : ${n1.runtimeType}');
  print('실수 : ${d1.runtimeType}');

}