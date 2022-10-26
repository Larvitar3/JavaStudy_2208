package ch_05.server;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Vector;

public class Server {
	
	ServerSocket serverSocket;
	public static final String HOST_IP = "127.0.0.1";
	public static final int HOST_PORT = 12644;
	Vector<UserSocket> users = new Vector<>();
	private boolean isRun = true;
	
	public Server() {
		initData();
	}

	private void initData() {
		
		try {
			System.out.println("서버 시작");
			serverSocket = new ServerSocket(HOST_PORT);
			
			new Thread(()-> {
				
				while(isRun) {
					
					try {
						Socket socket = serverSocket.accept();
						
						UserSocket userSocket = new UserSocket(socket, this);
						userSocket.start();
						
						users.add(userSocket);
						
					} catch (IOException e) {
						e.printStackTrace();
						isRun = false;
					}
				}
			}).start();
		} catch (IOException e) {
			e.printStackTrace();
		}
	} // end of initData
	
	public void broadcast(String msg) {
		for (int i = 0; i < users.size(); i++) {
			UserSocket userInfo = users.elementAt(i);
			userInfo.sendMessage(msg);
		}
	}
	
	
	
	
	
	

	public static void main(String[] args) {
		new Server();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
