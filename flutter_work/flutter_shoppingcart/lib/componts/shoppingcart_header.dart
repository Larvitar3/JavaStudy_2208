
import 'package:flutter/material.dart';
import 'package:flutter_shoppingcart/constants.dart';

class ShoppingCartHeader extends StatefulWidget {
  const ShoppingCartHeader({Key? key}) : super(key: key);

  @override
  State<ShoppingCartHeader> createState() => _ShoppingCartHeaderState();
}

class _ShoppingCartHeaderState extends State<ShoppingCartHeader> {
  int selectedId = 0;

  List<String> selectedPic = [
    'assets/p1.jpg',
    'assets/p2.jpg',
    'assets/p3.jpg',
    'assets/p4.png',
  ];
  @override
  Widget build(BuildContext context) {
    return Column(
      children: [
        _buildHeaderPic(),
        _buildHeaderSelector(),
      ],
    );
  }// end of build
Widget _buildHeaderPic(){
    return Padding(
      padding: const EdgeInsets.all(16.0),
      child: AspectRatio(
          aspectRatio: 5/3,
          child: Image.asset(selectedPic[selectedId])
          // ,fit:BoxFit.cover
      ),
    );
} // end of header pic

Widget _buildHeaderSelector() {
  return Padding(
    padding: const EdgeInsets.only(left: 30, right: 30, top: 10, bottom: 30),
    child: Row(
      mainAxisAlignment: MainAxisAlignment.spaceAround,
      children: [
        _buildHeaderlectorButton(0, Icons.android),
        _buildHeaderlectorButton(1, Icons.pets),
        _buildHeaderlectorButton(2, Icons.icecream),
        _buildHeaderlectorButton(3, Icons.back_hand),
      ],
    ),
  );
}
// 반복 부분
Widget _buildHeaderlectorButton(int id, IconData mIcon){
    return Container(
      width: 70,
      height: 70,
      decoration: BoxDecoration(
        color: id == selectedId ? kAccentColor : kSecondaryColor,
        borderRadius: BorderRadius.circular(20),
      ),
      child: IconButton(
        icon : Icon(mIcon,color: Colors.black),
        onPressed: (){
          setState(() {
          selectedId = id;
          });
        },
      ),
    );
}
















}
