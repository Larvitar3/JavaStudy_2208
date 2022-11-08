import 'package:flutter/material.dart';

// 함수만들기
// AccentColor 앱의 상호작용 요소에 작용
// Secondery(color) 라고도 부른다
ThemeData theme(){
  
  return ThemeData(
    primaryColor: Colors.white,
    appBarTheme: AppBarTheme(
      backgroundColor: Colors.white,
      iconTheme: IconThemeData(color: Colors.blueAccent)
    ),
  );
  
}