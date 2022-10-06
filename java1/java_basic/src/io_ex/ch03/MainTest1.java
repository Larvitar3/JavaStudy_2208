package io_ex.ch03;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * 
 * 바이트 단위 출력
 * 파일에 한 바이트씩 쓰기 -1
 * 
 * */

public class MainTest1 {

	public static void main(String[] args) {
		
		// 함수안에 사용하는 변수는 - 지역변수 초기화 값을 넣어주는게 좋다 (습관)
		
		FileOutputStream fos = null;
		try {
			// 만약 파일이 없다면 생성된다.
			fos = new FileOutputStream("output_a.txt");
			fos.write(65);
//			fos.write(66);
//			fos.write('c');
//			fos.write('d');
//			fos.write('e');
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}
	
}
