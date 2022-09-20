package Test.Ex01;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class BubleFrame extends JFrame {

	// 포함관계 (컴포지션)
	private JLabel backgroundMap;
	private Player player;

	public BubleFrame() {
		initData();
		setInitLayiut();
		addEventListenter();
	}

	private void initData() {
		backgroundMap = new JLabel(new ImageIcon("Images/backgroundMap.png"));
		setContentPane(backgroundMap);
		setSize(1000, 640);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		player = new Player();
	}

	private void setInitLayiut() {
		setVisible(true);
		setLayout(null); // absoult 레이아웃
		setResizable(false);
		setLocationRelativeTo(null); // JFrame 가운데 배치

		add(player);
	}

	private void addEventListenter() {
		this.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {

				switch (e.getKeyCode()) {
				case KeyEvent.VK_LEFT:
					player.left();
					break;
				case KeyEvent.VK_RIGHT:
					player.right();
					break;
				case KeyEvent.VK_UP:
					player.up();
					break;
				}

			}
		});
	}

	public static void main(String[] args) {
		new BubleFrame();
	}

}
