package ch08;

public class Subway {

	// 노선번호
	// 승객 수
	// 수익금
	int subwayNumber;
	int passengerCount;
	int money;
	
	// 생성자
	public Subway(int subwayNumber) {
		this.subwayNumber = subwayNumber;
	}
	
	// 타다 / 내리다
	public void take(int count, int money) {
		System.out.println("===========");

		passengerCount += count;
		this.money = money * count;
		System.out.println("승객  " + count + "명이 승차하였습니다.");
		System.out.println();
	}
	
	public void takeOff(int count) {
		if (passengerCount < count) {
			System.out.println("잘못된 요청입니다.");
		}else {
			passengerCount += count;
			System.out.println("승객  " + count + "명이 하차하였습니다.");
			System.out.println();
		}
	}
		
	public void showInfo() {
			System.out.println("지하철 노선 : " + subwayNumber);
			System.out.println("승객 수 : " + passengerCount);
			System.out.println("수익금 : " + money);
		}
		
		
		
		
		
		
		
		
		

	

	
	// showInfo
	
	
}
