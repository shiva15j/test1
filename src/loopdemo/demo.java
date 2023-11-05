package loopdemo;

import java.util.Scanner;

public class demo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Name=:");

		String name = sc.next();

		System.out.println(name);

		for (int i = 1; i <= 10; i++) {
			System.out.println(i);
			System.out.println(name);
		}

	}

}
