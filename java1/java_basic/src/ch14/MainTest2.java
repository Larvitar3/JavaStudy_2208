package ch14;

public class MainTest2 {

	public static void main(String[] args) {
		// 휴먼 배열타입
		Human[] humans = new Human[3];
		Tiger[] Tigers = new Tiger[2];
		
		humans[0] = new Human();
		humans[1] = new Human();
		humans[2] = new Human();
		
		Tigers[0] = new Tiger();
		Tigers[1] = new Tiger();
		
		Animal[] animals = new Animal[4];
		animals[0] = new Human();
		animals[1] = new Tiger();
		animals[2] = new Eagle();
		animals[3] = new Human();
		
		for(int i = 0; i < animals.length; i++) {
			animals[i].move();
		}
		
	}
	
}
