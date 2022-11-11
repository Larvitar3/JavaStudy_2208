
// asBroadcastStream
import 'dart:async';

void main(){

  final controller = StreamController();
  // 기본적으로 스트림 리스닝은 한번만 할 수 있다.
  // 리스너(구독자)를 여러개 만드는 방법
  final stream = controller.stream.asBroadcastStream();

  // 구독자 1 : 전체 이벤트를 받는 구독자
  stream.listen((event) => print("넘어온 값 : $event"));

  // 구독자 2 : 홀수만 받는 구독자
  stream.where((event) => (event %2 == 0)).listen((event) => print("두번째 구독자"));

  // 구독자 3 : 짝수만 받는 구독자
  stream.where((event) => (event %2 == 1)).listen((event) => print("세번째 구독자"));

  // controller 값 추가 ▼
  controller.add(1);

}

