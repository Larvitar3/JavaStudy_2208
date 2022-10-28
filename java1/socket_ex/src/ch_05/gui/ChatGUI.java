package ch_05.gui;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import ch_05.Client;
import ch_05.server.Server;
import ch_05.server.UserSocket;
import lombok.Data;
import lombok.Getter;

public class ChatGUI extends JFrame implements ActionListener{
	
	Client client;
	ChatGUI chatGUIContext = this;
	ClientGUI clientGUI;
	Server mContext;
	
	private JPanel background;
	private JLabel title;
	
	private JButton waitingBtn;
	private JButton chatingBtn;
	
	// waiting
	private JPanel waitingBox;
	private JLabel totalUsersTitle;
	private JList showUserList;

	private JPanel chatingBox;
		
	private JLabel totalRoomsTitle;
	private JList showRoomList;
	private JButton creatRoomBtn;
	private JButton joinRoomBtn;
	private JButton outRoomBtn;
	private JButton removeRoomBtn;
	private JButton whisperBtn;
	private JButton exitBtn;
	
	private JTextArea textMassege;
	private String chatingText;
	
	private JTextArea chatingLog;
	private JButton sendMessageBtn;
	private JLabel roomName;
	private JLabel userNameLabel;
	private String userName;
	
	private String ip;
   private String port;
	
  
   
	private final int WIDTH = 500;
	private final int HEIGHT = 680;

	Color whiteOp = new Color(225, 225, 225, 150);
	Color whiteOp100 = new Color(225, 225, 225, 0);
	
	public ChatGUI(String ip,String port, String userName) {
		this.ip = ip;
		this.port = port;
		this.userName = userName;
		initData();
		setInitLayiut();
		addEventListenter();
		waitingRoom();
	}
	
	
	private void initData() {
		setSize(WIDTH, HEIGHT);
		setTitle("Live Chat");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		background = new JPanel();
		title = new JLabel("● Live Chat ●");
		waitingBtn = new JButton("대기실");
		chatingBtn = new JButton("채팅");
		
		chatingBox = new JPanel();
		waitingBox = new JPanel();
		totalUsersTitle = new JLabel(" ▶ Users");
		showUserList = new JList();
		totalRoomsTitle = new JLabel(" ▶ Rooms");
		showRoomList = new JList();
		creatRoomBtn = new JButton("방 만들기");
		joinRoomBtn = new JButton("방 들어가기");
		outRoomBtn = new JButton("나가기");
		removeRoomBtn = new JButton();
		textMassege = new JTextArea();
		sendMessageBtn = new JButton("전송");
		chatingLog = new JTextArea();
		whisperBtn = new JButton("귓속말"); 
		roomName = new JLabel("▶ 방이름");
		exitBtn = new JButton("※ 종료 ※");
		userNameLabel = new JLabel("유저 네임 ◀");
		
		client = new Client(ip, port, chatGUIContext);
		clientGUI = new ClientGUI();
		clientGUI.dispose();

	}

	public void waitingRoom() {
		
		add(creatRoomBtn);
	
		waitingBox.add(joinRoomBtn);
		joinRoomBtn.setSize(100,40);
		joinRoomBtn.setLocation(150,430);
		
		waitingBox.add(creatRoomBtn);
		creatRoomBtn.setSize(100, 40);
		creatRoomBtn.setLocation(20, 430);
		
		waitingBox.add(showRoomList);
		showRoomList.setSize(230, 360);
		showRoomList.setLocation(20, 60);
		
		waitingBox.add(showUserList);
		showUserList.setSize(110, 360);
		showUserList.setLocation(270, 60);
		
		waitingBox.add(totalRoomsTitle);
		totalRoomsTitle.setSize(230, 30);
		totalRoomsTitle.setLocation(20, 30);
		totalRoomsTitle.setFont(new Font("Serif", Font.BOLD, 18));
		
		waitingBox.add(totalUsersTitle);
		totalUsersTitle.setSize(230, 30);
		totalUsersTitle.setLocation(270, 30);
		totalUsersTitle.setFont(new Font("Serif", Font.BOLD, 18));
		
		userNameLabel.setText(userName);
		
		waitingBox.add(userNameLabel);
		userNameLabel.setSize(110, 40);
		userNameLabel.setLocation(270, 430);
		userNameLabel.setHorizontalAlignment(JLabel.RIGHT);
		userNameLabel.setFont(new Font("Dialog", Font.BOLD, 14));
		
		add(waitingBox);
		waitingBox.setSize(400, 480);
		waitingBox.setLocation(40, 120);
		waitingBox.setBackground(whiteOp);
		waitingBox.setLayout(null);
		
		add(background);
		
		repaint();
	}
	
