package try_catch_ex;

import java.io.FileInputStream;

public class FileExceptionHendling {

	public static void main(String[] args) {
		
		FileInputStream fis = null;
		
		try {
			fis = new FileInputStream("vvvv.txt");
		} catch (Exception e) {
			
		} finally{
			System.out.println("항상 수행이 됩니다.");
		}

		
	}
	
}
