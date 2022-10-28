package ch_05.gui;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ClientGUI extends JFrame implements ActionListener {

	
	ClientGUI mContext = this;
	private JPanel background;
	private JLabel title;
	private JLabel titleIp;
	private JTextField inputIp;
	private JLabel titleHost;
	private JTextField inputHost;   
	private JLabel titleUserName;
	private JTextField inputUserName;
	private JButton connectBtn;

	private final int WIDTH = 500;
	private final int HEIGHT = 680;

	public ClientGUI() {
		initData();
		setInitLayiut();
		addEventListenter();

	}

	private void initData() {
		setSize(WIDTH, HEIGHT);
		setTitle("Live Chat");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		background = new JPanel();
		title = new JLabel("◎ Live Chat ◎");
		titleIp = new JLabel("▶ IP ");
		inputIp = new JTextField("127.0.0.1");
		titleHost = new JLabel("▶ PORT");
		inputHost = new JTextField("20000");
		titleUserName = new JLabel("▶ UserName");
		inputUserName = new JTextField();
		connectBtn = new JButton("접속하기");
	}

	private void setInitLayiut() {
		setVisible(true);
		setLayout(null);
		setResizable(false);
		setLocationRelativeTo(null);

		add(title);
		title.setSize(WIDTH, 150);
		title.setFont(new Font("Dialog", Font.BOLD, 50));
		title.setForeground(Color.WHITE);
		title.setHorizontalAlignment(JLabel.CENTER);
		title.setOpaque(true);
		title.setBackground(Color.PINK);

		add(titleIp);
		titleIp.setSize(300, 30);
		titleIp.setLocation(100, 200);
		titleIp.setFont(new Font("Dialog", Font.BOLD, 20));
		titleIp.setForeground(Color.white);

		add(inputIp);
		inputIp.setSize(300, 40);
		inputIp.setLocation(100, 240);
		inputIp.setFont(new Font("Dialog", Font.BOLD, 20));

		add(titleHost);
		titleHost.setSize(300, 30);
		titleHost.setLocation(100, 310);
		titleHost.setFont(new Font("Dialog", Font.BOLD, 20));
		titleHost.setForeground(Color.white);

		add(inputHost);
		inputHost.setSize(300, 40);
		inputHost.setLocation(100, 350);
		inputHost.setFont(new Font("Dialog", Font.BOLD, 20));

		add(titleUserName);
		titleUserName.setSize(300, 30);
		titleUserName.setLocation(100, 420);
		titleUserName.setFont(new Font("Dialog", Font.BOLD, 20));
		titleUserName.setForeground(Color.white);

		add(inputUserName);
		inputUserName.setSize(300, 40);
		inputUserName.setLocation(100, 460);
		inputUserName.setFont(new Font("Dialog", Font.BOLD, 20));
		inputUserName.setColumns(10);

		add(connectBtn);
		connectBtn.setSize(300, 40);
		connectBtn.setLocation(100, 550);

		add(background);
		background.setSize(WIDTH, HEIGHT);
		background.setLocation(0, 0);
		background.setBackground(Color.black);

	}

	private void addEventListenter() {
		connectBtn.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		if (connectBtn == e.getSource()) {
			
			if(inputIp.getText().length() == 0) {
				JOptionPane.showMessageDialog(null, "IP 값을 입력하세요,");
			}else if(inputHost.getText().length() == 0) {
				JOptionPane.showMessageDialog(null, "HOST 값을 입력하세요,");
			}else if(inputUserName.getText().length() == 0) {
				JOptionPane.showMessageDialog(null, "이름을 입력하세요,");
			}else {
				setVisible(true);
				dispose();
				new ChatGUI(inputIp.getText(), inputHost.getText(), inputUserName.getText());
			}
			
			
		}
		
		

	}

	public static void main(String[] args) {
		new ClientGUI();
	}

	public ClientGUI getmContext() {
		return mContext;
	}

	public void setmContext(ClientGUI mContext) {
		this.mContext = mContext;
	}


	public void setBackground(JPanel background) {
		this.background = background;
	}

	public void setTitle(JLabel title) {
		this.title = title;
	}

	public JLabel getTitleIp() {
		return titleIp;
	}

	public void setTitleIp(JLabel titleIp) {
		this.titleIp = titleIp;
	}

	public JTextField getInputIp() {
		return inputIp;
	}

	public void setInputIp(JTextField inputIp) {
		this.inputIp = inputIp;
	}

	public JLabel getTitleHost() {
		return titleHost;
	}

	public void setTitleHost(JLabel titleHost) {
		this.titleHost = titleHost;
	}

	public JTextField getInputHost() {
		return inputHost;
	}

	public void setInputHost(JTextField inputHost) {
		this.inputHost = inputHost;
	}

	public JLabel getTitleUserName() {
		return titleUserName;
	}

	public void setTitleUserName(JLabel titleUserName) {
		this.titleUserName = titleUserName;
	}

	public JTextField getInputUserName() {
		return inputUserName;
	}

	public void setInputUserName(JTextField inputUserName) {
		this.inputUserName = inputUserName;
	}

	public JButton getConnectBtn() {
		return connectBtn;
	}

	public void setConnectBtn(JButton connectBtn) {
		this.connectBtn = connectBtn;
	}

	public int getWIDTH() {
		return WIDTH;
	}

	public int getHEIGHT() {
		return HEIGHT;
	}

}
