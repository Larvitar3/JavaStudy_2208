
void main(){
  // Map
  // key : Value 구조
  // 키 중복 0, Value 중복 X
  // Dart에서 new 키워드는 선택사항

  // map 중괄호 사용
  var gifts = {
    "First":"part",
    "Second ":"test",
    "Thterd":"SQL 자격증",
  };

  print(gifts);

  print(gifts["First"]);
  print(gifts[2]);
  print(gifts[3]);

  print("===================");

  var gifts2 = const{
    "First":"part",
    "Second ":"test",
    "Thterd":"SQL 자격증",
  };


}
