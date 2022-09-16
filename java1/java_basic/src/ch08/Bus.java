package ch08;

public class Bus {
	
	// 상태 ▼
	// 버스 번호
	// 승객 수
	// 수익금
	
	int busNumber;
	int passengerCount;
	int money;
	
	// 생성자
	public Bus(int busNumber) {
		this.busNumber = busNumber;
	}
	
	// 기능 ▼
	// 태우다
	public void take(int money) {
		this.passengerCount++;
		this.money += 1300;
		System.out.println("승객이 탑승하였습니다.");
	}
	
	public void takeOff (int count) {
		if(passengerCount < count) {
			System.out.println("잘못된 요청입니다.");
		}else {
			this.passengerCount -= count;
			System.out.println();
			System.out.println("승객 " +count + "명 " + "하차하였습니다.");
		}
	}
	
	public void showInfo() {
		System.out.println("======= 상태 창 =======");
		System.out.println("버스 번호 :  "  + busNumber);
		System.out.println("승객 수 :  "  + passengerCount);
		System.out.println("수익금 :  "  + money);
	}
	
	
	
	
	
	
	
}
