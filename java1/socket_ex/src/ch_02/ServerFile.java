package ch_02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerFile {
	
	ServerSocket serverSocket;
	Socket socket;
	BufferedReader bufferedReader;
	
	static final int HOST_PORT = 22000;
	static final String HOST_IP = "192.168.7.96";
	
	public ServerFile() {
		initData();
	}
	
	private void initData() {
		try {
			serverSocket = new ServerSocket(HOST_PORT);
			socket = serverSocket.accept();
			System.out.println(">>> 클라이언트 연결 (서버)  <<<");
			bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			
			while(true) {
				String  msg = bufferedReader.readLine();
				System.out.println("메세지 :  " + msg);
				
			}
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		new ServerFile();
	}

}
