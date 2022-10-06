package bossrush;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

<<<<<<< HEAD
public class BossFrame extends JFrame{
	
	private JLabel backgroundMapImage;
	private BossNomal boss;
	
=======
public class BossFrame extends JFrame {

	private JLabel backgroundMapImage;
	private BossNomal boss;
//	private BossMeteor bossMeteor;

	BossMeteor[] bossMeteors = new BossMeteor[10];

>>>>>>> bdc4cf1baec25153c4428693d00b7c08bb6e8721
	public BossFrame() {
		initData();
		setInitLayout();
		addEventListenter();
<<<<<<< HEAD
=======

		for (int i = 0; i < bossMeteors.length; i++) {
			bossMeteors[i].left();
		}
>>>>>>> bdc4cf1baec25153c4428693d00b7c08bb6e8721
	}

	private void initData() {
		backgroundMapImage = new JLabel(new ImageIcon("Images/bossBackgroudMap.jpg"));
		setContentPane(backgroundMapImage);
		setSize(1000, 700);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
<<<<<<< HEAD
		
		boss =  new BossNomal();
=======

		boss = new BossNomal();
>>>>>>> bdc4cf1baec25153c4428693d00b7c08bb6e8721
	}

	private void setInitLayout() {
		setVisible(true);
		setLayout(null);
		setResizable(false);
		setLocationRelativeTo(null);
<<<<<<< HEAD
		
		add(boss);
		
	}

	private void addEventListenter() {
		
	}
	
	public static void main(String[] args) {
		new BossFrame();
	}
	
	
=======

		add(boss);
		for (int i = 0; i < bossMeteors.length; i++) {
			bossMeteors[i] = new BossMeteor();
			System.out.println("슝");
			add(bossMeteors[i]);
		}
		for (int i = 0; i < bossMeteors.length; i++) {
		}
	}

	private void addEventListenter() {

	}

	public static void main(String[] args) {
		new BossFrame();
	}

>>>>>>> bdc4cf1baec25153c4428693d00b7c08bb6e8721
}
