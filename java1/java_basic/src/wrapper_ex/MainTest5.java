package wrapper_ex;

public class MainTest5 {

	public static void main(String[] args) {
		String medal = "Gold";

		switch (medal) {
		case "Gold":
			System.out.println("금메달");
			break;
		case "Silver":
			System.out.println("은");
			break;
		case "bronze":
			System.out.println("동");
			break;
		default:
			System.out.println("노메달");
			break;
		}

	}

}
