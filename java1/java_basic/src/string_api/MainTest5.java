package string_api;

public class MainTest5 {
	public static void main(String[] args) {
		
		int[] numbers = {10, 55, 23, 2, 79, 101, 16, 83, 30, 45};
		
		int max = numbers[0];
		int min = numbers[0];
		int maxPosition = 0;
		int minPosition = 0;
		
		for(int i = 0; i < numbers.length; i ++) {
			
			// 가장 큰 수 찾기
			if(max < numbers[i]) {
				max = numbers[i];
				maxPosition = i +1;
			}
			
			// 가장 작은 수 찾기
			if(min > numbers[i]) {
				min = numbers[i];
				minPosition = i +1 ;
			}
		
		}
		
		System.out.println("가장 큰 값은 : " + max + "  위치는 : " + maxPosition
				+ "가장 작은 값은 : " + min + "  위치는 : " + minPosition);
		

		
	}
}
