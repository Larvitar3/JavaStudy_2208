

void main() {

  print("start");
  Future futureDelay = sleepDuraion(2);
  futureDelay.then((value) => print("작업완료"));
  print("end");

  tryFuture().then((value) => print(value));

  // Future 의 값을 받기 위해선 then을 사용해야한다.
  useFutureType().then((value) => print(value));

}

// 기다리게 하기
Future sleepDuraion(var s){
  return Future.delayed(Duration(seconds: s));
}

// 데이터 넘기기
Future<String> useFutureType(){
  var _mFuture = Future.delayed(Duration(seconds: 2),() => "홍길동");
  // var _mFuture = Future(() => "수행결과 넘기기");

  return _mFuture;
}

Future<String> tryFuture(){
  var _mFuture = Future(() => "이춘식");
  return _mFuture;
}
















