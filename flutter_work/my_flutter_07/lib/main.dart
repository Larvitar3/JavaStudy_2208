import 'package:flutter/material.dart';
import 'package:my_flutter_07/home_screen.dart';

void main() {
  runApp(const MyApp());
}

class MyApp extends StatelessWidget {
  const MyApp({Key? key}) : super(key: key);

  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      home: HomeScreen(mColor: Colors.black),
    );
  }
}
