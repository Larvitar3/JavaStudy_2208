class Todo {
  var userId;
  var id;
  var title;
  var completed;

  Todo({this.userId, this.id, this.title, this.completed});

  Todo.init({this.userId, this.title, this.completed});

  Todo.fromJson(Map<String, dynamic> mapData)
      : id = mapData["id"],
        userId = mapData["userId"],
        title = mapData["title"],
        completed = mapData["completed"];

  // 이니셜 라이즈, 맵구조

  @override
  String toString() {
    return 'Todo{userId: $userId, id: $id, title: $title, completed: $completed}';
  }
}
