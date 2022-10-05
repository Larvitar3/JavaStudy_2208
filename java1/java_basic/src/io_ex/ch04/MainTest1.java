package io_ex.ch04;

import java.io.FileReader;

// Reader
// 문자 단위 입력 스트림
public class MainTest1 {

	public static void main(String[] args) {
		
		// 1바이트씩  -> inputStream
		// 2바이트씩 읽음
		
//		boolean flag = true;
		try(FileReader fr = new FileReader("reader_1.txt")){			
//			while(flag) {
//				int flagCount = fr.read();
//				if(flagCount != -1) {
//					System.out.print((char)fr.read());
//				}else{
//					flag = false;
//				}
//			}
			int i;
			while( (i = fr.read()) != -1 ) {
				System.out.print((char)fr.read());
			}
		}catch (Exception e) {
			
		}
		
	}
}
