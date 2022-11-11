import 'dart:async';

void main() async{
  // Future 에서는 기다렸다가 하나의 값을 받을 수 있는 개념이지만,
  // Stream 은 주기적으로 여러번 반복해서 값을 받을 수 있는 특징이 있다

  // Stream 의 확장 개념으로 자신이 가지고 있는 스트림들을 다양하게 통제 할 수 있다.
  // 구독자와 관찰자의 패턴 중 일부
  // " 함수 한번 호출로 여러번 값을 전달 받았으면 좋겠다 " 라는 생각으로 개발 되었다.
  // async 패키지 안에 있음 ▼
  var controllerStream1 = StreamController();

  var controllerStream2 = StreamController(
    onPause: () => print("Pause"),
    onResume: () => print("Resume"),
    onCancel: () => print("Cancel"),
    onListen: () => print("Listen"),
  );

  controllerStream2.stream.listen(
    (event) => print("event : $event"),
    onDone: () => print("Done"),
    onError: (error) => print(error),
  );

  // Stream 에 구독자가 있는지 확인하려면 hasListener 을 사용
  // 즉, 리스너를 만들어 놓았는가 확인 코드 ( 구독자 = Listener )
  var hasListener = controllerStream2.hasListener; // true, false 리턴
  print("hasListener : $hasListener" );

  // Stream에 데이터 이벤트를 보내려면  add 또는 addStream을 보내면 된다.

  // data를 보내는 방법
  controllerStream2.add(1024);
  controllerStream2.add("안녕");

  final myStream = Stream<int>.periodic(Duration(milliseconds: 500), (count) => count).take(10);
  // StreamContller 는 여러개의 스트림을 관리 할 수 있다.
  await controllerStream2.addStream(myStream);

  // Stream에 오류 이벤트를 보내려면 addError 또는 addStream을 사용할 수 있다.
  controllerStream2.addError(Exception("User 101"));

  // Stream이 닫혔는지 확인하려면 isClosed 를 사용할 수 있다.
  var isClosed = controllerStream2.isClosed;
  print(isClosed);

  // Stream 을 닫으려면 close 를 사용하면 된다
  controllerStream2.close();
  print(">>>>>>구분자<<<<<");
  print(controllerStream2.isClosed);

  print("main end"); // 비동기 확인 코드



}
