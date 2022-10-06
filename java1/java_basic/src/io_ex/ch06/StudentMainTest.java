package io_ex.ch06;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class StudentMainTest {
	
	public static void main(String[] args) {
		
		// 기반 스트림 준비
		FileOutputStream fos = null;
		// + 보조 스트림 준비
		ObjectOutputStream oos = null;
		try {
			fos = new FileOutputStream("fos.txt");
			oos = new ObjectOutputStream(fos);
			Student student = new Student("이춘식", 20, "010-1111-1111");
			oos.writeObject(student);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				oos.close(); // 닫을 땐 순서 역순
				fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}

}
