package threadex.ch02;


// 2 : 익명 구현 클래스 활용 방법
public class MainTest2 {
	
	
	public static void main(String[] args) {
		MyFrame2 myFrame2 = new MyFrame2();
		
		// 쓰레드를 동작
		
		Thread thread = new Thread(myFrame2.runnable);
		thread.start();
		
	}
	

}
