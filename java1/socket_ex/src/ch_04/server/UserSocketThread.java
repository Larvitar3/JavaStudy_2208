package ch_04.server;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;

// 클라이언트 소켓과 대응하는 서버측 소켓
public class UserSocketThread extends Thread {
	// 클라이언트와 연결 스트림 처리
	// 동작 -->
	int id;
	private boolean isRun = true;

	// 의존성 컴포지션
	ServerFile mContext;
	Socket socket;
	
	BufferedReader bufferedReader;
	BufferedWriter bufferedWriter;
	
	public UserSocketThread(int id, Socket socket, ServerFile serverFile) {
		this.mContext = serverFile;
		this.socket = socket;
		this.id = id;
		System.out.println("유저 연결됨");
		initData();
	}

	private void initData() {
		try {
			bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			bufferedWriter = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public void sendMessage(String msg) {
		try {
			bufferedWriter.write( msg + "\n");
			bufferedWriter.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	// 클라이언트에서 보낸 메시지를 계속 받아야한다
	@Override
	public void run() {
		// UserSocket Thread 에서도 다른 작업을 해야 한다면
		// 이 구문은 따로 쓰레드로 만들어야 한다
		new Thread(() -> {
			while (isRun) {
				try {
					String msg = bufferedReader.readLine();
					System.out.println( id + " :가  " + "넘겨받은 메세지  :   " + msg );
					// TODO 추가 코드 부분 !!
					mContext.broadcast(msg);
					
				} catch (IOException e) {
					isRun = false;
					e.printStackTrace();
				} 

			}

		}).start();

	}

}
