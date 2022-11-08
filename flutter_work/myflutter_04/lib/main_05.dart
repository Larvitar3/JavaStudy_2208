void main() {
  // Dart Generic
  // 제네릭 프로그래밍은 타입 매개변수(T)를 통해 타입에 대한 유연한 개처를 가능하게 한다.
  // Dart컬렉션에서 많이 사용되어진다.

  Powder powder = Powder();
  Plastic plastic = Plastic();

  GenericPrinter<Powder> printer = new GenericPrinter();
  GenericPrinter<Plastic> printer2 = new GenericPrinter();

  printer.setMaterial(powder);
  printer2.setMaterial(plastic);

  print(printer);
  print(printer2);

}

class GenericPrinter<T>{
  late T material;  //지연변수 late : 현재 T가 뭔지 모르지만 뒤늦게 들어와도 된다.

  T getMaterial(){
    return material;
  }

  void setMaterial (T material){
    this.material = material;
  }

  @override
  String toString() {
    return 'GenericPrinter{material: $material}';
  }
}


class Powder{

  @override
  String toString() {
    return 'Powder{}';
  }
}

class Plastic {

  @override
  String toString() {
    return 'Plastic{}';
  }
}

