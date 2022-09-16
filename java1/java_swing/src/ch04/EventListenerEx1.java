package ch04;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

class MyFrame2 extends JFrame implements ActionListener{
	
	JButton button1;
	JButton button2;
	
	public MyFrame2() {
		initData();
		setInitData();
		addEventListener();
	}
	
	private void initData() {
		setSize(500,500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		button1 = new JButton("button1");
		button2 = new JButton("button2");
	}
	
	private void setInitData() {
		setVisible(true);
		setLayout(new FlowLayout());
		add(button1);
		add(button2);
	}
	
	private void addEventListener() {
		// 등록을 해주어야 한다
		button1.addActionListener(this);
		button2.addActionListener(this);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// 콜백 메소드
		System.out.println("버튼이 눌러졌습니다.");
		System.out.println(e.toString());
	}
	
	
}

public class EventListenerEx1 {
	public static void main(String[] args) {
		new MyFrame2();
	}
	
}
