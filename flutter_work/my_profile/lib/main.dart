
import 'package:flutter/material.dart';
import 'package:my_profile/pages/profile_page.dart';
import 'package:my_profile/thema.dart';

// 최상위 함수
void main () {

  runApp(MyApp());
}

class MyApp extends StatelessWidget {
  const MyApp({Key? key}) : super(key: key);

  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      debugShowCheckedModeBanner: false,
      theme : theme(),
      home:ProfilePage(),
    );

  }
}
