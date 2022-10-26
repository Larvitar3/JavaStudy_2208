package ch_05.server;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.Vector;

// 클라이언트의 정보를 받고 서버에게 보내줌
public class UserSocket extends Thread{

	private String userName;
	private boolean isRun = true;
	
	private String myCunnectRoomName;
	private String protocol;
	private String mesage;
	
	Server mContext;
	Socket socket;
	
	BufferedReader bufferedReader;
	BufferedWriter bufferedWriter;
	
	public UserSocket(Socket socket, Server server) {
		this.socket = socket;
		this.mContext = server;
		
		System.out.println("유저 연결");
		
		initData();
		
	}

	private void initData() {
		try {
			bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			bufferedWriter = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void sendMessage(String msg) {
		try {
			bufferedWriter.write( msg + "\n");
			bufferedWriter.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	@Override
	public void run() {
		
		new Thread(() -> {
			
			while(isRun) {
				try {
					String msg = bufferedReader.readLine();
					mContext.broadcast(msg);
					// 메세지 넘겨 받는 부분
				} catch (IOException e) {
					isRun = false;
					e.printStackTrace();
				}
				
			}
			
		}).start();
	}
	
	private final String CREATEROOM = "CREATEROOM";
	private final String WHISPER = "Whisper";
	
	private void createRoom() {
	}
	
	private void connectUser() {
		try {
			userName = bufferedReader.readLine();
			System.out.println(userName + " 입장 ");
			
			mContext.broadcast("신규유저 " + userName);
			
			mContext.users.add(this);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	class RoomInfomation{
		
		String roomName;
		Vector<UserSocket> rooms = new Vector<>();
		
		public RoomInfomation(String roomName, UserSocket user) {
			this.roomName = roomName;
			this.rooms.add(user);
			user.myCunnectRoomName = roomName;
		}
		
		private void roomBroadcast(String str) {
			for(int i = 0; i < rooms.size(); i ++) {
				UserSocket user = rooms.elementAt(i);
				user.sendMessage(str);
			}
		}
		
		private void addUser(UserSocket user) {
			rooms.add(user);
		}

	}
	


	
	
	
	
	
	
	
	
	
	
}
