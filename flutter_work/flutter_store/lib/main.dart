import 'package:flutter/material.dart';

void main() {
  runApp(const MyApp());
}

class MyApp extends StatelessWidget {
  const MyApp({Key? key}) : super(key: key);

  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      debugShowCheckedModeBanner: false,
      home: StorePage(),
    );
  }
} // end of MyApp

class StorePage extends StatelessWidget {
  const StorePage({Key? key}) : super(key: key);

  @override
  Widget build(BuildContext context) {
    return Scaffold(
        body: SafeArea(
      child: Column(
        children: [
          Padding(
            padding: const EdgeInsets.all(25.0),
            child: Row(
              children: [
                Text(
                  "Woman",
                  style: TextStyle(
                    fontWeight: FontWeight.bold,
                  ),
                ),
                Spacer(),
                Text(
                  "Kids",
                  style: TextStyle(fontWeight: FontWeight.bold),
                ),
                Spacer(),
                Text(
                  "shoes",
                  style: TextStyle(fontWeight: FontWeight.bold),
                ),
                Spacer(),
                Text(
                  "bag",
                  style: TextStyle(fontWeight: FontWeight.bold),
                )
              ],
            ),
          ),
          Expanded(
            child: Image.asset(
              "assets/image1.jpg",
              fit: BoxFit.fill,
            ),
          ),
          SizedBox(height: 2,),
          Expanded(
            child: Image.asset(
              "assets/image2.jpg",
              fit: BoxFit.fill,
            ),
          ),
        ],
      ),
    ));
  }
}
