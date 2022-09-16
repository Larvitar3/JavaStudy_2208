package ch19;

import java.util.ArrayList;
import java.util.Scanner;

public class MainTest3 {

	public static void main(String[] args) {

		// 스캐너를 생성해서 책 정보를 저장

		// ArrayList에 담고, C R U D 기능을 사용하는 코드를 만들기

		// 기능들은 함수로 만들기
		Book book1 = new Book("1", "흐르는강물처럼", "파울로코엘료");
		Book book2 = new Book("2", "플러터UI실전", "김근호");
		Book book3 = new Book("3", "무궁화꽃이피었습니다", "김진명");
		Book book4 = new Book("4", "리딩으로리드하라", "이지성");
		Book book5 = new Book("5", "사피엔스", "유발하라리");

		ArrayList<Book> books1 = new ArrayList<>();

		books1.add(book1);
		books1.add(book2);
		books1.add(book3);
		books1.add(book4);
		books1.add(book5);

		// 업데이트
		update(books1, 2, book5);
		Book bookTemp = insert();
		books1.add(bookTemp);
		System.out.println(books1);

	}

	// 함수
	// insert();
	public static Book insert() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("북 아이디를 입력하세요.");
		String id = scanner.nextLine();
		System.out.println("책 제목을 입력하세요.");
		String title = scanner.nextLine();
		System.out.println("저자를 입력하세요.");
		String author = scanner.nextLine();
		Book book = new Book(id, title, author);
		// list.add(book);
		
		return book;
		
	}

	// update();
	public static ArrayList<Book> update(ArrayList<Book> list, int index, Book book) {
		ArrayList<Book> localList = list;
		localList.set(index, book);
		return localList;
	}

	// delete();

	// read();

	// read(int index); - 선택조회

}
