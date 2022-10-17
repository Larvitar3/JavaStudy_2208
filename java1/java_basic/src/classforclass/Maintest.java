package classforclass;

public class Maintest {
	
	/*
	 * 
	 * class class 클래스 사용하기
	 * 
	 * 
	 * 자바의 모든 클래스와 인터페이스는 컴파일 후 class 파일 생성됨 . <- 컴파일
	 * class 클래스는 컴파일 된 .class파일을 로드하여 객체를 동적으로 로드하고
	 * 정보를 가져오는 메서드가 제공된다
	 * Class.forName("패키지명.클래스") 메서드로 클래스를 동적 로드 할 수 있다.
	 * 
	 * Class c = class.forName("object");
	 * 
	 * 
	 * 
	 * */
	
	public static void main(String[] args) {
		
		// 클래스 이름으로 직접 class 를 가져오는 방법
		Class c = String.class;
		
		String s = new String();
	    Class c2 = s.getClass();
		
	    /*
	     *  동적 로딩
	     *  컴파일 시에 데이터 타입이 binding 된것이 아닌 실행(runtime) 중에 데이터 타입을
	     *  binding 하는 방법
	     *  
	     *  프로그래밍 시 문자열 변수로 처리 했다가 런타임 시에 원하는 클래스를 로딩하여 
	     *  컴파일 시에 타입이 정해지지 않으므로 동적 로딩시 오류가 발생하면 프로그램에 심각한 장애를 일으킬 수 있다.
	     *  ★ 조심해서 사용 ★
	     * 
	     * 클래스 정보 알아보기
	     * 
	     * reflection 프로그래밍 :
	     *  Class 클래스를 사용하여 클래스의 정보 (생성자, 변수, 메서드) 등 을 알수 있고
	     *  인스턴스를 생성하고, 메서드를 호출하는 방식의 프로그램
	     *  로컬 메모리에 객체가 없는 경우 원격 프로그래밍, 객체의 타입을 알 수 없는 경우에 사용하고
	     *  java.lang.reflect 패키지에 있는 클래스를 활용하여 프로그래밍을 사용한다
	     * 
	     * 
	     * */
		
		
		
		
	
	    
	    
	    
	    
		
	}

}
