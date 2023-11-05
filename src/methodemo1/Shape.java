package methodemo1;

import java.util.Scanner;

public class Shape {

	// public static void run()

	public static void rectangle() {

		Scanner sc = new Scanner(System.in);

		System.out.println("Lenght=:");
		int length = sc.nextInt();

		System.out.println("Breadth=:");
		int bredth = sc.nextInt();

		int area = length * bredth;
		System.out.println("The area of the rectangle is =:" + area);

	}

	public static void sqaure() {
		Scanner sc = new Scanner(System.in);

		System.out.println("Side=:");

		int side = sc.nextInt();

		int area = side * side;
		System.out.println("The area of the sqaure is=:" + area);

	}

	public static void main(String[] args) {

		// If you wanna call static method in the same class you can call it by name

		sqaure();
		System.out.println("**********************");
		rectangle();
	}

}
