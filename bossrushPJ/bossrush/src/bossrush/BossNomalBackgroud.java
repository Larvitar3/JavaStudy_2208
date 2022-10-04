package bossrush;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class BossNomalBackgroud extends JFrame {

	private JPanel backroundimg;
	private BossNomal bossNomal;
	
	public BossNomalBackgroud() {
		initData();
		System.out.println("11111");
		setInitLayout();

		
	}
	
	
	private void initData() {
		setSize(1000, 700);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		backroundimg = new JPanel();
		bossNomal = new BossNomal();
	}


	private void setInitLayout() {
		
		setVisible(true);
		setLayout(null);
		setResizable(false);
		setLocationRelativeTo(null);
		add(backroundimg);
		add(bossNomal);

		
		
	}

	
}
