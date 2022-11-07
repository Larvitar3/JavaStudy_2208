
void main(){


}

// get, set 만들기
class Person{
  String? _name;

  // getter 기본 형태
  // String? get name => _name;
  // set name(String? name) => _name = name;

  // String? get getName => _name;
  // set setName (String? name) => _name = name;
  
  String? get getName => (_name == null) ? "홍" : _name;
  set setName (String? name) => (name == null) ? "Park" : _name = name;

}
