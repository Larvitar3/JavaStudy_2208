import 'package:flutter/material.dart';
import 'package:mcdonald/componuts/find_store_btn.dart';
import 'package:mcdonald/componuts/find_store_footer.dart';
import 'package:mcdonald/componuts/find_store_map.dart';
import 'package:mcdonald/componuts/find_store_textform.dart';


class FindStorePage extends StatelessWidget {
  const FindStorePage({Key? key}) : super(key: key);

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: _buildFindStoreAppBar(),
      body: ListView(
        children: [
          SizedBox(height: 80,),
            Image(image: AssetImage("assets/storeBg.png"),
            fit: BoxFit.fill,),
          SizedBox(height: 50,),
          FindStoreMapBtn(),
          SizedBox(height: 50,),
          FindStoreTextForm(),
          SizedBox(height: 50,),
          FindStoreMap(),
          SizedBox(height: 20,),
          Padding(
            padding: const EdgeInsets.symmetric(horizontal: 20.0),
            child: Container(
              width: double.infinity,
              height: 60,
              child: ElevatedButton(onPressed: (){
                  print("내 위치 조회 클릭");
              }, child: Text("내 위치 중심으로 지도보기",
              style: TextStyle(
                fontWeight: FontWeight.bold,
                fontSize: 20
              ),),
              style: ElevatedButton.styleFrom(
                backgroundColor: Colors.orange
              ),),
            ),
          ),
          SizedBox(height: 80,),
          Padding(
            padding: const EdgeInsets.symmetric(horizontal: 25),
            child: Container(
              width: double.infinity,
              height: 2,
              color: Colors.grey,
            ),
          ),
          SizedBox(height: 80,),
          FindStoreFooter(),
          Padding(
            padding: const EdgeInsets.symmetric(horizontal: 25),
            child: Container(
              width: double.infinity,
              height: 2,
              color: Colors.grey,
            ),
          ),
          SizedBox(height: 80,),
          Padding(
            padding: const EdgeInsets.symmetric(horizontal: 25),
            child: Container(
              width: double.infinity,
              height: 2,
              color: Color.fromRGBO(220, 220, 220, 1.0),
            ),
          ),
          SizedBox(height: 80,),
        ],
      ),
    );
  }

  AppBar _buildFindStoreAppBar(){
    return AppBar(
      backgroundColor: Color.fromRGBO(240, 240, 240, 1.0),
      leading: IconButton(
        icon: Icon(Icons.arrow_back, color: Colors.black,),
        onPressed: (){
          // 홈 메뉴로 이동
        },
      ),
      title: Text("매장 찾기", style: TextStyle(
        fontSize: 20, color: Colors.black,
      ),),
    );
  }

}



