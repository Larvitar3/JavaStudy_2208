package callback_ex;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

// (콜리) callLee 호출자 : 콜백 받는 객체의 주소값을 알고 있어야한다.
public class SubActivity extends JFrame implements ActionListener {

	JButton button;
	JButton button2;
	
	// ☆ ★ 호출자는 누구한테 메세지를 전달해야하는지 알고 있어야함.
	// 1. 생성자를 통해 만드는 방법
	// 2. 메서드를 통해서 만드는 방법
	
	// 1 -1 . 인터페이스 타입을 멤버 변수로 선언한다.
	OnCallBackButtonAction onCallBackButtonAction;
	public SubActivity(OnCallBackButtonAction onCallBackButtonAction) {
		
		this.onCallBackButtonAction = onCallBackButtonAction;
		
		setVisible(true);
		setSize(300, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new FlowLayout(FlowLayout.CENTER, 50, 50));
		button = new JButton("더하기 버튼1");
		button.addActionListener(this);
		add(button);
		
		button2 = new JButton("더하기 버튼2");
		button2.addActionListener(this);
		add(button2);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == button) {
			System.out.println("1 버튼이 눌러졌습니다.");
			// 메서드 호출
			onCallBackButtonAction.clickPlusButton();
		}else if(e.getSource() == button2) {
			System.out.println("2 버튼이 눌러졌습니다.");
			onCallBackButtonAction.clickPlusButton2();
		}


	}

}
