package threadex.ch01;

public class SubThread extends Thread{

	
	
	
	// run메서드 안에 작업을 할당해주어야 한다.
	@Override
	public void run() {
		int i = 0;
		while( i < 20) {
			i++;
			System.out.println(i + ": " + Thread.currentThread());
		}
	}
	
	
}
