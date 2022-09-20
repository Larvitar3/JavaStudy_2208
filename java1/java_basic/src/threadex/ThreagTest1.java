package threadex;

// 1. 쓰레드를 생성하는 첫번째 방법(상속을 이용

class MyThread extends Thread {

	String name;

	public MyThread(String name) {
		this.name = name;
	}

	// 새로운 작업자한테 일을 시킬려면 특정한 메소드 안에서 코드를 해줘야 한다.
	// 약속
	@Override
	public void run() {
		int i;
		for (i = 0; i < 10; i++) {
			System.out.println( this.name + ":" + i);
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

public class ThreagTest1 {

	public static void main(String[] args) {
		System.out.println("현재 쓰레드 정보 얻기" + Thread.currentThread());
		System.out.println("메인쓰레드가 화면에 글자를 출력합니다.");
		MyThread myThread1 = new MyThread("서브작업자1");
		MyThread myThread2 = new MyThread("서브작업자2");
		// 메인작업자가 서브작업자한테 일을 시작해 = (run() 메서드를 호출하면 된다)

		myThread1.start();
		myThread2.start();

		MyThread myThread3 = new MyThread("서브작업자 3");
		myThread3.start();
		System.out.println("메인쓰레드 일 종료");

		// 동시에 일을 시키려면 state메서드를 사용하면 된다

	}
}

// 서브 작업자를 만들어내는 방법
// run() 이라는 메소드 안에 일을 구현해놓으면된다

// 일을 동시에 시키는 방법
// statrt라는 메소드를 호출하면된다
