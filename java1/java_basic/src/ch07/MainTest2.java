package ch07;

public class MainTest2 {

	public static void main(String[] args) {
		
		UserInfo userInfo1 = new UserInfo("rlacnstlr");
		UserInfo userInfo2 = new UserInfo("rlacnstlr", "1234");
		UserInfo userInfo3 = new UserInfo("rlacnstlr", "1234", "김춘식");
		UserInfo userInfo4 = new UserInfo("rlacnstlr", "1234", "김춘식", 58);
		
		System.out.println(userInfo1.ShowInfo());
		System.out.println(userInfo2.ShowInfo());
		System.out.println(userInfo3.ShowInfo());
		System.out.println(userInfo4.ShowInfo());
		
	}
}
