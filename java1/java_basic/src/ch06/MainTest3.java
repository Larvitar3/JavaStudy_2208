package ch06;

import java.util.Scanner;

public class MainTest3 {

	// 사용자 입장
	public static void main(String[] args) {
		
		User user = new User();
		
//		user.id = "1";
//		user.password = "1234";
////		user.cheakPassword  = "1234";
//		user.name = "김춘식";
//		user.gender = "남자";
//		
//		user.checkedPassword("1234");
//		user.join();
		
		Scanner sc = new Scanner(System.in);
		// String temp = sc.nextLine();
		
		// 스캐너를 활용해서 유저 개체에 값을 담기
		
		System.out.println("회원 이름을 입력하세요.");
		String sName = sc.nextLine();
		user.name = sName;
		
	    System.out.println("아이디를 입력하세요");
	    String sId = sc.nextLine();
	    user.id = sId;
	    
	    System.out.println("비밀번호를 입력해주세요");
	    String sPassword = sc.nextLine();
	    user.password = sPassword;
	    
	    System.out.println("비밀번호 확인");
	    String sCheakPw = sc.nextLine();
	    user.cheackedPassword(sCheakPw);
	    user.join();
	    
//	    System.out.println("성별을 입력해주세요");
//	    String sGender = sc.nextLine();
//	    user.gender = sGender;
	    
//	    System.out.println("주소를 입력해주세요");
//	    String sAdress = sc.nextLine();
//	    user.addres = sAdress;
	    
	    user.showInfo();
	 
	    
	    
	    
	    
	    
	    
	    
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
