

void main() {
// List , Set, Map
// List list;
// Set ser;
// Map map;

  List list = [1, 2, 3, 4, 5]; // 리스먄 대고ㅓㅏㄹ호를 사ㅓ용

  list.forEach((element) {
    print("요소 확인 : ${element}");
  });

// 마지막 요소 삭제
  list.removeLast();
  list.remove(3);
  print("list data : ${list}");

  list.clear();
  print("list data : ${list}");


// 컴파일 타입 상수 만들기
  var constList = const[1, 2, 3];
  print("constList : ${constList}");
  // constList.add(4);

  var amlLIst = [1, 2, 'A', true];
  print("amlList : $amlLIst");
  amlLIst.forEach((element) {
    print("amlList 데이터 타입 확인 : ${element.runtimeType}");
  });

// Dart 2.3 이상 부터는 컬렉션에 살입히는 간결한 방법을 재공
// 스프레드 연산자 (....)의 널 인식과 스프레드 연산자를 사용할 수 있다.

  var list3 = [0, 1, 3];
// 스프레드 연산자는 하나씩 ㅃ반복하면서 출력해주는 녀석

  var list4 = [0, ...list3];

  print("스프레드 연산자 사용 list : $list4");

// null 인식 스프레드 연산자
// 스프레드 연산자 오른쪽에 있는 표현식이 null 일 수 있는 경우
// ▶ ? 를 사용하여 예외를 피할 수 있다.

  var prom1;
  var prom2 =[1, ...?prom1];
  print("? : $prom2");

// 추가
  var promAtive = false;
  var name = ['home', 'fun', ' p', if(promAtive) 'outlet'];
  print(name);

  var listOfInts = [1, 2, 3 ];
  var listOfString = ['#0', for(var i in listOfInts) '#$i'];
  print(listOfString);


}



