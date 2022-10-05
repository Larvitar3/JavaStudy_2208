package io_ex.ch02;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/*
 * 
 * 입력 스트림
 * 파일에 한 바이트씩 자료 읽기
 * 
 * */

public class MainTest1 {
	
	public static void main(String[] args) {
		
		FileInputStream fis = null;
		
		try {
			fis = new FileInputStream("boot_a.txt");
			
			System.out.print((char)fis.read());
			System.out.print((char)fis.read());
			System.out.print((char)fis.read());
			System.out.print((char)fis.read());
			System.out.print((char)fis.read());
			System.out.print((char)fis.read());
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally { 
			try {
				fis.close(); // 파일의 열람이 끝난 후엔 파일을 닫아주는 것이 좋다
			} catch (IOException e) {
				e.printStackTrace();
			} catch (NullPointerException e) {
				System.out.println("null포인터 ! ");
			}
		}
		
	}
}
