import 'package:flutter/material.dart';

void main() {
  runApp(MyApp());
}

class MyApp extends StatelessWidget {
  const MyApp({Key? key}) : super(key: key);

  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      home: Container(
        color: Colors.white,
        // Stack : 겹치는 레이아웃
        child: Stack(
          children: [
            Positioned(
              left: 150.0,
              bottom: 200.0,
              child: Container(
                width: 100, height: 100,color: Colors.redAccent,
              ),
            ),
            Container(
              width: 90, height: 90,color: Colors.blue,
            ),
            Container(
              width: 80, height: 80,color: Colors.deepPurpleAccent,
            ),
          ],
        ),
      ),
    );
  }
}

