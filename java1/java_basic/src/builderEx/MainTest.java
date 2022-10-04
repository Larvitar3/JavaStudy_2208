package builderEx;

public class MainTest {

	public static void main(String[] args) {
		Student student = new Student.Builder().setName("이춘식").build();
		System.out.println(student);

		Student student2 = new Student.Builder()
				.setName("박춘식")
				.setGrade(3)
				.build();
		System.out.println(student2);
	}

}
