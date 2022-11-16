import 'package:flutter_http3/models/company.dart';

class User{
  int? id;
  String? name;
  String? email;
  String? city;
  Company? company;


  User(this.id, this.name, this.email, this.company, this.city);

  User.fromJson(Map<String, dynamic> mapJson)
    :id = mapJson["id"],
        name = mapJson["name"],
        email = mapJson["email"],
        city = mapJson["address"]["city"],
        company = Company.fromJson(mapJson["company"]);

  @override
  String toString() {
    return 'User{id: $id, name: $name, email: $email, city: $city, company: $company}';
  }
}