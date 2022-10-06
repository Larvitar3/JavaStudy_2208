package io_ex.ch04;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

// 문자 단위 출력 스트림
// 파일에다가 문자 쓰기

public class MainTest2 {

	public static void main(String[] args) {
	
		try(FileWriter fw = new FileWriter("writer_1.txt", true)){
			
			char buf[] = {'반','가','워'};
			fw.write(buf);

		}catch (Exception e) {
			
		}
		
	}
}
