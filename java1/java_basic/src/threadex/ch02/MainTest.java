package threadex.ch02;

// 인터페이스를 활용해서 Thread 생성 및 사용방법
public class MainTest {

	public static void main(String[] args) {
		MyFrame myFrame = new MyFrame();
		// 쓰레드를 구현한 상태 , 동작 시키는 방법

		myFrame.run();

		// Thread
		Thread t1 = new Thread(myFrame);
		t1.start();

		Thread t2 = new Thread(myFrame);
		t2.start();

	}

}
