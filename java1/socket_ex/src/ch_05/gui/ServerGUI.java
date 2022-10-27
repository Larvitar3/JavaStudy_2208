package ch_05.gui;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class ServerGUI extends JFrame implements ActionListener {

	private JPanel background;
	private JLabel title;
	private JTextArea serverLog;
	private JButton connectBtn;

	private JLabel titleHost;
	private JTextField inputHost;

	private final int WIDTH = 500;
	private final int HEIGHT = 680;

	public ServerGUI() {
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
		titleHost = new JLabel("▼ PORT ▼");
		inputHost = new JTextField("12644");
		serverLog = new JTextArea("server log ------");
		connectBtn = new JButton("접속하기");

	}

	private void serverLog() {

		add(serverLog);
		serverLog.setSize(400, 390);
		serverLog.setLocation(50, 200);
		serverLog.setFont(new Font("Dialog", Font.PLAIN, 14));
		
		repaint();
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

		add(titleHost);
		titleHost.setSize(300, 30);
		titleHost.setLocation(100, 310);
		titleHost.setFont(new Font("Dialog", Font.BOLD, 20));
		titleHost.setForeground(Color.white);
		titleHost.setHorizontalAlignment(JLabel.CENTER);

		add(inputHost);
		inputHost.setSize(300, 40);
		inputHost.setLocation(100, 350);
		inputHost.setFont(new Font("Dialog", Font.BOLD, 20));

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
	
	// dispose() 

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == connectBtn) {
			serverLog();
			remove(inputHost);
			remove(titleHost);
			remove(background);
			remove(connectBtn);
		}

	}

	public static void main(String[] args) {
		new ServerGUI();
	}

}