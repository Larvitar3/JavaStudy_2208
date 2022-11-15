import 'package:flutter/material.dart';
import 'package:http/http.dart' as mHttp;

void main() {
  runApp(MaterialApp(
    home: Home(),
  ));
}

class Home extends StatefulWidget {
  const Home({Key? key}) : super(key: key);

  @override
  State<Home> createState() => _HomeState();
}

class _HomeState extends State<Home> {
  var resText = "";

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      body: Column(
        children: [
          Container(
            child: Center(
              child: Text(resText ?? ""),
            ),
          ),
          TextButton(
            onPressed: () {
              setState(() {
                fetchData(3);
              });
            },
            child: Text("데이터 요청 버튼"),
          )
        ],
      ),
    );
  }

  /// 통신기능 하는 함수 만들기
  fetchData(int id) async {
    var uri = Uri.parse("https://jsonplaceholder.typicode.com/users/$id");
    print("----------------------------------");
    print(uri.runtimeType);
    // method 방식을 get 으로 처리

    //Http 메시지를 만들어서 요청을한다
    mHttp.Response response = await mHttp.get(uri);
    resText = response.body;
    print(response.runtimeType);
    print("----------------------------------");
    print(response.body);
    print("----------------------------------3");
    print(response.headers);
  }
}
