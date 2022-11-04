package ch01;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Vector;


public class Server {
	
	ServerGUI mContext ;
	Server serverContext = this; 
	ServerSocket serverSocket;
	public static final String HOST_IP = "127.0.0.1";
//	public static final int HOST_PORT = 20000;
	Vector<UserSocket> users = new Vector<>();  
	
	private boolean isRun = true;
	
	public Server(ServerGUI mContext) {
		this.mContext = mContext;
		mContext.getServerLog().append(HOST_IP );
		initData();
		
	}

	private void initData() {
		try {
			System.out.println(">> 서버 시작 << ");
			int port = Integer.parseInt(mContext.getInputHost().getText()); 
			serverSocket = new ServerSocket(port);
			
			new Thread(()-> {
				
				while(isRun) { 
					
					try {
						Socket socket = serverSocket.accept();
						
						UserSocket userSocket = new UserSocket(socket, serverContext);
						userSocket.start();
						
//						users.add(userSocket);
						
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

	
}
