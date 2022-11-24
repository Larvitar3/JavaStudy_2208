import 'package:flutter/material.dart';
import 'package:kakao_pj/screens/main_screen.dart';


void main() {
  runApp(const MyApp());
}

class MyApp extends StatelessWidget {
  const MyApp({Key? key}) : super(key: key);

  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      debugShowCheckedModeBanner: false,
      theme: ThemeData(
        appBarTheme: const AppBarTheme(
          iconTheme: IconThemeData(
            color: Colors.black,
          ),
          elevation: 0.0,
          backgroundColor: Colors.white,
          titleTextStyle: TextStyle(
            fontSize: 24,
            color: Colors.black,
          ),
        ),
      ),
      home: MainScreen(),
    );
  }
}
