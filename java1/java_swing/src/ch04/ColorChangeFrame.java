package ch04;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ColorChangeFrame extends JFrame implements ActionListener{

	JPanel centerPanel;
	JPanel bottomPanel;
	
	JButton button1;
	JButton button2;
	
	public ColorChangeFrame() {
		initData();
		setInitLayout();
		addEventLayout();
	}
	
	private void initData() {
		setSize(500,500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		centerPanel = new JPanel();
		bottomPanel = new JPanel();
		
		button1 = new JButton("핑크");
		button2 = new JButton("주황");
		
	}
	
	private void setInitLayout() {
		setVisible(true);
		this.setLayout(new BorderLayout());
		this.add(centerPanel, BorderLayout.CENTER);
		centerPanel.setBackground(Color.green);
		this.add(bottomPanel, BorderLayout.SOUTH);
		
		bottomPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 20, 20));
		bottomPanel.add(button1);
		bottomPanel.add(button2);
		
		
	}
	
	private void addEventLayout() {
		button1.addActionListener(this);
		button2.addActionListener(this);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		// 주소값 비교
		if(e.getSource() == button1) {
			centerPanel.setBackground(Color.PINK);
		}else if(e.getSource() == button2) {
			centerPanel.setBackground(Color.orange);
		}
		
//		// 문자열 비교
//		JButton selectedButton = (JButton)e.getSource();
//		if(selectedButton.getText().equals(button1.getText())) {
//			centerPanel.setBackground(Color.PINK);
//		}else if(selectedButton.getText().equals(button2.getText())) {
//			centerPanel.setBackground(Color.orange);
//		}
		
		System.out.println("1111");
		
	}
	
	
	
	public static void main(String[] args) {
		
		new ColorChangeFrame();
		
	}
}
