
// asBroadcastStream
import 'dart:async';

void main(){

  final controller = StreamController();
  // 기본적으로 스트림 리스닝은 한번만 할 수 있다.
  // 리스너(구독자)를 여러개 만드는 방법
  final stream = controller.stream.asBroadcastStream();

  stream.listen((event) => print("넘어온 값 : $event"));

  // controller 값 추가 ▼
  controller.add("빅게임");
  controller.add(1);
  controller.add(2);

  stream.listen((event) => print("두번째 구독자"));
  stream.listen((event) => print("세번째 구독자"));
  stream.listen((event) => print("네번째 구독자"));
  stream.listen((event) => print("다섯번째 구독자"));



}

