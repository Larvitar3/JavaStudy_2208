import 'package:flutter/material.dart';
import 'package:my_flutter_login/size.dart';

class CustomTextFromField extends StatelessWidget {
  const CustomTextFromField({Key? key, required this.text}) : super(key: key);
  final String text;

  // TextFormFiled 상태
  // 가만히 있을 때, 포커싱 했을 때, 값을 잘못 넣었을 때

  @override
  Widget build(BuildContext context) {
    return Column(
      crossAxisAlignment: CrossAxisAlignment.start,
      children: [
        Text(text),
        SizedBox(height: small_gap,),
        TextFormField(
          // ! : null이 절대 아님
          // validator : null 값 확인
          validator: (value) => value!.isEmpty?"Please, enter some text" : null,
          // obscureText : 비밀번호 표시
          obscureText: text == "Password" ? true : false,
          decoration: InputDecoration(
            hintText: "Enter $text",
            enabledBorder: OutlineInputBorder(
              borderRadius: BorderRadius.circular(20),
              // 기본 값 일때 모양
            ),
            focusedBorder: OutlineInputBorder(
              borderRadius: BorderRadius.circular(20),
              // 선택 되었을 때 모양
            ),
            errorBorder: OutlineInputBorder(
              borderRadius: BorderRadius.circular(20),
              // 에러가 발생했을 때 모양
            ),
            focusedErrorBorder: OutlineInputBorder(
              borderRadius: BorderRadius.circular(20),
              // 에러 포커스일 때 모양
            ),
          ),
        ),
      ],
    );
  }
}




