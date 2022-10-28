package ch_05.server;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import ch_05.gui.ClientGUI;
import ch_05.gui.ServerGUI;
import lombok.Data;


@Data
public class Server {
	
	ServerGUI mContext ;
	Server serverContext = this; 
	ServerSocket serverSocket;
	public static final String HOST_IP = "127.0.0.1";
	public static final int HOST_PORT = 20000;
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
			serverSocket = new ServerSocket(HOST_PORT);
			
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
