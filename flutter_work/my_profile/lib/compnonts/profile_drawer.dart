import 'package:flutter/material.dart';

class ProfileDrawer extends StatelessWidget {
  const ProfileDrawer({Key? key}) : super(key: key);

  @override
  Widget build(BuildContext context) {
    return Container(
      width: 200,
      height:double.infinity, // <---- 화면 끝까지 차지하는 방법
      color: Colors.blue,
    );
  }
}
