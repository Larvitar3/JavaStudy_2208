import 'package:flutter/material.dart';

void main() {
  runApp(const Center());
}

class MyApp extends StatelessWidget {
  const MyApp({Key? key}) : super(key: key);

  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      home: Container(
        child: Center(child: Text('반가워')),
        color: Colors.amber,
      ),
    );
  }
}
