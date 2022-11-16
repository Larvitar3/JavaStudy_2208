import 'package:flutter/material.dart';
import 'package:flutter_airbnb/size.dart';


import '../../styles.dart';
import '../common/common_form_field.dart';

class HomeHeaderForm extends StatelessWidget {
  const HomeHeaderForm({Key? key}) : super(key: key);

  @override
  Widget build(BuildContext context) {
    double screenWidth = MediaQuery.of(context).size.width;
    //print("screenwidth : $screenWidth");
    //align 정렬 위젯
    //alignment  -1.0 ~ 1.0까지 가로 범위에서 위치 정렬
    // 0.1의 값은 전체 화면에서 5%라는 의미
    return Align(
      alignment: screenWidth < 520? Alignment(0, 0) : Alignment(-0.6, 0),
      child: Container(
        width: 420,
        decoration: BoxDecoration(
          color: Colors.white,
          borderRadius: BorderRadius.circular(20),
        ),
        child: Form(
          child: Padding(
            padding: const EdgeInsets.all(gap_l),
            child: Column(
              children: [
                _buildFormTitle(),
                _buildFormFiled(),
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
        Text("에어비엔비에서 숙소를 검색하세요.", style: h4(),),
        SizedBox(height: gap_xs,),
        Text("혼자하는 여행에 적합한 개인실부터 여럿이 함께하는 여행에 좋은 공간전체, 숙소배치, 에어비엔비에 다 있습니다.",
        style: body1(),),
        SizedBox(height: gap_m,),
      ],
    );
  }

  Widget _buildFormFiled(){
    return Column(
      children: [
        CommonFormField(prefixText: "위치", hintText: "근처 추천 장소"),
        SizedBox(height: gap_s,),
        Row(
          children: [
            Expanded(child: CommonFormField(prefixText: "체크인", hintText: "날짜 입력")),
            SizedBox(width: gap_s,),
            Expanded(child: CommonFormField(prefixText: "체크아웃", hintText: "날짜 입력")),
          ],
        ),
        SizedBox(height: gap_s,),
        Row(
          children: [
            Expanded(child: CommonFormField(prefixText: "성인", hintText: "2")),
            SizedBox(width: gap_s,),
            Expanded(child: CommonFormField(prefixText: "어린이", hintText: "0")),
          ],
        ),
        SizedBox(height: gap_s,),
      ],

    );

  }

  Widget _buildFormSubmit(){
    return SizedBox(
      width: double.infinity,
      height: 50,
      child: TextButton(
        style: TextButton.styleFrom(
          backgroundColor: Colors.redAccent,
          shape: RoundedRectangleBorder(borderRadius: BorderRadius.circular(10)),
        ),
        //  post -> 데이터 서버 전송
        onPressed: (){
          print("서브밋 클릭됨");
        },
        child: Text("검색", style: body1(mColor: Colors.white),),
      ),
    );

  }

}
