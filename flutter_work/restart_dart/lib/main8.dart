void main(){
fetchData();
print("메인 부분");
}

 fetchData() async{
  print("Strart");
  // 서버에서 데이터를 받을 때까지 대기
  var _data = await Future.delayed(Duration(seconds: 1), (() => print("반가워")));
  print("end");
  return _data;
}

fetchData2() {
  print("Strart");
  var _data = Future.delayed(Duration(seconds: 1), (() => print("이춘식")));
  print("end");
  return _data;
}

fetchData3() async {
  print("Strart");
  var _data =  await Future.delayed(Duration(seconds: 1), (() => print("이춘식")));
  print("end");
  return _data;
}
