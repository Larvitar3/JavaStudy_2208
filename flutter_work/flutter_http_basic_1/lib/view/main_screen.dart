import 'package:flutter/material.dart';
import 'package:flutter_http_basic_1/view/header.dart';
import 'package:flutter_http_basic_1/view/user_info.dart';

class MainScreen extends StatelessWidget {
  const MainScreen({Key? key}) : super(key: key);

  @override
  Widget build(BuildContext context) {
    return Container(
      decoration: BoxDecoration(
        gradient: LinearGradient(
          stops: [0.2, 1.0],
          colors: [
            Colors.blueAccent,
            Colors.deepOrangeAccent,
          ],
            begin: FractionalOffset.center,
          end: FractionalOffset.bottomCenter,
        ),
      ),
      child: Scaffold(
        backgroundColor: Colors.transparent,
        body: Column(
          children: [
            Header(),
            UserInfo(),
          ],
        ),
      ),
    );
  }
}
