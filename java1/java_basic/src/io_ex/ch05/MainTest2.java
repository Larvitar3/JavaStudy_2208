package io_ex.ch05;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class MainTest2 {
	
	public static void main(String[] args) {
	
		String text = "test test";
		String fileName = "result.txt";
		FileWriter fileWriter = null;
		BufferedWriter bufferedWriter = null;
		
		try {
			 fileWriter = new FileWriter(fileName);
			 bufferedWriter = new BufferedWriter(fileWriter);
			// 파일안에 문자 쓰기
			bufferedWriter.write(text);
			bufferedWriter.write(text);
			bufferedWriter.flush();
			// bufferdWriter를 사용할 때 flush() 사용 권장
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				// 닫을 때는 생성순서의 반대 
				bufferedWriter.close();
				fileWriter.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
	
		}
		
	}

}
