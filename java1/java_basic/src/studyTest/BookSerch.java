package studyTest;

import java.util.Scanner;

public class BookSerch {

	public static void main(String[] args) {
		
		boolean flag = true;
		Book[]  books = new Book[10];
		int lastIndexCount = 0;
		Scanner scanner = new Scanner(System.in);
		
		
		while(flag) {
			System.out.println("메뉴를 선택해주세요");
			System.out.println("1. 저장 \t 2. 전체조회 \t 3.선택조회 \t 4.전체삭제 \t 5. 선택삭제 \t 0.종료");
		
			String seleted = scanner.nextLine();
			if(seleted.equals("1")) {
				// 저장하는 기능
				System.out.println("책 제목 입력");
				String title = scanner.nextLine();
				
				System.out.println("저자 입력");
				String author = scanner.nextLine();
				
				books[lastIndexCount] = new Book(title, author);
	
			}else if(seleted.equals("2")) {
				// 전체 조회
				for (int i = 0; i < books.length; i++) {
					if(books[i] != null) {
						// System.out.println(books[i].getTitle());
						books[i].showInfo();
					}
					/* else if(selected.equals("2")) {
				// 전체 조회 : 화면에 출력
						for(int i = 0; i < books.length; i++) {
						if(books[i] != null) {
						books[i].showInfo();
					}
				}*/
				}
				
			}else if(seleted.equals("0")){
				// 프로그램 종료
				flag = false;
			}else{
				System.out.println("등록되지 않은 번호입니다.");
			}
		
			
		} // while

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
