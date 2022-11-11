
import 'dart:isolate';

/// Dart isolate & ReceivePort
/// 일반적인 프로그래밍은 순차적으로 작업을 처리한다.
/// 즉 하나의 작업을 요청한 후 그 작업이 끝나면 다음 작업으로 넘어간다.
/// 이런 경우 처리시간이 긴 작업 (특히 ui와 관련된 상황)을 만나면
/// 사용자는 프로그램이 멈춘 것 처럼 느낄 수 있다.
/// 이러한 문제는 비동기 프로그래밍(Asynchronous programming)으로 해결할 수 있다.
/// 비동기 프로그래밍은 요청한 작업의 결과를 기다리지 않고 바로 다음 작업으로 넘어감으로써
/// 프로그램의 실행을 멈추지 않는다.
///
/// 비동기는 동시성(Concurrency) 이나 병렬(Parallel)은 비교 군이 될 수 없는 다른 개념이다.
/// 다트 에서는 future, stream API 를 통해서 자체적으로 비동기 프로그래밍을 지원한다.
/// 그 전에 isolate 라는 다트의 독특한 구조부터 알아야 한다.
///

/// isolate - 격리하다는 의미
/// isolate는 다트의 모든 코드가 실행되는 공간이다.
/// 싱글 스레드를 가지고 있고, 이벤트 루프를 통해 작업을 처리한다.
/// 기본 isolate인 main isolate는 런타임에 생성된다.

void main () {
  print("...................................main isolate............................");
  // 새로운 isolate 생성하기 : spawn 함수를 사용하면 된다.
  // Dart는 일급 객체를 지원하는 언어 입니다.
  // 즉 매개 변수로 함수를 전달할 수 있다 !! (자바는 불가능)
  Isolate.spawn(doNewJobIsolate,"1번 너가 할 일 청소");
  Isolate.spawn(doNewJobIsolate,"2번 너는 잠자기");
  Isolate.spawn(doNewJobIsolate,"3번 너는 집에 가기");
// 순서가 보장되지 않는다
//cpu가 처리하므로 우리가 손을 델 수 없음!
// 쉐어드 리소스를 발생 시키지 않는다.

} // end of main

doNewJobIsolate(var taskContent) {
  print('>>> $taskContent <<<');
}