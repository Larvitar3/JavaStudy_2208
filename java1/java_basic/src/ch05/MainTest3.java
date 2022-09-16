package ch05;

public class MainTest3 {

	public static void main(String[] args) {
		
		Warrior w1 = new Warrior ();
		w1.name = "오크";
		 w1.height = 180;
		 w1.color =" 초록색";
		 System.out.println(w1.name);
		 System.out.println(w1.height);
		 System.out.println(w1.name);
		
		 Warrior2 w2 = new Warrior2();
		 w2.name = "법사";
		 w2.height = 140;
		 w2.color = "파란색";
		
		 System.out.println();
		 
		 System.out.println(w2.name);
		 System.out.println(w2.height);
		 System.out.println(w2.name);
	}

}
