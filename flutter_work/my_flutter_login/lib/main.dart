import 'package:flutter/material.dart';
import 'package:my_flutter_login/pages/home_page.dart';
import 'package:my_flutter_login/pages/login_page.dart';
import 'package:flutter_svg/flutter_svg.dart';

void main() {
  // 화면 이동을 위한 Routes
  // Routes = 경로 ( /a/b/c )

  runApp(MyApp());

}

class MyApp extends StatelessWidget {
  const MyApp({Key? key}) : super(key: key);

  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      // 여러 페이지일 경우 경로를 지정하는것 (프로토콜)
      initialRoute: "/login",
      routes: {
        "/login" : (context) => LoginPage(),
        "/home" : (context) => HomePage(),
      },
    );
  }
}


