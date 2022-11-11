
void main(){


  testCode().then((value) => print(value));
  addNumber(10, 10).then((value) => print("연산의 결과는 :  $value 입니다."));
  print("계산을 기다리는 중입니다.");

}

Future<String> testCode() async {

  print("start");
  var _futureValue = await Future.delayed(Duration(seconds: 2),() {
    for(int i = 0; i < 3; i ++){
      print("---> i : $i");
    }
    return "i 연산완료";
  },);
  print("end");
  return _futureValue;
}

Future<int> addNumber(int n1, int n2){
  var _futureNum = Future(() => (n1+n2));
  return _futureNum;
}

