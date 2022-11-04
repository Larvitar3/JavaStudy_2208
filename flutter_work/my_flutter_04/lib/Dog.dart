
class Dog{

  String name = "Toto";
  int age = 13;
  String color = "white";
  int thirsty = 100;

  void drinkWater(Water w){
    w.drink();
    thirsty = thirsty -= 50;
  }
}

class Water{
  double liter = 2.0;

  void drink(){
    liter = liter-= 0.5;
  }
}

void main(){

  // 객체 생성 ( 메모리에 로드 )
  Dog d1 = Dog();
  Water w1 = Water();
  print(d1.name);
  print(d1.age);
  print(d1.color);
  print(d1.thirsty);
  d1.drinkWater(w1);
  print(d1.thirsty);
  print(w1.liter);

  // Dart 에서 변수와 함수명을 정의할 때 카멜표기법을 사용
  // Dart 파일을 정의할 때 언더스코더방식(스네이크) 방식을 사용
  // Dart 에서 클래스명을 정의할 때 파스칼 표기법을 사용 ( 시작이 대문자 )

}