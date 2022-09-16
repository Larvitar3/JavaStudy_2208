package interfaces2;

public class Televison extends HomeAppliances implements RemoteController{

	@Override
	public void trunOn() {
		System.out.println("TV를 켭니다.");
		
	}

	@Override
	public void turnOff() {
		System.out.println("TV를 끕니다.");
		
	}
	
	
}
