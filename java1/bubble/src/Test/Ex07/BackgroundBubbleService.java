package Test.Ex07;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class BackgroundBubbleService implements Runnable {

	private Bubble bubble;
	private BufferedImage image;

	public BackgroundBubbleService(Bubble bubble) {
		this.bubble = bubble;
		try {
			image = ImageIO.read(new File("Images/backgroundMapService.png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void run() {
		while (true) {
			Color leftColor = new Color(image.getRGB(bubble.getX(), bubble.getY()));
			Color rightColor = new Color(image.getRGB(bubble.getX() + 50 + 10, bubble.getY()));
			Color upColor = new Color(image.getRGB(bubble.getX(), bubble.getY()) );

			if (leftColor.getRed() == 255 && leftColor.getGreen() == 0 && leftColor.getBlue() == 0) {
				System.out.println("버블 왼쪽벽에 충돌");
				bubble.leftWallCrash = true;

			} else if (rightColor.getRed() == 255 && rightColor.getGreen() == 0 && rightColor.getBlue() == 0) {
				System.out.println("버블 오른쪽 벽에 충돌");
				bubble.rightWallCrash = true;

			} else if (upColor.getRed() == 255 && upColor.getGreen() == 0 && upColor.getBlue() == 0) {
				System.out.println("버블 천장에 충돌");
				bubble.setUp(false);
			}

		}

	}

}
