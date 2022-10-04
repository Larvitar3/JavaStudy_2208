package callback_ex;

import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;

// 콜백 받는 객체 : OnCallBackButtonAction 구현해서 메서드를 정의
public class MainActivity extends JFrame implements OnCallBackButtonAction{

	int count;
	JLabel label;
	SubActivity subActivity;
	
	public MainActivity() {
		count = 0;
		label = new JLabel(count + "");
		setLayout(new FlowLayout());
		add(label);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		setSize(500, 500);
		subActivity = new SubActivity(this);
	}
	
	public void addCount() {
		count++;
		label.setText(count + "");
	}

	@Override
	public void clickPlusButton() {
		System.out.println("콜백 되어져서 메서드 실행");
		count++;
		label.setText(count + "");
	}
	
	@Override
	public void clickPlusButton2() {
		System.out.println("콜백 되어져서 메서드 실행");
		count += 2;
		label.setText(count + "");
	}
	
	
}
