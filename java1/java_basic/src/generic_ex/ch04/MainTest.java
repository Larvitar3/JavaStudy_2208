package generic_ex.ch04;

public class MainTest {

	public static void main(String[] args) {
		double result = 5 / 3.0;
		System.out.println(result);
		double b = 100.0;
		Number a = (double) b;
		Integer integer = new Integer(0);

		System.out.println("------------");

		MyPoint<Integer, Double> p1 = new MyPoint<Integer, Double>(10, 0.0);
		MyPoint<Integer, Double> p2 = new MyPoint<Integer, Double>(20, 50.0);

		double result1 = makeRectangel(p1, p2);
		System.out.println("값 : " + result1);

	}

	// 리턴타입 <x, y>
	public static <X, Y> double makeRectangel(MyPoint<X, Y> p1, MyPoint<X, Y> p2) {
		double left = ((Number) p1.getX()).doubleValue();
		System.out.println("left : " + left);
		double right = ((Number) p2.getX()).doubleValue();
		System.out.println("right : " + right);
		double top = ((Number) p1.getY()).doubleValue();
		System.out.println("top : " + top);
		double bottom = ((Number) p2.getY()).doubleValue();
		System.out.println("bottom : " + bottom);

		double width = right - left;
		System.out.println("width : " + width);
		double height = bottom - top;
		System.out.println("height : " + height);

		return width * height;
	}

}
