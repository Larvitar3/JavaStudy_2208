package Starcrapt;

public class Bus {

	private int busNumber;
	private int passengerAdult;
	private int passengerStudent;
	private int passengerKid;
	private int adultPay;
	private int studentPay;
	private int kidPay;
	private int totalMoney;

	// getter
	public int getBusNumber() {
		return busNumber;
	}

	public int getPassengerAdult() {
		return passengerAdult;
	}

	public int getPassengerStudent() {
		return passengerStudent;
	}

	public int getPassengerKid() {
		return passengerKid;
	}

	public int getAdultPay() {
		return adultPay;
	}

	public int getStudentPay() {
		return studentPay;
	}

	public int getKidPay() {
		return kidPay;
	}

	public int getTotalMoney() {
		return totalMoney;
	}

	// 생성자
	public Bus(int busNumber) {
		this.busNumber = busNumber;
		this.adultPay = 1350;
		this.studentPay = 950;
		this.kidPay = 550;
		this.passengerAdult = 0;
		this.passengerStudent = 0;
		this.passengerKid = 0;
		this.totalMoney = 0;
	}

	// 기능
	// 승객을 태운다.

	public int takeMoney() {
		int sum = 0;
		sum = (adultPay * passengerAdult) + (studentPay * passengerStudent) + (kidPay * passengerKid);
		return sum;
	}

	// 성인
	public void takeAdult(Adult adult) {
		passengerAdult++;
		adult.takeBus(this.adultPay);
	}

	// 학생
	public void takeStudent(Student student) {
		passengerStudent++;
		student.takeBus(this.studentPay);
	}

	// 어린이
	public void takeKide(Kid kid) {
		passengerKid++;
		kid.takeBus(this.kidPay);
	}

	// 정보
	public void showInfo() {
		System.out.println("==== BUS ====");
		System.out.println("버스 번호 : " + busNumber);
		System.out.println("성인 : " + passengerAdult);
		System.out.println("학생 : " + passengerStudent);
		System.out.println("어린이 : " + passengerKid);
		System.out.println("수익금 : " + takeMoney());

	}

}
