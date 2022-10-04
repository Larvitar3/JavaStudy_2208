package bossrush.copy;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class BossMeteor extends JLabel {

	private BossFrame bossFrame;

	BossNomal bossNomal;

	private int x;
	private int y;

	private final int BOSSMETEOR_WIDTH = 89;
	private final int BOSSMETEOR_HEIGHT = 80;

	private ImageIcon bossMeteor;

	private boolean left;

	public BossMeteor() {
		initData();
		setInitLayout();
	}

	private void initData() {

		bossMeteor = new ImageIcon("Images/bossAttack.png");
		bossNomal = new BossNomal();
		left = false;

	}

	private void setInitLayout() {

		x = 800;
		y = 500;

		setIcon(bossMeteor);

		setSize(BOSSMETEOR_WIDTH, BOSSMETEOR_HEIGHT);
		setLocation(x, y);
	}

	public void left() {
		left = true;
		new Thread(() -> {
			try {
				Thread.sleep(10);
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
			}
		}).start();

	}

}
