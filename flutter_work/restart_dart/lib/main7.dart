void main()async {

  // Future<String> fData = Future.value("이춘식");

  // String name = vmServer(1); Future로 받아야함
  // Future<String> name = vmServer(1);
  // name.then((value) => print(value));
  String result = vmServer(1).then((value) => value).toString();
  print("메인함수종료");

  // 연산이 필요한 동작이라면 then 안에서 처리하면 된다.
  // name.then((value) {
  //   String data = " <<<<<<<<"+ value +">>>>>>>>";
  //   print(data);
  // });

  // String customResult = name.then((value) => value).toString();
  // String temp = "$customResult, 100";
  // print(temp);


}

Future<String> vmServer(int id) async{
  print("서버실행");
  return  await  Future.delayed(const Duration(seconds: 2), (() => "이춘식"));
}





