class User {
  var backgroundImage;
  var name;
  var intro;

  User({this.backgroundImage, required this.name, required this.intro});
}

final String _urlPrefix =
    "https://raw.githubusercontent.com/flutter-coder/ui_images/master/messenger";

// 내정보
User me = User(
    backgroundImage: "${_urlPrefix}_me.jpg",
    name: "이지은",
    intro: "귀여움이 세상을 구한다");

List<User> friends = [
  User(
      backgroundImage: "${_urlPrefix}_man_1.jpg",
      name: "박지은",
      intro: "오늘은 행복한 날 ~ 입니다 ~ ♥"),
  User(
      backgroundImage: "${_urlPrefix}_woman_1.jpg",
      name: "김지은",
      intro: "좋은 일만 가득하길 바라요"),
  User(
      backgroundImage: "${_urlPrefix}_man_2.jpg",
      name: "한지은",
      intro: " "),
  User(
      backgroundImage: "${_urlPrefix}_man_3.jpg",
      name: "서지은",
      intro: "언젠가 행복은 찾아 올거야"),
  User(
      backgroundImage: "${_urlPrefix}_woman_2.jpg",
      name: "오지은",
      intro: "㉾울모드..♨"),
  User(
      backgroundImage: "${_urlPrefix}_woman_3.jpg",
      name: "강지은",
      intro: "☏ 한동안 카톡은 어려우니 문자로 부탁드려요"),
  User(
      backgroundImage: "${_urlPrefix}_man_4.jpg",
      name: "조지은",
      intro: "행복만 해"),
  User(
      backgroundImage: "${_urlPrefix}_woman_4.jpg",
      name: "백지은",
      intro: "부재 中..."),
  User(
      backgroundImage: "${_urlPrefix}_man_5.jpg",
      name: "임지은",
      intro: " "),
  User(
      backgroundImage: "${_urlPrefix}_woman_5.jpg",
      name: "반지은",
      intro: "♬ ♩ ♪"),

];
