package loopdemo;

import java.util.Scanner;

public class demo1 {

	// num=10

	// 1+2+3+4+5+6+7+8+9+10=

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Num=:");
		int num = sc.nextInt();

		int sum = 0;

		for (int i = 1; i <= num; i++) { // num =10

			sum = sum + i;

		}
		System.out.println("Sum=:" + sum);

	}

}
