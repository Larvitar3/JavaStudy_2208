package io_ex.ch05;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class StudentTest2 {

	public static void main(String[] args) {
		
		try {
			ObjectInputStream objectInputStream = 
					new ObjectInputStream(new FileInputStream("object_2.txt"));
			Student student = (Student)objectInputStream.readObject();
			System.out.println(student);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
	}
	
}
