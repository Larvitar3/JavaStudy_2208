import 'package:flutter/material.dart';

class ProfileButtons extends StatelessWidget {
  const ProfileButtons({Key? key}) : super(key: key);

  @override
  Widget build(BuildContext context) {
    return Padding(
      padding: const EdgeInsets.only(top: 20.0),
      child: Row(
        mainAxisAlignment: MainAxisAlignment.spaceAround,
        children: [
          _buildFlowButton(),
          _buildMessageButton(),
        ],
      ),
    );
  }

  // InkWell 모든 위젯을 버튼화 시킴
  // TextButton, ElevateButton, OutlineButton

  Widget _buildFlowButton(){
    // Event ▼
    return InkWell(
      onTap: (){
        print("Follow Btn Click");
      },
      child: Container(
        // 자식들을 중앙으로 정렬
        alignment: Alignment.center,
        width: 150,
        height: 45,
        decoration: BoxDecoration(
          color: Colors.blueAccent,
          borderRadius: BorderRadius.circular(10),
        ),
        child: Text(
          "Follow",
          style: TextStyle(color: Colors.white),
        ),
      ),
    );
  }

  Widget _buildMessageButton(){
    return InkWell(
      onTap: (){
        print("MessegeBtnClick");
      },
      child: Container(
        decoration: BoxDecoration(
          color: Colors.white,
          borderRadius: BorderRadius.circular(10),
          border: Border.all(color: Colors.black),
        ),
        alignment: Alignment.center,
        width: 150,
        height: 45,
        child: Text("Message", style: TextStyle(color: Colors.black,),
      ),
    ),
    );
  }
}
