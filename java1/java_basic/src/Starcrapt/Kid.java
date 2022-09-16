package Starcrapt;

public class Kid {

	private String name;
	private int money;
	private int adultPay;
	
	// 생성자
	public Kid (String name) {
		this.name = name;
		this.money = 10_000;
		this.adultPay = adultPay;
	}
	
	// getter
	public String getName() {
		return name;
	}
	public int getMoney() {
		return money;
	}
	
	// 기능
	//  버스 결제
	public void takeBus(int adultPay) {
		this.money -= adultPay;
		if( money <= adultPay ) {
			System.out.println("[안내] 잔액이" + this.money + "원입니다.");
			System.out.println("잔액이 부족합니다.");
		}else {
			System.out.println("[어린이] " + this.name);
		}
	}
	
	// 정보창
	public void showInfo() {
		System.out.println();
		System.out.println("====== 정보창 ======");
		System.out.println();
		System.out.println("이름  : " + name);
		System.out.println("잔액 : " + money);
	}
	
	
	
	public static void main(String[] args) {
		Kid adult = new Kid("어린이");
		adult.showInfo();
	}

}
