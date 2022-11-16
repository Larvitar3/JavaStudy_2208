class Address{
  var city;

  Address.fromJson(Map<String, dynamic> mapData);

  @override
  String toString() {
    return 'Address{city: $city}';
  }
}