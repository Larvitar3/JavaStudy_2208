
void main(){

  // dart 상속 ▶ 다형성

  CheesssBuger cheesssBuger = new CheesssBuger("치즈 ");

}

class Burger{
  String name;
  Burger(this.name){
    print("$name 버거");
  }
}

class CheesssBuger extends Burger{
  // super 키워드는 자식이 부모를 참조할 수 있는 키워드드
 CheesssBuger(super.name);

}
