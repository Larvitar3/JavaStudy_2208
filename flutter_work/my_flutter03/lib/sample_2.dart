import 'package:flutter/material.dart';

void main(){

  runApp(const MyApp());

}



class MyApp extends StatelessWidget {
  const MyApp({Key? key}) : super(key: key);

  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      home: Container(
        child: Row(
          children: [
            Text("이춘식"),
            Text("이춘삼"),
            Expanded(child: FlutterLogo())
          ],
        ),
      ),
    );
  }
}