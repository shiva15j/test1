package condtiondemo;

import java.util.Scanner;

public class demo2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Num=:");

		int num = sc.nextInt();

		if (num > 0) {
			System.out.println("Positive");
		}
		else if (num < 0) {
			System.out.println("Negative");
		} else {
			System.out.println("Neutral");
		}

	}

}
