
import 'package:my_flutter_04/main_07.dart';

void main(){
  // 다른 패키지면 import 선언
  Warrior w1 = Warrior("자리야", 10);
  // w1._lavel 접근 불가
  String name = w1.name;
  print(name);

}

