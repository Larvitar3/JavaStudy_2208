package Test.Ex03;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

// 메인스레드 - (이벤트 리스터 처리 중)
// 백그라운드에서 player의 움직임을 관찰
public class BackgroundPlayerService implements Runnable {

	private BufferedImage image;
	// 의존성 포함관계, 의존성 컴포지션
	private Player player;
	// new Player(); => 다른 ??

	public BackgroundPlayerService(Player player) {
		this.player = player;
		// 해당 메소드가 없을 시 플레이어가 존재할 수 없기때문에 의존성 ?
		try {
			image = ImageIO.read(new File("Images/test.png"));
		} catch (IOException e) {
			System.out.println("이미지 파일명 및 파일 경로 확인");
		}

	}

	@Override
	public void run() {
		while (true) {
			// 색상 확인
			Color leftColor = new Color(image.getRGB(player.getX(), player.getY() + 25));
			Color rightColor = new Color(image.getRGB(player.getX() + 50 + 10, player.getY()));
			// 플레이어의 좌표값에 따라서 빨간색, 파란색, 하얀색을 구분할 수 있다.
			// System.out.println(leftColor);
			// System.out.println(rightColor);
			
			// 왼쪽벽에 충돌
			if(leftColor.getRed() == 255 && leftColor.getGreen() == 0 && leftColor.getBlue() == 0) {
				// 빨간색 = 왼쪽 벽에 충돌 함.
				System.out.println("왼쪽 벽에 충돌");
			}else if(rightColor.getRed() == 255 && rightColor.getGreen() == 0 && rightColor.getBlue() == 0) {
				System.out.println("오른쪽 벽에 충돌");
			}
			// 위 두 조건이 아니면 하얀색 마음대로 움직임 가능
			

			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}

}
