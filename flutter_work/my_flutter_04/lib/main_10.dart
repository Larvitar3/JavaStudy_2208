
void main(){
  // Mixin
  // 여러 클래스 계층에서 클래스의 코드를 재사용하는 방법
  // Mixin을 사용하게 되면 다중 상속문제를 해결할 수 있고, 컴포지션을 사용하지 않고
  // 다른 클래스의 코드를 재사용할 수 있음

  BMW bmw = BMW();
  print(bmw.power);
  print(bmw.wheelName);

}

class Engine{
  int power = 5000;
}

class Wheel{
  String wheelName = "4륜 구동 바퀴";
}

class BMW with Engine, Wheel{

}

class MyCar{
  String color = "black";
}

class Wheel2 with MyCar{
  String wheelName = "4륜 구동 바퀴";
}

