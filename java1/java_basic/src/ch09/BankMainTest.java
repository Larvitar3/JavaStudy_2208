package ch09;

public class BankMainTest {
	public static void main(String[] args) {
		
		Bank bank = new Bank();	
		
//		입금
		
//		bank.deposit(10_000);
//		bank.showInfo();
//		
//		bank.withdraw(1000);
//		bank.showInfo();
		
		// 신입 개발자가 실수로 멤버변수에 바로 접근해서 잔액을 수정
		
		// bank.balance = 1000;
		
		int crrentMoney = bank.getBalance();
		System.out.println(crrentMoney);
		bank.setBalance(500_000);
		bank.showInfo();
		

		
	}
}
