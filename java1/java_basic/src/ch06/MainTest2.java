package ch06;

public class MainTest2 {
	public static void main(String[] args) {
		UserInfo kim = new UserInfo();
		kim.userId = "kim1234";
		kim.userPassword = "12345";
		kim.userOtp = "2580";
		kim.userName = "김춘식";
		kim.userAdress = "강원도 춘천";
		
		kim.userJoin();
		kim.userPassX();
		kim.userOtpX();
		kim.userLogin();
		kim.showInfo();
		
		UserInfo lee = new UserInfo();
		lee.userId = "lee1234";
		lee.userPassword = "1234555";
		lee.userOtp = "2540";
		lee.userName = "이춘식";
		lee.userAdress = "강원도 춘천";
		
		lee.userJoin();
		lee.userPassX();
		lee.userOtpX();
		lee.userLogin();
		lee.showInfo();
		
		
	
	
	
	
	
	
	
	
	
	
	
	}
}
