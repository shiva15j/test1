package condtiondemo;

import java.util.Scanner;

public class demo3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Name=:");

		String name = sc.next();

		System.out.println("Name1=:");

		String name1 = sc.next();

//		boolean cond = name.equals(name1);
//
//		System.out.println(cond);

		System.out.println(name.equals(name1)); // return boolean

		System.out.println("____________________________________________________________________");

		System.out.println("Num=:");
		int num = sc.nextInt();

		System.out.println("Num1=:");
		int num1 = sc.nextInt();

		System.out.println(num == num1);

	}

}
