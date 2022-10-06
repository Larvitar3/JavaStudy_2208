package io_ex.phoneNumber;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MainFrame extends JFrame implements ActionListener{
	
	JLabel title;
	JButton insertBtn;
	JButton selectBtn;
	JButton updataBtn;
	JButton deleteBtn;

	public MainFrame() {
		initData();
		setInitLayout();
		addEventListener();
	}

	private void initData() {
		setSize(500, 800);
		setTitle("연락처");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		title = new JLabel("☎ 전화번호부 ☎");
		insertBtn = new JButton("추가");
		selectBtn = new JButton("조회");
		updataBtn = new JButton("수정");
		deleteBtn = new JButton("삭제");
	}

	private void setInitLayout() {
		setVisible(true);
		setResizable(false);
		setLayout(null);
		
		add(title);
		title.setSize(500, 200);
		title.setFont(new Font("SanSerif", Font.BOLD, 40));
		title.setForeground(Color.WHITE);
		title.setHorizontalAlignment(JLabel.CENTER);
		title.setOpaque(true);
		title.setBackground(Color.BLACK);

		add(insertBtn);
		insertBtn.setSize(100, 50);
		insertBtn.setLocation(180, 300);
		
		add(selectBtn);
		selectBtn.setSize(100, 50);
		selectBtn.setLocation(180, 400);
		
		add(updataBtn);
		updataBtn.setSize(100, 50);
		updataBtn.setLocation(180, 500);
		
		add(deleteBtn);
		deleteBtn.setSize(100, 50);
		deleteBtn.setLocation(180, 600);
	}

	private void addEventListener() {
		insertBtn.addActionListener(this);
		selectBtn.addActionListener(this);
		updataBtn.addActionListener(this);
		deleteBtn.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == insertBtn) {
			setVisible(false);
			new InsertNumber();
		}else if(e.getSource() == selectBtn) {
			
		}else if(e.getSource() == updataBtn) {
			
		}else if(e.getSource() == deleteBtn) {
			
		}
		
	}
	public static void main(String[] args) {
		new MainFrame();
	}

	
}
