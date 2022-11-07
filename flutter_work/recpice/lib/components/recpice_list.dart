import 'package:flutter/material.dart';

class RecpiceList extends StatelessWidget {
  // const RecpiceList({this.imageName, this.title, Key? key}) : super(key: key);
  const RecpiceList({Key? key, required this.imageName, required this.title})
      : super(key: key);

  // required : 반드시 넣어야하는 값
  final String imageName;
  final String title;

  @override
  Widget build(BuildContext context) {
    return Padding(
      padding: const EdgeInsets.symmetric(vertical: 20.0),
      child: Column(
        crossAxisAlignment: CrossAxisAlignment.start,
        children: [
          // 비율 조정 ▼
          AspectRatio(
            aspectRatio: 2/1,
            // 라운드로 자르는 기능 ▼
            child: ClipRRect(
              borderRadius: BorderRadius.circular(20),
              child: Image.asset(
                "assets/images/${imageName}.jpeg",
                fit: BoxFit.fill,
              ),
            ),
          ),
          const SizedBox(height: 10,),
            Text(title, style: TextStyle(fontSize: 20),),
            Text("Have you ever made your own $title? Once you've tried a homemade "
                "$title, you'll never go back.", style: TextStyle(color: Colors.grey, fontSize: 12),),
        ],
      ),
    );
  }
}
