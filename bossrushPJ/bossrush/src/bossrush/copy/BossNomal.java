package bossrush.copy;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class BossNomal extends JLabel{
	
	int hp = 2000;
	int power = 50;
	String name;
	
	private final int BOSS_WIDTH = 293;
	private final int BOSS_HEIGHT = 590;
	
	private int x = 700;
	private int y = 55;
	
	
	
	public int getHp() {
		return hp;
	}


	public void setHp(int hp) {
		this.hp = hp;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public ImageIcon getBoss() {
		return boss;
	}


	public void setBoss(ImageIcon boss) {
		this.boss = boss;
	}


	public int getBOSS_WIDTH() {
		return BOSS_WIDTH;
	}


	public int getBOSS_HEIGHT() {
		return BOSS_HEIGHT;
	}


	public int getX() {
		return x;
	}


	public void setX(int x) {
		this.x = x;
	}


	public int getY() {
		return y;
	}


	public void setY(int y) {
		this.y = y;
	}


	private ImageIcon boss;
	
	public BossNomal() {
		initData();
		setInitLayout();
	}


	private void initData() {
		boss = new ImageIcon("Images/bossImage.png");
		System.out.println("보스 소환");
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
