import 'package:flutter/material.dart';
import 'package:flutter_http3/models/photo.dart';
import 'package:flutter_http3/models/todo.dart';
import 'package:http/http.dart' as http;
import 'dart:convert' as convert;

import 'models/user.dart';

void main() {
  runApp(const MyApp());
}

class MyApp extends StatelessWidget {
  const MyApp({Key? key}) : super(key: key);

  @override
  Widget build(BuildContext context) {
    // fetchTodos();
    fetchUsers();
    return MaterialApp(
      debugShowCheckedModeBanner: false,
      home: Center(
        child: Container(
          width: 50,
          height: 50,
          color: Colors.orange,
        ),
      ),
    );
  }

  fetchUsers() async {
    List<User> userList = [];
    var uri = Uri.parse("https://jsonplaceholder.typicode.com/users");
    var response = await http.get(uri);
    if(response.statusCode == 200) {
      List<dynamic> list = convert.jsonDecode(response.body);
      for(var e in list) {
        userList.add(User.fromJson(e));
      }
    }else {
      throw Exception("falil load : ${response.statusCode}");
    }

    for(var i = 0; i < 2; i++){
      print(userList[i]);
    }

  }
  
  // fetchPotos() async {
  //   List<Photo>
  //
  // }

  // fetchTodos() async{
  //   List<Todo> todoList = [];
  //   var uri = Uri.parse("https://jsonplaceholder.typicode.com/todos");
  //   var response =  await http.get(uri);
  //   if(response.statusCode == 200){
  //     List listData = convert.jsonDecode(response.body);
  //     for(var e in listData){
        // print("data Type check: ${e.runtimeType}");
        // print("data : ${e}");
        // print("==================");
        // response : 맵 구조 = 인덱스 연산 사용
        // todoList.add(Todo(userId: e["userId"], id: e["id"], title: e["title"], completed: e[false]));
        // Todo todo = Todo.init(userId: e["userId"], title: e["title"], completed: e["complted"]);
        // todoList.add(Todo.fromJson(e));




    // print("통신 종료 후 데이터 답음");
    // print(todoList.length);
    // print(todoList);




  }


