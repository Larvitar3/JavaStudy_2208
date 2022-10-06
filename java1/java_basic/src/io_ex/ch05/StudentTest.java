package io_ex.ch05;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class StudentTest {
	
	public static void main(String[] args) {
		
		Student student1 = new Student("자이라", 50, "1234");
		Student student2 = new Student("스웨인", 100, "22");
		Student student3 = new Student("벨버즈", 40, "33");
		
		FileOutputStream fos = null;
		ObjectOutputStream objectOutputStream = null;
		
		try {
			
			fos = new FileOutputStream("object_2.txt");
			objectOutputStream = new ObjectOutputStream(fos);
			// 객체단위로 사용하고 싶다면
			objectOutputStream.writeObject (student1);
			objectOutputStream.flush();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				objectOutputStream.close();
				fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}

		}
		
	}

}
