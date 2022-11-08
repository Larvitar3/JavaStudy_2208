import 'package:flutter/material.dart';

class ProfileHeader extends StatelessWidget {
  const ProfileHeader({Key? key}) : super(key: key);

  @override
  Widget build(BuildContext context) {
    return Padding(
      padding: const EdgeInsets.only(left: 30.0, top: 20,),
      child: Row(
        children: [
        // 동그란 이미지
          SizedBox(width:20),
          _buildHeaderAvatar(),
        // 이름 - profilez
          SizedBox(width:20),
          _buildHeaderProfile(),

        ],

      ),
    );
  }

  // CircleAvatar 이미지를 동그랗게 만들어주는 명령
  Widget _buildHeaderAvatar(){
    return SizedBox(
      width: 100,
      height: 100,
      child: CircleAvatar(
        backgroundImage: AssetImage("assets/avatar.png"),
      ),
    );
  }

  Widget _buildHeaderProfile(){
    return Column(
      crossAxisAlignment: CrossAxisAlignment.start,
      children: [
        Text("부트캠프", style: TextStyle(fontSize: 25, fontWeight: FontWeight.bold),),
        Text("프로그래머 / 프로그램", style: TextStyle(fontSize: 20),),
        Text("벤츠타는개발자", style: TextStyle(fontSize: 15, fontWeight: FontWeight.bold),),
      ],
    );
  }
}
