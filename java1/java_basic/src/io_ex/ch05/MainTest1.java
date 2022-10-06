package io_ex.ch05;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

// 문자단위 입력 스트림
// 파일에서 라인 단위로 문자 읽기

public class MainTest1 {
	
	public static void main(String[] args) {
		
		int count = 0;
		try {
			File file = new File("myText_1.txt");
			FileReader reader = new FileReader(file);
			// 기반 스트림  + 보조 스트림 ( 한줄씩 읽기)
			
			BufferedReader bufferedReader = new BufferedReader(reader);
			// 보조 스트림 생성시 매개변수로 기반 스트림을 넣고있다.
			
//			String line;
//			while( (line = bufferedReader.readLine()) != null) {
//				// String 타입이기 때문에 -1이 아닌 null을 사용한다.
//				System.out.println(line);
//				count++;
//			} // => line 단위로 문자를 읽어낸다 ( 속도가 더 빠름 )
			
			int i = 0;
			while( ( i = reader.read()) != -1 ) {
				System.out.print((char) i);
			}
			
			System.out.println(count + "번 반복문이 실행되었습니다.");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
