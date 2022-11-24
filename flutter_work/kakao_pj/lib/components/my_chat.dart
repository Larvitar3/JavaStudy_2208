import 'package:flutter/material.dart';

class MyChat extends StatelessWidget {
  const MyChat({Key? key, required this.time, required this.text}) : super(key: key);

  final String time;
  final String text;

  @override
  Widget build(BuildContext context) {
    return Padding(
      padding: const EdgeInsets.all(16.0),
      child: Row(
        mainAxisAlignment: MainAxisAlignment.end,
        children: [
          Text(time, style: TextStyle(fontSize: 12),),
          SizedBox(width: 10,),
          Container(
            padding: EdgeInsets.symmetric(vertical: 5, horizontal: 8),
              child: Text(text, style: TextStyle(fontSize: 14),),
            decoration: BoxDecoration(
              borderRadius: BorderRadius.circular(10),
              color: Colors.yellow,
            ),
          ),
        ],
      ),
    );
  }
}
