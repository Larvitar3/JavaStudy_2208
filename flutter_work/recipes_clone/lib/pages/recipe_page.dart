import 'package:flutter/cupertino.dart';
import 'package:flutter/material.dart';
import 'package:recipes_clone/components/recipe_list_item.dart';
import 'package:recipes_clone/components/recipe_menu.dart';
import 'package:recipes_clone/components/recipe_title.dart';

class RecpicePage extends StatelessWidget {
  const RecpicePage({Key? key}) : super(key: key);

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      backgroundColor: Colors.white,
      appBar: _buildRecipeAppBar(),
      body: Padding(
        padding: const EdgeInsets.symmetric(horizontal: 20),
        child: ListView(
          children: [
            Column(
              crossAxisAlignment: CrossAxisAlignment.start,
              children: [
                RecipeTitle(),
                RecipeMenu(),
                RecipeListItem(imageName:"burger", title: "Made Burger"),
                RecipeListItem(imageName:"coffee", title: "Made coffee"),
                RecipeListItem(imageName:"pizza", title: "Made pizza"),
              ],
            )
          ],
        ),
      ),
    );
  }

  AppBar _buildRecipeAppBar(){
    return AppBar(
      backgroundColor: Colors.white,
      elevation: 1.0,
      actions: [
        Icon(CupertinoIcons.search, color: Colors.black,),
        SizedBox(width: 15,),
        Icon(CupertinoIcons.heart, color: Colors.pink,),
        SizedBox(width: 15,),
      ],
    );
  }
}


