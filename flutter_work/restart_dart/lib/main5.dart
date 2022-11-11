

void main() {

  // Future는 내부적으로 상태 값을 가진다
  // 1. 미완료 ( Uncompleted )
  // 2. 완료 ( Completed ) ▷ [ then ] 사용
  // 2_1. 연산 성공 (Data : 정상적으로 작업 수행 결과까지 넘겨받고 완료)
  // 2_2. 연산 실패 (Error : 작업 중에 문제 발생 시 error를 반환 후 완료)

  // 성공 시 : null의 위치 값 , 실패 시 : onError 의 값이 출력된다.
  useFutureType().then((value) => null, onError: (error) => {
    print("잘못된 요청")
  });

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
















