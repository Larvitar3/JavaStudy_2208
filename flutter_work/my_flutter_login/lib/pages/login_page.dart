import 'package:flutter/material.dart';
import 'package:flutter_svg/flutter_svg.dart';
import 'package:my_flutter_login/components/custom_text_formfield.dart';
import 'package:my_flutter_login/components/logo.dart';
import 'package:my_flutter_login/size.dart';

class LoginPage extends StatelessWidget {
  const LoginPage({Key? key}) : super(key: key);

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      body: Padding(
        padding: const EdgeInsets.all(16.0),
        child: ListView(
          children: [
            SizedBox(height: 100),
            Logo(title: "Login"),
            CustomTextFromField(text: "Email"),
            Padding(
              padding: const EdgeInsets.symmetric(vertical: 20.0),
              child: CustomTextFromField(text: "Password"),
            ),
            SizedBox(height: lage_gap,),
            TextButton(
              // TextButton.styleFrom(
              //  backgroundColor: Colors.black,
              style: ButtonStyle(
                backgroundColor: MaterialStateProperty.all(Colors.black),
                shape: MaterialStateProperty.all(
                    RoundedRectangleBorder(
                      borderRadius: BorderRadius.circular(20),
                    )),
              ),
              onPressed: (){
                // Navigator : 페이지 이동
                Navigator.pushNamed(context, "/home");
                print("loginBtnClick");
              },
              child: Padding(
                padding: const EdgeInsets.all(12.0),
                child: Text("Login", style: TextStyle(color: Colors.white, fontSize: 20)),
              ),
            )
          ],
        ),
      ),
    );
  }
}
