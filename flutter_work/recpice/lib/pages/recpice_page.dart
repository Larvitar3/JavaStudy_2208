import 'package:flutter/material.dart';
import 'package:recpice/components/recpice_list.dart';
import 'package:recpice/components/recpice_menu.dart';
import 'package:recpice/components/reclpice_title.dart';
import 'package:flutter/cupertino.dart';

class RecpicePage extends StatelessWidget {
  const RecpicePage({Key? key}) : super(key: key);

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      backgroundColor: Colors.white,
      appBar: _buildRecipeAppBar(),
      body: Padding(
        padding: const EdgeInsets.symmetric(horizontal: 20.0),
        child: ListView(
          children: [
            Column(
          // 정렬 ▼
          crossAxisAlignment: CrossAxisAlignment.start,
          children: [
            RecipeTitle(),
            RecipeMenu(),
            RecpiceList(imageName: "burger", title: "Made Burger"),
            RecpiceList(imageName: "coffee", title: "Made coffee"),
            RecpiceList(imageName: "pizza", title: "Made pizza"),
          ]
            )],
        ),
      ),
    );
  }

  AppBar _buildRecipeAppBar() {
    return AppBar(
      backgroundColor: Colors.white,
      elevation: 1.0,
      // 그림자
      actions: [
        Icon(CupertinoIcons.search, color: Colors.black,),
        SizedBox(width: 15,),
        Icon(CupertinoIcons.heart, color: Colors.pink,),
        SizedBox(width: 15,),
      ],
    );
  }

} // end of recpicepage

// AppBar
// 현재 화면에 title, leading, action 영역을 포함하고 있는 막대 모양의 위젯






