package ch01;

import java.awt.Dimension;

import javax.swing.JFrame;

public class MyFrame extends JFrame{

	// 인스턴스화 될 때 가장 먼저 실행되는 코드 - 생성자
	public MyFrame() {
		super.setTitle("MyFrame");
		super.setSize(800, 500);
		super.setVisible(true);
		super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	
	
}
