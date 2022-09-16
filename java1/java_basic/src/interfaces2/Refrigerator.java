package interfaces2;

public class Refrigerator extends HomeAppliances implements RemoteController, SoundEffect{

	@Override
	public void trunOn() {
		System.out.println("냉장고를 켭니다.");
		
	}

	@Override
	public void turnOff() {
		System.out.println("냉장고를 끕니다.");
		
	}

	@Override
	public void soundOn() {
		System.out.println("띠 띠 띠 띠 띠");
		
	}


}
