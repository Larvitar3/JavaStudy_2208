package ch04;

public class WhileMainTest1 {

	public static void main(String[] args) {
		
//		while(조건식) {
//			수행문;
//		}
		
//		do{
//			수행문;
//		}while (조건식);
		
		int num = 1;
		int sum = 0;
		// 10 + 9 + 8 +.... 
		
		do {
			System.out.println("현재 값 : " + num);
			sum += num;
			num++;
		}while(num <= 10);
		
		System.out.println("sum에 대한 결과는 " + sum);
		
		System.out.println("--------------------");
		
		// 문제 1
		int input = 10;
		int inputSum = 0;
		
		// do while 문을 활용해서
		// 10~1에대한 연산을 하고 화면에 출력
		
		// 10 , 0 
		
		do {
			System.out.println("현재 값 : " + input);
			inputSum += input;
			input--;
		}while(input >= 1);
		System.out.println("sum에 대한 결과는 " + inputSum);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
