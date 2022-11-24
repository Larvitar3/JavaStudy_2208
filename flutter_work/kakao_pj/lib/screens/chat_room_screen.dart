import 'package:flutter/material.dart';
import 'package:font_awesome_flutter/font_awesome_flutter.dart';
import 'package:intl/intl.dart';
import 'package:kakao_pj/components/chat_icon_button.dart';
import 'package:kakao_pj/components/my_chat.dart';
import 'package:kakao_pj/components/other_chat.dart';
import 'package:kakao_pj/components/timeline.dart';
import 'package:kakao_pj/models/chat.dart';

class ChatRoomScreen extends StatefulWidget {
  const ChatRoomScreen({Key? key}) : super(key: key);

  @override
  State<ChatRoomScreen> createState() => _ChatRoomScreenState();
}

class _ChatRoomScreenState extends State<ChatRoomScreen> {
  List<MyChat> chats = [];
  TextEditingController _textEditingController = TextEditingController();

  @override
  Widget build(BuildContext context) {
    return Container(
      color: Color(0xffb2c7da),
      child: Scaffold(
        backgroundColor: Colors.transparent,
        appBar: AppBar(
          backgroundColor: Colors.transparent,
          title: Text(
            "홍길동",
            style: Theme.of(context).textTheme.headline6,
          ),
          actions: [
            Icon(
              FontAwesomeIcons.search,
              size: 20,
            ),
            SizedBox(width: 25),
            Icon(
              FontAwesomeIcons.bars,
              size: 20,
            ),
            SizedBox(width: 25),
          ],
        ),
        body: Column(
          children: [
            Expanded(
              child: SingleChildScrollView(
                child: Column(
                  children: [
                    TimeLine(time: "2022년 11월 24일 목요일"),
                    OtherChat(
                        name: "홍길동", time: "오전 11:38", text: "반가울지도 모름미다 당신은"),
                    MyChat(time: "오전 11:39", text: "반가울지도 모르지 너 역시"),
                    ...List.generate(chats.length, (index) => chats[index]),
                  ],
                ),
              ),
            ),
            Container(
              height: 60,
              color: Colors.white,
              child: Row(
                children: [
                  SizedBox(
                  width: 16,
                ),
                  ChatIconBtn(icon: Icon(FontAwesomeIcons.plusSquare)),
                  Expanded(
                      child: Container(
                    child: TextField(
                      controller: _textEditingController,
                      decoration: InputDecoration(
                        focusedBorder: InputBorder.none,
                        enabledBorder: InputBorder.none,
                      ),
                      onSubmitted: (value){
                        _handleSubmited(value);
                      },
                    ),
                  )),
                  SizedBox(
                    width: 16,
                  ),
                  ChatIconBtn(icon: Icon(FontAwesomeIcons.smile)),
                  ChatIconBtn(icon: Icon(FontAwesomeIcons.cog)),
                  SizedBox(
                    width: 16,
                  ),
                ],
              ),
            ),
          ],
        ),
      ),
    );
  }

  void _handleSubmited(mText){
    _textEditingController.clear();

    setState(() {
      chats.add(MyChat
        (time: 
      DateFormat("a k:m")
          .format(new DateTime.now())
          .replaceAll("AM", "오전")
          .replaceAll("PM", "오후"),
          text: mText));

    });

  }

}
