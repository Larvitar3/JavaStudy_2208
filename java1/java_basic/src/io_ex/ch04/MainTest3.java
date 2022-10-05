package io_ex.ch04;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

// 문자 단위 출력 스트림
// 파일에다가 문자 쓰기

public class MainTest3 {

	public static void main(String[] args) {

		try(FileReader fr = new FileReader("reader_1.txt")){
			try(FileWriter fw = new FileWriter("writer_2.txt")){
				int i;
				while( (i = fr.read()) != -1 ) {
					fw.write((char)i);
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
