import 'main_06.dart';

/// Dart Generic
/// 제네릭 프로그래밍은 타입 매개 변수(T)를 통해 타입에 대한 유연한 대처를 가능케 한다.
/// 다트 컬렉션에서 많이 사용 되어 진다.
///

void main() {

  Powder powder = Powder();
  Plastic plastic = Plastic();

  GenericPrinter<Powder> printer1 = GenericPrinter();
  GenericPrinter<Plastic> printer2 = GenericPrinter();

  printer1.setMaterial(powder);
  printer2.setMaterial(plastic);

  print(printer1);
  print(printer2);

}

class GenericPrinter<T> {
  late T material;

  // 지연 변수(late)
  // : 컴파일 시점에 처리가 되는 것이 아니라 뒤늦게 들어와도 된다는 변수

  T getMaterial() {
    return material;
  }

  void setMaterial(T material) {
    this.material = material;
  }

  @override
  String toString() {
    return 'GenericPrinter{material: $material}';
  }
}