	public void chatingRoom() {
		
		chatingBox.add(textMassege);
		textMassege.setSize(305, 30);
		textMassege.setLocation(10, 430);
		textMassege.setFont(new Font("Dialog", Font.PLAIN,  14));
		
		chatingBox.add(sendMessageBtn);
		sendMessageBtn.setSize(60, 30);
		sendMessageBtn.setLocation(330, 430);
		sendMessageBtn.setFont(new Font("Dialog", Font.PLAIN,  12));
	
		chatingBox.add(chatingLog);
		chatingLog.setSize(380, 370);
		chatingLog.setLocation(10, 40);
		chatingLog.setLineWrap(true);
		chatingLog.setWrapStyleWord(true);
		chatingLog.setEditable(false);
		
		// 방 들어가기 클릭시 생성
		chatingLog.setText("『 "+ userName + "』 님이 입장하셨습니다." );
		
		chatingBox.add(roomName);
		roomName.setSize(380, 20);
		roomName.setLocation(10, 10);
		roomName.setFont(new Font("Dialog", Font.BOLD,  14));
		
		add(outRoomBtn);
		outRoomBtn.setSize(100, 40);
		outRoomBtn.setLocation(340, 80);
		
		
		add(chatingBox);
		chatingBox.setSize(400, 480);
		chatingBox.setLocation(40, 120);
		chatingBox.setBackground(whiteOp);
		chatingBox.setLayout(null);
		
		add(background);
		
		repaint();
	}
	
	public void whisper() {
		
	}
	
	private void setInitLayiut() {
		setVisible(true);
		setLayout(null); 
		setResizable(false);
		setLocationRelativeTo(null); 
		
		add(title);
		title.setSize(WIDTH, 50);
		title.setFont(new Font("Dialog", Font.BOLD, 30));
		title.setForeground(Color.WHITE);
		title.setHorizontalAlignment(JLabel.CENTER);
		title.setOpaque(true);
		title.setBackground(Color.PINK);
		
		add(waitingBtn);
		waitingBtn.setSize(100, 40);
		waitingBtn.setLocation(40, 80);
		
		add(chatingBtn);
		chatingBtn.setSize(100, 40);
		chatingBtn.setLocation(140, 80);
		
		add(whisperBtn);
		whisperBtn.setSize(100,40);
		whisperBtn.setLocation(240,80);
		
		add(exitBtn);
		exitBtn.setSize(100,40);
		exitBtn.setLocation(340,80);
		
		background.setSize(WIDTH, HEIGHT);
		background.setLocation(0, 0);
		background.setBackground(Color.black);
		
	}


