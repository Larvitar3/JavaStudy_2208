import 'package:flutter/material.dart';
import 'package:flutter_airbnb/componts.dart';
import 'package:flutter_airbnb/size.dart';
import 'package:flutter_airbnb/styles.dart';

import '../common/common_form_field.dart';

class HomeHeaderForm extends StatelessWidget {
  const HomeHeaderForm({Key? key}) : super(key: key);

  @override
  Widget build(BuildContext context) {
    double screenWidth = MediaQuery.of(context).size.width;
    print("screenWidth : $screenWidth");
    return Align(
      // 정렬 위젯
      // 1.0 ~ 1.0까지 가로방향에서 0.1의 값은 5%ㅇ;디/
      alignment: screenWidth < 520 ? Alignment(0, 0) : Alignment(-0.6, 0),
      child: Container(
        width: 420,
        decoration: BoxDecoration(
          color: Colors.white,
          borderRadius: BorderRadius.circular(20),
        ),
        child: Padding(
          padding: const EdgeInsets.all(gap_l),
          child: Form(
            child: Column(
              children: [
                _buildFormTitle(),
                _buildFormField(),
                _buildFormSubmit(),
              ],
            ),
          ),
        ),
      ),
    );
  }

  Widget _buildFormTitle(){
    return Column(
      children: [
        Text("에어비앤비에서 숙소를 검색하세요", style: h4(),),
        SizedBox(height: gap_xs,),
        Text("혼자하는 여행에 적합한 개인실 부터 여럿이 함께하는 여행의 좋은 공간",
        style: body1(),),
        SizedBox(height: gap_m,),
      ],
    );
  }

  Widget _buildFormField(){
    return Column(

      children: [
        CommonFormField(prefixText: "위치", hintText: "근처 추천 장소"),
        SizedBox(height: 10,),
        Row(
          children: [
            Expanded(child: CommonFormField(prefixText: "체크인", hintText: "날짜 입력")),
            SizedBox(width: 10,),
            Expanded(child: CommonFormField(prefixText: "체크아웃", hintText: "날짜 입력")),
          ],
        ),
        SizedBox(height: 10,),
        Row(
          children: [
            Expanded(child: CommonFormField(prefixText: "성인", hintText: "0")),
            SizedBox(width: 10,),
            Expanded(child: CommonFormField(prefixText: "어린이", hintText: "1")),
          ],
        ),
        SizedBox(height: 10,),
      ],

    );
  }

  Widget _buildFormSubmit(){
    return SizedBox(
      width: double.infinity,
      height: 50,
      child: TextButton(
        child: Text("검색", style: TextStyle(
          color: Colors.white, fontSize: 16, fontWeight: FontWeight.bold,
        ),),
        onPressed: (){
          // POST => 데이터 서버 전송
          print("SUBMIT CLICK");
        },
        style: TextButton.styleFrom(
          backgroundColor: Colors.redAccent,
          shape: RoundedRectangleBorder(
            borderRadius: BorderRadius.circular(10),
          ),
        ),
      ),
    );
  }

}
