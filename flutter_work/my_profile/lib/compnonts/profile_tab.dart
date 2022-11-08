import 'package:flutter/material.dart';

// 상태에 변환이 있는 것을 만들기 위해서는 Stateful을 사용한다

class ProfileTab extends StatefulWidget {
  const ProfileTab({Key? key}) : super(key: key);

  @override
  State<ProfileTab> createState() => _ProfileTabState();
}

// TabBar : 탭의 가로행을 표시하는 머터리얼 디자인 위젯
// TabBarView : 현재 선택된 탭의 홥면을 표시하는 위젯
// TabBar 위젯과 TabBarView 위젯의 controller 속성에 TabController 객체를 연결하면
// TabBarView 가 선택된 Tab에 따라 화면을 변경하게 된다
// SingleTickerProviderStateMixin : 한 개의 애니메이션을 가진 위젯을 정의할 때 사용
// 두 개 이상의 애니메이션을 가진 위젯을 정의하려면 TickerProviderStateMixin을 사용해야한다.

class _ProfileTabState extends State<ProfileTab>
    with SingleTickerProviderStateMixin {
  TabController? _tabController;

  // 메모리에 올라갈 때 한번만 초기화 된다.
  @override
  void initState() {
    super.initState();
    // tabBar를 사용할 땐 상세하게 몇개의 탭이 몇개의 동작을 해야하는지 명시해야한다.
    _tabController = new TabController(length: 2, vsync: this);
  }

  @override
  Widget build(BuildContext context) {
    return Padding(
      padding: const EdgeInsets.only(top: 20.0),
      child: Column(
        children: [
          _buildTabBar(),
          Expanded(child: _buildTabBarView()),
        ],
      ),
    );
  }

  Widget _buildTabBar() {
    return TabBar(controller: _tabController, tabs: [
      Tab(
        icon: Icon(Icons.directions_car),
      ),
      Tab(
        icon: Icon(Icons.directions_transit_sharp),
      ),
    ]);
  }

  Widget _buildTabBarView() {
    return TabBarView(controller: _tabController, children: [
      GridView.builder(
        gridDelegate: SliverGridDelegateWithFixedCrossAxisCount(
          crossAxisCount: 3,
          crossAxisSpacing: 5.0,
          mainAxisSpacing: 5.0,
        ),
        itemBuilder: (context, index) {
          return Image.network("https://picsum.photos/id/${index + 1}/300/300");
        },
        itemCount: 40,
      ),
      Container(color: Colors.redAccent),
    ]);
  }
}