
void main(){

  CheesssBuger cheesssBuger = new CheesssBuger("더블치즈");
  print(cheesssBuger.name);
  // ( : ) 이니셜 라이저 키워드
  // 이니셜 라이저 키워드는 생성자의 내부 스택이 실행되기 전에 다른 무언가를
  // 호출하고 싶을 때 사용


}

class Burger{
  String name;
  Burger(this.name){

  }
}

class CheesssBuger extends Burger{
  // super 키워드는 자식이 부모를 참조할 수 있는 키워드드
 CheesssBuger(name):super(name);

}
