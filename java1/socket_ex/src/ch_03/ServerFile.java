package ch_03;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerFile {

	// 클라이언트 연결 받는 소켓
	ServerSocket serverSocket;
	// 실제로 통신하는 소켓
	Socket socket;
	// 서버에서 클라이언트의 데이터를 읽기위한 버퍼
	BufferedReader bufferedReader;

	static final int HOST_PORT = 20000;
	static final String HOST_IP = "192.168.7.254";

	// 서버에서 클라이언트에게 데이터를 보내기 위한 버퍼
	BufferedWriter bufferedWriter;
	// 서버에서 키보드로부터 데이터를 입력받는 버퍼
	BufferedReader serverKeybordReader;

	public ServerFile() {
		initData();

	}

	private void initData() {
		try {
			serverSocket = new ServerSocket(HOST_PORT);
			socket = serverSocket.accept();
			System.out.println("클라이언트 연결 완료");

			connenctClientSoketWriterReader();
			connenctKeyboard();

			// while 이 실행중이면 다른 구문이 실행될 수 없다
			// 때문에 멀티 쓰레드를 사용한다.
			WriteThread writeThread = new WriteThread();
			Thread thread = new Thread(writeThread);
			thread.start();

			while (true) {
				String msg = bufferedReader.readLine();
				System.out.println("클라이언트 메세지 : " + msg);
			}

		} catch (IOException e) {
			e.printStackTrace();
		} 

	} // end of initData

	private void connenctKeyboard() {

		serverKeybordReader = new BufferedReader(new InputStreamReader(System.in));

	}

	private void connenctClientSoketWriterReader() {

		try {

			bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			bufferedWriter = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	// 내부 클래스로 쓰레드 생성
	class WriteThread implements Runnable {

		@Override
		public void run() {

			while (true) {

				try {

					String serverKeybordMsg = serverKeybordReader.readLine();
					bufferedWriter.write(serverKeybordMsg + "\n");
					bufferedWriter.flush();
				} catch (IOException e) {
					e.printStackTrace();
				}

			}

		}

	}

	public static void main(String[] args) {
		new ServerFile();
	}

}
