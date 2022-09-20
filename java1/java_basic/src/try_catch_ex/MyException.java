package try_catch_ex;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class MyException {

	FileInputStream fileInputStream;
	String fileName;

	public MyException(String name) throws IOException {
		this.fileName =  name;
		readFile();

	}

	String readFile() throws IOException {
		fileInputStream = new FileInputStream(fileName);

		Properties prop = new Properties();
		prop.load(fileInputStream);
		String strData = prop.getProperty("이춘식");

		return strData;
	}

}

class MainTest4 {

	public static void main(String[] args) throws IOException {

		MyException exception = new MyException("temp");
		exception.readFile();

	}

}
