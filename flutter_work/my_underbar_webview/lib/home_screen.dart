import 'package:flutter/material.dart';
import 'package:webview_flutter/webview_flutter.dart';

class HomeScreen extends StatelessWidget {
  HomeScreen({Key? key}) : super(key: key);

  WebViewController? mController;
  var homeUrl = "https://blog.naver.com/iw_br";

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        title: Text("TenCoding"),
        centerTitle: true,
        backgroundColor: Colors.deepPurpleAccent,
        actions: [
          IconButton(
            onPressed: () {
              if (mController == null) {
                return;
              } else {
                mController!.loadUrl(homeUrl);
              }
            },
            icon: Icon(Icons.home),
            color: Colors.white,
          )
        ],
      ),
      body: SafeArea(
        child: WebView(
          onPageStarted: (url) {
            print("url : ${url}");
          },
          // controller : 위젯들을 프로그램 적으로 조정할 수 있는 기능을 제공
          onWebViewCreated: (controller) {
            this.mController = controller;
          },
          initialUrl: homeUrl,
          javascriptMode: JavascriptMode.unrestricted,
        ),
      ),
    );
  }
}
