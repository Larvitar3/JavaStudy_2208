import 'package:flutter/material.dart';
import 'package:flutter_airbnb/styles.dart';

import '../../size.dart';

class HomeHeaderAppbar extends StatelessWidget {
  const HomeHeaderAppbar({Key? key}) : super(key: key);

  @override
  Widget build(BuildContext context) {
    return Padding(
      padding: const EdgeInsets.all(gap_m),
      child: Row(
        children: [
          _buildAppbarLogo(),
          // 우로 정렬
          Spacer(),
          _buildAppbarMenu(),
        ],
      ),
    );
  }

  Widget _buildAppbarLogo() {
    return Row(
      children: [
        Image.asset(
          "assets/logo.png",
          width: 30,
          height: 30,
          color: Colors.redAccent,
        ),
        SizedBox(width: gap_s,),
        Text("RoomOfAll", style: h5(mColor: Colors.white),),
      ],
    );
  }

  Widget _buildAppbarMenu(){
    return Row(
      children: [
        Text("회원가입", style: subtitle1(mColor: Colors.white),),
        SizedBox(width: gap_m,),
        Text("로그인", style: subtitle1(mColor: Colors.white),),
      ],
    );

  }
}
