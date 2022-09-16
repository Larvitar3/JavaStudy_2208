package Starcrapt;

public class BusTest {

	public static void main(String[] args) {
		Bus bus1 = new Bus(3);
		Bus bus2 = new Bus(4);
		Bus bus3 = new Bus(6);
		Adult adult = new Adult("민춘어");
		Student student = new Student("이춘스");
		Kid kid = new Kid("김춘키");
		
	  bus1.takeAdult(adult);
	  bus1.takeStudent(student);
	  bus1.takeKide(kid);
	  
	  

		bus1.showInfo();
		adult.showInfo();

	}

}
