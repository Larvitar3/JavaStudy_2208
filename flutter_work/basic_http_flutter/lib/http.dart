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
                child: Text(resText),
            ),
          ),
          TextButton(
              onPressed: () {
                setState(() {
                  fetchData();
                });
              },
              child: Text("버튼"))
        ],
      ),
    );
  }

  fetchData() async {
    var uri = Uri.parse("https://jsonplaceholder.typicode.com/photos");
    mHttp.Response response = await mHttp.get(uri);
    resText = response.body;
  }
}
