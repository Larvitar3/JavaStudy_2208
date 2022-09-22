package Test.Ex10;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

// 메인스레드 - (이벤트 리스터 처리 중)
// 백그라운드에서 player의 움직임을 관찰
public class BackgroundPlayerService implements Runnable {

	private BufferedImage image;
	private Player player;
	private Bubble bubble;

	public BackgroundPlayerService(Player player) {
		this.player = player;
		try {
			image = ImageIO.read(new File("Images/backgroundMapService.png"));
		} catch (IOException e) {
			System.out.println("이미지 파일명 및 파일 경로 확인");
		}

	}

	@Override
	public void run() {
		while (true) {
			Color leftColor = new Color(image.getRGB(player.getX(), player.getY() + 25));
			Color rightColor = new Color(image.getRGB(player.getX() + 50 + 10, player.getY()));
			
//			Color bottomColor = new Color(image.getRGB(player.getX(), player.getY() + 50 + 5));

			int bottomColorLeft = image.getRGB(player.getX() + 20, player.getY() + 50 + 5);
			int bottomColorRight = image.getRGB(player.getX() + 50 - 10, player.getY() + 50 + 5);
			// 하얀색이 아니면 바닥이다 --> -1

			if ( (bottomColorLeft +  bottomColorRight)!= -2) {
				player.setDown(false);
				// 바닥이 아니면 떨어지는걸 멈춰라 (다운 = 거짓)
			} else {
				// 점프하는 순간 bottom Color가 -1이 되기때문에
				// 65번 돌아야하는데 for문이 첫번째에 player.down() 실행된다.

				if (!player.isUp() && !player.isDown()) {
					// for 문 65번 성공
					// 플레이어가 올라가는 도중이 아닐 때 down 메서드를 실행시켜야한다

					// down 메서드는 단 한번만 실행한다
					player.down();

				}
			}

//			System.out.println("bottomColor : " + bottomColor);

			if (leftColor.getRed() == 255 && leftColor.getGreen() == 0 && leftColor.getBlue() == 0) {
				System.out.println("왼쪽 벽에 충돌");
				player.setLeftWallCrash(true);
				player.setLeft(false);
			} else if (rightColor.getRed() == 255 && rightColor.getGreen() == 0 && rightColor.getBlue() == 0) {
				System.out.println("오른쪽 벽에 충돌");
				player.setRightWallCrash(true);
				player.setRight(false);
			} else {
				player.setLeftWallCrash(false);
				player.setRightWallCrash(false);
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
