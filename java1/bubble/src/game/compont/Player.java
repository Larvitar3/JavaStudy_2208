package game.compont;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

import game.BubbleFrame;
import game.interfaces.Moveable;
import game.service.BackgroundPlayerService;
import game.stat.PlayerWay;
import lombok.Getter;
import lombok.Setter;

// new가 가능 : 게임에 존재 (추상메서드를 가질 수 없다.)
@Getter
@Setter
public class Player extends JLabel implements Moveable {

	BubbleFrame mContext;

	// player 위치 상태
	private int x;
	private int y;

	// 움직임 상태
	private boolean left;
	private boolean right;
	private boolean up;
	private boolean down;

	// 플레이어의 방향 상태
	PlayerWay pWay;

	// 벽에 충돌한 상태
	private boolean leftWallCrash;
	private boolean rightWallCrash;

	// 플레이어의 속도 상태
	private final int SPEED = 4;
	private final int JUMPSPEED = 2;

	private ImageIcon playerR, playerL, playerRdie, playerLdie;

	private int state = 0;
	// 0번 살아있음 1번 죽음

	public Player(BubbleFrame mContext) {
		this.mContext = mContext;
		initData();
		setInitLayout();

		new Thread(new BackgroundPlayerService(this)).start();
		// 어떤 색상인지 구분하는걸 확인할 수 있다.

	}

	private void initData() {

		playerR = new ImageIcon("Images/playerR.png");
		playerL = new ImageIcon("Images/playerL.png");
		playerLdie = new ImageIcon("Images/playerLDie.png");
		playerRdie = new ImageIcon("Images/playerRDie.png");

		x = 400;
		y = 535;
		left = false;
		right = false;
		up = false;
		down = false;

	}

	private void setInitLayout() {

		setIcon(playerR);
		pWay = PlayerWay.RIGHT;
		pWay = PlayerWay.LEFT;
		setSize(50, 50);
		setLocation(x, y);
	}

	@Override
	public void left() {

		this.pWay = PlayerWay.LEFT;
		left = true;
		new Thread(new Runnable() {

			@Override
			public void run() {
				while (left && state == 0) {
					setIcon(playerL);
					x -= SPEED;
					setLocation(x, y);

					try {
						Thread.sleep(10);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		}).start();

	}

	@Override
	public void right() {

		this.pWay = PlayerWay.RIGHT;
		right = true;

		new Thread(new Runnable() {

			@Override
			public void run() {

				while (right && state == 0) {
					setIcon(playerR);
					x += SPEED;
					setLocation(x, y);

					try {
						Thread.sleep(10);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		}).start();

	}

	@Override
	public void up() {
		System.out.println("점프");
		up = true;
		new Thread(new Runnable() {

			@Override
			public void run() {
				
				if (state == 0) {
					for (int i = 0; i < 130 / JUMPSPEED; i++) {
						y -= JUMPSPEED;
						setLocation(x, y);
						try {
							Thread.sleep(5);
						} catch (InterruptedException e) {
							e.printStackTrace();
						}

					}
					up = false;
					down();
				}
				
			}
		}).start();

	}

	@Override
	public void down() {
		down = true;
		new Thread(new Runnable() {

			@Override
			public void run() {

				while (down) {
					y = y + JUMPSPEED;
					setLocation(x, y);
					try {
						Thread.sleep(3);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				down = false;
			}
		}).start();
	}

	public void attack() {

		new Thread(() -> {

			Bubble bubble = new Bubble(mContext);
			mContext.add(bubble);
			if (pWay == PlayerWay.LEFT) {
				bubble.left();
			} else {
				bubble.right();
			}

		}).start();

	}

	public void die() {
		new Thread(() -> {
			System.out.println("=====================");
			setState(1);
			setIcon(PlayerWay.RIGHT == pWay ? playerRdie : playerLdie);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			mContext.remove(this); // 프레임에서 지우기
			mContext.repaint();
			System.out.println("플레이어 사망");

		}).start();

	}

}
