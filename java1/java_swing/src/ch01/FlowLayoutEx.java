package ch01;

import javax.swing.JButton;
import javax.swing.JFrame;

public class FlowLayoutEx extends JFrame{

	JButton button1;
	
	public FlowLayoutEx() {
		setTitle("버튼 배치해보기");
		setSize(300, 300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		
		button1 = new JButton("button1");
		add(button1);
	}
	
	public static void main(String[] args) {
		
		new FlowLayoutEx();
		
	}// end of main
	
	
}
