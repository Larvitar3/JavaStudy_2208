package ch14;

public class MainTest1 {

	public static void main(String[] args) {

		Animal hAnimal = new Human();
		Animal tAnimal = new Tiger();
		Animal eAnimal = new Eagle();
		
		hAnimal.move();
		eAnimal.move();
		
	}

}
