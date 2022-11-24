import 'package:flutter/material.dart';

import '../models/User.dart';

class OtherChat extends StatelessWidget {
  const OtherChat({Key? key, required this.name, required this.time, required this.text}) : super(key: key);

  final String name;
  final String text;
  final String time;

  @override
  Widget build(BuildContext context) {
    return Padding(
      padding: const EdgeInsets.all(16.0),
      child: Row(
        children: [
          CircleAvatar(
            backgroundImage: NetworkImage(
              friends[0].backgroundImage,
            ),
          ),
          SizedBox(width: 10,),
          Column(
            crossAxisAlignment: CrossAxisAlignment.start,
            children: [
              Text(name, style: TextStyle(
                fontSize: 12,
              ),),
              SizedBox(height: 3,),
              Container(
                padding: EdgeInsets.symmetric(vertical: 5, horizontal: 8),
                child: Text(text, style: TextStyle(fontSize: 14),),
                decoration: BoxDecoration(
                  borderRadius: BorderRadius.circular(10),
                  color: Colors.white,
                ),
              ),
            ],
          ),
          SizedBox(width: 10,),
          Text(time, style: TextStyle(
           fontSize: 12,
          ),),
        ],
      ),
    );
  }
}
