package threadex.ch03;

public class BankAccount {

	private int money = 100_000;
	
	public int getMoney() {
		return this.money;
	}
	
	public void setMoney(int money) {
		if(money <= 0) {
			System.out.println("잘못된 입력값입니다.");
		}else {
			this.money = money;
		}
		
	}
	
	// 입금하기
	public synchronized void saveMoney(int money) {
		// 10만원
		// 10만원 
		// 3초가 걸릴동안 9만 5천원으로 변경 되었음.
		// 하지만 여기서 여전히 10만원인 상태
		int currentMoney = getMoney();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		setMoney(currentMoney + money);
		System.out.println("입금 후 계좌 잔액 : " + getMoney());
		
	}
	
	// 출금하기
	public void withdrawMonet(int money) {
		
		synchronized(this) {
			int currentMoney = getMoney();
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			setMoney(currentMoney - money);
			if(currentMoney >= money) {
				System.out.println("출금 후 계좌 잔액 " + getMoney());
			}else {
				System.out.println("계좌 잔액이 없습니다.");
			}
		}
		
		
		
		
	}
	
	
	
	
}
