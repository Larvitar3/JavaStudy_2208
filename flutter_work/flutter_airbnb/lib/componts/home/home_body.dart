import 'package:flutter/material.dart';
import 'package:flutter_airbnb/size.dart';

import 'home_body_banner.dart';
import 'home_body_popular.dart';

class HomeBody extends StatelessWidget {
  const HomeBody({Key? key}) : super(key: key);

  @override
  Widget build(BuildContext context) {
    double bodyWidth = getBodyWidth(context);
    return Align(
      child: SizedBox(
        width:bodyWidth,
        child: Column(
          children: [
            HomeBodyBanner(),
            HomeBodyPopular(),
          ],

        ),

      ),
    );
  }


}
