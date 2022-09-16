package Starcrapt.copy;

public class GateWayMainTest {

	public static void main(String[] args) {


		GateWay gateWay1 = new GateWay();
		GateWay gateWay2 = new GateWay();
		GateWay gateWay3 = new GateWay();
		GateWay gateWay4 = new GateWay();
		Zealot zealot1 =gateWay1.createZealot();
		Zealot zealot2 =gateWay1.createZealot();
		Zealot zealot3 =gateWay2.createZealot();
		Zealot zealot4 =gateWay2.createZealot();
		Zealot zealot5 =gateWay1.createZealot();
		Marine marine1 = gateWay3.createMarine();
		Marine marine2 = gateWay4.createMarine();
		Marine marine3 = gateWay3.createMarine();
		Marine marine4 = gateWay4.createMarine();
		Marine marine5 = gateWay3.createMarine();
		System.out.println(gateWay1.zealotTotalCount);
		System.out.println(gateWay1.marineTotalCount);
		// zealot1.attack(zealot2);
		

	}

}
