package Games;

import java.awt.Event;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MainFrame2 extends JFrame implements ActionListener {

	BufferedImage background;
	BufferedImage player;
	BufferedImage player2;
	imagePanel imPanel;
	JButton startBtn;
	JButton endBtn;
	boolean direction = true;
	boolean flag = true;

	int playerX = 250;
	int playerY = 0;
	int player2X = 0;
	int player2Y = 280;

	public MainFrame2() {
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
			e.printStackTrace();
		}
		imPanel = new imagePanel();
		startBtn = new JButton("시작");
		endBtn = new JButton("종료");
	}

	private void setInitLayout() {
		setLayout(null);
		setVisible(true);
		setResizable(false);
		add(imPanel);
		imPanel.setSize(600, 480);
		imPanel.setLocation(0, 0);

		add(startBtn);
		startBtn.setSize(300, 80);
		startBtn.setLocation(0, 480);
		startBtn.setFont(new Font("sanSerif", Font.BOLD, 20));

		add(endBtn);
		endBtn.setSize(300, 80);
		endBtn.setLocation(300, 480);
		endBtn.setFont(new Font("sanSerif", Font.BOLD, 20));
	}

	private void addEventListener() {
		startBtn.addActionListener(this);
		endBtn.addActionListener(this);

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
				} else if (code == KeyEvent.VK_SPACE) {
					flag = !flag;
					if (flag == false) {

					} else {
						new Thread(imPanel).start();
					}
				}

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

			while (flag) {
				if (flag) {
					if (direction == true) {
						player2X += 10;
						playerY += 10;
					} else {
						player2X -= 10;
						playerY -= 10;
					}

					if (player2X == 450) {
						direction = false;
					}
					if (player2X == 0) {
						direction = true;
					}

					try {
						Thread.sleep(20);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					repaint();
				} // end of if
			} // end of while
		} // end of run

	} // end of panel

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == endBtn) {
			System.out.println("종료버튼 클릭");
			flag = false;
		}

		if (e.getSource() == startBtn) {
			System.out.println("시작버튼 클릭");

		}

	}

	public static void main(String[] args) {
		MainFrame2 frame = new MainFrame2();

	}

}
