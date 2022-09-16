package ch02;

import java.util.Scanner;

import javax.swing.JTextField;

public class MainTest1 {
	
	public static void main(String[] args) {
		MyComponents components = new MyComponents();
		
		Scanner scanner = new Scanner(System.in);
		String userInput = scanner.nextLine();
		System.out.println("userInput : " + userInput);
		
		components.inputScannerData(userInput);

	
		
		
	}


}
