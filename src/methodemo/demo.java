package methodemo;


import java.util.Scanner;

public class demo {

	public static void sum() {

		Scanner sc = new Scanner(System.in);

		System.out.println("Num=:");
		int num = sc.nextInt();

		int sum = 0;

		for (int i = 1; i <= num; i++) { // num =10

			sum = sum + i;

		}
		System.out.println("Sum=:" + sum);

	}

	public static void rectangle() {
		Scanner sc = new Scanner(System.in);

		System.out.println("length=:");

		int lenght = sc.nextInt();

		System.out.println("Breadth=:");

		int breadth = sc.nextInt();

		int area = lenght * breadth;
		System.out.println("The area of the rectangle is=:" + area);

	}

	public static void main(String[] args) {

		rectangle();
		System.out.println("************************************");
		sum();

	}

}
