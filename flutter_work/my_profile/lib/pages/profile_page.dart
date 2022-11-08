import 'package:flutter/material.dart';
import 'package:my_profile/compnonts/profile_drawer.dart';

import '../compnonts/profile_buttons.dart';
import '../compnonts/profile_count_info.dart';
import '../compnonts/profile_header.dart';
import '../compnonts/profile_tab.dart';

class ProfilePage extends StatelessWidget {
  const ProfilePage({Key? key}) : super(key: key);

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: _buildProfileAppBar(),
      endDrawer: ProfileDrawer(),
      body: Column(
        children: [
          const SizedBox(height: 20),
          ProfileHeader(),
          const SizedBox(height: 20),
          ProfileCountInfo(),
          const SizedBox(height: 20),
          ProfileButtons(),
          //남아 있는 세로 공간을 모두 차지하기 위해 Expended를 준다.
          Expanded(child:ProfileTab()),
        ],
      ),
    );
  } // build 화면 렌더링 함수

  AppBar _buildProfileAppBar(){
    return AppBar(
      centerTitle: true,
      leading: Icon(Icons.arrow_back_ios),
      title: Text("Profile", style: TextStyle(color: Colors.black),),
    );
  }
}//end of class
