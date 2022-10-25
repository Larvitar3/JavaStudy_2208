package ch_04.server;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Vector;

public class ServerFile {
	ServerFile mContext = this;
	ServerSocket serverSocket;
	public static final String HOST_IP = "192.168.7.96";
	public static final int HOST_PORT = 20000;
	Vector<UserSocketThread> vectors = new Vector<>();

	public ServerFile() {
		initData();
	}

	private void initData() {
		try {
			System.out.println(">>> 서버시작 <<<");
			serverSocket = new ServerSocket(HOST_PORT);

			new Thread(() -> {
				while (true) {
					try {
						Socket socket = serverSocket.accept(); // 연결을 위한 쓰레드

						// 여기서 UserSoketThread 를 생성해야한다.
						UserSocketThread userSocketThread = new UserSocketThread(vectors.size(), socket, mContext);
						userSocketThread.start();

						// 백터에 연결된 유저 정보 소켓을 담아서 관리
						vectors.add(userSocketThread);

					} catch (IOException e) {
						e.printStackTrace();
					}
				}
			}).start();

		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}

	public void broadcast(String msg) {
		for (int i = 0; i < vectors.size(); i++) {
			vectors.get(i).sendMessage(msg);
		}
	}

	public static void main(String[] args) {
		new ServerFile();
	}

}
