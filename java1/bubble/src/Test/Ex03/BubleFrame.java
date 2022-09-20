package Test.Ex03;

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

		new Thread(new BackgroundPlayerService(player)).start();
		// 어떤 색상인지 구분하는걸 확인할 수 있다.
	}

	private void initData() {
		backgroundMap = new JLabel(new ImageIcon("Images/test.png"));
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

			@Override
			public void keyReleased(KeyEvent e) {
				switch (e.getKeyCode()) {
				case KeyEvent.VK_LEFT:
					// 멈춤
					player.setLeft(false);
					break;
				case KeyEvent.VK_RIGHT:
					// 멈춤
					player.setRight(false);
					break;
				case KeyEvent.VK_UP:

					// 멈춤
					break;

				default:
					break;
				}
			}
		});
	}

	public static void main(String[] args) {
		new BubleFrame();
	}

}
