
void main(){

  // 추상 클래스
  // 일반 클래스에서 implements 키워드를 구현하고 추상 메서드를 오버라이딩 해야한다.

  AICar aiCar = AICar();
  aiCar.run();

}

abstract class Car{
  // 1. 일반적으로 new 할수 없는 객체
  // 2. 추상 메서드를 가질 수 있는 녀석 (필수조건은 아님)

  drive();
  stop();
  void startCar(){
    print("시동을 켭니다");
  }
  void turnOff(){
    print("시동을 끕니다.");
  }
  run(){
    startCar();
    drive();
    stop();
    turnOff();
  }
}

// extents 도 가능
// 추상클래스 사용할 때
// extents , implements 가능

class AICar implements Car{
  @override
  drive() {
    print("운전 합니다");
  }

  @override
  run() {
    drive();
    startCar();
    stop();
    turnOff();
  }

  @override
  void startCar() {
    print("자동차가 출발합니다");
  }

  @override
  stop() {
    print("자동차가 멈춥니다");
  }

  @override
  void turnOff() {
    print("시동을 끕니다");
  }

}

class MenualCar implements Car{

  @override
  drive() {

  }

  @override
  run() {
    drive();
    startCar();
    stop();
    turnOff();
  }

  @override
  void startCar() {

  }

  @override
  stop() {

  }

  @override
  void turnOff() {

  }


}





