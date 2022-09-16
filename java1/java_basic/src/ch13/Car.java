package ch13;

public class Car {
	
	// 차 - 엔진에서는 상속관계 x
	// 포함관계로 만들수있다.
	
	Engin engin;
	
	public Car(String cName, int cPrice) {
		this.name = cName;
		this.price = cPrice;
	}
	
	String name;
	int price;
	
}
