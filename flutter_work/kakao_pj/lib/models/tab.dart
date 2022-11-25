
import 'package:flutter/cupertino.dart';
import 'package:font_awesome_flutter/font_awesome_flutter.dart';

class Tab{
  
  final IconData icon;
  final String text;

  Tab({required this.icon, required this.text});
  
}

// 샘플 데이터
List<Tab> tabs = [
  Tab(icon: FontAwesomeIcons.message, text: "메일"),
  Tab(icon: FontAwesomeIcons.calendar, text: "캘린더"),
  Tab(icon: FontAwesomeIcons.earthAsia, text: "서랍"),
  Tab(icon: FontAwesomeIcons.gifts, text: "선물하기"),
  Tab(icon: FontAwesomeIcons.smile, text: "이모티콘"),
  Tab(icon: FontAwesomeIcons.opencart, text: "쇼핑하기"),
  Tab(icon: FontAwesomeIcons.accusoft, text: "스타일"),

];