	private void addEventListenter() {
		waitingBtn.addActionListener(this);
		chatingBtn.addActionListener(this);
		sendMessageBtn.addActionListener(this);
		whisperBtn.addActionListener(this);
		joinRoomBtn.addActionListener(this);
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == waitingBtn) {
			waitingRoom();
			remove(chatingBox);
			if(e.getSource() == creatRoomBtn) {
				// 방만들기 버튼
			} else if (e.getSource() == joinRoomBtn) {
				// 방 참여하기 버튼
			}
		}else if(e.getSource() == chatingBtn) {
			chatingRoom();
			remove(waitingBox);
			
			
		}else if(e.getSource() == whisperBtn) {
			// 귓속말
			
		} else if(e.getSource() == sendMessageBtn) {
			
			// chatingLog.append(textMassege.getText());
			// 약속 
			client.sendMessage("chat/" +textMassege.getText());
//			textMassege.setText("");
			// 1. 방입장/방이름/유저이름
			// 2. chat/방이름/보낸새람/대화내용
		}
		
		
	}


	public Client getClient() {
		return client;
	}


	public void setClient(Client client) {
		this.client = client;
	}


	public ChatGUI getChatGUIContext() {
		return chatGUIContext;
	}


	public void setChatGUIContext(ChatGUI chatGUIContext) {
		this.chatGUIContext = chatGUIContext;
	}


	public void setBackground(JPanel background) {
		this.background = background;
	}


	public void setTitle(JLabel title) {
		this.title = title;
	}


	public JButton getWaitingBtn() {
		return waitingBtn;
	}


	public void setWaitingBtn(JButton waitingBtn) {
		this.waitingBtn = waitingBtn;
	}


	public JButton getChatingBtn() {
		return chatingBtn;
	}


	public void setChatingBtn(JButton chatingBtn) {
		this.chatingBtn = chatingBtn;
	}


	public JPanel getWaitingBox() {
		return waitingBox;
	}


	public void setWaitingBox(JPanel waitingBox) {
		this.waitingBox = waitingBox;
	}


	public JLabel getTotalUsersTitle() {
		return totalUsersTitle;
	}


	public void setTotalUsersTitle(JLabel totalUsersTitle) {
		this.totalUsersTitle = totalUsersTitle;
	}




	public JPanel getChatingBox() {
		return chatingBox;
	}


	public void setChatingBox(JPanel chatingBox) {
		this.chatingBox = chatingBox;
	}


	public JLabel getTotalRoomsTitle() {
		return totalRoomsTitle;
	}


	public void setTotalRoomsTitle(JLabel totalRoomsTitle) {
		this.totalRoomsTitle = totalRoomsTitle;
	}




	public JButton getCreatRoomBtn() {
		return creatRoomBtn;
	}


	public void setCreatRoomBtn(JButton creatRoomBtn) {
		this.creatRoomBtn = creatRoomBtn;
	}


	public JButton getJoinRoomBtn() {
		return joinRoomBtn;
	}


	public void setJoinRoomBtn(JButton joinRoomBtn) {
		this.joinRoomBtn = joinRoomBtn;
	}


	public JButton getOutRoomBtn() {
		return outRoomBtn;
	}


	public void setOutRoomBtn(JButton outRoomBtn) {
		this.outRoomBtn = outRoomBtn;
	}


	public JButton getRemoveRoomBtn() {
		return removeRoomBtn;
	}


	public void setRemoveRoomBtn(JButton removeRoomBtn) {
		this.removeRoomBtn = removeRoomBtn;
	}


	public JButton getWhisperBtn() {
		return whisperBtn;
	}


	public void setWhisperBtn(JButton whisperBtn) {
		this.whisperBtn = whisperBtn;
	}


	public JButton getExitBtn() {
		return exitBtn;
	}


	public void setExitBtn(JButton exitBtn) {
		this.exitBtn = exitBtn;
	}


	public JTextArea getTextMassege() {
		return textMassege;
	}


	public void setTextMassege(JTextArea textMassege) {
		this.textMassege = textMassege;
	}


	public JTextArea getChatingLog() {
		return chatingLog;
	}


	public void setChatingLog(JTextArea chatingLog) {
		this.chatingLog = chatingLog;
	}


	public JButton getSendMessageBtn() {
		return sendMessageBtn;
	}


	public void setSendMessageBtn(JButton sendMessageBtn) {
		this.sendMessageBtn = sendMessageBtn;
	}


	public JLabel getRoomName() {
		return roomName;
	}


	public void setRoomName(JLabel roomName) {
		this.roomName = roomName;
	}


	public JLabel getUserNameLabel() {
		return userNameLabel;
	}


	public void setUserNameLabel(JLabel userNameLabel) {
		this.userNameLabel = userNameLabel;
	}


	public String getUserName() {
		return userName;
	}


	public void setUserName(String userName) {
		this.userName = userName;
	}


	public String getIp() {
		return ip;
	}


	public void setIp(String ip) {
		this.ip = ip;
	}


	public String getPort() {
		return port;
	}


	public void setPort(String port) {
		this.port = port;
	}


	public Color getWhiteOp() {
		return whiteOp;
	}


	public void setWhiteOp(Color whiteOp) {
		this.whiteOp = whiteOp;
	}


	public Color getWhiteOp100() {
		return whiteOp100;
	}


	public void setWhiteOp100(Color whiteOp100) {
		this.whiteOp100 = whiteOp100;
	}


	public int getWIDTH() {
		return WIDTH;
	}


	public int getHEIGHT() {
		return HEIGHT;
	}

	public JList getShowUserList() {
		return showUserList;
	}


	public void setShowUserList(JList showUserList) {
		this.showUserList = showUserList;
	}


	public JList getShowRoomList() {
		return showRoomList;
	}


	public void setShowRoomList(JList showRoomList) {
		this.showRoomList = showRoomList;
	}

	
}
