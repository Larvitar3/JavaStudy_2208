package lambdaEx.ch02;

// 두 수 중에 큰 수를 반환하는 기능
@FunctionalInterface
public interface IMaxNumber {
	
	int getMax(int num1, int num2);
	
}
