
import 'package:flutter/material.dart';

class RecipeListItem extends StatelessWidget {
  const RecipeListItem({Key? key, required this.imageName, required this.title}) : super(key: key);

  final String imageName;
  final String title;

  @override
  Widget build(BuildContext context) {
    return Padding(
      padding: const EdgeInsets.symmetric(vertical: 20),
      child: Column(
        crossAxisAlignment: CrossAxisAlignment.start,
        children: [
          AspectRatio(
            aspectRatio: 2/1.4,
            child: ClipRRect(
              borderRadius: BorderRadius.circular(20),
              child: Image.asset(
                  "assets/images/${imageName}.jpeg",
              fit: BoxFit.fill,),
            ),
          ),
          const SizedBox(height: 10,),
          Text(title, style: TextStyle(fontSize: 20),),
          Text("Have you ever made your own $title? Once you've tried a homemade "
              "$title, you'll never go back.", style: TextStyle(color: Colors.black54, fontSize: 12),),
        ],
      ),
    );
  }
}
