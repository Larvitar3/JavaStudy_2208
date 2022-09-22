package Test.test;

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
					// 1. 플레이어가 왼쪽으로 가고있지 않을때 player.left 실행해야한다.
					// 2. 왼쪽벽에 맞닿아 있으면 left() 메서드를 실행시키면 안된다.
					if (!player.isLeft()) {
						player.left();
					}

					break;
				case KeyEvent.VK_RIGHT:
					if (!player.isRight()) {
						player.right();
					}
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
				case KeyEvent.VK_SPACE:
					// 스페이스바 사용 시 버블 생성
					Bubble bubble = new Bubble(player);
					add(bubble);
					System.out.println("버블");
					break;

				}
			}
		});
	}

	public static void main(String[] args) {
		new BubleFrame();
	}

}
