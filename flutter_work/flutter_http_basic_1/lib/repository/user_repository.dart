
import 'package:flutter_http_basic_1/models/users.dart';
import 'package:flutter_http_basic_1/repository/repository.dart';
import 'package:http/http.dart' as http;
import 'dart:convert';

class UserRepository implements Repository{

  String dartURL = "https://jsonplaceholder.typicode.com/users";

  @override
  Future<User> getUser(int id) async{

    var url = Uri.parse(dartURL + "/$id");
    var response = await http.get(url);
    var body = response.body;
    return User.fromJson(json.decode(body));

  }

}