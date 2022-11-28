import 'package:flutter/material.dart';

import 'more_button.dart';

class AgainListen extends StatelessWidget {
  const AgainListen({Key? key}) : super(key: key);

  @override
  Widget build(BuildContext context) {
    return Column(
      children: [
        Row(
          mainAxisAlignment: MainAxisAlignment.spaceBetween,
          children: [
            Text(
              '다시 듣기',
              style: TextStyle(
                  color: Colors.white,
                  fontSize: 30,
                  fontWeight: FontWeight.bold),
            ),
            MoreButton(),
          ],
        ),
      ],
    );
  }
}
