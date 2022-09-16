package ch06;

public class User {

	String id;
	String password;
// 	String cheakPassword;
	String name;
	String gender;
	boolean isCheakPassword = false;


	public void join() {
		if (isCheakPassword) {
			System.out.println("회원가입 성공");
			System.out.println(name + " 님이 회원가입 완료되었습니다.");
		} else {
			System.out.println("비밀번호가 일치하지 않습니다.");
		}
	}
	public void cheackedPassword(String inputPw) {
		if (password.equals(inputPw)) {
			isCheakPassword = true;
		} else {
			isCheakPassword = false;
			System.out.println("비밀번호가 일치하지 않습니다.");
		}
	}

	public void showInfo() {
		System.out.println("===== " + name + "님의 회원 정보 ====");
		System.out.println("● 아이디 : " + id);
		System.out.println(password);
		System.out.println("● 성별 : " + gender);
		System.out.println("● 주소 : " + id);
		System.out.println("● 아이디 : " + id);
	}
//	public void join() {
//	if( password.equals ( cheakPassword) ) {
//		System.out.println("회원가입 성공");
//		System.out.println(name + " 님이 회원가입 완료되었습니다.");
//	}else {
//		System.out.println("비밀번호가 일치하지 않습니다.");
//	}
//}

//public void checkedPassword() {
//// 문자열 비교할 때는 무조건 equals
//if( password.equals ( cheakPassword) ) {
//	System.out.println("비밀번호가 일치합니다.");
//}else {
//	System.out.println("비밀번호가 일치하지않습니다.");
//}
	
//	public boolean checkedPassword(String inputPw) {
//		if (password.equals(inputPw)) {
//			return true;
//		} else {
//			return false;
//		}
//
//	}
	

}
