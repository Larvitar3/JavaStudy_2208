import 'package:carrot_market/models/product.dart';
import 'package:carrot_market/screens/home/home_componts/product_item.dart';
import 'package:flutter/cupertino.dart';
import 'package:flutter/material.dart';

class HomeScreen extends StatelessWidget {
  const HomeScreen({Key? key}) : super(key: key);

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        title: Row(
          children: [
            Text("좌동"),
            SizedBox(width: 4.0,),
            Icon(CupertinoIcons.chevron_down, size: 15.0,color: Colors.black,),
          ],
        ),
        actions: [
          IconButton(onPressed: () {}, icon:Icon(CupertinoIcons.search)),
          IconButton(onPressed: () {}, icon:Icon(CupertinoIcons.list_dash)),
          IconButton(onPressed: () {}, icon:Icon(CupertinoIcons.bell)),
        ],
        // 아래에 줄 만들기.
        bottom: PreferredSize(
          preferredSize: Size.fromHeight(0.5),
          child: Divider(thickness: 0.5, height: 0.5, color: Colors.grey,),
        ),
      ),
      body: ListView.separated(itemBuilder: (context, index) {
        return ProductItem(product: productList[index]);
      }, separatorBuilder: (context, index) {
        return Divider(height: 1, indent: 16, endIndent: 16, color: Colors.grey,);
      }, itemCount: productList.length),
    );
  }
}
