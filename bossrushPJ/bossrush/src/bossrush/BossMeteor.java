package bossrush;

import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class BossMeteor extends JLabel {

	Random random = new Random();

	private int meteors;
	private int time;

	private BossFrame bossFrame;

	BossNomal bossNomal;

	private int x;
	private int y;

	private final int BOSSMETEOR_WIDTH = 89;
	private final int BOSSMETEOR_HEIGHT = 80;

	private ImageIcon bossMeteor1;

	private boolean left;

	public BossMeteor() {
		initData();
		setInitLayout();
	}

	private void initData() {

		bossMeteor1 = new ImageIcon("Images/bossAttack.png");
		bossNomal = new BossNomal();
		left = false;

		meteors = random.nextInt(500);
		time = random.nextInt(10000);

	}

	private void setInitLayout() {

		x = 800;
		y = meteors;

		setLocation(x, y);
		setIcon(bossMeteor1);

		setSize(BOSSMETEOR_WIDTH, BOSSMETEOR_HEIGHT);
	}

	public void left() {
		left = true;
		new Thread(() -> {
			try {
				Thread.sleep(time);
			} catch (InterruptedException e1) {
				e1.printStackTrace();
			}

			while (left) {
				x -= 1;
				setLocation(x, y);

				try {
					Thread.sleep(5);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				if (x <= -50) {
					x = 1100;
					y = random.nextInt(600);
					setLocation(x, y);
					setIcon(bossMeteor1);
				}
			}
		}).start();

	}

}
