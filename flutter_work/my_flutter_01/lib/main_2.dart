
void main (){

  /// 변수 / 명시적 타입, 타입 추론

  var name = "Vouegger";
  var year = 1997;
  var diameter = 3.7;
  var flybyObjects = ["Juoiter", "Saturm", "홍길동"];
  var image = {
    "tags" : ["홍길동", "티모"],
    "url" : 'path/to/jupiter.png'
  };
  print(name.runtimeType);
  print(year.runtimeType);

  print(image);
  print(image["tags"]);
  print(image["tags".runtimeType]);

  print(name.runtimeType);
  print(year.runtimeType);
  List<String> tagList = image["tags"] as List<String>;
  print(  tagList[0]);
  print(  tagList[1]);
  Map images = {}; // Map --> []



  
}