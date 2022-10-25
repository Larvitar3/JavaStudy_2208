package ch_04.client;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;

import ch_04.server.ServerFile;

public class ClientFile {

	Socket socket;
	BufferedWriter bufferedWriter;
	BufferedReader bufferedReader;
	
	BufferedReader keyboardReader;
	
	boolean flag = true;
	
	public ClientFile() {
		initData();
	}

	private void initData() {
		System.out.println("클라이언트 소켓 시작");
		try {
			socket = new Socket(ServerFile.HOST_IP, ServerFile.HOST_PORT);
			
			connectSocketReaderWrite();
			connectKeyboardReader();
			
			ReadThread readThread = new ReadThread();
			Thread thread = new Thread(readThread);
			thread.start();
			
			while(flag) {
				try {
					String keybordMsg = keyboardReader.readLine();
					
					bufferedWriter.write(keybordMsg + "\n");
					bufferedWriter.flush();
					
				} catch (IOException e) {
					e.printStackTrace();
					flag = false;
				} 
			}
		} catch (Exception e) {
			e.printStackTrace();
		} 
	}
	
	private void connectSocketReaderWrite() {
		try {
			bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			bufferedWriter = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	private void connectKeyboardReader() {
		keyboardReader = new BufferedReader(new InputStreamReader(System.in));
	}
	
	// 서버에서 넘어온 데이터를 받는 녀석
	private class ReadThread implements Runnable{

		@Override
		public void run() {
			
			while(flag) {
				try {
					String serverMsg = bufferedReader.readLine();
					System.out.println("서버로부터 온 MSG : " + serverMsg);
				} catch (IOException e) {
					e.printStackTrace();
					flag = false;
				} 
				
			}
			
		}
		
	} // end of inner class
	
	public static void main(String[] args) {
		new ClientFile();
	}
	
}
