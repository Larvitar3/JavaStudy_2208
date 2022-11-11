
void main() async{

  // 비동기 프로그램
  // 미래타입 사용 ( Future - 미래에 받아올 값 )
  // 비동기 방식의 리턴 타입은 무조건 미래타입이여야한다.
  Future<String> name = Future.value("텐코딩");
  Future<int> naumber = Future.value(10);
  Future<bool> isTrue = Future.value(true);
  // 비동기는 논리적으로 막아서 처리

  await addNumbers(10, 10);
  print(">>>>구분 <<<<");
  final result2 = addNumb(20, 20);

  // print(">>>>구분 <<<<");
  // print("result : ${result1}");
  // print("result : ${result1 + result2}");
  // print(">>>>구분 <<<<");

  // 비동기 방식의 흐름을 동기 방식으로 만드는 방법
  // 함수 선언부와 바디 구현부 사이에 async 를 넣어 주어야한다.
  // await 키워드를 사용해야한다


}

// 동기화 프로그램 ( 위의 식이 먼저 실행 된 후 아래 식이 실행된다)
void addNumb(int n1, int n2) async {
  print("계산중 $n1 + $n2");
  
  // 서버 데이터를 요청
  await Future.delayed(Duration(seconds: 2), () {
    print("계산완료 : ${n1 + n2}");
  },);

  print("함수실행완료 ${n1 + n2}");

  // 비동기 방식 함수 만들어 보기 / 사용 , 리턴은 void 타입
}

Future<int> addNumbers(int n1, int n2) async{
  print(">>>>>>><<<<<<");
  await Future.delayed(const Duration(seconds: 2), () => n1 + n2);
  print("$n1 + $n2");
  print(">>>>>>>>>><<<<<<<<<");
  return n1 + n2;

}


