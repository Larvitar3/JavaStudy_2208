import 'package:flutter/material.dart';

class ChatIconBtn extends StatelessWidget {
  const ChatIconBtn({Key? key, required this.icon}) : super(key: key);
  
  final Icon icon;

  @override
  Widget build(BuildContext context) {
    return IconButton(onPressed: (() {
      
    }), icon: icon, iconSize: 25,);
  }
}
