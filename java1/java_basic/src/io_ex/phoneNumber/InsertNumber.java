package io_ex.phoneNumber;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;

public class InsertNumber extends JFrame implements ActionListener{
	
	HashMap<String, String> phoneNumListSave = new HashMap<>();	
	
	JLabel title;
	JLabel name;
	JTextArea inputName;
	JLabel phoneNum;
	JTextArea inputPhoneNum;
	JButton okBtn;
	
	String saveName;
	String savePhoneNum;
	
	public InsertNumber() {
		initData();
		setInitLayout();
		addEventListener();
	}



	private void initData() {
		setSize(500, 800);
		setTitle("추가하기");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		title = new JLabel("☎ 추가하기 ☎");
		name = new JLabel("이름 : ");
		inputName = new JTextArea();
		
		phoneNum = new JLabel("전화번호 : ");
		inputPhoneNum = new JTextArea();
		okBtn = new JButton("확인");
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
		
		add(name);
		name.setSize(50, 50);
		name.setLocation(100, 300);
		name.setFont(new Font("SanSerif", Font.BOLD, 16));
		
		add(inputName);
		inputName.setSize(200, 30);
		inputName.setLocation(160, 310);
		
		add(phoneNum);
		phoneNum.setSize(100, 50);
		phoneNum.setLocation(70, 400);
		phoneNum.setFont(new Font("SanSerif", Font.BOLD, 16));
		
		add(inputPhoneNum);
		inputPhoneNum.setSize(200, 30);
		inputPhoneNum.setLocation(160, 410);
		
		add(okBtn);
		okBtn.setSize(100, 50);
		okBtn.setLocation(180, 500);
	}
	
	private void addEventListener() {
		okBtn.addActionListener(this);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {

		saveName = inputName.getText();
		savePhoneNum = inputPhoneNum.getText();
		phoneNumListSave.put(savePhoneNum, saveName);

		saveInsert();
	}
	
	public void saveInsert() {
		try(FileWriter fw = new FileWriter("phoneNumber.txt", true)){
			System.out.println(phoneNumListSave.size());
			
			String phoneNumber = phoneNumListSave.get(savePhoneNum);
			fw.write(phoneNumber);
			fw.write(savePhoneNum);
			
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
	
	public static void main(String[] args) {
		new InsertNumber();
	}

	
}
