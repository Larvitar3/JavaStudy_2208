package ch_02;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;

public class ClientFile {

	Socket socket;
	BufferedWriter bufferedWriter;
	BufferedReader keyboardReader;
	
	public ClientFile() {
		initData();
	}

	private void initData() {
		try {
			socket = new Socket(ServerFile.HOST_IP, ServerFile.HOST_PORT);
			
			bufferedWriter = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
			
			// 키보드 연결
			keyboardReader = new BufferedReader(new InputStreamReader(System.in));
			
			while(true) {
				System.out.println("키보드 입력 대기");
				String msg = keyboardReader.readLine();
				
				// 중요!! [ \n ] 메세지의 끝을 알려줘야한다.
				bufferedWriter.write(msg + "\n");
				bufferedWriter.flush(); // 버퍼의 메모리를 다 비워준다.
			}
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	public static void main(String[] args) {
		new ClientFile();
	}
	
}
