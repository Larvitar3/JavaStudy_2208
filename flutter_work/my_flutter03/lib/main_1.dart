
void main(){
  // 부호 연산자 = 단항 연산자
  // 실제 값을 변경하려면 대입 연산자를 사ㅕㅇㅇ
  var number =  10;
  print( -number);
  print(number);

  // 복합 대입연산자
  // +=. -=, *=, /=
  var  num1 = 0;
  num1 +=2;
  print(num1);

  var num2 = 0;
  num2 -= 2;
  print(num2);

  var num3 = 3;
  num3 *= 3;
  print(num2);

  var num4 = 10.9;
  num4 /= 2;
  print(num4);

  // 중감 감소 연산자
  var gameScore = 100;
  var lastScore;

  lastScore = ++gameScore;
  print(lastScore);
  print(lastScore);

// 연산자의 항의 앞에 있는거 뒤에 있는가에 따라서 시점과 결과가 달라질 수 있다.
  // 문장 끝(statment) 기준으로 여산 시점을 
  lastScore = ++gameScore;
  print(lastScore);
  print(gameScore);



}

