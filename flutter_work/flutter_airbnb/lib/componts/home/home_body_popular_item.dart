import 'package:flutter/material.dart';
import 'package:flutter_airbnb/styles.dart';

import '../../size.dart';

class HomeBodyPopularItem extends StatelessWidget {
  HomeBodyPopularItem({Key? key, required this.id}) : super(key: key);

  final id;
  final popularList = [
    "p1.jpeg",
    "p2.jpeg",
    "p3.jpeg",
  ];

  @override
  Widget build(BuildContext context) {
    double popularItemWidth = getBodyWidth(context) / 3 -10;

    return Container(
      constraints: BoxConstraints(
        minWidth: 320,
      ),
      child: SizedBox(
        width: popularItemWidth,
        child: Column(
          children: [
            _buildPopularItemImage(),
            _buildPopularItemStar(),
            _buildPopularItemComment(),
            _buildPopularItemUsetInfo(),
          ],
        ),
      ),
    );
  }

  Widget _buildPopularItemImage() {
    return Column(
      children: [
        ClipRRect(
          child: Image.asset(
            "assets/${popularList[id]}",
            fit: BoxFit.cover,
          ),
        ),
        SizedBox(
          height: gap_s,
        ),
      ],
    );
  }

  Widget _buildPopularItemStar() {
    return Column(
      children: [
        Row(
          children: [
            Icon(
              Icons.star,
              color: Colors.redAccent,
            ),
            Icon(
              Icons.star,
              color: Colors.redAccent,
            ),
            Icon(
              Icons.star,
              color: Colors.redAccent,
            ),
            Icon(
              Icons.star,
              color: Colors.redAccent,
            ),
            Icon(
              Icons.star,
              color: Colors.redAccent,
            ),
          ],
        ),
        const SizedBox(
          height: gap_s,
        )
      ],
    );
  }

  Widget _buildPopularItemComment() {
    return Column(
      children: [
        Text(
          "typesetting industry. Lorem Ipsum has asdasdasdasdasdxcqafqcqaevcadva",
          style: body1(),
          maxLines: 1,
          overflow: TextOverflow.ellipsis,
        ),
        const SizedBox(
          height: gap_s,
        )
      ],
    );
  }

  Widget _buildPopularItemUsetInfo(){
    return Column(
      children: [
        Row(
          children: [
            CircleAvatar(
              backgroundImage: AssetImage("assets/p1.jpeg"),
            ),
            SizedBox(width: gap_s,),
            Column(
              crossAxisAlignment: CrossAxisAlignment.start,
              children: [
                Text("cdsdqs", style: subtitle1(),),
                Text("한국", style: subtitle2(),),
              ],
            ),
          ],
        ),
        SizedBox(height: gap_l,)
      ],
    );
  }

}
