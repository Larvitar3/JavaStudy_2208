
// asBroadcastStream
import 'dart:async';

void main(){

  final controller = StreamController();
  final stream = controller.stream;
  // 기본적으로 스트림 리스닝은 한번만 할 수 있다.

  stream.listen((event) => print("넘어온 값 : $event"));

  // controller 값 추가 ▼
  controller.add("빅게임");
  controller.add(1);
  controller.add(2);

  // 두번째 리스너 (구독자) 만들어 보기 ▶ 오류 : 스트림당 구독자는 하나만 가질 수 있다.
  // stream.listen((event) => print("2번째 구독자 : $event"));



}

