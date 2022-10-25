package ch_05.server;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;

import lombok.Data;

@Data
public class UserSocket extends Thread {

	private boolean isRun = true;
	private int userId;

	private Server mContext;
	private Socket socket;
	private BufferedReader bufferedReader;
	private BufferedWriter bufferedWriter;

	public UserSocket(int userId, Socket socket, Server server) {
		this.userId = userId;
		this.socket = socket;
		this.mContext = server;
		System.out.println(" [ " + userId +1 + " ] 님이 연결되었습니다.");
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
			bufferedWriter.write(msg + "\n");
			bufferedWriter.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void run() {
		new Thread(() -> {

			while (isRun) {
				try {
					String msg = bufferedReader.readLine();
					mContext.broadcast(msg);
				} catch (IOException e) {
					isRun = false;
					e.printStackTrace();
				}

			}

		}).start();
	}

}
