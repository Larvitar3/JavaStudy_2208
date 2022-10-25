package ch_01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

// 서버 역할을 하는 소켓통신 프로그램을 만들 예정
// 필요한 도구 : 연결 감지 서버, 생성 서버
public class ServerFile {

	ServerSocket serverSocket;
	Socket socket;

	// 버퍼 담기
	BufferedReader bufferedReader;

	static final int HOST_PORT = 22222;
	
	public ServerFile() {
		System.out.println("1번 서버 소캣 시작");

		try {
			serverSocket = new ServerSocket(HOST_PORT);
			// 접속받기 위해 대기만 하는 녀석
			System.out.println("2번 서버 소캣 생성");

			// 클라이언트가 접속을 하면 새로운 소켓을 생성 ( accept()가 새로운 소켓으로 변환)
			socket = serverSocket.accept(); // -> 서버 기다리는 명령어
			System.out.println("3번 클라이언트 연결 완료");

			bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			// 글자를 읽을 수 없는 buffered >

			String msg = bufferedReader.readLine();
			System.out.println("4번 클라이언트로 부터 받은 메세지  :  " + msg);
			// ========= 단방형 통신 ============

			// 스트림 연결하기
		} catch (IOException e) {
			System.out.println("예외 발생");
			e.printStackTrace();
		}

	}

	public static void main(String[] args) {
		new ServerFile();
	}
	
}
