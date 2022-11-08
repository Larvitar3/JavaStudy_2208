package string_api;

public class MainTest6 {
	public static void main(String[] args) {

		int[] numbers = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

		int target = 8;

		int left = 0;
		int right = numbers.length - 1;
		int mid = (left + right) / 2;

		System.out.println(numbers[left]);
		System.out.println(numbers[right]);
		System.out.println(numbers[mid]);

		boolean flag = true;

		while (flag) {
			if (numbers[left] < numbers[mid]) {
				
			} else {
				left++;
				if (left > mid) {
					
				}
			}

			if (numbers[mid] > numbers[right]) {
				
			} else {
				right--;
				if (right < mid) {
					
				}
			}
			
			if(numbers[left] == target) {
				flag = false;
			}
			
		}
		
		System.out.println("target은 " + mid + "번째");

	}
}
