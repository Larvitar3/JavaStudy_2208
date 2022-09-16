package ch09;

public class HeroMainTest {

	public static void main(String[] args) {
		
		Hero hero = new Hero();
		Hero hero2 = new Hero();
		
		hero.setName("두글");
		
		hero.setHp(50);
		
		hero.setLevel(100);
		
		hero.showInfo();
		
		String temp = new String("반가워");
		System.out.println(temp);
		
		String temp2 = "반가워";
		System.out.println(temp2);
		
		System.out.println(hero);
		System.out.println(hero2);
		System.out.println("===============");
	
		
		if (temp == temp) {
			System.out.println("주소값이 같습니다.");
		}else {
			System.out.println("주소값이 다릅니다");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
