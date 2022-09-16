package ch05;

import java.awt.Rectangle;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.event.MouseInputListener;

public class MouesEventListenerEx2 extends JFrame {

	JLabel label;
	final int LABEL_WIDTH = 100;
	final int LABEL_HEIGHT = 100;

	int xPosition = 100;
	int yPosition = 100;
	

	public MouesEventListenerEx2() {
		initData();
		setInitLayout();
		addEventListener();
	}

	private void initData() {
		setSize(500, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		label = new JLabel("Hello, Java");
	}

	private void setInitLayout() {
		setVisible(true);
		setLayout(null);

//		// 사이즈 좌표값 위치
//  	label.setSize(100, 100);
//		label.setLocation(100, 100);
		label.setBounds(xPosition, yPosition, LABEL_WIDTH, LABEL_HEIGHT);

		add(label);

	}

	private void addEventListener() {
		
		
		
		this.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent e) {
			// 마우스 버튼이 눌러졌다가 떨어졌을 때 실행되는 메소드	
				System.out.println("1");
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				// 마우스를 눌렀을 때
				System.out.println("2");
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				// 마우스가 감지하고있는 객체에 나갔을 때
				System.out.println("3");
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				// 마우스가 감지하고있는 객체에 들어왔을 때
				System.out.println("4");
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				// 마우스가 클릭될때
				System.out.println("5");
				label.setLocation(e.getX(), e.getY() -label.getBounds().height);
			}
		});
	}
public static void main(String[] args) {
	new MouesEventListenerEx2();
}
	
	
}
