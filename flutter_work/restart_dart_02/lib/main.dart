

void main(){
  // java stream ▶ 비동기를 지원하지 않음
  // dart stream ▷ javaStream + 비동기 지원

  // dart Stream은 dart:core / dart:async 패키지에서 사용 가능
  // import 'dart:async'; ▶ 더 많은 기능을 가지고있는 패키지

  print("실행1");
  // Stream 을 사용하는 첫번째 방법
  Stream stream1 = Stream.value(100);
  // Stream 확인 ( then과 같음 )
  print("실행2");
  stream1.listen((v){print("넘어온 값 $v");});

  print(">>>>>>구분자<<<<<<");
  print("실행3");

  print(">>>>>>구분자<<<<<<");
  // Future에서는 한번 event가 넘어오면 종료

  //Stream 을 사용하는 두번째 방법 (List)
  Stream.value({1,2,3,4,5,6,7}).forEach((e) { print("여기는 $e"); });
  // 한번에 List의 내역이 모두 넘어온다.

  print("Restart1");
  // periodic : 주기적인, take : 반복 수
  var stream = Stream.periodic(Duration(milliseconds: 300), (x) => (x+1)).take(20);
  stream.listen((event) {print("이벤트 값 : $event");});
  print("Restart2");
  print(">>>>>>구분자<<<<<<");

}