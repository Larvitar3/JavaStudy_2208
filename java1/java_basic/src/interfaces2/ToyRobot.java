package interfaces2;

public class ToyRobot implements RemoteController, SoundEffect{

	String name;

	public ToyRobot() {
		this.name = "마징가Z";
	}
	
	@Override
	public void trunOn() {
		System.out.println("장난감 로봇을 켭니다.");
	}

	@Override
	public void turnOff() {

		System.out.println("장난감 로봇을 끕니다.");
	}

	@Override
	public void soundOn() {
		System.out.println("두두두두두두두두두");
	}
	

}
