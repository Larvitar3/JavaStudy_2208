package ch_05.server;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Vector;

import lombok.Data;

@Data
public class Server {

	// server 세팅
	public static final int HOST_PORT = 33333;
	public static final String HOST_IP = "127.0.0.1";
	
	private Server mContext = this;
	private ServerSocket serverSocket;
	private Socket socket;

	private boolean isRun = true;
	
	private Vector<UserSocket> users = new Vector<>();
	
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
						socket = serverSocket.accept();
						
						UserSocket userSocket = new UserSocket(users.size(), socket, mContext);
						userSocket.start();
						users.add(userSocket);
						
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
				
			}).start();
			
		} catch (IOException e) {
			isRun = false;
			e.printStackTrace();
		} // try / catch end

	}

	public void broadcast(String msg) {
		for( int i = 0; i < users.size(); i ++ ) {
			users.get(i).sendMessage(msg);
		}
	}

	public static void main(String[] args) {
		new Server();
	}
	

}
