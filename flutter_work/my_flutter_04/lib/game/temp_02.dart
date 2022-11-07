
import 'package:my_flutter_04/main_08.dart';

void main(){

  Person person = Person();

  // 접근할 때도 name이라는 이름으로 사용된다.
  person.setName = null;
  print(person.getName);

}
