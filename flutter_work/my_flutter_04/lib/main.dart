
void main(){

  // do-while
  var input = 0;
  var sum = 0;

  do{
    input++;
    sum += input;
    if(input >= 10){
      input = 0;
    }
    print("sum : ${sum}");
  }while(input != 0);

  // braek
  for(var i = 0; i < 10; i++){
    if(i==7){
      break;
    }
    print("i : ${i}");
  }

  print("===========");

  // continue
  for(var i = 0; i < 10; i++){
    if(i==7){
      continue;
    }
    print("i : ${i}");
  }

// Switch and Case
var command = 'OPEN';
  switch(command){
    case 'CLOSE ':
      broadcase("영업 종료");
      break;
    case 'OPEN' :
      broadcase("영업 시작");
      break;
    default :
      broadcase("영업중");
  }
}

void broadcase(str){
  print("** str ** ");
}











