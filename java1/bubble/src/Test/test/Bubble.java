package Test.test;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class Bubble extends JLabel implements Moveable {

	// 의존성 컴포지션 상태
	Player player;

	// 버블의 위치 상태
	private int x;
	private int y;

	// 움직임 상태
	private boolean left;
	private boolean right;
	private boolean up;

	// 적군을 맞춘 상태
	private int state; // 0(일반 물방울), 1(적을 가둔 물방울)

	private ImageIcon bubble; // 물방울
	private ImageIcon bubbled; // 적을 가둔 물방울
	private ImageIcon bomb; // 물방울이 터진 상태

	public Bubble(Player player) {
		this.player = player;
		initData();
		setInitLayout();
		initThread();
	}

	private void initData() {
		bubble = new ImageIcon("Images/bubble.png");
		bubbled = new ImageIcon("Images/bubbled.png");
		bomb = new ImageIcon("Images/bomb.png");

		left = false;
		right = false;
		up = false;
		state = 0;
	}

	private void setInitLayout() {
		// 플레이어가 있는 위치에서 태어나야한다.
		x = player.getX();
		y = player.getY();
		setIcon(bubble);
		setSize(50, 50);
		setLocation(x, y);
	}

	private void initThread() {
		new Thread(new Runnable() {
			@Override
			public void run() {
				if(player.getPWay() == PlayerWay.LEFT) {
					left();
				}else {
					right();
				}
	
			
			}
		}).start();

		// 람다 표현식
		new Thread(() -> {
			
		}).start();
	}

	@Override
	public void left() {

		left = true;
		
		for (int i = 0; i < 400; i++) {
			x--;
			setLocation(x, y);
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	@Override
	public void right() {
		
		right = true;

		for (int i = 0; i < 400; i++) {
			x++;
			setLocation(x, y);
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		}

	}

	@Override
	public void up() {

	}

}
