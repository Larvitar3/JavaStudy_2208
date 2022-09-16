package ch05;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;

public class MyFrame6 extends JFrame {

    public MyFrame6() {
        initData();
        setInitLayout();
        addEventListener();
    }

    private void initData() {
        setTitle("어댑터 클래스 이용");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500, 500);
    }
    private void setInitLayout() {
        setVisible(true);
        setResizable(false);
    }
    private void addEventListener() {
    	
    	// 추상메서드 5개 ( 불필요 코드가 많아서 가독성이 떨어진다)
    	this.addMouseListener(new MyMouseListener());
    }
    
    // 내부클래스 생성
    private class MyMouseListener extends MouseAdapter{
    	
    	// 필요한 기능만 재정의 가능
    	@Override
    	public void mouseClicked(MouseEvent e) {
    		int x = e.getX();
    		int y = e.getY();
    		
    		System.out.println("x : " + x);
    		System.out.println("y : " + y);
    		
    	}
    	
    	@Override
    	public void mouseEntered(MouseEvent e) {
    		System.out.println("마우스가 포커스 안에 들어왔습니다.");
    	}
    	
    	
    }
    
    
    
    
    
    
}