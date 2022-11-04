package ch01;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.StringTokenizer;
import java.util.Vector;

public class Client {

	ChatGUI chatGUIContext;
	Socket socket;

	BufferedWriter bufferedWriter;
	BufferedReader bufferedReader;

	String ip;
	String port;

	private Vector<String> users = new Vector<>();
	private Vector<String> rooms = new Vector<>();

	BufferedReader keyboardReader;
	private String userName;
	private String msgText;

	boolean isRun = true;

	public Client(String ip, String port, ChatGUI chatGUIContext) {
		this.ip = ip;
		this.port = port;
		this.chatGUIContext = chatGUIContext;
		initData();
		connectSocketReaderWrite();

		ReadThread readThread = new ReadThread();
		Thread thread = new Thread(readThread);
		thread.start();

	}

	private void initData() {
		System.out.println("클라이언트 실행");
		try {
			socket = new Socket(ip, Integer.parseInt(port));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private void connectSocketReaderWrite() {
		try {
			bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			bufferedWriter = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
				
			// 내이름 보냄 
			bufferedWriter.write(chatGUIContext.getUserName() + "\n");
			bufferedWriter.flush();
			
			//chatGUIFrame 에 --->  
			users.add(chatGUIContext.getUserName());
			chatGUIContext.getShowUserList().setListData(users);

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void sendMessage(String msg) {

		System.out.println("클라이언트에서 보낸 메세지 " + msg);
		// chat/username@ 1 111 
		// 서버 채팅???  
		try {
			bufferedWriter.write(msg + "\n");
			bufferedWriter.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private void inMessage(String msg) {
		StringTokenizer st = new StringTokenizer(msg, "/");

		String protocol = st.nextToken();
		String message = st.nextToken();
		System.out.println("protocol : " + protocol);
		System.out.println("message : " + message);

		if (protocol.equals("chat")) {
			// 같은방에 존재하난 사람을 찾아서 UserSocket 에 있는 sendMessage
			
			StringTokenizer subst = new StringTokenizer(message, "@");
			String fromUserName = subst.nextToken();
			String chatMsg = subst.nextToken();
			
			chatGUIContext.getChatingLog().append("\n");
			chatGUIContext.getChatingLog().append(" 『 "+fromUserName +" 』  :  "+ chatMsg + "\n");
			
			
		}  else if (protocol.equals("NewUser")) {
			users.add(message);
			chatGUIContext.getShowUserList().setListData(users);
		} else if (protocol.equals("OldUser")) {
			System.out.println("olduser :: "+message);
				users.add(message);
				//chatGUIContext.getShowUserList().setListData(users);
			}		
		
		
	}

	private class ReadThread implements Runnable {

		@Override
		public void run() {

			while (isRun) {
				try {
					String serverMsg = bufferedReader.readLine();
					System.out.println(" 서버 메세지  : " + serverMsg);
					inMessage(serverMsg);
				} catch (IOException e) {
					isRun = false;
					e.printStackTrace();
				}

			}

		}

	}

}
