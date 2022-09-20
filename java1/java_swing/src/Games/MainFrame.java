package Games;

import java.awt.Graphics;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MainFrame extends JFrame {

	BufferedImage background;
	BufferedImage player;
	BufferedImage player2;
	imagePanel imPanel;

	int playerX = 200;
	int playerY = 200;
	int player2X = 0;
	int player2Y = 280;

	public MainFrame() {
		initData();
		setInitLayout();
		addEventListener();

		Thread thread = new Thread(imPanel);
		thread.start();
	}

	private void initData() {
		setTitle("Thread를 이용한 미니게임");
		setSize(600, 600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		try {
			background = ImageIO.read(new File("Images/background1.jpg"));
			player = ImageIO.read(new File("Images/player1.png"));
			player2 = ImageIO.read(new File("Images/player2.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		imPanel = new imagePanel();
	}

	private void setInitLayout() {
		setVisible(true);
		setResizable(false);
		add(imPanel);
	}

	private void addEventListener() {
		// 키보드 이벤트
		this.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				int code = e.getKeyCode();
				if (code == KeyEvent.VK_UP) {
					playerY -= 10;
				} else if (code == KeyEvent.VK_DOWN) {
					playerY += 10;
				} else if (code == KeyEvent.VK_LEFT) {
					playerX -= 10;
				} else if (code == KeyEvent.VK_RIGHT) {
					playerX += 10;
				}
//				repaint();
			}

		});
	}

// 내부 클래스
	private class imagePanel extends JPanel implements Runnable {

		@Override
		protected void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.drawImage(background, 0, 0, getWidth(), getHeight(), null);
			g.drawImage(player, playerX, playerY, 100, 130, null);
			g.drawImage(player2, player2X, player2Y, 140, 170, null);
		}

		@Override
		public void run() {
			// true = 오른쪽으로 가는 상황
			// flase = 왼쪽으로 가는 상황

			boolean direction = true;
			boolean flag = true;
			// 1. 왔다갔다 반복 처리
			while (flag) {
				// 만약 direction이 true면 증가
				// false면 x좌표를 감소
				if (direction == true) {
					player2X += 10;
				} else {
					player2X -= 10;
				}
				
//				if (direction == true) {
//					playerY += 10;
//				}else {
//					playerY -= 10;
//				}
				// 만약 x 좌표가 500보다 크다면 direction false변경
				// 만약 x 좌표가 500보다 작다면 direction true로 변경
				if (player2X == 500) {
					direction = false;
				}
				if (player2X == 0) {
					direction = true;
				}
//				if (playerY == 500) {
//					direction = false;
//				}
//				if (playerY == 0) {
//					direction = true;
//				}
				try {
					Thread.sleep(20);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

				if(playerX == player2X && playerY == player2Y) {
					player = null;
				}
				
				// + 10 이동 후 그리기를 반복
				repaint();
			}

		}

	}

	public static void main(String[] args) {
		MainFrame frame = new MainFrame();

	}

}
