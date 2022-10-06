package bossrush;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

<<<<<<< HEAD
public class BossNomal extends JLabel{
	
	int hp;
	String name;
	
	private final int BOSS_WIDTH = 293;
	private final int BOSS_HEIGHT = 590;
	
	private final int BOSS_X = 700;
	private final int BOSS_Y = 55;
	
	
	
	private ImageIcon boss;
	
=======
public class BossNomal extends JLabel {

	int hp = 2000;
	int power = 50;
	String name;

	private final int BOSS_WIDTH = 293;
	private final int BOSS_HEIGHT = 590;

	private int x = 700;
	private int y = 55;

	private ImageIcon boss;

>>>>>>> bdc4cf1baec25153c4428693d00b7c08bb6e8721
	public BossNomal() {
		initData();
		setInitLayout();
	}

<<<<<<< HEAD

	private void initData() {
		boss = new ImageIcon("Images/bossImage.png");
		System.out.println("보스 소환");
	}

	
	private void setInitLayout() {

		setIcon(boss);
		setSize(BOSS_WIDTH, BOSS_HEIGHT);
		setLocation(BOSS_X, BOSS_Y);
		
	}
	
	
	public void attack() {
		
	}
	
	public void beAttack() {
		
	}
	
	public void die() {
		
	}
	
	
	
=======
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

>>>>>>> bdc4cf1baec25153c4428693d00b7c08bb6e8721
}
