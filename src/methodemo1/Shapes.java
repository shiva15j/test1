package methodemo1;

public class Shapes {

	public static void area() {

		System.out.println("Going to find area of the diffrent shapes");
	}

	public static void area(int side) {

		int area = side * side;

		System.out.println("The area of the Sqaure is =:" + area);

	}

	public static void area(float r) {

		double area = 3.14 * r * r;
		System.out.println("The area of the circle is =:" + area);

	}

	public static void area(int l, int b) {

		int area = l * b;

		System.out.println("The area of the rectangle is=:" + area);
	}

	public static void main(String[] args) {

		area();
		System.out.println("****************");
		area(10, 20);
		System.out.println("****************");
		area(7.2f);
		System.out.println("****************");
		area(6);

	}

}
