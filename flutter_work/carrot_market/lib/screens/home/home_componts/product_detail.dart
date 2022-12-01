import 'package:carrot_market/models/product.dart';
import 'package:carrot_market/thme.dart';
import 'package:flutter/cupertino.dart';
import 'package:flutter/material.dart';
import 'package:intl/intl.dart';

class ProductDetail extends StatelessWidget {
  const ProductDetail({Key? key, required this.product}) : super(key: key);

  final Product product;

  @override
  Widget build(BuildContext context) {
    return Column(
      crossAxisAlignment: CrossAxisAlignment.start,
      children: [
        Text(product.title, style: textTheme().bodyText1,),
        const SizedBox(height: 4.0,),
        Text("${product.address} • ${product.publishedAt}"),
        const SizedBox(height: 4.0,),
        Text("${numberFormat(product.price)}", style: textTheme().headline2,),
        Row(
          mainAxisAlignment: MainAxisAlignment.end,
          children: [
            Visibility(
                visible: product.commentsCount > 0,
                child: _buildIcons
                  (product.commentsCount, CupertinoIcons.hand_thumbsup)),
            const SizedBox(height: 8.0,),
            Visibility(
                visible: product.commentsCount > 0,
                child: _buildIcons
                  (product.commentsCount, CupertinoIcons.heart)),
            const SizedBox(height: 8.0,),
          ],
        )
      ],
    );
  }

  Widget _buildIcons(int count, IconData iconData){
    return Row(
      children: [
        Icon(iconData),
        const SizedBox(width: 4,),
      ],
    );
  }

  String numberFormat(String price){
    final formatter = NumberFormat("#,### 원");
    return formatter.format(int.parse(price));
  }

}
