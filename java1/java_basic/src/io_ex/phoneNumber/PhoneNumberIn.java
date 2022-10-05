package io_ex.phoneNumber;

import java.util.HashMap;
import java.util.Scanner;

public class PhoneNumberIn {

	public static void main(String[] args) {

		HashMap<String, String> phoneNum = new HashMap<>();

		Scanner scanner = new Scanner(System.in);

		boolean flag = true;

		System.out.println("실행할 번호를 선택해주세요.");

		final int PHONE_CREATE_NUM = 1; // swing btn1
		final int PHONE_READ_NUM = 2; // swing btn2
		final int PHONE_UPDATE_NUM = 3; // swing btn3
		final int PHONE_DELETE_NUM = 4; // swing btn4
		final int PHONE_EXIT_NUM = 0; // swing btn0
		
		String number;
		String name;
		
		int selectNumber = scanner.nextInt();
		
		while (flag) {
			if (selectNumber == PHONE_CREATE_NUM) {
				System.out.println("추가가 선택되었습니다.");
				phoneNum.put(number = scanner.nextLine(), name = scanner.nextLine());
				
			} else if (selectNumber == PHONE_READ_NUM) {
				System.out.println("조회가 선택되었습니다.");
			} else if (selectNumber == PHONE_UPDATE_NUM) {
				System.out.println("수정이 선택되었습니다.");
			} else if (selectNumber == PHONE_DELETE_NUM) {
				System.out.println("삭제가 선택되었습니다.");
			} else if (selectNumber == PHONE_EXIT_NUM) {
				System.out.println("추가가 선택되었습니다.");
			} else {
				flag = false;
			}
		}

	}

}
