import 'package:flutter/cupertino.dart';
import 'package:flutter/material.dart';

import '../constants.dart';

class ShoppingCartDetail extends StatelessWidget {
  const ShoppingCartDetail({Key? key}) : super(key: key);

  @override
  Widget build(BuildContext context) {
    return Container(
      decoration: BoxDecoration(
        color: Colors.white,
        borderRadius: BorderRadius.circular(40),
      ),
      child: Padding(
        padding: const EdgeInsets.all(16.0),
        child: Column(
          children: [
            SizedBox(height: 15,),
            _buildDetailNameAndPrice(),
            _buildDetailRatingAndReviewCount(),
            _buildDetailColorOptions(),
            _buildDetailButton(context),
          ],
        ),
      ),
    );
  }

  Widget _buildDetailNameAndPrice() {
    return Row(
      mainAxisAlignment: MainAxisAlignment.spaceBetween,
      children: [
        Text(
          "Urban Soft AL 10.0",
          style: TextStyle(fontSize: 18, fontWeight: FontWeight.bold),
        ),
        Text(
          "\$699",
          style: TextStyle(fontSize: 18, fontWeight: FontWeight.bold),
        )
      ],
    );
  } // end of

  Widget _buildDetailRatingAndReviewCount() {
    return Padding(
      padding: const EdgeInsets.only(top: 10, bottom: 20),
      child: Row(
        children: [
          Icon(Icons.star, color: Colors.yellow),
          Icon(Icons.star, color: Colors.yellow),
          Icon(Icons.star, color: Colors.yellow),
          Icon(Icons.star, color: Colors.yellow),
          Icon(Icons.star, color: Colors.yellow),
          Spacer(), // Spacer : 남은 공간을 다 차지한다
          Text("revies"),
          Text(
            "(26)",
            style: TextStyle(color: Colors.blue),
          ),
        ],
      ),
    );
  }

  Widget _buildDetailColorOptions() {
    return Column(
      crossAxisAlignment: CrossAxisAlignment.start,
      children: [
        Text("Color Options"),
        SizedBox(width: 10),
        Row(
          children: [
            _buildDetailIcon(Colors.black),
            _buildDetailIcon(Colors.pinkAccent),
            _buildDetailIcon(Colors.pink),
            _buildDetailIcon(Colors.grey),
            _buildDetailIcon(Colors.white),
          ],
        ),
      ],
    );
  }

  _buildDetailIcon(Color mColor) {
    return Padding(
      padding: const EdgeInsets.only(right: 10, top: 10, bottom: 10),
      child: Stack(
        alignment: Alignment.center,
        children: [
          Container(
            width: 50,
            height: 50,
            decoration: BoxDecoration(
              color: Colors.white,
              border: Border.all(),
              shape: BoxShape.circle,
            ),
          ),
          Positioned(
            left: 5,
            right: 5,
            child: ClipOval(
                child: Container(
              color: mColor,
              width: 40,
              height: 40,
            )),
          ),
        ],
      ),
    );
  }

  Widget _buildDetailButton(BuildContext context) {
    return Padding(
      padding: const EdgeInsets.symmetric(vertical: 20.0),
      child: TextButton(onPressed: () {
        // 선택상자 띄우기
        showCupertinoDialog(context: context, builder: (context){
          return CupertinoAlertDialog(
            title: Text("장바구니에 담으시겠습니까?"),
            actions: [
              CupertinoDialogAction
                (child: Text("확인"),
              onPressed: (){
                  // 화면 닫기
                  Navigator.pop(context);
              },),
            ],
          );
        });
      },
          child: Text("Add to Cart", style: TextStyle(
            color: Colors.white
          ),),
      style: TextButton.styleFrom(
        backgroundColor:kAccentColor,
        minimumSize: Size(300, 50),
        shape: RoundedRectangleBorder(
          borderRadius: BorderRadius.circular(20),
        ),
      ),),
    );
  }
}
