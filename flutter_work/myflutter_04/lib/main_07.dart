
// Dart isolate & Receiport
// 일반적인 프로그래밍은 순차적으로 작업을 처리, 즉, 하나의 작업을 요청한 후 그 작업이
// 끝나면 다음 작업으로 넘어간다. 이런경우 처리시간이 긴 작업 관련된 상황을 만나면 사용자는
// 프포그램이 먼ㅁ춘것 처럼 느낄 수 있다.
// 이러한 문제는 비동기 프로그래밍 (Astnchrous programming 해곃 가능
// 비동기 프로그램은 요청한 작업의 결과를 기다리지 않고 다음 작업으로 넘어감으로써
// 프로그램의 실행이 멈추지 않는다.

// 비동기 동시성

import 'dart:isolate';

void main(){
  print("----------------");
  Isolate.spawn(doNewJolsolate, "1번");
  Isolate.spawn(doNewJolsolate, "2번");
  Isolate.spawn(doNewJolsolate, "3번");

  // Drat는 1급 언어를 지원하는 언어( 매개변수로 함수를 전달할 수 있다)

}

doNewJolsolate(var StaskContent){
  print(">>>>>> $StaskContent<<<<<<");
}















