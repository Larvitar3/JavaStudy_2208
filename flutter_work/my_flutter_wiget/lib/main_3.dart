import 'package:flutter/material.dart';


class Counter extends StatelessWidget {
  const Counter({Key? key}) : super(key: key);


  @override
  Widget build(BuildContext context) {
    return Row(
        children: [
          ElevatedButton(onPressed: (){}, child: const Text("increment")),
          const
        ],
      );
  }
}

class MyButton extends StatelessWidget {
  const MyButton({Key? key}) : super(key: key);

  @override
  Widget build(BuildContext context) {
    return GestureDetector(
      onTap: () {
        print("object");
      },
      child: Container(
        padding: const EdgeInsets.all(8.0),
        margin: const EdgeInsets.symmetric(horizontal: 8.0),
        height: 50.0,
        child: Center(child: Text("MyButton", style: TextStyle(
          fontSize: 16,
        ),)),
        decoration: BoxDecoration(
          borderRadius: BorderRadius.circular(5.0),
          color: Colors.deepPurpleAccent,
        ),
      ),
    );
  }
}
