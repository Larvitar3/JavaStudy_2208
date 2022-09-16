package ch09;

public class Bank {

	private int balance; // <= 정보은닉
	
	public int getBalance() {
		return this.balance;
	}
	
	public void setBalance(int money) {
		
		if(money <= 0) {
			System.out.println("잘못된 입력입니다.");
		}else {
			this.balance = money ;
		}
	}

	// 입금
	public void deposit(int money) {
		this.balance += money;

	}

	// 출금
	public void withdraw(int money) {
		// 방어적 코드
		this.balance -= money;
		showInfo();
	}

	public void showInfo() {
		System.out.println("현재 계좌의 잔액 : " + balance + " 원");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
