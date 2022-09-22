package Test.Ex12;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class BackgroundBubbleService {

	private BufferedImage image;
	private Bubble bubble;

	public BackgroundBubbleService(Bubble bubble) {

		this.bubble = bubble;
		try {
			image = ImageIO.read(new File("Images/backgroundMapService.png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public boolean leftWall() {
		Color leftColor = new Color(image.getRGB(bubble.getX(), bubble.getY() + 25));
		if (leftColor.getRed() == 255 && leftColor.getGreen() == 0 && leftColor.getBlue() == 0) {
			return true;
		}
		return false;
	}
	
	public boolean rightWall() {
		Color rightWall = new Color(image.getRGB(bubble.getX() +60, bubble.getY() + 25));
		if (rightWall.getRed() == 255 && rightWall.getGreen() == 0 && rightWall.getBlue() == 0) {
			return true;
		}
		return false;
	}
	
	public boolean topWall() {
		Color topWall = new Color(image.getRGB(bubble.getX() + 25, bubble.getY()));
		if (topWall.getRed() == 255 && topWall.getGreen() == 0 && topWall.getBlue() == 0) {
			return true;
		}
		return false;
	}


	
	
	
	
	
	
	
	
	
	
	
	
	
}
