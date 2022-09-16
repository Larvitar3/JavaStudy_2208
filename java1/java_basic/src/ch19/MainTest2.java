package ch19;

import java.util.ArrayList;

public class MainTest2 {

	public static void main(String[] args) {

		Book book1 = new Book("1", "흐르는강물처럼", "파울로코엘료");
		Book book2 = new Book("2", "플러터UI실전", "김근호");
		Book book3 = new Book("3", "무궁화꽃이피었습니다", "김진명");
		Book book4 = new Book("4", "리딩으로리드하라", "이지성");
		Book book5 = new Book("5", "사피엔스", "유발하라리");

		ArrayList<Book> books1 = new ArrayList<>();
		ArrayList<Book> books2 = new ArrayList<>();

		books1.add(book1);
		books1.add(book2);
		books1.add(book3);
		books1.add(book4);
		books1.add(book5);
		
		books1 = removeBooksOfLastIndex(books1);
		System.out.println(books1);
		
	} // end of main

	// 문제 : 현재 생성된 arrList에 마지막 인덱스만을 삭제하는 함수를 완성
	
	// 넘겨 받은 ArrayList에 마지막 인덱스 값을 삭제하는 함수
	public static ArrayList<Book> removeBooksOfLastIndex(ArrayList<Book> list) {
		// Tip 매개변수를 통해서 들어온 데이터는 지역변수를 선언해서 초기화 하는게 좋음
		ArrayList<Book> localList = list;
		// 삭제하는 기능
		// 항상 마지막 인덱스에 접근해서 삭제
		// System.out.println(list.size() - 1 );
	
		localList.remove(localList.size() - 1 );
		return localList;
	}

} // end of class
