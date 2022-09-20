package wrapper_ex;

public class MainTest3 {
	
	public static void main(String[] args) {
		
		String name = "이순신";
		
		switch (name) {
		case "홍길동":
			System.out.println("name값은 홍길동");
			break;
		case "이순신":
			System.out.println("name값은 이순신");
			break;
			default:
				System.out.println("name값은 " + name + "입니다.");
		}
		
	}

}
