package io_ex.ch04;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class MainTest5 {

	public static void main(String[] args) {
		
		String originFilePath = "C:\\worksapce/java1.zip";
		String copyFilePath = "copy_java1.zip";
		
		try(FileInputStream fis = new FileInputStream(originFilePath)) {
			try(FileOutputStream fos = new FileOutputStream(copyFilePath)){
				int i;
				while( (i = fis.read()) != -1 ) {
					fos.write(i);
				}
			}catch (Exception e) {
				
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
	}
}
