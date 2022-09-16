package Starcrapt.copy;

public class GateWay {

	
	 static int zealotTotalCount;
	 static int marineTotalCount;
	 static int zergrlingTotalCount;
	 static int proveTotalCount;
	 static int carrierTotalCount;
	
	private String name;
	
	public GateWay() {
		this.name = "게이트웨이";
		zealotTotalCount = 0;
		marineTotalCount = 0;
		zergrlingTotalCount = 0;
		proveTotalCount = 0;
		carrierTotalCount = 0;
	}
	
	// 질럿 생산
	public Zealot createZealot() {
		System.out.println("질럿을 생성합니다.");
//		for (int i = 0; i < 10; i++) {
//			System.out.print("=");
//			try {
//				Thread.sleep(100);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		}
//		System.out.println();
		zealotTotalCount++;
		return new Zealot("질럿" + zealotTotalCount);
		// return 아래는 실행되지 않는다
	}
	
	public Marine createMarine() {
		System.out.println("마린을 생성합니다.");
		marineTotalCount++;
		return new Marine("마린" + marineTotalCount);
	}
	
	public Zergrling createZergrling() {
		zergrlingTotalCount++;
		return new Zergrling("저글링" + zergrlingTotalCount);
	}
	
	public Prove createProve() {
		proveTotalCount++;
		return new Prove("프로브");
	}
	
	public Carrier createCarrier() {
		carrierTotalCount++;
		return new Carrier("캐리어");
	}
	
	
	
	
	
	
	
	
	
	
}
