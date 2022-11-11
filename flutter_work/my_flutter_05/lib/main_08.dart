
import 'dart:isolate';

void main (){
  // Isolate 사이의 커뮤니케이션은 receivePort 와 안에 sendPort로 이루어진다.
  // 모든 Isolate 는 자신만의 receivePort 를 생성할 수 있고,
  // 또는 multiple receivePort 도 가능하다.

  ReceivePort receivePort = ReceivePort();
  receivePort.listen((message) {
    print("여기는 바로 수행된 것이 아니라 message 가 들어오면 동작 되는거야!");
    print("runtimeType check");
    print(message.runtimeType);
    print('들어온 메시지 확인 : ${message}');
  });

  print("main isolate 작업을 하고 있어요  ~ ~ ~ ~ ~");
  // 다른 Isolate 생성하고 작업 요청
  subIsolateProcess(receivePort.sendPort);
  //sendPort는 reveivePort 안에 있음 !
}

subIsolateProcess(SendPort sendPort){
  Isolate.spawn((sendPort) {
    for(var i=1; i <10; i++){
      print("i : $i 동작 수행");
    }
    sendPort.send("다른 작업자의 for문 동작 끝났어");
  }, sendPort);
}