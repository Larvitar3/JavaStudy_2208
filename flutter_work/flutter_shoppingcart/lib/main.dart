import 'package:flutter/material.dart';

import 'componts/shoppingcart_detail.dart';
import 'componts/shoppingcart_head.dart';


/// BuildContext
/// --Build : 건물 등을 짓다
/// --Context : 문맥, 전후 사정
/// 건물을 다시 짓기 위해 전후 흐름을 알고 있는 클래스가 바로 BuildContext클래스 이다.

void main() {
  runApp(MyApp());
}

class MyApp extends StatelessWidget {
  const MyApp({Key? key}) : super(key: key);

  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      debugShowCheckedModeBanner: false,
      // theme: theme(),
      home: ShoppingCartPage(),
    );
  }
}

class ShoppingCartPage extends StatelessWidget {
  const ShoppingCartPage({Key? key}) : super(key: key);

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      backgroundColor: Color.fromRGBO(218, 218, 218, 1.0),
      appBar: _buildShoppingCartAppBar(),
      body: Column(
        children: [
          ShoppingCartHeader(),
          ShoppingCartDetail(),
        ],
      ),
    );
  }

  AppBar _buildShoppingCartAppBar() {
    return AppBar(
      backgroundColor: Colors.pinkAccent,
      leading: IconButton(
        icon: Icon(Icons.arrow_back),
        onPressed: () {},
      ),
      actions: [
        IconButton(onPressed: () {}, icon: Icon(Icons.shopping_cart)),
        SizedBox(
          width: 16,
        )
      ],
      elevation: 0.0,
    );
  }
} // end of class
