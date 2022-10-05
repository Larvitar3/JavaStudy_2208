package io_ex.ch01;

import java.io.IOException;
import java.io.PrintStream;

public class MainTest1 {
	
	public static PrintStream out;
	public static PrintStream in;
	public static PrintStream err;
	
	public static void main(String[] args) {
		// 표준 입출력 스트림
		
		// 출력 스트림 ( 모니터 출력 스트림)
		System.out.println("출력 스트림");
		
		// 입력 스트림 ( 키보드 입력 스트림)
		// System.in
		
		try {
			int k = System.in.read();
			System.out.println("k : " + k);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}
}
