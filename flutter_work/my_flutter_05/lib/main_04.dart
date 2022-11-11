/// 추상 클래스
/// 다트에서도 추상 클래스 존재한다
/// 추상 메서드를 가질 수 있는 클래스 (필수는 아님)
/// 일반 클래스에서는 추상 메서드를 가지고 싶어도 가질 수 없다.
/// 미완성된 메서드 (선언부만 있고, 바디가 없는 메서드)
/// 추상 클래스는 미완성 클래스 , 인스턴스 할 수 없다
/// 참조형 변수 타입으로 사용 가능하다. (데이터 타입으로 선언 가능)
/// 추상 클래스를 사용할 때는 implements 키워드를 사용 후 오버라이드 한다.
///
/// 일반 클래스에서 implements 키워드로 구현하고,
/// 추상메서드를 오버라이딩 해야 한다.
void main() {
  Car aiCar = AICar();
  aiCar.run();
}

abstract class Car {
  //1. 일반적으로 new 할 수 없는 녀석
  //2. 추상 메서드를 가질 수 있는 녀석 ( 필수 조건은 아님)

  drive();

  stop();

  void startCar() {
    print('시동을 켭니다');
  }

  void turnOff() {
    print('시동을 끕니다');
  }

  run() {
    // 다트에서는 메서드에 final이 안된다
    startCar();
    drive();
    stop();
    turnOff();
  }
}

// 추상 클래스를 사용할 때,
// extends 키워드도 사용 가능하다
// implements 키워드도 사용 가능하다
// 차이점 : extends 상속을 받기 때문에, 추상 메서드만 오버라이드 되는 반면,
// implements의 경우 기능 구현을 하기 위함으로 모든 메서드가 오버라이드 된다.
class AICar extends Car {
  @override
  drive() {
    print('운전합니다');
  }

  @override
  stop() {
    print('브레이크로 자동 멈춤');
  }
}

class MenualCar implements Car{
  @override
  drive() {

  }

  @override
  run() {

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