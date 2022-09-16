package ch06;

// 회원가입
public class UserInfo {

	public String userId;
	public String userPassword;
	public String userOtp;
	public String userName;
	public String userAdress;
	
	public void userJoin() {
		System.out.println(userName + "님의 회원가입이 완료되었습니다. ");
		System.out.println();
	}
	
	public void userPassX() {
		System.out.println(userName + "님의 비밀번호가 틀렸습니다. ");
		System.out.println();
	}
	public void userOtpX() {
		System.out.println(userName + "님의 2 비밀번호가 틀렸습니다. ");
		System.out.println();
	}
	
	public void userLogin() {
		System.out.println(userName + "님이 로그인 하셨습니다. ");
		System.out.println();
	}
	public void showInfo(){
		System.out.println("▶▶▶▶"+userName + " 님의 회원정보 확인 ◀◀◀◀");
		System.out.println("회원님의 아이디 : " + userId);
		System.out.println("회원님의 성명 : " + userName);
		System.out.println("회원님의 주소 : " + userAdress);
		System.out.println();
		System.out.println();
		System.out.println();
	}
}
