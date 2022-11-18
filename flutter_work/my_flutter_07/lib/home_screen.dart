import 'package:flutter/material.dart';

class HomeScreen extends StatefulWidget {
  const HomeScreen({Key? key, required this.mColor}) : super(key: key);

  final Color mColor;

  @override
  State<HomeScreen> createState() => _HomeScreenState(mColor);
}

class _HomeScreenState extends State<HomeScreen> {

  // 3. 한번만 호출되어진다.
  @override
  void initState() {
    super.initState();
  }

  // 4. 변경이 되었을 때 한번 호출되어진다.
  @override
  void didChangeDependencies() {
    super.didChangeDependencies();
  }

  // 5. dirty

// 6.
  @override
  Widget build(BuildContext context) {
    return Container(
      color: widget.mColor,
    );
  }

  // 7. clean

  // 8.
@override
  void deactivate() {
    super.deactivate();
  }

  //9. 호출되었을 때 사라짐.
@override
  void dispose() {
    super.dispose();
  }

}

























