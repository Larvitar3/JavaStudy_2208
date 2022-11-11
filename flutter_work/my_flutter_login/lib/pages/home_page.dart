import 'package:flutter/material.dart';
import 'package:my_flutter_login/components/logo.dart';

class HomePage extends StatelessWidget {
  const HomePage({Key? key}) : super(key: key);

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      body: Padding(
        padding: const EdgeInsets.all(16.0),
        child: Center(
          child: Column(
            mainAxisAlignment: MainAxisAlignment.center,
           children: [
             Logo(title: "Care Soft",),
             SizedBox(height: 50,),
             Padding(
               padding: const EdgeInsets.all(16.0),
               child:
               SizedBox(
                 width: 800,
                 height: 60,
                 child: TextButton(
                   style: ButtonStyle(
                     backgroundColor: MaterialStateProperty.all(Colors.black),
                     shape: MaterialStateProperty.all(RoundedRectangleBorder
                       (borderRadius: BorderRadius.circular(20),))
                   ), onPressed: () {
                     Navigator.pop(context);
                 }, child: Text("Get Stated", style: TextStyle(color: Colors.white, fontSize: 20)),
                 ),
               ),
             ),
           ],
          ),
        ),
      ),
    );
  }
}
