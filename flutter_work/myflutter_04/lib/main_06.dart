// T extends 를 사용한 프로그래밍
// T에 무작위 클래스가 들어갈 수 있게 특정 클래스를 상속받는 클래스로만 한정

import 'main_05.dart';

void main() {
  GenericPrinter<Plastic> printer1 = new GenericPrinter();
  GenericPrinter<Powder> printer2 = new GenericPrinter();

  GenericPrinter<Powder> printer3 = new GenericPrinter<Powder>();
// 주소값에도 제네릭 선언이 가능은 하나 타입추론이 가능해서 삭제가능

}

class GenericPrinter <T extends Material >{

  late T material;

  T getMaterial(){
    return material;
  }

  void setMaterial(T material){
    this.material = material;
  }


}

abstract class Material{
  void doPrinting();
}


class Powder extends Material{
  @override
  void doPrinting() {

  }


}

class Plastic extends Material{
  @override
  void doPrinting() {

  }
}