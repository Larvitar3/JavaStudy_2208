import 'dart:isolate';

void main() {
  // Isolate 사이의 커뮤니케이션은 ReceivePort와 안에 sendPort로 이뤄진다
  // 모든 Isolate는 자신의 ReceivePort를 생성할 수 있고, multiple receivePort도 가능

  ReceivePort receivePort = ReceivePort();
  receivePort.listen((message) {
    print("여기는 메세지가 들어오면 동작하는 곳");
    print("runtype");
    print(message.runtimeType);
    print("들어온 메세지 확인 : $message");
  });

  print("main 작업중");
  // 다른 Isolatye 생성하고 작업 요청
  sublsolateProcess(receivePort.sendPort);
}

sublsolateProcess(SendPort sendPort) {
  Isolate.spawn((sendport) {
    for (var i = 0; i < 10000; i++) {
      print("i : $i 동작실행");
    }
    sendPort.send("다른 작업자에게 작업이 끝났다 ");
  }, sendPort
  );
}

