package io_ex.ch01;

import java.io.IOException;

public class MainTest2 {

	public static void main(String[] args) {
		
		// "\n";
		// 한글자를 입력 할 때마다 화면에 표시 (엔터키를 누를때 까지)
		
		boolean flag = true;
		int k = 0;
		
		System.out.println("알파벳 여러개 쓰고 엔터");
		
		while(flag) {
			if(k !=13) {
				try {
					k = System.in.read();
					System.out.print((char)k + " =  "+ k + ", ");
				} catch (IOException e) {
					e.printStackTrace();
				}
			}else {
				flag = false;
			}
		}
		
		// while 문 안에 식을 사용하는 방법.
		int i;
		try {
			while( (i = System.in.read()) != '\n' ) {
				System.out.print((char)i );
				System.out.print("  :  " + i + "    ");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
