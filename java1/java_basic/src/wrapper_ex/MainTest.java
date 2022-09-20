package wrapper_ex;

public class MainTest {
	
	public static void main(String[] args) {
		
//		Integer num = 17; // 자동 박싱
//		int n = num;

		String str1 ="10A";
		String str2 ="20.5";
		String str3 ="true";
		
		try {
			int i = Integer.parseInt(str1);
		} catch (Exception e) {
			System.out.println("잘못된 요청입니다.");
		}
		// 1. 문자열 10 int형으로 변경
		System.out.println("실행");
		
		double d = Double.parseDouble(str2);
		System.out.println("d :" + d);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
