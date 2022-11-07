
import 'package:flutter/material.dart';

class RecipeMenu extends StatelessWidget {
  const RecipeMenu({Key? key}) : super(key: key);

  @override
  Widget build(BuildContext context) {
    return Padding(
      padding: const EdgeInsets.only(top: 20),
      child: Row(
        children: [
          // 반복되는 곳은 함수로 만들어서 호출한다.
          _buildMenyItem(Icons.food_bank, "ALL"),
          const SizedBox(width: 25,),
          _buildMenyItem(Icons.emoji_food_beverage, "Coffee"),
          const SizedBox(width: 25,),
          _buildMenyItem(Icons.fastfood, "Burger"),
          const SizedBox(width: 25,),
          _buildMenyItem(Icons.local_pizza, "Pizza"),
          const SizedBox(width: 25,),
        ],
      ),
    );
  }

// 기능은 같고 내용이 다를 시 함수로 만들어 매개변수로 다른 값을 받는다
  Widget _buildMenyItem(IconData mIcon, String text){
    return Container(
      width: 60,
      height: 80,
      decoration: BoxDecoration(
        border: Border.all(color: Colors.black12),
        borderRadius: BorderRadius.circular(30),
      ),
      child: Column(
        mainAxisAlignment: MainAxisAlignment.center,
        children: [
          Icon(
            mIcon,
            color: Colors.redAccent,
            size: 30,
          ),
          SizedBox(height: 5,),
          Text(
            text,
            style: TextStyle(color: Colors.black87),
          )
        ],
      ),
    );
  }
}
