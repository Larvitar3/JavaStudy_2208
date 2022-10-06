package io_ex.phoneNumber;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;

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
	JButton checkBtn;
	JButton backBtn;
	
	String saveName;
	String savePhoneNum;
	
	public InsertNumber() {
		 initData();
		 setInitLayout();
		 addEventListener();
	}
	
	public void initData() {
		setSize(500, 600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		title = new JLabel("☎ 번호 추가 ☎");
		name = new JLabel("이름 : ");
		inputName = new JTextArea();
		
		phoneNum = new JLabel("전화번호 : ");
		inputPhoneNum = new JTextArea();
		checkBtn = new JButton("확인");
		backBtn = new JButton("뒤로가기");

		
	}

	public void setInitLayout() {
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
		name.setLocation(100, 250);
		name.setFont(new Font("SanSerif", Font.BOLD, 16));
		
		add(inputName);
		inputName.setSize(200, 30);
		inputName.setLocation(160, 260);
		
		add(phoneNum);
		phoneNum.setSize(100, 50);
		phoneNum.setLocation(70, 350);
		phoneNum.setFont(new Font("SanSerif", Font.BOLD, 16));
		
		add(inputPhoneNum);
		inputPhoneNum.setSize(200, 30);
		inputPhoneNum.setLocation(160, 360);
		
		add(checkBtn);
		checkBtn.setSize(100, 40);
		checkBtn.setLocation(100, 430);
		
		add(backBtn);
		backBtn.setSize(100, 40);
		backBtn.setLocation(250, 430);
	}
	
	private void addEventListener() {
		checkBtn.addActionListener(this);
		backBtn.addActionListener(this);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == checkBtn) {
			saveName = inputName.getText();
			savePhoneNum = inputPhoneNum.getText();
			phoneNumListSave.put(savePhoneNum, saveName);
			saveInsert();
		}else if(e.getSource() == backBtn) {
			new MainFrame();
			setVisible(false);
		}
		
	}
	
	public void saveInsert() {
		try(FileWriter fw = new FileWriter("phoneNumber.txt", true)){
			System.out.println("배열에 " + phoneNumListSave.size() + " 번 저장되었습니다.");
			String phoneNumber = phoneNumListSave.get(savePhoneNum);
			fw.write(phoneNumber);
			fw.write(savePhoneNum + "\n");
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void selectNumber() {
		
	}

}

















