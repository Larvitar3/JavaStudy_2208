package bossrush;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class BossNomal extends JLabel {

	int hp = 2000;
	int power = 50;
	String name;

	private final int BOSS_WIDTH = 293;
	private final int BOSS_HEIGHT = 590;

	private int x = 700;
	private int y = 55;

	private ImageIcon boss;

	public BossNomal() {
		initData();
		setInitLayout();
	}

	private void initData() {
		boss = new ImageIcon("Images/bossImage.png");
//		System.out.println("보스 소환");
	}

	private void setInitLayout() {
		setIcon(boss);
		setSize(BOSS_WIDTH, BOSS_HEIGHT);
		setLocation(x, y);
	}

	public void attack() {

	}

	public void beAttack() {

	}

	public void die() {
	}

}
