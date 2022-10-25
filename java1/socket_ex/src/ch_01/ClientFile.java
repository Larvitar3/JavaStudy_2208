package ch_01;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class ClientFile {

	Socket socket;
	BufferedWriter bufferedWriter;
	// 문자를 보내야 하므로 writer를 사용한다.

	final String IP = "127.0.0.1"; // = 127.0.0.1

	BufferedReader bufferedReader; // 키보드 용
	// 키보드와 연결하는 스트림 필요

	public ClientFile() {
		System.out.println("1번, 클라이언트 소켓 시작");

		try {
			socket = new Socket(IP, ServerFile.HOST_PORT);

			System.out.println("2번, 버퍼 연결");
			bufferedWriter = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));

			System.out.println("3번, 키보드 연결");
			// 키보드 연결
			bufferedReader = new BufferedReader(new InputStreamReader(System.in));

			System.out.println("4번, 키보드 입력 대기");
			String keyboardMsg = bufferedReader.readLine();

			// 중요 !! 메세지 끝을 알려줘야한다. [ \n -> 엔터 ] 가 입력되기 전까지 대기
			bufferedWriter.write(keyboardMsg + "\n");
			bufferedWriter.flush();

		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public static void main(String[] args) {
		new ClientFile();
	}

}
