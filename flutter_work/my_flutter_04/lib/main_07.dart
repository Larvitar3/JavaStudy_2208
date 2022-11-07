
// 클래스 -> 접근 지시자
// 캡슐화
// 어떤 객체가 어떤 목적을 수행하기 위한 데이터(멤버변수)와 기능을(메서드)
// 적절하게 모으는 과정
// 추상화
// 어떤 객체의 공통된 데이터와 메서드를 묶어서 이름을 부여
// Dart에서 접근제어 지시자는 2가지
// 1. public / 2. private
// 단, private 멤버와 접근 범위는 동일 클래스가 아니라 라이브러리 기준(자바기준으로 패키지)
// 기본적으로 아무런 키워드가 없을 경우 public 이다
// private로 선언하기 위해선 변수나 메서드 앞에 _(밑줄)을 사용해야한다.
// 대상은 클래스, 메서드. 함수, 변수
// 접근 지시자에 연관된 개념은 내부 정보를 공개하거나 하지 않는 것은 정보 은닉 방법 중 하나

void main(){
  Warrior warrior1 = Warrior("라인하르트", 1);
  warrior1.attack();
  warrior1._level = 2;
  warrior1._upgradeLevel();
}

class Warrior{
  String name;
  int _level;

  Warrior(this.name, this._level);

  attack(){
    print("전사가 기본공격을 합니다");
    _upgradeLevel();
  }

  _upgradeLevel(){
    _level++;
    print("전사가 레벨업 합니다");
  }

}














