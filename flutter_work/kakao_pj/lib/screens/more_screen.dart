import 'package:flutter/material.dart';
import 'package:kakao_pj/models/tab.dart';

class MoreScreen extends StatelessWidget {
  const MoreScreen({Key? key}) : super(key: key);

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      backgroundColor: Colors.white,
      appBar: AppBar(
        title: Text("더보기"),
      ),
      body: Column(
        children: [
          SizedBox(
            height: 30,
          ),
          Expanded(
            child: GridView.count(
              crossAxisCount: 4,
              children:
              List.generate(tabs.length, (index) =>
                  Column(
                    children: [
                      Icon(tabs[index].icon),
                      SizedBox(height: 5,),
                      Text(tabs[index].text)
                    ],
                  )),
            ),
          ),
        ],
      ),
    );
  }
}
