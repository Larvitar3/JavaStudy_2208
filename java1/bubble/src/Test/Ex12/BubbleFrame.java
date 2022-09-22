package Test.Ex12;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

import lombok.Getter;

@Getter
public class BubbleFrame extends JFrame {
	
	private BubbleFrame mContext = this;

	// 포함관계 (컴포지션)
	private JLabel backgroundMap;
	private Player player;
	private Enemy enemy;

	public BubbleFrame() {
		initData();
		setInitLayiut();
		addEventListenter();
		
	//	enemy.left();
	}

	private void initData() {
		backgroundMap = new JLabel(new ImageIcon("Images/backgroundMap.png"));
		setContentPane(backgroundMap);
		setSize(1000, 640);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		player = new Player(mContext);
		enemy = new Enemy(mContext);
	}

	private void setInitLayiut() {
		setVisible(true);
		setLayout(null); // absoult 레이아웃
		setResizable(false);
		setLocationRelativeTo(null); // JFrame 가운데 배치

		add(player);
		add(enemy);
		enemy.left();
	}

	private void addEventListenter() {
		this.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {

				switch (e.getKeyCode()) {
				case KeyEvent.VK_LEFT:

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
					player.attack();					
					System.out.println("버블");
					break;

				}
			}
		});
	}

	// 메인함수가 있는 코드는 모든 객체드르이 주소 값을 알 수 있다.
	public static void main(String[] args) {
		new BubbleFrame();
	}

}
