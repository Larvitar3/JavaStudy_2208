
void main(){

  // set ( 간단하게 집합 리터럴을 사용 )
  var computerParts = {"mouse","keyboard", "speaker"};
  print(computerParts);

  for(var parts in computerParts){
    print(parts);
  }

  // for(int i = 0; i > computerParts.length; i ++){
  //   var parts = computerParts.iterator.current;
  //   print("parts!!! : $parts");
  // }




  // 반복자를 사용하는 방법
  Iterator iterator = computerParts.iterator;
  while(iterator.moveNext()){
    print(":: ${iterator.current}");
  }



  // Set 값 추가
  // new 생략 가능
  Set setInter = Set<int>();

  setInter.add(1);
  setInter.add(2);
  setInter.add(3);
  print(setInter);


  // Set 값 삭제
  setInter.remove(1);
  setInter.remove(10);
  print(setInter);

  var elements = computerParts;
  print(elements);
  elements.add("abc");
  print(elements);

  Set elements2 = Set();
  elements2.addAll(computerParts);
  print(elements2);
  elements2.add("추가임댜");
  print(elements2);

  // addAll ▶ 깊은 복사 ( deepCopy )

  computerParts.add("touchpad");

  Iterator iterator2 = computerParts.iterator;
  while(iterator2.moveNext()){
    if(iterator2.current == "touchpad"){
      print("있음");
      break;
    }
  }

  //////////////////////////////////////////////////////


  var constantSet = const{
    'a',
    'b',
    'c',
    'd'
  };

  print(constantSet);










}
