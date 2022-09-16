package studyTest;

import java.util.Scanner;

public class BookData {

	public static void main(String[] args) {
		
		// nextInt / nextLine 중 하나 통일
		
		Scanner scanner = new Scanner(System.in);
		
		boolean flag = true;
		String[] bookTitleArr = new String[3];
		String[] bookAuthorArr = new String[3];
		
		while(flag) {
			
			System.out.println("첫번째 책 이름을 입력하세요.");
			bookTitleArr[0] = scanner.nextLine();
			
			System.out.println("저자를 입력하세요.");
			bookAuthorArr[0] = scanner.nextLine();
			
			System.out.println("두번째 책 이름을 입력하세요.");
			bookTitleArr[1] = scanner.nextLine();
			
			System.out.println("저자를 입력하세요.");
			bookAuthorArr[1] = scanner.nextLine();
			
			System.out.println("세번째 책 이름을 입력하세요.");
			bookTitleArr[2] = scanner.nextLine();
			
			System.out.println("저자를 입력하세요.");
			bookAuthorArr[2] = scanner.nextLine();
			
			System.out.println("몇번째 책을 찾으시겠습니까?");
			int bookSerch = scanner.nextInt();
			if(bookSerch == 1) {
				System.out.println("첫번째 책 : " + bookTitleArr[0]);
				System.out.println("저자  : " + bookAuthorArr[0]);
			}else if(bookSerch == 2) {
				System.out.println("두번째 책 : " + bookTitleArr[1]);
				System.out.println("저자  : " + bookAuthorArr[1]);
			}else if(bookSerch == 3) {
				System.out.println("세번째 책 : " + bookTitleArr[2]);
				System.out.println("저자  : " + bookAuthorArr[2]);
			}else{
				System.out.println("등록되지 않은 번호입니다.");
			}
			System.out.println("책 제목을 다시 입력하시겠습니까?");
			System.out.println("1. 네(다시 입력) \t 2. 아니요(프로그램 종료)");
			
			int serchBtn = scanner.nextInt();
			
			if(serchBtn == 1) {
				System.out.println("책 제목을 다시 입력합니다.");
			}else if(serchBtn == 2) {
				System.out.println("프로그램을 종료합니다");
				flag = false;
			}else {
				System.out.println("등록되지 않은 번호입니다");
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}