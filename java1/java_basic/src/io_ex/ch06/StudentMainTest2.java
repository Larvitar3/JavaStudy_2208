package io_ex.ch06;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class StudentMainTest2 {
	
	public static void main(String[] args) {
		
		// 기반 스트림 준비
		FileInputStream fis = null;
		// + 보조 스트림 준비
		ObjectInputStream ois = null;
		try {
			fis = new FileInputStream("fos.txt");
			ois = new ObjectInputStream(fis);
			
			Student s1 = (Student)ois.readObject();
			System.out.println(s1.toString());
			// age에 transient를 사용했기 때문에 초기값 0으로 출력된다. 
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}finally {
			try {
				ois.close(); // 닫을 땐 순서 역순
				fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}

}
