class Company{

  var name;
  var cathchPhrase;
  var bs;

  Company.init(this.name, this.cathchPhrase, this.bs);


  Company.fromJson(Map<String, dynamic> mapData)
  : name = mapData["name"],
        cathchPhrase = mapData["cathchPhrase"],
  bs = mapData["bs"];

  @override
  String toString() {
    return 'Company{name: $name, cathchPhrase: $cathchPhrase, bs: $bs}';
  }
}