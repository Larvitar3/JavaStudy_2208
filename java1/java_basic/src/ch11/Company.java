package ch11;

// 디자인 패턴
// 싱글톤 패턴
// 1. 생성자를 private로 만듬
// 2. static 변수를 활용해서 내부에 객체를 생성
// 3. 외부에서 유일하게 참조변수 (인스턴스변수) 에 접근 가능한 public 메서드를 제공

public class Company {
	
	public int cid;
	
	// 1.
	private Company() {
		
	}
	
	// 2.
	// 	private static int number = 10; 
	private static Company instance = new Company();
	
	
	// 3.
	public static Company getInstance() {
		if(instance == null) {
			instance = new Company();
		}
		return instance;
	}
	
	
}
