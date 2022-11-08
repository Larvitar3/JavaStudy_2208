import 'package:flutter/material.dart';

class ProfileCountInfo extends StatelessWidget {
  const ProfileCountInfo({Key? key}) : super(key: key);

  @override
  Widget build(BuildContext context) {
    return Padding(
      padding: const EdgeInsets.only(top: 20.0, left: 40, right: 40,),
      child: Row(
        mainAxisAlignment: MainAxisAlignment.spaceAround,
        children: [
          _buildInfo("50", "Posts"),
          _buildLine(),
          _buildInfo("10", "Likes"),
          _buildLine(),
          _buildInfo("3", "Share"),
        ],
      ),
    );
  }

  Widget _buildInfo(String count, String title) {
    return Column(
      children: [
        Text(count),
        const SizedBox(width: 2,),
        Text(title, style: TextStyle(fontSize: 15),),
      ],
    );
  }

  Widget _buildLine() {
    return Container(
      width: 2,
      height: 60,
      color: Colors.blueAccent,
    );
  }
}
