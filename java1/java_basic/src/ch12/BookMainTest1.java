package ch12;

public class BookMainTest1 {

	public static void main(String[] args) {

		Book book1 = new Book("플러터", 100, "김근호");
		Book book2 = new Book("감자먹기", 450, "김춘식");
		Book book3 = new Book("감자삶기", 200, "이찬식");
		Book book4 = new Book("감자튀기기", 180, "박찬삼");
		Book book5 = new Book("감자심기", 120, "이운식");

		// 문제
		// shoppingCart 변수
		// 1. 배열 크기 10개
		Book[] shoppingCart = new Book[10];

		// 2. 장바구니 3개 - 인덱스 연산
		shoppingCart[0] = new Book("플러터", 100, "김근호");
		shoppingCart[1] = new Book("감자삶기", 200, "이찬식");
		shoppingCart[2] = new Book("감자튀기기", 180, "박찬삼");

		// 3. 장바구니에 담은 3개 출력
		System.out.println();
		System.out.println("3번 문제");
		for (int i = 0; i < shoppingCart.length; i++) {
			if (shoppingCart[i] != null) {
				System.out.print("책 이름 : "+shoppingCart[i].getTitle() + "     작가 이름 : ");
				System.out.println(shoppingCart[i].getAuthor());
			}			
		}

		// 4. 0번째 인덱스, 2번째 인덱스 스왑 - 인덱스 연산
		System.out.println();
		System.out.println("4번 문제");
		
		Book bookChange = shoppingCart[0];
		shoppingCart[0] = shoppingCart[2];
		shoppingCart[2] = bookChange;
		
		System.out.println(shoppingCart[0].getTitle());
		System.out.println(shoppingCart[2].getTitle());
		
		// 5. 3번째 인덱스 삭제	
		System.out.println();
		System.out.println("5번 문제");
		
		shoppingCart[2] = null;	
		System.out.println(shoppingCart[2]);
	

	}

}
