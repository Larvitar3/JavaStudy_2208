package ch_05;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;

import ch_05.server.Server;

public class Client {

	private Socket socket;
	private BufferedWriter bufferedWriter;
	private BufferedReader bufferedReader;
	private boolean isRun = true;

	// 삭제
	private BufferedReader keyboardReader;

	public Client() {
		initData();
	}

	private void initData() {

		try {
			socket = new Socket(Server.HOST_IP, Server.HOST_PORT);

			connectSocketReaderWriter();

			ReadThread readThread = new ReadThread();
			Thread thread = new Thread(readThread);
			thread.start();
			while (isRun) {
				// 삭제
				String keboardMsg = keyboardReader.readLine();

				bufferedWriter.write(keboardMsg + "\n");
				bufferedWriter.flush();
			}
		} catch (Exception e) {
			isRun = false;
			e.printStackTrace();
		}

	}

	private void connectSocketReaderWriter() {

		try {
			bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			bufferedWriter = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));

			// 삭제
			keyboardReader = new BufferedReader(new InputStreamReader(System.in));

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	// innerClass
	private class ReadThread implements Runnable {

		@Override
		public void run() {

			while (isRun) {
				String serverMsg;
				try {
					serverMsg = bufferedReader.readLine();
					System.out.println("서버 작동 중  : "+serverMsg);
				} catch (IOException e) {
					isRun = false;
					e.printStackTrace();
				}

			}

		}

	}
public static void main(String[] args) {
	new Client();
}
}
