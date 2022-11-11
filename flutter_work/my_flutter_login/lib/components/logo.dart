import 'package:flutter/material.dart';
import 'package:flutter_svg/svg.dart';

class Logo extends StatelessWidget {
  const Logo({Key? key, required this.title}) : super(key: key);

  final String title;

  @override
  Widget build(BuildContext context) {
    return Column(
      children: [
        SvgPicture.asset("assets/logo.svg",
          semanticsLabel: 'Acme Logo',
          width: 70,
          height: 70,
        ),
        Text(title, style: TextStyle(
          fontSize: 40,
          fontWeight: FontWeight.bold,
        ),textAlign: TextAlign.center,)
      ],
    );
  }
}
