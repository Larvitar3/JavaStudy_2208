package ch_05;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;

import ch_05.server.Server;

public class Client {
	
	Socket socket;
	BufferedWriter bufferedWriter;
	BufferedReader bufferedReader;
	
	boolean isRun = true;
	
	public Client() {
		initData();
		
		connectSocketReaderWrite();
		
		ReadThread readThread = new ReadThread();
		Thread thread = new Thread(readThread);
		thread.start();
		
		while(isRun) {
			
			// 인풋 메서드 담는 곳
			
		}
		
	}

	private void initData() {
		System.out.println("클라이언트 실행");
		try {
			socket = new Socket(Server.HOST_IP, Server.HOST_PORT);
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
	

	private class ReadThread implements Runnable{

		@Override
		public void run() {

			while(isRun) {
				try {
					String serverMsg = bufferedReader.readLine();
					System.out.println(" 서버 메세지  : "+ serverMsg);
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
