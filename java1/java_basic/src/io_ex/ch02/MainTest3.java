package io_ex.ch02;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class MainTest3 {
	public static void main(String[] args) {
		
		try(FileInputStream fis = new FileInputStream("boot_a.txt")){			
			
			byte[] bs = new byte[10];
			int i;
			
			while((i = fis.read(bs)) != -1) {
//				System.out.print((char)i);
				for(int j = 0; j < i ; j ++) {
					System.out.print((char)bs[j]);
				}
				System.out.println("i : " + i + "바이트씩 읽음");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
}
