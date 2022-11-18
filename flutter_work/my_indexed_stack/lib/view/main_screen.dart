import 'package:flutter/material.dart';
import 'package:my_indexed_stack/view/home_screen.dart';
import 'package:my_indexed_stack/view/my_profile.dart';

class MainScreen extends StatefulWidget {
  const MainScreen({Key? key}) : super(key: key);

  @override
  State<MainScreen> createState() => _MainScreenState();
}

int _selectedIndex = 0;

class _MainScreenState extends State<MainScreen> {
  @override
  Widget build(BuildContext context) {
    return Scaffold(
      body: IndexedStack(
        index: _selectedIndex,
        children: [
          HomeScreen(),
          MyProfile(),
        ],
      ),
      bottomNavigationBar: BottomNavigationBar(
        // bottomNavigation : 5개까지 생성가능.
        backgroundColor: Colors.blueAccent,
        // 아이콘 클릭시 색상 ▼
        selectedItemColor: Colors.redAccent,
        // 아이콘 미클릭시 색상 ▼
        unselectedItemColor: Colors.orange,

        currentIndex: _selectedIndex,
        onTap: (index) {
          setState(() {
            _selectedIndex = index;
          });
        },
        items: [
          BottomNavigationBarItem(icon: Icon(Icons.home), label: "홈"),
          BottomNavigationBarItem(icon: Icon(Icons.pets), label: "my"),
        ],
      ),
    );
  }
}
