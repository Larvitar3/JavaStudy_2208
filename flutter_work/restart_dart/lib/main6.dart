
class UserDto {
  String name;
  int age;

  UserDto(this.name, this.age);

  @override
  String toString() {
    return 'UserDto{name: $name, age: $age}';
  }
}

// 미래 함수 선언 ( UserDto 를 생성해서 값 세팅 3초 뒤에 리턴하는 함수 )
// main에서 넘겨받은 UserDto String 출력
void main() {
  fetchUserDto().then((userDto) => print(userDto.toString()));
  Future<UserDto> future1 = Future(() => UserDto("이춘삼", 18));
  Future<UserDto> future2 = Future.value(UserDto("이춘사", 5));
}

Future<UserDto> fetchUserDto() {

  Future<UserDto> _future =
  Future.delayed(Duration(seconds: 3), () => UserDto("이춘식", 15),);

  return _future;
}










































