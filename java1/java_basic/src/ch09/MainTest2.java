package ch09;

public class MainTest2 {

	public static void main(String[] args) {
		
		Hero h1 = new Hero();
		Hero h2 = new Hero();
		// h1과 h2의 주소값은 다르다 (heap 메모리)
		
		String s1 = "반가워";
		String s2 = "반가워"; 
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		// s1 과 s2는 주소 값이 같다 (상수풀)
		
		
		int count = "반가워".length();
		System.out.println(count);
		// 문자열의 길이를 반환하는 기능
		
		
		
		
		if (s1 == s2 ) {
			System.out.println("주소값이 같습니다.");
		}else {
			System.out.println("주소값이 다릅니다.");
		}
		
	}

}
